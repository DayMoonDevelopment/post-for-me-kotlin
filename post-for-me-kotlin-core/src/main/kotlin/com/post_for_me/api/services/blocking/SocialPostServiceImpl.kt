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
import com.post_for_me.api.core.http.json
import com.post_for_me.api.core.http.parseable
import com.post_for_me.api.core.prepare
import com.post_for_me.api.models.socialposts.SocialPost
import com.post_for_me.api.models.socialposts.SocialPostCreateParams
import com.post_for_me.api.models.socialposts.SocialPostDeleteParams
import com.post_for_me.api.models.socialposts.SocialPostDeleteResponse
import com.post_for_me.api.models.socialposts.SocialPostListParams
import com.post_for_me.api.models.socialposts.SocialPostListResponse
import com.post_for_me.api.models.socialposts.SocialPostRetrieveParams
import com.post_for_me.api.models.socialposts.SocialPostUpdateParams

class SocialPostServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SocialPostService {

    private val withRawResponse: SocialPostService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SocialPostService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SocialPostService =
        SocialPostServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: SocialPostCreateParams,
        requestOptions: RequestOptions,
    ): SocialPost =
        // post /v1/social-posts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: SocialPostRetrieveParams,
        requestOptions: RequestOptions,
    ): SocialPost =
        // get /v1/social-posts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: SocialPostUpdateParams,
        requestOptions: RequestOptions,
    ): SocialPost =
        // put /v1/social-posts/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: SocialPostListParams,
        requestOptions: RequestOptions,
    ): SocialPostListResponse =
        // get /v1/social-posts
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: SocialPostDeleteParams,
        requestOptions: RequestOptions,
    ): SocialPostDeleteResponse =
        // delete /v1/social-posts/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SocialPostService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SocialPostService.WithRawResponse =
            SocialPostServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<SocialPost> =
            jsonHandler<SocialPost>(clientOptions.jsonMapper)

        override fun create(
            params: SocialPostCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialPost> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "social-posts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<SocialPost> =
            jsonHandler<SocialPost>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SocialPostRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialPost> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "social-posts", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val updateHandler: Handler<SocialPost> =
            jsonHandler<SocialPost>(clientOptions.jsonMapper)

        override fun update(
            params: SocialPostUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialPost> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "social-posts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<SocialPostListResponse> =
            jsonHandler<SocialPostListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SocialPostListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialPostListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "social-posts")
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

        private val deleteHandler: Handler<SocialPostDeleteResponse> =
            jsonHandler<SocialPostDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: SocialPostDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialPostDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "social-posts", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
