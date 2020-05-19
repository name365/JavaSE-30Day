package github;

import org.junit.Test;

import java.util.Comparator;

/**
 * Lambda表达式的使用举例
 *
 * @author subei
 * @create 2020-05-18 17:33
 */
public class LambdaTest {
    @Test
    public void test(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("长安欢迎您");
            }
        };
        r1.run();

        System.out.println("+++++++++++++++++++++++++|");

        Runnable r2 = () -> System.out.println("长安欢迎您");

        r2.run();
    }

    @Test
    public void test2(){
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        int compare1 = c1.compare(8,16);
        System.out.println(compare1);

        System.out.println("+++++++++++++++++++++++");

        //Lambda表达式的写法
        Comparator<Integer> c2 = (o1,o2) -> Integer.compare(o1,o2);

        int compare2 = c2.compare(28,35);
        System.out.println(compare2);

        System.out.println("+++++++++++++++++++++++++++");
        //方法引用
        Comparator<Integer> c3 = Integer :: compare;

        int compare3 = c3.compare(28,35);
        System.out.println(compare3);
    }
}
