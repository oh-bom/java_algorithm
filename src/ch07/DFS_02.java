package ch07;

public class DFS_02 {
public static void DFS(int n) {
		

		if(n==0) return;
		else {
			DFS(n/2);
			System.out.print(n%2+"");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFS(11);
	}

}
