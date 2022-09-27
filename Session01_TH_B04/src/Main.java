public class Main {
    public static void main(String[] args) {
        String studentId = "SV001";
        String studentName = "Nguyen Van A";
        int age = 20;
        boolean sex = true;
        String email = "quangnd@rikkeisoft.com";
        String phone = "0355914029";
        String address = "Toa nha Hoa Binh, Tu Liem, Ha Noi";
        System.out.println("******************STUDENT INFORMATION****************");
        System.out.printf("%-15s%-7s%-15s%-30s%-7s%-15d\n", "Student ID", studentId, "Student Name", studentName, "Age", age);
        System.out.printf("%-15s%-7b%-15s%-30s%-7s%-15s\n", "Gender", sex, "Email", email, "Phone", phone);
        System.out.printf("%-15s%-100s", "Address", address);

    }
}