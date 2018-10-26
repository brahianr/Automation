package com.newtours.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.newtours.test.NewtoursLogin;
import com.newtours.test.NewtoursRegisterTravel;
import com.newtours.test.NewtoursRegisterUser;

@RunWith(Suite.class)
@SuiteClasses({ NewtoursLogin.class, NewtoursRegisterUser.class, NewtoursRegisterTravel.class })
public class AllTests {

}
