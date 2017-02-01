; ┌─────────────────────────────────────────────┐
; │ ┌─────────────────────────────────────────┐ │
; │ │ Vector Class - Autohotkey               │ │
; │ │ https://p5js.org/reference/#/p5.Vector  │ │
; │ └─────────────────────────────────────────┘ │
; │  Isaac Sanchez - 2017                       │
; └─────────────────────────────────────────────┘

; toString()	
; 	Returns a string representation of a vector v by calling String(v) or v.toString(). This method is useful for logging vectors in the console.
	
; set()	
; 	Sets the x, y, and z component of the vector using two or three separate variables, the data from a p5.Vector, or the values from a float array.

; copy()	
; 	Gets a copy of the vector, returns a p5.Vector object.

; add()	
; 	Adds x, y, and z components to a vector, adds one vector to another, or adds two independent vectors together.
; The version of the method that adds two vectors together is a static method and returns a p5.Vector, the others
; acts directly on the vector.

; sub()	
; 	Subtracts x, y, and z components from a vector, subtracts one vector from another, or subtracts two independent vectors.
; The version of the method that subtracts two vectors is a static method and returns a p5.Vector, the other acts directly on the vector.


; mult()	
; 	Multiply the vector by a scalar. The static version of this method creates a new p5.Vector while the non static version acts on the vector directly.

; div()	
; 	Divide the vector by a scalar. The static version of this method creates a new p5.Vector while the non static version acts on the vector directly.

; mag()	
; 	Calculates the magnitude (length) of the vector and returns the result as a float (this is simply the equation sqrt(xx + yy + z*z).)

; magSq()	
; 	Calculates the squared magnitude of the vector and returns the result as a float (this is simply the equation (xx + yy + z*z).)
; Faster if the real length is not required in the case of comparing vectors, etc.

; dot()	
; 	Calculates the dot product of two vectors. The version of the method that computes the dot product of two independent vectors is a static method.

; cross()	
; 	Calculates and returns a vector composed of the cross product between two vectors. Both the static and non static methods return a new p5.Vector.

; dist()	
; 	Calculates the Euclidean distance between two points (considering a point as a vector object).

; normalize()	
; 	Normalize the vector to length 1 (make it a unit vector).

; limit()	
; 	Limit the magnitude of this vector to the value used for the max parameter.

; setMag()	
; 	Set the magnitude of this vector to the value used for the len parameter.

; heading()	
; 	Calculate the angle of rotation for this vector (only 2D vectors)

; rotate()	
; 	Rotate the vector by an angle (only 2D vectors), magnitude remains the same

; lerp()	
; 	Linear interpolate the vector to another vector

; array()	
; 	Return a representation of this vector as a float array. This is only for temporary use. If used in any other fashion,
; the contents should be copied by using the p5.Vector.copy() method to copy into your own array.
	
; equals()	
; 	Equality check against a p5.Vector

; fromAngle()	
; 	Make a new 2D unit vector from an angle

; random2D()	
; 	Make a new 2D unit vector from a random angle

; random3D()	
; 	Make a new random 3D unit vector.

; angleBetween()	
; 	Calculates and returns the angle (in radians) between two vectors.



class Vector {
	__New(x, y) {
		this.x := x
		this.y := y
	}

	toString() {
		return this.x ", " this.y
	}

	set(x, y) {
		if !IsObject(x) {
			this.x := x
			this.y := y
		} else {
			this.x := x[1]
			this.y := x[2]
		}
	}

	copy() {
		return new Vector(this.x, this.y)
	}

	static add(x,y="") {
		if ((x.__Class == "Vector") and (y.__Class == "Vector")) {
			; Adds two independent vectors together - STATIC
			x1 := x.x
			y1 := x.y
			x2 := x.x
			y2 := x.y
			return new Vector(x1+x2, y1+y2)
		} else if ((x is integer) and (y is integer)) {
			; Adds x, y, components to a vector
			this.x += x
			this.y += y
		} else if ((x.__Class == "Vector") and (y = "")) {
			; Adds one vector to another
			this.x += x.x
			this.y += x.y
		}
		return this
	}

