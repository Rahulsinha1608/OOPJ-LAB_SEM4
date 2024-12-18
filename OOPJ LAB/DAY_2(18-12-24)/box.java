public class box{
    int length,width,height;
    void get(int x, int y, int z){
        length=x;
        width=y;
        height=z;
    }
    int volume(){
        return length*width*height;
    }
    void display(){
        System.out.println(volume());
    }
        public static void main(String[] args) {
        box b1=new box();
        b1.get(10,30,5);
        b1.display();
    }
}

