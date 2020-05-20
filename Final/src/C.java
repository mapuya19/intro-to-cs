public class C extends B {
    public C(){ }

    public void func(int x) {
        this.x = -x;
    }

    public void cFunc(int x) {
        this.x = 100 * x;
    }
}