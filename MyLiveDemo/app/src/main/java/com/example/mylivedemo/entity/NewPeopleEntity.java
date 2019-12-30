package com.example.mylivedemo.entity;

import java.util.List;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/30 11:38
 */
public class NewPeopleEntity extends BaseEntity{

    /**
     * message : {"anchors":[{"uid":"shunm_56111643318","roomid":"3321286","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1577629052017.png","nickname":"菲菲31号满月","watch":3037,"shareUrl":"","vid":0,"live":1,"streamName":"","city":""},{"uid":"shunm_56111699101","roomid":"2315840","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_4,w_896,h_896,c_fit,w_640,h_640/cs201912/1575426176759.jpeg","nickname":"小妖♡5号满月","watch":3401,"shareUrl":"","vid":0,"live":1,"streamName":"","city":""},{"uid":"shunm_56111830760","roomid":"6145182","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_211,y_0,w_929,h_929,c_fit,w_640,h_640/cs201912/1577312831802.jpeg","nickname":"新人奶茶第一天","watch":2711,"shareUrl":"","vid":0,"live":1,"streamName":"","city":""},{"uid":"shunm_56111833103","roomid":"5503556","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_187,y_0,w_877,h_877,c_fit,w_640,h_640/cs201912/1577155125321.png","nickname":"魔~娜娜","watch":2907,"shareUrl":"","vid":0,"live":1,"streamName":"","city":""},{"uid":"shunm_56111589717","roomid":"5748283","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1574256407551.jpeg","nickname":"皓瀚-新人小书生","watch":3853,"shareUrl":"","vid":0,"live":1,"streamName":"","city":"四平"},{"uid":"shunm_56111692298","roomid":"1476574","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1575769046363.png","nickname":"风启✦网友的左左","watch":3285,"shareUrl":"","vid":0,"live":1,"streamName":"","city":""},{"uid":"shunm_56111722122","roomid":"9458349","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1080,h_1080,c_fit,w_640,h_640/cs201912/1575703899163.jpeg","nickname":"新人灬萧沐","watch":3378,"shareUrl":"","vid":0,"live":1,"streamName":"","city":""},{"uid":"shunm_56111654499","roomid":"6819057","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_58,y_0,w_2048,h_2048,c_fit,w_640,h_640/cs201911/1574845156904.jpeg","nickname":"新人若~曦求关注","watch":4053,"shareUrl":"","vid":0,"live":1,"streamName":"","city":""},{"uid":"shunm_56106445022","roomid":"7946828","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_146,w_1077,h_1077,c_fit,w_640,h_640/cs201912/1577241627755.jpeg","nickname":"玖幽-涵涵","watch":4037,"shareUrl":"","vid":0,"live":1,"streamName":"","city":""},{"uid":"shunm_56111729272","roomid":"2077197","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1576202772190.png","nickname":"玖幽-橙子","watch":2636,"shareUrl":"","vid":0,"live":1,"streamName":"","city":""},{"uid":"shunm_56111750255","roomid":"9948796","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_369,y_0,w_1536,h_1536,c_fit,w_640,h_640/cs201912/1576124669994.jpeg","nickname":"JD-黯然","watch":3621,"shareUrl":"","vid":0,"live":1,"streamName":"","city":""},{"uid":"shunm_56111607344","roomid":"5740496","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_640,h_640/cs201911/1574302378335.png","nickname":"JD-艾,米","watch":3330,"shareUrl":"","vid":0,"live":1,"streamName":"","city":""},{"uid":"wx-tv11140129","roomid":"6232708","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_97,w_1080,h_1080,c_fit,w_640,h_640/cs201912/1575604920317.jpeg","nickname":"樂灬滕火火","watch":2460,"shareUrl":"","vid":0,"live":1,"streamName":"","city":""},{"uid":"shunm_56111683206","roomid":"2492993","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_143,w_1068,h_1068,c_fit,w_640,h_640/cs201912/1577613112783.jpeg","nickname":"新人丶花艺","watch":2646,"shareUrl":"","vid":0,"live":1,"streamName":"","city":""},{"uid":"shunm_56111804638","roomid":"3399012","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1080,h_1080,c_fit,w_640,h_640/cs201912/1576736491186.jpeg","nickname":"新人柒渺求关注","watch":2500,"shareUrl":"","vid":0,"live":1,"streamName":"","city":"益阳"},{"uid":"wx-tv102437551","roomid":"5692095","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1573895018234.jpeg","nickname":"落小喵","watch":3238,"shareUrl":"","vid":0,"live":1,"streamName":"","city":""},{"uid":"shunm_56110096547","roomid":"7406250","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1576246939183.jpeg","nickname":"薇儿吖、随缘主播","watch":0,"shareUrl":"http://my.tv.sohu.com/us/337150833/168421044.shtml","vid":168421044,"live":2,"streamName":"7406250_1577196273472","city":"鹤岗"},{"uid":"shunm_56111760875","roomid":"9394958","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_45,w_1083,h_1083,c_fit,w_640,h_640/cs201912/1577453180889.jpeg","nickname":"御风~陌言","watch":0,"shareUrl":"http://my.tv.sohu.com/us/348523453/169348575.shtml","vid":169348575,"live":2,"streamName":"9394958_1577618387962","city":""},{"uid":"shunm_56111598981","roomid":"6023777","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_110,y_0,w_1241,h_1241,c_fit,w_640,h_640/cs201911/1573983763660.jpeg","nickname":"小心杆儿","watch":0,"shareUrl":"http://my.tv.sohu.com/us/335951908/167875566.shtml","vid":167875566,"live":2,"streamName":"6023777_1576943213208","city":"绍兴"},{"uid":"shunm_56111726092","roomid":"9215934","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1576327273508.jpeg","nickname":"风启✦阿黑呦","watch":0,"shareUrl":"http://my.tv.sohu.com/us/348332234/166890211.shtml","vid":166890211,"live":2,"streamName":"9215934_1576488813936","city":"沈阳"},{"uid":"shunm_56111784397","roomid":"6005442","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1576547761348.png","nickname":"搜狐-珠海","watch":0,"shareUrl":"http://my.tv.sohu.com/us/348766550/167197207.shtml","vid":167197207,"live":2,"streamName":"6005442_1576641606697","city":"珠海"}]}
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
        private List<AnchorsBean> anchors;

        public List<AnchorsBean> getAnchors() {
            return anchors;
        }

        public void setAnchors(List<AnchorsBean> anchors) {
            this.anchors = anchors;
        }

        public static class AnchorsBean {
            /**
             * uid : shunm_56111643318
             * roomid : 3321286
             * pic51 : https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1577629052017.png
             * nickname : 菲菲31号满月
             * watch : 3037
             * shareUrl :
             * vid : 0
             * live : 1
             * streamName :
             * city :
             */

            private String uid;
            private String roomid;
            private String pic51;
            private String nickname;
            private int watch;
            private String shareUrl;
            private int vid;
            private int live;
            private String streamName;
            private String city;

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

            public String getPic51() {
                return pic51;
            }

            public void setPic51(String pic51) {
                this.pic51 = pic51;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public int getWatch() {
                return watch;
            }

            public void setWatch(int watch) {
                this.watch = watch;
            }

            public String getShareUrl() {
                return shareUrl;
            }

            public void setShareUrl(String shareUrl) {
                this.shareUrl = shareUrl;
            }

            public int getVid() {
                return vid;
            }

            public void setVid(int vid) {
                this.vid = vid;
            }

            public int getLive() {
                return live;
            }

            public void setLive(int live) {
                this.live = live;
            }

            public String getStreamName() {
                return streamName;
            }

            public void setStreamName(String streamName) {
                this.streamName = streamName;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }
        }
    }
}
