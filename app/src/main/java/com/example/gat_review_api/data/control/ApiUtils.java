package com.example.gat_review_api.data.control;

import com.example.gat_review_api.data.remote.RetrofitClient;
import com.example.gat_review_api.data.remote.SOService;


public class ApiUtils {
    public static final String BASE_URL="https://fordev.gatbook.org/rest/api/reviews/";
    public static SOService getSOSevice(){
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}
