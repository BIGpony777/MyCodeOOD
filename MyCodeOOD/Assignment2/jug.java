public class Jug{ 
   // state...
private String liquidType;
private int gallons;
   // constructors...
public Jug(){
  liquidType = "water";
  gallons = 0;
}
public Jug(String type, int amt){
  liquidType = type;
  gallons = amt;
}
   // behaviors...   
public void setGallons(int amt){
  gallons = amt;
}

public int getGallons(){
  return gallons;
}
public String getLiquidType(){
  return liquidType;
}
public bool isEmpty(){
  if(gallons<=0){
    return true;
  }else{
    return false;
  }

}
}