
public class AndSample {

    public static void main(String[] args) {
        int score=70;
        if(score==100) {
            System.out.println("満点です！ご褒美をあげます！");
        }if(score<=99&&score>=80) {
            System.out.println("よくできました！");
        }if(score<=79&&score>=60) {
            System.out.println("合格です！");
        }if(score<=59) {
            System.out.println("赤点です．．．補講を行います");
        }

    }

}
