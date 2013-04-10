/**
 * 
 */
package com.blogspot.tanakanbb.webdriver.testcase.executor.command;

import org.openqa.selenium.WebDriver;

import com.blogspot.tanakanbb.webdriver.testcase.exception.TestCaseExecutorException;
import com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo.SeleniumSelenese;

/**
 * �R�}���hopen�̎��s<br>
 * open [url] [] : url���J��
 * @author nobutnk
 *
 */
public class OpenCommandExecutorImpl extends AbstractCommandExecutor {

    /**
     * �R�}���h�� 'open'
     */
    private static final String COMMAND = "open";
    
    /**
     * open [url] [] : url���J��
     * 
     * @param selenese �R�}���h�ꎮ. target���K�{
     * @param webDriver �h���C�o
     * @throws TestCaseExecutorException �R�}���h���s��O
     */
    @Override
    public void execute(SeleniumSelenese selenese, WebDriver webDriver)
            throws TestCaseExecutorException {
        if (selenese == null || COMMAND.equals(selenese.getCommand().getValue())) {
            throw new TestCaseExecutorException(
                    "command must be 'open', but actual [" + selenese.getCommand().getValue() + "]");
        }
        webDriver.get(selenese.getTarget().getValue());
    }

}
