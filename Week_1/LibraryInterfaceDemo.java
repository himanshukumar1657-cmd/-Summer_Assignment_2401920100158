public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUsers k1 = new KidUsers(10, "Kids");
        k1.registerAccount();
        k1.requestBook(); 
        
        KidUsers K2 = new KidUsers(18, "Fiction");
        K2.registerAccount();
        K2.requestBook(); 

        AdultUser A1=new AdultUser(5,"kids");
         A1.registerAccount();
        A1.requestBook();
         AdultUser A2=new AdultUser(5,"Fiction");
          A2.registerAccount();
          A2.requestBook();
    }
    
}
