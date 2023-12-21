package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String number;
        int sum=0;
        if (t>0){
            number=String.valueOf(t);
        }else {
            number=String.valueOf(t).substring(1);
        }
        for (int i = 0; i < number.length(); i++) {
            sum+=Integer.parseInt(number.substring(i,i+1));
        }
        System.out.println(sum);
    }
}
