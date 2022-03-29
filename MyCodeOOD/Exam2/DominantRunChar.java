public class DominantRunChar extends Validator{

  @Override
  public int analyze(String s){
    if(super.analyze(s)==-1){
      return -1;
    }
    if(s.length()<2){
      if(s.charAt(0)=='-'){
      return -1;
    }else{
      return 1;
    }
      
    }
    int count =1;
    int max =0;
    char symbol = ' ';
    for(int i=0; i<s.length()-1; i++){
      for(int j=i+1; i<s.length(); i++){
        if(s.charAt(j)==s.charAt(i)){
          count++;
          if(count>=max){
            max = count;
            symbol = s.charAt(i);
          }
        }else{
          i++;
          j=i+1;
          count =1;
        }
      }
    }
    if(symbol=='-'){
      return -1;
    }else{
      return 1;
    }
    }
}