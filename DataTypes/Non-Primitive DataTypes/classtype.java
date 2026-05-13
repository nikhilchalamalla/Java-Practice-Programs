// package Non-Primitive DataTypes;

class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class classtype {
   public static void main(String[] args) {
        Student s = new Student();
        s.name = "Nikhil";
        s.age = 20;
        s.display();
   } 
}
