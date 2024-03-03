package Polymorphismpkg;

public class MethodoverridingExtendedSample extends MethodoverridingSample {
    public void display(){
        System.out.println("inside the display method of methodoverriding extended sample");

    }

    public static void main(String[] args) {
        MethodoverridingExtendedSample obj = new MethodoverridingExtendedSample();
        obj.display();
    }
}

