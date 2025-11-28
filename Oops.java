// 1)Single inheritance
public class Oops {
       public void m1()
       {
        System.out.println("abc");
       }
      }
    class A extends Oops{
        public void m2()
        {
            System.out.println("def");
        }
    }
    class Test{
    public static void main(String[] args) {
      Oops o=new Oops();
      o.m1();

      A a1=new A();
      a1.m1();
      a1.m2();
     }
    }
