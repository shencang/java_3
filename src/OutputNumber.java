public class OutputNumber {

    public void outnum(){
        int num=0;
        for (int  i=0;i<200;i++){
            if (i%3==0){
                System.out.print(i+"  ");
                num++;
            }
            if(num%10==0){
                System.out.println();
            }

        }
    }
}
