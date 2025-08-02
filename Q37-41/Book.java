// Program: Copy Constructor in Java
class Book {
    String title;
    int pages;


    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    Book(Book b) {
        this.title = b.title;
        this.pages = b.pages;
    }

    void display() {
        System.out.println("Title: " + title + ", Pages: " + pages);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", 300);
        Book b2 = new Book(b1); // using copy constructor

        b1.display();
        b2.display();
    }

}
