package JAVA_PROGRAMS;

public class PROGRAMS_1 {

public static void main(String[] args) {
        
	 
	        
	        String str= "I AM AUTOMATION TESTER";
	        str=str + " ";
	        String s="";
	              
	                 for(int i=0;i<str.length();i++)
	                 { 
	                     char b=str.charAt(i);
	                     if(b==' ' && i>=2)
	                     {
	                       s=s+str.charAt(i-2);
	                     }
	                     
	                     
	                 }
	    System.out.println("the modified string is "+ s);   
	            
	            
	        }
    
}


