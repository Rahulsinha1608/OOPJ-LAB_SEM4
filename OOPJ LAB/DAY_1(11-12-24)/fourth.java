class fourth{
    public static void main(String[] args){
        int num;
        int reverse=0;
        num=1221;
        int given_num=num;
        int single=num%10;
        if(num==single){
            System.out.println("YES"+num+"IS PALINDROME");
        }
        int reminder;
        while(num!=0){
            reminder=num%10;
            reverse=reverse*10+reminder;
            num/=10;
        }
        if(given_num==reverse){
            System.out.println("YES "+given_num+" IS PALINDROME");
        }
        else{
            System.out.println("NO "+given_num+" IS NOT PALINDROME");
        }
        
        
    }
}