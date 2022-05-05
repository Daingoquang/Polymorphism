public class C extends B{
    public C(){
        super();
        System.out.println("Constructor an instance of C");
    }

    @Override
    public String toString() {
        return "This is C";
    }
}
