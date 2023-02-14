public class Variable02 {

    public static void main(String[] args) {
    	// 定数：最初に代入した値を後から変更できない変数
    	// final修飾子を記述することで定数になります。
    	// 値を変更する必要が無いことがわかっている場合は、定数として宣言するようにしましょう。
    	// 定数名は、全て大文字で記述し、複合語の場合は単語の区切りをアンダースコア(_)にして記述するのが一般的です。
    	
    	// 定数の宣言
    	// final 定数の型 定数名 = 初期値;
        final int MIN_NUMBER = 10;
        System.out.println(MIN_NUMBER);

        // 再代入しようとするとエラー
        //MIN_NUMBER = 20;
    }
}