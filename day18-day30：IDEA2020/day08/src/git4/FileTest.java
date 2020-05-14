package git4;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * 1. 利用File构造器，new一个文件目录file
 *    1)在其中创建多个文件和目录
 *    2)编写方法，实现删除file中指定文件的操作
 *
 * @author subei
 * @create 2020-05-14 22:42
 */
public class FileTest {
    @Test
    public void test() throws IOException {
        File file = new File("D:\\io\\io1\\hello.txt");
        //创建一个与file同目录下的另外一个文件，文件名为：haha.txt
        File destFile = new File(file.getParent(),"haha.txt");
        boolean newFile = destFile.createNewFile();
        if(newFile){
            System.out.println("创建成功！");
        }
    }
}
