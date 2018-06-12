/*
* Name:​[SusanFayez, Polly Yao, Sandeep Arumainayagam]
* MacID:​[fayezs, yaos5, arumais]
* Student Number:​[001404420, 001215549, 001158885]
* Description:​[This is the eBook Class]
*/
public class eBook extends Readable{
	public eBook(int price, int sNo, int quantity, String Name, String authorName, String type){
		super(price, sNo, quantity, Name, authorName, type);

	} 
	@Override
	public int getPrice(){
		return price;
	}
}
