/**
 * 
 */
package com.blogspot.tanakanbb.webdriver.testcase.format;

import java.io.File;

import com.blogspot.tanakanbb.webdriver.testcase.TestCaseException;
import com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo.TestCase;

/**
 * @author nobutnk
 *
 */
public interface TestCaseParser {

    /**
     * �e�X�g�P�[�XXML����͂��āA{@link TestCase}��ԋp����
     * @param xmlFile ��͂���e�X�g�P�[�XXML�t�@�C��
     * @return {@link TestCase}
     */
    TestCase parse(File xmlFile) throws TestCaseException;
}
