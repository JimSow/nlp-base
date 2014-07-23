package zx.soft.nlp.base.util;

import org.junit.Test;

import zx.soft.nlp.base.util.StringUtil;

public class StringUtilTest {

	@Test
	public void test() {
		//顺路介绍下 字符串是否为空的判断
		System.out.println(StringUtil.isBlank(" \t")); // result --> true
		
		//html清理
		System.out.println(StringUtil.rmHtmlTag("<a>hello ansj</a>")); //result -->hello ansj
		
		 //将用都好隔开的字符转换为sql中的in查询
		System.out.println(StringUtil.makeSqlInString("ansj,2134,123,123,123"));
		//result --> 'ansj','2134','123','123','123'
	}

}
