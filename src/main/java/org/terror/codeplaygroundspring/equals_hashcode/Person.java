package org.terror.codeplaygroundspring.equals_hashcode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@Value
@AllArgsConstructor
public class Person {
    @Getter PersonId id;
    @Getter String name;

    @Value
    public static class PersonId {
        Long value;
    }
}

