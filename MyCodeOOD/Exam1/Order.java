import java.util.ArrayList;
public class Order{
  private Customer m_cust;
  private ArrayList<Item> m_items;
  
  public Order(Customer cust){
    m_cust = cust;
    m_items = new ArrayList<Item>();
  }
  public void addItem(Item i){
    m_items.add(i);
  }
  public String toString(){
    String temp = "";
    for(int i =0; i<m_items.size(); i++){
      temp = temp + m_items.get(i).toString() + "\n";
    }
    return "Order for "+m_cust.toString() +"\n OrderItems: \n" + temp;
  }
}