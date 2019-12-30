package com.example.mylivedemo.entity;

import java.util.List;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/28 10:43
 */
public class AttentionEntity extends BaseEntity{

    /**
     * message : OK
     * status : 200
     * data : {"total":14,"anchors":[{"uid":"shunm_56111112058","roomid":"520808","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_272,y_35,w_685,h_685,c_fit,w_640,h_640/u_o_6/993456.jpg","nickname":"丫头感谢008!","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_272,y_35,w_685,h_685,c_fit,w_100,h_100/u_o_6/993456.jpg","level":18,"live":1,"hdIconClass":"","watch":7772,"hot":59347,"type":0,"channelShortId":""},{"uid":"shunm_56111086746","roomid":"520049","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1577123588575.png","nickname":"惠酱","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577123588575.png","level":17,"live":1,"hdIconClass":"","watch":3112,"hot":17126,"type":0,"channelShortId":""},{"uid":"shunm_56107521227","roomid":"520712","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1577027165161.jpeg","nickname":"闲扰也想有人陪","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577027165161.jpeg","level":18,"live":1,"hdIconClass":"icon_l_t icon_pk","watch":3753,"hot":11996,"type":0,"channelShortId":""},{"uid":"shunm_56111306841","roomid":"2304843","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201909/1567692748068.jpg","nickname":"西米28号百天","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201909/1567692748068.jpg","level":14,"live":1,"hdIconClass":"","watch":7027,"hot":41222,"type":0,"channelShortId":""},{"uid":"qq-hdslqxuuvo","roomid":"520700","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1083,h_1083,c_fit,w_640,h_640/cs201912/1575255573974.jpeg","nickname":"梦黎.饭多多","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1083,h_1083,c_fit,w_100,h_100/cs201912/1575255573974.jpeg","level":29,"live":1,"hdIconClass":"","watch":6913,"hot":27367,"type":0,"channelShortId":""},{"uid":"shunm_56111298033","roomid":"520678","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1577455622077.png","nickname":"✨北方有思琪~","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577455622077.png","level":19,"live":1,"hdIconClass":"icon_l_t icon_pk","watch":3294,"hot":26224,"type":0,"channelShortId":""},{"uid":"shunm_56111699101","roomid":"2315840","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_4,w_896,h_896,c_fit,w_640,h_640/cs201912/1575426176759.jpeg","nickname":"小妖♡5号满月","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_4,w_896,h_896,c_fit,w_100,h_100/cs201912/1575426176759.jpeg","level":8,"live":1,"hdIconClass":"icon_l_t icon_pk","watch":4057,"hot":12657,"type":0,"channelShortId":""},{"uid":"shunm_56111643318","roomid":"3321286","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_983,w_2248,h_2248,c_fit,w_640,h_640/cs201911/1574747860043.jpeg","nickname":"菲菲31号满月","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_983,w_2248,h_2248,c_fit,w_100,h_100/cs201911/1574747860043.jpeg","level":6,"live":1,"hdIconClass":"","watch":2480,"hot":4104,"type":0,"channelShortId":""},{"uid":"shunm_56111214849","roomid":"520120","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_19,w_726,h_726,c_fit,w_640,h_640/cs201912/1576245274676.jpeg","nickname":"这狙名为-喜欢","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_19,w_726,h_726,c_fit,w_100,h_100/cs201912/1576245274676.jpeg","level":18,"live":1,"hdIconClass":"icon_l_t icon_pk","watch":2983,"hot":6693,"type":0,"channelShortId":""},{"uid":"shunm_56111498719","roomid":"7056369","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1574581119973.jpeg","nickname":"新人、媄祺","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1574581119973.jpeg","level":10,"live":1,"hdIconClass":"icon_l_t icon_pk","watch":2778,"hot":3577,"type":0,"channelShortId":""},{"uid":"wx-110377733","roomid":"520888","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/u_o_5/966755.png","nickname":"樂灬秋梦","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/u_o_5/966755.png","level":18,"live":1,"hdIconClass":"","watch":3328,"hot":6371,"type":0,"channelShortId":""},{"uid":"shunm_56111447419","roomid":"1342625","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_74,w_963,h_963,c_fit,w_640,h_640/cs201911/1574432226920.jpeg","nickname":"汐汐呀","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_74,w_963,h_963,c_fit,w_100,h_100/cs201911/1574432226920.jpeg","level":13,"live":1,"hdIconClass":"","watch":3599,"hot":8674,"type":0,"channelShortId":""},{"uid":"wlunm327_561867433","roomid":"520558","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_1083,h_1083,c_fit,w_640,h_640/u_o_2/949672.jpg","nickname":"武少依旧在","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_1083,h_1083,c_fit,w_100,h_100/u_o_2/949672.jpg","level":21,"live":1,"hdIconClass":"","watch":3235,"hot":6795,"type":0,"channelShortId":""},{"uid":"shunm_56111306857","roomid":"2234402","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_336,y_0,w_955,h_955,c_fit,w_640,h_640/cs201908/1565332000540.jpg","nickname":"夏乐25号百天","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_336,y_0,w_955,h_955,c_fit,w_100,h_100/cs201908/1565332000540.jpg","level":14,"live":1,"hdIconClass":"","watch":3333,"hot":6194,"type":0,"channelShortId":""}]}
     */

