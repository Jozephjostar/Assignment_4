package repository;

import model.MediaContentBase;
import repository.interfaces.CrudRepository;

import java.util.List;
import java.util.ArrayList;

public class MediaRepository implements CrudRepository<MediaContentBase> {

    @Override
    public void create(MediaContentBase entity) {
    }

    @Override
    public MediaContentBase findById(int id) {
        return null;
    }

    @Override
    public List<MediaContentBase> findAll() {
        return new ArrayList<>();
    }

    @Override
    public void update(MediaContentBase entity) {
    }

    @Override
    public void delete(int id) {
    }
}