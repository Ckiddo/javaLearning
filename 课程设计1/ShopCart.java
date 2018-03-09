import java.util.Scanner;
import java.util.ArrayList;

public class ShopCart{ // 根据题目建立的类(名称起为购物车)
	static int n = 3; // 用户个数
	static ArrayList<String[]> store = new ArrayList<String[]>();
	// 建立ArrayList存储String数组
	// 0	1		2	3	4		5	6	 7	      8	   9  10  
	// ID 物品1名称 数量 单价 物品2名称 数量 单价 物品3名称 数量 单价 总价
	static Scanner sca = new Scanner(System.in);

	static void showCart(){ // 将购物车的内容打印
		for(String[] s : store){
			for(String st : s){
				System.out.print(st + '\t');
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
		String head[] = {"UID","ITem1","No.","Price","ITem2","No.","Price","Item3","No.","Price","Total"};
		store.add(head);
		for(int i = 0;i < n;i++){ // 输入n个用户的信息
			// 建立临时变量存储单个人的信息
			String input[] = new String[11];
			for(int j = 0;j < 10;j++){ // 输入10项信息，并计算出第11项信息
				input[j] = sca.next();
			}
			// 计算总和
			int sum = 0;
			for(int j = 2 ; j < 9;j+=3){
				sum += Integer.parseInt(input[j]) * Integer.parseInt(input[j+1]);
			}
			input[10] = String.valueOf(sum);
			// 加入到store中
			store.add(input);
		}
		// 显示：
		showCart();
	}
}