package com.automation.tests.day8;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTestNGTests {
   //runs before every test automatically
   //works as a pre-condition or setup
    @BeforeMethod
    public void test1(){
        System.out.println("Test1");
    }
    @Test

    public void test2(){
        System.out.println("Test2");
        int num1 = 5;
        int num2 = 10;
        //it calls hard assertion;
        //if assertion fails - it stops the execution (due to exception)
        Assert.assertTrue(num1 < num2);

    }
}