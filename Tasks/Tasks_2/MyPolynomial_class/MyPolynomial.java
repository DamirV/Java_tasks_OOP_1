package MyPolynomial_class;

import java.util.Arrays;
import java.util.Objects;

import static java.lang.Math.pow;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = new double[coeffs.length];
        this.coeffs = coeffs;
    }

    @Override
    public String toString() { // для красивого выввода полинома
        String str ="";
        boolean flag = true;
        for(int i = coeffs.length - 1; i > 0; i--) {
            if (coeffs[i] != 0) {
                if(coeffs[i] > 0){
                    if(flag){
                        str += coeffs[i] + "x^" + i  ;
                        flag = false;
                    }
                    else{
                        str += " + " + coeffs[i] + "x^" + i  ;
                    }
                }
                else{
                    if(flag) {
                        str += coeffs[i] + "x^" + i;
                        flag = false;
                    }
                    else{
                        str += " - " + -coeffs[i] + "x^" + i;
                    }

                }
            }
        }

        if(coeffs[0] != 0){
            if (coeffs[0] > 0){
                str += " + " + coeffs[0];
            }
            else{
                str += " - " + -coeffs[0];
            }
        }

        return str;
    }

    public  int getDegree(){
        return coeffs.length - 1;
    }

    public double evaluate(double x){
        double res = 0;
        for(int i = 0; i < coeffs.length; i++){
            res += coeffs[i] * pow(x,i);
        }
        return res;
    }

    public MyPolynomial add(MyPolynomial right){
        double[] d;
        if(right.coeffs.length >= this.coeffs.length){
            d = new double[right.coeffs.length];
            for(int i = 0; i < this.coeffs.length; i++){
                d[i] = this.coeffs[i] + right.coeffs[i];
            }
            for(int i = this.coeffs.length; i < right.coeffs.length;i++){
                d[i] = right.coeffs[i];
            }
        }
        else{
            d = new double[this.coeffs.length];
            for(int i = 0; i < right.coeffs.length; i++){
                d[i] = this.coeffs[i] + right.coeffs[i];
            }
            for(int i = right.coeffs.length; i < this.coeffs.length;i++){
                d[i] = this.coeffs[i];
            }
        }

        MyPolynomial res = new MyPolynomial(d);
        return res;
    }

    public MyPolynomial multiply(MyPolynomial right){
        double[] d = new double[this.coeffs.length + right.coeffs.length];
        for(int i = 0 ; i < d.length; i++) {
            d[i] = 0;
        }
        for(int j = 0; j < this.coeffs.length; j++){
            for(int k = 0; k < right.coeffs.length; k++){
                d[j+k] += this.coeffs[j] * right.coeffs[k];
            }
        }

        MyPolynomial res = new MyPolynomial(d);
        return res;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MyPolynomial that = (MyPolynomial) o;
        return hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        int res = 17;

        for(int i = 0; i < coeffs.length; i++){
            res = 31*res + (int)(Double.doubleToLongBits(coeffs[i])^(Double.doubleToLongBits(coeffs[i])>>>32));
        }

        return res;
    }
}
