import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        int a;
        System.out.println("enter the number:");
        Scanner n=new Scanner(System.in);
        a=n.nextInt();
        if(a%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
}
