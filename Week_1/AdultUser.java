public class AdultUser implements UserLibrary {
     
     int age;
    String Booktype;

    public AdultUser(int age,String Booktype ) {
        this.age=age;
        this.Booktype=Booktype;
    }
    public void registerAccount(){
        if(age>12){
            System.out.println("You have successfully registered under an Adult Account");
        }
        else{
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }
    public void requestBook(){
      if(Booktype=="Fiction"){
        System.out.println("Book Issued successfully, please return the book within 7 days");
      }
      else{
      System.out.println("Oops, you are allowed to take only adult Fiction books");  
      }  
    }
    
}
