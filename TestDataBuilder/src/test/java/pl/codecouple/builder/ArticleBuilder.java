package pl.codecouple.builder;

import java.time.LocalDateTime;

/**
 * Created by CodeCouple.pl
 */
class ArticleBuilder {

    private String title;
    private Author author;
    private LocalDateTime creationDate;
    private Category category;
    private Format format;

    public ArticleBuilder title(String title) {
        this.title = title;
        return this;
    }

    public ArticleBuilder author(Author author) {
        this.author = author;
        return this;
    }

    public ArticleBuilder creationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public ArticleBuilder category(Category category) {
        this.category = category;
        return this;
    }

    public ArticleBuilder format(Format format) {
        this.format = format;
        return this;
    }

    public Article build() {
        Article article = new Article();
        article.setTitle(title);
        article.setAuthor(author);
        article.setCreationDate(creationDate);
        article.setFormat(format);
        article.setCategory(category);
        return article;

    }
}
