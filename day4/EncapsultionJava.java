package day4;

public class EncapsultionJava {
    public class Demo {        
        private int age;
        private String name;
        private String address;

        public int  getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getAddress(){
            return address;
        }

        public void setAddress(String address){
            this.address = address;
        }

        public void getDetails(){
            System.out.println("Name: " + name + " age: " + age + " address: " + address);
        }
    }
    public static void main(String[] args) {
        EncapsultionJava outer = new EncapsultionJava();
        Demo demo = outer.new Demo();

        demo.setAge(20);
        demo.setName("John");
        demo.setAddress("USA");

        System.out.println("Name: " + demo.getName());
        System.out.println("Age: " + demo.getAge());
        System.out.println("Address: " + demo.getAddress());
        demo.getDetails();
        

    }
    
}
