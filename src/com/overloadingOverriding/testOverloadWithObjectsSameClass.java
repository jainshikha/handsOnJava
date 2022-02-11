package com.overloadingOverriding;

// Ambiguous method call
public class testOverloadWithObjectsSameClass {
  public static void main(String[] args) {
    testOverloadWithObjectsSameClass x = new testOverloadWithObjectsSameClass();
    // uncomment to check the error
    // x.overCheck(null, new Object());
  }

  void overCheck(Integer a, Object b) {
    System.out.println("over check Object");
  }

  void overCheck(String a, Object b) {
    System.out.println("over check Sting ");
  }
}
