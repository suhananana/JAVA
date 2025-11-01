import java.lang.reflect.Field;

public class Validator
{
    public static void validate(Object obj) throws Exception {
        for (Field f : obj.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(MinLength.class)) {
                f.setAccessible(true);
                String value = (String) f.get(obj);
                int min = f.getAnnotation(MinLength.class).value();
                if (value.length() < min) {
                    throw new Exception(f.getName() + " must be at least " + min + " characters long");
                }
            }
        }
    }
}