package TEST;

/**
 * @Author fufu
 * @Time 2017-3-20 下午03:07:43
 * @Version 1.0
 *          <p>
 *          Description:
 *          </p>
 */
public class test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			int n = 0;
			for (int j = 0; j < i; j++) {
				n = j * i;
			}
			sum = +n;
		}

		System.out.println(sum);

	}

}
