/*
* Name:​[SusanFayez, Polly Yao, Sandeep Arumainayagam]
* MacID:​[fayezs, yaos5, arumais]
* Student Number:​[001404420, 001215549, 001158885]
* Description:​[This is the UserInterface Class]
*/

import java.util.*;
import java.io.*;
import java.text.*;

//importing needed libraries

public class UserInterface {
	
	private int currentPage;
	static User currentUser = new User(null);
	static int confirmNo = 0;
        static ShoppingCart cart = new ShoppingCart(currentUser.getUsername());
	static ArrayList<Item> items = new ArrayList<Item>();
	static ArrayList<Readable> readables = new ArrayList<Readable>();
	static ArrayList<Audio> audioProducts = new ArrayList<Audio>();
    static File users = new File("Users.txt");
	static File books = new File("Books.txt");
	static File ebooks = new File("eBooks.txt");
	static File cd = new File("CDs.txt");
	static File mp3 = new File("MP3.txt");
	static File itemsbought = new File("itemsbought.txt");
	
	
//constructing UserInterface class and declaring variables
	
    public UserInterface(int currentPage) {
        this.currentPage = currentPage;
    }
    
    //creating constructor for UserInterface class

    public int getCurrentPage() {
        return currentPage;
    }
    
  //function to return current page
    
    public static void changeCurrentPage(int currentPage) {
        switch(currentPage){
        case 1: pageOne();
        		break;
        case 2: pageTwo();
        		break;
        case 3: pageThree();
        		break;
        case 5: pageFive();
        		break;   
        case 6: pageSix();
        		break;
        case 7: pageSeven();
        		break;
        case 8: pageEight();
        		break;
        case 9: pageNine();
        		break;
        case 10: pageTen();
        		break;
        case 11: pageEleven();
        		break;
        }
    }
    
    //function to navigate through pages using switch
   
   
    public static void pageOne() {
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("1.Sign in");
    	System.out.println("2.Sign up");
    	System.out.println("Choose your option: ");
    	Scanner num = new Scanner(System.in);
    	int N = num.nextInt();
//giving user navigation options and storing input as variable num
    		
    	if (N == 1){
    		changeCurrentPage(3);
    	}//taking user to page 3
    	if (N == 2){
    		changeCurrentPage(2);
    	}//taking user to page 2
    	else{
    		System.out.println("Please try again");
    	}//giving error for invalid input
    	num.close();
    }//closing scanner


    public static void pageThree() {   
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userName = input.next();
        String line = null;
        //prompting user input and initializing variables
        try {
            BufferedReader br = new BufferedReader(new FileReader(users));
            while((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (String str : values) {
                    if (userName == null ? str == null : userName.equals(str)) {
                        System.out.println("Hello " + userName);
                        currentUser.setUsername(userName);
                        changeCurrentPage(5);
                    }
                    
                    	
                    
                }
            }
           br.close();
           input.close();
        } catch(FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
        	e.printStackTrace();
		}
        System.out.println("Username not found. Please try again");
    	changeCurrentPage(1);
        
    }

    public static void pageTwo(){
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("Choose your username:");
    	Scanner username = new Scanner(System.in);
    	String name = username.nextLine();
    	
    	//Using scanner to ask the user to enter their username
    	
    	
    	try{
    		
			FileReader fileReader = new FileReader(users);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			//opening the Users.txt file and setting up filReader, bufferedReader, and a string line in order to read the file line by line
			while ((line = bufferedReader.readLine()) != null) {
				//a while loop that runs as long as the next line is not blank
				if (name.equals(line)) {
                    System.out.println("Username is already taken");
                    changeCurrentPage(2);
                    //if the input name is equal to any of the lines in Users.txt
                    //displays that the username is taken and restarts the pageTwo() function using changeCurrentPage()
                }
					}
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(users, true)))) {
            	out.print("\n");
            	out.println(name);
              	out.close();
              	//adding the new username to the Users.txt file then closing the writer
              	System.out.println("Username successfully added");
              	User newUser = new User(name);
              	//letting the user know they have created a new username
              	
			}
            catch (IOException e) {
        		e.printStackTrace();
        	}
			//using try/catch in case of any errors
			File cartFile = new File("Cart_[" + name + "].txt");
			if(!cartFile.exists()) {
			    cartFile.createNewFile();
			} 
			FileOutputStream oFile = new FileOutputStream(cartFile, false); 
			//creating a new Cart file for the new username
                    
