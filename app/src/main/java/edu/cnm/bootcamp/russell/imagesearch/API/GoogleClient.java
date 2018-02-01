package edu.cnm.bootcamp.russell.imagesearch.API;

import android.content.Context;

import edu.cnm.bootcamp.russell.imagesearch.API.models.SearchResponse;
import edu.cnm.bootcamp.russell.imagesearch.R;
import rx.Single;

/**
 * Created by russell on 2/1/18.
 */

public class GoogleClient {

    public static Single<SearchResponse> imageSearch(Context context,
                                                     String query) {
        return API.googleService.imageSearch(
                context.getString(R.string.google_api_key),
                context.getString(R.string.search_id),
                query,
                10,
                1
        );
    }
}
