import java.util.Scanner;


class main{
	public void DFS(int n) {
		
		int n2=n/2;
		if(n2==0) {
			System.out.printf("%d",n);
			return;
		
		}else 
		{
		DFS(n2);
		
		System.out.printf("%d",n%2);
		}
	}
	
		
	
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb=new Scanner(System.in);
		
		
		
		main t=new main();
		t.DFS(11);
		
		
}
	}

