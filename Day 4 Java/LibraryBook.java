class LibraryBook {
    private String title;
    private String author;
    private boolean issued;
    public static int totalBooks = 0;
    
    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.issued = false;
        totalBooks++;
    }
    
    public void issue() {
        if (!issued) {
            issued = true;
            System.out.println("Book issued");
        } else {
            System.out.println("Book already issued");
        }
    }
    
    public void returnBook() {
        if (issued) {
            issued = false;
            System.out.println("Book returned");
        } else {
            System.out.println("Book not issued");
        }
    }
    
    public boolean isIssued() {
        return issued;
    }
}

class Main11 {
    public static void main(String[] args) {
        LibraryBook b = new LibraryBook("1984", "Orwell");
        b.issue();
        b.issue();
        b.returnBook();
    }
}