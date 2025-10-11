class Student {
    int id;
    String name;
    String course;

    // Constructor Overloading
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.course = "Not Assigned";
    }

    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Course: " + course);
    }
}

class GraduateStudent extends Student {
    String specialization;

    GraduateStudent(int id, String name, String course, String specialization) {
        super(id, name, course);
        this.specialization = specialization;
    }

    // Method overriding
    @Override
    void display() {
        System.out.println("Graduate Student - ID: " + id + ", Name: " + name +
                ", Course: " + course + ", Specialization: " + specialization);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Suhana", "B.Tech");
        GraduateStudent g1 = new GraduateStudent(2, "Dikhsha", "M.Tech", "AI");
        s1.display();
        g1.display();
    }
}
