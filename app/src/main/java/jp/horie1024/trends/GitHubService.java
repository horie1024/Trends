package jp.horie1024.trends;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author horie
 */
public interface GitHubService {

    @GET("/search/repositories")
    Call<Trend> searchTrend(@Query("q") String query, @Query("sort") String sort, @Query("order") String order);

}
