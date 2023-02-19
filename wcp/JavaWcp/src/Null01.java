
public class Null01 {
    public static void main(String[] args) {
    	String string1;
        // ”あいう”の文字数を出力
        string1 = "あいう";
        System.out.println(string1 + "の文字数：" + string1.length());
        // ””（空文字）の文字数を出力
        string1 = "";
        System.out.println(string1 + "の文字数：" + string1.length());
        // nullの変数を参照するとNullPointerExceptionのエラー
        string1 = null;
        // nullとは、参照型変数の中身が何もないことを表現する特別な値です。参照型変数がnullのとき、その変数は参照先を保持していない状態です。
        // この参照先がないnullの状態の変数を参照すると通称「ヌルポ」と呼ばれる「NullPointerException」というエラーが発生します。
        System.out.println(string1 + "の文字数：" + string1.length());
    }
}
