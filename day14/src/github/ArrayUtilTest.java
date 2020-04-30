package github;
/**
  * @Description 测试类
  * @author subei Email:subei@163.com
  * @version
  * @date 2020年4月19日下午3:17:48
  *
 */
public class ArrayUtilTest {

	public static void main(String[] args) {
//		ArrayUtil util = new ArrayUtil();
		int[] arr = new int[]{32,5,26,74,0,96,14,-98,25};
		int max = ArrayUtil.getMax(arr);
		System.out.println("最大值为:" + max);
		
		System.out.print("排序前:");
		ArrayUtil.print(arr);
		
		ArrayUtil.sort(arr);
		System.out.print("排序后:");
		ArrayUtil.print(arr);
		
//		System.out.println("查找:");
//		int index = util.getIndex(arr, 5);
//		if(index > 0){
//			System.out.println("找到了，索引地址:" + index);
//		}else{
//			System.out.println("没找到");
//		}
	}
}
