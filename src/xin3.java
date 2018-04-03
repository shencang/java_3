import java.util.Scanner;

public class xin3 {

    public static void main(String[] args){
        System.out.println("实验三");
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入序号选择题目："+"\n"+"1.200以内被3整除"+"\n"+"2.下三角乘法口诀"+"\n"+"3.求最大最小与和均匀"+"\n"+"4.输出目标三角"+"\n"+"5.输出目标三角2");
        int testchoose;
        testchoose=scanner.nextInt();

        switch (testchoose){
            case 1:{
                OutputNumber one = new OutputNumber();
                one.outnum();
                break;
            }
            case 2:{
                MultiplicationTable two = new MultiplicationTable();
                two.lowertriangle();
                break;

            }
            case 3:{
                SunFind three = new SunFind();
                int arr[]=three.inport();
                System.out.println(three.findmax(arr)+" "+three.findmin(arr)+" "+three.findand(arr)+" "+three.findaver(arr));



                break;

            }
            case 4:{
                OutSomeNum four = new OutSomeNum();
                four.Num();



                break;

            }
            case 5:{
                LetterTriangle five = new LetterTriangle();
                five.javaout();



                break;

            }


            default:{System.out.println("输入有误！请重新输入！");}
        }



    }
}
