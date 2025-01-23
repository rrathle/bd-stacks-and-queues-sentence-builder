import java.util.Stack;

public class SentenceBuilder {

    private Stack<String> sentance;

    /**
     * Constructor.
     */
    public SentenceBuilder() {
        this.sentance = new Stack<>();

    }

    /**
     * Adds a word to the sentence.
     * @param word to be added to the sentence.
     */
    public void addWord(String word) {
        sentance.push(word);

    }

    /**
     * Undoes the last word added, and returns it.
     * @return The word most recently added to the sentence, if any; null, otherwise.
     */
    public String undo() {
        if (!sentance.isEmpty()) {
            return sentance.pop();
        }
        return null;
    }

    /**
     * Display all the current words in our sentence.
     * @return string representation of the words currently in the sentence.
     */
    public String getSentenceWords() {
       StringBuilder words = new StringBuilder("[");

       for(int i = 0; i < sentance.size(); i++) {
           words.append(sentance.get(i));
           if (i < sentance.size() -1) {
               words.append(", ");
           }
       }
       words.append("]");
       return words.toString();
    }
}
