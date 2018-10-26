package com.sophos.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.sophos.newtour.test.verifyNewtoursLogin;
import com.sophos.test.VerifyWordpressLogin;;

@RunWith(Suite.class)
@SuiteClasses({ VerifyWordpressLogin.class, verifyNewtoursLogin.class })
public class AllTests {

}
