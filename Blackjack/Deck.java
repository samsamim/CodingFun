import java.util.ArrayList;
import java.util.Collections;

//ADD: additional discard pile for reshuffling
//ADD: double Deck as-in casino
public class Deck<T extends Card>
{
	private ArrayList<Card> deck = new ArrayList<Card>();
	private int deltIndex = 0;
	
	
	private void createDeck()
	{
		for(int i = 1 ; i<=13 ; i ++)
		{
			deck.add(new Card(i,Suit.SPADE));
			deck.add(new Card(i,Suit.HEART));
			deck.add(new Card(i,Suit.DIAMOND));
			deck.add(new Card(i,Suit.CLUB));
		}
	}
	
	public Deck()
	{
		createDeck();
	}
	
	public void shuffleDeck()
	{
		Collections.shuffle(deck);
	}
	public ArrayList getDeckList()
	{
		return deck;
	}
	
	public void printDeck()
	{
		for(int i = 0; i < deck.size();i++)
		{
			System.out.println(deck.get(i).getFaceValue()+ " " + deck.get(i).suit().getSuitName());
		}
	}
}
