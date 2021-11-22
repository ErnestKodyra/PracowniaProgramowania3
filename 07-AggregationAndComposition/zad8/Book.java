public class Book
{
    private String title;
    private Writer author;
    private int pages;
    private boolean isOpen;
    
    Book(String title, Writer author, int pages, boolean isOpen){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isOpen = isOpen;
    }
    
    public String toString(){
        return "Title: " + title + "\nAuthor: " + author.toString() + "\nNo of pages: " + pages + "\nIs book open? " + isOpen;
    }
    
    public static void main(String[] args){
        Writer wrt = new Writer("Adam", "Kowalski", 28, 2);
        Book bk = new Book("XYZ", wrt, 420, false);
        System.out.println(bk);
    }
}
