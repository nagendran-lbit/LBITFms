package com.lbit.fleet.retrofit_service

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Created by VISHNU on 24/Jul/2021
 */
interface RetrofitService {

    @FormUrlEncoded
    @POST("/user-login")
    fun getUserLogin(
        @Field("user_mobile") user_mobile: String,
        @Field("create_update") create_update: String,
        @Field("resend_otp") resend_otp: String,
        @Field("otp") otp: String,
        @Field("token_id") token_id: String

    ): Call<ResponseBody>

    @FormUrlEncoded
    @POST("/parts-addition")
    fun addPart(
        @Field("user_mobile") user_mobile: String,
        @Field("reg_num") reg_num: String,
        @Field("nid") nid: String,
        @Field("veh_condition") veh_condition: String,
        @Field("oepart") oepart: String,
        @Field("part") part: String,
        @Field("mrp") mrp: String,
        @Field("qty") qty: String,
        @Field("make") make: String,
        @Field("model") model: String,
        @Field("store_location") store_location: String,
        @Field("site_location") site_location: String,
        @Field("pickup_person") pickup_person: String,
        @Field("contact") contact: String,
        @Field("grn_number") grn_number: String,
        @Field("procurement_pid") procurement_pid: String

    ): Call<ResponseBody>

    @FormUrlEncoded
    @POST("/qty-updation")
    fun updatePart(
        @Field("nid") nid: String,
        @Field("entity_id") entity_id: String,
        @Field("update_type") update_type: String,
        @Field("qty") qty: String

    ): Call<ResponseBody>

    @FormUrlEncoded
    @POST("/vehicle-info")
    fun getVehicleDetails(
        @Field("reg_num") reg_num: String
    ): Call<ResponseBody>

    @FormUrlEncoded
    @POST("/part-search")
    fun getPartSearch(
        @Field("search") search: String
    ): Call<ResponseBody>

    @FormUrlEncoded
    @POST("/stk-search")
    fun getStockSearch(
        @Field("search") search: String,
        @Field("make") make: String
    ): Call<ResponseBody>

    @FormUrlEncoded
    @POST("/stock-list")
    fun getStockDetails(
        @Field("search") search: String,
        @Field("qty") qty: String
    ): Call<ResponseBody>


    @FormUrlEncoded
    @POST("/dropdown-list")
    fun getRegNoList(
        @Field("dropdown_type") dropdown_type: String
    ): Call<ResponseBody>

    @FormUrlEncoded
    @POST("/service-requests")
    fun getDashboardDataList(
        @Field("request_type") request_type: String
    ): Call<ResponseBody>

    @FormUrlEncoded
    @POST("/qr-requests")
    fun getDashboardDataListSB(
        @Field("user_mobile") user_mobile: String,
        @Field("nid") nid: String
    ): Call<ResponseBody>

    @FormUrlEncoded
    @POST("/GRN-qr-check")
    fun saveQrVerification(
        @Field("user_mobile") user_mobile: String,
        @Field("pid") pid: String,
        @Field("status") status: String,
        @Field("qr_num") qr_num: String
    ): Call<ResponseBody>

    @FormUrlEncoded
    @POST("/history-requests")
    fun getDashboardDataHistoryListSB(
        @Field("user_mobile") user_mobile: String,
        @Field("nid") nid: String
    ): Call<ResponseBody>

    @FormUrlEncoded
    @POST("/vehicle-data")
    fun getDashboardPartsDataList(
        @Field("nid") nid: String
    ): Call<ResponseBody>

    @FormUrlEncoded
    @POST("/jobcard-confirmation")
    fun saveServiceRequest(
        @Field("nid") nid: String
    ): Call<ResponseBody>

}
