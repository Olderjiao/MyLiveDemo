package com.example.mylivedemo.entity;

import java.util.List;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/31 9:17
 */
public class RichRankEntity extends BaseEntity{

    /**
     * message : {"rankWealth":[{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1572627482950.png","level":25,"nickname":"往事一切随风","point":258080,"uid":"wx-111410784"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576945011315.png","level":28,"nickname":"後浍芜期","point":167820,"uid":"qq-wvkxjkybwd"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576939343848.jpeg","level":26,"nickname":"小瑾念娇一生","point":116350,"uid":"qq-ttnfgcbamq"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs202001/1577906407566.jpeg","level":25,"nickname":"紫啊紫啊紫~","point":89870,"uid":"qq-awzineqywz"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576814513090.jpeg","level":34,"nickname":"小⑤~而已","point":82210,"uid":"wx-102574423"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576256855468.png","level":19,"nickname":"再不出醉吻不玩了","point":78880,"uid":"qq-7408221"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_432,h_432,c_fit,w_100,h_100/cs201909/1568364413861.jpg","level":26,"nickname":"✨璃珞","point":74980,"uid":"shunm_56100607700"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs202001/1577899609029.jpeg","level":19,"nickname":"⛄林儿响叮当⛄","point":71040,"uid":"qq-nngwwpfozg"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1575286849148.png","level":29,"nickname":"忽悠个妹妹去盖章","point":70040,"uid":"wlunm94_561914996"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_100,h_100/df_100_100.jpg","level":28,"nickname":"网友47IEA0","point":68680,"uid":"shunm_56111434070"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/u_o_4/1026964.png","level":19,"nickname":"网友F54321","point":64360,"uid":"xl-oiimsmtndq"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576461529193.png","level":27,"nickname":"筱曼Mnn","point":57060,"uid":"wlunm79_561760230"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_100,h_100/df_100_100.jpg","level":15,"nickname":"小呀么小二郎","point":56160,"uid":"qq-7837334"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_100,h_100/u_o_6/989896.jpg","level":39,"nickname":"JZ-我是宝宝呀","point":55570,"uid":"qq-orzjiakplr"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/u_o_7/1019777.jpg","level":18,"nickname":"宀于宇","point":52410,"uid":"wx-111135495"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_100,h_100/df_100_100.png","level":14,"nickname":"2020你长点心","point":52060,"uid":"xl-103705349"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_100,h_100/cs201912/1576470566808.jpeg","level":36,"nickname":"嘒彼小小星","point":48800,"uid":"wlunm210_561850086"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_418,h_419,c_fit,w_100,h_100/cs201912/1576402293220.jpeg","level":27,"nickname":"☜涅槃☞","point":48770,"uid":"shunm_56108697405"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1573883960572.jpeg","level":26,"nickname":"✨Fairy鹿z","point":48300,"uid":"wx-106172450"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576844595529.png","level":28,"nickname":"一看就是老实人","point":48180,"uid":"qq-110211784"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201909/1567522642830.png","level":17,"nickname":"库库ku","point":41000,"uid":"shunm_5612160783"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/u_o_1/1045771.png","level":25,"nickname":"不挖不转卸","point":37000,"uid":"wx-110967502"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_60,h_60,c_fit,w_100,h_100/cs201912/1577790584445.jpeg","level":18,"nickname":"撒旦的盛宴","point":35100,"uid":"shunm_56111262842"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_100,h_100/df_100_100.jpg","level":10,"nickname":"网友978496","point":34610,"uid":"qq-9283961"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/u_o_2/941962.png","level":20,"nickname":"依依不舍跪榴莲","point":34140,"uid":"wx-110515016"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201910/1571014523289.jpg","level":26,"nickname":"娇娘的凯旋","point":33720,"uid":"wlunm214_561915814"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1575057996652.jpeg","level":27,"nickname":"闺女是个小可爱","point":33440,"uid":"qq-cvyrjgvyst"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201908/1567125560531.jpg","level":20,"nickname":"无心冷风","point":31550,"uid":"qq-111314754"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577285353544.jpeg","level":33,"nickname":"宝姐的5号跟班","point":31500,"uid":"qq-pkaqkdyypd"},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_100,h_100/u_o_1/33711.jpeg","level":15,"nickname":"找不到回家的路","point":30020,"uid":"qq-yvxptwcynv"}]}
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
        private List<RankWealthBean> rankWealth;

        public List<RankWealthBean> getRankWealth() {
            return rankWealth;
        }

        public void setRankWealth(List<RankWealthBean> rankWealth) {
            this.rankWealth = rankWealth;
        }

        public static class RankWealthBean {
            /**
             * avatar : https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1572627482950.png
             * level : 25
             * nickname : 往事一切随风
             * point : 258080
             * uid : wx-111410784
             */

            private String avatar;
            private int level;
            private String nickname;
            private int point;
            private String uid;

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

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public int getPoint() {
                return point;
            }

            public void setPoint(int point) {
                this.point = point;
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
