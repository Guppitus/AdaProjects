
// Exam question...
public class Interval {

    private double low;
    private double high;
    
    public Interval(double low, double high)
    {
        this.low = low;
        this.high = high;
    }
    
    public Interval add(Interval other)
    {
        return new Interval(low + other.low, high + other.high);
    }
    
    public Interval subtract(Interval other)
    {
        return new Interval(low - other.low, high - other.high);
    }
    
    public Interval times(Interval other)
    {
        return new
            Interval(min4(low*other.low, low*other.high, high*other.low, high*other.high),
                     max4(low*other.low, low*other.high, high*other.low, high*other.high));
    }
    
    public Interval divide(Interval other)
    {
        return new
            Interval(min4(low/other.low, low/other.high, high/other.low, high/other.high),
                     max4(low/other.low, low/other.high, high/other.low, high/other.high));
    }
    
    private double min4(double a, double b, double c, double d)
    {
        double result = a;
        if (b < result) result = b;
        if (c < result) result = c;
        if (d < result) result = d;
        return result;
    }

    private double max4(double a, double b, double c, double d)
    {
        double result = a;
        if (b > result) result = b;
        if (c > result) result = c;
        if (d > result) result = d;
        return result;
    }
}
