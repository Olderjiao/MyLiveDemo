package com.example.mylivedemo;

import com.example.mylivedemo.entity.AttentionEntity;
import com.example.mylivedemo.entity.BaseEntity;
import com.example.mylivedemo.entity.HomeEntity;
import com.example.mylivedemo.entity.NewPeopleEntity;
import com.example.mylivedemo.entity.PopularityEntity;
import com.example.mylivedemo.entity.RichRankEntity;
import com.example.mylivedemo.entity.StartRankEntity;
import com.example.mylivedemo.entity.WeekEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/27 11:31
 */
public interface Api {
    /**
     * 主页数据
     * @return
     */
    @GET(BaseUrl.HOME_URL)
    Observable<HomeEntity> getHomeData();

    @GET(BaseUrl.ATTENTION_URL)
    Observable<AttentionEntity> getAttentionData();

    @GET(BaseUrl.NEWPEOPLE_URL)
    Observable<NewPeopleEntity> getNewPeopleData();

    /**
     * 请求拍排行榜数据
     * https://mbl.56.com/rank/v1/rankPopularity.android?pageSize=30&type=1
     */
    @GET(BaseUrl.RANK_URL)
    Observable<StartRankEntity> getRankData(@Query("pageSize")String pageSize, @Query("type")String type);

    @GET(BaseUrl.RANK_RICH_URL)
    Observable<RichRankEntity> getRichRankData(@Query("pageSize")String pageSize, @Query("type")String type);

    @GET(BaseUrl.RANK_POPULARITY_URL)
    Observable<PopularityEntity> getPopularityData(@Query("pageSize")String pageSize, @Query("type")String type);

    @GET(BaseUrl.RANK_WEEK_URL)
    Observable<WeekEntity> getWeekRankData();

}
