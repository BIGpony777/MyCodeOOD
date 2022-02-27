public class Wheel
{
   // state...
   private int m_pressure;
   
   // behavior...
   public Wheel(int pressure)
   {
   if(pressure<0){
       m_pressure =0;
     }else{
m_pressure = pressure;
       }
   
   }
   
   public void setPressure(int pressure)
   {
     if(pressure<0){
       m_pressure =0;
     }else{
m_pressure = pressure;
       }
   }
   
   public int getPressure()
   {
      return m_pressure;
      
   }
   
   public String toString()
   {
      return "Pressure = " + m_pressure;
   }

}
