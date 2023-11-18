
public class Clock {

    public static void main(String[] args) {
        // 現在の時刻から今日の経過秒数を表示　num1：時、num2：分、num3：秒
        getSeconds(20,35,4);

    }
    public static void getSeconds(int num1,int num2,int num3){
        int result=num1*60*60+num2*60+num3;
        System.out.println("本日の経過秒数"+result);
    }

}
