package com.ys.maven;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloMavenTest {

    @Test
    public void m1() {
        HelloMaven hm=new HelloMaven();
        String actual = hm.m1();
        String expected="yangshuai";
        assertEquals(actual,expected);

    }
}