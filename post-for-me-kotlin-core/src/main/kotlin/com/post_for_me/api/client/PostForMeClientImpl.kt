// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.client

import com.post_for_me.api.core.ClientOptions
import com.post_for_me.api.core.getPackageVersion
import com.post_for_me.api.services.blocking.MediaService
import com.post_for_me.api.services.blocking.MediaServiceImpl
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

    override fun async(): PostForMeClientAsync = async

    override fun withRawResponse(): PostForMeClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PostForMeClient =
        PostForMeClientImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun media(): MediaService = media

    override fun socialPosts(): SocialPostService = socialPosts

    override fun socialPostResults(): SocialPostResultService = socialPostResults

    override fun socialAccounts(): SocialAccountService = socialAccounts

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

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PostForMeClient.WithRawResponse =
            PostForMeClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun media(): MediaService.WithRawResponse = media

        override fun socialPosts(): SocialPostService.WithRawResponse = socialPosts

        override fun socialPostResults(): SocialPostResultService.WithRawResponse =
            socialPostResults

        override fun socialAccounts(): SocialAccountService.WithRawResponse = socialAccounts
    }
}
