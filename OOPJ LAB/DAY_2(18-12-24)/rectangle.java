public class rectangle{
    int length,breadth;
    void get(int x, int y){
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
        System.out.println("AREA="+area());
        System.out.println("PARAMETER="+parameter());
    }
        public static void main(String[] args) {
        rectangle b1=new rectangle();
        b1.get(10,30);
        b1.display();
    }
}

