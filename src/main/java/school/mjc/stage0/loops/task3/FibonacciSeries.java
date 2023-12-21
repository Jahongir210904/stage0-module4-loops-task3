package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first=0;
        int second=1;
        int temp=0;
        for (int i=0;i<lastFibonacci;i++){
            if(i==0){
                System.out.println(i);
            } else if (i == 1) {
                System.out.println(1);
            }else {
                temp=first;
                first=second;
                second=second+temp;
                System.out.println(second);
            }
        }
    }
}
