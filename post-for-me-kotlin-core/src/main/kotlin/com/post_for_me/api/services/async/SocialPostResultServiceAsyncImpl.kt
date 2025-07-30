// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.async

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
import com.post_for_me.api.core.prepareAsync
import com.post_for_me.api.models.socialpostresults.SocialPostResult
import com.post_for_me.api.models.socialpostresults.SocialPostResultListParams
import com.post_for_me.api.models.socialpostresults.SocialPostResultListResponse
import com.post_for_me.api.models.socialpostresults.SocialPostResultRetrieveParams

class SocialPostResultServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : SocialPostResultServiceAsync {

    private val withRawResponse: SocialPostResultServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SocialPostResultServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): SocialPostResultServiceAsync =
        SocialPostResultServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: SocialPostResultRetrieveParams,
        requestOptions: RequestOptions,
    ): SocialPostResult =
        // get /v1/social-post-results/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: SocialPostResultListParams,
        requestOptions: RequestOptions,
    ): SocialPostResultListResponse =
        // get /v1/social-post-results
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SocialPostResultServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SocialPostResultServiceAsync.WithRawResponse =
            SocialPostResultServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<SocialPostResult> =
            jsonHandler<SocialPostResult>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: SocialPostResultRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialPostResult> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "social-post-results", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<SocialPostResultListResponse> =
            jsonHandler<SocialPostResultListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: SocialPostResultListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialPostResultListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "social-post-results")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
