/**
 * 
 */
package com.blogspot.tanakanbb.webdriver.testcase.exception;

/**
 * Selenium�R�}���h���s����O
 * @author nobutnk
 * @version $Revision$
 */
public class TestCaseExecutorException extends RuntimeException {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -1620865753071709578L;

    /**
     * �R���X�g���N�^
     * @param t �N����O
     */
    public TestCaseExecutorException(Throwable t) {
        super(t);
    }
    
    /**
     * �R���X�g���N�^
     * @param message ��O���b�Z�[�W
     * @param t �N����O
     */
    public TestCaseExecutorException(String message, Throwable t) {
        super(message, t);
    }
    
    /**
     * �R���X�g���N�^
     * @param message ��O���b�Z�[�W
     */
    public TestCaseExecutorException(String message) {
        super(message);
    }
}
