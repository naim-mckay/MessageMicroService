package com.naim.uuidservice.service;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class UuidServiceTest {

    UuidService service = new UuidServiceImpl();

    @Test
    public void test_generateId()throws Exception{
        String res = service.generateId();
        assertNotNull(res);
    }
}
