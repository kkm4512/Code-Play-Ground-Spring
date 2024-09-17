package org.terror.codeplaygroundspring.equals_hashcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    @DisplayName("equlas,hashcode 오버라이딩후, 서로 비교하기")
    void test1(){
        // Given - 동일한 식별자값을 비교하기 위한 상황준비
        Person.PersonId p1 = new Person.PersonId(1L);
        Person.PersonId p2 = new Person.PersonId(1L);
        Person person1 = new Person(p1,"test1");
        Person person2 = new Person(p2,"test");

        // When - 둘의 동등함을 비교 시도
        System.out.println("person1.equals(person2) = " + person1.equals(person2));

        // Then - 서로가 동등함으로써, true가 나와야함
        Assertions.assertTrue((person1.equals(person2)));
    }

}