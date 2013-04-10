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
 * clickAndWaitの実行<br>
 * clickAndWait [id] [] : リンクやボタンをクリックして，画面遷移を待つ
 * @author nobutnk
 *
 */
public class ClickAndWaitCommandExecutorImpl extends AbstractCommandExecutor {

    /**
     * clickAndWait [id] [] : リンクやボタンをクリックして，画面遷移を待つ
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
        
        long waitTime = DEFAULT_WAIT_MILLSECONDS;
        if (selenese.getValue().getValue() != null) {
            waitTime = Long.valueOf(selenese.getValue().getValue()).longValue();
        }
        sleep(waitTime);
    }
    
}
