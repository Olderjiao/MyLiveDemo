package com.example.mylivedemo.entity;

import java.util.List;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/27 11:38
 */
public class HomeEntity extends BaseEntity{

    /**
     * message : {"total":500,"tags":[],"headline":{"uid":"shunm_56110482342","tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1573965892635.jpeg","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1573965892635.jpeg","nickname":"安然想我了吗","gameId":0,"gameName":"","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1573965892635.jpeg","push":1,"roomid":"520052","point":600200,"title":"","charge":0,"mic":0,"gameIcon":"","hot":8645,"weeklyStar":1,"focus":2062,"vid":0,"pk":0,"live":1},"anchors":[{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/u_o_1/1054731.png","uid":"shunm_56111197375","roomid":"981111","name":"白露✨29半周年","roomname":"白露✨29半周年的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/u_o_1/1054731.png","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/u_o_1/1054731.png","live":1,"push":1,"focus":2761,"hot":9998,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":212},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577080906763.jpeg","uid":"shunm_56111429647","roomid":"3462039","name":"樂灬佳琪生日快乐","roomname":"樂灬佳琪生日快乐的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1577080906763.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1577080906763.jpeg","live":1,"push":1,"focus":2070,"hot":4174,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"},{"type":2,"tagId":1308,"tagName":"颜值"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":146},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_4,w_896,h_896,c_fit,w_100,h_100/cs201912/1575426176759.jpeg","uid":"shunm_56111699101","roomid":"2315840","name":"小妖♡5号满月","roomname":"小妖♡5号满月的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_4,w_896,h_896,c_fit,w_640,h_640/cs201912/1575426176759.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_4,w_896,h_896,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1575426176759.jpeg","live":1,"push":1,"focus":3519,"hot":7950,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":126},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576885167405.png","uid":"shunm_56111298033","roomid":"520678","name":"✨北方有思琪~","roomname":"✨北方有思琪~的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1576885167405.png","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1576885167405.png","live":1,"push":1,"focus":3890,"hot":13945,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":1,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":124},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577409746294.jpeg","uid":"qq-111521893","roomid":"6955338","name":"云弋♥奶酪吖","roomname":"云弋♥奶酪吖的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1577409746294.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1577409746294.jpeg","live":1,"push":1,"focus":2930,"hot":4845,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":124},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_234,w_1077,h_1077,c_fit,w_100,h_100/u_o_3/1043733.jpg","uid":"shunm_56111274188","roomid":"2968698","name":"瑗瑗没人疼","roomname":"瑗瑗没人疼的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_234,w_1077,h_1077,c_fit,w_640,h_640/u_o_3/1043733.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_234,w_1077,h_1077,c_fit,w_640,h_640,o_convert,f_webp/u_o_3/1043733.jpg","live":1,"push":1,"focus":2100,"hot":3913,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":119},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201909/1567692748068.jpg","uid":"shunm_56111306841","roomid":"2304843","name":"西米28号百天","roomname":"西米28号百天的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201909/1567692748068.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201909/1567692748068.jpg","live":1,"push":1,"focus":3517,"hot":9754,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":119},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_347,w_1288,h_1288,c_fit,w_100,h_100/cs201912/1577260779269.jpeg","uid":"shunm_56101742743","roomid":"520555","name":"樂灬若水默默的","roomname":"樂灬若水默默的的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_347,w_1288,h_1288,c_fit,w_640,h_640/cs201912/1577260779269.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_347,w_1288,h_1288,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1577260779269.jpeg","live":1,"push":1,"focus":3281,"hot":9762,"tags":[{"type":3,"tagId":1804,"tagName":"唱将"},{"type":2,"tagId":1306,"tagName":"好声音"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":108},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1573746454270.png","uid":"shunm_56111530222","roomid":"3923482","name":"恬恬16号满月","roomname":"恬恬16号满月的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1573746454270.png","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1573746454270.png","live":1,"push":1,"focus":3676,"hot":8906,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":102},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1572613724153.jpeg","uid":"qq-111116031","roomid":"6759193","name":"风启✦子近","roomname":"风启✦子近的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1572613724153.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1572613724153.jpeg","live":1,"push":1,"focus":5478,"hot":27023,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":98},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_983,w_2248,h_2248,c_fit,w_100,h_100/cs201911/1574747860043.jpeg","uid":"shunm_56111643318","roomid":"3321286","name":"皓瀚菲菲第一天","roomname":"皓瀚菲菲第一天的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_983,w_2248,h_2248,c_fit,w_640,h_640/cs201911/1574747860043.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_983,w_2248,h_2248,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574747860043.jpeg","live":1,"push":1,"focus":3059,"hot":3704,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":98},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1574573868379.jpeg","uid":"shunm_56111626402","roomid":"7462036","name":"新人、靖靖","roomname":"新人、靖靖的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1574573868379.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574573868379.jpeg","live":1,"push":1,"focus":2959,"hot":4624,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":95},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576570557117.jpeg","uid":"shunm_56111521939","roomid":"3810383","name":"双双25号满月啦","roomname":"双双25号满月啦的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1576570557117.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1576570557117.jpeg","live":1,"push":1,"focus":3128,"hot":6515,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":92},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1574677489556.jpeg","uid":"shunm_56111600251","roomid":"2869778","name":"你的白菜芯Cy","roomname":"你的白菜芯Cy的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1574677489556.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574677489556.jpeg","live":1,"push":1,"focus":3236,"hot":6702,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":87},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_273,y_0,w_721,h_721,c_fit,w_100,h_100/cs201911/1572934762341.jpeg","uid":"shunm_56110930365","roomid":"520511","name":"*悠悠*","roomname":"*悠悠*的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_273,y_0,w_721,h_721,c_fit,w_640,h_640/cs201911/1572934762341.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_273,y_0,w_721,h_721,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1572934762341.jpeg","live":1,"push":1,"focus":2735,"hot":5838,"tags":[{"type":3,"tagId":1806,"tagName":"才艺咖"},{"type":2,"tagId":1504,"tagName":"多才多艺"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":84},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_17,w_624,h_624,c_fit,w_100,h_100/cs201908/1566381655805.jpg","uid":"wlunm256_561547274","roomid":"520133","name":"鱼夏在等你。","roomname":"鱼夏在等你。的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_17,w_624,h_624,c_fit,w_640,h_640/cs201908/1566381655805.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_17,w_624,h_624,c_fit,w_640,h_640,o_convert,f_webp/cs201908/1566381655805.jpg","live":1,"push":1,"focus":3598,"hot":11695,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"},{"type":2,"tagId":1308,"tagName":"颜值"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":83},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1574256407551.jpeg","uid":"shunm_56111589717","roomid":"5748283","name":"皓瀚-新人小书生","roomname":"皓瀚-新人小书生的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1574256407551.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574256407551.jpeg","live":1,"push":1,"focus":3186,"hot":4563,"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":79},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1574581119973.jpeg","uid":"shunm_56111498719","roomid":"7056369","name":"新人、媄祺","roomname":"新人、媄祺的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1574581119973.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574581119973.jpeg","live":1,"push":1,"focus":3169,"hot":5495,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":74},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1573350309318.jpeg","uid":"shunm_56111289854","roomid":"520073","name":"谁的小宝贝呀","roomname":"谁的小宝贝呀的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1573350309318.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1573350309318.jpeg","live":1,"push":1,"focus":3721,"hot":6705,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":74},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_187,y_0,w_877,h_877,c_fit,w_100,h_100/cs201912/1577155125321.png","uid":"shunm_56111833103","roomid":"5503556","name":"魔~娜娜","roomname":"魔~娜娜的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_187,y_0,w_877,h_877,c_fit,w_640,h_640/cs201912/1577155125321.png","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_187,y_0,w_877,h_877,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1577155125321.png","live":1,"push":1,"focus":3195,"hot":4369,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":72},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_14,y_0,w_1066,h_1066,c_fit,w_100,h_100/cs201911/1572943700623.jpeg","uid":"shunm_56111543432","roomid":"5761679","name":"新人~浅影","roomname":"新人~浅影的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_14,y_0,w_1066,h_1066,c_fit,w_640,h_640/cs201911/1572943700623.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_14,y_0,w_1066,h_1066,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1572943700623.jpeg","live":1,"push":1,"focus":3143,"hot":4613,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":71},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_19,w_726,h_726,c_fit,w_100,h_100/cs201912/1576245274676.jpeg","uid":"shunm_56111214849","roomid":"520120","name":"这狙名为-喜欢","roomname":"这狙名为-喜欢的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_19,w_726,h_726,c_fit,w_640,h_640/cs201912/1576245274676.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_19,w_726,h_726,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1576245274676.jpeg","live":1,"push":1,"focus":3707,"hot":8954,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"},{"type":2,"tagId":1308,"tagName":"颜值"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":71},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_58,y_0,w_2048,h_2048,c_fit,w_100,h_100/cs201911/1574845156904.jpeg","uid":"shunm_56111654499","roomid":"6819057","name":"新人若~曦求关注","roomname":"新人若~曦求关注的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_58,y_0,w_2048,h_2048,c_fit,w_640,h_640/cs201911/1574845156904.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_58,y_0,w_2048,h_2048,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574845156904.jpeg","live":1,"push":1,"focus":3195,"hot":5300,"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":71},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/u_o_5/966755.png","uid":"wx-110377733","roomid":"520888","name":"樂灬秋梦","roomname":"樂灬秋梦的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/u_o_5/966755.png","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/u_o_5/966755.png","live":1,"push":1,"focus":3803,"hot":7581,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":70},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_100,h_100/cs201911/1574302390594.png","uid":"shunm_56111607344","roomid":"5740496","name":"JD-艾,米","roomname":"JD-艾,米的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_640,h_640/cs201911/1574302378335.png","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574302378335.png","live":1,"push":1,"focus":3708,"hot":8504,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":68},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_118,w_944,h_944,c_fit,w_100,h_100/cs201910/1571625386914.jpg","uid":"shunm_56111462682","roomid":"3125784","name":"晴天虎爷","roomname":"晴天虎爷的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_118,w_944,h_944,c_fit,w_640,h_640/cs201910/1571625386914.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_118,w_944,h_944,c_fit,w_640,h_640,o_convert,f_webp/cs201910/1571625386914.jpg","live":1,"push":1,"focus":3398,"hot":6851,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":67},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1574417700022.jpeg","uid":"wx-109967414","roomid":"7610477","name":"阿悦、","roomname":"阿悦、的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1574417700022.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574417700022.jpeg","live":1,"push":1,"focus":2547,"hot":4149,"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":67},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_1083,h_1083,c_fit,w_100,h_100/u_o_2/949672.jpg","uid":"wlunm327_561867433","roomid":"520558","name":"武少依旧在","roomname":"武少依旧在的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_1083,h_1083,c_fit,w_640,h_640/u_o_2/949672.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_1083,h_1083,c_fit,w_640,h_640,o_convert,f_webp/u_o_2/949672.jpg","live":1,"push":1,"focus":3284,"hot":5422,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":66},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1075,h_1075,c_fit,w_100,h_100/cs201912/1576236066099.jpeg","uid":"qq-110979658","roomid":"3724804","name":"风启✦小蹦迪","roomname":"风启✦小蹦迪的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1075,h_1075,c_fit,w_640,h_640/cs201912/1576236066099.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1075,h_1075,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1576236066099.jpeg","live":1,"push":1,"focus":2982,"hot":6555,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":64},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1572839018476.png","uid":"shunm_56110052952","roomid":"520927","name":"梦黎☀傲雪感恩心","roomname":"梦黎☀傲雪感恩心的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1572839018476.png","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1572839018476.png","live":1,"push":1,"focus":3025,"hot":5490,"tags":[{"type":3,"tagId":1804,"tagName":"唱将"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":64},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_70,w_1083,h_1083,c_fit,w_100,h_100/cs201909/1569141615654.jpg","uid":"shunm_56110718609","roomid":"6700787","name":"悠然等你来疼","roomname":"悠然等你来疼的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_70,w_1083,h_1083,c_fit,w_640,h_640/cs201909/1569141615654.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_70,w_1083,h_1083,c_fit,w_640,h_640,o_convert,f_webp/cs201909/1569141615654.jpg","live":1,"push":1,"focus":2537,"hot":4662,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":64},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_190,y_24,w_690,h_690,c_fit,w_100,h_100/cs201911/1575101791915.jpeg","uid":"shunm_56111679257","roomid":"7176304","name":"~苏苏~","roomname":"~苏苏~的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_190,y_24,w_690,h_690,c_fit,w_640,h_640/cs201911/1575101791915.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_190,y_24,w_690,h_690,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1575101791915.jpeg","live":1,"push":1,"focus":1984,"hot":2006,"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":64},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_336,y_0,w_955,h_955,c_fit,w_100,h_100/cs201908/1565332000540.jpg","uid":"shunm_56111306857","roomid":"2234402","name":"夏乐25号百天","roomname":"夏乐25号百天的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_336,y_0,w_955,h_955,c_fit,w_640,h_640/cs201908/1565332000540.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_336,y_0,w_955,h_955,c_fit,w_640,h_640,o_convert,f_webp/cs201908/1565332000540.jpg","live":1,"push":1,"focus":3385,"hot":5950,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":63},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576358139984.jpeg","uid":"shunm_56111323576","roomid":"3377753","name":"冰冰28号满月","roomname":"冰冰28号满月的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1576358139984.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1576358139984.jpeg","live":1,"push":1,"focus":3282,"hot":5720,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":63},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/u_o_2/959052.jpg","uid":"shunm_56110917040","roomid":"520889","name":"馨儿✨你的宝","roomname":"馨儿✨你的宝的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/u_o_2/959052.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/u_o_2/959052.jpg","live":1,"push":1,"focus":2722,"hot":4255,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"},{"type":2,"tagId":1308,"tagName":"颜值"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":61},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/u_o_5/1031875.jpg","uid":"shunm_56109338308","roomid":"521777","name":"默默喜欢我","roomname":"默默喜欢我的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/u_o_5/1031875.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/u_o_5/1031875.jpg","live":1,"push":1,"focus":3011,"hot":6245,"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":61},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_216,w_1081,h_1081,c_fit,w_100,h_100/cs201912/1575780580476.jpeg","uid":"shunm_56111683206","roomid":"2492993","name":"新人丶花艺","roomname":"新人丶花艺的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_216,w_1081,h_1081,c_fit,w_640,h_640/cs201912/1575780580476.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_216,w_1081,h_1081,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1575780580476.jpeg","live":1,"push":1,"focus":3189,"hot":5096,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":60},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577274043340.jpeg","uid":"shunm_56111316755","roomid":"6578028","name":"风启✦新人心安","roomname":"风启✦新人心安的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1577274043340.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1577274043340.jpeg","live":1,"push":1,"focus":3229,"hot":5709,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":59},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201908/1566471680408.jpg","uid":"shunm_56111255246","roomid":"1021465","name":"JD新人文浩","roomname":"JD新人文浩的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201908/1566471680408.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201908/1566471680408.jpg","live":1,"push":1,"focus":3282,"hot":6514,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":58},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576511558918.jpeg","uid":"qq-2279908","roomid":"6697682","name":"JD-善待明明","roomname":"JD-善待明明的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1576511558918.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1576511558918.jpeg","live":1,"push":1,"focus":3425,"hot":7469,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":56},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_23,y_281,w_1054,h_1054,c_fit,w_100,h_100/cs201911/1575106789671.jpeg","uid":"shunm_56111679516","roomid":"7682398","name":"~~伍六七~~","roomname":"~~伍六七~~的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_23,y_281,w_1054,h_1054,c_fit,w_640,h_640/cs201911/1575106789671.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_23,y_281,w_1054,h_1054,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1575106789671.jpeg","live":1,"push":1,"focus":1396,"hot":735,"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":56},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_74,w_963,h_963,c_fit,w_100,h_100/cs201911/1574432226920.jpeg","uid":"shunm_56111447419","roomid":"1342625","name":"汐汐呀","roomname":"汐汐呀的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_74,w_963,h_963,c_fit,w_640,h_640/cs201911/1574432226920.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_74,w_963,h_963,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574432226920.jpeg","live":1,"push":1,"focus":3236,"hot":5784,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":55},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_122,w_1075,h_1075,c_fit,w_100,h_100/cs201909/1568701401948.jpg","uid":"shunm_56111218204","roomid":"1063307","name":"风启✦七道","roomname":"风启✦七道的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_122,w_1075,h_1075,c_fit,w_640,h_640/cs201909/1568701401948.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_122,w_1075,h_1075,c_fit,w_640,h_640,o_convert,f_webp/cs201909/1568701401948.jpg","live":1,"push":1,"focus":2691,"hot":4787,"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":53},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1080,h_1080,c_fit,w_100,h_100/cs201911/1574304017227.jpeg","uid":"shunm_56111563163","roomid":"2394788","name":"风启✦玖狐","roomname":"风启✦玖狐的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1080,h_1080,c_fit,w_640,h_640/cs201911/1574304017227.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1080,h_1080,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574304017227.jpeg","live":1,"push":1,"focus":2899,"hot":4452,"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":53},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576501513693.jpeg","uid":"shunm_56111362681","roomid":"5667266","name":"新人苏楠","roomname":"新人苏楠的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_640,h_640/cs201912/1577262349200.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_640,h_640,o_convert,f_webp/cs201912/1577262349200.jpeg","live":1,"push":1,"focus":3361,"hot":6929,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":52},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_369,y_0,w_1536,h_1536,c_fit,w_100,h_100/cs201912/1576124669994.jpeg","uid":"shunm_56111750255","roomid":"9948796","name":"JD-黯然","roomname":"JD-黯然的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_369,y_0,w_1536,h_1536,c_fit,w_640,h_640/cs201912/1576124669994.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_369,y_0,w_1536,h_1536,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1576124669994.jpeg","live":1,"push":1,"focus":3329,"hot":6670,"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":51},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_7,w_1078,h_1078,c_fit,w_100,h_100/u_o_5/900795.jpg","uid":"shunm_56108882063","roomid":"9469440","name":"Hy家洺新人","roomname":"Hy家洺新人的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_7,w_1078,h_1078,c_fit,w_640,h_640/u_o_5/900795.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_7,w_1078,h_1078,c_fit,w_640,h_640,o_convert,f_webp/u_o_5/900795.jpg","live":1,"push":1,"focus":1063,"hot":1517,"tags":[{"type":3,"tagId":1804,"tagName":"唱将"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":50}],"activitys":[],"news":[],"banners":[{"id":1053,"name":"艺能房","picUrl":"https://00cdc5c2e0ddc.cdn.sohucs.com/cs201908/1566443242230.jpg","linkUrl":"https://qf.56.com/feh5/vu/special/artistic.html#/","dynamicUrl":"","countdown":0,"roomids":"","blackRoomids":"","showClient":0,"showTimes":0,"showPlat":0,"showFrom":"","rankOrder":2,"begintime":1537261200000,"endtime":1631955600000,"num":0,"minVersion":"","maxVersion":"","isShow":0,"minBannerVersion":{"major":0,"minor":0,"revision":0},"maxBannerVersion":{"major":0,"minor":0,"revision":0},"schemeUrl":"","downloadUrl":"","desc":""},{"id":18,"name":"周星6+1","picUrl":"https://file.qf.56.com/f/upload/photo/activity/app/201808270525191535361919070.jpg","linkUrl":"https://qf.56.com/activity/week_star_h5/index.html","dynamicUrl":"","countdown":0,"roomids":"","blackRoomids":"","showClient":0,"showTimes":0,"showPlat":0,"showFrom":"","rankOrder":4,"begintime":1498406400000,"endtime":1593153900000,"num":0,"minVersion":"","maxVersion":"","isShow":0,"minBannerVersion":{"major":0,"minor":0,"revision":0},"maxBannerVersion":{"major":0,"minor":0,"revision":0},"schemeUrl":"","downloadUrl":"","desc":""}]}
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
         * total : 500
         * tags : []
         * headline : {"uid":"shunm_56110482342","tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1573965892635.jpeg","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1573965892635.jpeg","nickname":"安然想我了吗","gameId":0,"gameName":"","avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1573965892635.jpeg","push":1,"roomid":"520052","point":600200,"title":"","charge":0,"mic":0,"gameIcon":"","hot":8645,"weeklyStar":1,"focus":2062,"vid":0,"pk":0,"live":1}
         * anchors : [{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/u_o_1/1054731.png","uid":"shunm_56111197375","roomid":"981111","name":"白露✨29半周年","roomname":"白露✨29半周年的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/u_o_1/1054731.png","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/u_o_1/1054731.png","live":1,"push":1,"focus":2761,"hot":9998,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":212},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577080906763.jpeg","uid":"shunm_56111429647","roomid":"3462039","name":"樂灬佳琪生日快乐","roomname":"樂灬佳琪生日快乐的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1577080906763.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1577080906763.jpeg","live":1,"push":1,"focus":2070,"hot":4174,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"},{"type":2,"tagId":1308,"tagName":"颜值"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":146},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_4,w_896,h_896,c_fit,w_100,h_100/cs201912/1575426176759.jpeg","uid":"shunm_56111699101","roomid":"2315840","name":"小妖♡5号满月","roomname":"小妖♡5号满月的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_4,w_896,h_896,c_fit,w_640,h_640/cs201912/1575426176759.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_4,w_896,h_896,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1575426176759.jpeg","live":1,"push":1,"focus":3519,"hot":7950,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":126},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576885167405.png","uid":"shunm_56111298033","roomid":"520678","name":"✨北方有思琪~","roomname":"✨北方有思琪~的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1576885167405.png","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1576885167405.png","live":1,"push":1,"focus":3890,"hot":13945,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":1,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":124},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577409746294.jpeg","uid":"qq-111521893","roomid":"6955338","name":"云弋♥奶酪吖","roomname":"云弋♥奶酪吖的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1577409746294.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1577409746294.jpeg","live":1,"push":1,"focus":2930,"hot":4845,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":124},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_234,w_1077,h_1077,c_fit,w_100,h_100/u_o_3/1043733.jpg","uid":"shunm_56111274188","roomid":"2968698","name":"瑗瑗没人疼","roomname":"瑗瑗没人疼的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_234,w_1077,h_1077,c_fit,w_640,h_640/u_o_3/1043733.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_234,w_1077,h_1077,c_fit,w_640,h_640,o_convert,f_webp/u_o_3/1043733.jpg","live":1,"push":1,"focus":2100,"hot":3913,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":119},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201909/1567692748068.jpg","uid":"shunm_56111306841","roomid":"2304843","name":"西米28号百天","roomname":"西米28号百天的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201909/1567692748068.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201909/1567692748068.jpg","live":1,"push":1,"focus":3517,"hot":9754,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":119},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_347,w_1288,h_1288,c_fit,w_100,h_100/cs201912/1577260779269.jpeg","uid":"shunm_56101742743","roomid":"520555","name":"樂灬若水默默的","roomname":"樂灬若水默默的的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_347,w_1288,h_1288,c_fit,w_640,h_640/cs201912/1577260779269.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_347,w_1288,h_1288,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1577260779269.jpeg","live":1,"push":1,"focus":3281,"hot":9762,"tags":[{"type":3,"tagId":1804,"tagName":"唱将"},{"type":2,"tagId":1306,"tagName":"好声音"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":108},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1573746454270.png","uid":"shunm_56111530222","roomid":"3923482","name":"恬恬16号满月","roomname":"恬恬16号满月的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1573746454270.png","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1573746454270.png","live":1,"push":1,"focus":3676,"hot":8906,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":102},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1572613724153.jpeg","uid":"qq-111116031","roomid":"6759193","name":"风启✦子近","roomname":"风启✦子近的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1572613724153.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1572613724153.jpeg","live":1,"push":1,"focus":5478,"hot":27023,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":98},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_983,w_2248,h_2248,c_fit,w_100,h_100/cs201911/1574747860043.jpeg","uid":"shunm_56111643318","roomid":"3321286","name":"皓瀚菲菲第一天","roomname":"皓瀚菲菲第一天的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_983,w_2248,h_2248,c_fit,w_640,h_640/cs201911/1574747860043.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_983,w_2248,h_2248,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574747860043.jpeg","live":1,"push":1,"focus":3059,"hot":3704,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":98},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1574573868379.jpeg","uid":"shunm_56111626402","roomid":"7462036","name":"新人、靖靖","roomname":"新人、靖靖的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1574573868379.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574573868379.jpeg","live":1,"push":1,"focus":2959,"hot":4624,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":95},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576570557117.jpeg","uid":"shunm_56111521939","roomid":"3810383","name":"双双25号满月啦","roomname":"双双25号满月啦的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1576570557117.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1576570557117.jpeg","live":1,"push":1,"focus":3128,"hot":6515,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":92},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1574677489556.jpeg","uid":"shunm_56111600251","roomid":"2869778","name":"你的白菜芯Cy","roomname":"你的白菜芯Cy的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1574677489556.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574677489556.jpeg","live":1,"push":1,"focus":3236,"hot":6702,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":87},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_273,y_0,w_721,h_721,c_fit,w_100,h_100/cs201911/1572934762341.jpeg","uid":"shunm_56110930365","roomid":"520511","name":"*悠悠*","roomname":"*悠悠*的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_273,y_0,w_721,h_721,c_fit,w_640,h_640/cs201911/1572934762341.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_273,y_0,w_721,h_721,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1572934762341.jpeg","live":1,"push":1,"focus":2735,"hot":5838,"tags":[{"type":3,"tagId":1806,"tagName":"才艺咖"},{"type":2,"tagId":1504,"tagName":"多才多艺"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":84},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_17,w_624,h_624,c_fit,w_100,h_100/cs201908/1566381655805.jpg","uid":"wlunm256_561547274","roomid":"520133","name":"鱼夏在等你。","roomname":"鱼夏在等你。的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_17,w_624,h_624,c_fit,w_640,h_640/cs201908/1566381655805.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_17,w_624,h_624,c_fit,w_640,h_640,o_convert,f_webp/cs201908/1566381655805.jpg","live":1,"push":1,"focus":3598,"hot":11695,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"},{"type":2,"tagId":1308,"tagName":"颜值"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":83},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1574256407551.jpeg","uid":"shunm_56111589717","roomid":"5748283","name":"皓瀚-新人小书生","roomname":"皓瀚-新人小书生的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1574256407551.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574256407551.jpeg","live":1,"push":1,"focus":3186,"hot":4563,"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":79},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1574581119973.jpeg","uid":"shunm_56111498719","roomid":"7056369","name":"新人、媄祺","roomname":"新人、媄祺的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1574581119973.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574581119973.jpeg","live":1,"push":1,"focus":3169,"hot":5495,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":74},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1573350309318.jpeg","uid":"shunm_56111289854","roomid":"520073","name":"谁的小宝贝呀","roomname":"谁的小宝贝呀的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1573350309318.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1573350309318.jpeg","live":1,"push":1,"focus":3721,"hot":6705,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":74},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_187,y_0,w_877,h_877,c_fit,w_100,h_100/cs201912/1577155125321.png","uid":"shunm_56111833103","roomid":"5503556","name":"魔~娜娜","roomname":"魔~娜娜的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_187,y_0,w_877,h_877,c_fit,w_640,h_640/cs201912/1577155125321.png","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_187,y_0,w_877,h_877,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1577155125321.png","live":1,"push":1,"focus":3195,"hot":4369,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":72},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_14,y_0,w_1066,h_1066,c_fit,w_100,h_100/cs201911/1572943700623.jpeg","uid":"shunm_56111543432","roomid":"5761679","name":"新人~浅影","roomname":"新人~浅影的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_14,y_0,w_1066,h_1066,c_fit,w_640,h_640/cs201911/1572943700623.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_14,y_0,w_1066,h_1066,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1572943700623.jpeg","live":1,"push":1,"focus":3143,"hot":4613,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":71},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_19,w_726,h_726,c_fit,w_100,h_100/cs201912/1576245274676.jpeg","uid":"shunm_56111214849","roomid":"520120","name":"这狙名为-喜欢","roomname":"这狙名为-喜欢的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_19,w_726,h_726,c_fit,w_640,h_640/cs201912/1576245274676.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_19,w_726,h_726,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1576245274676.jpeg","live":1,"push":1,"focus":3707,"hot":8954,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"},{"type":2,"tagId":1308,"tagName":"颜值"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":71},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_58,y_0,w_2048,h_2048,c_fit,w_100,h_100/cs201911/1574845156904.jpeg","uid":"shunm_56111654499","roomid":"6819057","name":"新人若~曦求关注","roomname":"新人若~曦求关注的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_58,y_0,w_2048,h_2048,c_fit,w_640,h_640/cs201911/1574845156904.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_58,y_0,w_2048,h_2048,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574845156904.jpeg","live":1,"push":1,"focus":3195,"hot":5300,"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":71},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/u_o_5/966755.png","uid":"wx-110377733","roomid":"520888","name":"樂灬秋梦","roomname":"樂灬秋梦的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/u_o_5/966755.png","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/u_o_5/966755.png","live":1,"push":1,"focus":3803,"hot":7581,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":70},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_100,h_100/cs201911/1574302390594.png","uid":"shunm_56111607344","roomid":"5740496","name":"JD-艾,米","roomname":"JD-艾,米的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_640,h_640/cs201911/1574302378335.png","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574302378335.png","live":1,"push":1,"focus":3708,"hot":8504,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":68},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_118,w_944,h_944,c_fit,w_100,h_100/cs201910/1571625386914.jpg","uid":"shunm_56111462682","roomid":"3125784","name":"晴天虎爷","roomname":"晴天虎爷的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_118,w_944,h_944,c_fit,w_640,h_640/cs201910/1571625386914.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_118,w_944,h_944,c_fit,w_640,h_640,o_convert,f_webp/cs201910/1571625386914.jpg","live":1,"push":1,"focus":3398,"hot":6851,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":67},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1574417700022.jpeg","uid":"wx-109967414","roomid":"7610477","name":"阿悦、","roomname":"阿悦、的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1574417700022.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574417700022.jpeg","live":1,"push":1,"focus":2547,"hot":4149,"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":67},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_1083,h_1083,c_fit,w_100,h_100/u_o_2/949672.jpg","uid":"wlunm327_561867433","roomid":"520558","name":"武少依旧在","roomname":"武少依旧在的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_1083,h_1083,c_fit,w_640,h_640/u_o_2/949672.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_1083,h_1083,c_fit,w_640,h_640,o_convert,f_webp/u_o_2/949672.jpg","live":1,"push":1,"focus":3284,"hot":5422,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":66},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1075,h_1075,c_fit,w_100,h_100/cs201912/1576236066099.jpeg","uid":"qq-110979658","roomid":"3724804","name":"风启✦小蹦迪","roomname":"风启✦小蹦迪的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1075,h_1075,c_fit,w_640,h_640/cs201912/1576236066099.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1075,h_1075,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1576236066099.jpeg","live":1,"push":1,"focus":2982,"hot":6555,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":64},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1572839018476.png","uid":"shunm_56110052952","roomid":"520927","name":"梦黎☀傲雪感恩心","roomname":"梦黎☀傲雪感恩心的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1572839018476.png","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1572839018476.png","live":1,"push":1,"focus":3025,"hot":5490,"tags":[{"type":3,"tagId":1804,"tagName":"唱将"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":64},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_70,w_1083,h_1083,c_fit,w_100,h_100/cs201909/1569141615654.jpg","uid":"shunm_56110718609","roomid":"6700787","name":"悠然等你来疼","roomname":"悠然等你来疼的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_70,w_1083,h_1083,c_fit,w_640,h_640/cs201909/1569141615654.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_70,w_1083,h_1083,c_fit,w_640,h_640,o_convert,f_webp/cs201909/1569141615654.jpg","live":1,"push":1,"focus":2537,"hot":4662,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":64},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_190,y_24,w_690,h_690,c_fit,w_100,h_100/cs201911/1575101791915.jpeg","uid":"shunm_56111679257","roomid":"7176304","name":"~苏苏~","roomname":"~苏苏~的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_190,y_24,w_690,h_690,c_fit,w_640,h_640/cs201911/1575101791915.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_190,y_24,w_690,h_690,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1575101791915.jpeg","live":1,"push":1,"focus":1984,"hot":2006,"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":64},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_336,y_0,w_955,h_955,c_fit,w_100,h_100/cs201908/1565332000540.jpg","uid":"shunm_56111306857","roomid":"2234402","name":"夏乐25号百天","roomname":"夏乐25号百天的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_336,y_0,w_955,h_955,c_fit,w_640,h_640/cs201908/1565332000540.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_336,y_0,w_955,h_955,c_fit,w_640,h_640,o_convert,f_webp/cs201908/1565332000540.jpg","live":1,"push":1,"focus":3385,"hot":5950,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":63},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576358139984.jpeg","uid":"shunm_56111323576","roomid":"3377753","name":"冰冰28号满月","roomname":"冰冰28号满月的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1576358139984.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1576358139984.jpeg","live":1,"push":1,"focus":3282,"hot":5720,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":63},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/u_o_2/959052.jpg","uid":"shunm_56110917040","roomid":"520889","name":"馨儿✨你的宝","roomname":"馨儿✨你的宝的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/u_o_2/959052.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/u_o_2/959052.jpg","live":1,"push":1,"focus":2722,"hot":4255,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"},{"type":2,"tagId":1308,"tagName":"颜值"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":61},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/u_o_5/1031875.jpg","uid":"shunm_56109338308","roomid":"521777","name":"默默喜欢我","roomname":"默默喜欢我的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/u_o_5/1031875.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/u_o_5/1031875.jpg","live":1,"push":1,"focus":3011,"hot":6245,"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":61},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_216,w_1081,h_1081,c_fit,w_100,h_100/cs201912/1575780580476.jpeg","uid":"shunm_56111683206","roomid":"2492993","name":"新人丶花艺","roomname":"新人丶花艺的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_216,w_1081,h_1081,c_fit,w_640,h_640/cs201912/1575780580476.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_216,w_1081,h_1081,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1575780580476.jpeg","live":1,"push":1,"focus":3189,"hot":5096,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":60},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1577274043340.jpeg","uid":"shunm_56111316755","roomid":"6578028","name":"风启✦新人心安","roomname":"风启✦新人心安的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1577274043340.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1577274043340.jpeg","live":1,"push":1,"focus":3229,"hot":5709,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":59},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201908/1566471680408.jpg","uid":"shunm_56111255246","roomid":"1021465","name":"JD新人文浩","roomname":"JD新人文浩的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201908/1566471680408.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201908/1566471680408.jpg","live":1,"push":1,"focus":3282,"hot":6514,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":58},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576511558918.jpeg","uid":"qq-2279908","roomid":"6697682","name":"JD-善待明明","roomname":"JD-善待明明的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201912/1576511558918.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1576511558918.jpeg","live":1,"push":1,"focus":3425,"hot":7469,"tags":[{"type":3,"tagId":1807,"tagName":"脱口秀"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":56},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_23,y_281,w_1054,h_1054,c_fit,w_100,h_100/cs201911/1575106789671.jpeg","uid":"shunm_56111679516","roomid":"7682398","name":"~~伍六七~~","roomname":"~~伍六七~~的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_23,y_281,w_1054,h_1054,c_fit,w_640,h_640/cs201911/1575106789671.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_23,y_281,w_1054,h_1054,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1575106789671.jpeg","live":1,"push":1,"focus":1396,"hot":735,"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":56},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_74,w_963,h_963,c_fit,w_100,h_100/cs201911/1574432226920.jpeg","uid":"shunm_56111447419","roomid":"1342625","name":"汐汐呀","roomname":"汐汐呀的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_74,w_963,h_963,c_fit,w_640,h_640/cs201911/1574432226920.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_74,w_963,h_963,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574432226920.jpeg","live":1,"push":1,"focus":3236,"hot":5784,"tags":[{"type":3,"tagId":1803,"tagName":"高颜值"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":55},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_122,w_1075,h_1075,c_fit,w_100,h_100/cs201909/1568701401948.jpg","uid":"shunm_56111218204","roomid":"1063307","name":"风启✦七道","roomname":"风启✦七道的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_122,w_1075,h_1075,c_fit,w_640,h_640/cs201909/1568701401948.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_122,w_1075,h_1075,c_fit,w_640,h_640,o_convert,f_webp/cs201909/1568701401948.jpg","live":1,"push":1,"focus":2691,"hot":4787,"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":53},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1080,h_1080,c_fit,w_100,h_100/cs201911/1574304017227.jpeg","uid":"shunm_56111563163","roomid":"2394788","name":"风启✦玖狐","roomname":"风启✦玖狐的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1080,h_1080,c_fit,w_640,h_640/cs201911/1574304017227.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_1080,h_1080,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1574304017227.jpeg","live":1,"push":1,"focus":2899,"hot":4452,"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":53},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201912/1576501513693.jpeg","uid":"shunm_56111362681","roomid":"5667266","name":"新人苏楠","roomname":"新人苏楠的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_640,h_640/cs201912/1577262349200.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_fit,w_640,h_640,o_convert,f_webp/cs201912/1577262349200.jpeg","live":1,"push":1,"focus":3361,"hot":6929,"tags":[{"type":3,"tagId":1808,"tagName":"其他"}],"charge":0,"mic":0,"pk":1,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":52},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_369,y_0,w_1536,h_1536,c_fit,w_100,h_100/cs201912/1576124669994.jpeg","uid":"shunm_56111750255","roomid":"9948796","name":"JD-黯然","roomname":"JD-黯然的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_369,y_0,w_1536,h_1536,c_fit,w_640,h_640/cs201912/1576124669994.jpeg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_369,y_0,w_1536,h_1536,c_fit,w_640,h_640,o_convert,f_webp/cs201912/1576124669994.jpeg","live":1,"push":1,"focus":3329,"hot":6670,"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":51},{"avatar":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_7,w_1078,h_1078,c_fit,w_100,h_100/u_o_5/900795.jpg","uid":"shunm_56108882063","roomid":"9469440","name":"Hy家洺新人","roomname":"Hy家洺新人的房间","pic51":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_7,w_1078,h_1078,c_fit,w_640,h_640/u_o_5/900795.jpg","picWebp":"https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_7,w_1078,h_1078,c_fit,w_640,h_640,o_convert,f_webp/u_o_5/900795.jpg","live":1,"push":1,"focus":1063,"hot":1517,"tags":[{"type":3,"tagId":1804,"tagName":"唱将"}],"charge":0,"mic":0,"pk":0,"penqi":0,"weeklyStar":0,"yearParty":0,"vid":0,"gameName":"","gameIcon":"","gameId":0,"birthday":0,"channel":"","shortId":"","index":50}]
         * activitys : []
         * news : []
         * banners : [{"id":1053,"name":"艺能房","picUrl":"https://00cdc5c2e0ddc.cdn.sohucs.com/cs201908/1566443242230.jpg","linkUrl":"https://qf.56.com/feh5/vu/special/artistic.html#/","dynamicUrl":"","countdown":0,"roomids":"","blackRoomids":"","showClient":0,"showTimes":0,"showPlat":0,"showFrom":"","rankOrder":2,"begintime":1537261200000,"endtime":1631955600000,"num":0,"minVersion":"","maxVersion":"","isShow":0,"minBannerVersion":{"major":0,"minor":0,"revision":0},"maxBannerVersion":{"major":0,"minor":0,"revision":0},"schemeUrl":"","downloadUrl":"","desc":""},{"id":18,"name":"周星6+1","picUrl":"https://file.qf.56.com/f/upload/photo/activity/app/201808270525191535361919070.jpg","linkUrl":"https://qf.56.com/activity/week_star_h5/index.html","dynamicUrl":"","countdown":0,"roomids":"","blackRoomids":"","showClient":0,"showTimes":0,"showPlat":0,"showFrom":"","rankOrder":4,"begintime":1498406400000,"endtime":1593153900000,"num":0,"minVersion":"","maxVersion":"","isShow":0,"minBannerVersion":{"major":0,"minor":0,"revision":0},"maxBannerVersion":{"major":0,"minor":0,"revision":0},"schemeUrl":"","downloadUrl":"","desc":""}]
         */

