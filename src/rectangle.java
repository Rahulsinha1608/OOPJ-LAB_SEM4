import java.sql.SQLOutput;
import java.util.Scanner;
public class rectangle {
        int length,breadth;
        void get(int x,int y){
            length=x;
            breadth=y;
        }
        int area(){
            return length*breadth;
        }
    int parameter(){
        return 2*(length+breadth);
    }
        void display(){
            System.out.println("AREA= " +area());
            System.out.println("PARAMETER= " +parameter());
        }
        public static void main(String[] args){
            rectangle b1=new rectangle();
            Scanner c=new Scanner(System.in);
            int x,y;
            System.out.print("Enter value of x:");
            x=c.nextInt();
            System.out.print("Enter value of y:");
            y=c.nextInt();
            b1.get(x,y);
            b1.display();
        }
}
