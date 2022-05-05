public class TestCasting {
    public static void main(String[] args) {
        A a=new C();
        System.out.println(a);
        B b=(B)a;
        System.out.println(b);
        C c=(C)b;
        System.out.println(c);
        A a1=new B();
        System.out.println(a1);
        B b1=(B)a1;
        C c1=(C)b1;
    }
}
