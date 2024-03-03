package Polymorphismpkg;

public class HDFC extends Bank{

    @Override
    Integer depositMoney(){
        System.out.println("to get hdfc deposit money");
        return 100;
    }
}
