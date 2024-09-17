package org.terror.codeplaygroundspring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

public class MocksTest {
    MockObjectClass mockObjectClass;

    @Mock
    MockObjectChildClass mockObjectChildClass;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("@Mock 테스트")
    void test1(){
        mockObjectChildClass.mockMethod();
    }
}
