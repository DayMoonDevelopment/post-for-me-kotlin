// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.client

import com.post_for_me.api.core.ClientOptions
import com.post_for_me.api.services.blocking.MediaService
import com.post_for_me.api.services.blocking.SocialAccountFeedService
import com.post_for_me.api.services.blocking.SocialAccountService
import com.post_for_me.api.services.blocking.SocialPostResultService
import com.post_for_me.api.services.blocking.SocialPostService

/**
 * A client for interacting with the Post For Me REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface PostForMeClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): PostForMeClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PostForMeClient

    /**
     * Media are media assets (images, videos, etc.) that can be attached to posts using the media
     * url. These endpoints are only needed if your media is not already available on a publicly
     * accessible URL. Media assets are stored temporarily and are automatically deleted in the
     * following scenarios:
     * - When the associated post is published
     * - After 24 hours if not attached to any post
     * - When the scheduled post is deleted
     */
    fun media(): MediaService

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
    fun socialPosts(): SocialPostService

    /**
     * Post results represent the outcome of publishing content to various social media platforms.
     * They provide comprehensive information including:
     * - Publication status (success/failure)
     * - Any errors or issues encountered during posting
     * - Platform url to view the published post
     */
    fun socialPostResults(): SocialPostResultService

    /**
     * Social accounts represent platform-specific accounts (e.g. Twitter, LinkedIn, Facebook) that
     * are used for publishing posts. Each social account has a unique `id` that can be referenced
     * when creating or scheduling posts to specify which platforms the content should be published
     * to.
     */
    fun socialAccounts(): SocialAccountService

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
    fun socialAccountFeeds(): SocialAccountFeedService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /** A view of [PostForMeClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PostForMeClient.WithRawResponse

        /**
         * Media are media assets (images, videos, etc.) that can be attached to posts using the
         * media url. These endpoints are only needed if your media is not already available on a
         * publicly accessible URL. Media assets are stored temporarily and are automatically
         * deleted in the following scenarios:
         * - When the associated post is published
         * - After 24 hours if not attached to any post
         * - When the scheduled post is deleted
         */
        fun media(): MediaService.WithRawResponse

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
        fun socialPosts(): SocialPostService.WithRawResponse

        /**
         * Post results represent the outcome of publishing content to various social media
         * platforms. They provide comprehensive information including:
         * - Publication status (success/failure)
         * - Any errors or issues encountered during posting
         * - Platform url to view the published post
         */
        fun socialPostResults(): SocialPostResultService.WithRawResponse

        /**
         * Social accounts represent platform-specific accounts (e.g. Twitter, LinkedIn, Facebook)
         * that are used for publishing posts. Each social account has a unique `id` that can be
         * referenced when creating or scheduling posts to specify which platforms the content
         * should be published to.
         */
        fun socialAccounts(): SocialAccountService.WithRawResponse

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
        fun socialAccountFeeds(): SocialAccountFeedService.WithRawResponse
    }
}
