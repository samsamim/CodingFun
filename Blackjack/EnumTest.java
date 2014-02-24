public class EnumTest
{
	 Suit suit;
	public EnumTest(Suit suit)
	{
		this.suit = suit;
	}
	
	public void tellMeSuit()
	{
		switch(suit)
		{
			case SPADE:
				System.out.println("SPADE");
				break;
				
			case HEART:
				System.out.println("Heart");
				break;
			
			case DIAMOND:
				System.out.println("Diamond");
				break;
				
			case CLUB:
				System.out.println("Club");
				break;
				
			default: 
				System.out.println("nikker");
				break;
			
		}
	}
	
	public static void main(String[] args)
	{
		EnumTest test = new EnumTest(Suit.SPADE);
		test.tellMeSuit();
	}
	
	
}
