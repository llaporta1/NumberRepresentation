package numberRepresentation;

public class Converter {
	
	public Converter()
	{	
	}
	
	public String decimal(long value) {
		String remainder = "";
		while (value != 0)
		{
			long i = value % 2;
			remainder = "" + i + remainder;
			value = value/2;
		}
		return remainder;
	}
	
	public int binary(String value) {
		int i=0;
		int sum=0;
		for (int k=value.length()-1; k > -1; k--) {
			int m = value.charAt(k);
			int mInt = m-48;
			sum += m * (Math.pow(2,i));
			i++;
		}
		return sum;	
		}
	}