	sub(x, y="") {
		if ((x.__Class == "Vector") and (y.__Class == "Vector")) {
			; Adds two independent vectors together - STATIC
			x1 := x.x
			y1 := x.y
			x2 := x.x
			y2 := x.y
			return new Vector(x2-x1, y2-y1)
		} else if ((x is integer) and (y is integer)) {
			; Adds x, y, components to a vector
			this.x -= x
			this.y -= y
		} else if ((x.__Class == "Vector") and (y = "")) {
			; Adds one vector to another
			this.x -= x.x
			this.y -= x.y
		}
		return this
	}

	static mult(a, b) {
		; Multiply the vector by a scalar. The static version of this method creates a new Vector
		if (a.__Class == "Vector") {
			return new Vector(a.x * b, a.y * b)
		} else {
			this.x *= a
			this.y *= a
		}
		return this
	}

	div() {
		; Divide the vector by a scalar. The static version of this method creates a new Vector
		if (a.__Class == "Vector") {
			return new Vector(a.x / b, a.y / b)
		} else {
			this.x /= a
			this.y /= a
		}
		return this
	}

	mag() {
		; Calculates the magnitude (length) of the vector and returns the result as a float (this is simply the equation sqrt(xx + yy).)
		return sqrt(this.x**2 + this.y**2)
	}

	magSq() {
		return this.x**2 + this.y**2
	}

	static dot(a, b="") {
		; Calculates the dot product of two vectors.
		; The version of the method that computes the dot product of two independent vectors is a static method. 
		if ((a.__Class == "Vector") and (b = "")) {
			; return (this.x * a.x) + (this.y * a.y)
			return this.dot(a.x, a.y)
		} else if ((a.__Class == "Vector") and (b.__Class == "Vector")) {
			return (ax * b.x) + (ay * b.y) 
		} else { ; both ints
			return (a.x * b.x) + (a.y + b.y)
		}
	}

	static cross(a, b="") {

		; Only defined in 3D

		; Calculates and returns a vector composed of the cross product between two vectors.
		; Both the static and non static methods return a new Vector. 
		; if ((a.__Class == "Vector") and (b = "")) {
		; 	return (this.x * a.x) + (this.y * a.y)
		; } else if ((a.__Class == "Vector") and (b.__Class == "Vector")) {
		; 	return (ax * b.x) + (ay * b.y) 
		; }
	}

	static dist(a, b="") {
		; Calculates the Euclidean distance between two points (considering a point as a vector object). (p,q) <---> (s,t)
		; if ((a.__Class == "Vector") and (b = "")) {
		; 	p := this.x
		; 	q := this.y
		; 	s := a.x
		; 	t := a.y
		; } else if ((a.__Class == "Vector") and (b.__Class == "Vector")) {
		; 	p := b.x
		; 	q := b.y
		; 	s := a.x
		; 	t := a.y
		; }
		; return sqrt((p-s)**2 + (q-t)**2)
		
		if ((a.__Class == "Vector") and (b = "")) {
			return a.copy().sub(this).mag();
		} else if ((a.__Class == "Vector") and (b.__Class == "Vector")) {
			return b.copy().sub(a).mag();
		}
	}

	normalize() {
		return (this.mag() = 0) ? this : this.div(this.mag())
	}

	limit(max) {
		mSq = this.magSq()
		if(mSq > max*max) {
		  this.div(sqrt(mSq))
		  this.mult(max)
		}
		return this
	}

	setMag(n) {
		return this.normalize().mult(n)
	}

	heading() {
		; TO DO
		return atan(this.y, this.x)
	}

	rotate() {

	}

	lerp() {

	}

	array() {

	}

	equals() {

	}

	fromAngle() {

	}

	random2D() {

	}

	random3D() {

	}

	angleBetween() {

	}
}

#include Math.ahk