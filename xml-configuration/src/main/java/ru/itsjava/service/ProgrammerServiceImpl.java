package ru.itsjava.service;

import lombok.RequiredArgsConstructor;


public class ProgrammerServiceImpl implements ProgrammerService{



    private final  NotebookService notebookService;

    public ProgrammerServiceImpl(NotebookService notebookService) { // передача парметров???
        this.notebookService = notebookService;

    }

    @Override
    public void printItems() {
        System.out.println("Мой кабинет состоит из" + notebookService.getNotebook());
    }
}
