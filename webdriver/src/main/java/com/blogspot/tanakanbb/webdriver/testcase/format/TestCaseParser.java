/**
 * 
 */
package com.blogspot.tanakanbb.webdriver.testcase.format;

import java.io.File;

import com.blogspot.tanakanbb.webdriver.testcase.TestCaseException;
import com.blogspot.tanakanbb.webdriver.testcase.format.xml.vo.SeleniumTestCase;

/**
 * @author nobutnk
 *
 */
public interface TestCaseParser {

    /**
     * テストケースXMLを解析して、{@link SeleniumTestCase}を返却する
     * @param xmlFile 解析するテストケースXMLファイル
     * @return {@link SeleniumTestCase}
     */
    SeleniumTestCase parse(File xmlFile) throws TestCaseException;
}
