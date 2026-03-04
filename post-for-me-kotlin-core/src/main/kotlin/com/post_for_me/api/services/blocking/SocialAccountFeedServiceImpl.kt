// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.blocking

import com.post_for_me.api.core.ClientOptions
import com.post_for_me.api.core.RequestOptions
import com.post_for_me.api.core.checkRequired
import com.post_for_me.api.core.handlers.errorBodyHandler
import com.post_for_me.api.core.handlers.errorHandler
import com.post_for_me.api.core.handlers.jsonHandler
import com.post_for_me.api.core.http.HttpMethod
import com.post_for_me.api.core.http.HttpRequest
import com.post_for_me.api.core.http.HttpResponse
import com.post_for_me.api.core.http.HttpResponse.Handler
import com.post_for_me.api.core.http.HttpResponseFor
import com.post_for_me.api.core.http.parseable
import com.post_for_me.api.core.prepare
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
class SocialAccountFeedServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SocialAccountFeedService {

    private val withRawResponse: SocialAccountFeedService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SocialAccountFeedService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SocialAccountFeedService =
        SocialAccountFeedServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun list(
        params: SocialAccountFeedListParams,
        requestOptions: RequestOptions,
    ): SocialAccountFeedListResponse =
        // get /v1/social-account-feeds/{social_account_id}
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SocialAccountFeedService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SocialAccountFeedService.WithRawResponse =
            SocialAccountFeedServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listHandler: Handler<SocialAccountFeedListResponse> =
            jsonHandler<SocialAccountFeedListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SocialAccountFeedListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialAccountFeedListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("socialAccountId", params.socialAccountId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "social-account-feeds", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
