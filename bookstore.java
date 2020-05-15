package Labs;
import java.util.ArrayList;
import java.io.IOException;



public class bookstore {
    public String name;
    public String address;
    public int size;
    public String bookConditionStock;

    ArrayList<String> daysOpen = new ArrayList<>();{}
    ArrayList<String> timeOpen = new ArrayList<>();{}
    
    ArrayList<String> titles = new ArrayList<String>();{
    loadTitles();
        }
  
    private void loadTitles()
        {try
            {Utils.loadStringsToArray(this.titles);}
        catch (IOException e)
      // for now simply init the array to zero
            {System.out.println("Could not initilize the titles");
    // make sure it is empty
            this.titles = new ArrayList<String>();}
            
        }
        public void printBooks () {
            System.out.println("Book List:");
            for (String book : titles) {
                System.out.println(book);
            }
            System.out.println("-");
        }

}

  

   
