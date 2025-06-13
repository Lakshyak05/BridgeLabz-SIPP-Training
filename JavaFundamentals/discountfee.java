import java.util.Scanner;

public class discountfee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float fee = sc.nextFloat();
        float discount = sc.nextFloat();
        float disc_amount = fee * discount/100;
        float Final_price = fee - disc_amount;
        System.out.println(Final_price);
    }
}