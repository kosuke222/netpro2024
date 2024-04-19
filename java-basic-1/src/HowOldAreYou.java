// C言語では、#include に相当する
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowOldAreYou {

	public static void main(String[] args) { 

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			// BufferedReader というのは、データ読み込みのクラス(型)
			// クラスの変数を作るには、new を使う。

			// readLine() は、入出力エラーの可能性がある。エラー処理がないとコンパイルできない。
			//  Java では、 try{ XXXXXXXX }  catch(エラーの型 変数) { XXXXXXXXXXXXXXXXXX} と書く
		try {
            while(true){
			System.out.println("何歳ですか?");
			String line = reader.readLine();
            if (line.equalsIgnoreCase("q") || line.equalsIgnoreCase("e")) {
                System.out.println("終了します。");
                break;
            }
			int age = Integer.parseInt(line);
            if (age < 0 || age >= 120) {
                System.out.println("年齢が不正です。再入力してください。");
                continue;
            }
            int birthYear = 2024 - age;
            String era;
            int eraYear;
                if (birthYear > 2019) {
                    era = "令和";
                    eraYear = 2020;
                } else if (birthYear > 1989) {
                    era = "平成";
                    eraYear = 1990;
                } else if (birthYear > 1926) {
                    era = "昭和";
                    eraYear = 1927;
                } else if (birthYear > 1912) {
                    era = "大正";
                    eraYear = 1913;
                } else {
                    era = "明治";
                    eraYear = 1868;
                }
            System.out.println("2030年には" + (age + 6) + "歳です。");
            if(eraYear == birthYear){
            System.out.println("誕生年の元号は" + era + "元年です。");    
            }else if(eraYear != birthYear){
            System.out.println("誕生年の元号は" + era + (birthYear - eraYear+1) + "年です。");
            }
		}
    }
		catch(IOException e) {
			System.out.println(e);
		}catch (NumberFormatException e) {
            System.out.println("年齢の入力が不正です。再入力してください。");
        }

    
	}
}

//  課題    キーボードから数字を打ち込む
//  その結果、 あなたは、???歳ですね、と画面に表示させる。
//  その後、あなたは10年後、????歳ですね、と画面に表示させる。

