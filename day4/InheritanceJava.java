package day4;

public class InheritanceJava {

    public class Animal {
        public void sleep() {
            System.out.println("Animals are sleeping");
        }
    }

    public class Dog extends Animal {
        public void bark() {
            System.out.println("Dogs are barking");
        }
    }

    public static void main(String[] args) {
        InheritanceJava inheritanceJava = new InheritanceJava();
        Dog dog = inheritanceJava.new Dog();
        dog.sleep();
        dog.bark();
    }
    
}
