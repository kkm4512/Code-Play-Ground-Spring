package org.terror.codeplaygroundspring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

interface StringTest {
    int countTest(String test);
}

class MockingTest {
    String mockingTestMethod(){
        return "쉿 모킹 테스트중...!";
    }
}

class ExampleClass {
    public void methodA() {
        // 동작 A
    }

    public void methodB() {
        // 동작 B
    }
}


public class MockitoTest {

    @Test
    @DisplayName("기본 요소를 테스트 합니다")
    void test(){
        // 1. 모의 객체 생성
        List<String> mockList = Mockito.mock(List.class);

        // 2. 호출 예상 동작 설정
        Mockito.when(mockList.size()).thenReturn(5);
        System.out.println("동작 값을 확인 합니다 :: " + mockList.size());   // 동작 값을 확인 합니다 :: 5

        // 3. 메서드 호출 검증
        Mockito.verify(mockList).size();
    }

    @Test
    @DisplayName("문자열 갯수 세기")
    void test2(){
        // 1. Mock 객체 생성
        StringTest stringTest = Mockito.mock(StringTest.class);


        // 2. Stub 정의
        Mockito.when(stringTest.countTest("test")).thenReturn(4);
        System.out.println(stringTest.countTest("test"));

        // 3. 검증
        Mockito.verify(stringTest, Mockito.times(1)).countTest("test");

    }

    @Test
    @DisplayName("Mock 테스트")
    void test3(){
        // Mock
        List mockList = Mockito.mock(List.class);

        // Stub
        Mockito.when(mockList.size()).thenReturn(5);
        int size = mockList.size();

        // 결과 확인
        System.out.println(size);
    }

    @Test
    @DisplayName("Stub 테스트")
    void test4(){
        // Mock
        List mockList = Mockito.mock(List.class);

        // Stub
        Mockito.when(mockList.size()).thenReturn(5);
        int size = mockList.size();

        // 결과 확인
        Assertions.assertEquals(5, size);
    }

    @Test
    @DisplayName("Spy 테스트")
    void test5(){
        // 실제 객체 생성
        List<String> originalList = new ArrayList<>();

        // Spy 객체 생성 : Spy - 실제 객체의 원본을 유지하며 객체를 생성합니다.
        List<String> spyList = Mockito.spy(originalList);

        // Spy 객체의 메서드 동작 정의 : Spy - 이러한 객체에 값을 지정합니다.
        Mockito.doReturn("Mocked").when(spyList).get(0);

        // Spy 객체 사용
        String element = spyList.get(0); // "Mocked"를 반환
        System.out.println("element = " + element);
    }

    @Test
    @DisplayName("Mocking 테스트")
    void test6(){
        // Mock
        MockingTest mockingTest = Mockito.mock(MockingTest.class);

        // Stub
        Mockito.when(mockingTest.mockingTestMethod()).thenReturn("내가 바꾼 테스트 모킹중 !");
        String test = mockingTest.mockingTestMethod();
        System.out.println("test = " + test);

        Mockito.verify(mockingTest, Mockito.times(1)).mockingTestMethod();
    }

    @Test
    @DisplayName("Verification 테스트")
    void test7(){
        // Mock
        ExampleClass exampleClass = Mockito.mock(ExampleClass.class);

        exampleClass.methodA();
        exampleClass.methodB();

        Mockito.verify(exampleClass).methodA();
        Mockito.verify(exampleClass).methodB();

        InOrder order = Mockito.inOrder(exampleClass);
        order.verify(exampleClass).methodB();
        order.verify(exampleClass).methodA();
    }

    @Test
    @DisplayName("Mockito 메서드를 활용한 간단한 예제")
    void test8(){
        // Mocking
        List mockList = Mockito.mock(List.class);

        // Stub
        Mockito.doReturn(5).when(mockList).size();
        System.out.println(mockList.size());

        // 추가적인 상호작용 검증
        Mockito.verifyNoMoreInteractions(mockList);

        // Verify
        Mockito.verify(mockList).size();
    }

    @Test
    @DisplayName("Given-When-Then")
    void test9(){
        // given
        MockObjectClass mockObjectClass = Mockito.mock(MockObjectClass.class);
        Mockito.doNothing().when(mockObjectClass).mockMethodA();

        // when
        mockObjectClass.mockMethodA();

        // then
        Mockito.verify(mockObjectClass).mockMethodA();
    }

}


