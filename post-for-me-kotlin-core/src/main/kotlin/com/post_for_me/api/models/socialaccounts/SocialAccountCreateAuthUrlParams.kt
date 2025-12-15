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
import com.post_for_me.api.core.checkKnown
import com.post_for_me.api.core.checkRequired
import com.post_for_me.api.core.http.Headers
import com.post_for_me.api.core.http.QueryParams
import com.post_for_me.api.core.toImmutable
import com.post_for_me.api.errors.PostForMeInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Generates a URL that initiates the authentication flow for a user's social media account. When
 * visited, the user is redirected to the selected social platform's login/authorization page. Upon
 * successful authentication, they are redirected back to your application
 */
class SocialAccountCreateAuthUrlParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The social account provider
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platform(): String = body.platform()

    /**
     * Your unique identifier for the social account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): String? = body.externalId()

    /**
     * List of permissions you want to allow. Will default to only post permissions. You must
     * include the "feeds" permission to request an account feed and metrics
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun permissions(): List<Permission>? = body.permissions()

    /**
     * Additional data needed for the provider
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun platformData(): PlatformData? = body.platformData()

    /**
     * Override the default redirect URL for the OAuth flow. If provided, this URL will be used
     * instead of our redirect URL. Make sure this URL is included in your app's authorized redirect
     * urls. This override will not work when using our system credientals.
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun redirectUrlOverride(): String? = body.redirectUrlOverride()

    /**
     * Returns the raw JSON value of [platform].
     *
     * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _platform(): JsonField<String> = body._platform()

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _externalId(): JsonField<String> = body._externalId()

    /**
     * Returns the raw JSON value of [permissions].
     *
     * Unlike [permissions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _permissions(): JsonField<List<Permission>> = body._permissions()

    /**
     * Returns the raw JSON value of [platformData].
     *
     * Unlike [platformData], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _platformData(): JsonField<PlatformData> = body._platformData()

    /**
     * Returns the raw JSON value of [redirectUrlOverride].
     *
     * Unlike [redirectUrlOverride], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _redirectUrlOverride(): JsonField<String> = body._redirectUrlOverride()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SocialAccountCreateAuthUrlParams].
         *
         * The following fields are required:
         * ```kotlin
         * .platform()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SocialAccountCreateAuthUrlParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(socialAccountCreateAuthUrlParams: SocialAccountCreateAuthUrlParams) =
            apply {
                body = socialAccountCreateAuthUrlParams.body.toBuilder()
                additionalHeaders = socialAccountCreateAuthUrlParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    socialAccountCreateAuthUrlParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [platform]
         * - [externalId]
         * - [permissions]
         * - [platformData]
         * - [redirectUrlOverride]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The social account provider */
        fun platform(platform: String) = apply { body.platform(platform) }

        /**
         * Sets [Builder.platform] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platform] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun platform(platform: JsonField<String>) = apply { body.platform(platform) }

        /** Your unique identifier for the social account */
        fun externalId(externalId: String) = apply { body.externalId(externalId) }

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { body.externalId(externalId) }

        /**
         * List of permissions you want to allow. Will default to only post permissions. You must
         * include the "feeds" permission to request an account feed and metrics
         */
        fun permissions(permissions: List<Permission>) = apply { body.permissions(permissions) }

        /**
         * Sets [Builder.permissions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.permissions] with a well-typed `List<Permission>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun permissions(permissions: JsonField<List<Permission>>) = apply {
            body.permissions(permissions)
        }

        /**
         * Adds a single [Permission] to [permissions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPermission(permission: Permission) = apply { body.addPermission(permission) }

        /** Additional data needed for the provider */
        fun platformData(platformData: PlatformData) = apply { body.platformData(platformData) }

        /**
         * Sets [Builder.platformData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformData] with a well-typed [PlatformData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun platformData(platformData: JsonField<PlatformData>) = apply {
            body.platformData(platformData)
        }

        /**
         * Override the default redirect URL for the OAuth flow. If provided, this URL will be used
         * instead of our redirect URL. Make sure this URL is included in your app's authorized
         * redirect urls. This override will not work when using our system credientals.
         */
        fun redirectUrlOverride(redirectUrlOverride: String) = apply {
            body.redirectUrlOverride(redirectUrlOverride)
        }

        /**
         * Sets [Builder.redirectUrlOverride] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redirectUrlOverride] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun redirectUrlOverride(redirectUrlOverride: JsonField<String>) = apply {
            body.redirectUrlOverride(redirectUrlOverride)
        }

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
         * Returns an immutable instance of [SocialAccountCreateAuthUrlParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .platform()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SocialAccountCreateAuthUrlParams =
            SocialAccountCreateAuthUrlParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val platform: JsonField<String>,
        private val externalId: JsonField<String>,
        private val permissions: JsonField<List<Permission>>,
        private val platformData: JsonField<PlatformData>,
        private val redirectUrlOverride: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("platform")
            @ExcludeMissing
            platform: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_id")
            @ExcludeMissing
            externalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("permissions")
            @ExcludeMissing
            permissions: JsonField<List<Permission>> = JsonMissing.of(),
            @JsonProperty("platform_data")
            @ExcludeMissing
            platformData: JsonField<PlatformData> = JsonMissing.of(),
            @JsonProperty("redirect_url_override")
            @ExcludeMissing
            redirectUrlOverride: JsonField<String> = JsonMissing.of(),
        ) : this(
            platform,
            externalId,
            permissions,
            platformData,
            redirectUrlOverride,
            mutableMapOf(),
        )

        /**
         * The social account provider
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun platform(): String = platform.getRequired("platform")

        /**
         * Your unique identifier for the social account
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun externalId(): String? = externalId.getNullable("external_id")

        /**
         * List of permissions you want to allow. Will default to only post permissions. You must
         * include the "feeds" permission to request an account feed and metrics
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun permissions(): List<Permission>? = permissions.getNullable("permissions")

        /**
         * Additional data needed for the provider
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun platformData(): PlatformData? = platformData.getNullable("platform_data")

        /**
         * Override the default redirect URL for the OAuth flow. If provided, this URL will be used
         * instead of our redirect URL. Make sure this URL is included in your app's authorized
         * redirect urls. This override will not work when using our system credientals.
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun redirectUrlOverride(): String? =
            redirectUrlOverride.getNullable("redirect_url_override")

        /**
         * Returns the raw JSON value of [platform].
         *
         * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<String> = platform

        /**
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * Returns the raw JSON value of [permissions].
         *
         * Unlike [permissions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("permissions")
        @ExcludeMissing
        fun _permissions(): JsonField<List<Permission>> = permissions

        /**
         * Returns the raw JSON value of [platformData].
         *
         * Unlike [platformData], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("platform_data")
        @ExcludeMissing
        fun _platformData(): JsonField<PlatformData> = platformData

        /**
         * Returns the raw JSON value of [redirectUrlOverride].
         *
         * Unlike [redirectUrlOverride], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("redirect_url_override")
        @ExcludeMissing
        fun _redirectUrlOverride(): JsonField<String> = redirectUrlOverride

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
             * .platform()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var platform: JsonField<String>? = null
            private var externalId: JsonField<String> = JsonMissing.of()
            private var permissions: JsonField<MutableList<Permission>>? = null
            private var platformData: JsonField<PlatformData> = JsonMissing.of()
            private var redirectUrlOverride: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                platform = body.platform
                externalId = body.externalId
                permissions = body.permissions.map { it.toMutableList() }
                platformData = body.platformData
                redirectUrlOverride = body.redirectUrlOverride
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The social account provider */
            fun platform(platform: String) = platform(JsonField.of(platform))

            /**
             * Sets [Builder.platform] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platform] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platform(platform: JsonField<String>) = apply { this.platform = platform }

            /** Your unique identifier for the social account */
            fun externalId(externalId: String) = externalId(JsonField.of(externalId))

            /**
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            /**
             * List of permissions you want to allow. Will default to only post permissions. You
             * must include the "feeds" permission to request an account feed and metrics
             */
            fun permissions(permissions: List<Permission>) = permissions(JsonField.of(permissions))

            /**
             * Sets [Builder.permissions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.permissions] with a well-typed `List<Permission>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun permissions(permissions: JsonField<List<Permission>>) = apply {
                this.permissions = permissions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Permission] to [permissions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPermission(permission: Permission) = apply {
                permissions =
                    (permissions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("permissions", it).add(permission)
                    }
            }

            /** Additional data needed for the provider */
            fun platformData(platformData: PlatformData) = platformData(JsonField.of(platformData))

            /**
             * Sets [Builder.platformData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platformData] with a well-typed [PlatformData] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platformData(platformData: JsonField<PlatformData>) = apply {
                this.platformData = platformData
            }

            /**
             * Override the default redirect URL for the OAuth flow. If provided, this URL will be
             * used instead of our redirect URL. Make sure this URL is included in your app's
             * authorized redirect urls. This override will not work when using our system
             * credientals.
             */
            fun redirectUrlOverride(redirectUrlOverride: String) =
                redirectUrlOverride(JsonField.of(redirectUrlOverride))

            /**
             * Sets [Builder.redirectUrlOverride] to an arbitrary JSON value.
             *
             * You should usually call [Builder.redirectUrlOverride] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun redirectUrlOverride(redirectUrlOverride: JsonField<String>) = apply {
                this.redirectUrlOverride = redirectUrlOverride
            }

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
             * .platform()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("platform", platform),
                    externalId,
                    (permissions ?: JsonMissing.of()).map { it.toImmutable() },
                    platformData,
                    redirectUrlOverride,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            platform()
            externalId()
            permissions()?.forEach { it.validate() }
            platformData()?.validate()
            redirectUrlOverride()
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
            (if (platform.asKnown() == null) 0 else 1) +
                (if (externalId.asKnown() == null) 0 else 1) +
                (permissions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (platformData.asKnown()?.validity() ?: 0) +
                (if (redirectUrlOverride.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                platform == other.platform &&
                externalId == other.externalId &&
                permissions == other.permissions &&
                platformData == other.platformData &&
                redirectUrlOverride == other.redirectUrlOverride &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                platform,
                externalId,
                permissions,
                platformData,
                redirectUrlOverride,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{platform=$platform, externalId=$externalId, permissions=$permissions, platformData=$platformData, redirectUrlOverride=$redirectUrlOverride, additionalProperties=$additionalProperties}"
    }

    class Permission @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val POSTS = of("posts")

            val FEEDS = of("feeds")

            fun of(value: String) = Permission(JsonField.of(value))
        }

        /** An enum containing [Permission]'s known values. */
        enum class Known {
            POSTS,
            FEEDS,
        }

        /**
         * An enum containing [Permission]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Permission] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            POSTS,
            FEEDS,
            /**
             * An enum member indicating that [Permission] was instantiated with an unknown value.
             */
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
                POSTS -> Value.POSTS
                FEEDS -> Value.FEEDS
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
                POSTS -> Known.POSTS
                FEEDS -> Known.FEEDS
                else -> throw PostForMeInvalidDataException("Unknown Permission: $value")
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

        fun validate(): Permission = apply {
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

            return other is Permission && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Additional data needed for the provider */
    class PlatformData
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bluesky: JsonField<Bluesky>,
        private val facebook: JsonField<Facebook>,
        private val instagram: JsonField<Instagram>,
        private val linkedin: JsonField<Linkedin>,
        private val pinterest: JsonField<Pinterest>,
        private val threads: JsonField<Threads>,
        private val tiktok: JsonField<Tiktok>,
        private val tiktokBusiness: JsonField<TiktokBusiness>,
        private val youtube: JsonField<Youtube>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bluesky") @ExcludeMissing bluesky: JsonField<Bluesky> = JsonMissing.of(),
            @JsonProperty("facebook")
            @ExcludeMissing
            facebook: JsonField<Facebook> = JsonMissing.of(),
            @JsonProperty("instagram")
            @ExcludeMissing
            instagram: JsonField<Instagram> = JsonMissing.of(),
            @JsonProperty("linkedin")
            @ExcludeMissing
            linkedin: JsonField<Linkedin> = JsonMissing.of(),
            @JsonProperty("pinterest")
            @ExcludeMissing
            pinterest: JsonField<Pinterest> = JsonMissing.of(),
            @JsonProperty("threads") @ExcludeMissing threads: JsonField<Threads> = JsonMissing.of(),
            @JsonProperty("tiktok") @ExcludeMissing tiktok: JsonField<Tiktok> = JsonMissing.of(),
            @JsonProperty("tiktok_business")
            @ExcludeMissing
            tiktokBusiness: JsonField<TiktokBusiness> = JsonMissing.of(),
            @JsonProperty("youtube") @ExcludeMissing youtube: JsonField<Youtube> = JsonMissing.of(),
        ) : this(
            bluesky,
            facebook,
            instagram,
            linkedin,
            pinterest,
            threads,
            tiktok,
            tiktokBusiness,
            youtube,
            mutableMapOf(),
        )

        /**
         * Additional data needed for connecting bluesky accounts
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun bluesky(): Bluesky? = bluesky.getNullable("bluesky")

        /**
         * Additional data for connecting facebook accounts
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun facebook(): Facebook? = facebook.getNullable("facebook")

        /**
         * Additional data for connecting instagram accounts
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun instagram(): Instagram? = instagram.getNullable("instagram")

        /**
         * Additional data for connecting linkedin accounts
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun linkedin(): Linkedin? = linkedin.getNullable("linkedin")

        /**
         * Additional data for connecting Pinterest accounts
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pinterest(): Pinterest? = pinterest.getNullable("pinterest")

        /**
         * Additional data for connecting Threads accounts
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun threads(): Threads? = threads.getNullable("threads")

        /**
         * Additional data for connecting TikTok accounts
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tiktok(): Tiktok? = tiktok.getNullable("tiktok")

        /**
         * Additional data for connecting TikTok Business accounts
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tiktokBusiness(): TiktokBusiness? = tiktokBusiness.getNullable("tiktok_business")

        /**
         * Additional data for connecting YouTube accounts
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun youtube(): Youtube? = youtube.getNullable("youtube")

        /**
         * Returns the raw JSON value of [bluesky].
         *
         * Unlike [bluesky], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bluesky") @ExcludeMissing fun _bluesky(): JsonField<Bluesky> = bluesky

        /**
         * Returns the raw JSON value of [facebook].
         *
         * Unlike [facebook], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("facebook") @ExcludeMissing fun _facebook(): JsonField<Facebook> = facebook

        /**
         * Returns the raw JSON value of [instagram].
         *
         * Unlike [instagram], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("instagram")
        @ExcludeMissing
        fun _instagram(): JsonField<Instagram> = instagram

        /**
         * Returns the raw JSON value of [linkedin].
         *
         * Unlike [linkedin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("linkedin") @ExcludeMissing fun _linkedin(): JsonField<Linkedin> = linkedin

        /**
         * Returns the raw JSON value of [pinterest].
         *
         * Unlike [pinterest], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pinterest")
        @ExcludeMissing
        fun _pinterest(): JsonField<Pinterest> = pinterest

        /**
         * Returns the raw JSON value of [threads].
         *
         * Unlike [threads], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("threads") @ExcludeMissing fun _threads(): JsonField<Threads> = threads

        /**
         * Returns the raw JSON value of [tiktok].
         *
         * Unlike [tiktok], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tiktok") @ExcludeMissing fun _tiktok(): JsonField<Tiktok> = tiktok

        /**
         * Returns the raw JSON value of [tiktokBusiness].
         *
         * Unlike [tiktokBusiness], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tiktok_business")
        @ExcludeMissing
        fun _tiktokBusiness(): JsonField<TiktokBusiness> = tiktokBusiness

        /**
         * Returns the raw JSON value of [youtube].
         *
         * Unlike [youtube], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("youtube") @ExcludeMissing fun _youtube(): JsonField<Youtube> = youtube

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

            /** Returns a mutable builder for constructing an instance of [PlatformData]. */
            fun builder() = Builder()
        }

        /** A builder for [PlatformData]. */
        class Builder internal constructor() {

            private var bluesky: JsonField<Bluesky> = JsonMissing.of()
            private var facebook: JsonField<Facebook> = JsonMissing.of()
            private var instagram: JsonField<Instagram> = JsonMissing.of()
            private var linkedin: JsonField<Linkedin> = JsonMissing.of()
            private var pinterest: JsonField<Pinterest> = JsonMissing.of()
            private var threads: JsonField<Threads> = JsonMissing.of()
            private var tiktok: JsonField<Tiktok> = JsonMissing.of()
            private var tiktokBusiness: JsonField<TiktokBusiness> = JsonMissing.of()
            private var youtube: JsonField<Youtube> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(platformData: PlatformData) = apply {
                bluesky = platformData.bluesky
                facebook = platformData.facebook
                instagram = platformData.instagram
                linkedin = platformData.linkedin
                pinterest = platformData.pinterest
                threads = platformData.threads
                tiktok = platformData.tiktok
                tiktokBusiness = platformData.tiktokBusiness
                youtube = platformData.youtube
                additionalProperties = platformData.additionalProperties.toMutableMap()
            }

            /** Additional data needed for connecting bluesky accounts */
            fun bluesky(bluesky: Bluesky) = bluesky(JsonField.of(bluesky))

            /**
             * Sets [Builder.bluesky] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bluesky] with a well-typed [Bluesky] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bluesky(bluesky: JsonField<Bluesky>) = apply { this.bluesky = bluesky }

            /** Additional data for connecting facebook accounts */
            fun facebook(facebook: Facebook) = facebook(JsonField.of(facebook))

            /**
             * Sets [Builder.facebook] to an arbitrary JSON value.
             *
             * You should usually call [Builder.facebook] with a well-typed [Facebook] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun facebook(facebook: JsonField<Facebook>) = apply { this.facebook = facebook }

            /** Additional data for connecting instagram accounts */
            fun instagram(instagram: Instagram) = instagram(JsonField.of(instagram))

            /**
             * Sets [Builder.instagram] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instagram] with a well-typed [Instagram] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instagram(instagram: JsonField<Instagram>) = apply { this.instagram = instagram }

            /** Additional data for connecting linkedin accounts */
            fun linkedin(linkedin: Linkedin) = linkedin(JsonField.of(linkedin))

            /**
             * Sets [Builder.linkedin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linkedin] with a well-typed [Linkedin] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun linkedin(linkedin: JsonField<Linkedin>) = apply { this.linkedin = linkedin }

            /** Additional data for connecting Pinterest accounts */
            fun pinterest(pinterest: Pinterest) = pinterest(JsonField.of(pinterest))

            /**
             * Sets [Builder.pinterest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pinterest] with a well-typed [Pinterest] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pinterest(pinterest: JsonField<Pinterest>) = apply { this.pinterest = pinterest }

            /** Additional data for connecting Threads accounts */
            fun threads(threads: Threads) = threads(JsonField.of(threads))

            /**
             * Sets [Builder.threads] to an arbitrary JSON value.
             *
             * You should usually call [Builder.threads] with a well-typed [Threads] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun threads(threads: JsonField<Threads>) = apply { this.threads = threads }

            /** Additional data for connecting TikTok accounts */
            fun tiktok(tiktok: Tiktok) = tiktok(JsonField.of(tiktok))

            /**
             * Sets [Builder.tiktok] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tiktok] with a well-typed [Tiktok] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tiktok(tiktok: JsonField<Tiktok>) = apply { this.tiktok = tiktok }

            /** Additional data for connecting TikTok Business accounts */
            fun tiktokBusiness(tiktokBusiness: TiktokBusiness) =
                tiktokBusiness(JsonField.of(tiktokBusiness))

            /**
             * Sets [Builder.tiktokBusiness] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tiktokBusiness] with a well-typed [TiktokBusiness]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun tiktokBusiness(tiktokBusiness: JsonField<TiktokBusiness>) = apply {
                this.tiktokBusiness = tiktokBusiness
            }

            /** Additional data for connecting YouTube accounts */
            fun youtube(youtube: Youtube) = youtube(JsonField.of(youtube))

            /**
             * Sets [Builder.youtube] to an arbitrary JSON value.
             *
             * You should usually call [Builder.youtube] with a well-typed [Youtube] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun youtube(youtube: JsonField<Youtube>) = apply { this.youtube = youtube }

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
             * Returns an immutable instance of [PlatformData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PlatformData =
                PlatformData(
                    bluesky,
                    facebook,
                    instagram,
                    linkedin,
                    pinterest,
                    threads,
                    tiktok,
                    tiktokBusiness,
                    youtube,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PlatformData = apply {
            if (validated) {
                return@apply
            }

            bluesky()?.validate()
            facebook()?.validate()
            instagram()?.validate()
            linkedin()?.validate()
            pinterest()?.validate()
            threads()?.validate()
            tiktok()?.validate()
            tiktokBusiness()?.validate()
            youtube()?.validate()
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
            (bluesky.asKnown()?.validity() ?: 0) +
                (facebook.asKnown()?.validity() ?: 0) +
                (instagram.asKnown()?.validity() ?: 0) +
                (linkedin.asKnown()?.validity() ?: 0) +
                (pinterest.asKnown()?.validity() ?: 0) +
                (threads.asKnown()?.validity() ?: 0) +
                (tiktok.asKnown()?.validity() ?: 0) +
                (tiktokBusiness.asKnown()?.validity() ?: 0) +
                (youtube.asKnown()?.validity() ?: 0)

        /** Additional data needed for connecting bluesky accounts */
        class Bluesky
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val appPassword: JsonField<String>,
            private val handle: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("app_password")
                @ExcludeMissing
                appPassword: JsonField<String> = JsonMissing.of(),
                @JsonProperty("handle") @ExcludeMissing handle: JsonField<String> = JsonMissing.of(),
            ) : this(appPassword, handle, mutableMapOf())

            /**
             * The app password of the account
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun appPassword(): String = appPassword.getRequired("app_password")

            /**
             * The handle of the account
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun handle(): String = handle.getRequired("handle")

            /**
             * Returns the raw JSON value of [appPassword].
             *
             * Unlike [appPassword], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("app_password")
            @ExcludeMissing
            fun _appPassword(): JsonField<String> = appPassword

            /**
             * Returns the raw JSON value of [handle].
             *
             * Unlike [handle], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("handle") @ExcludeMissing fun _handle(): JsonField<String> = handle

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
                 * Returns a mutable builder for constructing an instance of [Bluesky].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .appPassword()
                 * .handle()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Bluesky]. */
            class Builder internal constructor() {

                private var appPassword: JsonField<String>? = null
                private var handle: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(bluesky: Bluesky) = apply {
                    appPassword = bluesky.appPassword
                    handle = bluesky.handle
                    additionalProperties = bluesky.additionalProperties.toMutableMap()
                }

                /** The app password of the account */
                fun appPassword(appPassword: String) = appPassword(JsonField.of(appPassword))

                /**
                 * Sets [Builder.appPassword] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appPassword] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun appPassword(appPassword: JsonField<String>) = apply {
                    this.appPassword = appPassword
                }

                /** The handle of the account */
                fun handle(handle: String) = handle(JsonField.of(handle))

                /**
                 * Sets [Builder.handle] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.handle] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun handle(handle: JsonField<String>) = apply { this.handle = handle }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Bluesky].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .appPassword()
                 * .handle()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Bluesky =
                    Bluesky(
                        checkRequired("appPassword", appPassword),
                        checkRequired("handle", handle),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Bluesky = apply {
                if (validated) {
                    return@apply
                }

                appPassword()
                handle()
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
                (if (appPassword.asKnown() == null) 0 else 1) +
                    (if (handle.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Bluesky &&
                    appPassword == other.appPassword &&
                    handle == other.handle &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(appPassword, handle, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Bluesky{appPassword=$appPassword, handle=$handle, additionalProperties=$additionalProperties}"
        }

        /** Additional data for connecting facebook accounts */
        class Facebook
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val permissionOverrides: JsonField<List<List<JsonValue>>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("permission_overrides")
                @ExcludeMissing
                permissionOverrides: JsonField<List<List<JsonValue>>> = JsonMissing.of()
            ) : this(permissionOverrides, mutableMapOf())

            /**
             * Override the default permissions/scopes requested during OAuth. Default scopes:
             * public_profile, pages_show_list, pages_read_engagement, pages_manage_posts,
             * business_management
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun permissionOverrides(): List<List<JsonValue>>? =
                permissionOverrides.getNullable("permission_overrides")

            /**
             * Returns the raw JSON value of [permissionOverrides].
             *
             * Unlike [permissionOverrides], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("permission_overrides")
            @ExcludeMissing
            fun _permissionOverrides(): JsonField<List<List<JsonValue>>> = permissionOverrides

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

                /** Returns a mutable builder for constructing an instance of [Facebook]. */
                fun builder() = Builder()
            }

            /** A builder for [Facebook]. */
            class Builder internal constructor() {

                private var permissionOverrides: JsonField<MutableList<List<JsonValue>>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(facebook: Facebook) = apply {
                    permissionOverrides = facebook.permissionOverrides.map { it.toMutableList() }
                    additionalProperties = facebook.additionalProperties.toMutableMap()
                }

                /**
                 * Override the default permissions/scopes requested during OAuth. Default scopes:
                 * public_profile, pages_show_list, pages_read_engagement, pages_manage_posts,
                 * business_management
                 */
                fun permissionOverrides(permissionOverrides: List<List<JsonValue>>) =
                    permissionOverrides(JsonField.of(permissionOverrides))

                /**
                 * Sets [Builder.permissionOverrides] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.permissionOverrides] with a well-typed
                 * `List<List<JsonValue>>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun permissionOverrides(permissionOverrides: JsonField<List<List<JsonValue>>>) =
                    apply {
                        this.permissionOverrides = permissionOverrides.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [List<JsonValue>] to [permissionOverrides].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPermissionOverride(permissionOverride: List<JsonValue>) = apply {
                    permissionOverrides =
                        (permissionOverrides ?: JsonField.of(mutableListOf())).also {
                            checkKnown("permissionOverrides", it).add(permissionOverride)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Facebook].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Facebook =
                    Facebook(
                        (permissionOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Facebook = apply {
                if (validated) {
                    return@apply
                }

                permissionOverrides()
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
                (permissionOverrides.asKnown()?.sumOf { it.size.toInt() } ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Facebook &&
                    permissionOverrides == other.permissionOverrides &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(permissionOverrides, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Facebook{permissionOverrides=$permissionOverrides, additionalProperties=$additionalProperties}"
        }

        /** Additional data for connecting instagram accounts */
        class Instagram
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val connectionType: JsonField<ConnectionType>,
            private val permissionOverrides: JsonField<List<List<JsonValue>>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("connection_type")
                @ExcludeMissing
                connectionType: JsonField<ConnectionType> = JsonMissing.of(),
                @JsonProperty("permission_overrides")
                @ExcludeMissing
                permissionOverrides: JsonField<List<List<JsonValue>>> = JsonMissing.of(),
            ) : this(connectionType, permissionOverrides, mutableMapOf())

            /**
             * The type of connection; instagram for using login with instagram, facebook for using
             * login with facebook.
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun connectionType(): ConnectionType = connectionType.getRequired("connection_type")

            /**
             * Override the default permissions/scopes requested during OAuth. Default instagram
             * scopes: instagram_business_basic, instagram_business_content_publish. Default
             * facebook scopes: instagram_basic, instagram_content_publish, pages_show_list,
             * public_profile, business_management
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun permissionOverrides(): List<List<JsonValue>>? =
                permissionOverrides.getNullable("permission_overrides")

            /**
             * Returns the raw JSON value of [connectionType].
             *
             * Unlike [connectionType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("connection_type")
            @ExcludeMissing
            fun _connectionType(): JsonField<ConnectionType> = connectionType

            /**
             * Returns the raw JSON value of [permissionOverrides].
             *
             * Unlike [permissionOverrides], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("permission_overrides")
            @ExcludeMissing
            fun _permissionOverrides(): JsonField<List<List<JsonValue>>> = permissionOverrides

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
                 * Returns a mutable builder for constructing an instance of [Instagram].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .connectionType()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Instagram]. */
            class Builder internal constructor() {

                private var connectionType: JsonField<ConnectionType>? = null
                private var permissionOverrides: JsonField<MutableList<List<JsonValue>>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(instagram: Instagram) = apply {
                    connectionType = instagram.connectionType
                    permissionOverrides = instagram.permissionOverrides.map { it.toMutableList() }
                    additionalProperties = instagram.additionalProperties.toMutableMap()
                }

                /**
                 * The type of connection; instagram for using login with instagram, facebook for
                 * using login with facebook.
                 */
                fun connectionType(connectionType: ConnectionType) =
                    connectionType(JsonField.of(connectionType))

                /**
                 * Sets [Builder.connectionType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.connectionType] with a well-typed
                 * [ConnectionType] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun connectionType(connectionType: JsonField<ConnectionType>) = apply {
                    this.connectionType = connectionType
                }

                /**
                 * Override the default permissions/scopes requested during OAuth. Default instagram
                 * scopes: instagram_business_basic, instagram_business_content_publish. Default
                 * facebook scopes: instagram_basic, instagram_content_publish, pages_show_list,
                 * public_profile, business_management
                 */
                fun permissionOverrides(permissionOverrides: List<List<JsonValue>>) =
                    permissionOverrides(JsonField.of(permissionOverrides))

                /**
                 * Sets [Builder.permissionOverrides] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.permissionOverrides] with a well-typed
                 * `List<List<JsonValue>>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun permissionOverrides(permissionOverrides: JsonField<List<List<JsonValue>>>) =
                    apply {
                        this.permissionOverrides = permissionOverrides.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [List<JsonValue>] to [permissionOverrides].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPermissionOverride(permissionOverride: List<JsonValue>) = apply {
                    permissionOverrides =
                        (permissionOverrides ?: JsonField.of(mutableListOf())).also {
                            checkKnown("permissionOverrides", it).add(permissionOverride)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Instagram].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .connectionType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Instagram =
                    Instagram(
                        checkRequired("connectionType", connectionType),
                        (permissionOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Instagram = apply {
                if (validated) {
                    return@apply
                }

                connectionType().validate()
                permissionOverrides()
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
                (connectionType.asKnown()?.validity() ?: 0) +
                    (permissionOverrides.asKnown()?.sumOf { it.size.toInt() } ?: 0)

            /**
             * The type of connection; instagram for using login with instagram, facebook for using
             * login with facebook.
             */
            class ConnectionType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val INSTAGRAM = of("instagram")

                    val FACEBOOK = of("facebook")

                    fun of(value: String) = ConnectionType(JsonField.of(value))
                }

                /** An enum containing [ConnectionType]'s known values. */
                enum class Known {
                    INSTAGRAM,
                    FACEBOOK,
                }

                /**
                 * An enum containing [ConnectionType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ConnectionType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INSTAGRAM,
                    FACEBOOK,
                    /**
                     * An enum member indicating that [ConnectionType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        INSTAGRAM -> Value.INSTAGRAM
                        FACEBOOK -> Value.FACEBOOK
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws PostForMeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        INSTAGRAM -> Known.INSTAGRAM
                        FACEBOOK -> Known.FACEBOOK
                        else ->
                            throw PostForMeInvalidDataException("Unknown ConnectionType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws PostForMeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw PostForMeInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): ConnectionType = apply {
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

                    return other is ConnectionType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Instagram &&
                    connectionType == other.connectionType &&
                    permissionOverrides == other.permissionOverrides &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(connectionType, permissionOverrides, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Instagram{connectionType=$connectionType, permissionOverrides=$permissionOverrides, additionalProperties=$additionalProperties}"
        }

        /** Additional data for connecting linkedin accounts */
        class Linkedin
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val connectionType: JsonField<ConnectionType>,
            private val permissionOverrides: JsonField<List<List<JsonValue>>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("connection_type")
                @ExcludeMissing
                connectionType: JsonField<ConnectionType> = JsonMissing.of(),
                @JsonProperty("permission_overrides")
                @ExcludeMissing
                permissionOverrides: JsonField<List<List<JsonValue>>> = JsonMissing.of(),
            ) : this(connectionType, permissionOverrides, mutableMapOf())

            /**
             * The type of connection; If using our provided credentials always use "organization".
             * If using your own crednetials then only use "organization" if you are using the
             * Community API
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun connectionType(): ConnectionType = connectionType.getRequired("connection_type")

            /**
             * Override the default permissions/scopes requested during OAuth. Default personal
             * scopes: openid, w_member_social, profile, email. Default organization scopes:
             * r_basicprofile, w_member_social, r_organization_social, w_organization_social,
             * rw_organization_admin
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun permissionOverrides(): List<List<JsonValue>>? =
                permissionOverrides.getNullable("permission_overrides")

            /**
             * Returns the raw JSON value of [connectionType].
             *
             * Unlike [connectionType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("connection_type")
            @ExcludeMissing
            fun _connectionType(): JsonField<ConnectionType> = connectionType

            /**
             * Returns the raw JSON value of [permissionOverrides].
             *
             * Unlike [permissionOverrides], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("permission_overrides")
            @ExcludeMissing
            fun _permissionOverrides(): JsonField<List<List<JsonValue>>> = permissionOverrides

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
                 * Returns a mutable builder for constructing an instance of [Linkedin].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .connectionType()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Linkedin]. */
            class Builder internal constructor() {

                private var connectionType: JsonField<ConnectionType>? = null
                private var permissionOverrides: JsonField<MutableList<List<JsonValue>>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(linkedin: Linkedin) = apply {
                    connectionType = linkedin.connectionType
                    permissionOverrides = linkedin.permissionOverrides.map { it.toMutableList() }
                    additionalProperties = linkedin.additionalProperties.toMutableMap()
                }

                /**
                 * The type of connection; If using our provided credentials always use
                 * "organization". If using your own crednetials then only use "organization" if you
                 * are using the Community API
                 */
                fun connectionType(connectionType: ConnectionType) =
                    connectionType(JsonField.of(connectionType))

                /**
                 * Sets [Builder.connectionType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.connectionType] with a well-typed
                 * [ConnectionType] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun connectionType(connectionType: JsonField<ConnectionType>) = apply {
                    this.connectionType = connectionType
                }

                /**
                 * Override the default permissions/scopes requested during OAuth. Default personal
                 * scopes: openid, w_member_social, profile, email. Default organization scopes:
                 * r_basicprofile, w_member_social, r_organization_social, w_organization_social,
                 * rw_organization_admin
                 */
                fun permissionOverrides(permissionOverrides: List<List<JsonValue>>) =
                    permissionOverrides(JsonField.of(permissionOverrides))

                /**
                 * Sets [Builder.permissionOverrides] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.permissionOverrides] with a well-typed
                 * `List<List<JsonValue>>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun permissionOverrides(permissionOverrides: JsonField<List<List<JsonValue>>>) =
                    apply {
                        this.permissionOverrides = permissionOverrides.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [List<JsonValue>] to [permissionOverrides].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPermissionOverride(permissionOverride: List<JsonValue>) = apply {
                    permissionOverrides =
                        (permissionOverrides ?: JsonField.of(mutableListOf())).also {
                            checkKnown("permissionOverrides", it).add(permissionOverride)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Linkedin].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .connectionType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Linkedin =
                    Linkedin(
                        checkRequired("connectionType", connectionType),
                        (permissionOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Linkedin = apply {
                if (validated) {
                    return@apply
                }

                connectionType().validate()
                permissionOverrides()
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
                (connectionType.asKnown()?.validity() ?: 0) +
                    (permissionOverrides.asKnown()?.sumOf { it.size.toInt() } ?: 0)

            /**
             * The type of connection; If using our provided credentials always use "organization".
             * If using your own crednetials then only use "organization" if you are using the
             * Community API
             */
            class ConnectionType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val PERSONAL = of("personal")

                    val ORGANIZATION = of("organization")

                    fun of(value: String) = ConnectionType(JsonField.of(value))
                }

                /** An enum containing [ConnectionType]'s known values. */
                enum class Known {
                    PERSONAL,
                    ORGANIZATION,
                }

                /**
                 * An enum containing [ConnectionType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ConnectionType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PERSONAL,
                    ORGANIZATION,
                    /**
                     * An enum member indicating that [ConnectionType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PERSONAL -> Value.PERSONAL
                        ORGANIZATION -> Value.ORGANIZATION
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws PostForMeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PERSONAL -> Known.PERSONAL
                        ORGANIZATION -> Known.ORGANIZATION
                        else ->
                            throw PostForMeInvalidDataException("Unknown ConnectionType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws PostForMeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw PostForMeInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): ConnectionType = apply {
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

                    return other is ConnectionType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Linkedin &&
                    connectionType == other.connectionType &&
                    permissionOverrides == other.permissionOverrides &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(connectionType, permissionOverrides, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Linkedin{connectionType=$connectionType, permissionOverrides=$permissionOverrides, additionalProperties=$additionalProperties}"
        }

        /** Additional data for connecting Pinterest accounts */
        class Pinterest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val permissionOverrides: JsonField<List<List<JsonValue>>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("permission_overrides")
                @ExcludeMissing
                permissionOverrides: JsonField<List<List<JsonValue>>> = JsonMissing.of()
            ) : this(permissionOverrides, mutableMapOf())

            /**
             * Override the default permissions/scopes requested during OAuth. Default scopes:
             * boards:read, boards:write, pins:read, pins:write, user_accounts:read
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun permissionOverrides(): List<List<JsonValue>>? =
                permissionOverrides.getNullable("permission_overrides")

            /**
             * Returns the raw JSON value of [permissionOverrides].
             *
             * Unlike [permissionOverrides], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("permission_overrides")
            @ExcludeMissing
            fun _permissionOverrides(): JsonField<List<List<JsonValue>>> = permissionOverrides

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

                /** Returns a mutable builder for constructing an instance of [Pinterest]. */
                fun builder() = Builder()
            }

            /** A builder for [Pinterest]. */
            class Builder internal constructor() {

                private var permissionOverrides: JsonField<MutableList<List<JsonValue>>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(pinterest: Pinterest) = apply {
                    permissionOverrides = pinterest.permissionOverrides.map { it.toMutableList() }
                    additionalProperties = pinterest.additionalProperties.toMutableMap()
                }

                /**
                 * Override the default permissions/scopes requested during OAuth. Default scopes:
                 * boards:read, boards:write, pins:read, pins:write, user_accounts:read
                 */
                fun permissionOverrides(permissionOverrides: List<List<JsonValue>>) =
                    permissionOverrides(JsonField.of(permissionOverrides))

                /**
                 * Sets [Builder.permissionOverrides] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.permissionOverrides] with a well-typed
                 * `List<List<JsonValue>>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun permissionOverrides(permissionOverrides: JsonField<List<List<JsonValue>>>) =
                    apply {
                        this.permissionOverrides = permissionOverrides.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [List<JsonValue>] to [permissionOverrides].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPermissionOverride(permissionOverride: List<JsonValue>) = apply {
                    permissionOverrides =
                        (permissionOverrides ?: JsonField.of(mutableListOf())).also {
                            checkKnown("permissionOverrides", it).add(permissionOverride)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Pinterest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Pinterest =
                    Pinterest(
                        (permissionOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Pinterest = apply {
                if (validated) {
                    return@apply
                }

                permissionOverrides()
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
                (permissionOverrides.asKnown()?.sumOf { it.size.toInt() } ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Pinterest &&
                    permissionOverrides == other.permissionOverrides &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(permissionOverrides, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Pinterest{permissionOverrides=$permissionOverrides, additionalProperties=$additionalProperties}"
        }

        /** Additional data for connecting Threads accounts */
        class Threads
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val permissionOverrides: JsonField<List<List<JsonValue>>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("permission_overrides")
                @ExcludeMissing
                permissionOverrides: JsonField<List<List<JsonValue>>> = JsonMissing.of()
            ) : this(permissionOverrides, mutableMapOf())

            /**
             * Override the default permissions/scopes requested during OAuth. Default scopes:
             * threads_basic, threads_content_publish
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun permissionOverrides(): List<List<JsonValue>>? =
                permissionOverrides.getNullable("permission_overrides")

            /**
             * Returns the raw JSON value of [permissionOverrides].
             *
             * Unlike [permissionOverrides], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("permission_overrides")
            @ExcludeMissing
            fun _permissionOverrides(): JsonField<List<List<JsonValue>>> = permissionOverrides

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

                /** Returns a mutable builder for constructing an instance of [Threads]. */
                fun builder() = Builder()
            }

            /** A builder for [Threads]. */
            class Builder internal constructor() {

                private var permissionOverrides: JsonField<MutableList<List<JsonValue>>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(threads: Threads) = apply {
                    permissionOverrides = threads.permissionOverrides.map { it.toMutableList() }
                    additionalProperties = threads.additionalProperties.toMutableMap()
                }

                /**
                 * Override the default permissions/scopes requested during OAuth. Default scopes:
                 * threads_basic, threads_content_publish
                 */
                fun permissionOverrides(permissionOverrides: List<List<JsonValue>>) =
                    permissionOverrides(JsonField.of(permissionOverrides))

                /**
                 * Sets [Builder.permissionOverrides] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.permissionOverrides] with a well-typed
                 * `List<List<JsonValue>>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun permissionOverrides(permissionOverrides: JsonField<List<List<JsonValue>>>) =
                    apply {
                        this.permissionOverrides = permissionOverrides.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [List<JsonValue>] to [permissionOverrides].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPermissionOverride(permissionOverride: List<JsonValue>) = apply {
                    permissionOverrides =
                        (permissionOverrides ?: JsonField.of(mutableListOf())).also {
                            checkKnown("permissionOverrides", it).add(permissionOverride)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Threads].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Threads =
                    Threads(
                        (permissionOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Threads = apply {
                if (validated) {
                    return@apply
                }

                permissionOverrides()
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
                (permissionOverrides.asKnown()?.sumOf { it.size.toInt() } ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Threads &&
                    permissionOverrides == other.permissionOverrides &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(permissionOverrides, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Threads{permissionOverrides=$permissionOverrides, additionalProperties=$additionalProperties}"
        }

        /** Additional data for connecting TikTok accounts */
        class Tiktok
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val permissionOverrides: JsonField<List<List<JsonValue>>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("permission_overrides")
                @ExcludeMissing
                permissionOverrides: JsonField<List<List<JsonValue>>> = JsonMissing.of()
            ) : this(permissionOverrides, mutableMapOf())

            /**
             * Override the default permissions/scopes requested during OAuth. Default scopes:
             * user.info.basic, video.list, video.upload, video.publish
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun permissionOverrides(): List<List<JsonValue>>? =
                permissionOverrides.getNullable("permission_overrides")

            /**
             * Returns the raw JSON value of [permissionOverrides].
             *
             * Unlike [permissionOverrides], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("permission_overrides")
            @ExcludeMissing
            fun _permissionOverrides(): JsonField<List<List<JsonValue>>> = permissionOverrides

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

                /** Returns a mutable builder for constructing an instance of [Tiktok]. */
                fun builder() = Builder()
            }

            /** A builder for [Tiktok]. */
            class Builder internal constructor() {

                private var permissionOverrides: JsonField<MutableList<List<JsonValue>>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tiktok: Tiktok) = apply {
                    permissionOverrides = tiktok.permissionOverrides.map { it.toMutableList() }
                    additionalProperties = tiktok.additionalProperties.toMutableMap()
                }

                /**
                 * Override the default permissions/scopes requested during OAuth. Default scopes:
                 * user.info.basic, video.list, video.upload, video.publish
                 */
                fun permissionOverrides(permissionOverrides: List<List<JsonValue>>) =
                    permissionOverrides(JsonField.of(permissionOverrides))

                /**
                 * Sets [Builder.permissionOverrides] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.permissionOverrides] with a well-typed
                 * `List<List<JsonValue>>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun permissionOverrides(permissionOverrides: JsonField<List<List<JsonValue>>>) =
                    apply {
                        this.permissionOverrides = permissionOverrides.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [List<JsonValue>] to [permissionOverrides].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPermissionOverride(permissionOverride: List<JsonValue>) = apply {
                    permissionOverrides =
                        (permissionOverrides ?: JsonField.of(mutableListOf())).also {
                            checkKnown("permissionOverrides", it).add(permissionOverride)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Tiktok].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Tiktok =
                    Tiktok(
                        (permissionOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Tiktok = apply {
                if (validated) {
                    return@apply
                }

                permissionOverrides()
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
                (permissionOverrides.asKnown()?.sumOf { it.size.toInt() } ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tiktok &&
                    permissionOverrides == other.permissionOverrides &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(permissionOverrides, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tiktok{permissionOverrides=$permissionOverrides, additionalProperties=$additionalProperties}"
        }

        /** Additional data for connecting TikTok Business accounts */
        class TiktokBusiness
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val permissionOverrides: JsonField<List<List<JsonValue>>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("permission_overrides")
                @ExcludeMissing
                permissionOverrides: JsonField<List<List<JsonValue>>> = JsonMissing.of()
            ) : this(permissionOverrides, mutableMapOf())

            /**
             * Override the default permissions/scopes requested during OAuth. Default scopes:
             * user.info.basic, user.info.username, user.info.stats, user.info.profile,
             * user.account.type, user.insights, video.list, video.insights, comment.list,
             * comment.list.manage, video.publish, video.upload, biz.spark.auth,
             * discovery.search.words
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun permissionOverrides(): List<List<JsonValue>>? =
                permissionOverrides.getNullable("permission_overrides")

            /**
             * Returns the raw JSON value of [permissionOverrides].
             *
             * Unlike [permissionOverrides], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("permission_overrides")
            @ExcludeMissing
            fun _permissionOverrides(): JsonField<List<List<JsonValue>>> = permissionOverrides

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

                /** Returns a mutable builder for constructing an instance of [TiktokBusiness]. */
                fun builder() = Builder()
            }

            /** A builder for [TiktokBusiness]. */
            class Builder internal constructor() {

                private var permissionOverrides: JsonField<MutableList<List<JsonValue>>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tiktokBusiness: TiktokBusiness) = apply {
                    permissionOverrides =
                        tiktokBusiness.permissionOverrides.map { it.toMutableList() }
                    additionalProperties = tiktokBusiness.additionalProperties.toMutableMap()
                }

                /**
                 * Override the default permissions/scopes requested during OAuth. Default scopes:
                 * user.info.basic, user.info.username, user.info.stats, user.info.profile,
                 * user.account.type, user.insights, video.list, video.insights, comment.list,
                 * comment.list.manage, video.publish, video.upload, biz.spark.auth,
                 * discovery.search.words
                 */
                fun permissionOverrides(permissionOverrides: List<List<JsonValue>>) =
                    permissionOverrides(JsonField.of(permissionOverrides))

                /**
                 * Sets [Builder.permissionOverrides] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.permissionOverrides] with a well-typed
                 * `List<List<JsonValue>>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun permissionOverrides(permissionOverrides: JsonField<List<List<JsonValue>>>) =
                    apply {
                        this.permissionOverrides = permissionOverrides.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [List<JsonValue>] to [permissionOverrides].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPermissionOverride(permissionOverride: List<JsonValue>) = apply {
                    permissionOverrides =
                        (permissionOverrides ?: JsonField.of(mutableListOf())).also {
                            checkKnown("permissionOverrides", it).add(permissionOverride)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [TiktokBusiness].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TiktokBusiness =
                    TiktokBusiness(
                        (permissionOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): TiktokBusiness = apply {
                if (validated) {
                    return@apply
                }

                permissionOverrides()
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
                (permissionOverrides.asKnown()?.sumOf { it.size.toInt() } ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TiktokBusiness &&
                    permissionOverrides == other.permissionOverrides &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(permissionOverrides, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TiktokBusiness{permissionOverrides=$permissionOverrides, additionalProperties=$additionalProperties}"
        }

        /** Additional data for connecting YouTube accounts */
        class Youtube
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val permissionOverrides: JsonField<List<List<JsonValue>>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("permission_overrides")
                @ExcludeMissing
                permissionOverrides: JsonField<List<List<JsonValue>>> = JsonMissing.of()
            ) : this(permissionOverrides, mutableMapOf())

            /**
             * Override the default permissions/scopes requested during OAuth. Default scopes:
             * https://www.googleapis.com/auth/youtube.force-ssl,
             * https://www.googleapis.com/auth/youtube.upload,
             * https://www.googleapis.com/auth/youtube.readonly,
             * https://www.googleapis.com/auth/userinfo.profile
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun permissionOverrides(): List<List<JsonValue>>? =
                permissionOverrides.getNullable("permission_overrides")

            /**
             * Returns the raw JSON value of [permissionOverrides].
             *
             * Unlike [permissionOverrides], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("permission_overrides")
            @ExcludeMissing
            fun _permissionOverrides(): JsonField<List<List<JsonValue>>> = permissionOverrides

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

                /** Returns a mutable builder for constructing an instance of [Youtube]. */
                fun builder() = Builder()
            }

            /** A builder for [Youtube]. */
            class Builder internal constructor() {

                private var permissionOverrides: JsonField<MutableList<List<JsonValue>>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(youtube: Youtube) = apply {
                    permissionOverrides = youtube.permissionOverrides.map { it.toMutableList() }
                    additionalProperties = youtube.additionalProperties.toMutableMap()
                }

                /**
                 * Override the default permissions/scopes requested during OAuth. Default scopes:
                 * https://www.googleapis.com/auth/youtube.force-ssl,
                 * https://www.googleapis.com/auth/youtube.upload,
                 * https://www.googleapis.com/auth/youtube.readonly,
                 * https://www.googleapis.com/auth/userinfo.profile
                 */
                fun permissionOverrides(permissionOverrides: List<List<JsonValue>>) =
                    permissionOverrides(JsonField.of(permissionOverrides))

                /**
                 * Sets [Builder.permissionOverrides] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.permissionOverrides] with a well-typed
                 * `List<List<JsonValue>>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun permissionOverrides(permissionOverrides: JsonField<List<List<JsonValue>>>) =
                    apply {
                        this.permissionOverrides = permissionOverrides.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [List<JsonValue>] to [permissionOverrides].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPermissionOverride(permissionOverride: List<JsonValue>) = apply {
                    permissionOverrides =
                        (permissionOverrides ?: JsonField.of(mutableListOf())).also {
                            checkKnown("permissionOverrides", it).add(permissionOverride)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Youtube].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Youtube =
                    Youtube(
                        (permissionOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Youtube = apply {
                if (validated) {
                    return@apply
                }

                permissionOverrides()
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
                (permissionOverrides.asKnown()?.sumOf { it.size.toInt() } ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Youtube &&
                    permissionOverrides == other.permissionOverrides &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(permissionOverrides, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Youtube{permissionOverrides=$permissionOverrides, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PlatformData &&
                bluesky == other.bluesky &&
                facebook == other.facebook &&
                instagram == other.instagram &&
                linkedin == other.linkedin &&
                pinterest == other.pinterest &&
                threads == other.threads &&
                tiktok == other.tiktok &&
                tiktokBusiness == other.tiktokBusiness &&
                youtube == other.youtube &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                bluesky,
                facebook,
                instagram,
                linkedin,
                pinterest,
                threads,
                tiktok,
                tiktokBusiness,
                youtube,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlatformData{bluesky=$bluesky, facebook=$facebook, instagram=$instagram, linkedin=$linkedin, pinterest=$pinterest, threads=$threads, tiktok=$tiktok, tiktokBusiness=$tiktokBusiness, youtube=$youtube, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SocialAccountCreateAuthUrlParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SocialAccountCreateAuthUrlParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
