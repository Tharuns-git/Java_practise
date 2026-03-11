class Library{

    private int bookId;
    private String title;
    private boolean isIssued;

    Library(int bookId,String title,boolean isIssued){
        setId(bookId);
        setTitle(title);
        setIssued(isIssued);
    }

    public void setId(int Id){
        this.bookId=Id;
    }
    public void setTitle(String title){
        this.title=title;
    }
    
    public int getId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }

    public void issueBook(){
        if(!isIssued){
            isIssued=true;
            System.out.println("Book issued successfully");
        }
        else
            System.out.println("Already book issued");
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean isIssued) {
        this.isIssued = isIssued;
    }

    public void returnBook(){
        if(isIssued){
            isIssued=false;
            System.out.println("Book returned Successfully ");
        }
        else{
            System.out.println("book not issued");
        }
    }

    public void displayBook(){

        System.out.println("---------------------------------");
        System.out.println("           Book Details");
        System.out.println("---------------------------------");

        System.out.println("Book Title : "+getTitle());
        System.out.println("Book Id : "+getId());
        if(isIssued){
            System.out.println("Status : Issued");
        }
        else{
            System.out.println("Stauts : Available");
        }
        System.out.println("---------------------------------");
    }





}
public class LibraryBookSystem {
    public static void main(String[] args) {
        
        Library B1=new Library(101,"Java Programming",true );

        B1.displayBook();
        
    }
}
