/**
 * 
 */
package com.blogspot.tanakanbb.webdriver.testcase.executor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo.SeleniumCommand;
import com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo.SeleniumSelenese;
import com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo.SeleniumTarget;
import com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo.SeleniumTestCase;
import com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo.SeleniumValue;

/**
 * @author nobutnk
 *
 */
public class SimpleTestCaseExecutorImpl implements TestCaseExecutor {

    /* (non-Javadoc)
     * @see com.blogspot.tanakanbb.webdriver.testcase.executor.TestCaseExecutor#execute(com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo.SeleniumTestCase)
     */
    @Override
    public void execute(SeleniumTestCase testCase) {
        WebDriver webDriver = new FirefoxDriver();
        
        for (SeleniumSelenese selenese : testCase.getSelenese()) {
            SeleniumCommand command = selenese.getCommand();
            SeleniumTarget target = selenese.getTarget();
            SeleniumValue value = selenese.getValue();
            
            // command
            
        }

    }

}
