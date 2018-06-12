/*
* Name:​[SusanFayez, Polly Yao, Sandeep Arumainayagam]
* MacID:​[fayezs, yaos5, arumais]
* Student Number:​[001404420, 001215549, 001158885]
* Description:​[This is the CD Class]
*/
public class CD extends Audio {
    
    public CD(int price, int sNo, int quantity, String artistName, String audioName, String type) {
        super(price, sNo, quantity, artistName, audioName, type);
    }
    
    @Override
    public int getPrice() {
    	return price + (int)(price * 0.02);
    }
    //adding environmental tax
}
