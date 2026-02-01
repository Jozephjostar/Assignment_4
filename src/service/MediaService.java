package service;

import repository.interfaces.CrudRepository;
import model.MediaContentBase;
import java.util.List;

public class MediaService {
    private final CrudRepository<MediaContentBase> repository;

    public MediaService(CrudRepository<MediaContentBase> repository) {
        this.repository = repository;
    }

    public void add(MediaContentBase media) {
        repository.create(media);
    }

    public List<MediaContentBase> getSortedByDuration() {
        return repository.findAll()
                .stream()
                .sorted((a, b) -> a.getDuration() - b.getDuration())
                .toList();
    }
}