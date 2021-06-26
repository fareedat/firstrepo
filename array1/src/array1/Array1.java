package array1;

public class Array1 {
	public static void main(String ar[])
	{
		int sum=0;
		int add[]=new int[4];
		add[0]=1;
		add[1]=3;
		add[2]=9;
		add[3]=3;
		for(int i=0;i<add.length;i++)
		{
			sum+=add[i];
		}
		
			
		System.out.println(+sum);
		
	}

}
