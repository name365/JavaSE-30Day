package github2;

import org.junit.Test;

import java.util.List;

/**
 * @author subei
 * @create 2020-05-14 18:49
 */
public class DAOTest {

    @Test
    public void test(){
        CustomerDAO dao1 = new CustomerDAO();

        dao1.add(new Customer());
        List<Customer> list = dao1.getForList(10);


        StudentDAO dao2 = new StudentDAO();
        Student student = dao2.getIndex(1);
    }

}
