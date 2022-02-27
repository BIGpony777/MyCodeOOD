public class DiscountCustomer implements IElectricBill{

  @Override
  public double calc(int kwh){
    double temp = (kwh * m_rate)/4;
    return (kwh * m_rate)-temp;
  }
}