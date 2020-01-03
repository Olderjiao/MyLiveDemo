package com.example.mylivedemo.entity;

import java.util.List;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/31 9:29
 */
public class StartRankEntity extends BaseEntity{

    /**
     * message : {"rankStar":[{"isInLive":0,"watcherOnLine":0,"showTime":1577708404,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":367834,"uid":"wx-110996679","nickname":"果然✨小王王","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201910/1570174592743.png","roomId":"520099","lvCount":25003227,"level":20,"sunshine":0,"fanCount":17970,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":0,"showTime":1577718388,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":104591,"uid":"wlunm79_561760230","nickname":"筱曼Mnn","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576461529193.png","roomId":"520968","lvCount":125039192,"level":30,"sunshine":0,"fanCount":253622,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":0,"showTime":1577451284,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":366814,"uid":"shunm_56110969525","nickname":"✨草莓27生日","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/u_o_8/1036908.jpg","roomId":"520920","lvCount":50003225,"level":23,"sunshine":0,"fanCount":21151,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":0,"showTime":1577703328,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":383145,"uid":"shunm_56111451509","nickname":"是你的柒安吖","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576164191545.jpeg","roomId":"3658706","lvCount":8001748,"level":17,"sunshine":0,"fanCount":3533,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":0,"showTime":1577711767,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":370871,"uid":"shunm_56111217662","nickname":"圆妮感恩有你♥","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1574201843497.jpeg","roomId":"6911012","lvCount":5002828,"level":16,"sunshine":0,"fanCount":6553,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":0,"showTime":1577694528,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":342238,"uid":"shunm_56109886432","nickname":"じAmoR安默","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_50,w_1081,h_1081,c_fit,w_100,h_100/cs201911/1573664561489.jpeg","roomId":"520728","lvCount":3000150,"level":15,"sunshine":0,"fanCount":4000,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":0,"showTime":1577718603,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":86609,"uid":"qq-mcnfgsqdps","nickname":"娇娘啊❥","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201910/1572455352872.png","roomId":"6666","lvCount":420040201,"level":39,"sunshine":0,"fanCount":289894,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":0,"showTime":1577686856,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":297336,"uid":"qq-104840373","nickname":"y✨酒酒","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201908/1565525069725.png","roomId":"520299","lvCount":600091926,"level":44,"sunshine":0,"fanCount":198257,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":0,"showTime":1577707663,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":289705,"uid":"shunm_56103234076","nickname":"果然程公子","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1572880244058.png","roomId":"520456","lvCount":41018002,"level":22,"sunshine":0,"fanCount":28082,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":4415,"showTime":1577751591,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":410,"uid":"qq-hdslqxuuvo","nickname":"梦黎.饭多多","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1083,h_1083,c_fit,w_100,h_100/cs201912/1575255573974.jpeg","roomId":"520700","lvCount":110000006,"level":29,"sunshine":0,"fanCount":121666,"createTime":0,"updateTime":0}]}
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
        private List<RankStarBean> rankStar;

        public List<RankStarBean> getRankStar() {
            return rankStar;
        }

        public void setRankStar(List<RankStarBean> rankStar) {
            this.rankStar = rankStar;
        }

        public static class RankStarBean {
            /**
             * isInLive : 0
             * watcherOnLine : 0
             * showTime : 1577708404
             * isWeeklyStar : 0
             * roomPushType : 1
             * gameName :
             * gameIcon :
             * id : 367834
             * uid : wx-110996679
             * nickname : 果然✨小王王
             * avatar : https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201910/1570174592743.png
             * roomId : 520099
             * lvCount : 25003227
             * level : 20
             * sunshine : 0
             * fanCount : 17970
             * createTime : 0
             * updateTime : 0
             */

            private int isInLive;
            private int watcherOnLine;
            private int showTime;
            private int isWeeklyStar;
            private int roomPushType;
            private String gameName;
            private String gameIcon;
            private int id;
            private String uid;
            private String nickname;
            private String avatar;
            private String roomId;
            private int lvCount;
            private int level;
            private int sunshine;
            private int fanCount;
            private int createTime;
            private int updateTime;

            public int getIsInLive() {
                return isInLive;
            }

            public void setIsInLive(int isInLive) {
                this.isInLive = isInLive;
            }

            public int getWatcherOnLine() {
                return watcherOnLine;
            }

            public void setWatcherOnLine(int watcherOnLine) {
                this.watcherOnLine = watcherOnLine;
            }

            public int getShowTime() {
                return showTime;
            }

            public void setShowTime(int showTime) {
                this.showTime = showTime;
            }

            public int getIsWeeklyStar() {
                return isWeeklyStar;
            }

            public void setIsWeeklyStar(int isWeeklyStar) {
                this.isWeeklyStar = isWeeklyStar;
            }

            public int getRoomPushType() {
                return roomPushType;
            }

            public void setRoomPushType(int roomPushType) {
                this.roomPushType = roomPushType;
            }

            public String getGameName() {
                return gameName;
            }

            public void setGameName(String gameName) {
                this.gameName = gameName;
            }

            public String getGameIcon() {
                return gameIcon;
            }

            public void setGameIcon(String gameIcon) {
                this.gameIcon = gameIcon;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getRoomId() {
                return roomId;
            }

            public void setRoomId(String roomId) {
                this.roomId = roomId;
            }

            public int getLvCount() {
                return lvCount;
            }

            public void setLvCount(int lvCount) {
                this.lvCount = lvCount;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public int getSunshine() {
                return sunshine;
            }

            public void setSunshine(int sunshine) {
                this.sunshine = sunshine;
            }

            public int getFanCount() {
                return fanCount;
            }

            public void setFanCount(int fanCount) {
                this.fanCount = fanCount;
            }

            public int getCreateTime() {
                return createTime;
            }

            public void setCreateTime(int createTime) {
                this.createTime = createTime;
            }

            public int getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(int updateTime) {
                this.updateTime = updateTime;
            }
        }
    }
}
