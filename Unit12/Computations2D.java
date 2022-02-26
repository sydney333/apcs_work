public class Computations2D{
  public static int returnSmall(int[][] values){
  int min = values[0][0];


  for(int i = 0; i<values.length; i++){
    for(int j=0; j<values[i].length; j++){
      if(values[i][j]<min){
        min = values[i][j];
        System.out.print(min + " ");
      }
    }
  }
  return min;

}

public static float sumArray(float[][] values2){
  float total = 0;
  for(float[] row: values2){
    for(float value2 : row){
      total+=value2;
    }
  }
  return total;
}

public static int stringA(String[][] words){
  int count = 0;
  for(int i =0; i<words.length; i++){
    for(int j=0; j<words[i].length; j++){
      if((words[i][j].startsWith("a")) || (words[i][j].startsWith("A"))){
        count++;
      }
    }
  }
  return count;
}

  public static void main(String[] args){
    int[][] values = {{1,4,5},
                      {2,9},
                      {20,15,23}};

    float[][] values2 = {{1,3,5}, {24,2,8}, {5,9,3}};

    String[][] words = {{"Syd", "Dog", "Cat"}, {"Alice", "animal", "cool"}};
  System.out.println(returnSmall(values));
  System.out.println(sumArray(values2));
  System.out.println(stringA(words));
}

}
