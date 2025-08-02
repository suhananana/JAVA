//Program: Constructor Overloading
class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String name) {
        this.name = name;
        this.age = 18;
    }

    // Another constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Aman");
        Student s3 = new Student("Neha", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}

