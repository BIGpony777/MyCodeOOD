public class Item
  {
    private String m_desc;
    private int m_qty;
    private double m_price;

    public Item(String desc, double price, int qty){
      m_desc = desc;
      m_price = price;
      m_qty = qty;
    }
    public String toString(){
      return m_desc+": "+m_qty+" at"+m_price;
    }
  }