import java.util.ArrayList;
//ADD: hands for another game
public class Hand<T extends Card>
{
	private static int maxValue = 21;
	private int currValue = 0;
	private int possibleMinValue;
	private int possibleMaxValue;
	private ArrayList<Card> hand = new ArrayList<Card>();
	
	public Hand(ArrayList<Card> list)
	{
		for(int i = 0; i < 2; i++)
		{
			hand.add(list.get(i));
			list.remove(i);
		}
	}
	public void hit(ArrayList<Card> list)
	{
		hand.add(list.get(0));
		list.remove(0);
	}
	public int getBJCardValue(Card card)
	{
		if(card.getFaceValue() > 10)
		{
			return 10;
		}
		else
			return card.getFaceValue();
	}
	
	public int getHandValue(ArrayList<Card> currHand)
	{
		boolean flag = false;
		for(int i = 0; i < currHand.size(); i++)
		{
			if(currHand.get(i).getFaceValue() == 1)
			{
					possibleMinValue = possibleMinValue + 1;
			}
			else
			{			
				possibleMaxValue = possibleMaxValue + getBJCardValue(currHand.get(i));
				possibleMinValue = possibleMinValue + getBJCardValue(currHand.get(i));
				
			}
		}
		
		if(possibleMaxValue > 21 && flag == true)
		{
			flag = false;
			possibleMaxValue = possibleMinValue;
		}
		
		if(flag == true)
		{
			System.out.println("You have Ace[s]");
			System.out.println("Your hand can be: " + possibleMaxValue + " or: " +possibleMinValue);
			currValue = possibleMaxValue;
			
		}
		else
		{
			System.out.println("Your hand is:" + possibleMaxValue);
			currValue =  possibleMaxValue;
		}
		
		possibleMaxValue = 0;
		possibleMinValue = 0;
		return currValue;
	}
	
	public ArrayList getHand()
	{
		return hand;
	}
	public void printHand()
	{
		for(int i = 0; i < hand.size();i++)
		{
			System.out.println(hand.get(i).getFaceValue()+ " " + hand.get(i).suit().getSuitName());
		}
	}
	
	
}
