package org.terror.codeplaygroundspring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

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
