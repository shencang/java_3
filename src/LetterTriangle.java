public class LetterTriangle {
    public void javaout(){
        char ch[]={'A','B','C','D','E','F','G'};

                int line=7;
                for(int i=line;i>=0;i--){
                    for(int j=0;j<i;j++){
                        System.out.print("   ");
                    }

                    for( int j=0;j<2*(line-i)-1;j++){
                        System.out.print("  "+ch[line-i-1]);
                    }

                    System.out.println();
                }
            }
        }





