package com.example.gat_review_api.data.remote;

import com.example.gat_review_api.data.model.Example;

import java.util.List;

import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.GET;

public interface SOService {
    @GET("new_long_reviews?page=1&per_page=100")
    Single<Response<Example>> getAnswers();
//    Single<Response<List<Example>>> getAnswers();
}
