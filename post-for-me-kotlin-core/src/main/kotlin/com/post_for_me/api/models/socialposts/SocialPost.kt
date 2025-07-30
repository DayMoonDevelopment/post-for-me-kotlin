// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.post_for_me.api.core.Enum
import com.post_for_me.api.core.ExcludeMissing
import com.post_for_me.api.core.JsonField
import com.post_for_me.api.core.JsonMissing
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.checkKnown
import com.post_for_me.api.core.checkRequired
import com.post_for_me.api.core.toImmutable
import com.post_for_me.api.errors.PostForMeInvalidDataException
import java.util.Collections
import java.util.Objects

class SocialPost
private constructor(
    private val id: JsonField<String>,
    private val accountConfigurations: JsonField<List<JsonValue>>,
    private val caption: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val externalId: JsonField<String>,
    private val media: JsonValue,
    private val platformConfigurations: JsonValue,
    private val scheduledAt: JsonField<String>,
    private val socialAccounts: JsonField<List<String>>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_configurations")
        @ExcludeMissing
        accountConfigurations: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("caption") @ExcludeMissing caption: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("media") @ExcludeMissing media: JsonValue = JsonMissing.of(),
        @JsonProperty("platform_configurations")
        @ExcludeMissing
        platformConfigurations: JsonValue = JsonMissing.of(),
        @JsonProperty("scheduled_at")
        @ExcludeMissing
        scheduledAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("social_accounts")
        @ExcludeMissing
        socialAccounts: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        accountConfigurations,
        caption,
        createdAt,
        externalId,
        media,
        platformConfigurations,
        scheduledAt,
        socialAccounts,
        status,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Unique identifier of the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Account-specific configurations for the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountConfigurations(): List<JsonValue>? =
        accountConfigurations.getNullable("account_configurations")

    /**
     * Caption text for the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun caption(): String = caption.getRequired("caption")

    /**
     * Timestamp when the post was created
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): String = createdAt.getRequired("created_at")

    /**
     * Provided unique identifier of the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): String? = externalId.getNullable("external_id")

    /** Array of media URLs associated with the post */
    @JsonProperty("media") @ExcludeMissing fun _media(): JsonValue = media

    /** Platform-specific configurations for the post */
    @JsonProperty("platform_configurations")
    @ExcludeMissing
    fun _platformConfigurations(): JsonValue = platformConfigurations

    /**
     * Scheduled date and time for the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduledAt(): String? = scheduledAt.getNullable("scheduled_at")

    /**
     * Array of social account IDs for posting
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun socialAccounts(): List<String> = socialAccounts.getRequired("social_accounts")

    /**
     * Current status of the post: draft, processed, scheduled, or processing
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Timestamp when the post was last updated
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): String = updatedAt.getRequired("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountConfigurations].
     *
     * Unlike [accountConfigurations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("account_configurations")
    @ExcludeMissing
    fun _accountConfigurations(): JsonField<List<JsonValue>> = accountConfigurations

    /**
     * Returns the raw JSON value of [caption].
     *
     * Unlike [caption], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonField<String> = caption

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [scheduledAt].
     *
     * Unlike [scheduledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scheduled_at")
    @ExcludeMissing
    fun _scheduledAt(): JsonField<String> = scheduledAt

    /**
     * Returns the raw JSON value of [socialAccounts].
     *
     * Unlike [socialAccounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("social_accounts")
    @ExcludeMissing
    fun _socialAccounts(): JsonField<List<String>> = socialAccounts

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [SocialPost].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountConfigurations()
         * .caption()
         * .createdAt()
         * .externalId()
         * .media()
         * .platformConfigurations()
         * .scheduledAt()
         * .socialAccounts()
         * .status()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SocialPost]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountConfigurations: JsonField<MutableList<JsonValue>>? = null
        private var caption: JsonField<String>? = null
        private var createdAt: JsonField<String>? = null
        private var externalId: JsonField<String>? = null
        private var media: JsonValue? = null
        private var platformConfigurations: JsonValue? = null
        private var scheduledAt: JsonField<String>? = null
        private var socialAccounts: JsonField<MutableList<String>>? = null
        private var status: JsonField<Status>? = null
        private var updatedAt: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(socialPost: SocialPost) = apply {
            id = socialPost.id
            accountConfigurations = socialPost.accountConfigurations.map { it.toMutableList() }
            caption = socialPost.caption
            createdAt = socialPost.createdAt
            externalId = socialPost.externalId
            media = socialPost.media
            platformConfigurations = socialPost.platformConfigurations
            scheduledAt = socialPost.scheduledAt
            socialAccounts = socialPost.socialAccounts.map { it.toMutableList() }
            status = socialPost.status
            updatedAt = socialPost.updatedAt
            additionalProperties = socialPost.additionalProperties.toMutableMap()
        }

        /** Unique identifier of the post */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Account-specific configurations for the post */
        fun accountConfigurations(accountConfigurations: List<JsonValue>?) =
            accountConfigurations(JsonField.ofNullable(accountConfigurations))

        /**
         * Sets [Builder.accountConfigurations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountConfigurations] with a well-typed
         * `List<JsonValue>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun accountConfigurations(accountConfigurations: JsonField<List<JsonValue>>) = apply {
            this.accountConfigurations = accountConfigurations.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [accountConfigurations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccountConfiguration(accountConfiguration: JsonValue) = apply {
            accountConfigurations =
                (accountConfigurations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("accountConfigurations", it).add(accountConfiguration)
                }
        }

        /** Caption text for the post */
        fun caption(caption: String) = caption(JsonField.of(caption))

        /**
         * Sets [Builder.caption] to an arbitrary JSON value.
         *
         * You should usually call [Builder.caption] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun caption(caption: JsonField<String>) = apply { this.caption = caption }

        /** Timestamp when the post was created */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /** Provided unique identifier of the post */
        fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /** Array of media URLs associated with the post */
        fun media(media: JsonValue) = apply { this.media = media }

        /** Platform-specific configurations for the post */
        fun platformConfigurations(platformConfigurations: JsonValue) = apply {
            this.platformConfigurations = platformConfigurations
        }

        /** Scheduled date and time for the post */
        fun scheduledAt(scheduledAt: String?) = scheduledAt(JsonField.ofNullable(scheduledAt))

        /**
         * Sets [Builder.scheduledAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scheduledAt(scheduledAt: JsonField<String>) = apply { this.scheduledAt = scheduledAt }

        /** Array of social account IDs for posting */
        fun socialAccounts(socialAccounts: List<String>) =
            socialAccounts(JsonField.of(socialAccounts))

        /**
         * Sets [Builder.socialAccounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.socialAccounts] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun socialAccounts(socialAccounts: JsonField<List<String>>) = apply {
            this.socialAccounts = socialAccounts.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [socialAccounts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSocialAccount(socialAccount: String) = apply {
            socialAccounts =
                (socialAccounts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("socialAccounts", it).add(socialAccount)
                }
        }

        /** Current status of the post: draft, processed, scheduled, or processing */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Timestamp when the post was last updated */
        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [SocialPost].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountConfigurations()
         * .caption()
         * .createdAt()
         * .externalId()
         * .media()
         * .platformConfigurations()
         * .scheduledAt()
         * .socialAccounts()
         * .status()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SocialPost =
            SocialPost(
                checkRequired("id", id),
                checkRequired("accountConfigurations", accountConfigurations).map {
                    it.toImmutable()
                },
                checkRequired("caption", caption),
                checkRequired("createdAt", createdAt),
                checkRequired("externalId", externalId),
                checkRequired("media", media),
                checkRequired("platformConfigurations", platformConfigurations),
                checkRequired("scheduledAt", scheduledAt),
                checkRequired("socialAccounts", socialAccounts).map { it.toImmutable() },
                checkRequired("status", status),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SocialPost = apply {
        if (validated) {
            return@apply
        }

        id()
        accountConfigurations()
        caption()
        createdAt()
        externalId()
        scheduledAt()
        socialAccounts()
        status().validate()
        updatedAt()
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
            (accountConfigurations.asKnown()?.size ?: 0) +
            (if (caption.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (externalId.asKnown() == null) 0 else 1) +
            (if (scheduledAt.asKnown() == null) 0 else 1) +
            (socialAccounts.asKnown()?.size ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    /** Current status of the post: draft, processed, scheduled, or processing */
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

            val DRAFT = of("draft")

            val SCHEDULED = of("scheduled")

            val PROCESSING = of("processing")

            val PROCESSED = of("processed")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DRAFT,
            SCHEDULED,
            PROCESSING,
            PROCESSED,
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
            DRAFT,
            SCHEDULED,
            PROCESSING,
            PROCESSED,
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
                DRAFT -> Value.DRAFT
                SCHEDULED -> Value.SCHEDULED
                PROCESSING -> Value.PROCESSING
                PROCESSED -> Value.PROCESSED
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
                DRAFT -> Known.DRAFT
                SCHEDULED -> Known.SCHEDULED
                PROCESSING -> Known.PROCESSING
                PROCESSED -> Known.PROCESSED
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SocialPost && id == other.id && accountConfigurations == other.accountConfigurations && caption == other.caption && createdAt == other.createdAt && externalId == other.externalId && media == other.media && platformConfigurations == other.platformConfigurations && scheduledAt == other.scheduledAt && socialAccounts == other.socialAccounts && status == other.status && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountConfigurations, caption, createdAt, externalId, media, platformConfigurations, scheduledAt, socialAccounts, status, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SocialPost{id=$id, accountConfigurations=$accountConfigurations, caption=$caption, createdAt=$createdAt, externalId=$externalId, media=$media, platformConfigurations=$platformConfigurations, scheduledAt=$scheduledAt, socialAccounts=$socialAccounts, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
