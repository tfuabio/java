
public class Chapter05 {
	public static void main(String[] args) { 
		// プリミティブ型
		// 数値や文字のデータそのものを保持している型
		
		// 整数型
		// 数値の大きさに合わせて４種類：long, int, short, byte
		long long1 = 9223372036854775807;  // longはLをつけないとコンパイルエラーになる
		long long2 = 9223372036854775807L;
		
		// 「short」型、「byte」型は明示的な記述をする必要はありません。
		short short1 = 32767;
		byte byte1 = 127;
		
		// 浮動小数型
		// 数値の大きさに合わせて２種類
		// 通常は「double」型
		// プログラム上の小数値は「double」型として扱われます
		// 「double」型も「D」または「d」を付けて明示的にすることも可能
		double double1 = 1234567.89;
		double double2 = 1234567.89d;  // 明示的にすることも可能
		
		// 明示的に「float」型を宣言する場合は、数値の最後に「F」または「f」を付ける必要があります。
		float float1 = 0.123;          // コンパイルエラー
		float float2 = 0.123f;
		
		// 論理型
		boolean boolean1 = true;
		boolean boolean2 = false;
		
		// 文字型
		char char1 = 'あ';
		char char3 = 'A';
		char char2 = 'AB'     // コンパイルエラー
		char char4 = 0x3042;  // 文字コードでひらがなの「あ」を表現
		'あ';                 // プログラム上ではchar型
		
		// 参照型
		// データそのものを扱うのではなく、データがある参照先を保持する型
		
		// 文字列クラス（String型）
		// 文字列をプログラム上に記述する場合は、「"」(ダブルクォーテーション)で囲む
		String string1 = "あいう";
		"あいう";  // プログラム上ではString型
		
		// ラッパークラス
		// プリミティブ型を参照型として扱えるようにできるクラス
		
		// ボクシング
		// プリミティブ型の値をラッパークラス型へ変換すること
		// にラッパークラス型の値からプリミティブ型への変換をアンボクシング
		Integer integer1 = 5;                   // オートボクシング
		Integer integer2 = Integer.valueOf(5);  // 明示的なボクシング
		int int1 = integer1;             // アンボクシング
		int int2 = integer2.intValue();  // 明示的なアンボクシング
		
		// 配列
		
	}
}
