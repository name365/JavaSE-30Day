package github;

import java.util.ArrayList;
import java.util.List;

/**
 * @author subei
 * @create 2020-05-14 16:04
 */
public class SubOrder extends OrderTest<Integer>{   //SubOrder:不是泛型类
    public static <E> List<E> copyFromArrayToList(E[] arr){

        ArrayList<E> list = new ArrayList<>();

        for(E e : arr){
            list.add(e);
        }
        return list;

    }
}
