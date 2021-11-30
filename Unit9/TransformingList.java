import java.util.*;
public class TransformingList{


  public static String reverseWord(String word){


    String reverseWord = "";
    for(int i=word.length(); i>0; i--){
      reverseWord += word.charAt(i-1);

    }
    return reverseWord;

  }

  public static ArrayList<String> reverseAll(ArrayList<String> words){

    ArrayList<String> reversedWords = new ArrayList<String>();
    for(int j=0; j<words.size(); j++){
      reversedWords.add(reverseWord(words.get(j)));
    }
    return reversedWords;


}

  public static void main(String[] args){

    ArrayList<String> originalWords = new ArrayList<String>();
    originalWords.add("Sydney");
    originalWords.add("Maddy");
    originalWords.add("Lauren");


    ArrayList<String> reversedWords = reverseAll(originalWords);
    System.out.println(originalWords);
    System.out.println(reversedWords);

  }
}
