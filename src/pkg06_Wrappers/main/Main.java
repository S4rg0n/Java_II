package pkg06_Wrappers.main;

public class Main {
    public static void main(String[] args) {

        //autoBoxing:
        Character chWrapped = 'a'; //Boxing
        System.out.println("chWrapped = " + chWrapped);
        System.out.println("chWrapped.getClass() = " + chWrapped.getClass());

        //autoUnboxing;
        char ch = chWrapped;
        System.out.println("ch = " + ch);

        //Boxing:
        int numPrimitivo = 12;
        System.out.println("numPrimitivo = " + numPrimitivo);
        Integer numInteger = Integer.valueOf(numPrimitivo); //Boxing
        System.out.println("numInteger.getClass() = " + numInteger.getClass());
        System.out.println("numInteger.intValue() = " + numInteger.intValue());

        //Unboxing:
        int numPrimitivo2 = numInteger.intValue();
        System.out.println("numPrimitivo2 = " + numPrimitivo2);
    }
}
