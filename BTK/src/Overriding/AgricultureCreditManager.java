package Overriding;

public class AgricultureCreditManager extends BaseCreditManager{
    public double calculate(double amount){
        return amount*1.14;
    }
}
