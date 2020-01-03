package com.example.mylivedemo.entity;

import java.util.List;

/**
 * @author: create by OlderJiao
 * @date: 2020 2020/1/2 10:38
 */
public class PopularityEntity extends BaseEntity{

    /**
     * message : {"rankPopularity":[{"isInLive":1,"watcherOnLine":4755,"showTime":1577923378,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":410,"uid":"qq-hdslqxuuvo","nickname":"梦黎.饭多多","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1083,h_1083,c_fit,w_100,h_100/cs201912/1575255573974.jpeg","roomId":"520700","lvCount":110000006,"level":29,"sunshine":0,"fanCount":121878,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":0,"showTime":1577914094,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":386909,"uid":"shunm_56111600251","nickname":"你的白菜芯Cy","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1574677489556.jpeg","roomId":"2869778","lvCount":350774,"level":9,"sunshine":0,"fanCount":2050,"createTime":0,"updateTime":0},{"isInLive":1,"watcherOnLine":3385,"showTime":1577923452,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":361317,"uid":"qq-110560812","nickname":"梦黎ღ艾丽莎等你","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_127,y_365,w_1155,h_1155,c_fit,w_100,h_100/cs201910/1572401241503.jpeg","roomId":"520717","lvCount":12008527,"level":18,"sunshine":0,"fanCount":21978,"createTime":0,"updateTime":0},{"isInLive":1,"watcherOnLine":3475,"showTime":1577923197,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":358652,"uid":"wx-110377733","nickname":"樂灬秋梦","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/u_o_5/966755.png","roomId":"520888","lvCount":12000078,"level":18,"sunshine":0,"fanCount":26580,"createTime":0,"updateTime":0},{"isInLive":1,"watcherOnLine":4223,"showTime":1577922498,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":289372,"uid":"shunm_56103540762","nickname":"艾达丶金鼠旺财","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_100,h_100/cs201912/1575354667907.jpeg","roomId":"520188","lvCount":90000023,"level":27,"sunshine":0,"fanCount":172724,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":0,"showTime":1577890778,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":382014,"uid":"shunm_56111351772","nickname":"樂灬我的寶寶","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201910/1570335641610.jpg","roomId":"520116","lvCount":3000313,"level":15,"sunshine":0,"fanCount":4986,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":0,"showTime":1577924013,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":300918,"uid":"qq-105409224","nickname":"樂灬歌手娜娜","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_100,h_100/df_100_100.png","roomId":"2788979","lvCount":5012698,"level":16,"sunshine":0,"fanCount":4873,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":0,"showTime":1577861175,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":384997,"uid":"shunm_56111625339","nickname":"爱唱歌的圆月月","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1575751205047.jpeg","roomId":"1760904","lvCount":800074,"level":11,"sunshine":0,"fanCount":2246,"createTime":0,"updateTime":0},{"isInLive":1,"watcherOnLine":3289,"showTime":1577924786,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":343068,"uid":"shunm_56110052952","nickname":"梦黎☀傲雪新年好","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1572839018476.png","roomId":"520927","lvCount":12000019,"level":18,"sunshine":0,"fanCount":17444,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":0,"showTime":1577859631,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":297336,"uid":"qq-104840373","nickname":"y✨酒酒","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201908/1565525069725.png","roomId":"520299","lvCount":600091926,"level":44,"sunshine":0,"fanCount":198464,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":3472,"showTime":1577915454,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":378403,"uid":"shunm_56111327950","nickname":"二宝宝❤️","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576120924890.png","roomId":"520220","lvCount":3000301,"level":15,"sunshine":0,"fanCount":4106,"createTime":0,"updateTime":0},{"isInLive":1,"watcherOnLine":3394,"showTime":1577923207,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":363213,"uid":"qq-110639523","nickname":"梦黎✠寒心☔冰泪","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_83,w_640,h_640,c_fit,w_100,h_100/cs201909/1568443553731.jpg","roomId":"520119","lvCount":5000439,"level":16,"sunshine":0,"fanCount":5016,"createTime":0,"updateTime":0},{"isInLive":1,"watcherOnLine":3248,"showTime":1577925176,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":385410,"uid":"shunm_56111521939","nickname":"双双25号满月啦","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576570557117.jpeg","roomId":"3810383","lvCount":841360,"level":11,"sunshine":0,"fanCount":2327,"createTime":0,"updateTime":0},{"isInLive":1,"watcherOnLine":3455,"showTime":1577920615,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":76854,"uid":"wlunm327_561867433","nickname":"武少、金鼠纳福","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_1083,h_1083,c_fit,w_100,h_100/u_o_2/949672.jpg","roomId":"520558","lvCount":33000023,"level":21,"sunshine":0,"fanCount":137965,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":0,"showTime":1577883008,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":387721,"uid":"shunm_56111706698","nickname":"弥音~思佳吖","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_230,y_0,w_821,h_821,c_fit,w_100,h_100/cs201912/1575454624140.jpeg","roomId":"9565752","lvCount":16095,"level":4,"sunshine":0,"fanCount":192,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":0,"showTime":1577900889,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":371028,"uid":"shunm_56111235916","nickname":"当你沉睡时.","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_154,w_2153,h_2153,c_fit,w_100,h_100/cs201912/1576856464138.jpeg","roomId":"520203","lvCount":5000700,"level":16,"sunshine":0,"fanCount":7189,"createTime":0,"updateTime":0},{"isInLive":1,"watcherOnLine":3614,"showTime":1577887149,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":384310,"uid":"shunm_56111498719","nickname":"新人、媄祺","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1574581119973.jpeg","roomId":"7056369","lvCount":807425,"level":11,"sunshine":0,"fanCount":2469,"createTime":0,"updateTime":0},{"isInLive":1,"watcherOnLine":3752,"showTime":1577916167,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":316253,"uid":"shunm_56107521227","nickname":"闲扰也想有人陪","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577027165161.jpeg","roomId":"520712","lvCount":18000189,"level":19,"sunshine":0,"fanCount":35857,"createTime":0,"updateTime":0},{"isInLive":1,"watcherOnLine":2968,"showTime":1577926026,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":387549,"uid":"shunm_56111750255","nickname":"JD-黯然","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_369,y_0,w_1536,h_1536,c_fit,w_100,h_100/cs201912/1576124669994.jpeg","roomId":"9948796","lvCount":100355,"level":7,"sunshine":0,"fanCount":423,"createTime":0,"updateTime":0},{"isInLive":1,"watcherOnLine":3041,"showTime":1577926155,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":375334,"uid":"shunm_56111320120","nickname":"*久久*","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_100,h_100/cs201910/1570588332729.jpg","roomId":"3715100","lvCount":800084,"level":11,"sunshine":0,"fanCount":3215,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":3037,"showTime":1577926613,"isWeeklyStar":0,"roomPushType":3,"gameName":"","gameIcon":"","id":386603,"uid":"wx-111102535","nickname":"奇迹ღ和平路佳琦","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_127,w_1283,h_1283,c_fit,w_100,h_100/cs202001/1577921568182.jpeg","roomId":"6656267","lvCount":350000,"level":9,"sunshine":0,"fanCount":820,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":0,"showTime":1577924977,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":385606,"uid":"qq-111524945","nickname":"JD-新人傻丫头","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_34,y_38,w_747,h_747,c_fit,w_100,h_100/cs201911/1572745855208.png","roomId":"9974352","lvCount":200460,"level":8,"sunshine":0,"fanCount":1351,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":0,"showTime":1577888215,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":387742,"uid":"wx-tv101375461","nickname":"云弋-冒冒","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_629,h_629,c_fit,w_100,h_100/cs201912/1576332679771.jpeg","roomId":"2660597","lvCount":30045,"level":5,"sunshine":0,"fanCount":406,"createTime":0,"updateTime":0},{"isInLive":1,"watcherOnLine":3949,"showTime":1577917535,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":388404,"uid":"shunm_56106445022","nickname":"玖幽-涵涵","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_146,w_1077,h_1077,c_fit,w_100,h_100/cs201912/1577241627755.jpeg","roomId":"7946828","lvCount":200235,"level":8,"sunshine":0,"fanCount":945,"createTime":0,"updateTime":0},{"isInLive":1,"watcherOnLine":3274,"showTime":1577928173,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":369105,"uid":"shunm_56111086746","nickname":"惠酱","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577123588575.png","roomId":"520049","lvCount":8018542,"level":17,"sunshine":0,"fanCount":13084,"createTime":0,"updateTime":0},{"isInLive":1,"watcherOnLine":2873,"showTime":1577927731,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":387107,"uid":"shunm_56111607344","nickname":"JD-艾,米","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_100,h_100/cs201911/1574302390594.png","roomId":"5740496","lvCount":100900,"level":7,"sunshine":0,"fanCount":842,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":0,"showTime":1577890612,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":51104,"uid":"qq-anzgibkgbw","nickname":"高冷喵祝新年快乐","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_100,h_100/u_o_0/51620.jpeg","roomId":"520016","lvCount":60003374,"level":24,"sunshine":0,"fanCount":227631,"createTime":0,"updateTime":0},{"isInLive":1,"watcherOnLine":3474,"showTime":1577923210,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":385156,"uid":"shunm_56111699101","nickname":"小妖♡5号满月","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_4,w_896,h_896,c_fit,w_100,h_100/cs201912/1575426176759.jpeg","roomId":"2315840","lvCount":350124,"level":9,"sunshine":0,"fanCount":1281,"createTime":0,"updateTime":0},{"isInLive":0,"watcherOnLine":0,"showTime":1577884392,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":370871,"uid":"shunm_56111217662","nickname":"圆妮感恩有你♥","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1574201843497.jpeg","roomId":"6911012","lvCount":5002828,"level":16,"sunshine":0,"fanCount":6606,"createTime":0,"updateTime":0},{"isInLive":1,"watcherOnLine":3310,"showTime":1577925339,"isWeeklyStar":0,"roomPushType":1,"gameName":"","gameIcon":"","id":369513,"uid":"shunm_56111150604","nickname":"曦宝会跳舞♓","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_178,w_1050,h_1050,c_fit,w_100,h_100/cs201909/1569478925278.jpg","roomId":"520225","lvCount":8000854,"level":17,"sunshine":0,"fanCount":20974,"createTime":0,"updateTime":0}]}
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
        private List<RankPopularityBean> rankPopularity;

        public List<RankPopularityBean> getRankPopularity() {
            return rankPopularity;
        }

        public void setRankPopularity(List<RankPopularityBean> rankPopularity) {
            this.rankPopularity = rankPopularity;
        }

        public static class RankPopularityBean {
            /**
             * isInLive : 1
             * watcherOnLine : 4755
             * showTime : 1577923378
             * isWeeklyStar : 0
             * roomPushType : 1
             * gameName :
             * gameIcon :
             * id : 410
             * uid : qq-hdslqxuuvo
             * nickname : 梦黎.饭多多
             * avatar : https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1083,h_1083,c_fit,w_100,h_100/cs201912/1575255573974.jpeg
             * roomId : 520700
             * lvCount : 110000006
             * level : 29
             * sunshine : 0
             * fanCount : 121878
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
