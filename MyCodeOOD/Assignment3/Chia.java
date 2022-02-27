public class Chia{
  private String mood;

  public Chia(){
    mood = "happy";
  }
  public void talkToChia(){
    mood = "happy";
  }
  public void yellAtChia(){
    mood = "sad";
  }
  public void singToChia(){
    mood = "terrified";
  }
  public String getMood(){
    return mood;
  }
}