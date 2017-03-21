package TEST;

import java.util.Arrays;

/**
 * @Author fufu
 * @Time 2017-3-17 上午05:23:52
 * @Version 1.0
 * <p>Description:</p>
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("use ReverseSelf");

	    String[] strings = { "ramer", "jelly", "bean", "cake" };
	    System.out.println("\t" + Arrays.toString(strings));
	    for (int start = 0, end = strings.length - 1; start < end; start++, end--) {
	        String temp = strings[end];
	        strings[end] = strings[start];
	        strings[start] = temp;
	    }
	    System.out.println("\t" + Arrays.toString(strings));

}
}
 