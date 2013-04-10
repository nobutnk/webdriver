/**
 * 
 */
package com.blogspot.tanakanbb.webdriver.testcase.executor.command;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.blogspot.tanakanbb.webdriver.testcase.exception.TestCaseExecutorException;
import com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo.SeleniumSelenese;

/**
 * clickの実行<br>
 * click [id] [] : リンクやボタンをクリック
 * @author nobutnk
 *
 */
public class ClickCommandExecutorImpl extends AbstractCommandExecutor {

    /**
     * click [id] [] : リンクやボタンをクリック
     * 
     * @param selenese コマンド一式. targetが必須
     * @param webDriver ドライバ
     * @throws TestCaseExecutorException コマンド実行例外
     */
    @Override
    public void execute(SeleniumSelenese selenese, WebDriver webDriver)
            throws TestCaseExecutorException {
        By by = search(selenese.getTarget().getValue());
        WebElement element = webDriver.findElement(by);
        
        element.click();
    }
    
}
