package adapter;

public class BookCatalogAdapter implements CatalogAdapter {
    private Book book;

    public BookCatalogAdapter(Book book) {
        this.book = book;
    }

    @Override
    public String getCatelogTitle() {
        return book.getTitle() + " by " + book.getAuthor();
    }
}
