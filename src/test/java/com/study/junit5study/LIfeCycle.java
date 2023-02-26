package com.study.junit5study;

import org.junit.jupiter.api.*;

/**
 * beforeAll, AfterAll, BeforeEach, AfterEach Annotaion의 라이프 사이클을 알아봄.
 * <p>-all Annotaion은 static이 붙어야 동작한다.
 */
public class LIfeCycle {
    @BeforeAll
    @Test
    static void beforeAll() {
        // BeforeAll annotation -> static 필요
        System.out.println("#### beforeAll 시작 ####");
    }
    @AfterAll
    @Test
    static void afterAll() {
        // AfterAll annotation -> static 필요
        System.out.println("#### afterAll 시작 ####");

    }
    @BeforeEach
    @Test
    void beforeEach() {
        System.out.println("#### beforeEach 시작 ####");

    }
    @AfterEach
    @Test
    void afterEach() {
        System.out.println("#### afterEach 시작 ####");

    }

    @Test
    void testA() {
        System.out.println("#### testA 시작 ####");

    }
    @DisplayName("TestB 테스트 시작합니다.")
    @Test
    void testB() {
        System.out.println("#### testB 시작 ####");

    }
    @DisplayName("TestC 테스트 시작합니다.")
    @Disabled
    @Test
    void testC() {
        System.out.println("#### testC 시작 ####");

    }
}
