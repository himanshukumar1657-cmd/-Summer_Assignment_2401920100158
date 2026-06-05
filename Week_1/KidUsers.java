public class KidUsers implements UserLibrary {
    int age;
    String Booktype;
    KidUsers(int age,String Booktype){
        this.age=age;
        this.Booktype=Booktype;
    }
    public void registerAccount(){
        if(age<12){
            System.out.println("You have successfully registered under a Kids Account");
        }
        if(age>12){
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }
    public void requestBook(){
        if(Booktype=="kids"){
            System.out.println("Book Issued successfully, please return the book within 10 day");
        }
        else{
         System.out.println("Oops, you are allowed to take only kids books");   
        }
    }
    
}
