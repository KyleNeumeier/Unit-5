public class Slogan{
  private static int count;

  private String phrase;

  public Slogan()

  public Slogan(String words){
    phrase = words;
    count++;
  }

  public static int getCount(){
      return count;
  }
  public String getPhrase(){
    return phrase;
  }
}
