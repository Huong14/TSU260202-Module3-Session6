import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fullName = "";
        String email = "";
        String phone = "";
        String password = "";

        int choice;

        do {
            System.out.println("\n*************** QUẢN LÝ NGƯỜI DÙNG ***************");
            System.out.println("1. Nhập thông tin người dùng");
            System.out.println("2. Chuẩn hóa họ tên");
            System.out.println("3. Kiểm tra email hợp lệ");
            System.out.println("4. Kiểm tra số điện thoại hợp lệ");
            System.out.println("5. Kiểm tra mật khẩu hợp lệ");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập họ tên: ");
                    fullName = sc.nextLine();

                    System.out.print("Nhập email: ");
                    email = sc.nextLine();

                    System.out.print("Nhập số điện thoại: ");
                    phone = sc.nextLine();

                    System.out.print("Nhập mật khẩu: ");
                    password = sc.nextLine();

                    System.out.println("Đã lưu thông tin người dùng!");
                    break;

                case 2:
                    if (fullName.isEmpty()) {
                        System.out.println("Bạn chưa nhập thông tin người dùng!");
                    } else {
                        String temp = fullName.trim().toLowerCase();
                        String[] words = temp.split("\\s+");

                        StringBuilder sb = new StringBuilder();
                        for (String w : words) {
                            sb.append(Character.toUpperCase(w.charAt(0)))
                                    .append(w.substring(1))
                                    .append(" ");
                        }

                        fullName = sb.toString().trim();
                        System.out.println("Họ tên sau khi chuẩn hóa: " + fullName);
                    }
                    break;

                case 3:
                    String regexEmail = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
                    System.out.println(email.matches(regexEmail) ? "Email hợp lệ" : "Email không hợp lệ");
                    break;

                case 4:
                    String regexPhone = "^(03|05|07|08|09)[0-9]{8}$";
                    System.out.println(phone.matches(regexPhone) ? "Số điện thoại hợp lệ" : "Số điện thoại không hợp lệ");
                    break;

                case 5:
                    String regexPass = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
                    System.out.println(password.matches(regexPass) ? "Mật khẩu hợp lệ" : "Mật khẩu không hợp lệ");
                    break;

                case 6:
                    System.out.println("Thoát chương trình...");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 6);

        sc.close();
    }
}
