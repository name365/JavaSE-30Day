package github2;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 一、构造器引用
 *      和方法引用类似，函数式接口的抽象方法的形参列表和构造器的形参列表一致。
 *      抽象方法的返回值类型即为构造器所属的类的类型
 *
 * 二、数组引用
 *     可以把数组看做是一个特殊的类，则写法与构造器引用一致。
 *
 * @author subei
 * @create 2020-05-18 20:08
 */
public class ConstructorRefTest {

    //构造器引用
    //Supplier中的T get()
    //Employee的空参构造器：Employee()
    @Test
    public void test() {
        Supplier<Employee> sup = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };
        System.out.println("+++++++++++++++++++");

        Supplier<Employee> sk1 = () -> new Employee();
        System.out.println(sk1.get());

        System.out.println("+++++++++++++++++++");

        Supplier<Employee> sk2 = Employee::new;
        System.out.println(sk2.get());
    }

    //Function中的R apply(T t)
    @Test
    public void test2() {
        Function<Integer, Employee> f1 = id -> new Employee(id);
        Employee employee = f1.apply(7793);
        System.out.println(employee);

        System.out.println("+++++++++++++++++++");

        Function<Integer, Employee> f2 = Employee::new;
        Employee employee1 = f2.apply(4545);
        System.out.println(employee1);
    }

    //BiFunction中的R apply(T t,U u)
    @Test
    public void test3() {
        BiFunction<Integer, String, Employee> f1 = (id, name) -> new Employee(id, name);
        System.out.println(f1.apply(2513, "Fruk"));

        System.out.println("*******************");

        BiFunction<Integer, String, Employee> f2 = Employee::new;
        System.out.println(f2.apply(9526, "Bon"));
    }

    //数组引用
    //Function中的R apply(T t)
    @Test
    public void test4() {
        Function<Integer, String[]> f1 = length -> new String[length];
        String[] arr1 = f1.apply(7);
        System.out.println(Arrays.toString(arr1));

        System.out.println("+++++++++++++++++++");

        Function<Integer, String[]> f2 = String[]::new;
        String[] arr2 = f2.apply(9);
        System.out.println(Arrays.toString(arr2));
    }
}
