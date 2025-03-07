package day2;
public class DataTypes {
    public static void main(String[] args) {
        // primitive data types
        byte byteVar  = 127;
        short shortVar = 32767;
        long longVar = 234567890L;
        int intVar = 214763;
        float floatVar = 3.2f;
        double doubleVar = 3.14526771;
        char charVar = 'S';
        boolean booleanVar = true;

        System.out.println(byteVar);
        System.out.println(shortVar);
        System.out.println(longVar);
        System.out.println(intVar);
        System.out.println(floatVar);
        System.out.println(doubleVar);
        System.out.println(charVar);
        System.out.println(booleanVar);


        // Wrapper Classs
        Byte byteWrapper = byteVar;
        Short shortWrapper = shortVar;
        Long longWrapper = longVar;
        Integer intWrapper = intVar;
        Float floatWrapper = floatVar;
        Double doubleWrapper = doubleVar;
        Character charWrapper = charVar;
        Boolean booleanWrapper = booleanVar;

        System.out.println(byteWrapper);
        System.out.println(shortWrapper);
        System.out.println(longWrapper);
        System.out.println(intWrapper);
        System.out.println(floatWrapper);
        System.out.println(doubleWrapper);
        System.out.println(charWrapper);
        System.out.println(booleanWrapper);

    }    
}
