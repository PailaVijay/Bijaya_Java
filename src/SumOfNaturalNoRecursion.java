
public class SumOfNaturalNoRecursion {

	public static void main(String[] args) {
	int num=3;
	int sum=addNumber(num);
	System.out.println(sum);

	}
	public static int addNumber(int num) {
		
		if(num!=0)
		{
			return num+addNumber( num-1);
		}
		else
		return num;
	}

}
