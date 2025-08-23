// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.post_for_me.api.core.ClientOptions
import com.post_for_me.api.core.RequestOptions
import com.post_for_me.api.core.http.HttpResponseFor
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

interface SocialAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SocialAccountServiceAsync

    /**
     * If a social account with the same platform and user_id already exists, it will be updated. If
     * not, a new social account will be created.
     */
    suspend fun create(
        params: SocialAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialAccount

    /** Get social account by ID */
    suspend fun retrieve(
        id: String,
        params: SocialAccountRetrieveParams = SocialAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialAccount = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: SocialAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialAccount

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): SocialAccount =
        retrieve(id, SocialAccountRetrieveParams.none(), requestOptions)

    /** Update social account */
    suspend fun update(
        id: String,
        params: SocialAccountUpdateParams = SocialAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialAccount = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: SocialAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialAccount

    /** @see update */
    suspend fun update(id: String, requestOptions: RequestOptions): SocialAccount =
        update(id, SocialAccountUpdateParams.none(), requestOptions)

    /** Get a paginated result for social accounts based on the applied filters */
    suspend fun list(
        params: SocialAccountListParams = SocialAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialAccountListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): SocialAccountListResponse =
        list(SocialAccountListParams.none(), requestOptions)

    /**
     * Generates a URL that initiates the authentication flow for a user's social media account.
     * When visited, the user is redirected to the selected social platform's login/authorization
     * page. Upon successful authentication, they are redirected back to your application
     */
    suspend fun createAuthUrl(
        params: SocialAccountCreateAuthUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialAccountCreateAuthUrlResponse

    /**
     * Disconnecting an account with remove all auth tokens and mark the account as disconnected.
     * The record of the account will be kept and can be retrieved and reconnected by the owner of
     * the account.
     */
    suspend fun disconnect(
        id: String,
        params: SocialAccountDisconnectParams = SocialAccountDisconnectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialAccountDisconnectResponse =
        disconnect(params.toBuilder().id(id).build(), requestOptions)

    /** @see disconnect */
    suspend fun disconnect(
        params: SocialAccountDisconnectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SocialAccountDisconnectResponse

    /** @see disconnect */
    suspend fun disconnect(
        id: String,
        requestOptions: RequestOptions,
    ): SocialAccountDisconnectResponse =
        disconnect(id, SocialAccountDisconnectParams.none(), requestOptions)

    /**
     * A view of [SocialAccountServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SocialAccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/social-accounts`, but is otherwise the same as
         * [SocialAccountServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: SocialAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialAccount>

        /**
         * Returns a raw HTTP response for `get /v1/social-accounts/{id}`, but is otherwise the same
         * as [SocialAccountServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: SocialAccountRetrieveParams = SocialAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialAccount> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: SocialAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialAccount>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialAccount> =
            retrieve(id, SocialAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/social-accounts/{id}`, but is otherwise the
         * same as [SocialAccountServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: SocialAccountUpdateParams = SocialAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialAccount> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: SocialAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialAccount>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialAccount> =
            update(id, SocialAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/social-accounts`, but is otherwise the same as
         * [SocialAccountServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: SocialAccountListParams = SocialAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialAccountListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<SocialAccountListResponse> =
            list(SocialAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/social-accounts/auth-url`, but is otherwise the
         * same as [SocialAccountServiceAsync.createAuthUrl].
         */
        @MustBeClosed
        suspend fun createAuthUrl(
            params: SocialAccountCreateAuthUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialAccountCreateAuthUrlResponse>

        /**
         * Returns a raw HTTP response for `post /v1/social-accounts/{id}/disconnect`, but is
         * otherwise the same as [SocialAccountServiceAsync.disconnect].
         */
        @MustBeClosed
        suspend fun disconnect(
            id: String,
            params: SocialAccountDisconnectParams = SocialAccountDisconnectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialAccountDisconnectResponse> =
            disconnect(params.toBuilder().id(id).build(), requestOptions)

        /** @see disconnect */
        @MustBeClosed
        suspend fun disconnect(
            params: SocialAccountDisconnectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SocialAccountDisconnectResponse>

        /** @see disconnect */
        @MustBeClosed
        suspend fun disconnect(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SocialAccountDisconnectResponse> =
            disconnect(id, SocialAccountDisconnectParams.none(), requestOptions)
    }
}
