// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.blocking

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

interface SocialPostService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SocialPostService

    /** Create Post */
    fun create(
        params: SocialPostCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPost

    /** Get Post by ID */
    fun retrieve(
        id: String,
        params: SocialPostRetrieveParams = SocialPostRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPost = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: SocialPostRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPost

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): SocialPost =
        retrieve(id, SocialPostRetrieveParams.none(), requestOptions)

    /** Update Post */
    fun update(
        id: String,
        params: SocialPostUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPost = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: SocialPostUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPost

    /** Get a paginated result for posts based on the applied filters */
    fun list(
        params: SocialPostListParams = SocialPostListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPostListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): SocialPostListResponse =
        list(SocialPostListParams.none(), requestOptions)

    /** Delete Post */
    fun delete(
        id: String,
        params: SocialPostDeleteParams = SocialPostDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPostDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: SocialPostDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialPostDeleteResponse

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): SocialPostDeleteResponse =
        delete(id, SocialPostDeleteParams.none(), requestOptions)

    /** A view of [SocialPostService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SocialPostService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/social-posts`, but is otherwise the same as
         * [SocialPostService.create].
         */
        @MustBeClosed
        fun create(
            params: SocialPostCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPost>

        /**
         * Returns a raw HTTP response for `get /v1/social-posts/{id}`, but is otherwise the same as
         * [SocialPostService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SocialPostRetrieveParams = SocialPostRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPost> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SocialPostRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPost>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<SocialPost> =
            retrieve(id, SocialPostRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/social-posts/{id}`, but is otherwise the same as
         * [SocialPostService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: SocialPostUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPost> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: SocialPostUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPost>

        /**
         * Returns a raw HTTP response for `get /v1/social-posts`, but is otherwise the same as
         * [SocialPostService.list].
         */
        @MustBeClosed
        fun list(
            params: SocialPostListParams = SocialPostListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPostListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SocialPostListResponse> =
            list(SocialPostListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/social-posts/{id}`, but is otherwise the same
         * as [SocialPostService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: SocialPostDeleteParams = SocialPostDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPostDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SocialPostDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialPostDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialPostDeleteResponse> =
            delete(id, SocialPostDeleteParams.none(), requestOptions)
    }
}
