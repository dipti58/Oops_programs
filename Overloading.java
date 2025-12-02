class Overloading{
    public void  m1(int x){
        System.out.println("abc");
    }
    public void m2(float y){
        System.out.println("def");
    }
    public static void main(String[] args) {
        Overloading a1=new Overloading();
        a1.m1(10);
        a1.m2(1.5f);
    }
}