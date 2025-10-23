package lesson8;

public class B  extends A {

    int k;
    ;

    public B(int i, int j) {
        super(i, j);
        this.k = k;

    }



    public void meth() {
        int i = 10;
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(super.i);
    }
    public B() {}


    public void sampleMethod() {
       System.out.println("Hello from B");

    }
}



