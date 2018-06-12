/*
* Name:​[SusanFayez, Polly Yao, Sandeep Arumainayagam]
* MacID:​[fayezs, yaos5, arumais]
* Student Number:​[001404420, 001215549, 001158885]
* Description:​[This is the ShoppingCart Class]
*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ShoppingCart extends User {
	
	static ArrayList<String> content = new ArrayList<String>(); // content array to be filled with all shopping cart info
	
	public ShoppingCart(String username) {
		super(username);
	}
	
        /*
        Get the content array filled with all shopping cart information
        */
	public String getContent() {
		String cart = "";
		for (int i = 0; i < content.size() - 1; i = i + 4) { // from the content array with all the shopping cart information, return every 4 array value on a new line per item
                    cart = content.get(i) + "," + content.get(i+1) + "," + content.get(i+2) + "," + content.get(i+3) + "\n" + cart;
                }
                
                return cart;
	}
	
	
	
	public void addItem(int sNo,String Name, String day, int quantity){
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Cart_[" + username + "].txt", true)))) {
			  //setting up to write to the current user's cart file
  		 out.println(sNo + ", " + Name + ", " + day + ", " + quantity);
  		 out.close();
  		 //printing the serial number, name of item, the date added, and the number they are buying to the cart file
  		 content.add(Integer.toString(sNo));
  		 content.add(Name);
  		 content.add(day);
  		 content.add(Integer.toString(quantity));
  		 //creating the content array
  	  }                     	    
        catch (IOException e) {
    		e.printStackTrace();
	}
	
	

}
}