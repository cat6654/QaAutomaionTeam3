package Tasks;

/**
 * Created by Egor on 13.09.2016.
 */
public class ComplexNumbers
{
    private double re;
    private double im;

    ComplexNumbers(double a, double b)
    {
        re = a;
        im = b;
    }

    boolean equals (ComplexNumbers c)
    {
        if(c == null)
            return false;
        if(this == c)
            return true;
        if(re == c.re && im == c.im)
            return true;
        return false;
    }

    ComplexNumbers add (ComplexNumbers c)
    {
        return new ComplexNumbers(re + c.re, im + c.im);
    }

    ComplexNumbers subtract (ComplexNumbers c)
    {
        return new ComplexNumbers(re - c.re, im - c.im);
    }

    ComplexNumbers multiply (ComplexNumbers c)
    {
        return new ComplexNumbers((re * c.re - im * c.im), (im * c.re + re * c.im));
    }

    ComplexNumbers divide (ComplexNumbers c)
    {
        return new ComplexNumbers(((re * c.re + im * c.im)/(Math.pow(c.re,2) + Math.pow(c.im,2))), ((im * c.re - re * c.im)/(Math.pow(c.re,2) + Math.pow(c.im,2))));
    }

}
