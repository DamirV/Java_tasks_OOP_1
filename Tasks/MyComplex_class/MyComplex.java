package MyComplex_class;

import static java.lang.Math.*;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex(){

    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public void setReal(double real){
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if(imag >= 0) {
            return real + " + " + imag + "i";
        }
        else{
            return real + " - " + -imag + "i";
        }
    }

    public  boolean isReal(){
        if(imag == 0.0 && real != 0.0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isImaginary(){
        if(real == 0.0 && imag != 0.0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean equals(double real, double imag){
        if(this.real == real && this.imag == imag){
            return true;
        }
        else{
            return false;
        }
    }

    public double magnitude(){
        return sqrt(pow(this.real,2) + pow(this.imag,2));
    }

    public  double argument(){
        return atan(this.imag/this.real);
    }

    public MyComplex add(MyComplex right){
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right){
        MyComplex temp = new MyComplex(this.real + right.real, this.imag + right.imag);
        return temp;

    }

    public MyComplex subtract(MyComplex right){
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right){
        MyComplex temp = new MyComplex(this.real - right.real, this.imag - right.imag);
        return temp;
    }

    public MyComplex multiply(MyComplex right){
        MyComplex temp = new MyComplex(this.real*right.real - this.imag*right.imag, this.real*right.imag + this.imag*right.real);
        return temp;
    }

    public MyComplex divide(MyComplex right){
        double tempupreal = this.real*right.real + this.imag*right.imag;
        double tempupimage = -this.real*right.imag +this.imag*right.real;
        double tempdownreal = right.real*right.real + right.imag*right.imag;

        tempupreal/=tempdownreal;
        tempupimage/=tempdownreal;
        MyComplex temp = new MyComplex(tempupreal,tempupimage);

        return temp;
    }

    public MyComplex conjugate(){
        MyComplex temp = new MyComplex(this.real, this.imag*-1);
        return temp;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        if(o == null ||!(o instanceof MyComplex)){
            return false;
        }

        MyComplex that = (MyComplex) o;
        return this.real == that.real && this.imag == that.imag;
    }

    @Override
    public int hashCode(){
        int res = 17;
        res = 31*res + (int)(Double.doubleToLongBits(real)^(Double.doubleToLongBits(real)>>>32));
        res = 31*res + (int)(Double.doubleToLongBits(imag)^(Double.doubleToLongBits(imag)>>>32));

        return res;
    }
}
