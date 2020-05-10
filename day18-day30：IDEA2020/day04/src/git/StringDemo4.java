package git;

import org.junit.Test;
import java.util.Arrays;

/**
 *
 * 5.对字符串中字符进行自然顺序排序。"abcwerthelloyuiodef"
 * 提示：
 * 		1）字符串变成字符数组。
 * 		2）对数组排序，选择，冒泡，Arrays.sort(str.toCharArray());
 * 		3）将排序后的数组变成字符串。
 *
 */

public class StringDemo4 {

	// 第5题
	@Test
	public void testSort() {
		String str = "abcwerthelloyuiodef";
		char[] arr = str.toCharArray();
		Arrays.sort(arr);

		String newStr = new String(arr);
		System.out.println(newStr);
	}
}
