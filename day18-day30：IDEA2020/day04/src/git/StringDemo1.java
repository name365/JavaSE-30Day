package git;

/**
 * @author subei
 * @create 2020-05-10 11:27
 */
import org.junit.Test;

/*
 * 1.模拟一个trim方法，去除字符串两端的空格。
 *
 */
public class StringDemo1 {

    // 第1题
    public String myTrim(String str) {
        if (str != null) {
            int start = 0;// 用于记录从前往后首次索引位置不是空格的位置的索引
            int end = str.length() - 1;// 用于记录从后往前首次索引位置不是空格的位置的索引

            while (start < end && str.charAt(start) == ' ') {
                start++;
            }

            while (start < end && str.charAt(end) == ' ') {
                end--;
            }
            if (str.charAt(start) == ' ') {
                return "";
            }

            return str.substring(start, end + 1);
        }
        return null;
    }

    @Test
    public void testMyTrim() {
        String str = "   a   ";
        // str = " ";
        String newStr = myTrim(str);
        System.out.println("---" + newStr + "---");
    }
}
