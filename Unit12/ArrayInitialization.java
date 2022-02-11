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

public static void printDoubleArray(double[][] doubles){
  for(double[] row: doubles){
    for(double doublee: row){
      System.out.print(doublee + " ");
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

public static void main(String[] args){
  int[][] values = new int[10][10];

  for(int i = 0; i<values.length; i++){
    for(int j = 0; j<values[i].length; j++){
      values[i][j] = 0;
      if(i == j){
        values[i][j] = 1;
      }
    }
  }

  String[][] words = new String[][]{{Sydney, cat, two},
                      {Maddy, dog, one},
                      {Darcy, dog, one},
                      {George}};

  for(int x = 0; x<words.length; x++){
    for(int y = 0; y<words[x].length; y++){
      System.out.print(words[x][y] + " ");
    }
    System.out.println();
  }


  double[][] doubles = new double[5][5];

  for(int p = 0; p<doubles.length; p++){
    for(int q = 0; q<doubles.length; q++){
      doubles[p][q] = (p+1)*10 + 1 +q;

    }
  }

  int[][] values2 = new int[6][5];

  for(int s = 0; s<values2.length; s++){
    for(int w = 0; w<values2[s].length; w++){
      values2[s][w] = s+ 1;
    }
  }

  printArray(values);
  printDoubleArray(doubles);
  printArray(values2);
  printStringArray(words);

}
}
