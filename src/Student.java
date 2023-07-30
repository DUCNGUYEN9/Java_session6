import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private float htmlScore, cssScore, javaScriptScore, avgScore;

    public Student() {
    }

    public Student(String studentId, String studentName, int age, boolean sex, float htmlScore, float cssScore, float javaScriptScore, float avgScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.htmlScore = htmlScore;
        this.cssScore = cssScore;
        this.javaScriptScore = javaScriptScore;
        this.avgScore = avgScore;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public float getHtmlScore() {
        return htmlScore;
    }

    public void setHtmlScore(float htmlScore) {
        this.htmlScore = htmlScore;
    }

    public float getCssScore() {
        return cssScore;
    }

    public void setCssScore(float cssScore) {
        this.cssScore = cssScore;
    }

    public float getJavaScriptScore() {
        return javaScriptScore;
    }

    public void setJavaScriptScore(float javaScriptScore) {
        this.javaScriptScore = javaScriptScore;
    }

    public float getAvgScore() {
        return avgScore;
    }

//

    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sinh viên: ");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên: ");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính sinh viên: ");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập điểm html : ");
        this.htmlScore = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập điểm css : ");
        this.cssScore = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập điểm javaScript : ");
        this.javaScriptScore = Float.parseFloat(scanner.nextLine());
    }

    public void displayData() {
        String sex;
        if (this.sex) {
            sex = "Nam";
        } else {
            sex = "Nu";

        }
        System.out.printf("Mã Sinh Viên: %s - Tên SV: %s - Tuổi SV: %d - Sex: %s\n", this.studentId, this.studentName, this.age, sex);
        System.out.printf("Điểm html: %.2f - css: %.2f - javaScript: %.2f - avg: %.2f\n", this.htmlScore, this.cssScore, this.javaScriptScore, this.avgScore);
        System.out.println("------------------------------------------------------------------------");
    }

    public void calAvgScore() {
        this.avgScore = (this.htmlScore + this.cssScore + this.javaScriptScore) / 3;
    }


}
