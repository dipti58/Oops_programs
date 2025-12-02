
public class Child_Priority {
      public void m1(Object o){
        System.out.println("abc");
      }
      public void m1(String s){
        System.out.println("def");
      }
    public static void main(String[] args) {
         Child_Priority  o=new Child_Priority ();
         o.m1(null);                      // parent class give priority to child class first
         o.m1(new Object());
         o.m1(new String());
    }
}
