package ge.tbc.testautomation;

public class Main {
    public static void main(String[] args) {
        System.out.println("I AM THE MAIN FUNCTION");
        String result = someNewFunction("MESSAGE");
    }

    private static String someNewFunction(String message){
        return message;
    }
}
