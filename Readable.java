/*
* Name:​[SusanFayez, Polly Yao, Sandeep Arumainayagam]
* MacID:​[fayezs, yaos5, arumais]
* Student Number:​[001404420, 001215549, 001158885]
* Description:​[This is the Readable Class]
*/
public abstract class Readable extends Item {
    //creating class Readable with all methods of Item
	protected String authorName;
	protected String Name;
	protected String type;
	//dclaring variables
	public Readable(int price, int sNo, int quantity, String Name, String authorName, String type){
		super(price, sNo, quantity);
		this.Name = Name;
		this.authorName = authorName;
		this.type = type;
	}
	//creating constructor for class Readable
	
	public String getInfo() {
		return sNo + " \t " + Name + " \t " + price + " \t \t " + authorName + " \t \t"  + quantity + " \t \t " + type;
	}
	//function to return all variables of Readable
	
	public int getPrice() {
		return price;
	}
	//function to return price
	public String getReadableName(){
		return Name;
	}
	//function to return name
	public void setReadableName(String Name){
		this.Name = Name;
	}
	//function to set name
	public String getauthorName(){
		return authorName;
	}
	//function to return the author's name
	public void setAuthorName(String authorName){
		this.authorName = authorName;
	}
	//function to set the author's name
	public String getType(){
		return type;
	}
	//function to reutrn the type
	public void setType(String type){
		this.type = type;
	}
	//function to set the type
}

