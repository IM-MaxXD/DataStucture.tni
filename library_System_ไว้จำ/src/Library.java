import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Library {

    private ArrayList<Book> books;

    private Stack<Book> searchHistory;

    public Library() {
        this.books = new ArrayList<>();
        this.searchHistory = new Stack<>();
    }


    public void loadBooksFromFile(String filePath) {
        try {

            File file = new File(filePath);
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                String[] data = line.split("\\|");

                if (data.length == 4) {
                    String isbn = data[0]; //รหัส
                    String title = data[1]; //ชื่อ
                    String author = data[2]; //ผู้แต่ง
                    boolean isAvailable = data[3].equals("Available"); //สถานะ ถ้าในไฟล์เขียนว่า Available จะได้ค่า true

                    Book newBook = new Book(isbn, title, author, isAvailable);
                    books.add(newBook);
                }
            }
            fileReader.close();
            System.out.println(">> ระบบ: โหลดข้อมูลหนังสือเสร็จสิ้น! มีหนังสือทั้งหมด " + books.size() + " เล่ม");

        } catch (FileNotFoundException e) {
            System.out.println(">> ระบบ Error: ไม่พบไฟล์ '" + filePath + "' กรุณาตรวจสอบว่ามีไฟล์");
        }
    }


    public void searchByTitle(String keyword) {
        System.out.println("\n--- ผลการค้นหาคำว่า '" + keyword + "' ---");
        boolean isFound = false;

        // O(n)
        for (Book b : books) {

            if (b.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(b.toString());

                searchHistory.push(b);
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("ไม่พบหนังสือที่ตรงกับคำค้นหา");
        }
        System.out.println("-------------------------------------");
    }

    //แนวคิด LIFO ของ Stack
    public void showSearchHistory() {
        System.out.println("\n--- ประวัติการค้นหาล่าสุด ---");

        if (searchHistory.isEmpty()) {
            System.out.println("ยังไม่มีประวัติการค้นหา");
        } else {
            // ปกติ Stack จะใช้คำสั่ง .pop() เพื่อดึงออก แต่ถ้า pop ประวัติจะหายไป
            // เราเลยใช้วิธีอ่านข้อมูลจากตำแหน่ง "บนสุด" (ตัวล่าสุดที่เพิ่ง push ลงไป) ถอยหลังลงมา
            for (int i = searchHistory.size() - 1; i >= 0; i--) {
                System.out.println("- " + searchHistory.get(i).getTitle());
            }
        }
        System.out.println("-------------------------------------------------");
    }

    public void displayAllBooks() {
        System.out.println("\n--- รายชื่อหนังสือทั้งหมดในระบบ ---");
        // วนลูปหยิบหนังสือออกมาจาก ArrayList ทีละเล่ม
        for (Book b : books) {
            System.out.println(b.toString());
        }
        System.out.println("---------------------------------");
    }

    public void reserveBook(String isbn, String userName) {
        boolean isFound = false;

        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                isFound = true;
                if (b.isAvailable()) {
                    // กรณีที่ 1 หนังสือว่าง > ให้ยืมไปเลย แล้วเปลี่ยนสถานะเป็นไม่ว่าง (false)
                    b.setAvailable(false);
                    System.out.println(">> สำเร็จ! คุณ '" + userName + "' ได้ทำการยืมหนังสือ '" + b.getTitle() + "' ไปแล้วครับ");
                } else {
                    // กรณีที่ 2 หนังสือไม่ว่าง > เอาชื่อเข้าคิวรอ (Enqueue)
                    System.out.println(">> หนังสือ '" + b.getTitle() + "' มีคนยืมอยู่ครับ ระบบจะนำชื่อเข้าคิวจองให้");
                    b.addReservation(userName); // เรียกฟังก์ชันคิวจากคลาส Book
                }
                break; // เจอเล่มที่หาแล้วหยุดลูป
            }
        }

        if (!isFound) {
            System.out.println(">> ระบบ: หาหนังสือรหัส '" + isbn + "' ไม่พบครับ");
        }
    }

    public void returnBook(String isbn) {
        boolean isFound = false;

        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                isFound = true;
                if (b.isAvailable()) {
                    System.out.println(">> หนังสือเล่มนี้ไม่ได้ถูกยืม");
                } else {
                    System.out.println(">> คุณได้นำหนังสือ '" + b.getTitle() + "' มาคืนแล้ว");

                    // เมื่อคืนสำเร็จให้เช็คว่ามีคนรอคิวไหม Dequeue
                    String nextPerson = b.getNextReservation();

                    if (nextPerson != null) {
                        // ถ้ามีคิวรออยู่ > ส่งมอบให้คนถัดไปทันที สถานะหนังสือยังคงเป็น false เพราะถูกคิวถัดไปยืมต่อ
                        System.out.println(">> [แจ้งเตือนคิว] มอบหนังสือให้คิวถัดไป: คุณ '" + nextPerson + "' ได้รับสิทธิ์ยืมต่อ");
                    } else {
                        // ถ้าคิวว่าง > หนังสือกลับมาสถานะว่าง
                        b.setAvailable(true);
                        System.out.println(">> หนังสือถูกเก็บแล้ว พร้อมให้คนอื่นยืมต่อ");
                    }
                }
                break;
            }
        }

        if (!isFound) {
            System.out.println(">> ระบบ: หาหนังสือรหัส '" + isbn + "' ไม่พบ");
        }
    }

}