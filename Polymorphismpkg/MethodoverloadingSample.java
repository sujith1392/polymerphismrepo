package Polymorphismpkg;

public class MethodoverloadingSample {
    public Integer multiply(int a , int b){
        System.out.println("checking with 2 arguments");
        Integer result = a * b;
        return result;
    }

    public Integer multiply(int a , int b, int c){
        System.out.println("checking with 3 arguments");
        Integer result = a * b * c;
        return result;
    }

    public static void main(String[] args) {

        MethodoverloadingSample obj = new MethodoverloadingSample();
        System.out.println("divide 2 number : "+ obj.multiply(10,2));
        System.out.println("divide 3 number : "+ obj.multiply(5,2,3));

    }
}
