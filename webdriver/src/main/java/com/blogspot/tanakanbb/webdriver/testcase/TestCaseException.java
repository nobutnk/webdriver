/**
 * 
 */
package com.blogspot.tanakanbb.webdriver.testcase;

/**
 * @author nobutnk
 *
 */
public class TestCaseException extends Exception {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -2326524673239536470L;

    public TestCaseException(Throwable t) {
        super(t);
    }
    
    public TestCaseException(String message, Throwable t) {
        super(message, t);
    }
}
