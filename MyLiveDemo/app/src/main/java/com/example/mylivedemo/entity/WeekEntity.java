package com.example.mylivedemo.entity;

import java.util.List;

/**
 * @author: create by OlderJiao
 * @date: 2020 2020/1/2 14:00
 */
public class WeekEntity extends BaseEntity{

    /**
     * message : {"anchorRank":[{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201908/1565525069725.png","coin":0,"gameName":"","giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201812280411441545984704526.png","giftId":"10048503","giftName":"大猪蹄子","giftNum":34541,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201812280408581545984538639.png","giftType":7,"level":44,"nickname":"y✨酒酒","rank":1,"roomPushType":1,"roomid":"520299","statusInLive":0,"uid":"qq-104840373"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576164191545.jpeg","coin":10,"gameName":"","giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201809251115001537845300739.png","giftId":"10010411","giftName":"女神","giftNum":82718,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201809251114421537845282282.png","giftType":4,"level":17,"nickname":"是你的柒安吖","rank":1,"roomPushType":1,"roomid":"3658706","statusInLive":1,"uid":"shunm_56111451509"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577633310221.jpeg","coin":10,"gameName":"","giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201906260435481561538148650.png","giftId":"10050412","giftName":"柠檬精","giftNum":120854,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201906260435221561538122198.png","giftType":4,"level":16,"nickname":"艾薇❤️感恩有你","rank":1,"roomPushType":1,"roomid":"520073","statusInLive":0,"uid":"shunm_56111289854"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201908/1565525069725.png","coin":100,"gameName":"","giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201801230214241516688064828.png","giftId":"61","giftName":"荧光棒","giftNum":10063,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201801230212221516687942005.png","giftType":4,"level":44,"nickname":"y✨酒酒","rank":1,"roomPushType":1,"roomid":"520299","statusInLive":0,"uid":"qq-104840373"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576164191545.jpeg","coin":2000,"gameName":"","giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201808230317241535008644778.png","giftId":"10010102","giftName":"有排面","giftNum":570,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201808230316131535008573080.png","giftType":1,"level":17,"nickname":"是你的柒安吖","rank":1,"roomPushType":1,"roomid":"3658706","statusInLive":1,"uid":"shunm_56111451509"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576164191545.jpeg","coin":10000,"gameName":"","giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201711011104461509505486821.png","giftId":"42503","giftName":"流星雨","giftNum":42,"giftPcImg":"https://file.qf.56.com/f/upload/photo/gift/pc/v2/thumb/50/42503_1.png","giftType":1,"level":17,"nickname":"是你的柒安吖","rank":1,"roomPushType":1,"roomid":"3658706","statusInLive":1,"uid":"shunm_56111451509"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577633310221.jpeg","coin":15000,"gameName":"","giftAppImg":"https://file.qf.56.com/f/upload/photo/gift/m/v2/thumb/paoche.png","giftId":"40805","giftName":"跑车","giftNum":73,"giftPcImg":"https://file.qf.56.com/f/upload/photo/gift/pc/v2/thumb/50/40805.png","giftType":2,"level":16,"nickname":"艾薇❤️感恩有你","rank":1,"roomPushType":1,"roomid":"520073","statusInLive":0,"uid":"shunm_56111289854"}],"fansRank":[{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_636,h_635,c_fit,w_100,h_100/u_o_6/862766.jpg","coin":0,"giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201812280411441545984704526.png","giftId":"10048503","giftName":"大猪蹄子","giftNum":23456,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201812280408581545984538639.png","giftType":7,"level":43,"nickname":"y✨酒酒❤陈酿","rank":1,"roomPushType":0,"roomid":"","statusInLive":0,"uid":"shunm_56105196575"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_127,y_0,w_671,h_671,c_fit,w_100,h_100/cs201912/1576880150104.jpeg","coin":10,"giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201809251115001537845300739.png","giftId":"10010411","giftName":"女神","giftNum":11718,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201809251114421537845282282.png","giftType":4,"level":19,"nickname":"亓个小矮人.","rank":1,"roomPushType":0,"roomid":"","statusInLive":0,"uid":"shunm_56111818633"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577277498599.jpeg","coin":10,"giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201906260435481561538148650.png","giftId":"10050412","giftName":"柠檬精","giftNum":62629,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201906260435221561538122198.png","giftType":4,"level":22,"nickname":"艾薇❤️场控","rank":1,"roomPushType":0,"roomid":"","statusInLive":0,"uid":"shunm_5612208057"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_636,h_635,c_fit,w_100,h_100/u_o_6/862766.jpg","coin":100,"giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201801230214241516688064828.png","giftId":"61","giftName":"荧光棒","giftNum":10410,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201801230212221516687942005.png","giftType":4,"level":43,"nickname":"y✨酒酒❤陈酿","rank":1,"roomPushType":0,"roomid":"","statusInLive":0,"uid":"shunm_56105196575"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_20,y_0,w_305,h_305,c_fit,w_100,h_100/cs201912/1576132645012.jpeg","coin":2000,"giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201808230317241535008644778.png","giftId":"10010102","giftName":"有排面","giftNum":126,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201808230316131535008573080.png","giftType":1,"level":21,"nickname":"xiaoyu..","rank":1,"roomPushType":0,"roomid":"","statusInLive":0,"uid":"shunm_56110722188"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_100,h_100/df_100_100.png","coin":10000,"giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201711011104461509505486821.png","giftId":"42503","giftName":"流星雨","giftNum":30,"giftPcImg":"https://file.qf.56.com/f/upload/photo/gift/pc/v2/thumb/50/42503_1.png","giftType":1,"level":12,"nickname":"网友0E2TS3","rank":1,"roomPushType":0,"roomid":"","statusInLive":0,"uid":"shunm_56111320578"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577277498599.jpeg","coin":15000,"giftAppImg":"https://file.qf.56.com/f/upload/photo/gift/m/v2/thumb/paoche.png","giftId":"40805","giftName":"跑车","giftNum":24,"giftPcImg":"https://file.qf.56.com/f/upload/photo/gift/pc/v2/thumb/50/40805.png","giftType":2,"level":22,"nickname":"艾薇❤️场控","rank":1,"roomPushType":0,"roomid":"","statusInLive":0,"uid":"shunm_5612208057"}],"fromDate":"2019-12-23","timestamp":1577944351643,"toDate":"2019-12-29"}
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
         * anchorRank : [{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201908/1565525069725.png","coin":0,"gameName":"","giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201812280411441545984704526.png","giftId":"10048503","giftName":"大猪蹄子","giftNum":34541,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201812280408581545984538639.png","giftType":7,"level":44,"nickname":"y✨酒酒","rank":1,"roomPushType":1,"roomid":"520299","statusInLive":0,"uid":"qq-104840373"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576164191545.jpeg","coin":10,"gameName":"","giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201809251115001537845300739.png","giftId":"10010411","giftName":"女神","giftNum":82718,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201809251114421537845282282.png","giftType":4,"level":17,"nickname":"是你的柒安吖","rank":1,"roomPushType":1,"roomid":"3658706","statusInLive":1,"uid":"shunm_56111451509"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577633310221.jpeg","coin":10,"gameName":"","giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201906260435481561538148650.png","giftId":"10050412","giftName":"柠檬精","giftNum":120854,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201906260435221561538122198.png","giftType":4,"level":16,"nickname":"艾薇❤️感恩有你","rank":1,"roomPushType":1,"roomid":"520073","statusInLive":0,"uid":"shunm_56111289854"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201908/1565525069725.png","coin":100,"gameName":"","giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201801230214241516688064828.png","giftId":"61","giftName":"荧光棒","giftNum":10063,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201801230212221516687942005.png","giftType":4,"level":44,"nickname":"y✨酒酒","rank":1,"roomPushType":1,"roomid":"520299","statusInLive":0,"uid":"qq-104840373"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576164191545.jpeg","coin":2000,"gameName":"","giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201808230317241535008644778.png","giftId":"10010102","giftName":"有排面","giftNum":570,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201808230316131535008573080.png","giftType":1,"level":17,"nickname":"是你的柒安吖","rank":1,"roomPushType":1,"roomid":"3658706","statusInLive":1,"uid":"shunm_56111451509"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576164191545.jpeg","coin":10000,"gameName":"","giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201711011104461509505486821.png","giftId":"42503","giftName":"流星雨","giftNum":42,"giftPcImg":"https://file.qf.56.com/f/upload/photo/gift/pc/v2/thumb/50/42503_1.png","giftType":1,"level":17,"nickname":"是你的柒安吖","rank":1,"roomPushType":1,"roomid":"3658706","statusInLive":1,"uid":"shunm_56111451509"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577633310221.jpeg","coin":15000,"gameName":"","giftAppImg":"https://file.qf.56.com/f/upload/photo/gift/m/v2/thumb/paoche.png","giftId":"40805","giftName":"跑车","giftNum":73,"giftPcImg":"https://file.qf.56.com/f/upload/photo/gift/pc/v2/thumb/50/40805.png","giftType":2,"level":16,"nickname":"艾薇❤️感恩有你","rank":1,"roomPushType":1,"roomid":"520073","statusInLive":0,"uid":"shunm_56111289854"}]
         * fansRank : [{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_636,h_635,c_fit,w_100,h_100/u_o_6/862766.jpg","coin":0,"giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201812280411441545984704526.png","giftId":"10048503","giftName":"大猪蹄子","giftNum":23456,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201812280408581545984538639.png","giftType":7,"level":43,"nickname":"y✨酒酒❤陈酿","rank":1,"roomPushType":0,"roomid":"","statusInLive":0,"uid":"shunm_56105196575"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_127,y_0,w_671,h_671,c_fit,w_100,h_100/cs201912/1576880150104.jpeg","coin":10,"giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201809251115001537845300739.png","giftId":"10010411","giftName":"女神","giftNum":11718,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201809251114421537845282282.png","giftType":4,"level":19,"nickname":"亓个小矮人.","rank":1,"roomPushType":0,"roomid":"","statusInLive":0,"uid":"shunm_56111818633"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577277498599.jpeg","coin":10,"giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201906260435481561538148650.png","giftId":"10050412","giftName":"柠檬精","giftNum":62629,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201906260435221561538122198.png","giftType":4,"level":22,"nickname":"艾薇❤️场控","rank":1,"roomPushType":0,"roomid":"","statusInLive":0,"uid":"shunm_5612208057"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_636,h_635,c_fit,w_100,h_100/u_o_6/862766.jpg","coin":100,"giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201801230214241516688064828.png","giftId":"61","giftName":"荧光棒","giftNum":10410,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201801230212221516687942005.png","giftType":4,"level":43,"nickname":"y✨酒酒❤陈酿","rank":1,"roomPushType":0,"roomid":"","statusInLive":0,"uid":"shunm_56105196575"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_20,y_0,w_305,h_305,c_fit,w_100,h_100/cs201912/1576132645012.jpeg","coin":2000,"giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201808230317241535008644778.png","giftId":"10010102","giftName":"有排面","giftNum":126,"giftPcImg":"https://file.qf.56.com/f/upload/photo/giftNew/pc/201808230316131535008573080.png","giftType":1,"level":21,"nickname":"xiaoyu..","rank":1,"roomPushType":0,"roomid":"","statusInLive":0,"uid":"shunm_56110722188"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_100,h_100/df_100_100.png","coin":10000,"giftAppImg":"https://file.qf.56.com/f/upload/photo/giftNew/app/201711011104461509505486821.png","giftId":"42503","giftName":"流星雨","giftNum":30,"giftPcImg":"https://file.qf.56.com/f/upload/photo/gift/pc/v2/thumb/50/42503_1.png","giftType":1,"level":12,"nickname":"网友0E2TS3","rank":1,"roomPushType":0,"roomid":"","statusInLive":0,"uid":"shunm_56111320578"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577277498599.jpeg","coin":15000,"giftAppImg":"https://file.qf.56.com/f/upload/photo/gift/m/v2/thumb/paoche.png","giftId":"40805","giftName":"跑车","giftNum":24,"giftPcImg":"https://file.qf.56.com/f/upload/photo/gift/pc/v2/thumb/50/40805.png","giftType":2,"level":22,"nickname":"艾薇❤️场控","rank":1,"roomPushType":0,"roomid":"","statusInLive":0,"uid":"shunm_5612208057"}]
         * fromDate : 2019-12-23
         * timestamp : 1577944351643
         * toDate : 2019-12-29
         */

