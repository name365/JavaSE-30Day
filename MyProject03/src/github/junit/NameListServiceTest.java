package github.junit;

import org.junit.Test;
import github.domain.Employee;
import github.service.NameListService;
import github.service.TeamException;
/**
  * 
  * @Description 对NameListService类的测试
  * @author subei Email:subei@163.com
  * @version
  * @date 2020年5月6日下午8:37:51
  *
 */
public class NameListServiceTest {

	@Test
	public void testGetAllEmployees(){
		NameListService service = new NameListService();
		Employee[] employees = service.getAllEmployees();
		for(int i = 0;i < employees.length;i++){
			System.out.println(employees[i]);
		}
	}
	
	@Test
	public void testGetEmployee(){
		int id = 101;
		NameListService listService = new NameListService();
		try {
			Employee emp = listService.getEmployee(id);
			System.out.println(emp);
		} catch (TeamException e) {
			System.out.println(e.getMessage());
		}
	}
}
