public class RunChanges extends Validator{

  @Override
   public int analyze(String s){
     if(super.analyze(s)==-1){
       return -1;
     }
     char lead = s.charAt(0);
      int changes =1;
     for(int i=0; i<s.length(); i++){
       if(s.charAt(i)!=lead){
         lead = s.charAt(i);
         changes++;
       }
     }
     return changes;
     }
}