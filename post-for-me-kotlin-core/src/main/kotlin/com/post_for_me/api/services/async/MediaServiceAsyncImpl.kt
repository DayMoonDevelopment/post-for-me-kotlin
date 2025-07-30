// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.async

import com.post_for_me.api.core.ClientOptions
import com.post_for_me.api.core.RequestOptions
import com.post_for_me.api.core.handlers.errorBodyHandler
import com.post_for_me.api.core.handlers.errorHandler
import com.post_for_me.api.core.handlers.jsonHandler
import com.post_for_me.api.core.http.HttpMethod
import com.post_for_me.api.core.http.HttpRequest
import com.post_for_me.api.core.http.HttpResponse
import com.post_for_me.api.core.http.HttpResponse.Handler
import com.post_for_me.api.core.http.HttpResponseFor
import com.post_for_me.api.core.http.json
import com.post_for_me.api.core.http.parseable
import com.post_for_me.api.core.prepareAsync
import com.post_for_me.api.models.media.MediaCreateUploadUrlParams
import com.post_for_me.api.models.media.MediaCreateUploadUrlResponse

class MediaServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MediaServiceAsync {

    private val withRawResponse: MediaServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MediaServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MediaServiceAsync =
        MediaServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun createUploadUrl(
        params: MediaCreateUploadUrlParams,
        requestOptions: RequestOptions,
    ): MediaCreateUploadUrlResponse =
        // post /v1/media/create-upload-url
        withRawResponse().createUploadUrl(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MediaServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MediaServiceAsync.WithRawResponse =
            MediaServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createUploadUrlHandler: Handler<MediaCreateUploadUrlResponse> =
            jsonHandler<MediaCreateUploadUrlResponse>(clientOptions.jsonMapper)

        override suspend fun createUploadUrl(
            params: MediaCreateUploadUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaCreateUploadUrlResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "media", "create-upload-url")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createUploadUrlHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
