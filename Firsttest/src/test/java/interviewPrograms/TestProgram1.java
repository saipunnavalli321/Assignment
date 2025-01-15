package interviewPrograms;

public class TestProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n =15;
 if(n%3==0)
{
	System.out.println("fuzz");
}

 if(n%5==0)
{
	System.out.println("buzz");
}

 if(n%3==0 && n%5==0)
{
	System.out.println("fuzzbuzz");
}
		
else
{
	System.out.println("Not divisible");
} 

/* for(int i=0; i<=5; i++)
{
	 if(i%3==0)
	 {
	 	System.out.println("fuzz");
	 }

	 if(i%5==0)
	 {
	 	System.out.println("buzz");
	 }

	 if(i%3==0 && i%5==0)
	 {
	 	System.out.println("fuzzbuzz");
	 	break;
	 }
	 		
	 else
	 {
	 	System.out.println("Not divisible");
	 }
} */

	}

}
