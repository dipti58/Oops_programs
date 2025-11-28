
// 2)multilevel inheritance
public class AB {
    public void m1(){
        System.out.println("abc");
    }
}
class BC extends AB{
    public void m2(){
        System.out.println("def");
    }
}
class CD extends BC{
    public void m3(){
        System.out.println("ghi");
    }
}
 class C {
    public static void main(String[] args) {
        AB t1=new AB();
        t1.m1();
        BC t2=new BC();
        t2.m1();
        t2.m2();
        CD t3=new CD();
        t3.m1();
        t3.m2();
        t3.m3();
    }

    
}
