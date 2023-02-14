public class Variable01 {

    public static void main(String[] args) {
        // 変数：データ（値）を格納するために準備する名前付きの箱のようなもの
        // 変数の役割：格納したデータを取り出して使用することです。
        // 変数を使用することで、複雑なデータやいくつかのデータを含んだものを簡単に取り出すことが可能になります。
    	
    	// 変数を使用するには、変数を宣言しなければならない
    	// 型 変数名;　と記述することで変数の宣言ができる
    	
        int num1;  // int型の変数num1を宣言
        String str1;  // String型の変数str1を宣言
        
        // 代入：値を格納すること
        // 初期化：宣言した変数に初期値を代入すること
        
        num1 = 10;  // num1を初期化
        str1 = "Hello World!";  //str1を初期化
        
        System.out.println(num1);
        System.out.println(str1);

        //再代入
        // 変数は何度でも値を代入することができます。
        // 変数に値を再代入するとそれまで格納していた値は失われて、新しい値が格納されます。
        num1 = 20;  // num1に20を再代入
        System.out.println(num1);

        // 変数の初期化は変数の宣言と同時に行うことができます。
        // 型 変数名 = 代入するデータ;
        int num2 = 30;  // int型の変数num2を宣言と同時に初期化
        System.out.println(num2);
    }
}

//識別子
//変数を宣言する時に変数名を付ける必要があります。
//また変数以外にもメソッド・クラスなどに名前をつける必要があり、
//それらの個々に識別するためにつける名前のことを識別子と言います。

//識別子のルール
//識別子の命名にはいくつかルールがあります。
//これを守らないとコンパイルエラーになりますので注意しましょう。
//予約語などの使用が禁止されている単語が50個ほどあります。
//例としてnew、void、else等は使用できません(予約語は The Java Tutorials)のような公式ドキュメントで確認できます)。
//数字（1～9）、アルファベットの大文字・小文字（A～Z・a～z）、アンダースコア（_）、ドルマーク（$）が使用できます ※実際は、日本語を含めることもできますが、推奨されていません。
//先頭文字に数字は使用できません
//アルファベットの大文字・小文字は区別されます