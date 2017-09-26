public class Rational {
	private int numer;
	private int denom;
	
	public Rational()
	{
		this(0,1);
	}
	
	public Rational(int n)
	{
		this(n,1);
	}
	
	public Rational(int n, int d)
	{
		if (d == 0)
		{
			d = 1;
			n = 0;
		}
		
		numer = n;
		denom = d;		
	}
	
	public int getNumer()
	{
		return this.numer;
	}
	
	public int getDenom()
	{
		return this.denom;
	}
	
	public Rational add(Rational rhs)
	{
		return new Rational(numer * rhs.denom + denom * rhs.numer, denom * rhs.denom);	
	}
	
	public Rational sub(Rational rhs)
	{
		return new Rational(numer * rhs.denom - denom * rhs.numer, denom * rhs.denom);	
	}
	
	public Rational mult(Rational rhs)
	{
		return new Rational(numer * rhs.numer, denom * rhs.denom);
	}
	
	public Rational div(Rational rhs)
	{
		return new Rational(numer * rhs.denom, denom * rhs.numer);
	}
	
	//overload --> return first.operation(second);
	public static Rational add(Rational lhs, Rational rhs)
	{
		return lhs.add(rhs);
	}
	
	public static Rational sub(Rational lhs, Rational rhs)
	{
		return lhs.sub(rhs);
	}
	
	public static Rational mult(Rational lhs, Rational rhs)
	{
		return lhs.mult(rhs);
	}
	
	public static Rational div(Rational lhs, Rational rhs)
	{
		return lhs.div(rhs);	
	}
	
	boolean equals(Rational rhs)
	{
		//simply compare this and rhs...
		boolean isEqual = (numer == rhs.numer  && denom == rhs.denom) ? true : false;
		return isEqual;
	}
	
	boolean less(Rational rhs)
	{
		//simply compare this and rhs...
		boolean isEqual = (((this.numer * rhs.denom) < (this.denom * rhs.numer)) && (this.denom > 0 && rhs.denom > 0)) ? true : false;
		return isEqual;
	}
	
	boolean greater(Rational rhs)
	{
		//simply compare this and rhs...
		boolean isEqual = (((this.numer * rhs.denom) > (this.denom * rhs.numer))/* && (this.denom > 0 && rhs.denom > 0)*/) ? true : false;
		return isEqual;
	}
	
	public String toString() //normalize() --> reduce() --> toString()
	{
		
		this.reduce();
		//if denominator = 1, string is represented as whole #, return numerator...
		if (denom == 1)
			return numer + "";
		//any other case, string is simply represented as rational number...
		else
			return numer + "/" + denom;	
	}
	
	private int gcd(int m, int n)
	{
		if (n == 0)
		{
			return m;
		}
		else if (m/n < 0) //divisor must be greater than 0...
			return -gcd(n, m%n);
		else 
			return gcd(n, m%n);
	}
	
	/*normalize rational 1st (using .this), then reduce numerator 
	 and denominator using gcd method. divisor must be positive...
	 */
	private void reduce()
	{
		this.normalize();
		int div = gcd(this.numer, this.denom);
		//update a/b
		this.numer = numer / div;
		this.denom = denom / div;				
	}
	
	private void normalize()
	{
		/*if denominator is < 0, check if the numerator is < 0. If either the former
		  or latter are true, make the numerator negative and denominator positive...
		 */
		int numer = this.numer;
		int denom = this.denom;

		if (denom < 0) 
		{
			if (numer < 0) //x/-x = -x/x
			{
				numer = -numer;
				denom = -denom;
			}
			else //x/-x --> -x/x
			{
				denom = -denom;
			} 
		}
	}
}
