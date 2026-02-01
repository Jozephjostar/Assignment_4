package repository;

import model.MediaContentBase;
import repository.interfaces.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public class MediaRepository implements CrudRepository<MediaContentBase> {

    private final List<MediaContentBase> database = new ArrayList<>();

    @Override
    public void create(MediaContentBase entity) {
        database.add(entity);
    }

    @Override
    public MediaContentBase findById(int id) {
        return database.stream().filter(m -> m.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<MediaContentBase> findAll() {
        return new ArrayList<>(database);
    }

    @Override
    public void update(MediaContentBase entity) {
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getId() == entity.getId()) {
                database.set(i, entity);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        database.removeIf(m -> m.getId() == id);
    }
}