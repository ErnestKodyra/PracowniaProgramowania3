public class book
{
    String name = "";
    String author = "";
    String releaseYear = "";
    String genre = "";
    String ISBN = "";
    String pageNo = "";
    boolean hasPolishTranslation = true;
    
    void displayInfo(){
        System.out.println(name + "\nby: " + author + "\nReleased in: " + releaseYear + "\nGenre: " + genre + "\nISBN: " + ISBN + "\nno. of pages: " + pageNo);
        if(hasPolishTranslation == true){
            System.out.println("Book has a Polish translation");
        }
        else{
            System.out.println("Book doesn't have a Polish translation");
        }
    }
    
}
