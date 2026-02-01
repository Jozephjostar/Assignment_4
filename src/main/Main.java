package main;

import controller.MediaController;
import model.Category;
import model.MediaContentBase;
import model.Podcast;
import model.Song;
import repository.MediaRepository;
import repository.interfaces.CrudRepository;
import service.MediaService;
import utils.ReflectionUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        CrudRepository<MediaContentBase> repo = new MediaRepository();

        MediaService service = new MediaService(repo);

        MediaController controller = new MediaController(service);


        Category rock = new Category(1, "Rock");
        Category pop = new Category(2, "Pop");

        MediaContentBase song1 = new Song(1, "Gravity", 245, rock);
        MediaContentBase song2 = new Song(2, "Slow Dancing", 300, pop);
        MediaContentBase podcast1 = new Podcast(3, "Tech Talk", 1800, "Alice");


        service.add(song1);
        service.add(song2);
        service.add(podcast1);


        List<MediaContentBase> sortedList = service.getSortedByDuration();
        System.out.println("=== Sorted Media ===");
        sortedList.forEach(m -> System.out.println(m.basicInfo()));

        System.out.println("\n=== Reflection Demo ===");
        ReflectionUtils.inspect(song1);


        System.out.println("\n=== Controller Output ===");
        controller.showSortedMedia();
    }
}