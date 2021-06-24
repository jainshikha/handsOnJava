package com.overloadingOverriding;

//String one calls
public class testOverloadWithObjectSubClass {
    public static void main(String[] args) {
        testOverloadWithObjectSubClass x = new testOverloadWithObjectSubClass();
        x.overRideCheck(null, new Object());
    }

    void overRideCheck(Object a, Object b) {
        System.out.println("over ride check Object");
    }

    void overRideCheck(String a, Object b) {
        System.out.println("over ride check Sting ");
    }
}
