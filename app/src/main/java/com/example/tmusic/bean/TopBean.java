package com.example.tmusic.bean;

import java.util.List;

public class TopBean {

    /**
     * visionRatings : 0
     * castRatings : 0
     * musicRatings : 0
     * plotRatings : 0
     * data : [{"createdAt":1636266379327,"updatedAt":1654072111794,"id":"6187718b4d6ad7466702226d","poster":"https://img.wmdb.tv/movie/poster/1636266379322-edf32a.jpg","name":"幸福","genre":"剧情/悬疑/惊悚","description":"该剧是以新冠疫情结束的近未来为背景的电视剧，新型感染病\u201c狂人病\u201d流行的假设下，直接展现人类的欲望和恐怖，那些被赋予意义的价值们在受到生命威胁时是否能够毫无变化地维持下去，即便如此也不变化的价值究竟是什...","language":"韩语","country":"韩国","lang":"Cn","shareImage":"https://image.querydata.org/movie/poster/1654072111760-6187718b4d6ad74667022269.png","movie":"6187718b4d6ad74667022269"}]
     * createdAt : 1636266379185
     * updatedAt : 1636266379328
     * id : 6187718b4d6ad74667022269
     * originalName : 해피니스
     * imdbVotes : 0
     * imdbRating :
     * rottenRating :
     * rottenVotes : 0
     * year : 2021
     * imdbId :
     * alias : Happiness
     * doubanId : 35377080
     * type : TVSeries
     * doubanRating : 8.6
     * doubanVotes : 574
     * duration : 0
     * episodes : 12
     * totalSeasons : 0
     * dateReleased : 2021-11-05
     * totalVotes : 0
     */

    private int visionRatings;
    private int castRatings;
    private int musicRatings;
    private int plotRatings;
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
    private int episodes;
    private int totalSeasons;
    private String dateReleased;
    private int totalVotes;
    private List<DataBean> data;

    public int getVisionRatings() {
        return visionRatings;
    }

    public void setVisionRatings(int visionRatings) {
        this.visionRatings = visionRatings;
    }

    public int getCastRatings() {
        return castRatings;
    }

    public void setCastRatings(int castRatings) {
        this.castRatings = castRatings;
    }

    public int getMusicRatings() {
        return musicRatings;
    }

    public void setMusicRatings(int musicRatings) {
        this.musicRatings = musicRatings;
    }

    public int getPlotRatings() {
        return plotRatings;
    }

    public void setPlotRatings(int plotRatings) {
        this.plotRatings = plotRatings;
    }

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

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getTotalSeasons() {
        return totalSeasons;
    }

    public void setTotalSeasons(int totalSeasons) {
        this.totalSeasons = totalSeasons;
    }

    public String getDateReleased() {
        return dateReleased;
    }

    public void setDateReleased(String dateReleased) {
        this.dateReleased = dateReleased;
    }

    public int getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * createdAt : 1636266379327
         * updatedAt : 1654072111794
         * id : 6187718b4d6ad7466702226d
         * poster : https://img.wmdb.tv/movie/poster/1636266379322-edf32a.jpg
         * name : 幸福
         * genre : 剧情/悬疑/惊悚
         * description : 该剧是以新冠疫情结束的近未来为背景的电视剧，新型感染病“狂人病”流行的假设下，直接展现人类的欲望和恐怖，那些被赋予意义的价值们在受到生命威胁时是否能够毫无变化地维持下去，即便如此也不变化的价值究竟是什...
         * language : 韩语
         * country : 韩国
         * lang : Cn
         * shareImage : https://image.querydata.org/movie/poster/1654072111760-6187718b4d6ad74667022269.png
         * movie : 6187718b4d6ad74667022269
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
