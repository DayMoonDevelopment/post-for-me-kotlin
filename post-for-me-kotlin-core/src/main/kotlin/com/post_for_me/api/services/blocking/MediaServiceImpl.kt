// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.blocking

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
import com.post_for_me.api.core.prepare
import com.post_for_me.api.models.media.MediaCreateUploadUrlParams
import com.post_for_me.api.models.media.MediaCreateUploadUrlResponse

class MediaServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MediaService {

    private val withRawResponse: MediaService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MediaService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MediaService =
        MediaServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun createUploadUrl(
        params: MediaCreateUploadUrlParams,
        requestOptions: RequestOptions,
    ): MediaCreateUploadUrlResponse =
        // post /v1/media/create-upload-url
        withRawResponse().createUploadUrl(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MediaService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MediaService.WithRawResponse =
            MediaServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val createUploadUrlHandler: Handler<MediaCreateUploadUrlResponse> =
            jsonHandler<MediaCreateUploadUrlResponse>(clientOptions.jsonMapper)

        override fun createUploadUrl(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
