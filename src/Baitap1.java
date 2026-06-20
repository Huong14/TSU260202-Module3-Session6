import java.sql.SQLOutput;
import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int n = 0;
        float[] scores =  new float[100];
        do {
            System.out.println("**********QUẢN LÝ ĐIỂM SINH VIÊN");
            System.out.println("1. Nhập danh sách điểm sinh viên");
            System.out.println("2. In danh sách điểm");
            System.out.println("3. Tính điểm trung bình của các sinh viên");
            System.out.println("4. Tìm điểm cao nhất và thấp nhất");
            System.out.println("5. Đếm số lượng sinh viên đạt và trượt");
            System.out.println("6. Sắp xếp điểm tăng dần");
            System.out.println("7. Thống kê số lượng sinh viên giỏi và xuất sắc");
            System.out.println("8. Thoát");

            System.out.println("Hãy nhập lựa chọn của bạn:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên:");
                    n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập điểm sinh viên thứ " + (i + 1) + ": ");
                        scores[i] = sc.nextFloat();
                    }

                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("Danh sách sinh viên trống!");
                        break;
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.println("Điểm sinh viên thứ " + (i+1) + "là: " + scores[i]);
                    }

                    break;

                case 3:
                    float scoreAvg = 0;
                    float sum =0;
                    for (int i = 0; i < n; i++) {
                        sum = sum + scores[i];
                    }
                    scoreAvg = sum / n;
                    System.out.println("Điểm trung bình của sinh viên là: " + scoreAvg);

                    break;
                case 4:
                    float minScore = scores[0];
                    float maxScore = scores[0];
                    for (int i = 0; i < n ; i++) {
                        if (scores[i] > maxScore) {
                            maxScore = scores[i];
                        }
                        if (scores[i] < minScore) {
                            minScore = scores[i];
                        }
                    }
                    System.out.println("Điểm cao nhất là: " + maxScore);
                    System.out.println("Điểm thấp nhất là: " + minScore);

                    break;
                case 5:
                    int countPass = 0;
                    int countFail = 0;
                    for (int i = 0; i < n; i++) {
                        if (scores[i] >= 5) {
                            countPass++;
                        } else countFail++;
                    }
                    System.out.println("Số lượng sinh viên đạt là: " + countPass);
                    System.out.println("Số lượng sinh viên trượt là: " + countFail);


                    break;
                case 6:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - 1 - i; j++) {
                            if(scores[j] > scores[j + 1]) {
                                float temp = scores[j];
                                scores[j] = scores[j + 1];
                                scores[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Sắp xếp thành công");

                    break;
                case 7:
                    int countGood = 0;
                    for (int i = 0; i < n; i++) {
                        if (scores[i] >= 8) {
                            countGood++;
                        }
                    }
                    System.out.println("Số lượng sinh viên xuất sắc là: " + countGood);

                    break;
                case 8:
                    System.out.println("Thoát chương trình");
                    System.exit(0);

                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 8);
    }
}
