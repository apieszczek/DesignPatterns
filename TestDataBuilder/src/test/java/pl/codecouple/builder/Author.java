package pl.codecouple.builder;

/**
 * Created by CodeCouple.pl
 */
class Author {
    private String firstName;
    private String lastName;

    private Author(final AuthorBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    @Override
    public String toString() {
        return "\n\t\tfirstName: " + firstName +
                "\n\t\tlastName: " + lastName;
    }

    static class AuthorBuilder {
        private final String firstName;
        private String lastName;

        public AuthorBuilder (String firstName) {
            this.firstName = firstName;
        }

        public AuthorBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Author build() {
            return new Author(this);
        }
    }
}
