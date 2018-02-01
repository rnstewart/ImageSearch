package edu.cnm.bootcamp.russell.imagesearch.API;

import edu.cnm.bootcamp.russell.imagesearch.API.models.SearchResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Single;

/**
 * Created by russell on 2/1/18.
 */

public interface GoogleService {

    @GET("customsearch/v1")
    Single<SearchResponse> imageSearch(
            @Query("key") String key,
            @Query("cx") String cx,
            @Query("q") String query,
            @Query("num") int num,
            @Query("start") int start
    );

}
