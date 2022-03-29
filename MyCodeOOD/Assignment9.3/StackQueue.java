import java.util.*;
public class StackQueue{
  public static StackQueue m_instance;
  public static StackQueue getInstance(){
    if(m_instance ==null){
      m_instance = new StackQueue();
    }
    return m_instance;
  }
  private StackQueue(){};

  public void pushOnStack(String s, List<String> l){
    l.add(l.size(), s);
  }

  public String popFromStack(List<String> l){
    String ret = l.get(l.size()-1);
    l.remove(l.size()-1);
    return ret;
  }

  public void addToQueue(String s, List<String> l){
    
    l.add(l.size(), s);
  }

  public String removeFromQueue(List<String> l){
    String ret = l.get(0);
    l.remove(0);
    return ret;
  }

  
}