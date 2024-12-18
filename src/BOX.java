public class BOX {
    int length,breadth,height;
    void get(int x,int y,int z){
        length=x;
        breadth=y;
        height=z;
    }
    int volume(){
        return length*breadth*height;
    }
    void display(){
        System.out.println(volume());
    }
    public static void main(String[] args){
        BOX b1=new BOX();
        b1.get(2,7,5);
        b1.display();
    }
}