        private String fromDate;
        private long timestamp;
        private String toDate;
        private List<AnchorRankBean> anchorRank;
        private List<FansRankBean> fansRank;

        public String getFromDate() {
            return fromDate;
        }

        public void setFromDate(String fromDate) {
            this.fromDate = fromDate;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }

        public String getToDate() {
            return toDate;
        }

        public void setToDate(String toDate) {
            this.toDate = toDate;
        }

        public List<AnchorRankBean> getAnchorRank() {
            return anchorRank;
        }

        public void setAnchorRank(List<AnchorRankBean> anchorRank) {
            this.anchorRank = anchorRank;
        }

        public List<FansRankBean> getFansRank() {
            return fansRank;
        }

        public void setFansRank(List<FansRankBean> fansRank) {
            this.fansRank = fansRank;
        }

        public static class AnchorRankBean {
            /**
             * avatar : https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201908/1565525069725.png
             * coin : 0
             * gameName :
             * giftAppImg : https://file.qf.56.com/f/upload/photo/giftNew/app/201812280411441545984704526.png
             * giftId : 10048503
             * giftName : 大猪蹄子
             * giftNum : 34541
             * giftPcImg : https://file.qf.56.com/f/upload/photo/giftNew/pc/201812280408581545984538639.png
             * giftType : 7
             * level : 44
             * nickname : y✨酒酒
             * rank : 1
             * roomPushType : 1
             * roomid : 520299
             * statusInLive : 0
             * uid : qq-104840373
             */

