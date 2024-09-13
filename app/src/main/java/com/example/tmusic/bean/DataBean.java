package com.example.tmusic.bean;

import java.util.List;

public class DataBean {

    private List<ImagesBean> images;

    public List<ImagesBean> getImage() {
        return images;
    }
    /**
     * 根据位置获取图片
     * @param position 图片的位置
     * @return 图片对象，如果位置无效则返回 null
     */
    public ImagesBean getImage(int position) {
        if (position >= 0 && position < images.size()) {
            return images.get(position);
        } else {
            // 位置无效，返回 null
            return null;
        }
    }

    public void setImages(List<ImagesBean> images) {
        this.images = images;
    }

    public static class ImagesBean {
        /**
         * url : https://example.com/images/image1.jpg
         * description : 这是第一张图片的描述。
         */

        private String url;
        private String description;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
