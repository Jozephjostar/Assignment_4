package controller;

import service.MediaService;

public class MediaController {

    private final MediaService service;

    public MediaController(MediaService service) {
        this.service = service;
    }

    public void showSortedMedia() {
        service.getSortedByDuration()
                .forEach(m -> System.out.println(m.basicInfo()));
    }
}