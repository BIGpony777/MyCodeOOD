public class PreferredCustomer implements IElectricBill{

  @Override
  public double calc(int kwh){
    double temp = (kwh*m_rate)/2;
    return (kwh*m_rate) -temp;
  }
}