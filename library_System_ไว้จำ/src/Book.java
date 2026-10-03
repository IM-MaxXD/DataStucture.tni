import java.util.LinkedList;
import java.util.Queue;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    // Queue สำหรับเก็บชื่อคนจองหนังสือ FIFO
    private Queue<String> reservationQueue;

    public Book(String isbn, String title, String author, boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
        this.reservationQueue = new LinkedList<>(); // ใช้ LinkedList สร้าง Queue
    }

    // 3. Getter / Setter > เนื่องจากตัวแปรข้างบนตั้งเป็น private เลยต้องมีช่องทางให้ไฟล์อื่นดึงข้อมูลไปดูได้
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    //ต่อแถว-เรียกคิว
    public void addReservation(String userName) {
        reservationQueue.offer(userName); // .offer คือการเอาชื่อไปต่อท้ายคิว
        System.out.println(">> เพิ่มคุณ '" + userName + "' เข้าคิวจองหนังสือ '" + title + "' สำเร็จ");
    }

    public String getNextReservation() {
        // .poll คือการเรียกคนแรกสุด ออกมา และเตะชื่อเขาออกจากคิว
        // ถ้าคิวว่างมันจะส่งค่า null กลับมา
        return reservationQueue.poll();
    }

    //ไว้จัดรูปประโยคสวยๆ
    @Override
    public String toString() {
        String status = isAvailable ? "[ว่าง]" : "[มีคนยืมแล้ว]";
        return status + " รหัส: " + isbn + " | ชื่อเรื่อง: " + title + " | ผู้แต่ง: " + author;
    }
}