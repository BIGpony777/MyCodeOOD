public class House implements IEstimatable{
  private int m_sqrFt;
  
public House(int sqrFt){
  if (sqrFt<1000){
    m_sqrFt=1000;
  }else{
  m_sqrFt = sqrFt;}
}
public House(){
  m_sqrFt=1000;
}
  @Override
  public double estimate(){
    return m_sqrFt * 97;
  }
}