        private int total;
        private HeadlineBean headline;
        private List<?> tags;
        private List<AnchorsBean> anchors;
        private List<?> activitys;
        private List<?> news;
        private List<BannersBean> banners;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public HeadlineBean getHeadline() {
            return headline;
        }

        public void setHeadline(HeadlineBean headline) {
            this.headline = headline;
        }

        public List<?> getTags() {
            return tags;
        }

        public void setTags(List<?> tags) {
            this.tags = tags;
        }

        public List<AnchorsBean> getAnchors() {
            return anchors;
        }

        public void setAnchors(List<AnchorsBean> anchors) {
            this.anchors = anchors;
        }

        public List<?> getActivitys() {
            return activitys;
        }

        public void setActivitys(List<?> activitys) {
            this.activitys = activitys;
        }

        public List<?> getNews() {
            return news;
        }

        public void setNews(List<?> news) {
            this.news = news;
        }

        public List<BannersBean> getBanners() {
            return banners;
        }

        public void setBanners(List<BannersBean> banners) {
            this.banners = banners;
        }

        public static class HeadlineBean {
            /**
             * uid : shunm_56110482342
             * tags : [{"type":3,"tagId":1807,"tagName":"脱口秀"}]
             * picWebp : https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/cs201911/1573965892635.jpeg
             * pic51 : https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/cs201911/1573965892635.jpeg
             * nickname : 安然想我了吗
             * gameId : 0
             * gameName :
             * avatar : https://00cdc5c2e0ddc.cdn.sohucs.com/q_mini,c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/cs201911/1573965892635.jpeg
             * push : 1
             * roomid : 520052
             * point : 600200
             * title :
             * charge : 0
             * mic : 0
             * gameIcon :
             * hot : 8645
             * weeklyStar : 1
             * focus : 2062
             * vid : 0
             * pk : 0
             * live : 1
             */

