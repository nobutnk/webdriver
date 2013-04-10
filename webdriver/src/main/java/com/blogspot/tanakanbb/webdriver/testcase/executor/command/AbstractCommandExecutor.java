/**
 * 
 */
package com.blogspot.tanakanbb.webdriver.testcase.executor.command;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;

import com.blogspot.tanakanbb.webdriver.testcase.exception.TestCaseExecutorException;
import com.blogspot.tanakanbb.webdriver.testcase.executor.SeleniumCommandExecutor;

/**
 * @author nobutnk
 *
 */
public abstract class AbstractCommandExecutor implements
        SeleniumCommandExecutor {
    
    /**
     * デフォルト待ち時間 10 
     */
    public static final long DEFAULT_WAIT_MILLSECONDS = 10000L;
    
    private String[] searchMethods = {
            "id", "xpath", "linkText", "particalLinkText", "cssSelector", "className", "tagName"};

    public By search(String target) {
        By by = null;
        
        for (String methodName : searchMethods) {
            Method method;
            try {
                method = By.class.getMethod(methodName, new Class[]{ String.class });
            } catch (SecurityException e) {
                throw new TestCaseExecutorException(e);
            } catch (NoSuchMethodException e) {
                throw new TestCaseExecutorException(e);
            }
    
            Object ret; //戻り値
            try {
                ret = method.invoke(By.class, new Object[]{ target });
                if (ret != null) {
                    by = (By) ret;
                    break;
                } else {
                    continue;
                }
            } catch (IllegalArgumentException e) {
                throw new TestCaseExecutorException(e);
            } catch (IllegalAccessException e) {
                throw new TestCaseExecutorException(e);
            } catch (InvocationTargetException e) {
                throw new TestCaseExecutorException(e);
            }
        }
        
        return by;
    }

    /**
     * sleep処理
     *
     * @param millis
     */
    public void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new TestCaseExecutorException(e);
        }
    }

}
