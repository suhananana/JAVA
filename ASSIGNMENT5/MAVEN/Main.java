public class Main
{
    public static void main(String[] args) {
        User user = new User("123");
        try {
            Validator.validate(user);
            System.out.println("Validation Passed!");
        } catch (Exception e) {
            System.out.println("Validation Failed: " + e.getMessage());
        }
    }
}