package ru.itsjava.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProgrammerServiceImpl implements ProgrammerService{
    private final NotebookService notebookService ;


  @Autowired
    public ProgrammerServiceImpl(NotebookService notebookService) {
        this.notebookService = notebookService;
    }



    @Override
    public void printItems() {
        System.out.println("Мой кабинет состоит из" + notebookService.getNotebook());
    }
}
