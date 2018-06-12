/*
* Name:​[SusanFayez, Polly Yao, Sandeep Arumainayagam]
* MacID:​[fayezs, yaos5, arumais]
* Student Number:​[001404420, 001215549, 001158885]
* Description:​[This is the Book Class]
*/
public class Book extends Readable {
	public Book(int price, int sNo, int quantity, String Name, String authorName, String type){
		super(price, sNo, quantity, Name, authorName, type);
		
	}
public int getPrice() {
	return price + (int)(price * 0.02);
}
}//updating price for environmental tax