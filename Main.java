package ro.mirodone;

public class Main {

    public static void main(String[] args) {


        NotFiveS n5 = new NotFiveS();

        System.out.println(n5.dontGiveMeFive(-16, -4));
        System.out.println(n5.dontGiveMeFive(49, 55));
        System.out.println(n5.dontGiveMeFive(1, 90));

        Not5Clever clever = new Not5Clever();
        System.out.println(clever.dontGiveMeFive(-16, -4));
        System.out.println(clever.dontGiveMeFive(1, 90));


    }
}


