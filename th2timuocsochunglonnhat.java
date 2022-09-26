import java.util.Scanner;

public class th2timuocsochunglonnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a:");
        a = sc.nextInt();
        System.out.println("Enter b:");
        b = sc.nextInt();
        a = Math.abs(a); //Sử dụng hàm abs để trả về giá trị tuyệt đối (phần dương) của a, b
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
                System.out.println("a = " + a);
            } else {
                System.out.println("b = " + b);
            }
        }
        System.out.println("Greatest common factor: " + a);
    }
}