            private String uid;
            private String picWebp;
            private String pic51;
            private String nickname;
            private int gameId;
            private String gameName;
            private String avatar;
            private int push;
            private String roomid;
            private int point;
            private String title;
            private int charge;
            private int mic;
            private String gameIcon;
            private int hot;
            private int weeklyStar;
            private int focus;
            private int vid;
            private int pk;
            private int live;
            private List<TagsBean> tags;

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getPicWebp() {
                return picWebp;
            }

            public void setPicWebp(String picWebp) {
                this.picWebp = picWebp;
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

            public int getGameId() {
                return gameId;
            }

            public void setGameId(int gameId) {
                this.gameId = gameId;
            }

            public String getGameName() {
                return gameName;
            }

            public void setGameName(String gameName) {
                this.gameName = gameName;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public int getPush() {
                return push;
            }

            public void setPush(int push) {
                this.push = push;
            }

            public String getRoomid() {
                return roomid;
            }

            public void setRoomid(String roomid) {
                this.roomid = roomid;
            }

            public int getPoint() {
                return point;
            }

            public void setPoint(int point) {
                this.point = point;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getCharge() {
                return charge;
            }

            public void setCharge(int charge) {
                this.charge = charge;
            }

            public int getMic() {
                return mic;
            }

            public void setMic(int mic) {
                this.mic = mic;
            }

            public String getGameIcon() {
                return gameIcon;
            }

            public void setGameIcon(String gameIcon) {
                this.gameIcon = gameIcon;
            }

            public int getHot() {
                return hot;
            }

            public void setHot(int hot) {
                this.hot = hot;
            }

            public int getWeeklyStar() {
                return weeklyStar;
            }

            public void setWeeklyStar(int weeklyStar) {
                this.weeklyStar = weeklyStar;
            }

            public int getFocus() {
                return focus;
            }

            public void setFocus(int focus) {
                this.focus = focus;
            }

            public int getVid() {
                return vid;
            }

            public void setVid(int vid) {
                this.vid = vid;
            }

            public int getPk() {
                return pk;
            }

            public void setPk(int pk) {
                this.pk = pk;
            }

            public int getLive() {
                return live;
            }

            public void setLive(int live) {
                this.live = live;
            }

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class TagsBean {
                /**
                 * type : 3
                 * tagId : 1807
                 * tagName : 脱口秀
                 */

                private int type;
                private int tagId;
                private String tagName;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public int getTagId() {
                    return tagId;
                }

                public void setTagId(int tagId) {
                    this.tagId = tagId;
                }

                public String getTagName() {
                    return tagName;
                }

                public void setTagName(String tagName) {
                    this.tagName = tagName;
                }
            }
        }

        public static class AnchorsBean {
            /**
             * avatar : https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_100,h_100/u_o_1/1054731.png
             * uid : shunm_56111197375
             * roomid : 981111
             * name : 白露✨29半周年
             * roomname : 白露✨29半周年的房间
             * pic51 : https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640/u_o_1/1054731.png
             * picWebp : https://00cdc5c2e0ddc.cdn.sohucs.com/c_cut,x_0,y_0,w_640,h_640,c_fit,w_640,h_640,o_convert,f_webp/u_o_1/1054731.png
             * live : 1
             * push : 1
             * focus : 2761
             * hot : 9998
             * tags : [{"type":3,"tagId":1807,"tagName":"脱口秀"}]
             * charge : 0
             * mic : 0
             * pk : 1
             * penqi : 0
             * weeklyStar : 0
             * yearParty : 0
             * vid : 0
             * gameName :
             * gameIcon :
             * gameId : 0
             * birthday : 0
             * channel :
             * shortId :
             * index : 212
             */

            private String avatar;
            private String uid;
            private String roomid;
            private String name;
            private String roomname;
            private String pic51;
            private String picWebp;
            private int live;
            private int push;
            private int focus;
            private int hot;
            private int charge;
            private int mic;
            private int pk;
            private int penqi;
            private int weeklyStar;
            private int yearParty;
            private int vid;
            private String gameName;
            private String gameIcon;
            private int gameId;
            private int birthday;
            private String channel;
            private String shortId;
            private int index;
            private List<TagsBeanX> tags;

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

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

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoomname() {
                return roomname;
            }

            public void setRoomname(String roomname) {
                this.roomname = roomname;
            }

            public String getPic51() {
                return pic51;
            }

            public void setPic51(String pic51) {
                this.pic51 = pic51;
            }

            public String getPicWebp() {
                return picWebp;
            }

            public void setPicWebp(String picWebp) {
                this.picWebp = picWebp;
            }

            public int getLive() {
                return live;
            }

            public void setLive(int live) {
                this.live = live;
            }

            public int getPush() {
                return push;
            }

            public void setPush(int push) {
                this.push = push;
            }

            public int getFocus() {
                return focus;
            }

            public void setFocus(int focus) {
                this.focus = focus;
            }

            public int getHot() {
                return hot;
            }

            public void setHot(int hot) {
                this.hot = hot;
            }

            public int getCharge() {
                return charge;
            }

            public void setCharge(int charge) {
                this.charge = charge;
            }

            public int getMic() {
                return mic;
            }

            public void setMic(int mic) {
                this.mic = mic;
            }

            public int getPk() {
                return pk;
            }

            public void setPk(int pk) {
                this.pk = pk;
            }

            public int getPenqi() {
                return penqi;
            }

            public void setPenqi(int penqi) {
                this.penqi = penqi;
            }

            public int getWeeklyStar() {
                return weeklyStar;
            }

            public void setWeeklyStar(int weeklyStar) {
                this.weeklyStar = weeklyStar;
            }

            public int getYearParty() {
                return yearParty;
            }

            public void setYearParty(int yearParty) {
                this.yearParty = yearParty;
            }

            public int getVid() {
                return vid;
            }

            public void setVid(int vid) {
                this.vid = vid;
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

            public int getGameId() {
                return gameId;
            }

            public void setGameId(int gameId) {
                this.gameId = gameId;
            }

            public int getBirthday() {
                return birthday;
            }

            public void setBirthday(int birthday) {
                this.birthday = birthday;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public String getShortId() {
                return shortId;
            }

            public void setShortId(String shortId) {
                this.shortId = shortId;
            }

            public int getIndex() {
                return index;
            }

            public void setIndex(int index) {
                this.index = index;
            }

            public List<TagsBeanX> getTags() {
                return tags;
            }

            public void setTags(List<TagsBeanX> tags) {
                this.tags = tags;
            }

            public static class TagsBeanX {
                /**
                 * type : 3
                 * tagId : 1807
                 * tagName : 脱口秀
                 */

                private int type;
                private int tagId;
                private String tagName;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public int getTagId() {
                    return tagId;
                }

                public void setTagId(int tagId) {
                    this.tagId = tagId;
                }

                public String getTagName() {
                    return tagName;
                }

                public void setTagName(String tagName) {
                    this.tagName = tagName;
                }
            }
        }

        public static class BannersBean {
            /**
             * id : 1053
             * name : 艺能房
             * picUrl : https://00cdc5c2e0ddc.cdn.sohucs.com/cs201908/1566443242230.jpg
             * linkUrl : https://qf.56.com/feh5/vu/special/artistic.html#/
             * dynamicUrl :
             * countdown : 0
             * roomids :
             * blackRoomids :
             * showClient : 0
             * showTimes : 0
             * showPlat : 0
             * showFrom :
             * rankOrder : 2
             * begintime : 1537261200000
             * endtime : 1631955600000
             * num : 0
             * minVersion :
             * maxVersion :
             * isShow : 0
             * minBannerVersion : {"major":0,"minor":0,"revision":0}
             * maxBannerVersion : {"major":0,"minor":0,"revision":0}
             * schemeUrl :
             * downloadUrl :
             * desc :
             */

            private int id;
            private String name;
            private String picUrl;
            private String linkUrl;
            private String dynamicUrl;
            private int countdown;
            private String roomids;
            private String blackRoomids;
            private int showClient;
            private int showTimes;
            private int showPlat;
            private String showFrom;
            private int rankOrder;
            private long begintime;
            private long endtime;
            private int num;
            private String minVersion;
            private String maxVersion;
            private int isShow;
            private MinBannerVersionBean minBannerVersion;
            private MaxBannerVersionBean maxBannerVersion;
            private String schemeUrl;
            private String downloadUrl;
            private String desc;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public String getLinkUrl() {
                return linkUrl;
            }

            public void setLinkUrl(String linkUrl) {
                this.linkUrl = linkUrl;
            }

            public String getDynamicUrl() {
                return dynamicUrl;
            }

            public void setDynamicUrl(String dynamicUrl) {
                this.dynamicUrl = dynamicUrl;
            }

            public int getCountdown() {
                return countdown;
            }

            public void setCountdown(int countdown) {
                this.countdown = countdown;
            }

            public String getRoomids() {
                return roomids;
            }

            public void setRoomids(String roomids) {
                this.roomids = roomids;
            }

            public String getBlackRoomids() {
                return blackRoomids;
            }

            public void setBlackRoomids(String blackRoomids) {
                this.blackRoomids = blackRoomids;
            }

            public int getShowClient() {
                return showClient;
            }

            public void setShowClient(int showClient) {
                this.showClient = showClient;
            }

            public int getShowTimes() {
                return showTimes;
            }

            public void setShowTimes(int showTimes) {
                this.showTimes = showTimes;
            }

            public int getShowPlat() {
                return showPlat;
            }

            public void setShowPlat(int showPlat) {
                this.showPlat = showPlat;
            }

            public String getShowFrom() {
                return showFrom;
            }

            public void setShowFrom(String showFrom) {
                this.showFrom = showFrom;
            }

            public int getRankOrder() {
                return rankOrder;
            }

            public void setRankOrder(int rankOrder) {
                this.rankOrder = rankOrder;
            }

            public long getBegintime() {
                return begintime;
            }

            public void setBegintime(long begintime) {
                this.begintime = begintime;
            }

            public long getEndtime() {
                return endtime;
            }

            public void setEndtime(long endtime) {
                this.endtime = endtime;
            }

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }

            public String getMinVersion() {
                return minVersion;
            }

            public void setMinVersion(String minVersion) {
                this.minVersion = minVersion;
            }

            public String getMaxVersion() {
                return maxVersion;
            }

            public void setMaxVersion(String maxVersion) {
                this.maxVersion = maxVersion;
            }

            public int getIsShow() {
                return isShow;
            }

            public void setIsShow(int isShow) {
                this.isShow = isShow;
            }

            public MinBannerVersionBean getMinBannerVersion() {
                return minBannerVersion;
            }

            public void setMinBannerVersion(MinBannerVersionBean minBannerVersion) {
                this.minBannerVersion = minBannerVersion;
            }

            public MaxBannerVersionBean getMaxBannerVersion() {
                return maxBannerVersion;
            }

            public void setMaxBannerVersion(MaxBannerVersionBean maxBannerVersion) {
                this.maxBannerVersion = maxBannerVersion;
            }

            public String getSchemeUrl() {
                return schemeUrl;
            }

            public void setSchemeUrl(String schemeUrl) {
                this.schemeUrl = schemeUrl;
            }

            public String getDownloadUrl() {
                return downloadUrl;
            }

            public void setDownloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public static class MinBannerVersionBean {
                /**
                 * major : 0
                 * minor : 0
                 * revision : 0
                 */

                private int major;
                private int minor;
                private int revision;

                public int getMajor() {
                    return major;
                }

                public void setMajor(int major) {
                    this.major = major;
                }

                public int getMinor() {
                    return minor;
                }

                public void setMinor(int minor) {
                    this.minor = minor;
                }

                public int getRevision() {
                    return revision;
                }

                public void setRevision(int revision) {
                    this.revision = revision;
                }
            }

            public static class MaxBannerVersionBean {
                /**
                 * major : 0
                 * minor : 0
                 * revision : 0
                 */

                private int major;
                private int minor;
                private int revision;

                public int getMajor() {
                    return major;
                }

                public void setMajor(int major) {
                    this.major = major;
                }

                public int getMinor() {
                    return minor;
                }

                public void setMinor(int minor) {
                    this.minor = minor;
                }

                public int getRevision() {
                    return revision;
                }

                public void setRevision(int revision) {
                    this.revision = revision;
                }
            }
        }
    }
}
