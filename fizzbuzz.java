import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList <String> obj=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            if(i%3==0 && i%5==0)
            obj.add("FizzBuzz");
            else if(i%3==0)
            obj.add("Fizz");
            else if(i%5==0)
            obj.add("Buzz");
            else
            obj.add(Integer.toString(i));
        }
        for(int i=0;i<obj.size();i++)
        System.out.print(obj.get(i)+" ");
    }
}