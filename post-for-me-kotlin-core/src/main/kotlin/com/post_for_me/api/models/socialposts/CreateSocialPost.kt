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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class CreateSocialPost
private constructor(
    private val caption: JsonField<String>,
    private val socialAccounts: JsonField<List<String>>,
    private val accountConfigurations: JsonField<List<AccountConfiguration>>,
    private val externalId: JsonField<String>,
    private val isDraft: JsonField<Boolean>,
    private val media: JsonField<List<Media>>,
    private val platformConfigurations: JsonField<PlatformConfigurations>,
    private val scheduledAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("caption") @ExcludeMissing caption: JsonField<String> = JsonMissing.of(),
        @JsonProperty("social_accounts")
        @ExcludeMissing
        socialAccounts: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("account_configurations")
        @ExcludeMissing
        accountConfigurations: JsonField<List<AccountConfiguration>> = JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isDraft") @ExcludeMissing isDraft: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("media") @ExcludeMissing media: JsonField<List<Media>> = JsonMissing.of(),
        @JsonProperty("platform_configurations")
        @ExcludeMissing
        platformConfigurations: JsonField<PlatformConfigurations> = JsonMissing.of(),
        @JsonProperty("scheduled_at")
        @ExcludeMissing
        scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        caption,
        socialAccounts,
        accountConfigurations,
        externalId,
        isDraft,
        media,
        platformConfigurations,
        scheduledAt,
        mutableMapOf(),
    )

    /**
     * Caption text for the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun caption(): String = caption.getRequired("caption")

    /**
     * Array of social account IDs for posting
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun socialAccounts(): List<String> = socialAccounts.getRequired("social_accounts")

    /**
     * Account-specific configurations for the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountConfigurations(): List<AccountConfiguration>? =
        accountConfigurations.getNullable("account_configurations")

    /**
     * Array of social account IDs for posting
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): String? = externalId.getNullable("external_id")

    /**
     * If isDraft is set then the post will not be processed
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isDraft(): Boolean? = isDraft.getNullable("isDraft")

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
    fun platformConfigurations(): PlatformConfigurations? =
        platformConfigurations.getNullable("platform_configurations")

    /**
     * Scheduled date and time for the post, setting to null or undefined will post instantly
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduledAt(): OffsetDateTime? = scheduledAt.getNullable("scheduled_at")

    /**
     * Returns the raw JSON value of [caption].
     *
     * Unlike [caption], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonField<String> = caption

    /**
     * Returns the raw JSON value of [socialAccounts].
     *
     * Unlike [socialAccounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("social_accounts")
    @ExcludeMissing
    fun _socialAccounts(): JsonField<List<String>> = socialAccounts

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
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [isDraft].
     *
     * Unlike [isDraft], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isDraft") @ExcludeMissing fun _isDraft(): JsonField<Boolean> = isDraft

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
    fun _platformConfigurations(): JsonField<PlatformConfigurations> = platformConfigurations

    /**
     * Returns the raw JSON value of [scheduledAt].
     *
     * Unlike [scheduledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scheduled_at")
    @ExcludeMissing
    fun _scheduledAt(): JsonField<OffsetDateTime> = scheduledAt

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
         * Returns a mutable builder for constructing an instance of [CreateSocialPost].
         *
         * The following fields are required:
         * ```kotlin
         * .caption()
         * .socialAccounts()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CreateSocialPost]. */
    class Builder internal constructor() {

        private var caption: JsonField<String>? = null
        private var socialAccounts: JsonField<MutableList<String>>? = null
        private var accountConfigurations: JsonField<MutableList<AccountConfiguration>>? = null
        private var externalId: JsonField<String> = JsonMissing.of()
        private var isDraft: JsonField<Boolean> = JsonMissing.of()
        private var media: JsonField<MutableList<Media>>? = null
        private var platformConfigurations: JsonField<PlatformConfigurations> = JsonMissing.of()
        private var scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(createSocialPost: CreateSocialPost) = apply {
            caption = createSocialPost.caption
            socialAccounts = createSocialPost.socialAccounts.map { it.toMutableList() }
            accountConfigurations =
                createSocialPost.accountConfigurations.map { it.toMutableList() }
            externalId = createSocialPost.externalId
            isDraft = createSocialPost.isDraft
            media = createSocialPost.media.map { it.toMutableList() }
            platformConfigurations = createSocialPost.platformConfigurations
            scheduledAt = createSocialPost.scheduledAt
            additionalProperties = createSocialPost.additionalProperties.toMutableMap()
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

        /** Array of social account IDs for posting */
        fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /** If isDraft is set then the post will not be processed */
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
         * You should usually call [Builder.isDraft] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isDraft(isDraft: JsonField<Boolean>) = apply { this.isDraft = isDraft }

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
        fun platformConfigurations(platformConfigurations: PlatformConfigurations?) =
            platformConfigurations(JsonField.ofNullable(platformConfigurations))

        /**
         * Sets [Builder.platformConfigurations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformConfigurations] with a well-typed
         * [PlatformConfigurations] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun platformConfigurations(platformConfigurations: JsonField<PlatformConfigurations>) =
            apply {
                this.platformConfigurations = platformConfigurations
            }

        /**
         * Scheduled date and time for the post, setting to null or undefined will post instantly
         */
        fun scheduledAt(scheduledAt: OffsetDateTime?) =
            scheduledAt(JsonField.ofNullable(scheduledAt))

        /**
         * Sets [Builder.scheduledAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scheduledAt(scheduledAt: JsonField<OffsetDateTime>) = apply {
            this.scheduledAt = scheduledAt
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
         * Returns an immutable instance of [CreateSocialPost].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .caption()
         * .socialAccounts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreateSocialPost =
            CreateSocialPost(
                checkRequired("caption", caption),
                checkRequired("socialAccounts", socialAccounts).map { it.toImmutable() },
                (accountConfigurations ?: JsonMissing.of()).map { it.toImmutable() },
                externalId,
                isDraft,
                (media ?: JsonMissing.of()).map { it.toImmutable() },
                platformConfigurations,
                scheduledAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CreateSocialPost = apply {
        if (validated) {
            return@apply
        }

        caption()
        socialAccounts()
        accountConfigurations()?.forEach { it.validate() }
        externalId()
        isDraft()
        media()?.forEach { it.validate() }
        platformConfigurations()?.validate()
        scheduledAt()
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
        (if (caption.asKnown() == null) 0 else 1) +
            (socialAccounts.asKnown()?.size ?: 0) +
            (accountConfigurations.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (externalId.asKnown() == null) 0 else 1) +
            (if (isDraft.asKnown() == null) 0 else 1) +
            (media.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (platformConfigurations.asKnown()?.validity() ?: 0) +
            (if (scheduledAt.asKnown() == null) 0 else 1)

    class AccountConfiguration
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
        private constructor(
            private val allowComment: JsonField<Boolean>,
            private val allowDuet: JsonField<Boolean>,
            private val allowStitch: JsonField<Boolean>,
            private val boardIds: JsonField<List<String>>,
            private val caption: JsonValue,
            private val discloseBrandedContent: JsonField<Boolean>,
            private val discloseYourBrand: JsonField<Boolean>,
            private val isAiGenerated: JsonField<Boolean>,
            private val isDraft: JsonField<Boolean>,
            private val link: JsonField<String>,
            private val media: JsonField<List<String>>,
            private val placement: JsonField<Placement>,
            private val privacyStatus: JsonField<String>,
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
                @JsonProperty("board_ids")
                @ExcludeMissing
                boardIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("caption") @ExcludeMissing caption: JsonValue = JsonMissing.of(),
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
                @JsonProperty("media")
                @ExcludeMissing
                media: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("placement")
                @ExcludeMissing
                placement: JsonField<Placement> = JsonMissing.of(),
                @JsonProperty("privacy_status")
                @ExcludeMissing
                privacyStatus: JsonField<String> = JsonMissing.of(),
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            ) : this(
                allowComment,
                allowDuet,
                allowStitch,
                boardIds,
                caption,
                discloseBrandedContent,
                discloseYourBrand,
                isAiGenerated,
                isDraft,
                link,
                media,
                placement,
                privacyStatus,
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
             * Pinterest board IDs
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun boardIds(): List<String>? = boardIds.getNullable("board_ids")

            /** Overrides the `caption` from the post */
            @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonValue = caption

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
             * Sets the privacy status for TikTok (private, public)
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun privacyStatus(): String? = privacyStatus.getNullable("privacy_status")

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
             * Returns the raw JSON value of [boardIds].
             *
             * Unlike [boardIds], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("board_ids")
            @ExcludeMissing
            fun _boardIds(): JsonField<List<String>> = boardIds

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
             * Returns the raw JSON value of [privacyStatus].
             *
             * Unlike [privacyStatus], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("privacy_status")
            @ExcludeMissing
            fun _privacyStatus(): JsonField<String> = privacyStatus

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
                private var boardIds: JsonField<MutableList<String>>? = null
                private var caption: JsonValue = JsonMissing.of()
                private var discloseBrandedContent: JsonField<Boolean> = JsonMissing.of()
                private var discloseYourBrand: JsonField<Boolean> = JsonMissing.of()
                private var isAiGenerated: JsonField<Boolean> = JsonMissing.of()
                private var isDraft: JsonField<Boolean> = JsonMissing.of()
                private var link: JsonField<String> = JsonMissing.of()
                private var media: JsonField<MutableList<String>>? = null
                private var placement: JsonField<Placement> = JsonMissing.of()
                private var privacyStatus: JsonField<String> = JsonMissing.of()
                private var title: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(configuration: Configuration) = apply {
                    allowComment = configuration.allowComment
                    allowDuet = configuration.allowDuet
                    allowStitch = configuration.allowStitch
                    boardIds = configuration.boardIds.map { it.toMutableList() }
                    caption = configuration.caption
                    discloseBrandedContent = configuration.discloseBrandedContent
                    discloseYourBrand = configuration.discloseYourBrand
                    isAiGenerated = configuration.isAiGenerated
                    isDraft = configuration.isDraft
                    link = configuration.link
                    media = configuration.media.map { it.toMutableList() }
                    placement = configuration.placement
                    privacyStatus = configuration.privacyStatus
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

                /** Sets the privacy status for TikTok (private, public) */
                fun privacyStatus(privacyStatus: String?) =
                    privacyStatus(JsonField.ofNullable(privacyStatus))

                /**
                 * Sets [Builder.privacyStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.privacyStatus] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun privacyStatus(privacyStatus: JsonField<String>) = apply {
                    this.privacyStatus = privacyStatus
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
                        (boardIds ?: JsonMissing.of()).map { it.toImmutable() },
                        caption,
                        discloseBrandedContent,
                        discloseYourBrand,
                        isAiGenerated,
                        isDraft,
                        link,
                        (media ?: JsonMissing.of()).map { it.toImmutable() },
                        placement,
                        privacyStatus,
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
                boardIds()
                discloseBrandedContent()
                discloseYourBrand()
                isAiGenerated()
                isDraft()
                link()
                media()
                placement()?.validate()
                privacyStatus()
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
                    (boardIds.asKnown()?.size ?: 0) +
                    (if (discloseBrandedContent.asKnown() == null) 0 else 1) +
                    (if (discloseYourBrand.asKnown() == null) 0 else 1) +
                    (if (isAiGenerated.asKnown() == null) 0 else 1) +
                    (if (isDraft.asKnown() == null) 0 else 1) +
                    (if (link.asKnown() == null) 0 else 1) +
                    (media.asKnown()?.size ?: 0) +
                    (placement.asKnown()?.validity() ?: 0) +
                    (if (privacyStatus.asKnown() == null) 0 else 1) +
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Configuration &&
                    allowComment == other.allowComment &&
                    allowDuet == other.allowDuet &&
                    allowStitch == other.allowStitch &&
                    boardIds == other.boardIds &&
                    caption == other.caption &&
                    discloseBrandedContent == other.discloseBrandedContent &&
                    discloseYourBrand == other.discloseYourBrand &&
                    isAiGenerated == other.isAiGenerated &&
                    isDraft == other.isDraft &&
                    link == other.link &&
                    media == other.media &&
                    placement == other.placement &&
                    privacyStatus == other.privacyStatus &&
                    title == other.title &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    allowComment,
                    allowDuet,
                    allowStitch,
                    boardIds,
                    caption,
                    discloseBrandedContent,
                    discloseYourBrand,
                    isAiGenerated,
                    isDraft,
                    link,
                    media,
                    placement,
                    privacyStatus,
                    title,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Configuration{allowComment=$allowComment, allowDuet=$allowDuet, allowStitch=$allowStitch, boardIds=$boardIds, caption=$caption, discloseBrandedContent=$discloseBrandedContent, discloseYourBrand=$discloseYourBrand, isAiGenerated=$isAiGenerated, isDraft=$isDraft, link=$link, media=$media, placement=$placement, privacyStatus=$privacyStatus, title=$title, additionalProperties=$additionalProperties}"
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
    private constructor(
        private val url: JsonField<String>,
        private val thumbnailTimestampMs: JsonValue,
        private val thumbnailUrl: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("thumbnail_timestamp_ms")
            @ExcludeMissing
            thumbnailTimestampMs: JsonValue = JsonMissing.of(),
            @JsonProperty("thumbnail_url")
            @ExcludeMissing
            thumbnailUrl: JsonValue = JsonMissing.of(),
        ) : this(url, thumbnailTimestampMs, thumbnailUrl, mutableMapOf())

        /**
         * Public URL of the media
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

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
            private var thumbnailTimestampMs: JsonValue = JsonMissing.of()
            private var thumbnailUrl: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(media: Media) = apply {
                url = media.url
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
        internal fun validity(): Int = (if (url.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Media &&
                url == other.url &&
                thumbnailTimestampMs == other.thumbnailTimestampMs &&
                thumbnailUrl == other.thumbnailUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(url, thumbnailTimestampMs, thumbnailUrl, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Media{url=$url, thumbnailTimestampMs=$thumbnailTimestampMs, thumbnailUrl=$thumbnailUrl, additionalProperties=$additionalProperties}"
    }

    /** Platform-specific configurations for the post */
    class PlatformConfigurations
    private constructor(
        private val bluesky: JsonField<Bluesky>,
        private val facebook: JsonField<Facebook>,
        private val instagram: JsonField<Instagram>,
        private val linkedin: JsonField<Linkedin>,
        private val pinterest: JsonField<Pinterest>,
        private val threads: JsonField<Threads>,
        private val tiktok: JsonField<TiktokConfiguration>,
        private val tiktokBusiness: JsonField<TiktokConfiguration>,
        private val x: JsonField<X>,
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
            @JsonProperty("tiktok")
            @ExcludeMissing
            tiktok: JsonField<TiktokConfiguration> = JsonMissing.of(),
            @JsonProperty("tiktok_business")
            @ExcludeMissing
            tiktokBusiness: JsonField<TiktokConfiguration> = JsonMissing.of(),
            @JsonProperty("x") @ExcludeMissing x: JsonField<X> = JsonMissing.of(),
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
            x,
            youtube,
            mutableMapOf(),
        )

        /**
         * Bluesky configuration
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun bluesky(): Bluesky? = bluesky.getNullable("bluesky")

        /**
         * Facebook configuration
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun facebook(): Facebook? = facebook.getNullable("facebook")

        /**
         * Instagram configuration
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun instagram(): Instagram? = instagram.getNullable("instagram")

        /**
         * LinkedIn configuration
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun linkedin(): Linkedin? = linkedin.getNullable("linkedin")

        /**
         * Pinterest configuration
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pinterest(): Pinterest? = pinterest.getNullable("pinterest")

        /**
         * Threads configuration
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun threads(): Threads? = threads.getNullable("threads")

        /**
         * TikTok configuration
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tiktok(): TiktokConfiguration? = tiktok.getNullable("tiktok")

        /**
         * TikTok configuration
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tiktokBusiness(): TiktokConfiguration? = tiktokBusiness.getNullable("tiktok_business")

        /**
         * Twitter configuration
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun x(): X? = x.getNullable("x")

        /**
         * YouTube configuration
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
        @JsonProperty("tiktok")
        @ExcludeMissing
        fun _tiktok(): JsonField<TiktokConfiguration> = tiktok

        /**
         * Returns the raw JSON value of [tiktokBusiness].
         *
         * Unlike [tiktokBusiness], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tiktok_business")
        @ExcludeMissing
        fun _tiktokBusiness(): JsonField<TiktokConfiguration> = tiktokBusiness

        /**
         * Returns the raw JSON value of [x].
         *
         * Unlike [x], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("x") @ExcludeMissing fun _x(): JsonField<X> = x

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

            /**
             * Returns a mutable builder for constructing an instance of [PlatformConfigurations].
             */
            fun builder() = Builder()
        }

        /** A builder for [PlatformConfigurations]. */
        class Builder internal constructor() {

            private var bluesky: JsonField<Bluesky> = JsonMissing.of()
            private var facebook: JsonField<Facebook> = JsonMissing.of()
            private var instagram: JsonField<Instagram> = JsonMissing.of()
            private var linkedin: JsonField<Linkedin> = JsonMissing.of()
            private var pinterest: JsonField<Pinterest> = JsonMissing.of()
            private var threads: JsonField<Threads> = JsonMissing.of()
            private var tiktok: JsonField<TiktokConfiguration> = JsonMissing.of()
            private var tiktokBusiness: JsonField<TiktokConfiguration> = JsonMissing.of()
            private var x: JsonField<X> = JsonMissing.of()
            private var youtube: JsonField<Youtube> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(platformConfigurations: PlatformConfigurations) = apply {
                bluesky = platformConfigurations.bluesky
                facebook = platformConfigurations.facebook
                instagram = platformConfigurations.instagram
                linkedin = platformConfigurations.linkedin
                pinterest = platformConfigurations.pinterest
                threads = platformConfigurations.threads
                tiktok = platformConfigurations.tiktok
                tiktokBusiness = platformConfigurations.tiktokBusiness
                x = platformConfigurations.x
                youtube = platformConfigurations.youtube
                additionalProperties = platformConfigurations.additionalProperties.toMutableMap()
            }

            /** Bluesky configuration */
            fun bluesky(bluesky: Bluesky?) = bluesky(JsonField.ofNullable(bluesky))

            /**
             * Sets [Builder.bluesky] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bluesky] with a well-typed [Bluesky] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bluesky(bluesky: JsonField<Bluesky>) = apply { this.bluesky = bluesky }

            /** Facebook configuration */
            fun facebook(facebook: Facebook?) = facebook(JsonField.ofNullable(facebook))

            /**
             * Sets [Builder.facebook] to an arbitrary JSON value.
             *
             * You should usually call [Builder.facebook] with a well-typed [Facebook] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun facebook(facebook: JsonField<Facebook>) = apply { this.facebook = facebook }

            /** Instagram configuration */
            fun instagram(instagram: Instagram?) = instagram(JsonField.ofNullable(instagram))

            /**
             * Sets [Builder.instagram] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instagram] with a well-typed [Instagram] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instagram(instagram: JsonField<Instagram>) = apply { this.instagram = instagram }

            /** LinkedIn configuration */
            fun linkedin(linkedin: Linkedin?) = linkedin(JsonField.ofNullable(linkedin))

            /**
             * Sets [Builder.linkedin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linkedin] with a well-typed [Linkedin] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun linkedin(linkedin: JsonField<Linkedin>) = apply { this.linkedin = linkedin }

            /** Pinterest configuration */
            fun pinterest(pinterest: Pinterest?) = pinterest(JsonField.ofNullable(pinterest))

            /**
             * Sets [Builder.pinterest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pinterest] with a well-typed [Pinterest] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pinterest(pinterest: JsonField<Pinterest>) = apply { this.pinterest = pinterest }

            /** Threads configuration */
            fun threads(threads: Threads?) = threads(JsonField.ofNullable(threads))

            /**
             * Sets [Builder.threads] to an arbitrary JSON value.
             *
             * You should usually call [Builder.threads] with a well-typed [Threads] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun threads(threads: JsonField<Threads>) = apply { this.threads = threads }

            /** TikTok configuration */
            fun tiktok(tiktok: TiktokConfiguration?) = tiktok(JsonField.ofNullable(tiktok))

            /**
             * Sets [Builder.tiktok] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tiktok] with a well-typed [TiktokConfiguration]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun tiktok(tiktok: JsonField<TiktokConfiguration>) = apply { this.tiktok = tiktok }

            /** TikTok configuration */
            fun tiktokBusiness(tiktokBusiness: TiktokConfiguration?) =
                tiktokBusiness(JsonField.ofNullable(tiktokBusiness))

            /**
             * Sets [Builder.tiktokBusiness] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tiktokBusiness] with a well-typed
             * [TiktokConfiguration] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun tiktokBusiness(tiktokBusiness: JsonField<TiktokConfiguration>) = apply {
                this.tiktokBusiness = tiktokBusiness
            }

            /** Twitter configuration */
            fun x(x: X?) = x(JsonField.ofNullable(x))

            /**
             * Sets [Builder.x] to an arbitrary JSON value.
             *
             * You should usually call [Builder.x] with a well-typed [X] value instead. This method
             * is primarily for setting the field to an undocumented or not yet supported value.
             */
            fun x(x: JsonField<X>) = apply { this.x = x }

            /** YouTube configuration */
            fun youtube(youtube: Youtube?) = youtube(JsonField.ofNullable(youtube))

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
             * Returns an immutable instance of [PlatformConfigurations].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PlatformConfigurations =
                PlatformConfigurations(
                    bluesky,
                    facebook,
                    instagram,
                    linkedin,
                    pinterest,
                    threads,
                    tiktok,
                    tiktokBusiness,
                    x,
                    youtube,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PlatformConfigurations = apply {
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
            x()?.validate()
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
                (x.asKnown()?.validity() ?: 0) +
                (youtube.asKnown()?.validity() ?: 0)

        /** Bluesky configuration */
        class Bluesky
        private constructor(
            private val caption: JsonValue,
            private val media: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("caption") @ExcludeMissing caption: JsonValue = JsonMissing.of(),
                @JsonProperty("media")
                @ExcludeMissing
                media: JsonField<List<String>> = JsonMissing.of(),
            ) : this(caption, media, mutableMapOf())

            /** Overrides the `caption` from the post */
            @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonValue = caption

            /**
             * Overrides the `media` from the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun media(): List<String>? = media.getNullable("media")

            /**
             * Returns the raw JSON value of [media].
             *
             * Unlike [media], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("media") @ExcludeMissing fun _media(): JsonField<List<String>> = media

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

                /** Returns a mutable builder for constructing an instance of [Bluesky]. */
                fun builder() = Builder()
            }

            /** A builder for [Bluesky]. */
            class Builder internal constructor() {

                private var caption: JsonValue = JsonMissing.of()
                private var media: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(bluesky: Bluesky) = apply {
                    caption = bluesky.caption
                    media = bluesky.media.map { it.toMutableList() }
                    additionalProperties = bluesky.additionalProperties.toMutableMap()
                }

                /** Overrides the `caption` from the post */
                fun caption(caption: JsonValue) = apply { this.caption = caption }

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
                 */
                fun build(): Bluesky =
                    Bluesky(
                        caption,
                        (media ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Bluesky = apply {
                if (validated) {
                    return@apply
                }

                media()
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
            internal fun validity(): Int = (media.asKnown()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Bluesky &&
                    caption == other.caption &&
                    media == other.media &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(caption, media, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Bluesky{caption=$caption, media=$media, additionalProperties=$additionalProperties}"
        }

        /** Facebook configuration */
        class Facebook
        private constructor(
            private val caption: JsonValue,
            private val media: JsonField<List<String>>,
            private val placement: JsonField<Placement>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("caption") @ExcludeMissing caption: JsonValue = JsonMissing.of(),
                @JsonProperty("media")
                @ExcludeMissing
                media: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("placement")
                @ExcludeMissing
                placement: JsonField<Placement> = JsonMissing.of(),
            ) : this(caption, media, placement, mutableMapOf())

            /** Overrides the `caption` from the post */
            @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonValue = caption

            /**
             * Overrides the `media` from the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun media(): List<String>? = media.getNullable("media")

            /**
             * Facebook post placement
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun placement(): Placement? = placement.getNullable("placement")

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

                private var caption: JsonValue = JsonMissing.of()
                private var media: JsonField<MutableList<String>>? = null
                private var placement: JsonField<Placement> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(facebook: Facebook) = apply {
                    caption = facebook.caption
                    media = facebook.media.map { it.toMutableList() }
                    placement = facebook.placement
                    additionalProperties = facebook.additionalProperties.toMutableMap()
                }

                /** Overrides the `caption` from the post */
                fun caption(caption: JsonValue) = apply { this.caption = caption }

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

                /** Facebook post placement */
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
                        caption,
                        (media ?: JsonMissing.of()).map { it.toImmutable() },
                        placement,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Facebook = apply {
                if (validated) {
                    return@apply
                }

                media()
                placement()?.validate()
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
                (media.asKnown()?.size ?: 0) + (placement.asKnown()?.validity() ?: 0)

            /** Facebook post placement */
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

                    val STORIES = of("stories")

                    val TIMELINE = of("timeline")

                    fun of(value: String) = Placement(JsonField.of(value))
                }

                /** An enum containing [Placement]'s known values. */
                enum class Known {
                    REELS,
                    STORIES,
                    TIMELINE,
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
                    STORIES,
                    TIMELINE,
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
                        STORIES -> Value.STORIES
                        TIMELINE -> Value.TIMELINE
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
                        STORIES -> Known.STORIES
                        TIMELINE -> Known.TIMELINE
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Facebook &&
                    caption == other.caption &&
                    media == other.media &&
                    placement == other.placement &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(caption, media, placement, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Facebook{caption=$caption, media=$media, placement=$placement, additionalProperties=$additionalProperties}"
        }

        /** Instagram configuration */
        class Instagram
        private constructor(
            private val caption: JsonValue,
            private val collaborators: JsonField<List<String>>,
            private val media: JsonField<List<String>>,
            private val placement: JsonField<Placement>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("caption") @ExcludeMissing caption: JsonValue = JsonMissing.of(),
                @JsonProperty("collaborators")
                @ExcludeMissing
                collaborators: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("media")
                @ExcludeMissing
                media: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("placement")
                @ExcludeMissing
                placement: JsonField<Placement> = JsonMissing.of(),
            ) : this(caption, collaborators, media, placement, mutableMapOf())

            /** Overrides the `caption` from the post */
            @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonValue = caption

            /**
             * Instagram usernames to be tagged as a collaborator
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun collaborators(): List<String>? = collaborators.getNullable("collaborators")

            /**
             * Overrides the `media` from the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun media(): List<String>? = media.getNullable("media")

            /**
             * Instagram post placement
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun placement(): Placement? = placement.getNullable("placement")

            /**
             * Returns the raw JSON value of [collaborators].
             *
             * Unlike [collaborators], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("collaborators")
            @ExcludeMissing
            fun _collaborators(): JsonField<List<String>> = collaborators

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

                /** Returns a mutable builder for constructing an instance of [Instagram]. */
                fun builder() = Builder()
            }

            /** A builder for [Instagram]. */
            class Builder internal constructor() {

                private var caption: JsonValue = JsonMissing.of()
                private var collaborators: JsonField<MutableList<String>>? = null
                private var media: JsonField<MutableList<String>>? = null
                private var placement: JsonField<Placement> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(instagram: Instagram) = apply {
                    caption = instagram.caption
                    collaborators = instagram.collaborators.map { it.toMutableList() }
                    media = instagram.media.map { it.toMutableList() }
                    placement = instagram.placement
                    additionalProperties = instagram.additionalProperties.toMutableMap()
                }

                /** Overrides the `caption` from the post */
                fun caption(caption: JsonValue) = apply { this.caption = caption }

                /** Instagram usernames to be tagged as a collaborator */
                fun collaborators(collaborators: List<String>?) =
                    collaborators(JsonField.ofNullable(collaborators))

                /**
                 * Sets [Builder.collaborators] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.collaborators] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun collaborators(collaborators: JsonField<List<String>>) = apply {
                    this.collaborators = collaborators.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [collaborators].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCollaborator(collaborator: String) = apply {
                    collaborators =
                        (collaborators ?: JsonField.of(mutableListOf())).also {
                            checkKnown("collaborators", it).add(collaborator)
                        }
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

                /** Instagram post placement */
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
                 */
                fun build(): Instagram =
                    Instagram(
                        caption,
                        (collaborators ?: JsonMissing.of()).map { it.toImmutable() },
                        (media ?: JsonMissing.of()).map { it.toImmutable() },
                        placement,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Instagram = apply {
                if (validated) {
                    return@apply
                }

                collaborators()
                media()
                placement()?.validate()
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
                (collaborators.asKnown()?.size ?: 0) +
                    (media.asKnown()?.size ?: 0) +
                    (placement.asKnown()?.validity() ?: 0)

            /** Instagram post placement */
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

                    val STORIES = of("stories")

                    val TIMELINE = of("timeline")

                    fun of(value: String) = Placement(JsonField.of(value))
                }

                /** An enum containing [Placement]'s known values. */
                enum class Known {
                    REELS,
                    STORIES,
                    TIMELINE,
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
                    STORIES,
                    TIMELINE,
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
                        STORIES -> Value.STORIES
                        TIMELINE -> Value.TIMELINE
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
                        STORIES -> Known.STORIES
                        TIMELINE -> Known.TIMELINE
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Instagram &&
                    caption == other.caption &&
                    collaborators == other.collaborators &&
                    media == other.media &&
                    placement == other.placement &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(caption, collaborators, media, placement, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Instagram{caption=$caption, collaborators=$collaborators, media=$media, placement=$placement, additionalProperties=$additionalProperties}"
        }

        /** LinkedIn configuration */
        class Linkedin
        private constructor(
            private val caption: JsonValue,
            private val media: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("caption") @ExcludeMissing caption: JsonValue = JsonMissing.of(),
                @JsonProperty("media")
                @ExcludeMissing
                media: JsonField<List<String>> = JsonMissing.of(),
            ) : this(caption, media, mutableMapOf())

            /** Overrides the `caption` from the post */
            @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonValue = caption

            /**
             * Overrides the `media` from the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun media(): List<String>? = media.getNullable("media")

            /**
             * Returns the raw JSON value of [media].
             *
             * Unlike [media], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("media") @ExcludeMissing fun _media(): JsonField<List<String>> = media

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

                /** Returns a mutable builder for constructing an instance of [Linkedin]. */
                fun builder() = Builder()
            }

            /** A builder for [Linkedin]. */
            class Builder internal constructor() {

                private var caption: JsonValue = JsonMissing.of()
                private var media: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(linkedin: Linkedin) = apply {
                    caption = linkedin.caption
                    media = linkedin.media.map { it.toMutableList() }
                    additionalProperties = linkedin.additionalProperties.toMutableMap()
                }

                /** Overrides the `caption` from the post */
                fun caption(caption: JsonValue) = apply { this.caption = caption }

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
                 */
                fun build(): Linkedin =
                    Linkedin(
                        caption,
                        (media ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Linkedin = apply {
                if (validated) {
                    return@apply
                }

                media()
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
            internal fun validity(): Int = (media.asKnown()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Linkedin &&
                    caption == other.caption &&
                    media == other.media &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(caption, media, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Linkedin{caption=$caption, media=$media, additionalProperties=$additionalProperties}"
        }

        /** Pinterest configuration */
        class Pinterest
        private constructor(
            private val boardIds: JsonField<List<String>>,
            private val caption: JsonValue,
            private val link: JsonField<String>,
            private val media: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("board_ids")
                @ExcludeMissing
                boardIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("caption") @ExcludeMissing caption: JsonValue = JsonMissing.of(),
                @JsonProperty("link") @ExcludeMissing link: JsonField<String> = JsonMissing.of(),
                @JsonProperty("media")
                @ExcludeMissing
                media: JsonField<List<String>> = JsonMissing.of(),
            ) : this(boardIds, caption, link, media, mutableMapOf())

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
             * Pinterest post link
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun link(): String? = link.getNullable("link")

            /**
             * Overrides the `media` from the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun media(): List<String>? = media.getNullable("media")

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
             * Returns the raw JSON value of [link].
             *
             * Unlike [link], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("link") @ExcludeMissing fun _link(): JsonField<String> = link

            /**
             * Returns the raw JSON value of [media].
             *
             * Unlike [media], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("media") @ExcludeMissing fun _media(): JsonField<List<String>> = media

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

                private var boardIds: JsonField<MutableList<String>>? = null
                private var caption: JsonValue = JsonMissing.of()
                private var link: JsonField<String> = JsonMissing.of()
                private var media: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(pinterest: Pinterest) = apply {
                    boardIds = pinterest.boardIds.map { it.toMutableList() }
                    caption = pinterest.caption
                    link = pinterest.link
                    media = pinterest.media.map { it.toMutableList() }
                    additionalProperties = pinterest.additionalProperties.toMutableMap()
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
                        (boardIds ?: JsonMissing.of()).map { it.toImmutable() },
                        caption,
                        link,
                        (media ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Pinterest = apply {
                if (validated) {
                    return@apply
                }

                boardIds()
                link()
                media()
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
                (boardIds.asKnown()?.size ?: 0) +
                    (if (link.asKnown() == null) 0 else 1) +
                    (media.asKnown()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Pinterest &&
                    boardIds == other.boardIds &&
                    caption == other.caption &&
                    link == other.link &&
                    media == other.media &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(boardIds, caption, link, media, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Pinterest{boardIds=$boardIds, caption=$caption, link=$link, media=$media, additionalProperties=$additionalProperties}"
        }

        /** Threads configuration */
        class Threads
        private constructor(
            private val caption: JsonValue,
            private val media: JsonField<List<String>>,
            private val placement: JsonField<Placement>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("caption") @ExcludeMissing caption: JsonValue = JsonMissing.of(),
                @JsonProperty("media")
                @ExcludeMissing
                media: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("placement")
                @ExcludeMissing
                placement: JsonField<Placement> = JsonMissing.of(),
            ) : this(caption, media, placement, mutableMapOf())

            /** Overrides the `caption` from the post */
            @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonValue = caption

            /**
             * Overrides the `media` from the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun media(): List<String>? = media.getNullable("media")

            /**
             * Threads post placement
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun placement(): Placement? = placement.getNullable("placement")

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

                private var caption: JsonValue = JsonMissing.of()
                private var media: JsonField<MutableList<String>>? = null
                private var placement: JsonField<Placement> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(threads: Threads) = apply {
                    caption = threads.caption
                    media = threads.media.map { it.toMutableList() }
                    placement = threads.placement
                    additionalProperties = threads.additionalProperties.toMutableMap()
                }

                /** Overrides the `caption` from the post */
                fun caption(caption: JsonValue) = apply { this.caption = caption }

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

                /** Threads post placement */
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
                        caption,
                        (media ?: JsonMissing.of()).map { it.toImmutable() },
                        placement,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Threads = apply {
                if (validated) {
                    return@apply
                }

                media()
                placement()?.validate()
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
                (media.asKnown()?.size ?: 0) + (placement.asKnown()?.validity() ?: 0)

            /** Threads post placement */
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

                    fun of(value: String) = Placement(JsonField.of(value))
                }

                /** An enum containing [Placement]'s known values. */
                enum class Known {
                    REELS,
                    TIMELINE,
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Threads &&
                    caption == other.caption &&
                    media == other.media &&
                    placement == other.placement &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(caption, media, placement, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Threads{caption=$caption, media=$media, placement=$placement, additionalProperties=$additionalProperties}"
        }

        /** Twitter configuration */
        class X
        private constructor(
            private val caption: JsonValue,
            private val media: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("caption") @ExcludeMissing caption: JsonValue = JsonMissing.of(),
                @JsonProperty("media")
                @ExcludeMissing
                media: JsonField<List<String>> = JsonMissing.of(),
            ) : this(caption, media, mutableMapOf())

            /** Overrides the `caption` from the post */
            @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonValue = caption

            /**
             * Overrides the `media` from the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun media(): List<String>? = media.getNullable("media")

            /**
             * Returns the raw JSON value of [media].
             *
             * Unlike [media], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("media") @ExcludeMissing fun _media(): JsonField<List<String>> = media

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

                /** Returns a mutable builder for constructing an instance of [X]. */
                fun builder() = Builder()
            }

            /** A builder for [X]. */
            class Builder internal constructor() {

                private var caption: JsonValue = JsonMissing.of()
                private var media: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(x: X) = apply {
                    caption = x.caption
                    media = x.media.map { it.toMutableList() }
                    additionalProperties = x.additionalProperties.toMutableMap()
                }

                /** Overrides the `caption` from the post */
                fun caption(caption: JsonValue) = apply { this.caption = caption }

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
                 * Returns an immutable instance of [X].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): X =
                    X(
                        caption,
                        (media ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): X = apply {
                if (validated) {
                    return@apply
                }

                media()
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
            internal fun validity(): Int = (media.asKnown()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is X &&
                    caption == other.caption &&
                    media == other.media &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(caption, media, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "X{caption=$caption, media=$media, additionalProperties=$additionalProperties}"
        }

        /** YouTube configuration */
        class Youtube
        private constructor(
            private val caption: JsonValue,
            private val media: JsonField<List<String>>,
            private val title: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("caption") @ExcludeMissing caption: JsonValue = JsonMissing.of(),
                @JsonProperty("media")
                @ExcludeMissing
                media: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            ) : this(caption, media, title, mutableMapOf())

            /** Overrides the `caption` from the post */
            @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonValue = caption

            /**
             * Overrides the `media` from the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun media(): List<String>? = media.getNullable("media")

            /**
             * Overrides the `title` from the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun title(): String? = title.getNullable("title")

            /**
             * Returns the raw JSON value of [media].
             *
             * Unlike [media], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("media") @ExcludeMissing fun _media(): JsonField<List<String>> = media

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

                /** Returns a mutable builder for constructing an instance of [Youtube]. */
                fun builder() = Builder()
            }

            /** A builder for [Youtube]. */
            class Builder internal constructor() {

                private var caption: JsonValue = JsonMissing.of()
                private var media: JsonField<MutableList<String>>? = null
                private var title: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(youtube: Youtube) = apply {
                    caption = youtube.caption
                    media = youtube.media.map { it.toMutableList() }
                    title = youtube.title
                    additionalProperties = youtube.additionalProperties.toMutableMap()
                }

                /** Overrides the `caption` from the post */
                fun caption(caption: JsonValue) = apply { this.caption = caption }

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
                 * Returns an immutable instance of [Youtube].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Youtube =
                    Youtube(
                        caption,
                        (media ?: JsonMissing.of()).map { it.toImmutable() },
                        title,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Youtube = apply {
                if (validated) {
                    return@apply
                }

                media()
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
                (media.asKnown()?.size ?: 0) + (if (title.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Youtube &&
                    caption == other.caption &&
                    media == other.media &&
                    title == other.title &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(caption, media, title, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Youtube{caption=$caption, media=$media, title=$title, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PlatformConfigurations &&
                bluesky == other.bluesky &&
                facebook == other.facebook &&
                instagram == other.instagram &&
                linkedin == other.linkedin &&
                pinterest == other.pinterest &&
                threads == other.threads &&
                tiktok == other.tiktok &&
                tiktokBusiness == other.tiktokBusiness &&
                x == other.x &&
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
                x,
                youtube,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlatformConfigurations{bluesky=$bluesky, facebook=$facebook, instagram=$instagram, linkedin=$linkedin, pinterest=$pinterest, threads=$threads, tiktok=$tiktok, tiktokBusiness=$tiktokBusiness, x=$x, youtube=$youtube, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateSocialPost &&
            caption == other.caption &&
            socialAccounts == other.socialAccounts &&
            accountConfigurations == other.accountConfigurations &&
            externalId == other.externalId &&
            isDraft == other.isDraft &&
            media == other.media &&
            platformConfigurations == other.platformConfigurations &&
            scheduledAt == other.scheduledAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            caption,
            socialAccounts,
            accountConfigurations,
            externalId,
            isDraft,
            media,
            platformConfigurations,
            scheduledAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateSocialPost{caption=$caption, socialAccounts=$socialAccounts, accountConfigurations=$accountConfigurations, externalId=$externalId, isDraft=$isDraft, media=$media, platformConfigurations=$platformConfigurations, scheduledAt=$scheduledAt, additionalProperties=$additionalProperties}"
}
