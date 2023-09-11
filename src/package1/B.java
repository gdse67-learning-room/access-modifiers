package package1;

import package2.E;

public class B {
    public void test() {

        new E();

        A a1 = new A();

//        a1.a = 10;  //Illegal
        a1.b = 20;
        a1.c = 30;
        a1.d = 40;

//        a1.methodA();   //Illegal
        a1.methodB();   //Legal
        a1.methodC();   //?
        a1.methodD();   //?
    }
}
