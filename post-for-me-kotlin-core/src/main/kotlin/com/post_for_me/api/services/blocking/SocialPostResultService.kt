// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.post_for_me.api.core.ClientOptions
import com.post_for_me.api.core.RequestOptions
import com.post_for_me.api.core.http.HttpResponseFor
import com.post_for_me.api.models.socialpostresults.SocialPostResult
import com.post_for_me.api.models.socialpostresults.SocialPostResultListParams
import com.post_for_me.api.models.socialpostresults.SocialPostResultListResponse
import com.post_for_me.api.models.socialpostresults.SocialPostResultRetrieveParams

interface SocialPostResultService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SocialPostResultService

    /** Get post result by ID */
    fun retrieve(
        id: String,
        params: SocialPostResultRetrieveParams = SocialPostResultRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPostResult = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: SocialPostResultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPostResult

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): SocialPostResult =
        retrieve(id, SocialPostResultRetrieveParams.none(), requestOptions)

    /** Get a paginated result for post results based on the applied filters */
    fun list(
        params: SocialPostResultListParams = SocialPostResultListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPostResultListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): SocialPostResultListResponse =
        list(SocialPostResultListParams.none(), requestOptions)

    /**
     * A view of [SocialPostResultService] that provides access to raw HTTP responses for each
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
        ): SocialPostResultService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/social-post-results/{id}`, but is otherwise the
         * same as [SocialPostResultService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SocialPostResultRetrieveParams = SocialPostResultRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPostResult> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SocialPostResultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPostResult>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialPostResult> =
            retrieve(id, SocialPostResultRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/social-post-results`, but is otherwise the same
         * as [SocialPostResultService.list].
         */
        @MustBeClosed
        fun list(
            params: SocialPostResultListParams = SocialPostResultListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPostResultListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SocialPostResultListResponse> =
            list(SocialPostResultListParams.none(), requestOptions)
    }
}
