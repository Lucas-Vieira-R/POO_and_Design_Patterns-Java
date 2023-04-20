public class RandomGenerator{
  private static RandomGenerator instance = null;

  private RandomGenerator(){}

  public static RandomGenerator getInstance(){
    if(instance ==null){
      instance = new RandomGenerator();
    }
    return instance;
  }
  public double nextDouble(){
    return Math.random();
  }
  
}