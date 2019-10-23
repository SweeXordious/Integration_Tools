

public class hello {
    public static void main(String[] args){
        System.out.println("Hello");
    }

    class A {
        private String Test="";

        public A() {

        }

        public void dummy(int nb){
            nb = 10;
            if (nb ==0) {
                System.out.println("This is a Zero");
            }
        }

        public int another_Dummy(int nb) {
            nb = 10;
            if (nb ==0) {
                System.out.println("This is a Zero");
            }
            return 15;
        }
    }
}