    private String message;
    private int status;
    private DataBean data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * total : 14
         * anchors : [{"uid":"shunm_56111112058","roomid":"520808","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_272,y_35,w_685,h_685,c_fit,w_640,h_640/u_o_6/993456.jpg","nickname":"丫头感谢008!","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_272,y_35,w_685,h_685,c_fit,w_100,h_100/u_o_6/993456.jpg","level":18,"live":1,"hdIconClass":"","watch":7772,"hot":59347,"type":0,"channelShortId":""},{"uid":"shunm_56111086746","roomid":"520049","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1577123588575.png","nickname":"惠酱","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577123588575.png","level":17,"live":1,"hdIconClass":"","watch":3112,"hot":17126,"type":0,"channelShortId":""},{"uid":"shunm_56107521227","roomid":"520712","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1577027165161.jpeg","nickname":"闲扰也想有人陪","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577027165161.jpeg","level":18,"live":1,"hdIconClass":"icon_l_t icon_pk","watch":3753,"hot":11996,"type":0,"channelShortId":""},{"uid":"shunm_56111306841","roomid":"2304843","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201909/1567692748068.jpg","nickname":"西米28号百天","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201909/1567692748068.jpg","level":14,"live":1,"hdIconClass":"","watch":7027,"hot":41222,"type":0,"channelShortId":""},{"uid":"qq-hdslqxuuvo","roomid":"520700","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1083,h_1083,c_fit,w_640,h_640/cs201912/1575255573974.jpeg","nickname":"梦黎.饭多多","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1083,h_1083,c_fit,w_100,h_100/cs201912/1575255573974.jpeg","level":29,"live":1,"hdIconClass":"","watch":6913,"hot":27367,"type":0,"channelShortId":""},{"uid":"shunm_56111298033","roomid":"520678","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1577455622077.png","nickname":"✨北方有思琪~","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577455622077.png","level":19,"live":1,"hdIconClass":"icon_l_t icon_pk","watch":3294,"hot":26224,"type":0,"channelShortId":""},{"uid":"shunm_56111699101","roomid":"2315840","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_4,w_896,h_896,c_fit,w_640,h_640/cs201912/1575426176759.jpeg","nickname":"小妖♡5号满月","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_4,w_896,h_896,c_fit,w_100,h_100/cs201912/1575426176759.jpeg","level":8,"live":1,"hdIconClass":"icon_l_t icon_pk","watch":4057,"hot":12657,"type":0,"channelShortId":""},{"uid":"shunm_56111643318","roomid":"3321286","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_983,w_2248,h_2248,c_fit,w_640,h_640/cs201911/1574747860043.jpeg","nickname":"菲菲31号满月","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_983,w_2248,h_2248,c_fit,w_100,h_100/cs201911/1574747860043.jpeg","level":6,"live":1,"hdIconClass":"","watch":2480,"hot":4104,"type":0,"channelShortId":""},{"uid":"shunm_56111214849","roomid":"520120","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_19,w_726,h_726,c_fit,w_640,h_640/cs201912/1576245274676.jpeg","nickname":"这狙名为-喜欢","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_19,w_726,h_726,c_fit,w_100,h_100/cs201912/1576245274676.jpeg","level":18,"live":1,"hdIconClass":"icon_l_t icon_pk","watch":2983,"hot":6693,"type":0,"channelShortId":""},{"uid":"shunm_56111498719","roomid":"7056369","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1574581119973.jpeg","nickname":"新人、媄祺","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1574581119973.jpeg","level":10,"live":1,"hdIconClass":"icon_l_t icon_pk","watch":2778,"hot":3577,"type":0,"channelShortId":""},{"uid":"wx-110377733","roomid":"520888","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/u_o_5/966755.png","nickname":"樂灬秋梦","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/u_o_5/966755.png","level":18,"live":1,"hdIconClass":"","watch":3328,"hot":6371,"type":0,"channelShortId":""},{"uid":"shunm_56111447419","roomid":"1342625","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_74,w_963,h_963,c_fit,w_640,h_640/cs201911/1574432226920.jpeg","nickname":"汐汐呀","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_74,w_963,h_963,c_fit,w_100,h_100/cs201911/1574432226920.jpeg","level":13,"live":1,"hdIconClass":"","watch":3599,"hot":8674,"type":0,"channelShortId":""},{"uid":"wlunm327_561867433","roomid":"520558","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_1083,h_1083,c_fit,w_640,h_640/u_o_2/949672.jpg","nickname":"武少依旧在","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_1083,h_1083,c_fit,w_100,h_100/u_o_2/949672.jpg","level":21,"live":1,"hdIconClass":"","watch":3235,"hot":6795,"type":0,"channelShortId":""},{"uid":"shunm_56111306857","roomid":"2234402","pic":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_336,y_0,w_955,h_955,c_fit,w_640,h_640/cs201908/1565332000540.jpg","nickname":"夏乐25号百天","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_336,y_0,w_955,h_955,c_fit,w_100,h_100/cs201908/1565332000540.jpg","level":14,"live":1,"hdIconClass":"","watch":3333,"hot":6194,"type":0,"channelShortId":""}]
         */

        private int total;
        private List<AnchorsBean> anchors;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<AnchorsBean> getAnchors() {
            return anchors;
        }

        public void setAnchors(List<AnchorsBean> anchors) {
            this.anchors = anchors;
        }

        public static class AnchorsBean {
            /**
             * uid : shunm_56111112058
             * roomid : 520808
             * pic : https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_272,y_35,w_685,h_685,c_fit,w_640,h_640/u_o_6/993456.jpg
             * nickname : 丫头感谢008!
             * avatar : https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_272,y_35,w_685,h_685,c_fit,w_100,h_100/u_o_6/993456.jpg
             * level : 18
             * live : 1
             * hdIconClass :
             * watch : 7772
             * hot : 59347
             * type : 0
             * channelShortId :
             */

            private String uid;
            private String roomid;
            private String pic;
            private String nickname;
            private String avatar;
            private int level;
            private int live;
            private String hdIconClass;
            private int watch;
            private int hot;
            private int type;
            private String channelShortId;

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getRoomid() {
                return roomid;
            }

            public void setRoomid(String roomid) {
                this.roomid = roomid;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
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

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public int getLive() {
                return live;
            }

            public void setLive(int live) {
                this.live = live;
            }

            public String getHdIconClass() {
                return hdIconClass;
            }

            public void setHdIconClass(String hdIconClass) {
                this.hdIconClass = hdIconClass;
            }

            public int getWatch() {
                return watch;
            }

            public void setWatch(int watch) {
                this.watch = watch;
            }

            public int getHot() {
                return hot;
            }

            public void setHot(int hot) {
                this.hot = hot;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getChannelShortId() {
                return channelShortId;
            }

            public void setChannelShortId(String channelShortId) {
                this.channelShortId = channelShortId;
            }
        }
    }
}
