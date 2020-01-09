package com.example.mylivedemo.entity;

/**
 * @author: create by OlderJiao
 * @date: 2020 2020/1/3 10:43
 */
public class LiveEntity extends BaseEntity{

    /**
     * message : {"wide":0,"ifGame":0,"rUrl":"https://v-ngb.qf.56.com/live/981111_1578012928044.flv?wsSecret=010dc54c622bef8c6cfca160e08d0ffb&wsTime=5E0EAA3E&cid=1&ver=ngb&cip=ngb&get_url=9","link":{"status":0},"h265Url":"","streamName":"981111_1578012928044","push":1,"lUrl":"https://v-ngb.qf.56.com/live/981111_1578012928044_200.flv?wsSecret=a579618abccbc598ce7cd75be6645b10&wsTime=5E0EAA3E&cid=1&ver=ngb&cip=ngb&get_url=9","audioUrl":"https://v-rtmp-ngb.qf.56.com/live/981111_1578012928044?only-audio=1&wsSecret=010dc54c622bef8c6cfca160e08d0ffb&wsTime=5E0EAA3E&cid=1&ver=ngb&cip=ngb&get_url=6","hUrl":"https://v-ngb.qf.56.com/live/981111_1578012928044_400.flv?wsSecret=d15121f08265764e52d96bee4c2da07e&wsTime=5E0EAA3E&cid=1&ver=ngb&cip=ngb&get_url=9","expireSeconds":60,"hd":3,"sp":2,"live":1,"direction":0,"fastUrl":"https://$IP$/v-ngb.qf.56.com/live/981111_1578012928044.flv?wsSecret=010dc54c622bef8c6cfca160e08d0ffb&wsTime=5E0EAA3E&cid=1&ver=ngb&cip=ngb&wsiphost=ipdbm"}
     * status : 200
     */

    private MessageBean message;
    private int status;

    public MessageBean getMessage() {
        return message;
    }

    public void setMessage(MessageBean message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class MessageBean {
        /**
         * wide : 0
         * ifGame : 0
         * rUrl : https://v-ngb.qf.56.com/live/981111_1578012928044.flv?wsSecret=010dc54c622bef8c6cfca160e08d0ffb&wsTime=5E0EAA3E&cid=1&ver=ngb&cip=ngb&get_url=9
         * link : {"status":0}
         * h265Url :
         * streamName : 981111_1578012928044
         * push : 1
         * lUrl : https://v-ngb.qf.56.com/live/981111_1578012928044_200.flv?wsSecret=a579618abccbc598ce7cd75be6645b10&wsTime=5E0EAA3E&cid=1&ver=ngb&cip=ngb&get_url=9
         * audioUrl : https://v-rtmp-ngb.qf.56.com/live/981111_1578012928044?only-audio=1&wsSecret=010dc54c622bef8c6cfca160e08d0ffb&wsTime=5E0EAA3E&cid=1&ver=ngb&cip=ngb&get_url=6
         * hUrl : https://v-ngb.qf.56.com/live/981111_1578012928044_400.flv?wsSecret=d15121f08265764e52d96bee4c2da07e&wsTime=5E0EAA3E&cid=1&ver=ngb&cip=ngb&get_url=9
         * expireSeconds : 60
         * hd : 3
         * sp : 2
         * live : 1
         * direction : 0
         * fastUrl : https://$IP$/v-ngb.qf.56.com/live/981111_1578012928044.flv?wsSecret=010dc54c622bef8c6cfca160e08d0ffb&wsTime=5E0EAA3E&cid=1&ver=ngb&cip=ngb&wsiphost=ipdbm
         */

        private int wide;
        private int ifGame;
        private String rUrl;
        private LinkBean link;
        private String h265Url;
        private String streamName;
        private int push;
        private String lUrl;
        private String audioUrl;
        private String hUrl;
        private int expireSeconds;
        private int hd;
        private int sp;
        private int live;
        private int direction;
        private String fastUrl;

        public int getWide() {
            return wide;
        }

        public void setWide(int wide) {
            this.wide = wide;
        }

        public int getIfGame() {
            return ifGame;
        }

        public void setIfGame(int ifGame) {
            this.ifGame = ifGame;
        }

        public String getRUrl() {
            return rUrl;
        }

        public void setRUrl(String rUrl) {
            this.rUrl = rUrl;
        }

        public LinkBean getLink() {
            return link;
        }

        public void setLink(LinkBean link) {
            this.link = link;
        }

        public String getH265Url() {
            return h265Url;
        }

        public void setH265Url(String h265Url) {
            this.h265Url = h265Url;
        }

        public String getStreamName() {
            return streamName;
        }

        public void setStreamName(String streamName) {
            this.streamName = streamName;
        }

        public int getPush() {
            return push;
        }

        public void setPush(int push) {
            this.push = push;
        }

        public String getLUrl() {
            return lUrl;
        }

        public void setLUrl(String lUrl) {
            this.lUrl = lUrl;
        }

        public String getAudioUrl() {
            return audioUrl;
        }

        public void setAudioUrl(String audioUrl) {
            this.audioUrl = audioUrl;
        }

        public String getHUrl() {
            return hUrl;
        }

        public void setHUrl(String hUrl) {
            this.hUrl = hUrl;
        }

        public int getExpireSeconds() {
            return expireSeconds;
        }

        public void setExpireSeconds(int expireSeconds) {
            this.expireSeconds = expireSeconds;
        }

        public int getHd() {
            return hd;
        }

        public void setHd(int hd) {
            this.hd = hd;
        }

        public int getSp() {
            return sp;
        }

        public void setSp(int sp) {
            this.sp = sp;
        }

        public int getLive() {
            return live;
        }

        public void setLive(int live) {
            this.live = live;
        }

        public int getDirection() {
            return direction;
        }

        public void setDirection(int direction) {
            this.direction = direction;
        }

        public String getFastUrl() {
            return fastUrl;
        }

        public void setFastUrl(String fastUrl) {
            this.fastUrl = fastUrl;
        }

        public static class LinkBean {
            /**
             * status : 0
             */

            private int status;

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }
        }
    }
}
