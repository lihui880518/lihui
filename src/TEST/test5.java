package TEST;
/**
 * @Author fufu
 * @Time 2017-3-20 下午03:20:17
 * @Version 1.0
 * <p>Description:</p>
 */
public class test5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,j;
		for(i = 1;i<=1000;i++){
			int sum;
			sum =0;
			for(j = 1;j<i;j++)
			{
				if(i%j ==0)
				{
					sum +=j;
				}
			}
				if(i == sum)
					System.out.println(" "+i);
			
			
		}



	}

}
 