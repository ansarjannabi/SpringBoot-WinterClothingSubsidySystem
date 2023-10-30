public class day3 {
    /**
     * 编写程序求1+3+5+7+……+99 的和值
     */
    public static void main(String[] args) {
        int sum  =0 ;
        for(int i=1;i<100;i +=2){
            sum +=i;
        }
        System.out.println("1+3+5+7+……+99="+sum);
    }
}
