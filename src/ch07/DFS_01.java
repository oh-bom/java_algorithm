package ch07;

public class DFS_01{
	
	public static void DFS(int n) {
		if(n==0) return;
		else {
		DFS(n-1);
		System.out.println(n);
		 
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DFS(11);
	}

}
