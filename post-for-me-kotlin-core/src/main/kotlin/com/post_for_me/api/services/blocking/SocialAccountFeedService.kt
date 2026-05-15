// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.post_for_me.api.core.ClientOptions
import com.post_for_me.api.core.RequestOptions
import com.post_for_me.api.core.http.HttpResponseFor
import com.post_for_me.api.models.socialaccountfeeds.SocialAccountFeedListParams
import com.post_for_me.api.models.socialaccountfeeds.SocialAccountFeedListResponse

/**
 * The social account feed is every post made for the social account, including posts not made
 * through our API. Use this endpoint to get the platform details for any post made under the
 * connected account. To use this endpoint accounts must be connected with the **"feeds"
 * permission**.
 *
 * Details will include:
 * - Post information including caption, url, media, etc..
 * - When passing **expand=metrics**, Metrics information including views, likes, follows, etc..
 *
 * Note: Currently the following platforms are supported:
 * - **Instagram**, may take up to 48 hours for some metrics to be avaialbe
 * - **Facebook**
 * - **TikTok**, consumer API exposes less analytics for more details connect through TikTok
 *   Business
 * - **TikTok Business**,
 * - **Youtube**
 * - **Threads**
 * - **X (Twitter)**
 * - **Bluesky**, Bluesky does not expose views or impressions through their API.
 * - **Pinterest**
 * - **LinkedIn**, metrics are only available for company pages. LinkedIn has currently stopped
 *   giving permission for personal page analytics, we are on the waitlist for when they resume.
 */
interface SocialAccountFeedService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SocialAccountFeedService

    /** Get a paginated result for the social account based on the applied filters */
    fun list(
        socialAccountId: String,
        params: SocialAccountFeedListParams = SocialAccountFeedListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialAccountFeedListResponse =
        list(params.toBuilder().socialAccountId(socialAccountId).build(), requestOptions)

    /** @see list */
    fun list(
        params: SocialAccountFeedListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialAccountFeedListResponse

    /** @see list */
    fun list(
        socialAccountId: String,
        requestOptions: RequestOptions,
    ): SocialAccountFeedListResponse =
        list(socialAccountId, SocialAccountFeedListParams.none(), requestOptions)

    /**
     * A view of [SocialAccountFeedService] that provides access to raw HTTP responses for each
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
        ): SocialAccountFeedService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/social-account-feeds/{social_account_id}`, but
         * is otherwise the same as [SocialAccountFeedService.list].
         */
        @MustBeClosed
        fun list(
            socialAccountId: String,
            params: SocialAccountFeedListParams = SocialAccountFeedListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialAccountFeedListResponse> =
            list(params.toBuilder().socialAccountId(socialAccountId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: SocialAccountFeedListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialAccountFeedListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            socialAccountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialAccountFeedListResponse> =
            list(socialAccountId, SocialAccountFeedListParams.none(), requestOptions)
    }
}
