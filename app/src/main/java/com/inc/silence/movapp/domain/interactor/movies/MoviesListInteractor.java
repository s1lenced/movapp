package com.inc.silence.movapp.domain.interactor.movies;

import com.inc.silence.movapp.data.settings.MoviesFilter;
import com.inc.silence.movapp.domain.entity.main.Movies;
import com.inc.silence.movapp.domain.entity.movies.Movie;
import com.inc.silence.movapp.domain.interactor.base.Interactor;
import com.inc.silence.movapp.domain.repository.movies.MoviesRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by silence on 15.12.2017.
 */

public class MoviesListInteractor extends Interactor<Movies, MoviesListInteractor.Params> {

    private MoviesRepository mMoviesRepository;

    @Inject
    public MoviesListInteractor(MoviesRepository moviesRepository) {
        mMoviesRepository = moviesRepository;
    }

    @Override
    protected Observable<Movies> createObservableInteractor(Params params) {
        return mMoviesRepository.getMoviesList(params.mMoviesFilter, params.mMoviesListID);
    }


    public static final class Params {

        private final MoviesFilter mMoviesFilter;
        private final String mMoviesListID;

        public Params(MoviesFilter moviesFilter, String id) {
            this.mMoviesFilter = moviesFilter;
            this.mMoviesListID = id;
        }

        public static Params create(MoviesFilter moviesFilter, String id) {
            return new Params(moviesFilter, id);
        }
    }
}
