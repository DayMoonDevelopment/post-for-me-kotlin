// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.post_for_me.api.core.ClientOptions
import com.post_for_me.api.core.RequestOptions
import com.post_for_me.api.core.http.HttpResponseFor
import com.post_for_me.api.models.socialpostresults.SocialPostResult
import com.post_for_me.api.models.socialpostresults.SocialPostResultListParams
import com.post_for_me.api.models.socialpostresults.SocialPostResultListResponse
import com.post_for_me.api.models.socialpostresults.SocialPostResultRetrieveParams

interface SocialPostResultServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SocialPostResultServiceAsync

    /** Get post result by ID */
    suspend fun retrieve(
        id: String,
        params: SocialPostResultRetrieveParams = SocialPostResultRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPostResult = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: SocialPostResultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPostResult

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): SocialPostResult =
        retrieve(id, SocialPostResultRetrieveParams.none(), requestOptions)

    /** Get a paginated result for post results based on the applied filters */
    suspend fun list(
        params: SocialPostResultListParams = SocialPostResultListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPostResultListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): SocialPostResultListResponse =
        list(SocialPostResultListParams.none(), requestOptions)

    /**
     * A view of [SocialPostResultServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SocialPostResultServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/social-post-results/{id}`, but is otherwise the
         * same as [SocialPostResultServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: SocialPostResultRetrieveParams = SocialPostResultRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPostResult> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: SocialPostResultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPostResult>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialPostResult> =
            retrieve(id, SocialPostResultRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/social-post-results`, but is otherwise the same
         * as [SocialPostResultServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: SocialPostResultListParams = SocialPostResultListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPostResultListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<SocialPostResultListResponse> =
            list(SocialPostResultListParams.none(), requestOptions)
    }
}
