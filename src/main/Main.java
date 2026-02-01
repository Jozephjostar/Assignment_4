package main;

import model.MediaContentBase;
import model.Song;
import model.Category;
import repository.MediaRepository;
import repository.interfaces.CrudRepository;
import service.MediaService;

public class Main {
    public static void main(String[] args) {
        CrudRepository<MediaContentBase> repository = new MediaRepository();
        MediaService service = new MediaService(repository);

        Category rock = new Category(1, "Rock");
        Category pop = new Category(2, "Pop");

        Song song1 = new Song(1, "Gravity", 245, rock);
        Song song2 = new Song(2, "Slow Dancing", 300, pop);

        service.add(song1);
        service.add(song2);

        service.getSortedByDuration()
                .forEach(m -> System.out.println(m.basicInfo()));
    }
}