package com.yibaijin.service.boot.web.controller;

import com.yibaijin.service.boot.web.ServiceBootWebApplicationTests;
import com.yibaijin.service.boot.web.dto.TestRequest;
import com.yibaijin.service.boot.web.dto.TestResponse;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;

public class ExampleTest extends ServiceBootWebApplicationTests {
    @Resource
    Example example;

    @Test
    public void a() {
        TestRequest t = new TestRequest();
        TestResponse r = example.a(t, null);
        assertEquals(r.getStr(), "aaaa");
    }

    @Test
    public void b() {
    }
}