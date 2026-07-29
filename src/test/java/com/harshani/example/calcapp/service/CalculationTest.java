package com.harshani.example.calcapp.service;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculationTest {
    
    Calculation calc;
    Logger logger = LoggerFactory.getLogger(Calculation.class);
    
    @BeforeEach
    public void setUp(){
        logger.info("Setup-Initialized and service instantiated");
        calc = new Calculation();
    }
    
    @Test
    public void testAdd(){
        Assertions.assertNotNull(calc, "Service object is null");
        Assertions.assertEquals(9, calc.add(4,5));
    }
    
    @Test
    public void testSub(){
        Assertions.assertNotNull(calc, "Service object is null");
        Assertions.assertEquals(5, calc.sub(9,4));
    }

    @Test
    public void testMul(){
        Assertions.assertNotNull(calc, "Service object is null");
        Assertions.assertEquals(36, calc.mul(9,4));
    }

    @Test
    public void testDiv(){
        Assertions.assertNotNull(calc, "Service object is null");
        Assertions.assertEquals(9, calc.div(81,9));
    }

    @AfterEach
    public void tearDown(){
        calc = null;
        logger.info("Teardown initiated and service instance destroyed");
    }
}
