package Cote_programmers;

import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        ArrayList<String>l1=new ArrayList<>();
        ArrayList<String>l2=new ArrayList<>();
  
 
        for(int x:arr1){
        	Stack<Integer> s=new Stack<>();
        	String str="";
        	int q=0;
          
        	//2진수 바꾸기
            do{
            	s.push(x%2);
            	x=x/2;
            	
            if(x==1) s.push(x);
           
            }while(x>1);
            
           
            //#으로 바꾼 문자열
            do {
            	
            	if(s.pop()==1) str+="#";
            	else str+=" ";
            	
            }while(!s.isEmpty());
            
           
            l1.add(str);
            
            do {
            	l1.add(" ");
            }while(l1.size()<n);
        }
        
        for(int x:arr2){
        	Stack<Integer> s=new Stack<>();
        	String str="";
        	int q=0;
          
        	//2진수 바꾸기
            do{
            	s.push(x%2);
            	x=x/2;
            	
            if(x==1) s.push(x);
           
            }while(x>1);
            
           
            //#으로 바꾼 문자열
            do {
            	
            	if(s.pop()==1) str+="#";
            	else str+=" ";
            	
            }while(!s.isEmpty());
           
            l2.add(str);
            
            do {
            	l2.add(" ");
            }while(l2.size()<n);
        }
        
        
        //두 배열 비교후 최종 답 구축
        
        for(int i=0;i<n;i++) {
        	String s1=l1.get(i);
        	String s2=l2.get(i);
        	
        	System.out.println(s1+"!"+s2);
        }
        
        
        return answer;
    }
}

public class secretMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Solution s=new Solution();
		int []arr1= {9, 20, 28, 18, 11};
		int []arr2= {30, 1, 21, 17, 28};
		
		s.solution(5,arr1,arr2);

	}

}
