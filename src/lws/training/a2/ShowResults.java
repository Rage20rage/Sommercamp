package lws.training.a2;

public class ShowResults {

    public static void gebeaus() {
        System.out.println("Boolean: " + StoreVariables.bo);
        System.out.println("byte: " + StoreVariables.by);
        System.out.println("char: " + StoreVariables.ch);
        System.out.println("short: " + StoreVariables.sh);
        System.out.println("integer" + StoreVariables.in);
        System.out.println("long: " + StoreVariables.lo);
        System.out.println("float: " + StoreVariables.fl);
        System.out.println("double: " + StoreVariables.dou);

        System.out.println("plus: " + ExampleCalculation.plus);
        System.out.println("minus: " + ExampleCalculation.minus);
        System.out.println("mal: " + ExampleCalculation.mal);
        System.out.println("geteilt: " + ExampleCalculation.geteilt);
    }

}
