import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số: ");
        int usd = sc.nextInt();
        int vnd = usd*23000;
        System.out.println(vnd + " đồng");
    }
}
