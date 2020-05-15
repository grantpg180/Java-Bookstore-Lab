package Labs;


public class mainFile{
    

    public static void main(String[] args){
        bookstore store1 = new bookstore();
    //name
        store1.name = "Books-A-Thousand";
    //address
        store1.address = "1248 NW Main Street\n Huntersville, NC 28078";
    //size
        store1.size = 12000;
    //stock
    //new or used
        store1.bookConditionStock = "both new and used";
    //Days open
        store1.daysOpen.add("Sunday");
        store1.daysOpen.add("Monday");
        store1.daysOpen.add("Tuesday");
        store1.daysOpen.add("Wednesday");
        store1.daysOpen.add("Thursday");
        store1.daysOpen.add("Friday");
        store1.daysOpen.add("Saturday");
    //Business Hours
        store1.timeOpen.add("Sundays from 10am-8pm");
        store1.timeOpen.add("Mondays-Saturdays from 9am-9pm");
        

        

    
    
  //- What is your store's name?
  System.out.println(store1.name);
  //- What is the address?
  System.out.println("We are located at: " + store1.address);
  //- Is the store open today?
  System.out.println("We are open every: "+store1.daysOpen);
  //- What times are you open?
  System.out.println("we are open "+store1.timeOpen.get(0)+ "\n and "+store1.timeOpen.get(1));
  //- How big is the store?
  System.out.println("Out store is "+store1.size+" square feet");
  //- Does the store have new or used books?
  System.out.println("We carry "+store1.bookConditionStock+" books in our location");
  //- What books are on sale this month?
        store1.printBooks();
    
}
}


 