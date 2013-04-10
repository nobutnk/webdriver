/**
 * 
 */
package com.blogspot.tanakanbb.webdriver.testcase.exception;

/**
 * Seleniumコマンド実行時例外
 * @author nobutnk
 * @version $Revision$
 */
public class TestCaseExecutorException extends RuntimeException {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -1620865753071709578L;

    /**
     * コンストラクタ
     * @param t 起因例外
     */
    public TestCaseExecutorException(Throwable t) {
        super(t);
    }
    
    /**
     * コンストラクタ
     * @param message 例外メッセージ
     * @param t 起因例外
     */
    public TestCaseExecutorException(String message, Throwable t) {
        super(message, t);
    }
    
    /**
     * コンストラクタ
     * @param message 例外メッセージ
     */
    public TestCaseExecutorException(String message) {
        super(message);
    }
}
