package ru.itsjava.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itsjava.dao.FilmDao;
import ru.itsjava.domain.Film;
@RequiredArgsConstructor
@Service
public class FilmServiceImpl implements FilmService{
    private final FilmDao filmDao;


    @Override
    public Film getById(long id) {
        return filmDao.getFilmById(id);
    }
}
