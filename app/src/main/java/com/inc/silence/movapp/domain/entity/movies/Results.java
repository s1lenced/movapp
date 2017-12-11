package com.inc.silence.movapp.domain.entity.movies;

import com.google.gson.annotations.SerializedName;
import io.realm.RealmList;
import io.realm.RealmObject;

public class Results extends RealmObject {
    public static final String ORIGINAL_NAME = "original_name";
    public static final String GENRE_IDS = "genre_ids";
    public static final String NAME = "name";
    public static final String POPULARITY = "popularity";
    public static final String ORIGIN_COUNTRY = "origin_country";
    public static final String VOTE_COUNT = "vote_count";
    public static final String FIRST_AIR_DATE = "first_air_date";
    public static final String BACKDROP_PATH = "backdrop_path";
    public static final String ORIGINAL_LANGUAGE = "original_language";
    public static final String ID = "id";
    public static final String VOTE_AVERAGE = "vote_average";
    public static final String OVERVIEW = "overview";
    public static final String POSTER_PATH = "poster_path";

    @SerializedName("original_name")
    private String original_name;
    @SerializedName("genre_ids")
    private RealmList<Genre_ids> genre_ids;
    @SerializedName("name")
    private String name;
    @SerializedName("popularity")
    private float popularity;
    @SerializedName("origin_country")
    private RealmList<OrigincountryList> origin_country;
    @SerializedName("vote_count")
    private int vote_count;
    @SerializedName("first_air_date")
    private String first_air_date;
    @SerializedName("backdrop_path")
    private String backdrop_path;
    @SerializedName("original_language")
    private String original_language;
    @SerializedName("id")
    private int id;
    @SerializedName("vote_average")
    private float vote_average;
    @SerializedName("overview")
    private String overview;
    @SerializedName("poster_path")
    private String poster_path;

    public Results(){ }

    public Results setOriginal_name(String original_name){
        this.original_name = original_name;
        return this;
    }
    public String getOriginal_name(){
        return this.original_name;
    }
    public Results setGenre_ids(RealmList<Genre_ids> genre_ids){
        this.genre_ids = genre_ids;
        return this;
    }
    public RealmList<Genre_ids> getGenre_ids(){
        return this.genre_ids;
    }
    public Results setName(String name){
        this.name = name;
        return this;
    }
    public String getName(){
        return this.name;
    }
    public Results setPopularity(float popularity){
        this.popularity = popularity;
        return this;
    }
    public float getPopularity(){
        return this.popularity;
    }
    public Results setOrigin_country(RealmList<OrigincountryList> origin_country){
        this.origin_country = origin_country;
        return this;
    }
    public RealmList<OrigincountryList> getOrigin_country(){
        return this.origin_country;
    }
    public Results setVote_count(int vote_count){
        this.vote_count = vote_count;
        return this;
    }
    public int getVote_count(){
        return this.vote_count;
    }
    public Results setFirst_air_date(String first_air_date){
        this.first_air_date = first_air_date;
        return this;
    }
    public String getFirst_air_date(){
        return this.first_air_date;
    }
    public Results setBackdrop_path(String backdrop_path){
        this.backdrop_path = backdrop_path;
        return this;
    }
    public String getBackdrop_path(){
        return this.backdrop_path;
    }
    public Results setOriginal_language(String original_language){
        this.original_language = original_language;
        return this;
    }
    public String getOriginal_language(){
        return this.original_language;
    }
    public Results setId(int id){
        this.id = id;
        return this;
    }
    public int getId(){
        return this.id;
    }
    public Results setVote_average(float vote_average){
        this.vote_average = vote_average;
        return this;
    }
    public float getVote_average(){
        return this.vote_average;
    }
    public Results setOverview(String overview){
        this.overview = overview;
        return this;
    }
    public String getOverview(){
        return this.overview;
    }
    public Results setPoster_path(String poster_path){
        this.poster_path = poster_path;
        return this;
    }
    public String getPoster_path(){
        return this.poster_path;
    }
}
