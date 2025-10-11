import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TrackExecution {
    String value() default "Executing Method";
}

class Task {
    @TrackExecution("Start Task")
    public void start() {
        System.out.println("Task started...");
    }

    @TrackExecution("End Task")
    public void end() {
        System.out.println("Task ended...");
    }
}

public class AnnotationDemo {
    public static void main(String[] args) throws Exception {
        Task task = new Task();
        Method[] methods = Task.class.getDeclaredMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(TrackExecution.class)) {
                TrackExecution te = m.getAnnotation(TrackExecution.class);
                System.out.println("Annotation on " + m.getName() + ": " + te.value());
                m.invoke(task);
            }
        }
    }
}
