package JAVA_PROGRAMS;

import java.util.HashMap;
import java.util.Map;

public class PROGRAM2 {

	
	public static void getcount(String name)
	{
		Map<Character,Integer> omap= new HashMap<Character,Integer>();
		
		char value[]=name.toCharArray();
		 for(char m:value)
		 {
		if(omap.containsKey(m))
		{
			omap.put(m, omap.get(m)+1);
		}
		else
		{
			omap.put(m, 1);
				
		}
		 }
		System.out.println(name+":"+omap);
		
	}
	public static void main(String args[])
	{
		getcount("Missipi");
		getcount("%MM%&&&ADC");
		getcount("JAVA IS THE PROGRAMMING");	 
			 
		getcount("HELLO");	
		getcount("LOVE");	
		getcount("JAVA");	
		}
		
		 
		 
		 
	
}
