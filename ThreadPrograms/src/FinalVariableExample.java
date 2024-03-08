public class FinalVariableExample {


    final int finalVariable = 10;

    public static void main(String[] args) {

        FinalVariableExample obj = new FinalVariableExample();


        System.out.println("Final Variable: " + obj.finalVariable);


        // This will cause a compile-time error as we cannot change the  value of final variable
//         obj.finalVariable = 20;


        System.out.println("Final Variable remains constant: " + obj.finalVariable);
    }
}
