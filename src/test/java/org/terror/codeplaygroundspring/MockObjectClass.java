package org.terror.codeplaygroundspring;

public class MockObjectClass {
    public void mockMethodA() {
        System.out.println("mockMethodA");
    }

    public void mockMethodB() {
        System.out.println("mockMethodB");
    }
}

class MockObjectChildClass {
    MockObjectClass mockClass;
    public MockObjectChildClass(MockObjectClass mockObjectClass) {
        this.mockClass = mockObjectClass;
    }
    public void mockMethod() {
        mockClass.mockMethodA();
        mockClass.mockMethodB();
    }
}