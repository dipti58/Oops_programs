public class Override {
    public void m1(){
        System.out.println("abc");
    }
}
 class Child extends Override{
        public void m1(){
            System.out.println("def");
        }

    }
    class Test{
    public static void main(String[] args) {
        Override a1=new Override();
        a1.m1();

        Child a2= new Child();
        a2.m1();

        Override a3=new Child();
        a3.m1();

    } 
    }