            private String avatar;
            private int coin;
            private String gameName;
            private String giftAppImg;
            private String giftId;
            private String giftName;
            private int giftNum;
            private String giftPcImg;
            private int giftType;
            private int level;
            private String nickname;
            private int rank;
            private int roomPushType;
            private String roomid;
            private int statusInLive;
            private String uid;

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public int getCoin() {
                return coin;
            }

            public void setCoin(int coin) {
                this.coin = coin;
            }

            public String getGameName() {
                return gameName;
            }

            public void setGameName(String gameName) {
                this.gameName = gameName;
            }

            public String getGiftAppImg() {
                return giftAppImg;
            }

            public void setGiftAppImg(String giftAppImg) {
                this.giftAppImg = giftAppImg;
            }

            public String getGiftId() {
                return giftId;
            }

            public void setGiftId(String giftId) {
                this.giftId = giftId;
            }

            public String getGiftName() {
                return giftName;
            }

            public void setGiftName(String giftName) {
                this.giftName = giftName;
            }

            public int getGiftNum() {
                return giftNum;
            }

            public void setGiftNum(int giftNum) {
                this.giftNum = giftNum;
            }

            public String getGiftPcImg() {
                return giftPcImg;
            }

            public void setGiftPcImg(String giftPcImg) {
                this.giftPcImg = giftPcImg;
            }

