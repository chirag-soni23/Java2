package Challenge8.Library;

public class LibraryItem {
       @SuppressWarnings("unused")
       private String itemId;
       @SuppressWarnings("unused")
       private String title;
       @SuppressWarnings("unused")
       private String author;

       public void checkout(){
              System.out.println("Checkout"); 
       }
       public void returnItem(){
              System.out.println("Return item"); 
       }
}
