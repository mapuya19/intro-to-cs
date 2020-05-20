public class A {
    public static void func(A obj) {
        if(obj instanceof B) {
            B b = (B) obj;
            b.bFunc(10);
        } else if(obj instanceof C) {
            C c = (C) obj;
            c.cFunc(10);
        }
    }

    public static void main(String[] args) {
        A obj;

        obj = new A();
        obj.func(10);
        System.out.println("1 " + obj);
        func(obj);
        System.out.println("2 " + obj);

        obj = new B();
        obj.func(3);
        System.out.println("3 "+obj);
        func(obj);
        System.out.println("4 "+obj);

        obj = new C();
        obj.func(4);
        System.out.println("5 "+obj);
        func(obj);
        System.out.println("6 "+obj);
    }

    protected int x;

    public void func(int x) {
        this.x =x;
    }

    public A() {
        x = 0;
    }

    public String toString() {
        return "x="+x;
    }
}