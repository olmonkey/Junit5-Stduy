package com.study.junit5study;

import org.assertj.core.api.BDDAssumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(SampleController.class)
class SampleControllerTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    SampleServiceImpl sampleService;

    // http://localhost:8080/sample/get/{number}
    @Test
    @DisplayName("number 파싱 test")
    void testGetNumber() {
//        BDDMockito.given(sampleService.getSample)
    }
}