            public int getGiftType() {
                return giftType;
            }

            public void setGiftType(int giftType) {
                this.giftType = giftType;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public int getRank() {
                return rank;
            }

            public void setRank(int rank) {
                this.rank = rank;
            }

            public int getRoomPushType() {
                return roomPushType;
            }

            public void setRoomPushType(int roomPushType) {
                this.roomPushType = roomPushType;
            }

            public String getRoomid() {
                return roomid;
            }

            public void setRoomid(String roomid) {
                this.roomid = roomid;
            }

            public int getStatusInLive() {
                return statusInLive;
            }

            public void setStatusInLive(int statusInLive) {
                this.statusInLive = statusInLive;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }
        }

        public static class FansRankBean {
            /**
             * avatar : https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_636,h_635,c_fit,w_100,h_100/u_o_6/862766.jpg
             * coin : 0
             * giftAppImg : https://file.qf.56.com/f/upload/photo/giftNew/app/201812280411441545984704526.png
             * giftId : 10048503
             * giftName : 大猪蹄子
             * giftNum : 23456
             * giftPcImg : https://file.qf.56.com/f/upload/photo/giftNew/pc/201812280408581545984538639.png
             * giftType : 7
             * level : 43
             * nickname : y✨酒酒❤陈酿
             * rank : 1
             * roomPushType : 0
             * roomid :
             * statusInLive : 0
             * uid : shunm_56105196575
             */

            private String avatar;
            private int coin;
            private String giftAppImg;
            private String giftId;
            private String giftName;
            private int giftNum;
            private String giftPcImg;
            private int giftType;
            private int level;
            private String nickname;
            private int rank;
            private int roomPushType;
            private String roomid;
            private int statusInLive;
            private String uid;

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public int getCoin() {
                return coin;
            }

            public void setCoin(int coin) {
                this.coin = coin;
            }

            public String getGiftAppImg() {
                return giftAppImg;
            }

            public void setGiftAppImg(String giftAppImg) {
                this.giftAppImg = giftAppImg;
            }

            public String getGiftId() {
                return giftId;
            }

            public void setGiftId(String giftId) {
                this.giftId = giftId;
            }

            public String getGiftName() {
                return giftName;
            }

            public void setGiftName(String giftName) {
                this.giftName = giftName;
            }

            public int getGiftNum() {
                return giftNum;
            }

            public void setGiftNum(int giftNum) {
                this.giftNum = giftNum;
            }

            public String getGiftPcImg() {
                return giftPcImg;
            }

            public void setGiftPcImg(String giftPcImg) {
                this.giftPcImg = giftPcImg;
            }

            public int getGiftType() {
                return giftType;
            }

            public void setGiftType(int giftType) {
                this.giftType = giftType;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public int getRank() {
                return rank;
            }

            public void setRank(int rank) {
                this.rank = rank;
            }

            public int getRoomPushType() {
                return roomPushType;
            }

            public void setRoomPushType(int roomPushType) {
                this.roomPushType = roomPushType;
            }

            public String getRoomid() {
                return roomid;
            }

            public void setRoomid(String roomid) {
                this.roomid = roomid;
            }

            public int getStatusInLive() {
                return statusInLive;
            }

            public void setStatusInLive(int statusInLive) {
                this.statusInLive = statusInLive;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }
        }
    }
}
