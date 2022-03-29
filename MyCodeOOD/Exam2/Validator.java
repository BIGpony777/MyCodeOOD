public class Validator implements IAnalyzer{

  @Override
  public int analyze(String s){
    if(s.length()<1){
      return -1;
    }
    for(int i =0; i<s.length(); i++){
      if(s.charAt(i)!='+'&&s.charAt(i)!='-'){
        return -1;
      }
    }
    return 1;
  }
}