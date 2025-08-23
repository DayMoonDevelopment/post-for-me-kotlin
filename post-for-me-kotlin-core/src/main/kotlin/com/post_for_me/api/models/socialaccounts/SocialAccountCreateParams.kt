// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccounts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.post_for_me.api.core.Enum
import com.post_for_me.api.core.ExcludeMissing
import com.post_for_me.api.core.JsonField
import com.post_for_me.api.core.JsonMissing
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.Params
import com.post_for_me.api.core.checkRequired
import com.post_for_me.api.core.http.Headers
import com.post_for_me.api.core.http.QueryParams
import com.post_for_me.api.errors.PostForMeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * If a social account with the same platform and user_id already exists, it will be updated. If
 * not, a new social account will be created.
 */
class SocialAccountCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The access token of the social account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accessToken(): String = body.accessToken()

    /**
     * The access token expiration date of the social account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accessTokenExpiresAt(): OffsetDateTime = body.accessTokenExpiresAt()

    /**
     * The platform of the social account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platform(): Platform = body.platform()

    /**
     * The user id of the social account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = body.userId()

    /**
     * The external id of the social account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): String? = body.externalId()

    /** The metadata of the social account */
    fun _metadata(): JsonValue = body._metadata()

    /**
     * The refresh token of the social account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refreshToken(): String? = body.refreshToken()

    /**
     * The refresh token expiration date of the social account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refreshTokenExpiresAt(): OffsetDateTime? = body.refreshTokenExpiresAt()

    /**
     * The platform's username of the social account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun username(): String? = body.username()

    /**
     * Returns the raw JSON value of [accessToken].
     *
     * Unlike [accessToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accessToken(): JsonField<String> = body._accessToken()

    /**
     * Returns the raw JSON value of [accessTokenExpiresAt].
     *
     * Unlike [accessTokenExpiresAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _accessTokenExpiresAt(): JsonField<OffsetDateTime> = body._accessTokenExpiresAt()

    /**
     * Returns the raw JSON value of [platform].
     *
     * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _platform(): JsonField<Platform> = body._platform()

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userId(): JsonField<String> = body._userId()

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _externalId(): JsonField<String> = body._externalId()

    /**
     * Returns the raw JSON value of [refreshToken].
     *
     * Unlike [refreshToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _refreshToken(): JsonField<String> = body._refreshToken()

    /**
     * Returns the raw JSON value of [refreshTokenExpiresAt].
     *
     * Unlike [refreshTokenExpiresAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _refreshTokenExpiresAt(): JsonField<OffsetDateTime> = body._refreshTokenExpiresAt()

    /**
     * Returns the raw JSON value of [username].
     *
     * Unlike [username], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _username(): JsonField<String> = body._username()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SocialAccountCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .accessToken()
         * .accessTokenExpiresAt()
         * .platform()
         * .userId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SocialAccountCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(socialAccountCreateParams: SocialAccountCreateParams) = apply {
            body = socialAccountCreateParams.body.toBuilder()
            additionalHeaders = socialAccountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = socialAccountCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accessToken]
         * - [accessTokenExpiresAt]
         * - [platform]
         * - [userId]
         * - [externalId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The access token of the social account */
        fun accessToken(accessToken: String) = apply { body.accessToken(accessToken) }

        /**
         * Sets [Builder.accessToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accessToken(accessToken: JsonField<String>) = apply { body.accessToken(accessToken) }

        /** The access token expiration date of the social account */
        fun accessTokenExpiresAt(accessTokenExpiresAt: OffsetDateTime) = apply {
            body.accessTokenExpiresAt(accessTokenExpiresAt)
        }

        /**
         * Sets [Builder.accessTokenExpiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessTokenExpiresAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun accessTokenExpiresAt(accessTokenExpiresAt: JsonField<OffsetDateTime>) = apply {
            body.accessTokenExpiresAt(accessTokenExpiresAt)
        }

        /** The platform of the social account */
        fun platform(platform: Platform) = apply { body.platform(platform) }

        /**
         * Sets [Builder.platform] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platform] with a well-typed [Platform] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun platform(platform: JsonField<Platform>) = apply { body.platform(platform) }

        /** The user id of the social account */
        fun userId(userId: String) = apply { body.userId(userId) }

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { body.userId(userId) }

        /** The external id of the social account */
        fun externalId(externalId: String?) = apply { body.externalId(externalId) }

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { body.externalId(externalId) }

        /** The metadata of the social account */
        fun metadata(metadata: JsonValue) = apply { body.metadata(metadata) }

        /** The refresh token of the social account */
        fun refreshToken(refreshToken: String?) = apply { body.refreshToken(refreshToken) }

        /**
         * Sets [Builder.refreshToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refreshToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun refreshToken(refreshToken: JsonField<String>) = apply {
            body.refreshToken(refreshToken)
        }

        /** The refresh token expiration date of the social account */
        fun refreshTokenExpiresAt(refreshTokenExpiresAt: OffsetDateTime?) = apply {
            body.refreshTokenExpiresAt(refreshTokenExpiresAt)
        }

        /**
         * Sets [Builder.refreshTokenExpiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refreshTokenExpiresAt] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun refreshTokenExpiresAt(refreshTokenExpiresAt: JsonField<OffsetDateTime>) = apply {
            body.refreshTokenExpiresAt(refreshTokenExpiresAt)
        }

        /** The platform's username of the social account */
        fun username(username: String?) = apply { body.username(username) }

        /**
         * Sets [Builder.username] to an arbitrary JSON value.
         *
         * You should usually call [Builder.username] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun username(username: JsonField<String>) = apply { body.username(username) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [SocialAccountCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accessToken()
         * .accessTokenExpiresAt()
         * .platform()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SocialAccountCreateParams =
            SocialAccountCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val accessToken: JsonField<String>,
        private val accessTokenExpiresAt: JsonField<OffsetDateTime>,
        private val platform: JsonField<Platform>,
        private val userId: JsonField<String>,
        private val externalId: JsonField<String>,
        private val metadata: JsonValue,
        private val refreshToken: JsonField<String>,
        private val refreshTokenExpiresAt: JsonField<OffsetDateTime>,
        private val username: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("access_token")
            @ExcludeMissing
            accessToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("access_token_expires_at")
            @ExcludeMissing
            accessTokenExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("platform")
            @ExcludeMissing
            platform: JsonField<Platform> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_id")
            @ExcludeMissing
            externalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
            @JsonProperty("refresh_token")
            @ExcludeMissing
            refreshToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("refresh_token_expires_at")
            @ExcludeMissing
            refreshTokenExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("username") @ExcludeMissing username: JsonField<String> = JsonMissing.of(),
        ) : this(
            accessToken,
            accessTokenExpiresAt,
            platform,
            userId,
            externalId,
            metadata,
            refreshToken,
            refreshTokenExpiresAt,
            username,
            mutableMapOf(),
        )

        /**
         * The access token of the social account
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accessToken(): String = accessToken.getRequired("access_token")

        /**
         * The access token expiration date of the social account
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accessTokenExpiresAt(): OffsetDateTime =
            accessTokenExpiresAt.getRequired("access_token_expires_at")

        /**
         * The platform of the social account
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun platform(): Platform = platform.getRequired("platform")

        /**
         * The user id of the social account
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userId(): String = userId.getRequired("user_id")

        /**
         * The external id of the social account
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun externalId(): String? = externalId.getNullable("external_id")

        /** The metadata of the social account */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

        /**
         * The refresh token of the social account
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun refreshToken(): String? = refreshToken.getNullable("refresh_token")

        /**
         * The refresh token expiration date of the social account
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun refreshTokenExpiresAt(): OffsetDateTime? =
            refreshTokenExpiresAt.getNullable("refresh_token_expires_at")

        /**
         * The platform's username of the social account
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun username(): String? = username.getNullable("username")

        /**
         * Returns the raw JSON value of [accessToken].
         *
         * Unlike [accessToken], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("access_token")
        @ExcludeMissing
        fun _accessToken(): JsonField<String> = accessToken

        /**
         * Returns the raw JSON value of [accessTokenExpiresAt].
         *
         * Unlike [accessTokenExpiresAt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("access_token_expires_at")
        @ExcludeMissing
        fun _accessTokenExpiresAt(): JsonField<OffsetDateTime> = accessTokenExpiresAt

        /**
         * Returns the raw JSON value of [platform].
         *
         * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<Platform> = platform

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

        /**
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * Returns the raw JSON value of [refreshToken].
         *
         * Unlike [refreshToken], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("refresh_token")
        @ExcludeMissing
        fun _refreshToken(): JsonField<String> = refreshToken

        /**
         * Returns the raw JSON value of [refreshTokenExpiresAt].
         *
         * Unlike [refreshTokenExpiresAt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("refresh_token_expires_at")
        @ExcludeMissing
        fun _refreshTokenExpiresAt(): JsonField<OffsetDateTime> = refreshTokenExpiresAt

        /**
         * Returns the raw JSON value of [username].
         *
         * Unlike [username], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .accessToken()
             * .accessTokenExpiresAt()
             * .platform()
             * .userId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accessToken: JsonField<String>? = null
            private var accessTokenExpiresAt: JsonField<OffsetDateTime>? = null
            private var platform: JsonField<Platform>? = null
            private var userId: JsonField<String>? = null
            private var externalId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var refreshToken: JsonField<String> = JsonMissing.of()
            private var refreshTokenExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var username: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                accessToken = body.accessToken
                accessTokenExpiresAt = body.accessTokenExpiresAt
                platform = body.platform
                userId = body.userId
                externalId = body.externalId
                metadata = body.metadata
                refreshToken = body.refreshToken
                refreshTokenExpiresAt = body.refreshTokenExpiresAt
                username = body.username
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The access token of the social account */
            fun accessToken(accessToken: String) = accessToken(JsonField.of(accessToken))

            /**
             * Sets [Builder.accessToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accessToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accessToken(accessToken: JsonField<String>) = apply {
                this.accessToken = accessToken
            }

            /** The access token expiration date of the social account */
            fun accessTokenExpiresAt(accessTokenExpiresAt: OffsetDateTime) =
                accessTokenExpiresAt(JsonField.of(accessTokenExpiresAt))

            /**
             * Sets [Builder.accessTokenExpiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accessTokenExpiresAt] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun accessTokenExpiresAt(accessTokenExpiresAt: JsonField<OffsetDateTime>) = apply {
                this.accessTokenExpiresAt = accessTokenExpiresAt
            }

            /** The platform of the social account */
            fun platform(platform: Platform) = platform(JsonField.of(platform))

            /**
             * Sets [Builder.platform] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platform] with a well-typed [Platform] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platform(platform: JsonField<Platform>) = apply { this.platform = platform }

            /** The user id of the social account */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

            /** The external id of the social account */
            fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

            /**
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            /** The metadata of the social account */
            fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

            /** The refresh token of the social account */
            fun refreshToken(refreshToken: String?) =
                refreshToken(JsonField.ofNullable(refreshToken))

            /**
             * Sets [Builder.refreshToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refreshToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refreshToken(refreshToken: JsonField<String>) = apply {
                this.refreshToken = refreshToken
            }

            /** The refresh token expiration date of the social account */
            fun refreshTokenExpiresAt(refreshTokenExpiresAt: OffsetDateTime?) =
                refreshTokenExpiresAt(JsonField.ofNullable(refreshTokenExpiresAt))

            /**
             * Sets [Builder.refreshTokenExpiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refreshTokenExpiresAt] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun refreshTokenExpiresAt(refreshTokenExpiresAt: JsonField<OffsetDateTime>) = apply {
                this.refreshTokenExpiresAt = refreshTokenExpiresAt
            }

            /** The platform's username of the social account */
            fun username(username: String?) = username(JsonField.ofNullable(username))

            /**
             * Sets [Builder.username] to an arbitrary JSON value.
             *
             * You should usually call [Builder.username] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun username(username: JsonField<String>) = apply { this.username = username }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .accessToken()
             * .accessTokenExpiresAt()
             * .platform()
             * .userId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accessToken", accessToken),
                    checkRequired("accessTokenExpiresAt", accessTokenExpiresAt),
                    checkRequired("platform", platform),
                    checkRequired("userId", userId),
                    externalId,
                    metadata,
                    refreshToken,
                    refreshTokenExpiresAt,
                    username,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accessToken()
            accessTokenExpiresAt()
            platform().validate()
            userId()
            externalId()
            refreshToken()
            refreshTokenExpiresAt()
            username()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: PostForMeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (accessToken.asKnown() == null) 0 else 1) +
                (if (accessTokenExpiresAt.asKnown() == null) 0 else 1) +
                (platform.asKnown()?.validity() ?: 0) +
                (if (userId.asKnown() == null) 0 else 1) +
                (if (externalId.asKnown() == null) 0 else 1) +
                (if (refreshToken.asKnown() == null) 0 else 1) +
                (if (refreshTokenExpiresAt.asKnown() == null) 0 else 1) +
                (if (username.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accessToken == other.accessToken &&
                accessTokenExpiresAt == other.accessTokenExpiresAt &&
                platform == other.platform &&
                userId == other.userId &&
                externalId == other.externalId &&
                metadata == other.metadata &&
                refreshToken == other.refreshToken &&
                refreshTokenExpiresAt == other.refreshTokenExpiresAt &&
                username == other.username &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accessToken,
                accessTokenExpiresAt,
                platform,
                userId,
                externalId,
                metadata,
                refreshToken,
                refreshTokenExpiresAt,
                username,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accessToken=$accessToken, accessTokenExpiresAt=$accessTokenExpiresAt, platform=$platform, userId=$userId, externalId=$externalId, metadata=$metadata, refreshToken=$refreshToken, refreshTokenExpiresAt=$refreshTokenExpiresAt, username=$username, additionalProperties=$additionalProperties}"
    }

    /** The platform of the social account */
    class Platform @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val FACEBOOK = of("facebook")

            val INSTAGRAM = of("instagram")

            val X = of("x")

            val TIKTOK = of("tiktok")

            val YOUTUBE = of("youtube")

            val PINTEREST = of("pinterest")

            val LINKEDIN = of("linkedin")

            val BLUESKY = of("bluesky")

            val THREADS = of("threads")

            val TIKTOK_BUSINESS = of("tiktok_business")

            fun of(value: String) = Platform(JsonField.of(value))
        }

        /** An enum containing [Platform]'s known values. */
        enum class Known {
            FACEBOOK,
            INSTAGRAM,
            X,
            TIKTOK,
            YOUTUBE,
            PINTEREST,
            LINKEDIN,
            BLUESKY,
            THREADS,
            TIKTOK_BUSINESS,
        }

        /**
         * An enum containing [Platform]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Platform] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FACEBOOK,
            INSTAGRAM,
            X,
            TIKTOK,
            YOUTUBE,
            PINTEREST,
            LINKEDIN,
            BLUESKY,
            THREADS,
            TIKTOK_BUSINESS,
            /** An enum member indicating that [Platform] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                FACEBOOK -> Value.FACEBOOK
                INSTAGRAM -> Value.INSTAGRAM
                X -> Value.X
                TIKTOK -> Value.TIKTOK
                YOUTUBE -> Value.YOUTUBE
                PINTEREST -> Value.PINTEREST
                LINKEDIN -> Value.LINKEDIN
                BLUESKY -> Value.BLUESKY
                THREADS -> Value.THREADS
                TIKTOK_BUSINESS -> Value.TIKTOK_BUSINESS
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws PostForMeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                FACEBOOK -> Known.FACEBOOK
                INSTAGRAM -> Known.INSTAGRAM
                X -> Known.X
                TIKTOK -> Known.TIKTOK
                YOUTUBE -> Known.YOUTUBE
                PINTEREST -> Known.PINTEREST
                LINKEDIN -> Known.LINKEDIN
                BLUESKY -> Known.BLUESKY
                THREADS -> Known.THREADS
                TIKTOK_BUSINESS -> Known.TIKTOK_BUSINESS
                else -> throw PostForMeInvalidDataException("Unknown Platform: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws PostForMeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw PostForMeInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): Platform = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: PostForMeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Platform && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SocialAccountCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SocialAccountCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
