package ru.itsjava.service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProgrammerServiceImpl implements ProgrammerService{
private final  NotebookService notebookService;



    @Override
    public void printItems() {
        System.out.println("Мой кабинет состоит из" + notebookService.getNotebook());
    }
}
