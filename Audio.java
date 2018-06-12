/*
* Name:​[SusanFayez, Polly Yao, Sandeep Arumainayagam]
* MacID:​[fayezs, yaos5, arumais]
* Student Number:​[001404420, 001215549, 001158885]
* Description:​[This is the A Class]
*/
public abstract class Audio extends Item {
    
    String artistName;
    String audioName;
    String type;
    
    public Audio(int price, int sNo, int quantity, String artistName, String audioName, String type) {
        super(price, sNo, quantity);
        this.artistName = artistName;
        this.audioName = audioName;
        this.type = type;
    }

	public String getInfo() {
		return sNo + " \t " + audioName + " \t \t " + price + " \t " + artistName + " \t "  + quantity + " \t " + type;
	}
	//function to return all variables of Audio
    /**
     * @return the artistName
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * @param artistName the artistName to set
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     * @return the audioName
     */
    public String getAudioName() {
        return audioName;
    }

    /**
     * @param audioName the audioName to set
     */
    public void setAudioName(String audioName) {
        this.audioName = audioName;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * @return the price
     */
    
    public abstract int getPrice();
}

