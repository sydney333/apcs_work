public class MagicEightBall{

  public String option(){

    double value = Math.random();

    if (0<= value && value <= .1)
      return "Your wish will come true!";


    if(.1<= value && value <= .2)
      return "Try again";

    if(.2<= value && value <= .3)
      return "The odds are not in your favor";

    if(.3<= value && value <= .4)
        return "ABSOLUTELY not";

    if(.4<= value && value <= .5)
          return "Yes.";

    if(.5<= value && value <= .6)
          return "Definitely yes.";

    if(.6<= value && value <= .7)
          return "no.";

    if(.7<= value && value <= .8)
          return "I cannot answer this for you.";

    return "Hmm. Unsure.";
}
}
