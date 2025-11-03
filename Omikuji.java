/** 条件分岐の練習のために作成
* 2025/11/03
*/

import java.util.Random;
import java.util.Scanner;

public class Omikuji{
	
	/**ランダムに運勢を出すメソッド
	*@return 運勢を返す
	*/
	public String getFortune(){
		Random ran = new Random();
		int index = ran.nextInt(5);
		String retv = null;
		switch(index){
			case 0:
				retv = "大吉";
				break;
			case 1:
				retv = "中吉";
				break;
			case 2:
				retv = "小吉";
				break;
			case 3:
				retv = "吉";
				break;
			case 4:
				retv = "凶";
				break;
		}
			return retv;
	}
	public static void main(String[] args){
		System.out.println("運勢を占います");
		Scanner sc = new Scanner(System.in);
		Omikuji omi = new Omikuji();
		String fortune = null;
		outer:while (true){
			System.out.println("続ける場合はs,止める場合はq");
			String a = sc.next();
			if(a.equals("q")){
				break outer;
			}
			fortune = omi.getFortune();
			System.out.printf("運勢は%sです\n",fortune);
		
		}
		sc.close();
	}
		
		
	}
