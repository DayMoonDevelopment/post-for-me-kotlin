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
import com.post_for_me.api.models.socialaccounts.SocialAccount
import java.util.Collections
import java.util.Objects

class SocialPost
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountConfigurations: JsonField<List<AccountConfiguration>>,
    private val caption: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val externalId: JsonField<String>,
    private val media: JsonField<List<Media>>,
    private val platformConfigurations: JsonField<PlatformConfigurationsDto>,
    private val scheduledAt: JsonField<String>,
    private val socialAccounts: JsonField<List<SocialAccount>>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_configurations")
        @ExcludeMissing
        accountConfigurations: JsonField<List<AccountConfiguration>> = JsonMissing.of(),
        @JsonProperty("caption") @ExcludeMissing caption: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("media") @ExcludeMissing media: JsonField<List<Media>> = JsonMissing.of(),
        @JsonProperty("platform_configurations")
        @ExcludeMissing
        platformConfigurations: JsonField<PlatformConfigurationsDto> = JsonMissing.of(),
        @JsonProperty("scheduled_at")
        @ExcludeMissing
        scheduledAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("social_accounts")
        @ExcludeMissing
        socialAccounts: JsonField<List<SocialAccount>> = JsonMissing.of(),
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
    fun accountConfigurations(): List<AccountConfiguration>? =
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

    /**
     * Array of media URLs associated with the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun media(): List<Media>? = media.getNullable("media")

    /**
     * Platform-specific configurations for the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun platformConfigurations(): PlatformConfigurationsDto? =
        platformConfigurations.getNullable("platform_configurations")

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
    fun socialAccounts(): List<SocialAccount> = socialAccounts.getRequired("social_accounts")

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
    fun _accountConfigurations(): JsonField<List<AccountConfiguration>> = accountConfigurations

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
     * Returns the raw JSON value of [media].
     *
     * Unlike [media], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("media") @ExcludeMissing fun _media(): JsonField<List<Media>> = media

    /**
     * Returns the raw JSON value of [platformConfigurations].
     *
     * Unlike [platformConfigurations], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("platform_configurations")
    @ExcludeMissing
    fun _platformConfigurations(): JsonField<PlatformConfigurationsDto> = platformConfigurations

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
    fun _socialAccounts(): JsonField<List<SocialAccount>> = socialAccounts

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
        private var accountConfigurations: JsonField<MutableList<AccountConfiguration>>? = null
        private var caption: JsonField<String>? = null
        private var createdAt: JsonField<String>? = null
        private var externalId: JsonField<String>? = null
        private var media: JsonField<MutableList<Media>>? = null
        private var platformConfigurations: JsonField<PlatformConfigurationsDto>? = null
        private var scheduledAt: JsonField<String>? = null
        private var socialAccounts: JsonField<MutableList<SocialAccount>>? = null
        private var status: JsonField<Status>? = null
        private var updatedAt: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(socialPost: SocialPost) = apply {
            id = socialPost.id
            accountConfigurations = socialPost.accountConfigurations.map { it.toMutableList() }
            caption = socialPost.caption
            createdAt = socialPost.createdAt
            externalId = socialPost.externalId
            media = socialPost.media.map { it.toMutableList() }
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
        fun accountConfigurations(accountConfigurations: List<AccountConfiguration>?) =
            accountConfigurations(JsonField.ofNullable(accountConfigurations))

        /**
         * Sets [Builder.accountConfigurations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountConfigurations] with a well-typed
         * `List<AccountConfiguration>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun accountConfigurations(accountConfigurations: JsonField<List<AccountConfiguration>>) =
            apply {
                this.accountConfigurations = accountConfigurations.map { it.toMutableList() }
            }

        /**
         * Adds a single [AccountConfiguration] to [accountConfigurations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccountConfiguration(accountConfiguration: AccountConfiguration) = apply {
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
        fun media(media: List<Media>?) = media(JsonField.ofNullable(media))

        /**
         * Sets [Builder.media] to an arbitrary JSON value.
         *
         * You should usually call [Builder.media] with a well-typed `List<Media>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun media(media: JsonField<List<Media>>) = apply {
            this.media = media.map { it.toMutableList() }
        }

        /**
         * Adds a single [Media] to [Builder.media].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMedia(media: Media) = apply {
            this.media =
                (this.media ?: JsonField.of(mutableListOf())).also {
                    checkKnown("media", it).add(media)
                }
        }

        /** Platform-specific configurations for the post */
        fun platformConfigurations(platformConfigurations: PlatformConfigurationsDto?) =
            platformConfigurations(JsonField.ofNullable(platformConfigurations))

        /**
         * Sets [Builder.platformConfigurations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformConfigurations] with a well-typed
         * [PlatformConfigurationsDto] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun platformConfigurations(platformConfigurations: JsonField<PlatformConfigurationsDto>) =
            apply {
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
        fun socialAccounts(socialAccounts: List<SocialAccount>) =
            socialAccounts(JsonField.of(socialAccounts))

        /**
         * Sets [Builder.socialAccounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.socialAccounts] with a well-typed `List<SocialAccount>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun socialAccounts(socialAccounts: JsonField<List<SocialAccount>>) = apply {
            this.socialAccounts = socialAccounts.map { it.toMutableList() }
        }

        /**
         * Adds a single [SocialAccount] to [socialAccounts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSocialAccount(socialAccount: SocialAccount) = apply {
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
                checkRequired("media", media).map { it.toImmutable() },
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
        accountConfigurations()?.forEach { it.validate() }
        caption()
        createdAt()
        externalId()
        media()?.forEach { it.validate() }
        platformConfigurations()?.validate()
        scheduledAt()
        socialAccounts().forEach { it.validate() }
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
            (accountConfigurations.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (caption.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (externalId.asKnown() == null) 0 else 1) +
            (media.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (platformConfigurations.asKnown()?.validity() ?: 0) +
            (if (scheduledAt.asKnown() == null) 0 else 1) +
            (socialAccounts.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    class AccountConfiguration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val configuration: JsonField<Configuration>,
        private val socialAccountId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("configuration")
            @ExcludeMissing
            configuration: JsonField<Configuration> = JsonMissing.of(),
            @JsonProperty("social_account_id")
            @ExcludeMissing
            socialAccountId: JsonField<String> = JsonMissing.of(),
        ) : this(configuration, socialAccountId, mutableMapOf())

        /**
         * Configuration for the social account
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun configuration(): Configuration = configuration.getRequired("configuration")

        /**
         * ID of the social account, you want to apply the configuration to
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun socialAccountId(): String = socialAccountId.getRequired("social_account_id")

        /**
         * Returns the raw JSON value of [configuration].
         *
         * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("configuration")
        @ExcludeMissing
        fun _configuration(): JsonField<Configuration> = configuration

        /**
         * Returns the raw JSON value of [socialAccountId].
         *
         * Unlike [socialAccountId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("social_account_id")
        @ExcludeMissing
        fun _socialAccountId(): JsonField<String> = socialAccountId

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
             * Returns a mutable builder for constructing an instance of [AccountConfiguration].
             *
             * The following fields are required:
             * ```kotlin
             * .configuration()
             * .socialAccountId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AccountConfiguration]. */
        class Builder internal constructor() {

            private var configuration: JsonField<Configuration>? = null
            private var socialAccountId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountConfiguration: AccountConfiguration) = apply {
                configuration = accountConfiguration.configuration
                socialAccountId = accountConfiguration.socialAccountId
                additionalProperties = accountConfiguration.additionalProperties.toMutableMap()
            }

            /** Configuration for the social account */
            fun configuration(configuration: Configuration) =
                configuration(JsonField.of(configuration))

            /**
             * Sets [Builder.configuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configuration] with a well-typed [Configuration]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun configuration(configuration: JsonField<Configuration>) = apply {
                this.configuration = configuration
            }

            /** ID of the social account, you want to apply the configuration to */
            fun socialAccountId(socialAccountId: String) =
                socialAccountId(JsonField.of(socialAccountId))

            /**
             * Sets [Builder.socialAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.socialAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun socialAccountId(socialAccountId: JsonField<String>) = apply {
                this.socialAccountId = socialAccountId
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
             * Returns an immutable instance of [AccountConfiguration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .configuration()
             * .socialAccountId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccountConfiguration =
                AccountConfiguration(
                    checkRequired("configuration", configuration),
                    checkRequired("socialAccountId", socialAccountId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AccountConfiguration = apply {
            if (validated) {
                return@apply
            }

            configuration().validate()
            socialAccountId()
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
            (configuration.asKnown()?.validity() ?: 0) +
                (if (socialAccountId.asKnown() == null) 0 else 1)

        /** Configuration for the social account */
        class Configuration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val allowComment: JsonField<Boolean>,
            private val allowDuet: JsonField<Boolean>,
            private val allowStitch: JsonField<Boolean>,
            private val autoAddMusic: JsonField<Boolean>,
            private val boardIds: JsonField<List<String>>,
            private val caption: JsonValue,
            private val collaborators: JsonField<List<List<JsonValue>>>,
            private val communityId: JsonField<String>,
            private val discloseBrandedContent: JsonField<Boolean>,
            private val discloseYourBrand: JsonField<Boolean>,
            private val isAiGenerated: JsonField<Boolean>,
            private val isDraft: JsonField<Boolean>,
            private val link: JsonField<String>,
            private val location: JsonField<String>,
            private val madeForKids: JsonField<Boolean>,
            private val media: JsonField<List<String>>,
            private val placement: JsonField<Placement>,
            private val poll: JsonField<Poll>,
            private val privacyStatus: JsonField<PrivacyStatus>,
            private val quoteTweetId: JsonField<String>,
            private val replySettings: JsonField<ReplySettings>,
            private val shareToFeed: JsonField<Boolean>,
            private val title: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("allow_comment")
                @ExcludeMissing
                allowComment: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("allow_duet")
                @ExcludeMissing
                allowDuet: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("allow_stitch")
                @ExcludeMissing
                allowStitch: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("auto_add_music")
                @ExcludeMissing
                autoAddMusic: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("board_ids")
                @ExcludeMissing
                boardIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("caption") @ExcludeMissing caption: JsonValue = JsonMissing.of(),
                @JsonProperty("collaborators")
                @ExcludeMissing
                collaborators: JsonField<List<List<JsonValue>>> = JsonMissing.of(),
                @JsonProperty("community_id")
                @ExcludeMissing
                communityId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("disclose_branded_content")
                @ExcludeMissing
                discloseBrandedContent: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("disclose_your_brand")
                @ExcludeMissing
                discloseYourBrand: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("is_ai_generated")
                @ExcludeMissing
                isAiGenerated: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("is_draft")
                @ExcludeMissing
                isDraft: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("link") @ExcludeMissing link: JsonField<String> = JsonMissing.of(),
                @JsonProperty("location")
                @ExcludeMissing
                location: JsonField<String> = JsonMissing.of(),
                @JsonProperty("made_for_kids")
                @ExcludeMissing
                madeForKids: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("media")
                @ExcludeMissing
                media: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("placement")
                @ExcludeMissing
                placement: JsonField<Placement> = JsonMissing.of(),
                @JsonProperty("poll") @ExcludeMissing poll: JsonField<Poll> = JsonMissing.of(),
                @JsonProperty("privacy_status")
                @ExcludeMissing
                privacyStatus: JsonField<PrivacyStatus> = JsonMissing.of(),
                @JsonProperty("quote_tweet_id")
                @ExcludeMissing
                quoteTweetId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reply_settings")
                @ExcludeMissing
                replySettings: JsonField<ReplySettings> = JsonMissing.of(),
                @JsonProperty("share_to_feed")
                @ExcludeMissing
                shareToFeed: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            ) : this(
                allowComment,
                allowDuet,
                allowStitch,
                autoAddMusic,
                boardIds,
                caption,
                collaborators,
                communityId,
                discloseBrandedContent,
                discloseYourBrand,
                isAiGenerated,
                isDraft,
                link,
                location,
                madeForKids,
                media,
                placement,
                poll,
                privacyStatus,
                quoteTweetId,
                replySettings,
                shareToFeed,
                title,
                mutableMapOf(),
            )

            /**
             * Allow comments on TikTok
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun allowComment(): Boolean? = allowComment.getNullable("allow_comment")

            /**
             * Allow duets on TikTok
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun allowDuet(): Boolean? = allowDuet.getNullable("allow_duet")

            /**
             * Allow stitch on TikTok
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun allowStitch(): Boolean? = allowStitch.getNullable("allow_stitch")

            /**
             * Will automatically add music to photo posts on TikTok
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun autoAddMusic(): Boolean? = autoAddMusic.getNullable("auto_add_music")

            /**
             * Pinterest board IDs
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun boardIds(): List<String>? = boardIds.getNullable("board_ids")

            /** Overrides the `caption` from the post */
            @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonValue = caption

            /**
             * List of page ids or users to invite as collaborators for a Video Reel (Instagram and
             * Facebook)
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun collaborators(): List<List<JsonValue>>? = collaborators.getNullable("collaborators")

            /**
             * Id of the twitter community to post to
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun communityId(): String? = communityId.getNullable("community_id")

            /**
             * Disclose branded content on TikTok
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun discloseBrandedContent(): Boolean? =
                discloseBrandedContent.getNullable("disclose_branded_content")

            /**
             * Disclose your brand on TikTok
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun discloseYourBrand(): Boolean? = discloseYourBrand.getNullable("disclose_your_brand")

            /**
             * Flag content as AI generated on TikTok
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun isAiGenerated(): Boolean? = isAiGenerated.getNullable("is_ai_generated")

            /**
             * Will create a draft upload to TikTok, posting will need to be completed from within
             * the app
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun isDraft(): Boolean? = isDraft.getNullable("is_draft")

            /**
             * Pinterest post link
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun link(): String? = link.getNullable("link")

            /**
             * Page id with a location that you want to tag the image or video with (Instagram and
             * Facebook)
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun location(): String? = location.getNullable("location")

            /**
             * If true will notify YouTube the video is intended for kids, defaults to false
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun madeForKids(): Boolean? = madeForKids.getNullable("made_for_kids")

            /**
             * Overrides the `media` from the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun media(): List<String>? = media.getNullable("media")

            /**
             * Post placement for Facebook/Instagram/Threads
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun placement(): Placement? = placement.getNullable("placement")

            /**
             * Poll options for the twitter
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun poll(): Poll? = poll.getNullable("poll")

            /**
             * Sets the privacy status for TikTok (private, public), or YouTube (private, public,
             * unlisted)
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun privacyStatus(): PrivacyStatus? = privacyStatus.getNullable("privacy_status")

            /**
             * Id of the tweet you want to quote
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun quoteTweetId(): String? = quoteTweetId.getNullable("quote_tweet_id")

            /**
             * Who can reply to the tweet
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun replySettings(): ReplySettings? = replySettings.getNullable("reply_settings")

            /**
             * If false Instagram video posts will only be shown in the Reels tab
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun shareToFeed(): Boolean? = shareToFeed.getNullable("share_to_feed")

            /**
             * Overrides the `title` from the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun title(): String? = title.getNullable("title")

            /**
             * Returns the raw JSON value of [allowComment].
             *
             * Unlike [allowComment], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("allow_comment")
            @ExcludeMissing
            fun _allowComment(): JsonField<Boolean> = allowComment

            /**
             * Returns the raw JSON value of [allowDuet].
             *
             * Unlike [allowDuet], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("allow_duet")
            @ExcludeMissing
            fun _allowDuet(): JsonField<Boolean> = allowDuet

            /**
             * Returns the raw JSON value of [allowStitch].
             *
             * Unlike [allowStitch], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("allow_stitch")
            @ExcludeMissing
            fun _allowStitch(): JsonField<Boolean> = allowStitch

            /**
             * Returns the raw JSON value of [autoAddMusic].
             *
             * Unlike [autoAddMusic], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("auto_add_music")
            @ExcludeMissing
            fun _autoAddMusic(): JsonField<Boolean> = autoAddMusic

            /**
             * Returns the raw JSON value of [boardIds].
             *
             * Unlike [boardIds], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("board_ids")
            @ExcludeMissing
            fun _boardIds(): JsonField<List<String>> = boardIds

            /**
             * Returns the raw JSON value of [collaborators].
             *
             * Unlike [collaborators], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("collaborators")
            @ExcludeMissing
            fun _collaborators(): JsonField<List<List<JsonValue>>> = collaborators

            /**
             * Returns the raw JSON value of [communityId].
             *
             * Unlike [communityId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("community_id")
            @ExcludeMissing
            fun _communityId(): JsonField<String> = communityId

            /**
             * Returns the raw JSON value of [discloseBrandedContent].
             *
             * Unlike [discloseBrandedContent], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("disclose_branded_content")
            @ExcludeMissing
            fun _discloseBrandedContent(): JsonField<Boolean> = discloseBrandedContent

            /**
             * Returns the raw JSON value of [discloseYourBrand].
             *
             * Unlike [discloseYourBrand], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("disclose_your_brand")
            @ExcludeMissing
            fun _discloseYourBrand(): JsonField<Boolean> = discloseYourBrand

            /**
             * Returns the raw JSON value of [isAiGenerated].
             *
             * Unlike [isAiGenerated], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("is_ai_generated")
            @ExcludeMissing
            fun _isAiGenerated(): JsonField<Boolean> = isAiGenerated

            /**
             * Returns the raw JSON value of [isDraft].
             *
             * Unlike [isDraft], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("is_draft") @ExcludeMissing fun _isDraft(): JsonField<Boolean> = isDraft

            /**
             * Returns the raw JSON value of [link].
             *
             * Unlike [link], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("link") @ExcludeMissing fun _link(): JsonField<String> = link

            /**
             * Returns the raw JSON value of [location].
             *
             * Unlike [location], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<String> = location

            /**
             * Returns the raw JSON value of [madeForKids].
             *
             * Unlike [madeForKids], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("made_for_kids")
            @ExcludeMissing
            fun _madeForKids(): JsonField<Boolean> = madeForKids

            /**
             * Returns the raw JSON value of [media].
             *
             * Unlike [media], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("media") @ExcludeMissing fun _media(): JsonField<List<String>> = media

            /**
             * Returns the raw JSON value of [placement].
             *
             * Unlike [placement], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("placement")
            @ExcludeMissing
            fun _placement(): JsonField<Placement> = placement

            /**
             * Returns the raw JSON value of [poll].
             *
             * Unlike [poll], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("poll") @ExcludeMissing fun _poll(): JsonField<Poll> = poll

            /**
             * Returns the raw JSON value of [privacyStatus].
             *
             * Unlike [privacyStatus], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("privacy_status")
            @ExcludeMissing
            fun _privacyStatus(): JsonField<PrivacyStatus> = privacyStatus

            /**
             * Returns the raw JSON value of [quoteTweetId].
             *
             * Unlike [quoteTweetId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quote_tweet_id")
            @ExcludeMissing
            fun _quoteTweetId(): JsonField<String> = quoteTweetId

            /**
             * Returns the raw JSON value of [replySettings].
             *
             * Unlike [replySettings], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reply_settings")
            @ExcludeMissing
            fun _replySettings(): JsonField<ReplySettings> = replySettings

            /**
             * Returns the raw JSON value of [shareToFeed].
             *
             * Unlike [shareToFeed], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("share_to_feed")
            @ExcludeMissing
            fun _shareToFeed(): JsonField<Boolean> = shareToFeed

            /**
             * Returns the raw JSON value of [title].
             *
             * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

                /** Returns a mutable builder for constructing an instance of [Configuration]. */
                fun builder() = Builder()
            }

            /** A builder for [Configuration]. */
            class Builder internal constructor() {

                private var allowComment: JsonField<Boolean> = JsonMissing.of()
                private var allowDuet: JsonField<Boolean> = JsonMissing.of()
                private var allowStitch: JsonField<Boolean> = JsonMissing.of()
                private var autoAddMusic: JsonField<Boolean> = JsonMissing.of()
                private var boardIds: JsonField<MutableList<String>>? = null
                private var caption: JsonValue = JsonMissing.of()
                private var collaborators: JsonField<MutableList<List<JsonValue>>>? = null
                private var communityId: JsonField<String> = JsonMissing.of()
                private var discloseBrandedContent: JsonField<Boolean> = JsonMissing.of()
                private var discloseYourBrand: JsonField<Boolean> = JsonMissing.of()
                private var isAiGenerated: JsonField<Boolean> = JsonMissing.of()
                private var isDraft: JsonField<Boolean> = JsonMissing.of()
                private var link: JsonField<String> = JsonMissing.of()
                private var location: JsonField<String> = JsonMissing.of()
                private var madeForKids: JsonField<Boolean> = JsonMissing.of()
                private var media: JsonField<MutableList<String>>? = null
                private var placement: JsonField<Placement> = JsonMissing.of()
                private var poll: JsonField<Poll> = JsonMissing.of()
                private var privacyStatus: JsonField<PrivacyStatus> = JsonMissing.of()
                private var quoteTweetId: JsonField<String> = JsonMissing.of()
                private var replySettings: JsonField<ReplySettings> = JsonMissing.of()
                private var shareToFeed: JsonField<Boolean> = JsonMissing.of()
                private var title: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(configuration: Configuration) = apply {
                    allowComment = configuration.allowComment
                    allowDuet = configuration.allowDuet
                    allowStitch = configuration.allowStitch
                    autoAddMusic = configuration.autoAddMusic
                    boardIds = configuration.boardIds.map { it.toMutableList() }
                    caption = configuration.caption
                    collaborators = configuration.collaborators.map { it.toMutableList() }
                    communityId = configuration.communityId
                    discloseBrandedContent = configuration.discloseBrandedContent
                    discloseYourBrand = configuration.discloseYourBrand
                    isAiGenerated = configuration.isAiGenerated
                    isDraft = configuration.isDraft
                    link = configuration.link
                    location = configuration.location
                    madeForKids = configuration.madeForKids
                    media = configuration.media.map { it.toMutableList() }
                    placement = configuration.placement
                    poll = configuration.poll
                    privacyStatus = configuration.privacyStatus
                    quoteTweetId = configuration.quoteTweetId
                    replySettings = configuration.replySettings
                    shareToFeed = configuration.shareToFeed
                    title = configuration.title
                    additionalProperties = configuration.additionalProperties.toMutableMap()
                }

                /** Allow comments on TikTok */
                fun allowComment(allowComment: Boolean?) =
                    allowComment(JsonField.ofNullable(allowComment))

                /**
                 * Alias for [Builder.allowComment].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun allowComment(allowComment: Boolean) = allowComment(allowComment as Boolean?)

                /**
                 * Sets [Builder.allowComment] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowComment] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun allowComment(allowComment: JsonField<Boolean>) = apply {
                    this.allowComment = allowComment
                }

                /** Allow duets on TikTok */
                fun allowDuet(allowDuet: Boolean?) = allowDuet(JsonField.ofNullable(allowDuet))

                /**
                 * Alias for [Builder.allowDuet].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun allowDuet(allowDuet: Boolean) = allowDuet(allowDuet as Boolean?)

                /**
                 * Sets [Builder.allowDuet] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowDuet] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun allowDuet(allowDuet: JsonField<Boolean>) = apply { this.allowDuet = allowDuet }

                /** Allow stitch on TikTok */
                fun allowStitch(allowStitch: Boolean?) =
                    allowStitch(JsonField.ofNullable(allowStitch))

                /**
                 * Alias for [Builder.allowStitch].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun allowStitch(allowStitch: Boolean) = allowStitch(allowStitch as Boolean?)

                /**
                 * Sets [Builder.allowStitch] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowStitch] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun allowStitch(allowStitch: JsonField<Boolean>) = apply {
                    this.allowStitch = allowStitch
                }

                /** Will automatically add music to photo posts on TikTok */
                fun autoAddMusic(autoAddMusic: Boolean?) =
                    autoAddMusic(JsonField.ofNullable(autoAddMusic))

                /**
                 * Alias for [Builder.autoAddMusic].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun autoAddMusic(autoAddMusic: Boolean) = autoAddMusic(autoAddMusic as Boolean?)

                /**
                 * Sets [Builder.autoAddMusic] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.autoAddMusic] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun autoAddMusic(autoAddMusic: JsonField<Boolean>) = apply {
                    this.autoAddMusic = autoAddMusic
                }

                /** Pinterest board IDs */
                fun boardIds(boardIds: List<String>?) = boardIds(JsonField.ofNullable(boardIds))

                /**
                 * Sets [Builder.boardIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.boardIds] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun boardIds(boardIds: JsonField<List<String>>) = apply {
                    this.boardIds = boardIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [boardIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addBoardId(boardId: String) = apply {
                    boardIds =
                        (boardIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("boardIds", it).add(boardId)
                        }
                }

                /** Overrides the `caption` from the post */
                fun caption(caption: JsonValue) = apply { this.caption = caption }

                /**
                 * List of page ids or users to invite as collaborators for a Video Reel (Instagram
                 * and Facebook)
                 */
                fun collaborators(collaborators: List<List<JsonValue>>?) =
                    collaborators(JsonField.ofNullable(collaborators))

                /**
                 * Sets [Builder.collaborators] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.collaborators] with a well-typed
                 * `List<List<JsonValue>>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun collaborators(collaborators: JsonField<List<List<JsonValue>>>) = apply {
                    this.collaborators = collaborators.map { it.toMutableList() }
                }

                /**
                 * Adds a single [List<JsonValue>] to [collaborators].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCollaborator(collaborator: List<JsonValue>) = apply {
                    collaborators =
                        (collaborators ?: JsonField.of(mutableListOf())).also {
                            checkKnown("collaborators", it).add(collaborator)
                        }
                }

                /** Id of the twitter community to post to */
                fun communityId(communityId: String) = communityId(JsonField.of(communityId))

                /**
                 * Sets [Builder.communityId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.communityId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun communityId(communityId: JsonField<String>) = apply {
                    this.communityId = communityId
                }

                /** Disclose branded content on TikTok */
                fun discloseBrandedContent(discloseBrandedContent: Boolean?) =
                    discloseBrandedContent(JsonField.ofNullable(discloseBrandedContent))

                /**
                 * Alias for [Builder.discloseBrandedContent].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun discloseBrandedContent(discloseBrandedContent: Boolean) =
                    discloseBrandedContent(discloseBrandedContent as Boolean?)

                /**
                 * Sets [Builder.discloseBrandedContent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.discloseBrandedContent] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun discloseBrandedContent(discloseBrandedContent: JsonField<Boolean>) = apply {
                    this.discloseBrandedContent = discloseBrandedContent
                }

                /** Disclose your brand on TikTok */
                fun discloseYourBrand(discloseYourBrand: Boolean?) =
                    discloseYourBrand(JsonField.ofNullable(discloseYourBrand))

                /**
                 * Alias for [Builder.discloseYourBrand].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun discloseYourBrand(discloseYourBrand: Boolean) =
                    discloseYourBrand(discloseYourBrand as Boolean?)

                /**
                 * Sets [Builder.discloseYourBrand] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.discloseYourBrand] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun discloseYourBrand(discloseYourBrand: JsonField<Boolean>) = apply {
                    this.discloseYourBrand = discloseYourBrand
                }

                /** Flag content as AI generated on TikTok */
                fun isAiGenerated(isAiGenerated: Boolean?) =
                    isAiGenerated(JsonField.ofNullable(isAiGenerated))

                /**
                 * Alias for [Builder.isAiGenerated].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun isAiGenerated(isAiGenerated: Boolean) = isAiGenerated(isAiGenerated as Boolean?)

                /**
                 * Sets [Builder.isAiGenerated] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isAiGenerated] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isAiGenerated(isAiGenerated: JsonField<Boolean>) = apply {
                    this.isAiGenerated = isAiGenerated
                }

                /**
                 * Will create a draft upload to TikTok, posting will need to be completed from
                 * within the app
                 */
                fun isDraft(isDraft: Boolean?) = isDraft(JsonField.ofNullable(isDraft))

                /**
                 * Alias for [Builder.isDraft].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun isDraft(isDraft: Boolean) = isDraft(isDraft as Boolean?)

                /**
                 * Sets [Builder.isDraft] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isDraft] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isDraft(isDraft: JsonField<Boolean>) = apply { this.isDraft = isDraft }

                /** Pinterest post link */
                fun link(link: String?) = link(JsonField.ofNullable(link))

                /**
                 * Sets [Builder.link] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.link] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun link(link: JsonField<String>) = apply { this.link = link }

                /**
                 * Page id with a location that you want to tag the image or video with (Instagram
                 * and Facebook)
                 */
                fun location(location: String?) = location(JsonField.ofNullable(location))

                /**
                 * Sets [Builder.location] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.location] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun location(location: JsonField<String>) = apply { this.location = location }

                /** If true will notify YouTube the video is intended for kids, defaults to false */
                fun madeForKids(madeForKids: Boolean?) =
                    madeForKids(JsonField.ofNullable(madeForKids))

                /**
                 * Alias for [Builder.madeForKids].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun madeForKids(madeForKids: Boolean) = madeForKids(madeForKids as Boolean?)

                /**
                 * Sets [Builder.madeForKids] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.madeForKids] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun madeForKids(madeForKids: JsonField<Boolean>) = apply {
                    this.madeForKids = madeForKids
                }

                /** Overrides the `media` from the post */
                fun media(media: List<String>?) = media(JsonField.ofNullable(media))

                /**
                 * Sets [Builder.media] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.media] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun media(media: JsonField<List<String>>) = apply {
                    this.media = media.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.media].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMedia(media: String) = apply {
                    this.media =
                        (this.media ?: JsonField.of(mutableListOf())).also {
                            checkKnown("media", it).add(media)
                        }
                }

                /** Post placement for Facebook/Instagram/Threads */
                fun placement(placement: Placement?) = placement(JsonField.ofNullable(placement))

                /**
                 * Sets [Builder.placement] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.placement] with a well-typed [Placement] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun placement(placement: JsonField<Placement>) = apply {
                    this.placement = placement
                }

                /** Poll options for the twitter */
                fun poll(poll: Poll) = poll(JsonField.of(poll))

                /**
                 * Sets [Builder.poll] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.poll] with a well-typed [Poll] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun poll(poll: JsonField<Poll>) = apply { this.poll = poll }

                /**
                 * Sets the privacy status for TikTok (private, public), or YouTube (private,
                 * public, unlisted)
                 */
                fun privacyStatus(privacyStatus: PrivacyStatus?) =
                    privacyStatus(JsonField.ofNullable(privacyStatus))

                /**
                 * Sets [Builder.privacyStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.privacyStatus] with a well-typed [PrivacyStatus]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun privacyStatus(privacyStatus: JsonField<PrivacyStatus>) = apply {
                    this.privacyStatus = privacyStatus
                }

                /** Id of the tweet you want to quote */
                fun quoteTweetId(quoteTweetId: String) = quoteTweetId(JsonField.of(quoteTweetId))

                /**
                 * Sets [Builder.quoteTweetId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quoteTweetId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quoteTweetId(quoteTweetId: JsonField<String>) = apply {
                    this.quoteTweetId = quoteTweetId
                }

                /** Who can reply to the tweet */
                fun replySettings(replySettings: ReplySettings?) =
                    replySettings(JsonField.ofNullable(replySettings))

                /**
                 * Sets [Builder.replySettings] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.replySettings] with a well-typed [ReplySettings]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun replySettings(replySettings: JsonField<ReplySettings>) = apply {
                    this.replySettings = replySettings
                }

                /** If false Instagram video posts will only be shown in the Reels tab */
                fun shareToFeed(shareToFeed: Boolean?) =
                    shareToFeed(JsonField.ofNullable(shareToFeed))

                /**
                 * Alias for [Builder.shareToFeed].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun shareToFeed(shareToFeed: Boolean) = shareToFeed(shareToFeed as Boolean?)

                /**
                 * Sets [Builder.shareToFeed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shareToFeed] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun shareToFeed(shareToFeed: JsonField<Boolean>) = apply {
                    this.shareToFeed = shareToFeed
                }

                /** Overrides the `title` from the post */
                fun title(title: String?) = title(JsonField.ofNullable(title))

                /**
                 * Sets [Builder.title] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.title] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun title(title: JsonField<String>) = apply { this.title = title }

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
                 * Returns an immutable instance of [Configuration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Configuration =
                    Configuration(
                        allowComment,
                        allowDuet,
                        allowStitch,
                        autoAddMusic,
                        (boardIds ?: JsonMissing.of()).map { it.toImmutable() },
                        caption,
                        (collaborators ?: JsonMissing.of()).map { it.toImmutable() },
                        communityId,
                        discloseBrandedContent,
                        discloseYourBrand,
                        isAiGenerated,
                        isDraft,
                        link,
                        location,
                        madeForKids,
                        (media ?: JsonMissing.of()).map { it.toImmutable() },
                        placement,
                        poll,
                        privacyStatus,
                        quoteTweetId,
                        replySettings,
                        shareToFeed,
                        title,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Configuration = apply {
                if (validated) {
                    return@apply
                }

                allowComment()
                allowDuet()
                allowStitch()
                autoAddMusic()
                boardIds()
                collaborators()
                communityId()
                discloseBrandedContent()
                discloseYourBrand()
                isAiGenerated()
                isDraft()
                link()
                location()
                madeForKids()
                media()
                placement()?.validate()
                poll()?.validate()
                privacyStatus()?.validate()
                quoteTweetId()
                replySettings()?.validate()
                shareToFeed()
                title()
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
                (if (allowComment.asKnown() == null) 0 else 1) +
                    (if (allowDuet.asKnown() == null) 0 else 1) +
                    (if (allowStitch.asKnown() == null) 0 else 1) +
                    (if (autoAddMusic.asKnown() == null) 0 else 1) +
                    (boardIds.asKnown()?.size ?: 0) +
                    (collaborators.asKnown()?.sumOf { it.size.toInt() } ?: 0) +
                    (if (communityId.asKnown() == null) 0 else 1) +
                    (if (discloseBrandedContent.asKnown() == null) 0 else 1) +
                    (if (discloseYourBrand.asKnown() == null) 0 else 1) +
                    (if (isAiGenerated.asKnown() == null) 0 else 1) +
                    (if (isDraft.asKnown() == null) 0 else 1) +
                    (if (link.asKnown() == null) 0 else 1) +
                    (if (location.asKnown() == null) 0 else 1) +
                    (if (madeForKids.asKnown() == null) 0 else 1) +
                    (media.asKnown()?.size ?: 0) +
                    (placement.asKnown()?.validity() ?: 0) +
                    (poll.asKnown()?.validity() ?: 0) +
                    (privacyStatus.asKnown()?.validity() ?: 0) +
                    (if (quoteTweetId.asKnown() == null) 0 else 1) +
                    (replySettings.asKnown()?.validity() ?: 0) +
                    (if (shareToFeed.asKnown() == null) 0 else 1) +
                    (if (title.asKnown() == null) 0 else 1)

            /** Post placement for Facebook/Instagram/Threads */
            class Placement @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    val REELS = of("reels")

                    val TIMELINE = of("timeline")

                    val STORIES = of("stories")

                    fun of(value: String) = Placement(JsonField.of(value))
                }

                /** An enum containing [Placement]'s known values. */
                enum class Known {
                    REELS,
                    TIMELINE,
                    STORIES,
                }

                /**
                 * An enum containing [Placement]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Placement] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    REELS,
                    TIMELINE,
                    STORIES,
                    /**
                     * An enum member indicating that [Placement] was instantiated with an unknown
                     * value.
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
                        REELS -> Value.REELS
                        TIMELINE -> Value.TIMELINE
                        STORIES -> Value.STORIES
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
                        REELS -> Known.REELS
                        TIMELINE -> Known.TIMELINE
                        STORIES -> Known.STORIES
                        else -> throw PostForMeInvalidDataException("Unknown Placement: $value")
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

                fun validate(): Placement = apply {
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

                    return other is Placement && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Poll options for the twitter */
            class Poll
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val durationMinutes: JsonField<Double>,
                private val options: JsonField<List<String>>,
                private val replySettings: JsonField<ReplySettings>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("duration_minutes")
                    @ExcludeMissing
                    durationMinutes: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("options")
                    @ExcludeMissing
                    options: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("reply_settings")
                    @ExcludeMissing
                    replySettings: JsonField<ReplySettings> = JsonMissing.of(),
                ) : this(durationMinutes, options, replySettings, mutableMapOf())

                /**
                 * Duration of the poll in minutes
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun durationMinutes(): Double = durationMinutes.getRequired("duration_minutes")

                /**
                 * The choices of the poll, requiring 2-4 options
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun options(): List<String> = options.getRequired("options")

                /**
                 * Who can reply to the tweet
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun replySettings(): ReplySettings? = replySettings.getNullable("reply_settings")

                /**
                 * Returns the raw JSON value of [durationMinutes].
                 *
                 * Unlike [durationMinutes], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("duration_minutes")
                @ExcludeMissing
                fun _durationMinutes(): JsonField<Double> = durationMinutes

                /**
                 * Returns the raw JSON value of [options].
                 *
                 * Unlike [options], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("options")
                @ExcludeMissing
                fun _options(): JsonField<List<String>> = options

                /**
                 * Returns the raw JSON value of [replySettings].
                 *
                 * Unlike [replySettings], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("reply_settings")
                @ExcludeMissing
                fun _replySettings(): JsonField<ReplySettings> = replySettings

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
                     * Returns a mutable builder for constructing an instance of [Poll].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .durationMinutes()
                     * .options()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Poll]. */
                class Builder internal constructor() {

                    private var durationMinutes: JsonField<Double>? = null
                    private var options: JsonField<MutableList<String>>? = null
                    private var replySettings: JsonField<ReplySettings> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(poll: Poll) = apply {
                        durationMinutes = poll.durationMinutes
                        options = poll.options.map { it.toMutableList() }
                        replySettings = poll.replySettings
                        additionalProperties = poll.additionalProperties.toMutableMap()
                    }

                    /** Duration of the poll in minutes */
                    fun durationMinutes(durationMinutes: Double) =
                        durationMinutes(JsonField.of(durationMinutes))

                    /**
                     * Sets [Builder.durationMinutes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.durationMinutes] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun durationMinutes(durationMinutes: JsonField<Double>) = apply {
                        this.durationMinutes = durationMinutes
                    }

                    /** The choices of the poll, requiring 2-4 options */
                    fun options(options: List<String>) = options(JsonField.of(options))

                    /**
                     * Sets [Builder.options] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.options] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun options(options: JsonField<List<String>>) = apply {
                        this.options = options.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [options].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addOption(option: String) = apply {
                        options =
                            (options ?: JsonField.of(mutableListOf())).also {
                                checkKnown("options", it).add(option)
                            }
                    }

                    /** Who can reply to the tweet */
                    fun replySettings(replySettings: ReplySettings) =
                        replySettings(JsonField.of(replySettings))

                    /**
                     * Sets [Builder.replySettings] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.replySettings] with a well-typed
                     * [ReplySettings] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun replySettings(replySettings: JsonField<ReplySettings>) = apply {
                        this.replySettings = replySettings
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
                     * Returns an immutable instance of [Poll].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .durationMinutes()
                     * .options()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Poll =
                        Poll(
                            checkRequired("durationMinutes", durationMinutes),
                            checkRequired("options", options).map { it.toImmutable() },
                            replySettings,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Poll = apply {
                    if (validated) {
                        return@apply
                    }

                    durationMinutes()
                    options()
                    replySettings()?.validate()
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
                    (if (durationMinutes.asKnown() == null) 0 else 1) +
                        (options.asKnown()?.size ?: 0) +
                        (replySettings.asKnown()?.validity() ?: 0)

                /** Who can reply to the tweet */
                class ReplySettings
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val FOLLOWING = of("following")

                        val MENTIONED_USERS = of("mentionedUsers")

                        val SUBSCRIBERS = of("subscribers")

                        val VERIFIED = of("verified")

                        fun of(value: String) = ReplySettings(JsonField.of(value))
                    }

                    /** An enum containing [ReplySettings]'s known values. */
                    enum class Known {
                        FOLLOWING,
                        MENTIONED_USERS,
                        SUBSCRIBERS,
                        VERIFIED,
                    }

                    /**
                     * An enum containing [ReplySettings]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [ReplySettings] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        FOLLOWING,
                        MENTIONED_USERS,
                        SUBSCRIBERS,
                        VERIFIED,
                        /**
                         * An enum member indicating that [ReplySettings] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            FOLLOWING -> Value.FOLLOWING
                            MENTIONED_USERS -> Value.MENTIONED_USERS
                            SUBSCRIBERS -> Value.SUBSCRIBERS
                            VERIFIED -> Value.VERIFIED
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws PostForMeInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            FOLLOWING -> Known.FOLLOWING
                            MENTIONED_USERS -> Known.MENTIONED_USERS
                            SUBSCRIBERS -> Known.SUBSCRIBERS
                            VERIFIED -> Known.VERIFIED
                            else ->
                                throw PostForMeInvalidDataException("Unknown ReplySettings: $value")
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

                    fun validate(): ReplySettings = apply {
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

                        return other is ReplySettings && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Poll &&
                        durationMinutes == other.durationMinutes &&
                        options == other.options &&
                        replySettings == other.replySettings &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(durationMinutes, options, replySettings, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Poll{durationMinutes=$durationMinutes, options=$options, replySettings=$replySettings, additionalProperties=$additionalProperties}"
            }

            /**
             * Sets the privacy status for TikTok (private, public), or YouTube (private, public,
             * unlisted)
             */
            class PrivacyStatus
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

                    val PUBLIC = of("public")

                    val PRIVATE = of("private")

                    val UNLISTED = of("unlisted")

                    fun of(value: String) = PrivacyStatus(JsonField.of(value))
                }

                /** An enum containing [PrivacyStatus]'s known values. */
                enum class Known {
                    PUBLIC,
                    PRIVATE,
                    UNLISTED,
                }

                /**
                 * An enum containing [PrivacyStatus]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [PrivacyStatus] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PUBLIC,
                    PRIVATE,
                    UNLISTED,
                    /**
                     * An enum member indicating that [PrivacyStatus] was instantiated with an
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
                        PUBLIC -> Value.PUBLIC
                        PRIVATE -> Value.PRIVATE
                        UNLISTED -> Value.UNLISTED
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
                        PUBLIC -> Known.PUBLIC
                        PRIVATE -> Known.PRIVATE
                        UNLISTED -> Known.UNLISTED
                        else -> throw PostForMeInvalidDataException("Unknown PrivacyStatus: $value")
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

                fun validate(): PrivacyStatus = apply {
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

                    return other is PrivacyStatus && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Who can reply to the tweet */
            class ReplySettings
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

                    val FOLLOWING = of("following")

                    val MENTIONED_USERS = of("mentionedUsers")

                    val SUBSCRIBERS = of("subscribers")

                    val VERIFIED = of("verified")

                    fun of(value: String) = ReplySettings(JsonField.of(value))
                }

                /** An enum containing [ReplySettings]'s known values. */
                enum class Known {
                    FOLLOWING,
                    MENTIONED_USERS,
                    SUBSCRIBERS,
                    VERIFIED,
                }

                /**
                 * An enum containing [ReplySettings]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ReplySettings] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FOLLOWING,
                    MENTIONED_USERS,
                    SUBSCRIBERS,
                    VERIFIED,
                    /**
                     * An enum member indicating that [ReplySettings] was instantiated with an
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
                        FOLLOWING -> Value.FOLLOWING
                        MENTIONED_USERS -> Value.MENTIONED_USERS
                        SUBSCRIBERS -> Value.SUBSCRIBERS
                        VERIFIED -> Value.VERIFIED
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
                        FOLLOWING -> Known.FOLLOWING
                        MENTIONED_USERS -> Known.MENTIONED_USERS
                        SUBSCRIBERS -> Known.SUBSCRIBERS
                        VERIFIED -> Known.VERIFIED
                        else -> throw PostForMeInvalidDataException("Unknown ReplySettings: $value")
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

                fun validate(): ReplySettings = apply {
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

                    return other is ReplySettings && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Configuration &&
                    allowComment == other.allowComment &&
                    allowDuet == other.allowDuet &&
                    allowStitch == other.allowStitch &&
                    autoAddMusic == other.autoAddMusic &&
                    boardIds == other.boardIds &&
                    caption == other.caption &&
                    collaborators == other.collaborators &&
                    communityId == other.communityId &&
                    discloseBrandedContent == other.discloseBrandedContent &&
                    discloseYourBrand == other.discloseYourBrand &&
                    isAiGenerated == other.isAiGenerated &&
                    isDraft == other.isDraft &&
                    link == other.link &&
                    location == other.location &&
                    madeForKids == other.madeForKids &&
                    media == other.media &&
                    placement == other.placement &&
                    poll == other.poll &&
                    privacyStatus == other.privacyStatus &&
                    quoteTweetId == other.quoteTweetId &&
                    replySettings == other.replySettings &&
                    shareToFeed == other.shareToFeed &&
                    title == other.title &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    allowComment,
                    allowDuet,
                    allowStitch,
                    autoAddMusic,
                    boardIds,
                    caption,
                    collaborators,
                    communityId,
                    discloseBrandedContent,
                    discloseYourBrand,
                    isAiGenerated,
                    isDraft,
                    link,
                    location,
                    madeForKids,
                    media,
                    placement,
                    poll,
                    privacyStatus,
                    quoteTweetId,
                    replySettings,
                    shareToFeed,
                    title,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Configuration{allowComment=$allowComment, allowDuet=$allowDuet, allowStitch=$allowStitch, autoAddMusic=$autoAddMusic, boardIds=$boardIds, caption=$caption, collaborators=$collaborators, communityId=$communityId, discloseBrandedContent=$discloseBrandedContent, discloseYourBrand=$discloseYourBrand, isAiGenerated=$isAiGenerated, isDraft=$isDraft, link=$link, location=$location, madeForKids=$madeForKids, media=$media, placement=$placement, poll=$poll, privacyStatus=$privacyStatus, quoteTweetId=$quoteTweetId, replySettings=$replySettings, shareToFeed=$shareToFeed, title=$title, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountConfiguration &&
                configuration == other.configuration &&
                socialAccountId == other.socialAccountId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(configuration, socialAccountId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountConfiguration{configuration=$configuration, socialAccountId=$socialAccountId, additionalProperties=$additionalProperties}"
    }

    class Media
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val url: JsonField<String>,
        private val tags: JsonField<List<Tag>>,
        private val thumbnailTimestampMs: JsonValue,
        private val thumbnailUrl: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<Tag>> = JsonMissing.of(),
            @JsonProperty("thumbnail_timestamp_ms")
            @ExcludeMissing
            thumbnailTimestampMs: JsonValue = JsonMissing.of(),
            @JsonProperty("thumbnail_url")
            @ExcludeMissing
            thumbnailUrl: JsonValue = JsonMissing.of(),
        ) : this(url, tags, thumbnailTimestampMs, thumbnailUrl, mutableMapOf())

        /**
         * Public URL of the media
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * List of tags to attach to the media
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tags(): List<Tag>? = tags.getNullable("tags")

        /** Timestamp in milliseconds of frame to use as thumbnail for the media */
        @JsonProperty("thumbnail_timestamp_ms")
        @ExcludeMissing
        fun _thumbnailTimestampMs(): JsonValue = thumbnailTimestampMs

        /** Public URL of the thumbnail for the media */
        @JsonProperty("thumbnail_url") @ExcludeMissing fun _thumbnailUrl(): JsonValue = thumbnailUrl

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<Tag>> = tags

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
             * Returns a mutable builder for constructing an instance of [Media].
             *
             * The following fields are required:
             * ```kotlin
             * .url()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Media]. */
        class Builder internal constructor() {

            private var url: JsonField<String>? = null
            private var tags: JsonField<MutableList<Tag>>? = null
            private var thumbnailTimestampMs: JsonValue = JsonMissing.of()
            private var thumbnailUrl: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(media: Media) = apply {
                url = media.url
                tags = media.tags.map { it.toMutableList() }
                thumbnailTimestampMs = media.thumbnailTimestampMs
                thumbnailUrl = media.thumbnailUrl
                additionalProperties = media.additionalProperties.toMutableMap()
            }

            /** Public URL of the media */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /** List of tags to attach to the media */
            fun tags(tags: List<Tag>?) = tags(JsonField.ofNullable(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<Tag>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<Tag>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [Tag] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: Tag) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            /** Timestamp in milliseconds of frame to use as thumbnail for the media */
            fun thumbnailTimestampMs(thumbnailTimestampMs: JsonValue) = apply {
                this.thumbnailTimestampMs = thumbnailTimestampMs
            }

            /** Public URL of the thumbnail for the media */
            fun thumbnailUrl(thumbnailUrl: JsonValue) = apply { this.thumbnailUrl = thumbnailUrl }

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
             * Returns an immutable instance of [Media].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Media =
                Media(
                    checkRequired("url", url),
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    thumbnailTimestampMs,
                    thumbnailUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Media = apply {
            if (validated) {
                return@apply
            }

            url()
            tags()?.forEach { it.validate() }
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
            (if (url.asKnown() == null) 0 else 1) +
                (tags.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        class Tag
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val platform: JsonField<Platform>,
            private val type: JsonField<Type>,
            private val x: JsonField<Double>,
            private val y: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("platform")
                @ExcludeMissing
                platform: JsonField<Platform> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("x") @ExcludeMissing x: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("y") @ExcludeMissing y: JsonField<Double> = JsonMissing.of(),
            ) : this(id, platform, type, x, y, mutableMapOf())

            /**
             * Facebook User ID, Instagram Username or Instagram product id to tag
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * The platform for the tags
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun platform(): Platform = platform.getRequired("platform")

            /**
             * The type of tag, user to tag accounts, product to tag products (only supported for
             * instagram)
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Percentage distance from left edge of the image, Not required for videos or stories
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun x(): Double? = x.getNullable("x")

            /**
             * Percentage distance from top edge of the image, Not required for videos or stories
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun y(): Double? = y.getNullable("y")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [platform].
             *
             * Unlike [platform], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("platform")
            @ExcludeMissing
            fun _platform(): JsonField<Platform> = platform

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [x].
             *
             * Unlike [x], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("x") @ExcludeMissing fun _x(): JsonField<Double> = x

            /**
             * Returns the raw JSON value of [y].
             *
             * Unlike [y], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("y") @ExcludeMissing fun _y(): JsonField<Double> = y

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
                 * Returns a mutable builder for constructing an instance of [Tag].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .platform()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Tag]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var platform: JsonField<Platform>? = null
                private var type: JsonField<Type>? = null
                private var x: JsonField<Double> = JsonMissing.of()
                private var y: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tag: Tag) = apply {
                    id = tag.id
                    platform = tag.platform
                    type = tag.type
                    x = tag.x
                    y = tag.y
                    additionalProperties = tag.additionalProperties.toMutableMap()
                }

                /** Facebook User ID, Instagram Username or Instagram product id to tag */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The platform for the tags */
                fun platform(platform: Platform) = platform(JsonField.of(platform))

                /**
                 * Sets [Builder.platform] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.platform] with a well-typed [Platform] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun platform(platform: JsonField<Platform>) = apply { this.platform = platform }

                /**
                 * The type of tag, user to tag accounts, product to tag products (only supported
                 * for instagram)
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * Percentage distance from left edge of the image, Not required for videos or
                 * stories
                 */
                fun x(x: Double) = x(JsonField.of(x))

                /**
                 * Sets [Builder.x] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.x] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun x(x: JsonField<Double>) = apply { this.x = x }

                /**
                 * Percentage distance from top edge of the image, Not required for videos or
                 * stories
                 */
                fun y(y: Double) = y(JsonField.of(y))

                /**
                 * Sets [Builder.y] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.y] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun y(y: JsonField<Double>) = apply { this.y = y }

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
                 * Returns an immutable instance of [Tag].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .platform()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Tag =
                    Tag(
                        checkRequired("id", id),
                        checkRequired("platform", platform),
                        checkRequired("type", type),
                        x,
                        y,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Tag = apply {
                if (validated) {
                    return@apply
                }

                id()
                platform().validate()
                type().validate()
                x()
                y()
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
                (if (id.asKnown() == null) 0 else 1) +
                    (platform.asKnown()?.validity() ?: 0) +
                    (type.asKnown()?.validity() ?: 0) +
                    (if (x.asKnown() == null) 0 else 1) +
                    (if (y.asKnown() == null) 0 else 1)

            /** The platform for the tags */
            class Platform @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    val FACEBOOK = of("facebook")

                    val INSTAGRAM = of("instagram")

                    fun of(value: String) = Platform(JsonField.of(value))
                }

                /** An enum containing [Platform]'s known values. */
                enum class Known {
                    FACEBOOK,
                    INSTAGRAM,
                }

                /**
                 * An enum containing [Platform]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Platform] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FACEBOOK,
                    INSTAGRAM,
                    /**
                     * An enum member indicating that [Platform] was instantiated with an unknown
                     * value.
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
                        FACEBOOK -> Value.FACEBOOK
                        INSTAGRAM -> Value.INSTAGRAM
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
                        FACEBOOK -> Known.FACEBOOK
                        INSTAGRAM -> Known.INSTAGRAM
                        else -> throw PostForMeInvalidDataException("Unknown Platform: $value")
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

            /**
             * The type of tag, user to tag accounts, product to tag products (only supported for
             * instagram)
             */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    val USER = of("user")

                    val PRODUCT = of("product")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    USER,
                    PRODUCT,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    USER,
                    PRODUCT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        USER -> Value.USER
                        PRODUCT -> Value.PRODUCT
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
                        USER -> Known.USER
                        PRODUCT -> Known.PRODUCT
                        else -> throw PostForMeInvalidDataException("Unknown Type: $value")
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

                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tag &&
                    id == other.id &&
                    platform == other.platform &&
                    type == other.type &&
                    x == other.x &&
                    y == other.y &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, platform, type, x, y, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tag{id=$id, platform=$platform, type=$type, x=$x, y=$y, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Media &&
                url == other.url &&
                tags == other.tags &&
                thumbnailTimestampMs == other.thumbnailTimestampMs &&
                thumbnailUrl == other.thumbnailUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(url, tags, thumbnailTimestampMs, thumbnailUrl, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Media{url=$url, tags=$tags, thumbnailTimestampMs=$thumbnailTimestampMs, thumbnailUrl=$thumbnailUrl, additionalProperties=$additionalProperties}"
    }

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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SocialPost &&
            id == other.id &&
            accountConfigurations == other.accountConfigurations &&
            caption == other.caption &&
            createdAt == other.createdAt &&
            externalId == other.externalId &&
            media == other.media &&
            platformConfigurations == other.platformConfigurations &&
            scheduledAt == other.scheduledAt &&
            socialAccounts == other.socialAccounts &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
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
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SocialPost{id=$id, accountConfigurations=$accountConfigurations, caption=$caption, createdAt=$createdAt, externalId=$externalId, media=$media, platformConfigurations=$platformConfigurations, scheduledAt=$scheduledAt, socialAccounts=$socialAccounts, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
