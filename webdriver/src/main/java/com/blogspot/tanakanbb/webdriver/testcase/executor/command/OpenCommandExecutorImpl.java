/**
 * 
 */
package com.blogspot.tanakanbb.webdriver.testcase.executor.command;

import org.openqa.selenium.WebDriver;

import com.blogspot.tanakanbb.webdriver.testcase.exception.TestCaseExecutorException;
import com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo.SeleniumSelenese;

/**
 * コマンドopenの実行<br>
 * open [url] [] : urlを開く
 * @author nobutnk
 *
 */
public class OpenCommandExecutorImpl extends AbstractCommandExecutor {

    /**
     * コマンド名 'open'
     */
    private static final String COMMAND = "open";
    
    /**
     * open [url] [] : urlを開く
     * 
     * @param selenese コマンド一式. targetが必須
     * @param webDriver ドライバ
     * @throws TestCaseExecutorException コマンド実行例外
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
