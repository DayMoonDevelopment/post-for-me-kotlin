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
     * Additional data needed for the provider
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun platformData(): PlatformData? = body.platformData()

    /**
     * Returns the raw JSON value of [platform].
     *
     * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _platform(): JsonField<String> = body._platform()

    /**
     * Returns the raw JSON value of [platformData].
     *
     * Unlike [platformData], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _platformData(): JsonField<PlatformData> = body._platformData()

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
         * - [platformData]
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
    private constructor(
        private val platform: JsonField<String>,
        private val platformData: JsonField<PlatformData>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("platform")
            @ExcludeMissing
            platform: JsonField<String> = JsonMissing.of(),
            @JsonProperty("platform_data")
            @ExcludeMissing
            platformData: JsonField<PlatformData> = JsonMissing.of(),
        ) : this(platform, platformData, mutableMapOf())

        /**
         * The social account provider
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun platform(): String = platform.getRequired("platform")

        /**
         * Additional data needed for the provider
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun platformData(): PlatformData? = platformData.getNullable("platform_data")

        /**
         * Returns the raw JSON value of [platform].
         *
         * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<String> = platform

        /**
         * Returns the raw JSON value of [platformData].
         *
         * Unlike [platformData], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("platform_data")
        @ExcludeMissing
        fun _platformData(): JsonField<PlatformData> = platformData

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
            private var platformData: JsonField<PlatformData> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                platform = body.platform
                platformData = body.platformData
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
                    platformData,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            platform()
            platformData()?.validate()
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
            (if (platform.asKnown() == null) 0 else 1) + (platformData.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                platform == other.platform &&
                platformData == other.platformData &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(platform, platformData, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{platform=$platform, platformData=$platformData, additionalProperties=$additionalProperties}"
    }

    /** Additional data needed for the provider */
    class PlatformData
    private constructor(
        private val bluesky: JsonField<Bluesky>,
        private val linkedin: JsonField<Linkedin>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bluesky") @ExcludeMissing bluesky: JsonField<Bluesky> = JsonMissing.of(),
            @JsonProperty("linkedin")
            @ExcludeMissing
            linkedin: JsonField<Linkedin> = JsonMissing.of(),
        ) : this(bluesky, linkedin, mutableMapOf())

        /**
         * Additional data needed for connecting bluesky accounts
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun bluesky(): Bluesky? = bluesky.getNullable("bluesky")

        /**
         * Additional data for connecting linkedin accounts
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun linkedin(): Linkedin? = linkedin.getNullable("linkedin")

        /**
         * Returns the raw JSON value of [bluesky].
         *
         * Unlike [bluesky], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bluesky") @ExcludeMissing fun _bluesky(): JsonField<Bluesky> = bluesky

        /**
         * Returns the raw JSON value of [linkedin].
         *
         * Unlike [linkedin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("linkedin") @ExcludeMissing fun _linkedin(): JsonField<Linkedin> = linkedin

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
            private var linkedin: JsonField<Linkedin> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(platformData: PlatformData) = apply {
                bluesky = platformData.bluesky
                linkedin = platformData.linkedin
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
                PlatformData(bluesky, linkedin, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): PlatformData = apply {
            if (validated) {
                return@apply
            }

            bluesky()?.validate()
            linkedin()?.validate()
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
            (bluesky.asKnown()?.validity() ?: 0) + (linkedin.asKnown()?.validity() ?: 0)

        /** Additional data needed for connecting bluesky accounts */
        class Bluesky
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

        /** Additional data for connecting linkedin accounts */
        class Linkedin
        private constructor(
            private val connectionType: JsonField<ConnectionType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("connection_type")
                @ExcludeMissing
                connectionType: JsonField<ConnectionType> = JsonMissing.of()
            ) : this(connectionType, mutableMapOf())

            /**
             * The type of connection; personal for posting on behalf of the user only, organization
             * for posting on behalf of both an organization and the user
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun connectionType(): ConnectionType = connectionType.getRequired("connection_type")

            /**
             * Returns the raw JSON value of [connectionType].
             *
             * Unlike [connectionType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("connection_type")
            @ExcludeMissing
            fun _connectionType(): JsonField<ConnectionType> = connectionType

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
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(linkedin: Linkedin) = apply {
                    connectionType = linkedin.connectionType
                    additionalProperties = linkedin.additionalProperties.toMutableMap()
                }

                /**
                 * The type of connection; personal for posting on behalf of the user only,
                 * organization for posting on behalf of both an organization and the user
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
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Linkedin = apply {
                if (validated) {
                    return@apply
                }

                connectionType().validate()
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
            internal fun validity(): Int = (connectionType.asKnown()?.validity() ?: 0)

            /**
             * The type of connection; personal for posting on behalf of the user only, organization
             * for posting on behalf of both an organization and the user
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
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(connectionType, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Linkedin{connectionType=$connectionType, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PlatformData &&
                bluesky == other.bluesky &&
                linkedin == other.linkedin &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(bluesky, linkedin, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlatformData{bluesky=$bluesky, linkedin=$linkedin, additionalProperties=$additionalProperties}"
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
