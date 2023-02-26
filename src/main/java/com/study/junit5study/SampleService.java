package com.study.junit5study;

import org.springframework.stereotype.Service;

@Service
public interface SampleService {
    SampleDto getSample(Integer number);
}
