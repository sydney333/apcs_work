public class CoinFlip{

  public static void main(String[] args){
    int max = 10;
    int min = 1;
    int range = max-min+1;

    for(int i =0; i<20; i++){
      int rand =(int)(Math.random() * range) + min;
      if (rand >5){
        System.out.print("Heads! ");
      }else{
        System.out.print("Tails! ");


}
}

}
}
