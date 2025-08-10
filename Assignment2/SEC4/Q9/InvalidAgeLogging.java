import java.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class InvalidAgeLogging {

    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public class InvalidAgeLoggingDemo {
        private static final Logger logger = Logger.getLogger("AgeLogger");

        static {
            try {

                FileHandler fileHandler = new FileHandler("error.log", true);
                fileHandler.setFormatter(new SimpleFormatter());
                logger.addHandler(fileHandler);
            }
            catch (IOException e) {
                System.out.println("Logging setup failed: " + e.getMessage());
            }
        }

        static void checkAge(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above to register.");
            }
            else {
                System.out.println("Registration successful!");
            }
        }

        public static void main(String[] args) {
            int age = 15;

            try {
                checkAge(age);
            }
            catch (InvalidAgeException e) {
                System.out.println("Caught Exception: " + e.getMessage());
                logger.severe(e.getMessage());
            }

            System.out.println("Check error.log file for logged details.");
        }
    }
}
