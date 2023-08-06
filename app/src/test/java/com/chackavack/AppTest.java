/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.chackavack;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test public void appSetUserNameCorrectly(){
        App classUnderTest = new App();
        String userName = "Ali";
        classUnderTest.setUserName(userName);
        assertEquals(classUnderTest.userName,userName);
    }
    @Test public void appHelloToUser() {
        App classUnderTest = new App();
        String userName = "Ali";
        classUnderTest.setUserName(userName);
        assertEquals(classUnderTest.helloToUser(),"Hello "+userName+"!");
    }
}
