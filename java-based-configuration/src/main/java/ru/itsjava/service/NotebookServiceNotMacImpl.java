package ru.itsjava.service;

import ru.itsjava.domain.Notebook;

public class NotebookServiceNotMacImpl implements NotebookService{
    @Override
    public Notebook getNotebook() {
        return new Notebook("Asus");
    }
}
