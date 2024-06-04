package adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterApp {

    public static void main(String[] args) {
        List<CatalogAdapter> list = new ArrayList<>();

        list.add(new BookCatalogAdapter(new Book("Pemrograman Java", "Ucup")));
        list.add(new BookCatalogAdapter(new Book("Pemrograman PHP", "Otong")));
        list.add(new BookCatalogAdapter(new Book("Pemrograman Golang", "Yanto")));

        list.add(new ScreencastCatalogAdapter(new Screencast("Web Blog", "Tanti", 100L)));
        list.add(new ScreencastCatalogAdapter(new Screencast("Machine Tracker", "Dadang", 200L)));
        list.add(new ScreencastCatalogAdapter(new Screencast("Framework", "Arga", 250L)));

        list.forEach(item -> {
            System.out.println(item.getCatelogTitle());
        });
    }

}
