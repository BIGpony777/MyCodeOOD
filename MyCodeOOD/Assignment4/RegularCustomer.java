public class RegularCustomer implements IElectricBill{

  @Override
  public double calc(int kwh){
    return kwh *m_rate;
  }
}