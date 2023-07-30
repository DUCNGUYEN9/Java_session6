import java.util.Arrays;
import java.util.Scanner;

public class StudentImp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] arrStudent = new Student[100];
//        for (int i = 0; i < 100; i++) {
//            arrStudent[i] = new Student();
//        }
        int count = 0;
        do {
            System.out.println("**********************MENU*********************\n" +
                    "1. Nhập vào thông tin sinh viên\n" +
                    "2. Tính điểm trung bình tất cả sinh viên\n" +
                    "3. Hiển thị thông tin tất cả sinh viên\n" +
                    "4. Sắp xếp sinh viên theo điểm trung bình giảm dần\n" +
                    "5. Tìm kiếm sinh viên theo tên sinh viên\n" +
                    "6. Thoát");
            System.out.print("hãy chọn 1 số trong menu: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào số lượng sinh viên bạn muốn thêm: ");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        arrStudent[i] = new Student();
                        System.out.println("Nhập thông tin sinh viên " + (i + 1));
                        arrStudent[i].inputData(scanner);
                        arrStudent[i].calAvgScore();
                        count = n;
                    }
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        System.out.printf("Điểm trung bình của SV %d: %.2f\n", (i + 1), arrStudent[i].getAvgScore());
                    }
                    break;
                case 3:
                    for (int i = 0; i < count; i++) {
                        arrStudent[i].displayData();
                    }
                    break;
                case 4:
                    int[] arrIndex = new int[count];
                    for (int i = 0; i < count; i++) {
                        arrIndex[i] = i;
                    }
                    for (int i = 0; i < count - 1; i++) {
                        int maxIndex = i;
                        for (int j = i + 1; j < count; j++) {
                            if (arrStudent[arrIndex[j]].getAvgScore() > arrStudent[arrIndex[maxIndex]].getAvgScore()) {
                                maxIndex = j;
                            }
                        }
                        int temp = arrIndex[i];
                        arrIndex[i] = arrIndex[maxIndex];
                        arrIndex[maxIndex] = temp;
                    }
                    for (int i : arrIndex) {
                        arrStudent[i].displayData();
                    }
                    break;
                case 5:
                    System.out.println("Nhập vào tên sinh viên để tìm kiếm: ");
                    String nameSearch = scanner.nextLine();
                    boolean isExist = false;
                    for (int i = 0; i < count; i++) {
                        if (arrStudent[i].getStudentName().equalsIgnoreCase(nameSearch)) {
                            arrStudent[i].displayData();
                            isExist = true;
                        }
                    }
                    if (!isExist) {
                        System.out.println("Tên bạn vừa nhập không tồn tại");
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Hãy nhập số từ 1 - 6");
            }

        } while (true);
    }
}
