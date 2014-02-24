public enum Suit
{
	SPADE(0), HEART(1), DIAMOND(2), CLUB(3);
	private String color;
	private String suitName;
	private Suit(int v) 
	{ 
		switch (v)
		{
			case 0:
				color = "black";
				suitName = "SPADE";
				break;
				
			case 1:
				color = "red";
				suitName = "HEART";
				break;
				
			case 2:
				color = "red";
				suitName = "DIAMOND";
				break;
				
			case 3:
				color = "black";
				suitName = "CLUB";
				break;
				
			default:
				System.out.println("Please select a color");
				break;
				
		}
	}
	
	public String getSuitName()
	{
		return suitName;
	}
					
	
}
