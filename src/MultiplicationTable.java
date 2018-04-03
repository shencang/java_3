public class MultiplicationTable {
    public void lowertriangle(){

        for (int i=1;i<10;i++){

            for (int j=1;j<i+1;j++){
                System.out.print(i+"x"+j+" ");
                if (i==j){
                    System.out.println();
                }
            }

        }

    }
}
