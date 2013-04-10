/**
 * 
 */
package com.blogspot.tanakanbb.webdriver.testcase.executor;

import org.openqa.selenium.WebDriver;

import com.blogspot.tanakanbb.webdriver.testcase.exception.TestCaseExecutorException;
import com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo.SeleniumSelenese;

/**
 * @author nobutnk
 *
 */
public interface SeleniumCommandExecutor {

    /**
     * Seleniumのコマンドを実行する
     * @param selenese コマンド一式
     * @param webDriver ドライバ
     * @throws TestCaseExecutorException コマンド実行例外
     */
    public void execute(SeleniumSelenese selenese, final WebDriver webDriver)
            throws TestCaseExecutorException;
}
