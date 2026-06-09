// SRP: Khusus peminjaman buku
public class BorrowService {

    public void borrowBook(Member member, Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Buku berhasil dipinjam");
        }
    }
}