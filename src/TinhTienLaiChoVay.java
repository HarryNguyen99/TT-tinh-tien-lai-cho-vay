import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        double money;
        int month;
        double interset_rate;
        double total_interset = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Nhập tiền gửi: ");
        money = input.nextDouble();

        System.out.print("Nhập tháng gửi: ");
        month = input.nextInt();

        System.out.print("Nhập lãi suất: ");
        interset_rate = input.nextDouble();

        for(int i = 0; i < month; i++){
            total_interset = money * (interset_rate/100)/12 * month;
        }

        System.out.println("tiền lãi: " + total_interset);
    }
}
