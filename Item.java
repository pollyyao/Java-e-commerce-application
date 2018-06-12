/*
* Name:​[SusanFayez, Polly Yao, Sandeep Arumainayagam]
* MacID:​[fayezs, yaos5, arumais]
* Student Number:​[001404420, 001215549, 001158885]
* Description:​[This is the Item Class]
*/
public abstract class Item {
    //creating class Item
   protected int price;
   protected int sNo;
   protected int quantity;
   //declaring variables
   
   public Item(int price, int sNo, int quantity) {
       this.price = price;
       this.sNo = sNo;
       this.quantity = quantity;
       //creating constructor for class Item
   }
    public int getPrice(){
    	return price;
    	//function to return price
    }
    public void setPrice(int price) {
        this.price = price;
        //funtion to set price
    }

    
    public int getsNo() {
        return sNo;
    }
  //function to return serial number

    /**
     * @param sNo the sNo to set
     */
    public void setsNo(int sNo) {
        this.sNo = sNo;
    }
  //function to set serial number

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }
  //function to return quantity

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
  //function to set quantity
   
   
}

