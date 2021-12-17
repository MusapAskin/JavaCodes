package Overriding;

public class TecherCreditManager extends BaseCreditManager{
    public double calculate(double amount){
        return amount*1.12;
    }
}
