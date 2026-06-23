package ge.tbc.testautomation;

public class Main {
    public static void main(String[] args) {
        System.out.println("I AM THE MAIN FUNCTION");
        boolean booleanValue = someBooleanFunction();
    }

    private static void someNewFunction(){
        System.out.println("I DO SOMETHING NEW");
    }

    private static boolean someBooleanFunction(){
        return true;
    }
}
