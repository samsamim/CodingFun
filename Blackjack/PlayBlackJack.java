import java.io.Console;

public class PlayBlackJack
{
	private static Console console;
	private static Deck deck;
	private static Hand hand;
	private static String gameOn(int value)
	{
		String input = null;
		if(value == 21)
		{
			System.out.println("BlackJack!!!");
			System.exit(0);
		}
		else if(value > 21)
		{
			System.out.println("You lose");
			System.exit(0);
		}
		else
		{
			System.out.println("Hit or Stay?");
			input = console.readLine("Enter input:");
			
		}
		return input;
	}
	public static void main(String[] args)
	{
		String input = null;
		console  = System.console();
		deck = new Deck();
		//deck.printDeck();
		
		deck.shuffleDeck();
		//deck.printDeck();
		
		hand = new Hand(deck.getDeckList());
		hand.printHand();
		//System.out.println("\n hit");
		//hand.hit(deck.getDeckList());
		//hand.printHand();
		input = gameOn(hand.getHandValue(hand.getHand()));
		
		System.out.println(" ");
		while(input != null)
		{
			if(input.equals("stay") || input.equals("Stay") || input.equals("STAY"))
			{
				System.out.println("Your Final Value is: " + hand.getHandValue(hand.getHand()) + "\n");
				System.exit(0);
			}
			else if (input.equals("Hit") || input.equals("hit") || input.equals("HIT"))
			{
				hand.hit(deck.getDeckList());
				hand.printHand();
				input = gameOn(hand.getHandValue(hand.getHand()));
				System.out.println();
			}
			else
			{
				System.out.println("Please input a valid command (Stay or Hit)\n");
				input = gameOn(hand.getHandValue(hand.getHand()));
			}
		}
	}
}
