package org.terror.codeplaygroundspring.testService;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    private final TestRepository testRepository;

    public TestServiceImpl(TestRepositoryImpl testRepositoryImpl) {
        testRepository = testRepositoryImpl;
    }

    @Override
    public void test() {
        testRepository.saveOrder();
    }
}
