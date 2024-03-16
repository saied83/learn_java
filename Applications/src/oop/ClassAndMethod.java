package oop;

class Person extends Human{
    String name;
    int age;

    void print() {
        System.out.println("Hello " + name + "\nYour Age is: " + age);
    }

    int getAge(){
        return age;
    }
}

public class ClassAndMethod {
    public  static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Md. Saiedur Rahman Saied";
        person1.age = 22;
        // person1.print();
        System.out.println("Hello " + person1.name + "\nYour Age is: " + person1.getAge());
        person1.setSpecies("Human");

    }
}
