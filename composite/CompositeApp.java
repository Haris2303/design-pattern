package composite;

import java.util.Arrays;
import java.util.List;

public class CompositeApp {

    public static void main(String[] args) {
        List<Category> categories = Arrays.asList(
                new CompositeCategory("Handphone", Arrays.asList(
                        new Category("Android"),
                        new Category("iOS"))),
                new CompositeCategory("Computer", Arrays.asList(
                        new Category("Laptop"),
                        new Category("PC"))),
                new CompositeCategory("Fashion", Arrays.asList(
                        new Category("Fashion Pria"),
                        new Category("Fashion Wanita"))));

        categories.forEach(category -> {
            printCategory(category);
        });
    }

    private static void printCategory(Category category) {
        System.out.println(category.getName());

        if (category instanceof CompositeCategory) {
            CompositeCategory compositeCategory = (CompositeCategory) category;
            compositeCategory.getCategories().forEach(value -> {
                printCategory(value);
            });
        }
    }
}
