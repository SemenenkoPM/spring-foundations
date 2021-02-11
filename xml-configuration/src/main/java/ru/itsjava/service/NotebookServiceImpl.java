package ru.itsjava.service;

import ru.itsjava.domain.Notebook;

public class NotebookServiceImpl implements NotebookService {
    @Override
    public Notebook getNotebook() {
        return new Notebook("Mac");
    }
}