			fileReader.close();
			oFile.close();
			//closing the Users.txt file reader and file output stream
    	}
    	
         	
    	catch (Exception e){
    		e.printStackTrace();
    	}
    	//try/catch statement in case of errors
    	changeCurrentPage(1);
    	//redirecting the user back to pageOne()
    	username.close();
    }
    public static void pageFive(){//function to navigate through pages
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("1. View Items By Category");
    	System.out.println("2. View Shopping Cart");
    	System.out.println("3. Sign Out");
    	System.out.println("4. View Previous Orders");
    	System.out.println("Choose your option: ");
    	Scanner num = new Scanner(System.in);
    	int N = num.nextInt();
    		
    	if (N == 1){
    		changeCurrentPage(6);
    	}
    	if (N == 2){
    		changeCurrentPage(7);
    	}
    	if (N == 3){
    		changeCurrentPage(1);
    	}
    	if (N==4){
    		changeCurrentPage(11);
    	}
    	else{
    		System.out.println("Please try again");
    	}
    	num.close();
    }
    
    public static void pageSix() {//function to navigate through pages
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("1.Readables");
                System.out.println("2.Audio");
    	System.out.println("Choose your option: ");
    	System.out.println("Press -1 to return to previous menu");


    	Scanner num = new Scanner(System.in);
    	int N = num.nextInt();
    		
    	if (N == 1){
    		changeCurrentPage(9);
    	}
    	if (N == 2){
    		changeCurrentPage(8);
    	}
    	if (N == -1){
    		changeCurrentPage(5);
    	}
    	else{
    		System.out.println("Please try again");
    	}
    	num.close();
    }
    
    public static void pageSeven(){
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println(cart.getContent()); // shopping cart object returns all shopping cart information
    	System.out.println("Press -1 to go back");
    	Scanner num = new Scanner(System.in);
    	int N = num.nextInt();
    		
    	if (N == 1){
    		changeCurrentPage(6);
    	}
    	else{
    		System.out.println("Invalid input. Try again");
    		changeCurrentPage(7);
    	}
    	num.close();
    }
    public static void pageEight(){
    	getAudioProducts();
    	showAudioProducts();
    	
    	//getting and displaying the array of audio products
    	System.out.println("Choose your option:");
    	System.out.println("Press -1 to return to previous menu");
    	//giving the user the page options
    	Scanner input = new Scanner(System.in);
    	 int in = input.nextInt();
    	 //storing the user input in the variable in
    	 if(in == -1){
    		 changeCurrentPage(6);
    		 //taking the user back to pageSix() if the press -1
    	 }
    	 else{
    		 for (int i = 0; i < audioProducts.size(); i++)
             {//starting a for loop to search for the serial number the user inputs
                  if ( audioProducts.get(i).getsNo() == in){ 
                	  //using if statement to check if the input matches any of the serial numbers
                	  //which are in the [0] column of the array
                	  System.out.println("Enter quantity:");
                	  int num = input.nextInt();
                	  //asking user for the number they want and storing it as num
                	  if(num > audioProducts.get(i).getQuantity()){
                		  System.out.println("Not enough " + audioProducts.get(i).getAudioName() + " in stock");
                		  changeCurrentPage(8);
                		  //letting the user know there is not enough in stock if num is greater than the quantity of their item
                		  //restarting the pageEight() function
                	  }
                	  else{//if there is enough of their item in stock, this code runs
                		  DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                		  Date today = new Date();
                		  String day = df.format(today);
                		  //getting today's date
                                  cart.setUsername(currentUser.getUsername());
                		  cart.addItem(audioProducts.get(i).getsNo(), audioProducts.get(i).getAudioName(), day, num);
                		  //creating a new shopping cart object and using addItem() to print the information to the user's cart file
                    		 audioProducts.get(i).setQuantity(audioProducts.get(i).getQuantity() - num); 
                    		 //updating the quantity of the item in the array
                    	  }                     	    
                          
                    	  System.out.println(num + " " + audioProducts.get(i).getAudioName() + " successfully added to your cart");
                          System.out.println("Press -2 to continue shopping or 0 the check out.");
                          //letting the user know items were added to the cart and giving navigation options
                    	  int num2 = input.nextInt();
                    	  if(num2 == -2){
                    		  changeCurrentPage(5);
                    		  //taking the user to pageFive() if the press -2 to continue shopping
                    	  }
                    	  if(num2 == 0){
                    		  changeCurrentPage(10);
                    		  //taking the user to pageTen() if they press 0 to check out
                    	  }
                    	  else{
                    		  System.out.println("Invalid input");
                    		  changeCurrentPage(8);
                    		  //if the user inputs anything else, error message displayed, pageEight() reset
                    	  }
                	  }
                	  
             }
                  
    	 }
    		 System.out.println("Invalid input. Please try again");
    		 changeCurrentPage(8);
    		 //if the user inputs a number that is not a serial number, error message displayed, pageEight() reset
    		 input.close();
    		 //closing the scanner
    	 }
    
    
    public static void pageNine(){
    	getReadables();
    	showReadables();
    	
    	//getting the readables array
    	System.out.println("Choose your option:");
    	System.out.println("Press -1 to return to previous menu");
    	Scanner input = new Scanner(System.in);
    	int in = input.nextInt();
    	//giving user options, taking input as variable in
    	if(in == -1){
   		 changeCurrentPage(6);
   		 //taking the user to pageSix() if they enter -1
    	}
   	 else{
   		 for (int i = 0; i < readables.size(); i++)
            {//setting up for loop to look for serial number
                 if ( readables.get(i).getsNo() == in){ 
                	 //if statement to check if input corresponds to a serial number
               	  System.out.println("Enter quantity:");
               	  int num = input.nextInt();
               	  //asking for quantity, storing it as variable num
               	  if(num > readables.get(i).getQuantity()){
               		  System.out.println("Not enough " + readables.get(i).getReadableName() + " in stock");
               		  changeCurrentPage(9);
               		  //giving error message if quantity entered is greater than quantity available
               		  //restarting pageEight()
               	  }
               	  else{//is the item is in stock, this code runs
               		  DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
               		  Date today = new Date();
               		  String day = df.format(today);
               		  //getting today's date
               		  System.out.println(currentUser.getUsername());
               		  ShoppingCart cart = new ShoppingCart(currentUser.getUsername());
               		  cart.addItem(readables.get(i).getsNo(), readables.get(i).getReadableName(), day, num);
               		//creating a new shopping cart object and using addItem() to print the information to the user's cart file
               		  readables.get(i).setQuantity(readables.get(i).getQuantity() - num);
            		 //updating the quantity available in the array
               		  
                      System.out.println(num + " " + readables.get(i).getReadableName() + " successfully added to your cart");
                 	  System.out.println("Press -2 to continue shopping or 0 the check out.");
                 	  int num2 = input.nextInt();
                 	  //letting user know items were added to cart, giving navigation options, taking input to variable num2
                 	  if(num2 == -2){
                 		  changeCurrentPage(5);
                 		  //taking user to pageFive() if they press -2
                 	  }
                 	  if(num2 == 0){
                 		  changeCurrentPage(10);
                 		  //taking user to pageTen() if they press 0
                 	  }
                 	  else{
                 		  System.out.println("Invalid input");
                 		  changeCurrentPage(9);
                 		  //giving error message and restarting pageNine() if users enters something else
                 	  }
               	  }
               	  
            }
                 
   	 }
   		System.out.println("Invalid input");
   		changeCurrentPage(9);
    	input.close();
    	//giving error and restarting pageNine() is user enters a number that isn't a serial number
    	//closing the scanner
   	 }
    }
    public static void pageTen(){
   	 /*
       Read from the user-based shopping cart text file
       */
      File userCart = new File("Cart_[" + currentUser.getUsername() + "].txt");
      File Book = new File("Books.txt");
      File eBook = new File("eBooks.txt");
      File CD = new File("CDs.txt");
      File MP3 = new File("MP3.txt");
      items.addAll(audioProducts);
      items.addAll(readables);
      
      File itemFile = new File("itemsbought.txt");
		if(!itemFile.exists()) {
		    try {
				itemFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		try {
			FileOutputStream oFile = new FileOutputStream(itemFile, false);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} 

      
       try {
           /*
           Get the shopping cart items into an array
           */
           ArrayList<String> tempCart = new ArrayList<>();
           ArrayList<String> itemsBought = new ArrayList<>();
           Scanner input = new Scanner(System.in);
           BufferedReader page10 = new BufferedReader(new FileReader(userCart));
           String line = null;
           while((line = page10.readLine()) != null) {
               String[] values = line.split(", ");
               for (String str : values) {
                   tempCart.add(str);
               }
           }
           
           /*
           Display the billing information for the user
           Determine which items need which type of tax and shipping costs then calculate
           */
           
           double booksCDsTotal = 0;
           double subtotal = 0;
           double total = 0;
           double shipping = 0;
           double envTax = 0;
           double HST = 0;

           System.out.println("Billing Information: ");
           System.out.println("Name                   Quantity                        Price");
           
           itemsBought.add("0");
           for (int i = 0; i < tempCart.size(); i = i + 4) {
               for (Item item : items) {
                   if (item.getsNo() == Integer.parseInt(tempCart.get(i))) {
                       System.out.println(tempCart.get(i+1) + "                   " + tempCart.get(i+3) + "                         " + item.price);
                       subtotal = subtotal + Double.parseDouble(tempCart.get(i+3))*item.getPrice();
                       itemsBought.add(tempCart.get(i+1));
                       if ((Integer.parseInt(tempCart.get(i)) == 3) || (Integer.parseInt(tempCart.get(i)) == 4) || (Integer.parseInt(tempCart.get(i)) == 7) || (Integer.parseInt(tempCart.get(i)) == 8)) {
                           booksCDsTotal = booksCDsTotal + (Integer.parseInt(tempCart.get(i+3))*item.getPrice());
                       }
                   }
               }
               
           }
           System.out.println();
           envTax = 0.02*booksCDsTotal;
           shipping = 0.10*booksCDsTotal;
           HST = 0.13*subtotal;
           total = envTax + shipping + HST + subtotal;
           itemsBought.set(0, String.valueOf(total));
           System.out.println("Environmental Tax             2%            " + envTax);
           System.out.println("HST                           13%           " + HST);
           System.out.println("Shipping                      10%           " + shipping);
           System.out.println("                                        ---------");
           System.out.println("Total                                       " + total);
           
           System.out.print("Are you sure you want to pay? Yes or No: ");
           String yN = input.next();
           
           /*
           Asks the user if they'd like to purchase the set of items.
           */
           if (yN.equalsIgnoreCase("yes")) {
               /*
               Add the sale to ItemsBought.txt
               Check if confirmNo is empty or filled, if filled check last number
               */
               try {
                   BufferedReader itemsBoughtRead = new BufferedReader(new FileReader(itemsbought)); // opens file containing all previous items
                   
                   if (itemsbought.length() == 0) {
                       confirmNo = 1000; // if no previous orders, start Confirmation Number at U1000
                   
                   } else { // else, check ItemsBought.txt and update the last confirmation number
                       String lastLine; 
                       String currentLine;
                       while((currentLine = itemsBoughtRead.readLine()) != null) {
                           lastLine = currentLine;
                           String[] values = lastLine.split(", ");
                           confirmNo = Integer.parseInt(values[1]) + 1;
                       }
                   }
                   
               } catch(FileNotFoundException e) {
                   System.out.println(e);
               } catch (IOException e) {
                   System.out.println(e);
               }
               
               try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(itemsbought, true)))) {
                   out.print(currentUser.getUsername() + ", ");
                   out.print(confirmNo + ", ");
                   out.print(itemsBought);
                   out.println();
                   out.close();
               }
               
               System.out.println("Confirmation ID: U" + confirmNo);
               System.out.println("Items shipped to: " + currentUser.getUsername());
               
               /*
               Empty the shopping cart
               */
               PrintWriter writer = new PrintWriter(userCart);
               writer.print("");
               writer.close();
               
           } else if (yN.equalsIgnoreCase("no")) {
           	Scanner num = new Scanner(System.in);
           	int N = num.nextInt();
           		
           	if (N == 0){
           		changeCurrentPage(5);
           	}
           	if (N == 1){
           		changeCurrentPage(1);
           	}
           	else{
           		System.out.println("Invalid input");
           		changeCurrentPage(11);
           	}
               
           }

       } catch(FileNotFoundException e) {
           System.out.println(e);
       } catch(IOException e) {
           System.out.println(e);
       }
       changeCurrentPage(11);

   }
   

    public static ArrayList<Readable> getReadables() {

        try {
    	    List<String> tempBooks = new ArrayList<String>(); //an array is created for books
    	    List<String> tempEbooks = new ArrayList<String>(); //an array is created for Ebooks
    	    BufferedReader br = new BufferedReader(new FileReader(books)); //reading the book textfile
    	    BufferedReader er = new BufferedReader(new FileReader(ebooks)); //reading the ebook textfile
    	    String line; //initializing a variable line
    	    String line2; //initializing a varlable line2
            while((line = br.readLine()) != null) { //checking if there is the next element exist in book textfile

                String[] values = line.split(", "); // split each element with ","

                for (String str : values) { //for every element in values
                	tempBooks.add(str);  //add it to tempBooks array
                }

            }
            
            while((line2 = er.readLine()) != null) { //checking if there is the next element exist in ebook textfile

                String[] values = line2.split(", "); // split each element with ","

                for (String str : values) { //for every element in values
                	tempEbooks.add(str);  //add it to tempEbooks array
                }

            }
           
            for (int i=0; i < tempBooks.size(); i = i + 5) { //iterate through every element in tempBooks array
            	readables.add(new Book(Integer.parseInt(tempBooks.get(i+3)), Integer.parseInt(tempBooks.get(i)), Integer.parseInt(tempBooks.get(i+4)), tempBooks.get(i+1), tempBooks.get(i+2), "Book"));
            	//adding all the elments into readables array
            }
            
            for (int i=0; i < tempEbooks.size(); i = i + 5) {
            	readables.add(new eBook(Integer.parseInt(tempEbooks.get(i+3)), Integer.parseInt(tempEbooks.get(i)), Integer.parseInt(tempEbooks.get(i+4)), tempEbooks.get(i+1), tempEbooks.get(i+2), "Ebook"));

            }
            br.close();
            er.close();
        } catch(FileNotFoundException e) {
        	System.out.println(e);
        } catch(IOException e) {
        	System.out.println(e);
        }
        
        return readables;
    


}






    public static ArrayList<Audio> getAudioProducts() {

        try {
    	    List<String> tempCD = new ArrayList<String>(); //an array is created for CD
    	    List<String> tempMP3 = new ArrayList<String>(); //an array is created for MP3
    	    BufferedReader cr = new BufferedReader(new FileReader(cd));  //reading the cd textfile
    	    BufferedReader mr = new BufferedReader(new FileReader(mp3)); //reading the mp3 textfile
    	    String line; //initializing a variable line
    	    String line2; //initializing a varlable line2
            while((line = cr.readLine()) != null) { //checking if there is the next element exist in cd textfile

                String[] values = line.split(", "); // split each element with ","

                for (String str : values) { //for every element in values
                	tempCD.add(str);  //add it to tempCD array
                }

            }
            
            while((line2 = mr.readLine()) != null) { //checking if there is the next element exist in mp3 textfile

                String[] values = line2.split(", "); // split each element with ","

                for (String str : values) { //for every element in values
                	tempMP3.add(str); //add it to tempMP3 array
                }

            }
           
            for (int i=0; i < tempCD.size(); i = i + 5) {  //iterate through every element in tempCD array
            	audioProducts.add(new CD(Integer.parseInt(tempCD.get(i+3)), Integer.parseInt(tempCD.get(i)), Integer.parseInt(tempCD.get(i+4)), tempCD.get(i+2), tempCD.get(i+1), "CD"));
            	//adding all the elments into audioProducts array
            }
            
            for (int i=0; i < tempMP3.size(); i = i + 5) {
            	audioProducts.add(new MP3(Integer.parseInt(tempMP3.get(i+3)), Integer.parseInt(tempMP3.get(i)), Integer.parseInt(tempMP3.get(i+4)), tempMP3.get(i+2), tempMP3.get(i+1), "MP3"));

            }
            cr.close();
            mr.close();
            
        } catch(FileNotFoundException e) {
        	System.out.println(e);
        } catch(IOException e) {
        	System.out.println(e);
        }
        return audioProducts;
    }

  public static void pageEleven() {
        
        System.out.println("Confirmation Id           Product Name            Total");
        try {
            BufferedReader itemsBoughtDisplay = new BufferedReader(new FileReader(itemsbought)); // get itemsbought.txt
            String line = null;
            
            while((line = itemsBoughtDisplay.readLine()) != null) { // split each items boguht line to see if which one the current user has made
                String[] values = line.split(",");
                /*
                Print the confirmation number, items, and total to the user
                */
                values[2] = values[2].substring(2, values[2].length());
                values[values.length - 1] = values[values.length - 1].substring(0, values[values.length - 1].length() - 1);
                if (values[0] == null ? currentUser.getUsername() == null : values[0].equals(currentUser.getUsername())) {
                    for (int i = 3; i < values.length; i++) {
                        System.out.println("U" + values[1] + "           " + values[i] + "          " + values[2]);
                    }
                }
            }
            System.out.println("Press 0 to contine shopping or 1 to log out.");
            Scanner num = new Scanner(System.in);
            int N = num.nextInt();
            	
            if (N == 0){
            	changeCurrentPage(5);
            }
            if (N == 1){
            	changeCurrentPage(1);
            }
            else{
            	System.out.println("Invalid input");
            	changeCurrentPage(11);
            }
            num.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }


public void run(){
	changeCurrentPage(1);
}

public static void showReadables() {
	
    // displaying the contents in readables        

			System.out.println("Readables: ");
			System.out.println();
			System.out.println("S.No \t Book Title \t Price($) \t Author \t Quantity \t Type");
			for (Readable Readable: readables) {
				System.out.print(Readable.getInfo());
				System.out.print("\n");
			}
		
	}
	
	
	public static void showAudioProducts(){
		
		//displaying the contents in audioProducts
		
		
	        
	        System.out.println("Audio");
	        System.out.println();
			System.out.println("S.No \t Name \t \t \t Price($) \t Artist \t Quantity in Store \t Type");
		
			for (Audio Audio : audioProducts) {
		    	System.out.print(Audio.getInfo());
		    	System.out.print("\n");
		    	
		    }
	   
	 
  }
}
