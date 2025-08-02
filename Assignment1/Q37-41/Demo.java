 //Static vs Non-Static Methods
class Demo {

     static int count = 0;

     static void showCount() {
         System.out.println("Static count: " + count);
     }

     void increment() {
         count++;
         System.out.println("Incremented count: " + count);
     }

     public static void main(String[] args) {
         Demo d1 = new Demo();
         d1.increment();

         Demo d2 = new Demo();
         d2.increment();

         Demo.showCount();
     }
}
