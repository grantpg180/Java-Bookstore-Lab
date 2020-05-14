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
    
    ArrayList<String> titles;
    public bookstore (String name, String address){
        this.name = name;
        this.address = address;

        titles = new ArrayList<String>();
        loadTitles();
    }
    public void loadingbooks() {
        for (String i : titles){
            System.out.println(i);
        }
    }

    private void loadTitles()
        {try
            {utils.loadStringsToArray(this.titles);}
        catch (IOException e)
      // for now simply init the array to zero
            {System.out.println("Could not initilize the titles");
    // make sure it is empty
            this.titles = new ArrayList<String>();}
            
        }

}

  

   
