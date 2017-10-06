import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();


        int x=sc.nextInt();
        int y=sc.nextInt();
  /*  System.out.println(w+","+h);
      System.out.println(n+"回");
      System.out.println(x+" "+y);
  */
       String dir="";
        int m=0;
        for(int i=0;i<n;i++){
            dir=sc.next();
            m=sc.nextInt();
    /*     System.out.println(dir+":"+m);
      */      if(dir.equals("U")){
                y+=m;


                    while(y>=h){
                     y-=h;
                    }


            }else if(dir.equals("D")){
                y-=m;


                    while(y<0){
                    y=h+y;
                    }

            }else if(dir.equals("R")){
                x+=m;

                    while(x>=w){
                    x-=w;

                }
            }else if(dir.equals("L")){
                x-=m;

                    while(x<0){
                    x=w+x;
                    }

            }
        }
        System.out.println(x+" "+y);
    }
}
