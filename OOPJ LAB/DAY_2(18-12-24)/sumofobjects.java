class sumofobjects{
    int a,b,result;
    void get(int x,int y){
        a=x;
        b=y;
    }
    sumofobjects dosum(sumofobjects x){
        x.a=a+x.a;
        x.b=b+x.b;
        return x;
    }
    int add(){
        return a+b;
    }
    void display(){
        System.out.println("Result is :" +a+" and "+b);
    }
    void objectsumdisplay(){
        System.out.println("Result is :"+add());
    }

    public static void main(String[] args) {
        sumofobjects obj1=new sumofobjects();
        sumofobjects obj2=new sumofobjects();
        sumofobjects obj3=new sumofobjects();
        obj1.get(3,4);
        obj2.get(5,7);
        obj3=obj1.dosum(obj2);
        obj3.display();
        obj2.objectsumdisplay();
    }

}