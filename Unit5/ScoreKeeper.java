public class ScoreKeeper{


  private int count;

  public ScoreKeeper(){
    count = 0;

  }

  public int total(){
    return 100 + count*1000;
  }

  public void addscoreNormal(){
    count += 100;

  }

  public void addscoreBonus(){
    count+=1;

  }



}
