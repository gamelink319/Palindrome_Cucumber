package test;

public class Palindrom {
	    
		public void palindrome(String teks){		
			String poli = "";		
			for(int i=teks.length();i>0;i--){
				String test1 = teks.substring(i-1, i);
				poli += test1;
			}		
			if(teks.equals(poli)){
				System.out.println("==== "+teks+" adalah Palindrome =====");
			}else{
				System.out.println("==== "+teks+" bukan Palindrome =====");
			}
		}
	}	


