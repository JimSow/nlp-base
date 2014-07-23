package zx.soft.nlp.base.splitWord;

import org.junit.Test;

import zx.soft.nlp.base.tire.SmartGetWord;
import zx.soft.nlp.base.tire.domain.SmartForest;
import zx.soft.nlp.base.util.StringUtil;

/**
 * Created by ansj on 3/30/14.
 */
public class SmartGetWordTest {

	@Test
	public void test(){
		/**
		 * 词典的构造.一行一个词后面是参数.可以从文件读取.可以是read流.
		 */
		long start = System.currentTimeMillis();
		SmartForest<Integer> forest = new SmartForest<Integer>();

		forest.add("中国", 3);

		forest.add("android", 3);

		forest.add("java", 3);

		forest.add("中国人", 3);

		String content = " Android-java-中国人";
		content = StringUtil.rmHtmlTag(content);

		for (int i = 0; i < 1; i++) {
			SmartGetWord<Integer> udg = forest.getWord(content.toLowerCase().toCharArray());

			String temp = null;
			while ((temp = udg.getFrontWords()) != null) {
				System.out.println(temp + "\t" + udg.getParam());
			}
		}
		System.out.println(System.currentTimeMillis() - start);
	}

}
