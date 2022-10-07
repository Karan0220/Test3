package Sample5;

public class Test5 {
	
	public static void main(String[] args) 
	{
		String Org ="Karan pradnya";
		
		String Rev= "";
		
		for(int i=Org.length()-1; i>=0; i--) 
		{
			Rev = Rev + Org.charAt(i);
		}
		
		System.out.println(Rev);
		
	}

}
