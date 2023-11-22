
public class IfElseSample {

    public static void main(String[] args) {
        int score=89;// 成績
        
        //　scoreが60以上ならば合格です！と表示
        if(score>=60) {
            System.out.println("合格です！");
        }else {
            //　そうでなければ赤点です．．．と表示
            System.out.println("赤点です．．．");
        }
        
        String result=(score>=90)?"天才ですね！":"";
            System.out.println(result);
    }

}
