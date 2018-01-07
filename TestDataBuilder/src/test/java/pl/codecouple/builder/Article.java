package pl.codecouple.builder;

import java.time.LocalDateTime;

/**
 * Created by CodeCouple.pl
 */
class Article {
    private String title;
    private Author author;
    private LocalDateTime creationDate;
    private Category category;
    private Format format;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Article: " +
                "\n\ttitle: " + title +
                "\n\tauthor: " + author +
                "\n\tcreationDate: " + creationDate +
                "\n\tcategory: " + category +
                "\n\tformat: " + format;
    }
}
