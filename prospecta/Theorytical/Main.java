package Theorytical;
import
public class Main {
	
	public static void main(String []args) {
		
		public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		String ans=sc.nextLine();
		
		String [] arr=ans.split(",");
		
		if(arr.length==0)
		{
			System.out.println("Wrong Input");
			return;
		}
		
		Map<String,String> map=new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			String []arr2=arr[i].split(":");
			if(arr2.length!=2)
			{
				System.out.println("Wrong Input");
				return;
			}
		
		
		String a=arr2[0];
		String b=arr2[1];
		
		if(check(a))
		{
			if(check(b))
			{
				map.put(ans, b);
			}
		}
		else
		{
			
		}
		
		}
		
	}
	}

}
