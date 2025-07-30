// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.post_for_me.api.core.ClientOptions
import com.post_for_me.api.core.RequestOptions
import com.post_for_me.api.core.http.HttpResponseFor
import com.post_for_me.api.models.socialposts.SocialPost
import com.post_for_me.api.models.socialposts.SocialPostCreateParams
import com.post_for_me.api.models.socialposts.SocialPostDeleteParams
import com.post_for_me.api.models.socialposts.SocialPostDeleteResponse
import com.post_for_me.api.models.socialposts.SocialPostListParams
import com.post_for_me.api.models.socialposts.SocialPostListResponse
import com.post_for_me.api.models.socialposts.SocialPostRetrieveParams
import com.post_for_me.api.models.socialposts.SocialPostUpdateParams

interface SocialPostServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SocialPostServiceAsync

    /** Create Post */
    suspend fun create(
        params: SocialPostCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPost

    /** Get Post by ID */
    suspend fun retrieve(
        id: String,
        params: SocialPostRetrieveParams = SocialPostRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPost = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: SocialPostRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPost

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): SocialPost =
        retrieve(id, SocialPostRetrieveParams.none(), requestOptions)

    /** Update Post */
    suspend fun update(
        id: String,
        params: SocialPostUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPost = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: SocialPostUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPost

    /** Get a paginated result for posts based on the applied filters */
    suspend fun list(
        params: SocialPostListParams = SocialPostListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPostListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): SocialPostListResponse =
        list(SocialPostListParams.none(), requestOptions)

    /** Delete Post */
    suspend fun delete(
        id: String,
        params: SocialPostDeleteParams = SocialPostDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPostDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: SocialPostDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPostDeleteResponse

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions): SocialPostDeleteResponse =
        delete(id, SocialPostDeleteParams.none(), requestOptions)

    /**
     * A view of [SocialPostServiceAsync] that provides access to raw HTTP responses for each
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
        ): SocialPostServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/social-posts`, but is otherwise the same as
         * [SocialPostServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: SocialPostCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPost>

        /**
         * Returns a raw HTTP response for `get /v1/social-posts/{id}`, but is otherwise the same as
         * [SocialPostServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: SocialPostRetrieveParams = SocialPostRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPost> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: SocialPostRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPost>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialPost> =
            retrieve(id, SocialPostRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/social-posts/{id}`, but is otherwise the same as
         * [SocialPostServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: SocialPostUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPost> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: SocialPostUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPost>

        /**
         * Returns a raw HTTP response for `get /v1/social-posts`, but is otherwise the same as
         * [SocialPostServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: SocialPostListParams = SocialPostListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPostListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<SocialPostListResponse> =
            list(SocialPostListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/social-posts/{id}`, but is otherwise the same
         * as [SocialPostServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: SocialPostDeleteParams = SocialPostDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPostDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: SocialPostDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPostDeleteResponse>

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialPostDeleteResponse> =
            delete(id, SocialPostDeleteParams.none(), requestOptions)
    }
}
