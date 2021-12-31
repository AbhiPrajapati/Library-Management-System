package librarySys;

    public class Book extends Library{
        private int book_id;
        private String book_title;
        private String book_author;
        private String book_description;
        private float book_price;
        private String book_language;
        private boolean book_issued;

        public Book(int book_id, String book_title, String book_author, String book_description, float book_price, String book_language, boolean book_issued) {
            this.book_id = book_id;
            this.book_title = book_title;
            this.book_author = book_author;
            this.book_description = book_description;
            this.book_price = book_price;
            this.book_language = book_language;
            this.book_issued = book_issued;
        }

        // this fun takes several inputs and add book in the Lib -> lib_book ArrayList
        public boolean addBook(int book_id, String book_title, String book_author, String book_description, float book_price, String book_language, boolean book_issued){
           if(true) {
               librarySys.Book newBook = new librarySys.Book(book_id, book_title, book_author, book_description, book_price, book_language, book_issued);
               this.lib_book.add(newBook);
               return true;
           }
            return false;
        }

//    public boolean removeBook(int book_id){
//
//    }

//    public boolean updateBook(){
//
//    }

        public void aboutBook(){

        }
    }


