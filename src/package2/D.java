package package2;

/*
    @author DanujaV
    @created 9/11/23 - 12:11 PM   
*/

import package1.A;

public class D extends A {
    public void test() {
        D d1 = new D();
        d1.a = 10;
        d1.b = 20;
        d1.c = 30;
        d1.d = 40;

        d1.methodA();
        d1.methodB();
        d1.methodC();
        d1.methodD();
    }
}
