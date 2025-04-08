import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;

        while (true) {
            System.out.print("Enter your Number: ");
            try{
                int number = scanner.nextInt();
                result = (10 / number);
                System.out.println("kết quả là: " + result);
                break;
            }catch (Exception e) {
                System.out.println(" số cần chia không hợp lệ!! ");
                System.out.println(" Vui lòng nhập lại ");
            }finally{
                System.out.println("hello");
            }
        }
    }
}