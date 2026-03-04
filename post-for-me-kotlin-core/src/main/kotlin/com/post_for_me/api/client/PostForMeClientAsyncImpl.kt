// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.client

import com.post_for_me.api.core.ClientOptions
import com.post_for_me.api.core.getPackageVersion
import com.post_for_me.api.services.async.MediaServiceAsync
import com.post_for_me.api.services.async.MediaServiceAsyncImpl
import com.post_for_me.api.services.async.SocialAccountFeedServiceAsync
import com.post_for_me.api.services.async.SocialAccountFeedServiceAsyncImpl
import com.post_for_me.api.services.async.SocialAccountServiceAsync
import com.post_for_me.api.services.async.SocialAccountServiceAsyncImpl
import com.post_for_me.api.services.async.SocialPostResultServiceAsync
import com.post_for_me.api.services.async.SocialPostResultServiceAsyncImpl
import com.post_for_me.api.services.async.SocialPostServiceAsync
import com.post_for_me.api.services.async.SocialPostServiceAsyncImpl

class PostForMeClientAsyncImpl(private val clientOptions: ClientOptions) : PostForMeClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: PostForMeClient by lazy { PostForMeClientImpl(clientOptions) }

    private val withRawResponse: PostForMeClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val media: MediaServiceAsync by lazy {
        MediaServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val socialPosts: SocialPostServiceAsync by lazy {
        SocialPostServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val socialPostResults: SocialPostResultServiceAsync by lazy {
        SocialPostResultServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val socialAccounts: SocialAccountServiceAsync by lazy {
        SocialAccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val socialAccountFeeds: SocialAccountFeedServiceAsync by lazy {
        SocialAccountFeedServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): PostForMeClient = sync

    override fun withRawResponse(): PostForMeClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PostForMeClientAsync =
        PostForMeClientAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * Media are media assets (images, videos, etc.) that can be attached to posts using the media
     * url. These endpoints are only needed if your media is not already available on a publicly
     * accessible URL. Media assets are stored temporarily and are automatically deleted in the
     * following scenarios:
     * - When the associated post is published
     * - After 24 hours if not attached to any post
     * - When the scheduled post is deleted
     */
    override fun media(): MediaServiceAsync = media

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
    override fun socialPosts(): SocialPostServiceAsync = socialPosts

    /**
     * Post results represent the outcome of publishing content to various social media platforms.
     * They provide comprehensive information including:
     * - Publication status (success/failure)
     * - Any errors or issues encountered during posting
     * - Platform url to view the published post
     */
    override fun socialPostResults(): SocialPostResultServiceAsync = socialPostResults

    /**
     * Social accounts represent platform-specific accounts (e.g. Twitter, LinkedIn, Facebook) that
     * are used for publishing posts. Each social account has a unique `id` that can be referenced
     * when creating or scheduling posts to specify which platforms the content should be published
     * to.
     */
    override fun socialAccounts(): SocialAccountServiceAsync = socialAccounts

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
    override fun socialAccountFeeds(): SocialAccountFeedServiceAsync = socialAccountFeeds

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PostForMeClientAsync.WithRawResponse {

        private val media: MediaServiceAsync.WithRawResponse by lazy {
            MediaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val socialPosts: SocialPostServiceAsync.WithRawResponse by lazy {
            SocialPostServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val socialPostResults: SocialPostResultServiceAsync.WithRawResponse by lazy {
            SocialPostResultServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val socialAccounts: SocialAccountServiceAsync.WithRawResponse by lazy {
            SocialAccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val socialAccountFeeds: SocialAccountFeedServiceAsync.WithRawResponse by lazy {
            SocialAccountFeedServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PostForMeClientAsync.WithRawResponse =
            PostForMeClientAsyncImpl.WithRawResponseImpl(
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
        override fun media(): MediaServiceAsync.WithRawResponse = media

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
        override fun socialPosts(): SocialPostServiceAsync.WithRawResponse = socialPosts

        /**
         * Post results represent the outcome of publishing content to various social media
         * platforms. They provide comprehensive information including:
         * - Publication status (success/failure)
         * - Any errors or issues encountered during posting
         * - Platform url to view the published post
         */
        override fun socialPostResults(): SocialPostResultServiceAsync.WithRawResponse =
            socialPostResults

        /**
         * Social accounts represent platform-specific accounts (e.g. Twitter, LinkedIn, Facebook)
         * that are used for publishing posts. Each social account has a unique `id` that can be
         * referenced when creating or scheduling posts to specify which platforms the content
         * should be published to.
         */
        override fun socialAccounts(): SocialAccountServiceAsync.WithRawResponse = socialAccounts

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
        override fun socialAccountFeeds(): SocialAccountFeedServiceAsync.WithRawResponse =
            socialAccountFeeds
    }
}
