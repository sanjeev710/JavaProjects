import java.util.*;
import java.lang.*;

public class TextAnalyzer {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Texts inputs such sentence or Paragraph
        System.out.print("Enter the content: ");
        String content = scan.nextLine();

        //Spliting the paragraph into words
        String regex = "[\\s+]";    //\\s+ means one or more whitespaces
        String[] words = content.split(regex);

        //Total no of words
        System.out.println("Total no of words: " + words.length);

        int totalCharacters = 0;
        for(String word : words){
            totalCharacters += word.length();
        }
        System.out.println("Total no of characters: " + totalCharacters);

        //Total no of vowels, consonants, digits and whitespaces
        int totalVowels = 0;
        int totalConsonants = 0;
        int totalDigits = 0;
        int totalSymbols = 0;
        int totalSpaces = 0;

        for(int i = 0; i < content.length(); i++){
            if(content.charAt(i) >= 'a' && content.charAt(i) <= 'z'){
                if((content.charAt(i) == 'a') || (content.charAt(i) == 'e') || (content.charAt(i) == 'i') || (content.charAt(i) == 'o') || (content.charAt(i) == 'u')){
                    totalVowels++;
                }
                else{
                    totalConsonants++;
                }
            }
            else if(content.charAt(i) >= '0' && content.charAt(i) <= '9'){
                totalDigits++;
            }
            else if(content.charAt(i) == ' '){
                totalSpaces++;
            }
            else{
                totalSymbols++;
            }
        }

        System.out.println("Vowels: " + totalVowels);
        System.out.println("Consonants: " + totalConsonants);
        System.out.println("Digits: " + totalDigits);
        System.out.println("Spaces: " + totalSpaces);
        System.out.println("Symbols: " + totalSymbols);
    }
}
