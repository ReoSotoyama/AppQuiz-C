import java.util.Scanner;

public class Quiz {


	public static void main(String[] args){
		int situ1 = situmon1();
		int situ2 = situmon2();
		int situ3 = situmon3();
		int situ4 = situmon4();
		int situ5 = situmon5();
		int situ6 = situmon6();


	}



	public static int situmon1(){
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		return ans;

	}

	public static int situmon2(){
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		return ans;

	}

	public static int situmon3(){
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		return ans;

	}

	public static int situmon4(){
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		String[] s = {"鉄琴","木琴"};
		int  t;
		System.out.println("週２日しか使えない楽器ってどんな楽器？");
		for(int i = 0 ; i < s.length ; i++){
			  System.out.println((i + 1) + ":" + s[i]);
			}
		System.out.print("番号を入力して下さい -> ");
		t = sc.nextInt();
		if(t == 1){
			  System.out.println("正解です。");
			  ans = 1;
			}
			else {
			  System.out.println("不正解です。");
			  ans = 2;
			}
		return ans;

	}

	public static int situmon5(){
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		return ans;

	}

	public static int situmon6(){
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		return ans;

	}

}
