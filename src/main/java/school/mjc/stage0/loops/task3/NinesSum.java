package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum=0;
        String nine="";
        if(lengthOfLastNumber>0){
            for (int i=0;i<lengthOfLastNumber;i++){
                if(i>=0){
                    nine+='9';
                }
                sum+=Integer.parseInt(nine);
            }
            System.out.println(sum);
        }else {
            System.out.println(0);
        }
    }
}
