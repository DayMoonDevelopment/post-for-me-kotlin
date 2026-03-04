// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.client

import com.post_for_me.api.core.ClientOptions
import com.post_for_me.api.core.getPackageVersion
import com.post_for_me.api.services.blocking.MediaService
import com.post_for_me.api.services.blocking.MediaServiceImpl
import com.post_for_me.api.services.blocking.SocialAccountFeedService
import com.post_for_me.api.services.blocking.SocialAccountFeedServiceImpl
import com.post_for_me.api.services.blocking.SocialAccountService
import com.post_for_me.api.services.blocking.SocialAccountServiceImpl
import com.post_for_me.api.services.blocking.SocialPostResultService
import com.post_for_me.api.services.blocking.SocialPostResultServiceImpl
import com.post_for_me.api.services.blocking.SocialPostService
import com.post_for_me.api.services.blocking.SocialPostServiceImpl

class PostForMeClientImpl(private val clientOptions: ClientOptions) : PostForMeClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: PostForMeClientAsync by lazy { PostForMeClientAsyncImpl(clientOptions) }

    private val withRawResponse: PostForMeClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val media: MediaService by lazy { MediaServiceImpl(clientOptionsWithUserAgent) }

    private val socialPosts: SocialPostService by lazy {
        SocialPostServiceImpl(clientOptionsWithUserAgent)
    }

    private val socialPostResults: SocialPostResultService by lazy {
        SocialPostResultServiceImpl(clientOptionsWithUserAgent)
    }

    private val socialAccounts: SocialAccountService by lazy {
        SocialAccountServiceImpl(clientOptionsWithUserAgent)
    }

    private val socialAccountFeeds: SocialAccountFeedService by lazy {
        SocialAccountFeedServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): PostForMeClientAsync = async

    override fun withRawResponse(): PostForMeClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PostForMeClient =
        PostForMeClientImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * Media are media assets (images, videos, etc.) that can be attached to posts using the media
     * url. These endpoints are only needed if your media is not already available on a publicly
     * accessible URL. Media assets are stored temporarily and are automatically deleted in the
     * following scenarios:
     * - When the associated post is published
     * - After 24 hours if not attached to any post
     * - When the scheduled post is deleted
     */
    override fun media(): MediaService = media

    /**
     * Posts represent content that can be published across multiple social media platforms. Each
     * post can have platform-specific content variations, allowing customization for different
     * platforms and accounts. Content can be defined at three levels:
     * 1. Default content for all platforms
     * 2. Platform-specific content overrides
     * 3. Account-specific content overrides
     *
     * The system will use the most specific content override available when publishing to each
     * platform and account.
     */
    override fun socialPosts(): SocialPostService = socialPosts

    /**
     * Post results represent the outcome of publishing content to various social media platforms.
     * They provide comprehensive information including:
     * - Publication status (success/failure)
     * - Any errors or issues encountered during posting
     * - Platform url to view the published post
     */
    override fun socialPostResults(): SocialPostResultService = socialPostResults

    /**
     * Social accounts represent platform-specific accounts (e.g. Twitter, LinkedIn, Facebook) that
     * are used for publishing posts. Each social account has a unique `id` that can be referenced
     * when creating or scheduling posts to specify which platforms the content should be published
     * to.
     */
    override fun socialAccounts(): SocialAccountService = socialAccounts

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
    override fun socialAccountFeeds(): SocialAccountFeedService = socialAccountFeeds

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PostForMeClient.WithRawResponse {

        private val media: MediaService.WithRawResponse by lazy {
            MediaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val socialPosts: SocialPostService.WithRawResponse by lazy {
            SocialPostServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val socialPostResults: SocialPostResultService.WithRawResponse by lazy {
            SocialPostResultServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val socialAccounts: SocialAccountService.WithRawResponse by lazy {
            SocialAccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val socialAccountFeeds: SocialAccountFeedService.WithRawResponse by lazy {
            SocialAccountFeedServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PostForMeClient.WithRawResponse =
            PostForMeClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /**
         * Media are media assets (images, videos, etc.) that can be attached to posts using the
         * media url. These endpoints are only needed if your media is not already available on a
         * publicly accessible URL. Media assets are stored temporarily and are automatically
         * deleted in the following scenarios:
         * - When the associated post is published
         * - After 24 hours if not attached to any post
         * - When the scheduled post is deleted
         */
        override fun media(): MediaService.WithRawResponse = media

        /**
         * Posts represent content that can be published across multiple social media platforms.
         * Each post can have platform-specific content variations, allowing customization for
         * different platforms and accounts. Content can be defined at three levels:
         * 1. Default content for all platforms
         * 2. Platform-specific content overrides
         * 3. Account-specific content overrides
         *
         * The system will use the most specific content override available when publishing to each
         * platform and account.
         */
        override fun socialPosts(): SocialPostService.WithRawResponse = socialPosts

        /**
         * Post results represent the outcome of publishing content to various social media
         * platforms. They provide comprehensive information including:
         * - Publication status (success/failure)
         * - Any errors or issues encountered during posting
         * - Platform url to view the published post
         */
        override fun socialPostResults(): SocialPostResultService.WithRawResponse =
            socialPostResults

        /**
         * Social accounts represent platform-specific accounts (e.g. Twitter, LinkedIn, Facebook)
         * that are used for publishing posts. Each social account has a unique `id` that can be
         * referenced when creating or scheduling posts to specify which platforms the content
         * should be published to.
         */
        override fun socialAccounts(): SocialAccountService.WithRawResponse = socialAccounts

        /**
         * The social account feed is every post made for the social account, including posts not
         * made through our API. Use this endpoint to get the platform details for any post made
         * under the connected account. To use this endpoint accounts must be connected with the
         * **"feeds" permission**.
         *
         * Details will include:
         * - Post information including caption, url, media, etc..
         * - When passing **expand=metrics**, Metrics information including views, likes, follows,
         *   etc..
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
         * - **LinkedIn**, metrics are only available for company pages. LinkedIn has currently
         *   stopped giving permission for personal page analytics, we are on the waitlist for when
         *   they resume.
         */
        override fun socialAccountFeeds(): SocialAccountFeedService.WithRawResponse =
            socialAccountFeeds
    }
}
