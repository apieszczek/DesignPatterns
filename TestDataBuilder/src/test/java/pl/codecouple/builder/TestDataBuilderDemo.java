package pl.codecouple.builder;

import java.time.LocalDateTime;

/**
 * Created by CodeCouple.pl
 */
public class TestDataBuilderDemo {

    public static void main(String[] args) {
        Author author =  new Author.AuthorBuilder("Agnieszka")
                .lastName("Pieszczek")
                .build();
        Article article = new ArticleBuilder()
                .title("#5 Wzorce projektowe: Test Data Builder")
                .author(author)
                .creationDate(LocalDateTime.now())
                .format(Format.NORMAL_ARTICLE)
                .category(Category.builder().name("Design Patterns").build())
                .build();
        System.out.println(article);
    }
}
