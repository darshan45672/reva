package day3;

public class oops {

    public class chotaOops {
        public void print(){
            System.out.println("I am a chota oops");
        }        
    } 

    public static void main(String[] args) {
        oops obj = new oops();
        chotaOops obj2 = obj.new chotaOops();
        obj2.print();
    }
}