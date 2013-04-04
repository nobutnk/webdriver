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
     * テストケースXMLを解析して、{@link TestCase}を返却する
     * @param xmlFile 解析するテストケースXMLファイル
     * @return {@link TestCase}
     */
    TestCase parse(File xmlFile) throws TestCaseException;
}
