// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.client

import com.post_for_me.api.core.ClientOptions
import com.post_for_me.api.core.getPackageVersion
import com.post_for_me.api.services.async.MediaServiceAsync
import com.post_for_me.api.services.async.MediaServiceAsyncImpl
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

    override fun sync(): PostForMeClient = sync

    override fun withRawResponse(): PostForMeClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PostForMeClientAsync =
        PostForMeClientAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun media(): MediaServiceAsync = media

    override fun socialPosts(): SocialPostServiceAsync = socialPosts

    override fun socialPostResults(): SocialPostResultServiceAsync = socialPostResults

    override fun socialAccounts(): SocialAccountServiceAsync = socialAccounts

    override fun close() = clientOptions.httpClient.close()

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

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PostForMeClientAsync.WithRawResponse =
            PostForMeClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun media(): MediaServiceAsync.WithRawResponse = media

        override fun socialPosts(): SocialPostServiceAsync.WithRawResponse = socialPosts

        override fun socialPostResults(): SocialPostResultServiceAsync.WithRawResponse =
            socialPostResults

        override fun socialAccounts(): SocialAccountServiceAsync.WithRawResponse = socialAccounts
    }
}
