package service;

import model.MediaContentBase;
import repository.interfaces.CrudRepository;
import exception.InvalidInputException;

import java.util.List;

public class MediaService {

    private final CrudRepository<MediaContentBase> repository;

    public MediaService(CrudRepository<MediaContentBase> repository) {
        this.repository = repository;
    }

    public void add(MediaContentBase media) {
        if (media.getDuration() <= 0) {
            throw new InvalidInputException("Duration must be positive");
        }
        repository.create(media);
    }

    public List<MediaContentBase> getSortedByDuration() {
        return repository.findAll()
                .stream()
                .sorted((a, b) -> a.getDuration() - b.getDuration())
                .toList();
    }
}