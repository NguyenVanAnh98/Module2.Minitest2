public class Main {
    public static void main(String[] args) {
        // Tạo danh sách 10 cuốn sách
        Book[] books = new Book[10];

        // Tạo 5 cuốn sách thuộc lớp ProgrammingBook
        books[0] = new ProgrammingBook("P001", "Java Programming 1", 150, "John Smith", "Java", "Spring");
        books[1] = new ProgrammingBook("P002", "Python Programming", 205, "Jane Doe", "Python", "Django");
        books[2] = new ProgrammingBook("P003", "C# Programming", 130, "Mike Johnson", "C#", ".NET");
        books[3] = new ProgrammingBook("P004", "JavaScript Programming", 140, "Emily Brown", "JavaScript", "React");
        books[4] = new ProgrammingBook("P005", "Ruby Programming", 250, "David Wilson", "Ruby", "Ruby on Rails");

        // Tạo 5 cuốn sách thuộc lớp FictionBook
        books[5] = new FictionBook("F001", "Đắc nhân tâm", 260, " Dale Carnegie", " Self-help book");
        books[6] = new FictionBook("F002", "Nhà giả kim", 170, "Paulo Coelho", "Novel");
        books[7] = new FictionBook("F003", "Bố già", 280, "Mario Puzo", "Novel");
        books[8] = new FictionBook("F004", "Ông già và biển cả", 190, "Ernest Hemingway", "Maritime fantasy");
        books[9] = new FictionBook("F005", "The Lord of the Rings", 100, "J.R.R. Tolkien", "Fantasy");

        // Tính tổng tiền của 10 cuốn sách
//        double totalAmount = 0;
//        for (Book book : books) {
//            totalAmount += book.getPrice();
//        }
//        System.out.println("Tổng tiền của 10 cuốn sách: " + totalAmount);
        double totalBook = 0.0;
        totalBook(books);

        // Đếm số sách ProgrammingBook có language là "Java"
        int javaBooksCount = 0;
        for (Book book : books) {
            if (book instanceof ProgrammingBook) {
                ProgrammingBook programmingBook = (ProgrammingBook) book;
                if (programmingBook.getLanguage().equals("Java")) {
                    javaBooksCount++;
                }
            }
        }
        System.out.println("Số sách ProgrammingBook có language là 'Java': " + javaBooksCount);

        // Đếm số sách Fiction có category là "Viễn tưởng 1"

        int sciFiBooksCount = 0;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                FictionBook fictionBook = (FictionBook) book;
                if (fictionBook.getCategory().equals("Viễn tưởng 1")) {
                    sciFiBooksCount++;
                }
            }
        }
        System.out.println("Số sách Fiction có category là 'Viễn tưởng 1': " + sciFiBooksCount);

        // Đếm số sách Fiction có giá < 100
        int cheapFictionBooksCount = 0;
        for (Book book : books) {
            if (book instanceof FictionBook && book.getPrice() < 100) {
                cheapFictionBooksCount++;
            }
        }
        System.out.println("Số sách Fiction có giá < 100: " + cheapFictionBooksCount);
    }
    public static double totalBook (Book[] books) {
        double totalAmount = 0;
        for (Book book : books) {
            totalAmount += book.getPrice();
        }
        System.out.println("Tổng tiền của 10 cuốn sách: " + totalAmount);
        return totalAmount;
    }

}