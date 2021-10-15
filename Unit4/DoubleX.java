public class DoubleX{

public static boolean doubleX(String str) {
  int i = str.indexOf("x");
  if(i==-1) return false;

  if (i+1 >= str.length()) return false;
  return str.substring(i+1, i+2).equals("x");

}


public static void main(String[] args){

  System.out.print(doubleX("Sydneyx"));
  System.out.print(doubleX("Sxxydney"));
  System.out.print(doubleX("Syxdxney"));
}
}
