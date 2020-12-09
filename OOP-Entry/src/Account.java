import java.util.Scanner;

 public class Account {
    private static String userName;
    private static String password;
    private int amount;

    Scanner scanner = new Scanner(System.in);


    public Account(String userName, String password, int amount) {
        this.userName = userName;
        this.password = password;
        this.amount = amount;
    }

    public static String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void addMoney(int amount){
        this.amount +=amount;
        System.out.println("Hesabınıza "+amount+"'Tl yatırıldı.Yeni hesap tutarı : "+this.amount);

    }

    public void takeMoney(int amount){
        if((this.amount-amount) < 0){
            System.out.println("Yeterli bakiyeniz yok.Bakiyeniz : "+this.amount);
        }
        else{
            this.amount -= amount;
            System.out.println("Hesabınızdan "+amount+"'Tl çekildi.Yeni hesap tutarı : "+this.amount);
        }
    }

}

 class Login{
    public boolean login(Account account){
        Scanner sc = new Scanner(System.in);
        String username;
        String password;

         System.out.print("Kullanıcı adı : ");
         username = sc.nextLine();
         System.out.print("Parola : ");
         password = sc.nextLine();
         
         if(Account.getUserName().equals(username) && Account.getPassword().equals(password)){
             return true;
         }
         else{
             return false;
         }
     }
 }

 class ATM{
     public void run(Account account){
         Login login = new Login();
         Scanner sc = new Scanner(System.in);
         System.out.println("Bankamıza hoşgeldiniz...");
         System.out.println("-----------------------------");
         System.out.println("Kullanıcı girişi");
         System.out.println("-----------------------------");
         int entry = 3;

         while(true){
             if(login.login(account)){
                 System.out.println("Giriş başarılı...");
                 break;
             }
             else{
                 System.out.println("Giriş başarısız...");
                 entry -= 1;
                 System.out.println("Kalan giriş hakkınız : "+entry);
             }
             if(entry ==0){
                 System.out.println("Giriş hakkınız bitti...");
                 return;
             }
         }
         System.out.println("***********************************");
                         String options ="1.Hesabı göster"+
                         "\n2.işlem: Para çekme "+
                         " \n3.İşlem: Para yatıma."+
                         "\n(Çkış için q'a basınız.)"+
                         "\n***********************************";
         System.out.println(options);
         System.out.println("***********************************");
         
         while(true){
             System.out.println("İşlemi seçiniz.");
             String option = sc.nextLine();
             if(option.equals("q")){
                 break;
             }
             else if(option.equals("1")){
                 System.out.println("Hesap bakiyesi : "+account.getAmount());
             }
             else if(option.equals("2")){
                 System.out.println("Çekmek istediğiniz tutarı giriniz : ");
                 int amount = sc.nextInt();
                 sc.nextLine();
                 account.takeMoney(amount);
             }
             else if(option.equals("3")){
                 System.out.println("Yatırmak istediğiniz tutarı giriniz : ");
                 int amount = sc.nextInt();
                 sc.nextLine();
                 account.addMoney(amount);
             }
             else{
                 System.out.println("Geçersiz işlem...");
             }
         }



     }
 }

 class Main {
     public static void main(String[] args) {
         ATM atm = new ATM();
         Account account = new Account("Musap Aşkın","12345",1000);

         atm.run(account);

     }
 }
