import	java.io.*;

public class WordCount
{
    public static void main(String[] args) throws java.io.IOException
    {
        // definition of a word is a sequence of letters -- either uppercase or lowercase
        System.out.println("\nWORD COUNT 1.0\n");
        if (args.length > 0 && args[0].length() > 0) {
            System.setIn(new FileInputStream(new File(args[0])));
            WordCount.analyze(true);
        } else {
            System.out.println("Please enter some text to analyze: ");
            WordCount.analyze();
        }
    }

    private static void analyze() throws java.io.IOException {
        WordCount.analyze(false);
    }

    private static void analyze(Boolean aFile) throws java.io.IOException {
        int wordCount = 0;
        int characterCount = 0;
        int nonwspCharacterCount = 0;
        int lowLetterCount = 0;
        int upLetterCount = 0;
        int numCount = 0;
        int specCharCount = 0;
        Boolean end = false;
        while (!end) {
            int i = System.in.read();
            if (i == -1) {
                end = true;
                continue;
            } else {
                nonwspCharacterCount++;
            }
            if (i == '\r') {
                continue;
            } else if (i == '\n') {
                if (characterCount > 0) // this is currently counting double returns in a file as a word
                    wordCount++;
                if (!aFile)
                    end = true;
                continue;
            } else if (i == ' ') {
                wordCount++;
            } else {
                characterCount++;
                if (i >= 'a' && i <= 'z') {
                    lowLetterCount++;
                } else if (i >= 'A' && i <= 'Z') {
                    upLetterCount++;
                } else if (i >= '0' && i <= '9') {
                    numCount++;
                } else {
                    specCharCount++;
                }
            }
        }
        System.out.println("Text Analysis: ");
        System.out.println("   total characters:             " + nonwspCharacterCount);
        System.out.println("      not counting white spaces: " + characterCount);
        System.out.println("      just letters:              " + (lowLetterCount + upLetterCount));
        System.out.println("         upper case letters:     " + upLetterCount);
        System.out.println("         lower case letters:     " + lowLetterCount);
        System.out.println("      numbers:                   " + numCount);
        System.out.println("      special characters:        " + specCharCount);
        System.out.println("   total words:                  " + wordCount);
    }
}