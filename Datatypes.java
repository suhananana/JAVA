public class Datatypes {

        byte byteVar;
        short shortVar;
        int intVar;
        long longVar;
        float floatVar;
        double doubleVar;
        char charVar;
        boolean booleanVar;

        public static void main(String[] args) {
            Datatypes obj = new Datatypes();
            System.out.println("byte: " + obj.byteVar);
            System.out.println("short: " + obj.shortVar);
            System.out.println("int: " + obj.intVar);
            System.out.println("long: " + obj.longVar);
            System.out.println("float: " + obj.floatVar);
            System.out.println("double: " + obj.doubleVar);
            System.out.println("char: '" + obj.charVar + "'");
            System.out.println("boolean: " + obj.booleanVar);
    }

}
