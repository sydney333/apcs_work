
public class ArrayInitialization{


public static void printArray(int[][] values){
  for(int[] row: values){
    for(int value : row){
      System.out.print(value + " ");
    }
      System.out.println();
  }
  System.out.println();
}

public static void printStringArray(String[][] words){
  for(String[] row: words){
    for(String word: row){
      System.out.print(word + " ");
    }
  System.out.println();
  }
  System.out.println();
}

public static void printDoubleArray(Double[][] doubs){
  for(Double[] row: doubs){
    for(Double doub : row){
      System.out.print(doub + " ");
    }
    System.out.println();
  }
  System.out.println();
}



public static void main(String[] args){
     int count = 0;

  int[][] values = new int[10][10];
  int[][] valuesSix = new int[6][5];
  String[][] words = { {"Sydney", "Cat", "Green"},
      {"Maddy", "Dog", "Red"}, {"Cat", "Dog", "Blue"}};
  Double[][] doubs = new Double[5][5];

  for(int i = 0; i<values.length; i++){
    for(int j = 0; j<values[i].length; j++){
      values[i][j] = 0;
      if(i == j){
        values[i][j] = 1;
      }
    }
  }

  for(int i = 1; i<words.length; i++){
    for(int j = 0; j<words[i].length; j++){
      words[i][j] = words[i][j];
    }
  }

  for(int i = 0; i<doubs.length; i++){
    for(int j = 0; j<doubs[i].length; j++){
      doubs[i][j]= i*10.0 + 10;
      doubs[i][j]+=j +1;

      // doubs[i][j] = (i+1)*10 + j + 1;
    }
  }
  for(int i = 0; i<valuesSix.length; i++){
    for(int j = 0; j<valuesSix[i].length; j++){

      valuesSix[i][j] = j;
      valuesSix[i][j] = (i+1)*1;
    }
  }

  printArray(values);
  printArray(valuesSix);
  printStringArray(words);
  printDoubleArray(doubs);


}
}
