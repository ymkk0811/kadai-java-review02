
public class Review01 {

    public static void main(String[] args) {
        //p：税抜き価格、ｒ：税率、result：税額、result2：税込み価格
        int p=2562;
        double r=0.1;
        int result=tax(p,r);
        int result2=p+result;
        System.out.println(p+"円の商品の税込価格は"+result2+"円（消費税は"+result+"円）です。");

    }
    public static int tax(int p,double r){
        int result=(int)(p*r);
        return result;
    }

}
