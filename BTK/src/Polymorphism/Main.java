package Polymorphism;

public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(), new EmailLogger(), new FileLogger()};
//        for (BaseLogger logger : loggers
//        ) {
//            logger.log("Log Mesajı.");
//        }
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}
