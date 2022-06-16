public class programmes {
    public static void main(String[] args) {
        double nl=-4.5, n2=3.9, n3=5.5;
        if(nl>=n2) {
            if(nl >= n3)
                System.out.println("the largest number is:" +nl);
            else
                System.out.println("the largest number is:" +n3);
        }else{
            if(n2 >= n3)
                System.out.println("the largest number is:" +n2);
            else
                System.out.println("the largest number is:" +n3);
        }

    }
}