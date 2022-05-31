package com.aptech.hello_t2010a.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test

    public void TestCreateStudent() {
        Student obj = Student.builder()
                .rollNumber("A001")
                .fulllName("Pham Thi Hoai An")
                .address("Hanoi")
                .phone("0523681699")
                .email("hoaian0410")
                .status(1)
                .build();

    }
}