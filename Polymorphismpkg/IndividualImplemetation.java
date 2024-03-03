package Polymorphismpkg;

public class IndividualImplemetation {
    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        System.out.println("hdfc deposit money: "+ hdfc.depositMoney());

        Axis axis = new Axis();
        System.out.println("axis deposit money: "+ axis.depositMoney());
    }
}
