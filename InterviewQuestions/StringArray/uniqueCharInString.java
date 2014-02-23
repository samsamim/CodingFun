import java.util.HashMap;

public class uniqueCharInString { 
   public static void main(String[] args) { 
      //System.out.println("Hello, World");
      
      String ex1 = "baby-dicks";
      String ex2 = "dicks";
      boolean x = true;
		
	  System.out.println(unique2(ex2)); //O(n^2) worst case
   }
   
   public static boolean unique(String w)
   {
		char c;
		
		for( int i = 0; i< w.length(); i++)
		{
		//	System.out.println("forloop i");
			c = w.charAt(i);
			for (int j = i+1; j<w.length();j++)
			{
				//System.out.println("forloop j");
				if (c == w.charAt(j)) return false;
			}
		}
		return true;
   }
   
   public static boolean unique2(String w)
   {
	    char c;
	   
	    HashMap uniqueStr = new HashMap();
	    
	    for(int i = 0; i <w.length(); i++)
	    {
			if(uniqueStr.containsKey(w.charAt(i)))
			{
				return true;
			}
			else
			{
				uniqueStr.put( w.charAt(i), i);
			}
	    }

	  //  System.out.println(uniqueStr);
	    
	    return false;
   }
   


// answers from the book

	public boolean uniqueFromBook1(string w)
	{
		if (w.length() > 256) return false;
		
		boolean[] char_set = new boolean[256];
		for ( int i = 0; i< w.length(); i++)
		{
			int val = str.charAt(i);
			if(char_set[val])
			{
				return false;
			}
				char_set[val] = true;
		}
		
		return true;
	} 


}
