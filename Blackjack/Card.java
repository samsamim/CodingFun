
public class Card
{
	//properties of a Card
	private Suit suit;
	private int faceValue;
	private boolean available = false;
	
	//Constructor
	public Card(int value, Suit suit)
	{
		faceValue = value;
		this.suit = suit;
		makeAvailable();
	}
	
	public int getFaceValue()
	{
		return faceValue;
	}
	
	public String getSuitName()
	{
		return suit.getSuitName();
	}
	
	public Suit suit(){ return suit;}
	
	public boolean isAvailable()
	{
		return available;
	}
	
	public void makeAvailable()
	{
		available = true;
	}
	
	public void makeUnavailable()
	{
		available = false;
	}
	
	
}
