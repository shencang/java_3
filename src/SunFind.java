import java.util.Scanner;

public class SunFind {

    int num;

    public int[] inport(){

        Scanner ip =new Scanner(System.in);
        num=ip.nextInt();
        int  arr[] =new int[num];
        for (int i=0;i<num;i++){
            arr[i]= ip.nextInt();
        }
        return  arr;

    }

    public int findmax(int[] arr){
        int rer=arr[0];
        for(int i=0;i<arr.length;i++){

            if(arr[i]>rer){
                rer=arr[i];

            }
        }
        return rer;
    }
    public int findmin(int[] arr){
        int rer=arr[0];
        for(int i=0;i<arr.length;i++){

            if(arr[i]<rer){
                rer=arr[i];

            }
        }
        return rer;
    }
    public int findand(int[] arr){
        int rer=0;
        for(int i=0;i<arr.length;i++){

            rer= rer+arr[i];
        }
         return rer;

    }
    public double findaver(int[] arr){
        double sum=(double)findand(arr);
       return sum/arr.length;

    }


}
