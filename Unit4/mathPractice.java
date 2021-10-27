public class mathPractice{
//sum of squares
  public static int sumOfSquares(int n)
  {
    if(n==1)
      return 1;
      else
    return(n*n + sumOfSquares(n-1));
  }
//count occurances
    public static int countOccurances(String full, String section)
    {
    int count = 0;

    for(int i=0; i<=section.length(); i++)
    {
      String sub = full.substring(i, i+section.length());
      if (sub.equals(section))
      count++;
    }
    return count;


//reverse the word
}
  public static String reverse(String word)
  {
    String reverseWord = "";
    for(int i=word.length(); i>0; i--){
      reverseWord += word.charAt(i-1);

    }
    return reverseWord;
  }

  public static int factorial(int j)
  {
    if(j>=1)
    return j*factorial(j-1);
    else
    return 1;
  }

  public static void main(String[] args)
  {

  System.out.print("Sum of squares for first 5 numbers is " + sumOfSquares(5));
  System.out.print(" Count occurances in Sydney is " + countOccurances("Sydney", "y"));
  System.out.print(" The reverse of Sydney is: " + reverse("Sydney"));
  System.out.print(" The factorial of 3 is " + factorial(3));
  }

}
