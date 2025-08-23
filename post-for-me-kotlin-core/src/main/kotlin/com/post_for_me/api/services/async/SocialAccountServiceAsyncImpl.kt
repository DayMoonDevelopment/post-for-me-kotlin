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
import com.post_for_me.api.core.http.json
import com.post_for_me.api.core.http.parseable
import com.post_for_me.api.core.prepareAsync
import com.post_for_me.api.models.socialaccounts.SocialAccount
import com.post_for_me.api.models.socialaccounts.SocialAccountCreateAuthUrlParams
import com.post_for_me.api.models.socialaccounts.SocialAccountCreateAuthUrlResponse
import com.post_for_me.api.models.socialaccounts.SocialAccountCreateParams
import com.post_for_me.api.models.socialaccounts.SocialAccountDisconnectParams
import com.post_for_me.api.models.socialaccounts.SocialAccountDisconnectResponse
import com.post_for_me.api.models.socialaccounts.SocialAccountListParams
import com.post_for_me.api.models.socialaccounts.SocialAccountListResponse
import com.post_for_me.api.models.socialaccounts.SocialAccountRetrieveParams
import com.post_for_me.api.models.socialaccounts.SocialAccountUpdateParams

class SocialAccountServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SocialAccountServiceAsync {

    private val withRawResponse: SocialAccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SocialAccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SocialAccountServiceAsync =
        SocialAccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: SocialAccountCreateParams,
        requestOptions: RequestOptions,
    ): SocialAccount =
        // post /v1/social-accounts
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: SocialAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): SocialAccount =
        // get /v1/social-accounts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: SocialAccountUpdateParams,
        requestOptions: RequestOptions,
    ): SocialAccount =
        // patch /v1/social-accounts/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: SocialAccountListParams,
        requestOptions: RequestOptions,
    ): SocialAccountListResponse =
        // get /v1/social-accounts
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun createAuthUrl(
        params: SocialAccountCreateAuthUrlParams,
        requestOptions: RequestOptions,
    ): SocialAccountCreateAuthUrlResponse =
        // post /v1/social-accounts/auth-url
        withRawResponse().createAuthUrl(params, requestOptions).parse()

    override suspend fun disconnect(
        params: SocialAccountDisconnectParams,
        requestOptions: RequestOptions,
    ): SocialAccountDisconnectResponse =
        // post /v1/social-accounts/{id}/disconnect
        withRawResponse().disconnect(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SocialAccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SocialAccountServiceAsync.WithRawResponse =
            SocialAccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<SocialAccount> =
            jsonHandler<SocialAccount>(clientOptions.jsonMapper)

        override suspend fun create(
            params: SocialAccountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "social-accounts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val retrieveHandler: Handler<SocialAccount> =
            jsonHandler<SocialAccount>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: SocialAccountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialAccount> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "social-accounts", params._pathParam(0))
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

        private val updateHandler: Handler<SocialAccount> =
            jsonHandler<SocialAccount>(clientOptions.jsonMapper)

        override suspend fun update(
            params: SocialAccountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialAccount> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "social-accounts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val listHandler: Handler<SocialAccountListResponse> =
            jsonHandler<SocialAccountListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: SocialAccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialAccountListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "social-accounts")
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

        private val createAuthUrlHandler: Handler<SocialAccountCreateAuthUrlResponse> =
            jsonHandler<SocialAccountCreateAuthUrlResponse>(clientOptions.jsonMapper)

        override suspend fun createAuthUrl(
            params: SocialAccountCreateAuthUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialAccountCreateAuthUrlResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "social-accounts", "auth-url")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createAuthUrlHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val disconnectHandler: Handler<SocialAccountDisconnectResponse> =
            jsonHandler<SocialAccountDisconnectResponse>(clientOptions.jsonMapper)

        override suspend fun disconnect(
            params: SocialAccountDisconnectParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialAccountDisconnectResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "social-accounts", params._pathParam(0), "disconnect")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { disconnectHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
