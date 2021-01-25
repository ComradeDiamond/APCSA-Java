/**
 * Fraction.java
 * A class for representing a fraction
 * @author your name here
 * @since the date here
 */
public class Fraction {
    /** instance variable for the numerator */
    private int num;
    /** instance variable for the denominator */
    private int denom;

    /**
     * zero parameter constructor that sets numerator to zero and denominator to 1
     */
    public Fraction() // no-args constructor
    {
        this.num = 0;
        this.denom = 1;
    }
    /**
     * one parameter constructor that sets numerator to n and denominator to 1
     * @param n the numerator of the fraction
     */
    public Fraction(int n) {
        this.num = n;
        this.denom = 1;
    }
    /** 
     * two parameter constructor that sets numerator to n and denominator to d
     * if the fraction is reducible it gets reduced using the private
     * @param n the numerator of the fraction
     * @param d the denominator of the fraction
        * Precondition: Must be > 0
     */
    public Fraction(int n, int d) {
        if (denom <= 0)
        {
            throw new ArithmeticException("I would get rid of all your insta followers but I can't divide by zero");
        }

        this.num = n;
        this.denom = d;
        this.reduce();
    }
    /**
     * copy constructor makes a copy of the parameter "other"
     * @param other a Fraction to be copied
     */
    public Fraction(Fraction other) // copy constructor
    {
        this.num = other.num;
        this.denom = other.denom;
        this.reduce();
    }

    // *** public methods ***

    /** Returns the sum of this fraction and other
     * @param other a Fraction that is to be added to the current fraction
     * @return the sum of this fraction and other
     */
    public Fraction add(Fraction other) {
        int common = this.denom * other.denom;
        int sum = (this.num * other.denom) + (other.num * this.denom);

        return new Fraction(sum, common);
    }

    /** Returns the sum of this fraction and m
     * @param m the integer we are adding the fraction to 
     * @return the sum of this Fraction and m
     */
    public Fraction add(int m) {
        int otherSum = m * this.denom;
        int sum = otherSum + this.num;

        return new Fraction(sum, this.denom);
    }

    /** Returns the product of this fraction and other
     * @param other the Fraction that is to be multiplied by the current fraction
     * @return the product of this fraction and other
     */
    public Fraction multiply(Fraction other) {
        int top = this.num * other.num;
        int bottom = this.denom * other.denom;

        return new Fraction(top, bottom);
    }

    /** Returns the product of this fraction and m
     * @param m the integer that we are multipling the current fraction by
     * @return a Fraction that is the product of this fraction and m
     */
    public Fraction multiply(int m) {
        return new Fraction(this.num * m, this.denom);
    }

    /** Returns the value as a double of this fraction as a double 
     * @return the value as a double of this fraction as a double 
     */
    public double getValue() {
        return (double)num/denom;
    }

    /** Returns a string representation of this fraction
     * @return the string representation of the fraction 
     */
    public String toString() {
        return num + "/" + denom;
    }

    // *** private methods ***

    /** Reduces this fraction by the gcf and makes denom > 0 */
    private void reduce() {
        int gcf = this.gcf(this.num, this.denom);
        this.num /= gcf;
        this.denom /= gcf;
    }

    /** Returns the greatest common factor of two positive integers 
     * @param n a positive integer representing the numerator
     * @param d a positive integer representing the denominator
     * @author Mike
     * @return the greatest common divisor of two positive integers 
        * In other words, find the greatest common factor
     */
    private int gcf(int n, int d) {
        if (n <= 0 || d <= 0)
        {
            throw new ArithmeticException("int n and d must be positive");
        }

        if (d == 0)
        {
            return n;
        }
        else
        {
            return gcf(d, n%d);
        }
    }

}