package pl.codecouple.builder;

import lombok.Builder;

/**
 * Created by CodeCouple.pl
 */
@Builder
class Category {
    private String name;

    @Override
    public String toString() {
        return "\n\t\t\tname: " + name;
    }
}
