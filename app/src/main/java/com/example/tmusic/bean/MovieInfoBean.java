package com.example.tmusic.bean;

import java.util.List;

public class MovieInfoBean {
    /**
     * data : [{"createdAt":1604735742253,"updatedAt":1637210007035,"id":"5fa652fe0cea9b0e1eba060e","poster":"https://img.wmdb.tv/movie/poster/1604735740480-2ddd79.jpg","name":"英雄","genre":"剧情/动作/武侠/古装","description":"战国末期，燕、赵、楚、韩、魏、齐、秦七雄并起，惟秦国最为强大，急欲吞并六国一统天下，秦王（陈道明）因此成为六国大敌，各地不同的刺秦故事一直在上演，其中赵国刺客残剑（梁朝伟）、飞雪（张曼玉）、如月（章子...","language":"汉语普通话","country":"中国大陆,中国香港","lang":"Cn","shareImage":"https://image.querydata.org/movie/poster/1637210006558-5fa652fb0cea9b0e1eba060a.png","movie":"5fa652fb0cea9b0e1eba060a"}]
     * createdAt : 1604735742321
     * updatedAt : 1604735742321
     * id : 5fa652fb0cea9b0e1eba060a
     * originalName : 英雄
     * imdbVotes : 172802
     * imdbRating : 7.9
     * rottenRating : 95
     * rottenVotes : 208
     * year : 2002
     * imdbId : tt0299977
     * alias : Hero
     * doubanId : 1306123
     * type : Movie
     * doubanRating : 7.4
     * doubanVotes : 234830
     * duration : 7200
     * dateReleased : 2002-12-19
     */

    private long createdAt;
    private long updatedAt;
    private String id;
    private String originalName;
    private int imdbVotes;
    private String imdbRating;
    private String rottenRating;
    private int rottenVotes;
    private String year;
    private String imdbId;
    private String alias;
    private String doubanId;
    private String type;
    private String doubanRating;
    private int doubanVotes;
    private int duration;
    private String dateReleased;
    private List<DataBean> data;

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public int getImdbVotes() {
        return imdbVotes;
    }

    public void setImdbVotes(int imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getRottenRating() {
        return rottenRating;
    }

    public void setRottenRating(String rottenRating) {
        this.rottenRating = rottenRating;
    }

    public int getRottenVotes() {
        return rottenVotes;
    }

    public void setRottenVotes(int rottenVotes) {
        this.rottenVotes = rottenVotes;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDoubanId() {
        return doubanId;
    }

    public void setDoubanId(String doubanId) {
        this.doubanId = doubanId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDoubanRating() {
        return doubanRating;
    }

    public void setDoubanRating(String doubanRating) {
        this.doubanRating = doubanRating;
    }

    public int getDoubanVotes() {
        return doubanVotes;
    }

    public void setDoubanVotes(int doubanVotes) {
        this.doubanVotes = doubanVotes;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDateReleased() {
        return dateReleased;
    }

    public void setDateReleased(String dateReleased) {
        this.dateReleased = dateReleased;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * createdAt : 1604735742253
         * updatedAt : 1637210007035
         * id : 5fa652fe0cea9b0e1eba060e
         * poster : https://img.wmdb.tv/movie/poster/1604735740480-2ddd79.jpg
         * name : 英雄
         * genre : 剧情/动作/武侠/古装
         * description : 战国末期，燕、赵、楚、韩、魏、齐、秦七雄并起，惟秦国最为强大，急欲吞并六国一统天下，秦王（陈道明）因此成为六国大敌，各地不同的刺秦故事一直在上演，其中赵国刺客残剑（梁朝伟）、飞雪（张曼玉）、如月（章子...
         * language : 汉语普通话
         * country : 中国大陆,中国香港
         * lang : Cn
         * shareImage : https://image.querydata.org/movie/poster/1637210006558-5fa652fb0cea9b0e1eba060a.png
         * movie : 5fa652fb0cea9b0e1eba060a
         */

        private long createdAt;
        private long updatedAt;
        private String id;
        private String poster;
        private String name;
        private String genre;
        private String description;
        private String language;
        private String country;
        private String lang;
        private String shareImage;
        private String movie;

        public long getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(long createdAt) {
            this.createdAt = createdAt;
        }

        public long getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(long updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPoster() {
            return poster;
        }

        public void setPoster(String poster) {
            this.poster = poster;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

        public String getShareImage() {
            return shareImage;
        }

        public void setShareImage(String shareImage) {
            this.shareImage = shareImage;
        }

        public String getMovie() {
            return movie;
        }

        public void setMovie(String movie) {
            this.movie = movie;
        }
    }
}
