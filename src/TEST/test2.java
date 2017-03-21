package TEST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author fufu
 * @Time 2017-3-17 上午05:53:46
 * @Version 1.0
 * <p>Description:</p>
 */
public class test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  System.out.println("use Collections.reverse() method");

		    String[] strings = { "ramer", "jelly", "bean", "cake" };
		    System.out.println("\t" + Arrays.toString(strings));
		    // 这种方式仅针对引用类型,对于基本类型如:
		    // char[] cs = {'a','b','c','g','d'};
		    // 应该定义或转换成对应的引用类型: 
		    // Character[] cs = {'a','b','c','g','d'};
		    Collections.reverse(Arrays.asList(strings));
		    System.out.println("\t" + Arrays.toString(strings));

}
}
 