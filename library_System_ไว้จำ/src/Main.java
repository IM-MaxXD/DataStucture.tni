import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //สร้างออบเจกต์ผู้จัดการห้องสมุดรอไว้
        Library library = new Library();

        //สั่งให้ผู้จัดการไปดึงข้อมูลจากไฟล์ txt มาใส่ ArrayList ทันทีที่เปิดโปรแกรม
        library.loadBooksFromFile("books.txt");

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true; // ตัวแปรคุมให้โปรแกรมทำงานไปเรื่อยๆ จนกว่าเราจะสั่งปิด

        // วงลูป While: จะวนโชว์เมนูนี้ซ้ำๆ จนกว่า isRunning จะโดนเปลี่ยนเป็น false
        while (isRunning) {
            System.out.println("\n=== ยินดีต้อนรับสู่ระบบห้องสมุด TNI ===");
            System.out.println("1. ดูหนังสือทั้งหมดในระบบ");
            System.out.println("2. ค้นหาหนังสือ");
            System.out.println("3. ดูประวัติการค้นหาล่าสุด");
            System.out.println("4. จองหนังสือ");
            System.out.println("5. คืนหนังสือ");
            System.out.println("0. ออกจากระบบ");
            System.out.print(">> พิมพ์ตัวเลขเพื่อเลือกเมนู: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    library.displayAllBooks();
                    break;
                case 2:
                    System.out.print(">> พิมพ์คำค้นหาชื่อหนังสือ: ");
                    String keyword = scanner.nextLine();
                    library.searchByTitle(keyword);
                    break;
                case 3:
                    library.showSearchHistory();
                    break;
                case 4:
                    System.out.print(">> พิมพ์รหัสหนังสือที่ต้องการยืม/จอง: ");
                    String isbnReserve = scanner.nextLine();
                    System.out.print(">> พิมพ์ชื่อของคุณ: ");
                    String userName = scanner.nextLine();
                    library.reserveBook(isbnReserve, userName);
                    break;
                case 5:
                    System.out.print(">> พิมพ์รหัสหนังสือที่ต้องการคืน: ");
                    String isbnReturn = scanner.nextLine();
                    library.returnBook(isbnReturn);
                    break;
                case 0:
                    // ถ้าพิมพ์ 0 ให้เปลี่ยนค่าเป็น false เพื่อพังวงลูป While โปรแกรมจะจบการทำงาน
                    isRunning = false;
                    System.out.println(">> ออกจากระบบ...");
                    break;
                default:
                    System.out.println(">> กรุณาพิมพ์ตัวเลขให้ถูกต้อง (0-5)");
            }
        }
        scanner.close();
    }
}