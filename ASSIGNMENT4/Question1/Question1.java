
public class Question1 {
	StringBuilder builder;

	public String BuildBookQuoteHTML(){
			builder = new StringBuilder();
			
			// Build header.
			insertIntoTagNewLine("A page of famous book quotes!", "H1");
			insertIntoTag("- Some book reviewer", "H2");
			// Add book quotes.
			insertIntoTagNewLine("I know. I was there. I saw the great void in your soul, and you saw mine.", "P");
			insertIntoTagNewLine("She says nothing at all, but simply stares upward into the dark sky and watches, with sad eyes, the slow dance of the infinite stars.", "P");
			insertIntoTagNewLine("Clocks slay time… time is dead as long as it is being clicked off by little wheels; only when the clock stops does time come to life.", "P");
			insertIntoTagNewLine("None of those other things makes a difference. Love is the strongest thing in the world, you know. Nothing can touch it. Nothing comes close. If we love each other we’re safe from it all. Love is the biggest thing there is.", "P");
			insertIntoTagNewLine("Sometimes we get sad about things and we don’t like to tell other people that we are sad about them. We like to keep it a secret. Or sometimes, we are sad but we really don’t know why we are sad, so we say we aren’t sad but we really are.", "P");
			insertIntoTagNewLine("I know not all that may be coming, but be it what it will, I’ll go to it laughing.", "P");
			insertIntoTagNewLine("Maybe ever’body in the whole damn world is scared of each other.", "P");
			insertIntoTagNewLine("Life is to be lived, not controlled; and humanity is won by continuing to play in face of certain defeat.", "P");
			insertIntoTagNewLine("It's the possibility of having a dream come true that makes life interesting.", "P");
			insertIntoTagNewLine("I cannot fix on the hour, or the spot, or the look or the words, which laid the foundation. It is too long ago. I was in the middle before I knew that I had begun.", "P");
			insertIntoTagNewLine("There is no greater agony than bearing an untold story inside you.", "P");
			insertIntoTagNewLine("Still, there are times I am bewildered by each mile I have traveled, each meal I have eaten, each person I have known, each room in which I have slept. As ordinary as it all appears, there are times when it is beyond my imagination.", "P");
			insertIntoTagNewLine("And so we beat on, boats against the current, borne back ceaselessly into the past.", "P");
			insertIntoTagNewLine("Hello, babies. Welcome to Earth. It's hot in the summer and cold in the winter. It's round and wet and crowded. At the outside, babies, you've got about a hundred years here. There's only one rule that I know of, babies—God damn it, you've got to be kind.", "P");
			insertIntoTagNewLine("He stepped down, trying not to look long at her, as if she were the sun, yet he saw her, like the sun, even without looking.", "P");
			insertIntoTagNewLine("How wonderful it is that nobody need wait a single moment before starting to improve the world.", "P");	
			builder.append("<A HREF=\"page2.html\">Click here to go to the next page!</A>\n");
			return builder.toString();
		}

	public void insertIntoTagNewLine(String content, String tagName) {
		insertIntoTag(content, tagName);
		builder.append("\n");
	}

	public void insertIntoTag(String content, String tagName) {
		builder.append(String.format("<%s>%s</%s>", tagName, content, tagName));
	}

}
