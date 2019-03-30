/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #07: PS4_Ex07_Complex.java
 * 
 * A complex number has the form a + bi where a is the real part and
 * b is the imaginary part.
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

class Complex {
  
  private int real, imag;
  
  public Complex(int inReal, int inImag) {
    real=inReal;
    imag=inImag;
  }
  
  // this = this + another
  public void add(Complex another) {
    this.real=this.real+another.real;
    this.imag=this.imag+another.imag;
  }
  
  // this = this - another
  public void minus(Complex another) {
    this.real=this.real-another.real;
    this.imag=this.imag-another.imag;
    
  }
  
  // this = this * another
  public void multiple(Complex another) {
    this.real=(this.real*another.real)-(this.imag*another.imag);
    this.imag=(this.imag*another.real)+(this.real*another.imag);
  }
  
  // this = this / another
  public void divide(Complex another) {
    this.real=((this.real*another.real)+(this.imag*another.imag))/((another.real*another.real)+(another.imag*another.imag));
    this.imag=((this.imag*another.real)-(this.real*another.imag))/((another.real*another.real)+(another.imag*another.imag));
    
  }
  
  // Return "(real + imag'i')"
  public String toString() {
    return "("+real+" + "+imag+"i) ";  // stub
  }
}