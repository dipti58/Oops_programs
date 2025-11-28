// 3)Hierarchical Inheritance
public class Hierar {
    public void m1(){
        System.out.println("abc");
    }
}
class A extends Hierar{
    public void m2(){
        System.out.println("def");
    }
}
class B extends Hierar{
    public void m3(){
       System.out.println("ghi");
    } 
}
class Test{
    public static void main(String[] args) {
        Hierar a1=new Hierar();
        a1.m1();
        A a2=new A();
        a2.m1();
        a2.m2();
        B a3=new B();
        a3.m1();
        a3.m3();
    }
}
