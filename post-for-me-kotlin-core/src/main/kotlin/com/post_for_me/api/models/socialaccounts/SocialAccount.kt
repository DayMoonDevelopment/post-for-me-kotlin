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
import com.post_for_me.api.core.checkRequired
import com.post_for_me.api.errors.PostForMeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class SocialAccount
private constructor(
    private val id: JsonField<String>,
    private val accessToken: JsonField<String>,
    private val accessTokenExpiresAt: JsonField<OffsetDateTime>,
    private val externalId: JsonField<String>,
    private val metadata: JsonValue,
    private val platform: JsonField<String>,
    private val refreshToken: JsonField<String>,
    private val refreshTokenExpiresAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val userId: JsonField<String>,
    private val username: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("access_token")
        @ExcludeMissing
        accessToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("access_token_expires_at")
        @ExcludeMissing
        accessTokenExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("platform") @ExcludeMissing platform: JsonField<String> = JsonMissing.of(),
        @JsonProperty("refresh_token")
        @ExcludeMissing
        refreshToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("refresh_token_expires_at")
        @ExcludeMissing
        refreshTokenExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("username") @ExcludeMissing username: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        accessToken,
        accessTokenExpiresAt,
        externalId,
        metadata,
        platform,
        refreshToken,
        refreshTokenExpiresAt,
        status,
        userId,
        username,
        mutableMapOf(),
    )

    /**
     * The unique identifier of the social account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

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
     * The external id of the social account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): String? = externalId.getNullable("external_id")

    /** The metadata of the social account */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * The platform of the social account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platform(): String = platform.getRequired("platform")

    /**
     * The refresh token of the social account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refreshToken(): String? = refreshToken.getNullable("refresh_token")

    /**
     * The refresh token expiration date of the social account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refreshTokenExpiresAt(): OffsetDateTime? =
        refreshTokenExpiresAt.getNullable("refresh_token_expires_at")

    /**
     * Status of the account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The platform's id of the social account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("user_id")

    /**
     * The platform's username of the social account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun username(): String? = username.getNullable("username")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
     * Unlike [accessTokenExpiresAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("access_token_expires_at")
    @ExcludeMissing
    fun _accessTokenExpiresAt(): JsonField<OffsetDateTime> = accessTokenExpiresAt

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [platform].
     *
     * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<String> = platform

    /**
     * Returns the raw JSON value of [refreshToken].
     *
     * Unlike [refreshToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refresh_token")
    @ExcludeMissing
    fun _refreshToken(): JsonField<String> = refreshToken

    /**
     * Returns the raw JSON value of [refreshTokenExpiresAt].
     *
     * Unlike [refreshTokenExpiresAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("refresh_token_expires_at")
    @ExcludeMissing
    fun _refreshTokenExpiresAt(): JsonField<OffsetDateTime> = refreshTokenExpiresAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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
         * Returns a mutable builder for constructing an instance of [SocialAccount].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accessToken()
         * .accessTokenExpiresAt()
         * .externalId()
         * .metadata()
         * .platform()
         * .refreshToken()
         * .refreshTokenExpiresAt()
         * .status()
         * .userId()
         * .username()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SocialAccount]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accessToken: JsonField<String>? = null
        private var accessTokenExpiresAt: JsonField<OffsetDateTime>? = null
        private var externalId: JsonField<String>? = null
        private var metadata: JsonValue? = null
        private var platform: JsonField<String>? = null
        private var refreshToken: JsonField<String>? = null
        private var refreshTokenExpiresAt: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var userId: JsonField<String>? = null
        private var username: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(socialAccount: SocialAccount) = apply {
            id = socialAccount.id
            accessToken = socialAccount.accessToken
            accessTokenExpiresAt = socialAccount.accessTokenExpiresAt
            externalId = socialAccount.externalId
            metadata = socialAccount.metadata
            platform = socialAccount.platform
            refreshToken = socialAccount.refreshToken
            refreshTokenExpiresAt = socialAccount.refreshTokenExpiresAt
            status = socialAccount.status
            userId = socialAccount.userId
            username = socialAccount.username
            additionalProperties = socialAccount.additionalProperties.toMutableMap()
        }

        /** The unique identifier of the social account */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The access token of the social account */
        fun accessToken(accessToken: String) = accessToken(JsonField.of(accessToken))

        /**
         * Sets [Builder.accessToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accessToken(accessToken: JsonField<String>) = apply { this.accessToken = accessToken }

        /** The access token expiration date of the social account */
        fun accessTokenExpiresAt(accessTokenExpiresAt: OffsetDateTime) =
            accessTokenExpiresAt(JsonField.of(accessTokenExpiresAt))

        /**
         * Sets [Builder.accessTokenExpiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessTokenExpiresAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun accessTokenExpiresAt(accessTokenExpiresAt: JsonField<OffsetDateTime>) = apply {
            this.accessTokenExpiresAt = accessTokenExpiresAt
        }

        /** The external id of the social account */
        fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /** The metadata of the social account */
        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        /** The platform of the social account */
        fun platform(platform: String) = platform(JsonField.of(platform))

        /**
         * Sets [Builder.platform] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platform] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun platform(platform: JsonField<String>) = apply { this.platform = platform }

        /** The refresh token of the social account */
        fun refreshToken(refreshToken: String?) = refreshToken(JsonField.ofNullable(refreshToken))

        /**
         * Sets [Builder.refreshToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refreshToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        /** Status of the account */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The platform's id of the social account */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** The platform's username of the social account */
        fun username(username: String?) = username(JsonField.ofNullable(username))

        /**
         * Sets [Builder.username] to an arbitrary JSON value.
         *
         * You should usually call [Builder.username] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [SocialAccount].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accessToken()
         * .accessTokenExpiresAt()
         * .externalId()
         * .metadata()
         * .platform()
         * .refreshToken()
         * .refreshTokenExpiresAt()
         * .status()
         * .userId()
         * .username()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SocialAccount =
            SocialAccount(
                checkRequired("id", id),
                checkRequired("accessToken", accessToken),
                checkRequired("accessTokenExpiresAt", accessTokenExpiresAt),
                checkRequired("externalId", externalId),
                checkRequired("metadata", metadata),
                checkRequired("platform", platform),
                checkRequired("refreshToken", refreshToken),
                checkRequired("refreshTokenExpiresAt", refreshTokenExpiresAt),
                checkRequired("status", status),
                checkRequired("userId", userId),
                checkRequired("username", username),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SocialAccount = apply {
        if (validated) {
            return@apply
        }

        id()
        accessToken()
        accessTokenExpiresAt()
        externalId()
        platform()
        refreshToken()
        refreshTokenExpiresAt()
        status().validate()
        userId()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (accessToken.asKnown() == null) 0 else 1) +
            (if (accessTokenExpiresAt.asKnown() == null) 0 else 1) +
            (if (externalId.asKnown() == null) 0 else 1) +
            (if (platform.asKnown() == null) 0 else 1) +
            (if (refreshToken.asKnown() == null) 0 else 1) +
            (if (refreshTokenExpiresAt.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (if (userId.asKnown() == null) 0 else 1) +
            (if (username.asKnown() == null) 0 else 1)

    /** Status of the account */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val CONNECTED = of("connected")

            val DISCONNECTED = of("disconnected")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CONNECTED,
            DISCONNECTED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONNECTED,
            DISCONNECTED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                CONNECTED -> Value.CONNECTED
                DISCONNECTED -> Value.DISCONNECTED
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
                CONNECTED -> Known.CONNECTED
                DISCONNECTED -> Known.DISCONNECTED
                else -> throw PostForMeInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SocialAccount &&
            id == other.id &&
            accessToken == other.accessToken &&
            accessTokenExpiresAt == other.accessTokenExpiresAt &&
            externalId == other.externalId &&
            metadata == other.metadata &&
            platform == other.platform &&
            refreshToken == other.refreshToken &&
            refreshTokenExpiresAt == other.refreshTokenExpiresAt &&
            status == other.status &&
            userId == other.userId &&
            username == other.username &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accessToken,
            accessTokenExpiresAt,
            externalId,
            metadata,
            platform,
            refreshToken,
            refreshTokenExpiresAt,
            status,
            userId,
            username,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SocialAccount{id=$id, accessToken=$accessToken, accessTokenExpiresAt=$accessTokenExpiresAt, externalId=$externalId, metadata=$metadata, platform=$platform, refreshToken=$refreshToken, refreshTokenExpiresAt=$refreshTokenExpiresAt, status=$status, userId=$userId, username=$username, additionalProperties=$additionalProperties}"
}
