package com.overloadingOverriding;

//Ambiguous method call
public class testOverloadWithObjectsSameClass {
    public static void main(String[] args) {
        testOverloadWithObjectsSameClass x = new testOverloadWithObjectsSameClass();
        //uncomment to check the error
        //x.overRideCheck(null, new Object());
    }

    void overRideCheck(Integer a, Object b) {
        System.out.println("over ride check Object");
    }

    void overRideCheck(String a, Object b) {
        System.out.println("over ride check Sting ");
    }
}
