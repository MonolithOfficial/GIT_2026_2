package ge.tbc.testautomation;

public class Main {
    public static void main(String[] args) {
        System.out.println("I AM THE MAIN FUNCTION");
        int number = someIntegerFunction();
    }

    private static void someNewFunction(){
        System.out.println("I DO SOMETHING NEW");
    }

    private static int someIntegerFunction(){
        return 1;
    }
}
