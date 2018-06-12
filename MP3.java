/*
* Name:​[SusanFayez, Polly Yao, Sandeep Arumainayagam]
* MacID:​[fayezs, yaos5, arumais]
* Student Number:​[001404420, 001215549, 001158885]
* Description:​[This is the MP3 Class]
*/
public class MP3 extends Audio {
	public MP3(int price, int sNo,int quantity, String audioName, String artistName, String type){
		super(price, sNo, quantity, audioName, artistName, type);
	}
	
	@Override
	public int getPrice(){
		return price;
	}
	
	
}
