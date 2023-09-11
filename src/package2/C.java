package package2;

import package1.A;

public class C {
    public void test() {


        new E();

        A a1 = new A();

        /*a1.a = 10;  //Illegal
        a1.b = 20;  //Illegal
        a1.c = 30;  //Illegal*/
        a1.d = 40;

      /*  a1.methodA();   //Illegal
        a1.methodB();   //Illegal
        a1.methodC();   //Illegal*/
        a1.methodD();
    }
}
