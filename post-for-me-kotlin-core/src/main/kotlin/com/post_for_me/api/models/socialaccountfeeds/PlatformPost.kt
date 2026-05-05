// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccountfeeds

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.BaseDeserializer
import com.post_for_me.api.core.BaseSerializer
import com.post_for_me.api.core.ExcludeMissing
import com.post_for_me.api.core.JsonField
import com.post_for_me.api.core.JsonMissing
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.allMaxBy
import com.post_for_me.api.core.checkKnown
import com.post_for_me.api.core.checkRequired
import com.post_for_me.api.core.getOrThrow
import com.post_for_me.api.core.toImmutable
import com.post_for_me.api.errors.PostForMeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class PlatformPost
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val caption: JsonField<String>,
    private val media: JsonField<List<List<JsonValue>>>,
    private val platform: JsonField<String>,
    private val platformAccountId: JsonField<String>,
    private val platformPostId: JsonField<String>,
    private val platformUrl: JsonField<String>,
    private val socialAccountId: JsonField<String>,
    private val externalAccountId: JsonField<String>,
    private val externalPostId: JsonField<String>,
    private val metrics: JsonField<Metrics>,
    private val platformData: JsonField<PlatformData>,
    private val postedAt: JsonField<OffsetDateTime>,
    private val socialPostId: JsonField<String>,
    private val socialPostResultId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("caption") @ExcludeMissing caption: JsonField<String> = JsonMissing.of(),
        @JsonProperty("media")
        @ExcludeMissing
        media: JsonField<List<List<JsonValue>>> = JsonMissing.of(),
        @JsonProperty("platform") @ExcludeMissing platform: JsonField<String> = JsonMissing.of(),
        @JsonProperty("platform_account_id")
        @ExcludeMissing
        platformAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("platform_post_id")
        @ExcludeMissing
        platformPostId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("platform_url")
        @ExcludeMissing
        platformUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("social_account_id")
        @ExcludeMissing
        socialAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_account_id")
        @ExcludeMissing
        externalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_post_id")
        @ExcludeMissing
        externalPostId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metrics") @ExcludeMissing metrics: JsonField<Metrics> = JsonMissing.of(),
        @JsonProperty("platform_data")
        @ExcludeMissing
        platformData: JsonField<PlatformData> = JsonMissing.of(),
        @JsonProperty("posted_at")
        @ExcludeMissing
        postedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("social_post_id")
        @ExcludeMissing
        socialPostId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("social_post_result_id")
        @ExcludeMissing
        socialPostResultId: JsonField<String> = JsonMissing.of(),
    ) : this(
        caption,
        media,
        platform,
        platformAccountId,
        platformPostId,
        platformUrl,
        socialAccountId,
        externalAccountId,
        externalPostId,
        metrics,
        platformData,
        postedAt,
        socialPostId,
        socialPostResultId,
        mutableMapOf(),
    )

    /**
     * Caption or text content of the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun caption(): String = caption.getRequired("caption")

    /**
     * Array of media items attached to the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun media(): List<List<JsonValue>> = media.getRequired("media")

    /**
     * Social media platform name
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platform(): String = platform.getRequired("platform")

    /**
     * Platform-specific account ID
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platformAccountId(): String = platformAccountId.getRequired("platform_account_id")

    /**
     * Platform-specific post ID
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platformPostId(): String = platformPostId.getRequired("platform_post_id")

    /**
     * URL to the post on the platform
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platformUrl(): String = platformUrl.getRequired("platform_url")

    /**
     * ID of the social account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun socialAccountId(): String = socialAccountId.getRequired("social_account_id")

    /**
     * External account ID from the platform
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalAccountId(): String? = externalAccountId.getNullable("external_account_id")

    /**
     * External post ID from the platform
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalPostId(): String? = externalPostId.getNullable("external_post_id")

    /**
     * Post metrics and analytics data
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metrics(): Metrics? = metrics.getNullable("metrics")

    /**
     * Platform-specific data for the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun platformData(): PlatformData? = platformData.getNullable("platform_data")

    /**
     * Date the post was published
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun postedAt(): OffsetDateTime? = postedAt.getNullable("posted_at")

    /**
     * ID of the social post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun socialPostId(): String? = socialPostId.getNullable("social_post_id")

    /**
     * ID of the social post result
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun socialPostResultId(): String? = socialPostResultId.getNullable("social_post_result_id")

    /**
     * Returns the raw JSON value of [caption].
     *
     * Unlike [caption], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonField<String> = caption

    /**
     * Returns the raw JSON value of [media].
     *
     * Unlike [media], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("media") @ExcludeMissing fun _media(): JsonField<List<List<JsonValue>>> = media

    /**
     * Returns the raw JSON value of [platform].
     *
     * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<String> = platform

    /**
     * Returns the raw JSON value of [platformAccountId].
     *
     * Unlike [platformAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("platform_account_id")
    @ExcludeMissing
    fun _platformAccountId(): JsonField<String> = platformAccountId

    /**
     * Returns the raw JSON value of [platformPostId].
     *
     * Unlike [platformPostId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platform_post_id")
    @ExcludeMissing
    fun _platformPostId(): JsonField<String> = platformPostId

    /**
     * Returns the raw JSON value of [platformUrl].
     *
     * Unlike [platformUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platform_url")
    @ExcludeMissing
    fun _platformUrl(): JsonField<String> = platformUrl

    /**
     * Returns the raw JSON value of [socialAccountId].
     *
     * Unlike [socialAccountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("social_account_id")
    @ExcludeMissing
    fun _socialAccountId(): JsonField<String> = socialAccountId

    /**
     * Returns the raw JSON value of [externalAccountId].
     *
     * Unlike [externalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("external_account_id")
    @ExcludeMissing
    fun _externalAccountId(): JsonField<String> = externalAccountId

    /**
     * Returns the raw JSON value of [externalPostId].
     *
     * Unlike [externalPostId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_post_id")
    @ExcludeMissing
    fun _externalPostId(): JsonField<String> = externalPostId

    /**
     * Returns the raw JSON value of [metrics].
     *
     * Unlike [metrics], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metrics") @ExcludeMissing fun _metrics(): JsonField<Metrics> = metrics

    /**
     * Returns the raw JSON value of [platformData].
     *
     * Unlike [platformData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platform_data")
    @ExcludeMissing
    fun _platformData(): JsonField<PlatformData> = platformData

    /**
     * Returns the raw JSON value of [postedAt].
     *
     * Unlike [postedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("posted_at") @ExcludeMissing fun _postedAt(): JsonField<OffsetDateTime> = postedAt

    /**
     * Returns the raw JSON value of [socialPostId].
     *
     * Unlike [socialPostId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("social_post_id")
    @ExcludeMissing
    fun _socialPostId(): JsonField<String> = socialPostId

    /**
     * Returns the raw JSON value of [socialPostResultId].
     *
     * Unlike [socialPostResultId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("social_post_result_id")
    @ExcludeMissing
    fun _socialPostResultId(): JsonField<String> = socialPostResultId

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
         * Returns a mutable builder for constructing an instance of [PlatformPost].
         *
         * The following fields are required:
         * ```kotlin
         * .caption()
         * .media()
         * .platform()
         * .platformAccountId()
         * .platformPostId()
         * .platformUrl()
         * .socialAccountId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PlatformPost]. */
    class Builder internal constructor() {

        private var caption: JsonField<String>? = null
        private var media: JsonField<MutableList<List<JsonValue>>>? = null
        private var platform: JsonField<String>? = null
        private var platformAccountId: JsonField<String>? = null
        private var platformPostId: JsonField<String>? = null
        private var platformUrl: JsonField<String>? = null
        private var socialAccountId: JsonField<String>? = null
        private var externalAccountId: JsonField<String> = JsonMissing.of()
        private var externalPostId: JsonField<String> = JsonMissing.of()
        private var metrics: JsonField<Metrics> = JsonMissing.of()
        private var platformData: JsonField<PlatformData> = JsonMissing.of()
        private var postedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var socialPostId: JsonField<String> = JsonMissing.of()
        private var socialPostResultId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(platformPost: PlatformPost) = apply {
            caption = platformPost.caption
            media = platformPost.media.map { it.toMutableList() }
            platform = platformPost.platform
            platformAccountId = platformPost.platformAccountId
            platformPostId = platformPost.platformPostId
            platformUrl = platformPost.platformUrl
            socialAccountId = platformPost.socialAccountId
            externalAccountId = platformPost.externalAccountId
            externalPostId = platformPost.externalPostId
            metrics = platformPost.metrics
            platformData = platformPost.platformData
            postedAt = platformPost.postedAt
            socialPostId = platformPost.socialPostId
            socialPostResultId = platformPost.socialPostResultId
            additionalProperties = platformPost.additionalProperties.toMutableMap()
        }

        /** Caption or text content of the post */
        fun caption(caption: String) = caption(JsonField.of(caption))

        /**
         * Sets [Builder.caption] to an arbitrary JSON value.
         *
         * You should usually call [Builder.caption] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun caption(caption: JsonField<String>) = apply { this.caption = caption }

        /** Array of media items attached to the post */
        fun media(media: List<List<JsonValue>>) = media(JsonField.of(media))

        /**
         * Sets [Builder.media] to an arbitrary JSON value.
         *
         * You should usually call [Builder.media] with a well-typed `List<List<JsonValue>>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun media(media: JsonField<List<List<JsonValue>>>) = apply {
            this.media = media.map { it.toMutableList() }
        }

        /**
         * Adds a single [List<JsonValue>] to [Builder.media].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMedia(media: List<JsonValue>) = apply {
            this.media =
                (this.media ?: JsonField.of(mutableListOf())).also {
                    checkKnown("media", it).add(media)
                }
        }

        /** Social media platform name */
        fun platform(platform: String) = platform(JsonField.of(platform))

        /**
         * Sets [Builder.platform] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platform] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun platform(platform: JsonField<String>) = apply { this.platform = platform }

        /** Platform-specific account ID */
        fun platformAccountId(platformAccountId: String) =
            platformAccountId(JsonField.of(platformAccountId))

        /**
         * Sets [Builder.platformAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun platformAccountId(platformAccountId: JsonField<String>) = apply {
            this.platformAccountId = platformAccountId
        }

        /** Platform-specific post ID */
        fun platformPostId(platformPostId: String) = platformPostId(JsonField.of(platformPostId))

        /**
         * Sets [Builder.platformPostId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformPostId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun platformPostId(platformPostId: JsonField<String>) = apply {
            this.platformPostId = platformPostId
        }

        /** URL to the post on the platform */
        fun platformUrl(platformUrl: String) = platformUrl(JsonField.of(platformUrl))

        /**
         * Sets [Builder.platformUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun platformUrl(platformUrl: JsonField<String>) = apply { this.platformUrl = platformUrl }

        /** ID of the social account */
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

        /** External account ID from the platform */
        fun externalAccountId(externalAccountId: String?) =
            externalAccountId(JsonField.ofNullable(externalAccountId))

        /**
         * Sets [Builder.externalAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalAccountId(externalAccountId: JsonField<String>) = apply {
            this.externalAccountId = externalAccountId
        }

        /** External post ID from the platform */
        fun externalPostId(externalPostId: String?) =
            externalPostId(JsonField.ofNullable(externalPostId))

        /**
         * Sets [Builder.externalPostId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalPostId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalPostId(externalPostId: JsonField<String>) = apply {
            this.externalPostId = externalPostId
        }

        /** Post metrics and analytics data */
        fun metrics(metrics: Metrics) = metrics(JsonField.of(metrics))

        /**
         * Sets [Builder.metrics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metrics] with a well-typed [Metrics] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun metrics(metrics: JsonField<Metrics>) = apply { this.metrics = metrics }

        /**
         * Alias for calling [metrics] with
         * `Metrics.ofTikTokBusinessMetricsDto(tikTokBusinessMetricsDto)`.
         */
        fun metrics(tikTokBusinessMetricsDto: Metrics.TikTokBusinessMetricsDto) =
            metrics(Metrics.ofTikTokBusinessMetricsDto(tikTokBusinessMetricsDto))

        /**
         * Alias for calling [metrics] with `Metrics.ofTikTokPostMetricsDto(tikTokPostMetricsDto)`.
         */
        fun metrics(tikTokPostMetricsDto: Metrics.TikTokPostMetricsDto) =
            metrics(Metrics.ofTikTokPostMetricsDto(tikTokPostMetricsDto))

        /**
         * Alias for calling [metrics] with
         * `Metrics.ofInstagramPostMetricsDto(instagramPostMetricsDto)`.
         */
        fun metrics(instagramPostMetricsDto: Metrics.InstagramPostMetricsDto) =
            metrics(Metrics.ofInstagramPostMetricsDto(instagramPostMetricsDto))

        /**
         * Alias for calling [metrics] with
         * `Metrics.ofYouTubePostMetricsDto(youTubePostMetricsDto)`.
         */
        fun metrics(youTubePostMetricsDto: Metrics.YouTubePostMetricsDto) =
            metrics(Metrics.ofYouTubePostMetricsDto(youTubePostMetricsDto))

        /**
         * Alias for calling [metrics] with
         * `Metrics.ofFacebookPostMetricsDto(facebookPostMetricsDto)`.
         */
        fun metrics(facebookPostMetricsDto: Metrics.FacebookPostMetricsDto) =
            metrics(Metrics.ofFacebookPostMetricsDto(facebookPostMetricsDto))

        /**
         * Alias for calling [metrics] with
         * `Metrics.ofTwitterPostMetricsDto(twitterPostMetricsDto)`.
         */
        fun metrics(twitterPostMetricsDto: Metrics.TwitterPostMetricsDto) =
            metrics(Metrics.ofTwitterPostMetricsDto(twitterPostMetricsDto))

        /**
         * Alias for calling [metrics] with
         * `Metrics.ofThreadsPostMetricsDto(threadsPostMetricsDto)`.
         */
        fun metrics(threadsPostMetricsDto: Metrics.ThreadsPostMetricsDto) =
            metrics(Metrics.ofThreadsPostMetricsDto(threadsPostMetricsDto))

        /**
         * Alias for calling [metrics] with
         * `Metrics.ofLinkedInPostMetricsDto(linkedInPostMetricsDto)`.
         */
        fun metrics(linkedInPostMetricsDto: Metrics.LinkedInPostMetricsDto) =
            metrics(Metrics.ofLinkedInPostMetricsDto(linkedInPostMetricsDto))

        /**
         * Alias for calling [metrics] with
         * `Metrics.ofBlueskyPostMetricsDto(blueskyPostMetricsDto)`.
         */
        fun metrics(blueskyPostMetricsDto: Metrics.BlueskyPostMetricsDto) =
            metrics(Metrics.ofBlueskyPostMetricsDto(blueskyPostMetricsDto))

        /**
         * Alias for calling [metrics] with
         * `Metrics.ofPinterestPostMetricsDto(pinterestPostMetricsDto)`.
         */
        fun metrics(pinterestPostMetricsDto: Metrics.PinterestPostMetricsDto) =
            metrics(Metrics.ofPinterestPostMetricsDto(pinterestPostMetricsDto))

        /** Platform-specific data for the post */
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

        /** Date the post was published */
        fun postedAt(postedAt: OffsetDateTime) = postedAt(JsonField.of(postedAt))

        /**
         * Sets [Builder.postedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun postedAt(postedAt: JsonField<OffsetDateTime>) = apply { this.postedAt = postedAt }

        /** ID of the social post */
        fun socialPostId(socialPostId: String?) = socialPostId(JsonField.ofNullable(socialPostId))

        /**
         * Sets [Builder.socialPostId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.socialPostId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun socialPostId(socialPostId: JsonField<String>) = apply {
            this.socialPostId = socialPostId
        }

        /** ID of the social post result */
        fun socialPostResultId(socialPostResultId: String?) =
            socialPostResultId(JsonField.ofNullable(socialPostResultId))

        /**
         * Sets [Builder.socialPostResultId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.socialPostResultId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun socialPostResultId(socialPostResultId: JsonField<String>) = apply {
            this.socialPostResultId = socialPostResultId
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
         * Returns an immutable instance of [PlatformPost].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .caption()
         * .media()
         * .platform()
         * .platformAccountId()
         * .platformPostId()
         * .platformUrl()
         * .socialAccountId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlatformPost =
            PlatformPost(
                checkRequired("caption", caption),
                checkRequired("media", media).map { it.toImmutable() },
                checkRequired("platform", platform),
                checkRequired("platformAccountId", platformAccountId),
                checkRequired("platformPostId", platformPostId),
                checkRequired("platformUrl", platformUrl),
                checkRequired("socialAccountId", socialAccountId),
                externalAccountId,
                externalPostId,
                metrics,
                platformData,
                postedAt,
                socialPostId,
                socialPostResultId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws PostForMeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): PlatformPost = apply {
        if (validated) {
            return@apply
        }

        caption()
        media()
        platform()
        platformAccountId()
        platformPostId()
        platformUrl()
        socialAccountId()
        externalAccountId()
        externalPostId()
        metrics()?.validate()
        platformData()?.validate()
        postedAt()
        socialPostId()
        socialPostResultId()
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
            (media.asKnown()?.sumOf { it.size.toInt() } ?: 0) +
            (if (platform.asKnown() == null) 0 else 1) +
            (if (platformAccountId.asKnown() == null) 0 else 1) +
            (if (platformPostId.asKnown() == null) 0 else 1) +
            (if (platformUrl.asKnown() == null) 0 else 1) +
            (if (socialAccountId.asKnown() == null) 0 else 1) +
            (if (externalAccountId.asKnown() == null) 0 else 1) +
            (if (externalPostId.asKnown() == null) 0 else 1) +
            (metrics.asKnown()?.validity() ?: 0) +
            (platformData.asKnown()?.validity() ?: 0) +
            (if (postedAt.asKnown() == null) 0 else 1) +
            (if (socialPostId.asKnown() == null) 0 else 1) +
            (if (socialPostResultId.asKnown() == null) 0 else 1)

    /** Post metrics and analytics data */
    @JsonDeserialize(using = Metrics.Deserializer::class)
    @JsonSerialize(using = Metrics.Serializer::class)
    class Metrics
    private constructor(
        private val tikTokBusinessMetricsDto: TikTokBusinessMetricsDto? = null,
        private val tikTokPostMetricsDto: TikTokPostMetricsDto? = null,
        private val instagramPostMetricsDto: InstagramPostMetricsDto? = null,
        private val youTubePostMetricsDto: YouTubePostMetricsDto? = null,
        private val facebookPostMetricsDto: FacebookPostMetricsDto? = null,
        private val twitterPostMetricsDto: TwitterPostMetricsDto? = null,
        private val threadsPostMetricsDto: ThreadsPostMetricsDto? = null,
        private val linkedInPostMetricsDto: LinkedInPostMetricsDto? = null,
        private val blueskyPostMetricsDto: BlueskyPostMetricsDto? = null,
        private val pinterestPostMetricsDto: PinterestPostMetricsDto? = null,
        private val _json: JsonValue? = null,
    ) {

        fun tikTokBusinessMetricsDto(): TikTokBusinessMetricsDto? = tikTokBusinessMetricsDto

        fun tikTokPostMetricsDto(): TikTokPostMetricsDto? = tikTokPostMetricsDto

        fun instagramPostMetricsDto(): InstagramPostMetricsDto? = instagramPostMetricsDto

        fun youTubePostMetricsDto(): YouTubePostMetricsDto? = youTubePostMetricsDto

        fun facebookPostMetricsDto(): FacebookPostMetricsDto? = facebookPostMetricsDto

        fun twitterPostMetricsDto(): TwitterPostMetricsDto? = twitterPostMetricsDto

        fun threadsPostMetricsDto(): ThreadsPostMetricsDto? = threadsPostMetricsDto

        fun linkedInPostMetricsDto(): LinkedInPostMetricsDto? = linkedInPostMetricsDto

        fun blueskyPostMetricsDto(): BlueskyPostMetricsDto? = blueskyPostMetricsDto

        fun pinterestPostMetricsDto(): PinterestPostMetricsDto? = pinterestPostMetricsDto

        fun isTikTokBusinessMetricsDto(): Boolean = tikTokBusinessMetricsDto != null

        fun isTikTokPostMetricsDto(): Boolean = tikTokPostMetricsDto != null

        fun isInstagramPostMetricsDto(): Boolean = instagramPostMetricsDto != null

        fun isYouTubePostMetricsDto(): Boolean = youTubePostMetricsDto != null

        fun isFacebookPostMetricsDto(): Boolean = facebookPostMetricsDto != null

        fun isTwitterPostMetricsDto(): Boolean = twitterPostMetricsDto != null

        fun isThreadsPostMetricsDto(): Boolean = threadsPostMetricsDto != null

        fun isLinkedInPostMetricsDto(): Boolean = linkedInPostMetricsDto != null

        fun isBlueskyPostMetricsDto(): Boolean = blueskyPostMetricsDto != null

        fun isPinterestPostMetricsDto(): Boolean = pinterestPostMetricsDto != null

        fun asTikTokBusinessMetricsDto(): TikTokBusinessMetricsDto =
            tikTokBusinessMetricsDto.getOrThrow("tikTokBusinessMetricsDto")

        fun asTikTokPostMetricsDto(): TikTokPostMetricsDto =
            tikTokPostMetricsDto.getOrThrow("tikTokPostMetricsDto")

        fun asInstagramPostMetricsDto(): InstagramPostMetricsDto =
            instagramPostMetricsDto.getOrThrow("instagramPostMetricsDto")

        fun asYouTubePostMetricsDto(): YouTubePostMetricsDto =
            youTubePostMetricsDto.getOrThrow("youTubePostMetricsDto")

        fun asFacebookPostMetricsDto(): FacebookPostMetricsDto =
            facebookPostMetricsDto.getOrThrow("facebookPostMetricsDto")

        fun asTwitterPostMetricsDto(): TwitterPostMetricsDto =
            twitterPostMetricsDto.getOrThrow("twitterPostMetricsDto")

        fun asThreadsPostMetricsDto(): ThreadsPostMetricsDto =
            threadsPostMetricsDto.getOrThrow("threadsPostMetricsDto")

        fun asLinkedInPostMetricsDto(): LinkedInPostMetricsDto =
            linkedInPostMetricsDto.getOrThrow("linkedInPostMetricsDto")

        fun asBlueskyPostMetricsDto(): BlueskyPostMetricsDto =
            blueskyPostMetricsDto.getOrThrow("blueskyPostMetricsDto")

        fun asPinterestPostMetricsDto(): PinterestPostMetricsDto =
            pinterestPostMetricsDto.getOrThrow("pinterestPostMetricsDto")

        fun _json(): JsonValue? = _json

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```kotlin
         * import com.post_for_me.api.core.JsonValue
         *
         * val result: String? = metrics.accept(object : Metrics.Visitor<String?> {
         *     override fun visitTikTokBusinessMetricsDto(tikTokBusinessMetricsDto: TikTokBusinessMetricsDto): String? = tikTokBusinessMetricsDto.toString()
         *
         *     // ...
         *
         *     override fun unknown(json: JsonValue?): String? {
         *         // Or inspect the `json`.
         *         return null
         *     }
         * })
         * ```
         *
         * @throws PostForMeInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                tikTokBusinessMetricsDto != null ->
                    visitor.visitTikTokBusinessMetricsDto(tikTokBusinessMetricsDto)
                tikTokPostMetricsDto != null ->
                    visitor.visitTikTokPostMetricsDto(tikTokPostMetricsDto)
                instagramPostMetricsDto != null ->
                    visitor.visitInstagramPostMetricsDto(instagramPostMetricsDto)
                youTubePostMetricsDto != null ->
                    visitor.visitYouTubePostMetricsDto(youTubePostMetricsDto)
                facebookPostMetricsDto != null ->
                    visitor.visitFacebookPostMetricsDto(facebookPostMetricsDto)
                twitterPostMetricsDto != null ->
                    visitor.visitTwitterPostMetricsDto(twitterPostMetricsDto)
                threadsPostMetricsDto != null ->
                    visitor.visitThreadsPostMetricsDto(threadsPostMetricsDto)
                linkedInPostMetricsDto != null ->
                    visitor.visitLinkedInPostMetricsDto(linkedInPostMetricsDto)
                blueskyPostMetricsDto != null ->
                    visitor.visitBlueskyPostMetricsDto(blueskyPostMetricsDto)
                pinterestPostMetricsDto != null ->
                    visitor.visitPinterestPostMetricsDto(pinterestPostMetricsDto)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws PostForMeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Metrics = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitTikTokBusinessMetricsDto(
                        tikTokBusinessMetricsDto: TikTokBusinessMetricsDto
                    ) {
                        tikTokBusinessMetricsDto.validate()
                    }

                    override fun visitTikTokPostMetricsDto(
                        tikTokPostMetricsDto: TikTokPostMetricsDto
                    ) {
                        tikTokPostMetricsDto.validate()
                    }

                    override fun visitInstagramPostMetricsDto(
                        instagramPostMetricsDto: InstagramPostMetricsDto
                    ) {
                        instagramPostMetricsDto.validate()
                    }

                    override fun visitYouTubePostMetricsDto(
                        youTubePostMetricsDto: YouTubePostMetricsDto
                    ) {
                        youTubePostMetricsDto.validate()
                    }

                    override fun visitFacebookPostMetricsDto(
                        facebookPostMetricsDto: FacebookPostMetricsDto
                    ) {
                        facebookPostMetricsDto.validate()
                    }

                    override fun visitTwitterPostMetricsDto(
                        twitterPostMetricsDto: TwitterPostMetricsDto
                    ) {
                        twitterPostMetricsDto.validate()
                    }

                    override fun visitThreadsPostMetricsDto(
                        threadsPostMetricsDto: ThreadsPostMetricsDto
                    ) {
                        threadsPostMetricsDto.validate()
                    }

                    override fun visitLinkedInPostMetricsDto(
                        linkedInPostMetricsDto: LinkedInPostMetricsDto
                    ) {
                        linkedInPostMetricsDto.validate()
                    }

                    override fun visitBlueskyPostMetricsDto(
                        blueskyPostMetricsDto: BlueskyPostMetricsDto
                    ) {
                        blueskyPostMetricsDto.validate()
                    }

                    override fun visitPinterestPostMetricsDto(
                        pinterestPostMetricsDto: PinterestPostMetricsDto
                    ) {
                        pinterestPostMetricsDto.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitTikTokBusinessMetricsDto(
                        tikTokBusinessMetricsDto: TikTokBusinessMetricsDto
                    ) = tikTokBusinessMetricsDto.validity()

                    override fun visitTikTokPostMetricsDto(
                        tikTokPostMetricsDto: TikTokPostMetricsDto
                    ) = tikTokPostMetricsDto.validity()

                    override fun visitInstagramPostMetricsDto(
                        instagramPostMetricsDto: InstagramPostMetricsDto
                    ) = instagramPostMetricsDto.validity()

                    override fun visitYouTubePostMetricsDto(
                        youTubePostMetricsDto: YouTubePostMetricsDto
                    ) = youTubePostMetricsDto.validity()

                    override fun visitFacebookPostMetricsDto(
                        facebookPostMetricsDto: FacebookPostMetricsDto
                    ) = facebookPostMetricsDto.validity()

                    override fun visitTwitterPostMetricsDto(
                        twitterPostMetricsDto: TwitterPostMetricsDto
                    ) = twitterPostMetricsDto.validity()

                    override fun visitThreadsPostMetricsDto(
                        threadsPostMetricsDto: ThreadsPostMetricsDto
                    ) = threadsPostMetricsDto.validity()

                    override fun visitLinkedInPostMetricsDto(
                        linkedInPostMetricsDto: LinkedInPostMetricsDto
                    ) = linkedInPostMetricsDto.validity()

                    override fun visitBlueskyPostMetricsDto(
                        blueskyPostMetricsDto: BlueskyPostMetricsDto
                    ) = blueskyPostMetricsDto.validity()

                    override fun visitPinterestPostMetricsDto(
                        pinterestPostMetricsDto: PinterestPostMetricsDto
                    ) = pinterestPostMetricsDto.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metrics &&
                tikTokBusinessMetricsDto == other.tikTokBusinessMetricsDto &&
                tikTokPostMetricsDto == other.tikTokPostMetricsDto &&
                instagramPostMetricsDto == other.instagramPostMetricsDto &&
                youTubePostMetricsDto == other.youTubePostMetricsDto &&
                facebookPostMetricsDto == other.facebookPostMetricsDto &&
                twitterPostMetricsDto == other.twitterPostMetricsDto &&
                threadsPostMetricsDto == other.threadsPostMetricsDto &&
                linkedInPostMetricsDto == other.linkedInPostMetricsDto &&
                blueskyPostMetricsDto == other.blueskyPostMetricsDto &&
                pinterestPostMetricsDto == other.pinterestPostMetricsDto
        }

        override fun hashCode(): Int =
            Objects.hash(
                tikTokBusinessMetricsDto,
                tikTokPostMetricsDto,
                instagramPostMetricsDto,
                youTubePostMetricsDto,
                facebookPostMetricsDto,
                twitterPostMetricsDto,
                threadsPostMetricsDto,
                linkedInPostMetricsDto,
                blueskyPostMetricsDto,
                pinterestPostMetricsDto,
            )

        override fun toString(): String =
            when {
                tikTokBusinessMetricsDto != null ->
                    "Metrics{tikTokBusinessMetricsDto=$tikTokBusinessMetricsDto}"
                tikTokPostMetricsDto != null ->
                    "Metrics{tikTokPostMetricsDto=$tikTokPostMetricsDto}"
                instagramPostMetricsDto != null ->
                    "Metrics{instagramPostMetricsDto=$instagramPostMetricsDto}"
                youTubePostMetricsDto != null ->
                    "Metrics{youTubePostMetricsDto=$youTubePostMetricsDto}"
                facebookPostMetricsDto != null ->
                    "Metrics{facebookPostMetricsDto=$facebookPostMetricsDto}"
                twitterPostMetricsDto != null ->
                    "Metrics{twitterPostMetricsDto=$twitterPostMetricsDto}"
                threadsPostMetricsDto != null ->
                    "Metrics{threadsPostMetricsDto=$threadsPostMetricsDto}"
                linkedInPostMetricsDto != null ->
                    "Metrics{linkedInPostMetricsDto=$linkedInPostMetricsDto}"
                blueskyPostMetricsDto != null ->
                    "Metrics{blueskyPostMetricsDto=$blueskyPostMetricsDto}"
                pinterestPostMetricsDto != null ->
                    "Metrics{pinterestPostMetricsDto=$pinterestPostMetricsDto}"
                _json != null -> "Metrics{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Metrics")
            }

        companion object {

            fun ofTikTokBusinessMetricsDto(tikTokBusinessMetricsDto: TikTokBusinessMetricsDto) =
                Metrics(tikTokBusinessMetricsDto = tikTokBusinessMetricsDto)

            fun ofTikTokPostMetricsDto(tikTokPostMetricsDto: TikTokPostMetricsDto) =
                Metrics(tikTokPostMetricsDto = tikTokPostMetricsDto)

            fun ofInstagramPostMetricsDto(instagramPostMetricsDto: InstagramPostMetricsDto) =
                Metrics(instagramPostMetricsDto = instagramPostMetricsDto)

            fun ofYouTubePostMetricsDto(youTubePostMetricsDto: YouTubePostMetricsDto) =
                Metrics(youTubePostMetricsDto = youTubePostMetricsDto)

            fun ofFacebookPostMetricsDto(facebookPostMetricsDto: FacebookPostMetricsDto) =
                Metrics(facebookPostMetricsDto = facebookPostMetricsDto)

            fun ofTwitterPostMetricsDto(twitterPostMetricsDto: TwitterPostMetricsDto) =
                Metrics(twitterPostMetricsDto = twitterPostMetricsDto)

            fun ofThreadsPostMetricsDto(threadsPostMetricsDto: ThreadsPostMetricsDto) =
                Metrics(threadsPostMetricsDto = threadsPostMetricsDto)

            fun ofLinkedInPostMetricsDto(linkedInPostMetricsDto: LinkedInPostMetricsDto) =
                Metrics(linkedInPostMetricsDto = linkedInPostMetricsDto)

            fun ofBlueskyPostMetricsDto(blueskyPostMetricsDto: BlueskyPostMetricsDto) =
                Metrics(blueskyPostMetricsDto = blueskyPostMetricsDto)

            fun ofPinterestPostMetricsDto(pinterestPostMetricsDto: PinterestPostMetricsDto) =
                Metrics(pinterestPostMetricsDto = pinterestPostMetricsDto)
        }

        /**
         * An interface that defines how to map each variant of [Metrics] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitTikTokBusinessMetricsDto(tikTokBusinessMetricsDto: TikTokBusinessMetricsDto): T

            fun visitTikTokPostMetricsDto(tikTokPostMetricsDto: TikTokPostMetricsDto): T

            fun visitInstagramPostMetricsDto(instagramPostMetricsDto: InstagramPostMetricsDto): T

            fun visitYouTubePostMetricsDto(youTubePostMetricsDto: YouTubePostMetricsDto): T

            fun visitFacebookPostMetricsDto(facebookPostMetricsDto: FacebookPostMetricsDto): T

            fun visitTwitterPostMetricsDto(twitterPostMetricsDto: TwitterPostMetricsDto): T

            fun visitThreadsPostMetricsDto(threadsPostMetricsDto: ThreadsPostMetricsDto): T

            fun visitLinkedInPostMetricsDto(linkedInPostMetricsDto: LinkedInPostMetricsDto): T

            fun visitBlueskyPostMetricsDto(blueskyPostMetricsDto: BlueskyPostMetricsDto): T

            fun visitPinterestPostMetricsDto(pinterestPostMetricsDto: PinterestPostMetricsDto): T

            /**
             * Maps an unknown variant of [Metrics] to a value of type [T].
             *
             * An instance of [Metrics] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws PostForMeInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw PostForMeInvalidDataException("Unknown Metrics: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Metrics>(Metrics::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Metrics {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<TikTokBusinessMetricsDto>())?.let {
                                Metrics(tikTokBusinessMetricsDto = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TikTokPostMetricsDto>())?.let {
                                Metrics(tikTokPostMetricsDto = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<InstagramPostMetricsDto>())?.let {
                                Metrics(instagramPostMetricsDto = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<YouTubePostMetricsDto>())?.let {
                                Metrics(youTubePostMetricsDto = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FacebookPostMetricsDto>())?.let {
                                Metrics(facebookPostMetricsDto = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TwitterPostMetricsDto>())?.let {
                                Metrics(twitterPostMetricsDto = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ThreadsPostMetricsDto>())?.let {
                                Metrics(threadsPostMetricsDto = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LinkedInPostMetricsDto>())?.let {
                                Metrics(linkedInPostMetricsDto = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<BlueskyPostMetricsDto>())?.let {
                                Metrics(blueskyPostMetricsDto = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PinterestPostMetricsDto>())?.let {
                                Metrics(pinterestPostMetricsDto = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Metrics(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Metrics>(Metrics::class) {

            override fun serialize(
                value: Metrics,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.tikTokBusinessMetricsDto != null ->
                        generator.writeObject(value.tikTokBusinessMetricsDto)
                    value.tikTokPostMetricsDto != null ->
                        generator.writeObject(value.tikTokPostMetricsDto)
                    value.instagramPostMetricsDto != null ->
                        generator.writeObject(value.instagramPostMetricsDto)
                    value.youTubePostMetricsDto != null ->
                        generator.writeObject(value.youTubePostMetricsDto)
                    value.facebookPostMetricsDto != null ->
                        generator.writeObject(value.facebookPostMetricsDto)
                    value.twitterPostMetricsDto != null ->
                        generator.writeObject(value.twitterPostMetricsDto)
                    value.threadsPostMetricsDto != null ->
                        generator.writeObject(value.threadsPostMetricsDto)
                    value.linkedInPostMetricsDto != null ->
                        generator.writeObject(value.linkedInPostMetricsDto)
                    value.blueskyPostMetricsDto != null ->
                        generator.writeObject(value.blueskyPostMetricsDto)
                    value.pinterestPostMetricsDto != null ->
                        generator.writeObject(value.pinterestPostMetricsDto)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Metrics")
                }
            }
        }

        class TikTokBusinessMetricsDto
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val addressClicks: JsonField<Double>,
            private val appDownloadClicks: JsonField<Double>,
            private val audienceCities: JsonField<List<AudienceCity>>,
            private val audienceCountries: JsonField<List<AudienceCountry>>,
            private val audienceGenders: JsonField<List<AudienceGender>>,
            private val audienceTypes: JsonField<List<AudienceType>>,
            private val averageTimeWatched: JsonField<Double>,
            private val comments: JsonField<Double>,
            private val emailClicks: JsonField<Double>,
            private val engagementLikes: JsonField<List<EngagementLike>>,
            private val favorites: JsonField<Double>,
            private val fullVideoWatchedRate: JsonField<Double>,
            private val impressionSources: JsonField<List<ImpressionSource>>,
            private val leadSubmissions: JsonField<Double>,
            private val likes: JsonField<Double>,
            private val newFollowers: JsonField<Double>,
            private val phoneNumberClicks: JsonField<Double>,
            private val profileViews: JsonField<Double>,
            private val reach: JsonField<Double>,
            private val shares: JsonField<Double>,
            private val totalTimeWatched: JsonField<Double>,
            private val videoViewRetention: JsonField<List<VideoViewRetention>>,
            private val videoViews: JsonField<Double>,
            private val websiteClicks: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("address_clicks")
                @ExcludeMissing
                addressClicks: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("app_download_clicks")
                @ExcludeMissing
                appDownloadClicks: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("audience_cities")
                @ExcludeMissing
                audienceCities: JsonField<List<AudienceCity>> = JsonMissing.of(),
                @JsonProperty("audience_countries")
                @ExcludeMissing
                audienceCountries: JsonField<List<AudienceCountry>> = JsonMissing.of(),
                @JsonProperty("audience_genders")
                @ExcludeMissing
                audienceGenders: JsonField<List<AudienceGender>> = JsonMissing.of(),
                @JsonProperty("audience_types")
                @ExcludeMissing
                audienceTypes: JsonField<List<AudienceType>> = JsonMissing.of(),
                @JsonProperty("average_time_watched")
                @ExcludeMissing
                averageTimeWatched: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("comments")
                @ExcludeMissing
                comments: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("email_clicks")
                @ExcludeMissing
                emailClicks: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("engagement_likes")
                @ExcludeMissing
                engagementLikes: JsonField<List<EngagementLike>> = JsonMissing.of(),
                @JsonProperty("favorites")
                @ExcludeMissing
                favorites: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("full_video_watched_rate")
                @ExcludeMissing
                fullVideoWatchedRate: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("impression_sources")
                @ExcludeMissing
                impressionSources: JsonField<List<ImpressionSource>> = JsonMissing.of(),
                @JsonProperty("lead_submissions")
                @ExcludeMissing
                leadSubmissions: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("likes") @ExcludeMissing likes: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("new_followers")
                @ExcludeMissing
                newFollowers: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("phone_number_clicks")
                @ExcludeMissing
                phoneNumberClicks: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("profile_views")
                @ExcludeMissing
                profileViews: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reach") @ExcludeMissing reach: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("shares")
                @ExcludeMissing
                shares: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("total_time_watched")
                @ExcludeMissing
                totalTimeWatched: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_view_retention")
                @ExcludeMissing
                videoViewRetention: JsonField<List<VideoViewRetention>> = JsonMissing.of(),
                @JsonProperty("video_views")
                @ExcludeMissing
                videoViews: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("website_clicks")
                @ExcludeMissing
                websiteClicks: JsonField<Double> = JsonMissing.of(),
            ) : this(
                addressClicks,
                appDownloadClicks,
                audienceCities,
                audienceCountries,
                audienceGenders,
                audienceTypes,
                averageTimeWatched,
                comments,
                emailClicks,
                engagementLikes,
                favorites,
                fullVideoWatchedRate,
                impressionSources,
                leadSubmissions,
                likes,
                newFollowers,
                phoneNumberClicks,
                profileViews,
                reach,
                shares,
                totalTimeWatched,
                videoViewRetention,
                videoViews,
                websiteClicks,
                mutableMapOf(),
            )

            /**
             * Number of address clicks
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun addressClicks(): Double = addressClicks.getRequired("address_clicks")

            /**
             * Number of app download clicks
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun appDownloadClicks(): Double = appDownloadClicks.getRequired("app_download_clicks")

            /**
             * Audience cities breakdown
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun audienceCities(): List<AudienceCity> = audienceCities.getRequired("audience_cities")

            /**
             * Audience countries breakdown
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun audienceCountries(): List<AudienceCountry> =
                audienceCountries.getRequired("audience_countries")

            /**
             * Audience genders breakdown
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun audienceGenders(): List<AudienceGender> =
                audienceGenders.getRequired("audience_genders")

            /**
             * Audience types breakdown
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun audienceTypes(): List<AudienceType> = audienceTypes.getRequired("audience_types")

            /**
             * Average time watched in seconds
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun averageTimeWatched(): Double =
                averageTimeWatched.getRequired("average_time_watched")

            /**
             * Number of comments on the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun comments(): Double = comments.getRequired("comments")

            /**
             * Number of email clicks
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun emailClicks(): Double = emailClicks.getRequired("email_clicks")

            /**
             * Engagement likes data by percentage and time
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun engagementLikes(): List<EngagementLike> =
                engagementLikes.getRequired("engagement_likes")

            /**
             * Number of favorites on the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun favorites(): Double = favorites.getRequired("favorites")

            /**
             * Rate of full video watches as a percentage
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun fullVideoWatchedRate(): Double =
                fullVideoWatchedRate.getRequired("full_video_watched_rate")

            /**
             * Impression sources breakdown
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun impressionSources(): List<ImpressionSource> =
                impressionSources.getRequired("impression_sources")

            /**
             * Number of lead submissions
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun leadSubmissions(): Double = leadSubmissions.getRequired("lead_submissions")

            /**
             * Number of likes on the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun likes(): Double = likes.getRequired("likes")

            /**
             * Number of new followers gained from the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun newFollowers(): Double = newFollowers.getRequired("new_followers")

            /**
             * Number of phone number clicks
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumberClicks(): Double = phoneNumberClicks.getRequired("phone_number_clicks")

            /**
             * Number of profile views generated
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun profileViews(): Double = profileViews.getRequired("profile_views")

            /**
             * Total reach of the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reach(): Double = reach.getRequired("reach")

            /**
             * Number of shares on the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun shares(): Double = shares.getRequired("shares")

            /**
             * Total time watched in seconds
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun totalTimeWatched(): Double = totalTimeWatched.getRequired("total_time_watched")

            /**
             * Video view retention data by percentage and time
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun videoViewRetention(): List<VideoViewRetention> =
                videoViewRetention.getRequired("video_view_retention")

            /**
             * Total number of video views
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun videoViews(): Double = videoViews.getRequired("video_views")

            /**
             * Number of website clicks
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun websiteClicks(): Double = websiteClicks.getRequired("website_clicks")

            /**
             * Returns the raw JSON value of [addressClicks].
             *
             * Unlike [addressClicks], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("address_clicks")
            @ExcludeMissing
            fun _addressClicks(): JsonField<Double> = addressClicks

            /**
             * Returns the raw JSON value of [appDownloadClicks].
             *
             * Unlike [appDownloadClicks], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("app_download_clicks")
            @ExcludeMissing
            fun _appDownloadClicks(): JsonField<Double> = appDownloadClicks

            /**
             * Returns the raw JSON value of [audienceCities].
             *
             * Unlike [audienceCities], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("audience_cities")
            @ExcludeMissing
            fun _audienceCities(): JsonField<List<AudienceCity>> = audienceCities

            /**
             * Returns the raw JSON value of [audienceCountries].
             *
             * Unlike [audienceCountries], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("audience_countries")
            @ExcludeMissing
            fun _audienceCountries(): JsonField<List<AudienceCountry>> = audienceCountries

            /**
             * Returns the raw JSON value of [audienceGenders].
             *
             * Unlike [audienceGenders], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("audience_genders")
            @ExcludeMissing
            fun _audienceGenders(): JsonField<List<AudienceGender>> = audienceGenders

            /**
             * Returns the raw JSON value of [audienceTypes].
             *
             * Unlike [audienceTypes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("audience_types")
            @ExcludeMissing
            fun _audienceTypes(): JsonField<List<AudienceType>> = audienceTypes

            /**
             * Returns the raw JSON value of [averageTimeWatched].
             *
             * Unlike [averageTimeWatched], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("average_time_watched")
            @ExcludeMissing
            fun _averageTimeWatched(): JsonField<Double> = averageTimeWatched

            /**
             * Returns the raw JSON value of [comments].
             *
             * Unlike [comments], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("comments") @ExcludeMissing fun _comments(): JsonField<Double> = comments

            /**
             * Returns the raw JSON value of [emailClicks].
             *
             * Unlike [emailClicks], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("email_clicks")
            @ExcludeMissing
            fun _emailClicks(): JsonField<Double> = emailClicks

            /**
             * Returns the raw JSON value of [engagementLikes].
             *
             * Unlike [engagementLikes], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("engagement_likes")
            @ExcludeMissing
            fun _engagementLikes(): JsonField<List<EngagementLike>> = engagementLikes

            /**
             * Returns the raw JSON value of [favorites].
             *
             * Unlike [favorites], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("favorites")
            @ExcludeMissing
            fun _favorites(): JsonField<Double> = favorites

            /**
             * Returns the raw JSON value of [fullVideoWatchedRate].
             *
             * Unlike [fullVideoWatchedRate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("full_video_watched_rate")
            @ExcludeMissing
            fun _fullVideoWatchedRate(): JsonField<Double> = fullVideoWatchedRate

            /**
             * Returns the raw JSON value of [impressionSources].
             *
             * Unlike [impressionSources], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("impression_sources")
            @ExcludeMissing
            fun _impressionSources(): JsonField<List<ImpressionSource>> = impressionSources

            /**
             * Returns the raw JSON value of [leadSubmissions].
             *
             * Unlike [leadSubmissions], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("lead_submissions")
            @ExcludeMissing
            fun _leadSubmissions(): JsonField<Double> = leadSubmissions

            /**
             * Returns the raw JSON value of [likes].
             *
             * Unlike [likes], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("likes") @ExcludeMissing fun _likes(): JsonField<Double> = likes

            /**
             * Returns the raw JSON value of [newFollowers].
             *
             * Unlike [newFollowers], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("new_followers")
            @ExcludeMissing
            fun _newFollowers(): JsonField<Double> = newFollowers

            /**
             * Returns the raw JSON value of [phoneNumberClicks].
             *
             * Unlike [phoneNumberClicks], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("phone_number_clicks")
            @ExcludeMissing
            fun _phoneNumberClicks(): JsonField<Double> = phoneNumberClicks

            /**
             * Returns the raw JSON value of [profileViews].
             *
             * Unlike [profileViews], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("profile_views")
            @ExcludeMissing
            fun _profileViews(): JsonField<Double> = profileViews

            /**
             * Returns the raw JSON value of [reach].
             *
             * Unlike [reach], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reach") @ExcludeMissing fun _reach(): JsonField<Double> = reach

            /**
             * Returns the raw JSON value of [shares].
             *
             * Unlike [shares], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("shares") @ExcludeMissing fun _shares(): JsonField<Double> = shares

            /**
             * Returns the raw JSON value of [totalTimeWatched].
             *
             * Unlike [totalTimeWatched], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("total_time_watched")
            @ExcludeMissing
            fun _totalTimeWatched(): JsonField<Double> = totalTimeWatched

            /**
             * Returns the raw JSON value of [videoViewRetention].
             *
             * Unlike [videoViewRetention], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("video_view_retention")
            @ExcludeMissing
            fun _videoViewRetention(): JsonField<List<VideoViewRetention>> = videoViewRetention

            /**
             * Returns the raw JSON value of [videoViews].
             *
             * Unlike [videoViews], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("video_views")
            @ExcludeMissing
            fun _videoViews(): JsonField<Double> = videoViews

            /**
             * Returns the raw JSON value of [websiteClicks].
             *
             * Unlike [websiteClicks], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("website_clicks")
            @ExcludeMissing
            fun _websiteClicks(): JsonField<Double> = websiteClicks

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
                 * Returns a mutable builder for constructing an instance of
                 * [TikTokBusinessMetricsDto].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .addressClicks()
                 * .appDownloadClicks()
                 * .audienceCities()
                 * .audienceCountries()
                 * .audienceGenders()
                 * .audienceTypes()
                 * .averageTimeWatched()
                 * .comments()
                 * .emailClicks()
                 * .engagementLikes()
                 * .favorites()
                 * .fullVideoWatchedRate()
                 * .impressionSources()
                 * .leadSubmissions()
                 * .likes()
                 * .newFollowers()
                 * .phoneNumberClicks()
                 * .profileViews()
                 * .reach()
                 * .shares()
                 * .totalTimeWatched()
                 * .videoViewRetention()
                 * .videoViews()
                 * .websiteClicks()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [TikTokBusinessMetricsDto]. */
            class Builder internal constructor() {

                private var addressClicks: JsonField<Double>? = null
                private var appDownloadClicks: JsonField<Double>? = null
                private var audienceCities: JsonField<MutableList<AudienceCity>>? = null
                private var audienceCountries: JsonField<MutableList<AudienceCountry>>? = null
                private var audienceGenders: JsonField<MutableList<AudienceGender>>? = null
                private var audienceTypes: JsonField<MutableList<AudienceType>>? = null
                private var averageTimeWatched: JsonField<Double>? = null
                private var comments: JsonField<Double>? = null
                private var emailClicks: JsonField<Double>? = null
                private var engagementLikes: JsonField<MutableList<EngagementLike>>? = null
                private var favorites: JsonField<Double>? = null
                private var fullVideoWatchedRate: JsonField<Double>? = null
                private var impressionSources: JsonField<MutableList<ImpressionSource>>? = null
                private var leadSubmissions: JsonField<Double>? = null
                private var likes: JsonField<Double>? = null
                private var newFollowers: JsonField<Double>? = null
                private var phoneNumberClicks: JsonField<Double>? = null
                private var profileViews: JsonField<Double>? = null
                private var reach: JsonField<Double>? = null
                private var shares: JsonField<Double>? = null
                private var totalTimeWatched: JsonField<Double>? = null
                private var videoViewRetention: JsonField<MutableList<VideoViewRetention>>? = null
                private var videoViews: JsonField<Double>? = null
                private var websiteClicks: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tikTokBusinessMetricsDto: TikTokBusinessMetricsDto) = apply {
                    addressClicks = tikTokBusinessMetricsDto.addressClicks
                    appDownloadClicks = tikTokBusinessMetricsDto.appDownloadClicks
                    audienceCities =
                        tikTokBusinessMetricsDto.audienceCities.map { it.toMutableList() }
                    audienceCountries =
                        tikTokBusinessMetricsDto.audienceCountries.map { it.toMutableList() }
                    audienceGenders =
                        tikTokBusinessMetricsDto.audienceGenders.map { it.toMutableList() }
                    audienceTypes =
                        tikTokBusinessMetricsDto.audienceTypes.map { it.toMutableList() }
                    averageTimeWatched = tikTokBusinessMetricsDto.averageTimeWatched
                    comments = tikTokBusinessMetricsDto.comments
                    emailClicks = tikTokBusinessMetricsDto.emailClicks
                    engagementLikes =
                        tikTokBusinessMetricsDto.engagementLikes.map { it.toMutableList() }
                    favorites = tikTokBusinessMetricsDto.favorites
                    fullVideoWatchedRate = tikTokBusinessMetricsDto.fullVideoWatchedRate
                    impressionSources =
                        tikTokBusinessMetricsDto.impressionSources.map { it.toMutableList() }
                    leadSubmissions = tikTokBusinessMetricsDto.leadSubmissions
                    likes = tikTokBusinessMetricsDto.likes
                    newFollowers = tikTokBusinessMetricsDto.newFollowers
                    phoneNumberClicks = tikTokBusinessMetricsDto.phoneNumberClicks
                    profileViews = tikTokBusinessMetricsDto.profileViews
                    reach = tikTokBusinessMetricsDto.reach
                    shares = tikTokBusinessMetricsDto.shares
                    totalTimeWatched = tikTokBusinessMetricsDto.totalTimeWatched
                    videoViewRetention =
                        tikTokBusinessMetricsDto.videoViewRetention.map { it.toMutableList() }
                    videoViews = tikTokBusinessMetricsDto.videoViews
                    websiteClicks = tikTokBusinessMetricsDto.websiteClicks
                    additionalProperties =
                        tikTokBusinessMetricsDto.additionalProperties.toMutableMap()
                }

                /** Number of address clicks */
                fun addressClicks(addressClicks: Double) =
                    addressClicks(JsonField.of(addressClicks))

                /**
                 * Sets [Builder.addressClicks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.addressClicks] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun addressClicks(addressClicks: JsonField<Double>) = apply {
                    this.addressClicks = addressClicks
                }

                /** Number of app download clicks */
                fun appDownloadClicks(appDownloadClicks: Double) =
                    appDownloadClicks(JsonField.of(appDownloadClicks))

                /**
                 * Sets [Builder.appDownloadClicks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appDownloadClicks] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun appDownloadClicks(appDownloadClicks: JsonField<Double>) = apply {
                    this.appDownloadClicks = appDownloadClicks
                }

                /** Audience cities breakdown */
                fun audienceCities(audienceCities: List<AudienceCity>) =
                    audienceCities(JsonField.of(audienceCities))

                /**
                 * Sets [Builder.audienceCities] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.audienceCities] with a well-typed
                 * `List<AudienceCity>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun audienceCities(audienceCities: JsonField<List<AudienceCity>>) = apply {
                    this.audienceCities = audienceCities.map { it.toMutableList() }
                }

                /**
                 * Adds a single [AudienceCity] to [audienceCities].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAudienceCity(audienceCity: AudienceCity) = apply {
                    audienceCities =
                        (audienceCities ?: JsonField.of(mutableListOf())).also {
                            checkKnown("audienceCities", it).add(audienceCity)
                        }
                }

                /** Audience countries breakdown */
                fun audienceCountries(audienceCountries: List<AudienceCountry>) =
                    audienceCountries(JsonField.of(audienceCountries))

                /**
                 * Sets [Builder.audienceCountries] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.audienceCountries] with a well-typed
                 * `List<AudienceCountry>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun audienceCountries(audienceCountries: JsonField<List<AudienceCountry>>) = apply {
                    this.audienceCountries = audienceCountries.map { it.toMutableList() }
                }

                /**
                 * Adds a single [AudienceCountry] to [audienceCountries].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAudienceCountry(audienceCountry: AudienceCountry) = apply {
                    audienceCountries =
                        (audienceCountries ?: JsonField.of(mutableListOf())).also {
                            checkKnown("audienceCountries", it).add(audienceCountry)
                        }
                }

                /** Audience genders breakdown */
                fun audienceGenders(audienceGenders: List<AudienceGender>) =
                    audienceGenders(JsonField.of(audienceGenders))

                /**
                 * Sets [Builder.audienceGenders] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.audienceGenders] with a well-typed
                 * `List<AudienceGender>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun audienceGenders(audienceGenders: JsonField<List<AudienceGender>>) = apply {
                    this.audienceGenders = audienceGenders.map { it.toMutableList() }
                }

                /**
                 * Adds a single [AudienceGender] to [audienceGenders].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAudienceGender(audienceGender: AudienceGender) = apply {
                    audienceGenders =
                        (audienceGenders ?: JsonField.of(mutableListOf())).also {
                            checkKnown("audienceGenders", it).add(audienceGender)
                        }
                }

                /** Audience types breakdown */
                fun audienceTypes(audienceTypes: List<AudienceType>) =
                    audienceTypes(JsonField.of(audienceTypes))

                /**
                 * Sets [Builder.audienceTypes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.audienceTypes] with a well-typed
                 * `List<AudienceType>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun audienceTypes(audienceTypes: JsonField<List<AudienceType>>) = apply {
                    this.audienceTypes = audienceTypes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [AudienceType] to [audienceTypes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAudienceType(audienceType: AudienceType) = apply {
                    audienceTypes =
                        (audienceTypes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("audienceTypes", it).add(audienceType)
                        }
                }

                /** Average time watched in seconds */
                fun averageTimeWatched(averageTimeWatched: Double) =
                    averageTimeWatched(JsonField.of(averageTimeWatched))

                /**
                 * Sets [Builder.averageTimeWatched] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.averageTimeWatched] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun averageTimeWatched(averageTimeWatched: JsonField<Double>) = apply {
                    this.averageTimeWatched = averageTimeWatched
                }

                /** Number of comments on the post */
                fun comments(comments: Double) = comments(JsonField.of(comments))

                /**
                 * Sets [Builder.comments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.comments] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun comments(comments: JsonField<Double>) = apply { this.comments = comments }

                /** Number of email clicks */
                fun emailClicks(emailClicks: Double) = emailClicks(JsonField.of(emailClicks))

                /**
                 * Sets [Builder.emailClicks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.emailClicks] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun emailClicks(emailClicks: JsonField<Double>) = apply {
                    this.emailClicks = emailClicks
                }

                /** Engagement likes data by percentage and time */
                fun engagementLikes(engagementLikes: List<EngagementLike>) =
                    engagementLikes(JsonField.of(engagementLikes))

                /**
                 * Sets [Builder.engagementLikes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.engagementLikes] with a well-typed
                 * `List<EngagementLike>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun engagementLikes(engagementLikes: JsonField<List<EngagementLike>>) = apply {
                    this.engagementLikes = engagementLikes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [EngagementLike] to [engagementLikes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addEngagementLike(engagementLike: EngagementLike) = apply {
                    engagementLikes =
                        (engagementLikes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("engagementLikes", it).add(engagementLike)
                        }
                }

                /** Number of favorites on the post */
                fun favorites(favorites: Double) = favorites(JsonField.of(favorites))

                /**
                 * Sets [Builder.favorites] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.favorites] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun favorites(favorites: JsonField<Double>) = apply { this.favorites = favorites }

                /** Rate of full video watches as a percentage */
                fun fullVideoWatchedRate(fullVideoWatchedRate: Double) =
                    fullVideoWatchedRate(JsonField.of(fullVideoWatchedRate))

                /**
                 * Sets [Builder.fullVideoWatchedRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fullVideoWatchedRate] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fullVideoWatchedRate(fullVideoWatchedRate: JsonField<Double>) = apply {
                    this.fullVideoWatchedRate = fullVideoWatchedRate
                }

                /** Impression sources breakdown */
                fun impressionSources(impressionSources: List<ImpressionSource>) =
                    impressionSources(JsonField.of(impressionSources))

                /**
                 * Sets [Builder.impressionSources] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.impressionSources] with a well-typed
                 * `List<ImpressionSource>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun impressionSources(impressionSources: JsonField<List<ImpressionSource>>) =
                    apply {
                        this.impressionSources = impressionSources.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [ImpressionSource] to [impressionSources].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addImpressionSource(impressionSource: ImpressionSource) = apply {
                    impressionSources =
                        (impressionSources ?: JsonField.of(mutableListOf())).also {
                            checkKnown("impressionSources", it).add(impressionSource)
                        }
                }

                /** Number of lead submissions */
                fun leadSubmissions(leadSubmissions: Double) =
                    leadSubmissions(JsonField.of(leadSubmissions))

                /**
                 * Sets [Builder.leadSubmissions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.leadSubmissions] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun leadSubmissions(leadSubmissions: JsonField<Double>) = apply {
                    this.leadSubmissions = leadSubmissions
                }

                /** Number of likes on the post */
                fun likes(likes: Double) = likes(JsonField.of(likes))

                /**
                 * Sets [Builder.likes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.likes] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun likes(likes: JsonField<Double>) = apply { this.likes = likes }

                /** Number of new followers gained from the post */
                fun newFollowers(newFollowers: Double) = newFollowers(JsonField.of(newFollowers))

                /**
                 * Sets [Builder.newFollowers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.newFollowers] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun newFollowers(newFollowers: JsonField<Double>) = apply {
                    this.newFollowers = newFollowers
                }

                /** Number of phone number clicks */
                fun phoneNumberClicks(phoneNumberClicks: Double) =
                    phoneNumberClicks(JsonField.of(phoneNumberClicks))

                /**
                 * Sets [Builder.phoneNumberClicks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumberClicks] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun phoneNumberClicks(phoneNumberClicks: JsonField<Double>) = apply {
                    this.phoneNumberClicks = phoneNumberClicks
                }

                /** Number of profile views generated */
                fun profileViews(profileViews: Double) = profileViews(JsonField.of(profileViews))

                /**
                 * Sets [Builder.profileViews] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.profileViews] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun profileViews(profileViews: JsonField<Double>) = apply {
                    this.profileViews = profileViews
                }

                /** Total reach of the post */
                fun reach(reach: Double) = reach(JsonField.of(reach))

                /**
                 * Sets [Builder.reach] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reach] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun reach(reach: JsonField<Double>) = apply { this.reach = reach }

                /** Number of shares on the post */
                fun shares(shares: Double) = shares(JsonField.of(shares))

                /**
                 * Sets [Builder.shares] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shares] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun shares(shares: JsonField<Double>) = apply { this.shares = shares }

                /** Total time watched in seconds */
                fun totalTimeWatched(totalTimeWatched: Double) =
                    totalTimeWatched(JsonField.of(totalTimeWatched))

                /**
                 * Sets [Builder.totalTimeWatched] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalTimeWatched] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun totalTimeWatched(totalTimeWatched: JsonField<Double>) = apply {
                    this.totalTimeWatched = totalTimeWatched
                }

                /** Video view retention data by percentage and time */
                fun videoViewRetention(videoViewRetention: List<VideoViewRetention>) =
                    videoViewRetention(JsonField.of(videoViewRetention))

                /**
                 * Sets [Builder.videoViewRetention] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoViewRetention] with a well-typed
                 * `List<VideoViewRetention>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun videoViewRetention(videoViewRetention: JsonField<List<VideoViewRetention>>) =
                    apply {
                        this.videoViewRetention = videoViewRetention.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [VideoViewRetention] to [Builder.videoViewRetention].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addVideoViewRetention(videoViewRetention: VideoViewRetention) = apply {
                    this.videoViewRetention =
                        (this.videoViewRetention ?: JsonField.of(mutableListOf())).also {
                            checkKnown("videoViewRetention", it).add(videoViewRetention)
                        }
                }

                /** Total number of video views */
                fun videoViews(videoViews: Double) = videoViews(JsonField.of(videoViews))

                /**
                 * Sets [Builder.videoViews] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoViews] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun videoViews(videoViews: JsonField<Double>) = apply {
                    this.videoViews = videoViews
                }

                /** Number of website clicks */
                fun websiteClicks(websiteClicks: Double) =
                    websiteClicks(JsonField.of(websiteClicks))

                /**
                 * Sets [Builder.websiteClicks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.websiteClicks] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun websiteClicks(websiteClicks: JsonField<Double>) = apply {
                    this.websiteClicks = websiteClicks
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
                 * Returns an immutable instance of [TikTokBusinessMetricsDto].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .addressClicks()
                 * .appDownloadClicks()
                 * .audienceCities()
                 * .audienceCountries()
                 * .audienceGenders()
                 * .audienceTypes()
                 * .averageTimeWatched()
                 * .comments()
                 * .emailClicks()
                 * .engagementLikes()
                 * .favorites()
                 * .fullVideoWatchedRate()
                 * .impressionSources()
                 * .leadSubmissions()
                 * .likes()
                 * .newFollowers()
                 * .phoneNumberClicks()
                 * .profileViews()
                 * .reach()
                 * .shares()
                 * .totalTimeWatched()
                 * .videoViewRetention()
                 * .videoViews()
                 * .websiteClicks()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): TikTokBusinessMetricsDto =
                    TikTokBusinessMetricsDto(
                        checkRequired("addressClicks", addressClicks),
                        checkRequired("appDownloadClicks", appDownloadClicks),
                        checkRequired("audienceCities", audienceCities).map { it.toImmutable() },
                        checkRequired("audienceCountries", audienceCountries).map {
                            it.toImmutable()
                        },
                        checkRequired("audienceGenders", audienceGenders).map { it.toImmutable() },
                        checkRequired("audienceTypes", audienceTypes).map { it.toImmutable() },
                        checkRequired("averageTimeWatched", averageTimeWatched),
                        checkRequired("comments", comments),
                        checkRequired("emailClicks", emailClicks),
                        checkRequired("engagementLikes", engagementLikes).map { it.toImmutable() },
                        checkRequired("favorites", favorites),
                        checkRequired("fullVideoWatchedRate", fullVideoWatchedRate),
                        checkRequired("impressionSources", impressionSources).map {
                            it.toImmutable()
                        },
                        checkRequired("leadSubmissions", leadSubmissions),
                        checkRequired("likes", likes),
                        checkRequired("newFollowers", newFollowers),
                        checkRequired("phoneNumberClicks", phoneNumberClicks),
                        checkRequired("profileViews", profileViews),
                        checkRequired("reach", reach),
                        checkRequired("shares", shares),
                        checkRequired("totalTimeWatched", totalTimeWatched),
                        checkRequired("videoViewRetention", videoViewRetention).map {
                            it.toImmutable()
                        },
                        checkRequired("videoViews", videoViews),
                        checkRequired("websiteClicks", websiteClicks),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws PostForMeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): TikTokBusinessMetricsDto = apply {
                if (validated) {
                    return@apply
                }

                addressClicks()
                appDownloadClicks()
                audienceCities().forEach { it.validate() }
                audienceCountries().forEach { it.validate() }
                audienceGenders().forEach { it.validate() }
                audienceTypes().forEach { it.validate() }
                averageTimeWatched()
                comments()
                emailClicks()
                engagementLikes().forEach { it.validate() }
                favorites()
                fullVideoWatchedRate()
                impressionSources().forEach { it.validate() }
                leadSubmissions()
                likes()
                newFollowers()
                phoneNumberClicks()
                profileViews()
                reach()
                shares()
                totalTimeWatched()
                videoViewRetention().forEach { it.validate() }
                videoViews()
                websiteClicks()
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
                (if (addressClicks.asKnown() == null) 0 else 1) +
                    (if (appDownloadClicks.asKnown() == null) 0 else 1) +
                    (audienceCities.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (audienceCountries.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (audienceGenders.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (audienceTypes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (averageTimeWatched.asKnown() == null) 0 else 1) +
                    (if (comments.asKnown() == null) 0 else 1) +
                    (if (emailClicks.asKnown() == null) 0 else 1) +
                    (engagementLikes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (favorites.asKnown() == null) 0 else 1) +
                    (if (fullVideoWatchedRate.asKnown() == null) 0 else 1) +
                    (impressionSources.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (leadSubmissions.asKnown() == null) 0 else 1) +
                    (if (likes.asKnown() == null) 0 else 1) +
                    (if (newFollowers.asKnown() == null) 0 else 1) +
                    (if (phoneNumberClicks.asKnown() == null) 0 else 1) +
                    (if (profileViews.asKnown() == null) 0 else 1) +
                    (if (reach.asKnown() == null) 0 else 1) +
                    (if (shares.asKnown() == null) 0 else 1) +
                    (if (totalTimeWatched.asKnown() == null) 0 else 1) +
                    (videoViewRetention.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (videoViews.asKnown() == null) 0 else 1) +
                    (if (websiteClicks.asKnown() == null) 0 else 1)

            class AudienceCity
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val cityName: JsonField<String>,
                private val percentage: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("city_name")
                    @ExcludeMissing
                    cityName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("percentage")
                    @ExcludeMissing
                    percentage: JsonField<Double> = JsonMissing.of(),
                ) : this(cityName, percentage, mutableMapOf())

                /**
                 * City name
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun cityName(): String = cityName.getRequired("city_name")

                /**
                 * Percentage of audience from this city
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun percentage(): Double = percentage.getRequired("percentage")

                /**
                 * Returns the raw JSON value of [cityName].
                 *
                 * Unlike [cityName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("city_name")
                @ExcludeMissing
                fun _cityName(): JsonField<String> = cityName

                /**
                 * Returns the raw JSON value of [percentage].
                 *
                 * Unlike [percentage], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("percentage")
                @ExcludeMissing
                fun _percentage(): JsonField<Double> = percentage

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
                     * Returns a mutable builder for constructing an instance of [AudienceCity].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cityName()
                     * .percentage()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [AudienceCity]. */
                class Builder internal constructor() {

                    private var cityName: JsonField<String>? = null
                    private var percentage: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(audienceCity: AudienceCity) = apply {
                        cityName = audienceCity.cityName
                        percentage = audienceCity.percentage
                        additionalProperties = audienceCity.additionalProperties.toMutableMap()
                    }

                    /** City name */
                    fun cityName(cityName: String) = cityName(JsonField.of(cityName))

                    /**
                     * Sets [Builder.cityName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cityName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cityName(cityName: JsonField<String>) = apply { this.cityName = cityName }

                    /** Percentage of audience from this city */
                    fun percentage(percentage: Double) = percentage(JsonField.of(percentage))

                    /**
                     * Sets [Builder.percentage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.percentage] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun percentage(percentage: JsonField<Double>) = apply {
                        this.percentage = percentage
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
                     * Returns an immutable instance of [AudienceCity].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cityName()
                     * .percentage()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AudienceCity =
                        AudienceCity(
                            checkRequired("cityName", cityName),
                            checkRequired("percentage", percentage),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PostForMeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): AudienceCity = apply {
                    if (validated) {
                        return@apply
                    }

                    cityName()
                    percentage()
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
                    (if (cityName.asKnown() == null) 0 else 1) +
                        (if (percentage.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AudienceCity &&
                        cityName == other.cityName &&
                        percentage == other.percentage &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(cityName, percentage, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AudienceCity{cityName=$cityName, percentage=$percentage, additionalProperties=$additionalProperties}"
            }

            class AudienceCountry
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val country: JsonField<String>,
                private val percentage: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("country")
                    @ExcludeMissing
                    country: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("percentage")
                    @ExcludeMissing
                    percentage: JsonField<Double> = JsonMissing.of(),
                ) : this(country, percentage, mutableMapOf())

                /**
                 * Country name
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun country(): String = country.getRequired("country")

                /**
                 * Percentage of audience from this country
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun percentage(): Double = percentage.getRequired("percentage")

                /**
                 * Returns the raw JSON value of [country].
                 *
                 * Unlike [country], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

                /**
                 * Returns the raw JSON value of [percentage].
                 *
                 * Unlike [percentage], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("percentage")
                @ExcludeMissing
                fun _percentage(): JsonField<Double> = percentage

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
                     * Returns a mutable builder for constructing an instance of [AudienceCountry].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .country()
                     * .percentage()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [AudienceCountry]. */
                class Builder internal constructor() {

                    private var country: JsonField<String>? = null
                    private var percentage: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(audienceCountry: AudienceCountry) = apply {
                        country = audienceCountry.country
                        percentage = audienceCountry.percentage
                        additionalProperties = audienceCountry.additionalProperties.toMutableMap()
                    }

                    /** Country name */
                    fun country(country: String) = country(JsonField.of(country))

                    /**
                     * Sets [Builder.country] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.country] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun country(country: JsonField<String>) = apply { this.country = country }

                    /** Percentage of audience from this country */
                    fun percentage(percentage: Double) = percentage(JsonField.of(percentage))

                    /**
                     * Sets [Builder.percentage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.percentage] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun percentage(percentage: JsonField<Double>) = apply {
                        this.percentage = percentage
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
                     * Returns an immutable instance of [AudienceCountry].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .country()
                     * .percentage()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AudienceCountry =
                        AudienceCountry(
                            checkRequired("country", country),
                            checkRequired("percentage", percentage),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PostForMeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): AudienceCountry = apply {
                    if (validated) {
                        return@apply
                    }

                    country()
                    percentage()
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
                    (if (country.asKnown() == null) 0 else 1) +
                        (if (percentage.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AudienceCountry &&
                        country == other.country &&
                        percentage == other.percentage &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(country, percentage, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AudienceCountry{country=$country, percentage=$percentage, additionalProperties=$additionalProperties}"
            }

            class AudienceGender
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val gender: JsonField<String>,
                private val percentage: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("gender")
                    @ExcludeMissing
                    gender: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("percentage")
                    @ExcludeMissing
                    percentage: JsonField<Double> = JsonMissing.of(),
                ) : this(gender, percentage, mutableMapOf())

                /**
                 * Gender category
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun gender(): String = gender.getRequired("gender")

                /**
                 * Percentage of audience of this gender
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun percentage(): Double = percentage.getRequired("percentage")

                /**
                 * Returns the raw JSON value of [gender].
                 *
                 * Unlike [gender], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<String> = gender

                /**
                 * Returns the raw JSON value of [percentage].
                 *
                 * Unlike [percentage], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("percentage")
                @ExcludeMissing
                fun _percentage(): JsonField<Double> = percentage

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
                     * Returns a mutable builder for constructing an instance of [AudienceGender].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .gender()
                     * .percentage()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [AudienceGender]. */
                class Builder internal constructor() {

                    private var gender: JsonField<String>? = null
                    private var percentage: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(audienceGender: AudienceGender) = apply {
                        gender = audienceGender.gender
                        percentage = audienceGender.percentage
                        additionalProperties = audienceGender.additionalProperties.toMutableMap()
                    }

                    /** Gender category */
                    fun gender(gender: String) = gender(JsonField.of(gender))

                    /**
                     * Sets [Builder.gender] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gender] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun gender(gender: JsonField<String>) = apply { this.gender = gender }

                    /** Percentage of audience of this gender */
                    fun percentage(percentage: Double) = percentage(JsonField.of(percentage))

                    /**
                     * Sets [Builder.percentage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.percentage] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun percentage(percentage: JsonField<Double>) = apply {
                        this.percentage = percentage
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
                     * Returns an immutable instance of [AudienceGender].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .gender()
                     * .percentage()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AudienceGender =
                        AudienceGender(
                            checkRequired("gender", gender),
                            checkRequired("percentage", percentage),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PostForMeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): AudienceGender = apply {
                    if (validated) {
                        return@apply
                    }

                    gender()
                    percentage()
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
                    (if (gender.asKnown() == null) 0 else 1) +
                        (if (percentage.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AudienceGender &&
                        gender == other.gender &&
                        percentage == other.percentage &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(gender, percentage, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AudienceGender{gender=$gender, percentage=$percentage, additionalProperties=$additionalProperties}"
            }

            class AudienceType
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val percentage: JsonField<Double>,
                private val type: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("percentage")
                    @ExcludeMissing
                    percentage: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                ) : this(percentage, type, mutableMapOf())

                /**
                 * Percentage of audience of this type
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun percentage(): Double = percentage.getRequired("percentage")

                /**
                 * Type of audience
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun type(): String = type.getRequired("type")

                /**
                 * Returns the raw JSON value of [percentage].
                 *
                 * Unlike [percentage], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("percentage")
                @ExcludeMissing
                fun _percentage(): JsonField<Double> = percentage

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
                     * Returns a mutable builder for constructing an instance of [AudienceType].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .percentage()
                     * .type()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [AudienceType]. */
                class Builder internal constructor() {

                    private var percentage: JsonField<Double>? = null
                    private var type: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(audienceType: AudienceType) = apply {
                        percentage = audienceType.percentage
                        type = audienceType.type
                        additionalProperties = audienceType.additionalProperties.toMutableMap()
                    }

                    /** Percentage of audience of this type */
                    fun percentage(percentage: Double) = percentage(JsonField.of(percentage))

                    /**
                     * Sets [Builder.percentage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.percentage] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun percentage(percentage: JsonField<Double>) = apply {
                        this.percentage = percentage
                    }

                    /** Type of audience */
                    fun type(type: String) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<String>) = apply { this.type = type }

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
                     * Returns an immutable instance of [AudienceType].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .percentage()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AudienceType =
                        AudienceType(
                            checkRequired("percentage", percentage),
                            checkRequired("type", type),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PostForMeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): AudienceType = apply {
                    if (validated) {
                        return@apply
                    }

                    percentage()
                    type()
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
                    (if (percentage.asKnown() == null) 0 else 1) +
                        (if (type.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AudienceType &&
                        percentage == other.percentage &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(percentage, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AudienceType{percentage=$percentage, type=$type, additionalProperties=$additionalProperties}"
            }

            class EngagementLike
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val percentage: JsonField<Double>,
                private val second: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("percentage")
                    @ExcludeMissing
                    percentage: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("second")
                    @ExcludeMissing
                    second: JsonField<String> = JsonMissing.of(),
                ) : this(percentage, second, mutableMapOf())

                /**
                 * Percentage value for the metric
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun percentage(): Double = percentage.getRequired("percentage")

                /**
                 * Time in seconds for the metric
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun second(): String = second.getRequired("second")

                /**
                 * Returns the raw JSON value of [percentage].
                 *
                 * Unlike [percentage], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("percentage")
                @ExcludeMissing
                fun _percentage(): JsonField<Double> = percentage

                /**
                 * Returns the raw JSON value of [second].
                 *
                 * Unlike [second], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("second") @ExcludeMissing fun _second(): JsonField<String> = second

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
                     * Returns a mutable builder for constructing an instance of [EngagementLike].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .percentage()
                     * .second()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [EngagementLike]. */
                class Builder internal constructor() {

                    private var percentage: JsonField<Double>? = null
                    private var second: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(engagementLike: EngagementLike) = apply {
                        percentage = engagementLike.percentage
                        second = engagementLike.second
                        additionalProperties = engagementLike.additionalProperties.toMutableMap()
                    }

                    /** Percentage value for the metric */
                    fun percentage(percentage: Double) = percentage(JsonField.of(percentage))

                    /**
                     * Sets [Builder.percentage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.percentage] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun percentage(percentage: JsonField<Double>) = apply {
                        this.percentage = percentage
                    }

                    /** Time in seconds for the metric */
                    fun second(second: String) = second(JsonField.of(second))

                    /**
                     * Sets [Builder.second] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.second] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun second(second: JsonField<String>) = apply { this.second = second }

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
                     * Returns an immutable instance of [EngagementLike].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .percentage()
                     * .second()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): EngagementLike =
                        EngagementLike(
                            checkRequired("percentage", percentage),
                            checkRequired("second", second),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PostForMeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): EngagementLike = apply {
                    if (validated) {
                        return@apply
                    }

                    percentage()
                    second()
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
                    (if (percentage.asKnown() == null) 0 else 1) +
                        (if (second.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is EngagementLike &&
                        percentage == other.percentage &&
                        second == other.second &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(percentage, second, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "EngagementLike{percentage=$percentage, second=$second, additionalProperties=$additionalProperties}"
            }

            class ImpressionSource
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val impressionSource: JsonField<String>,
                private val percentage: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("impression_source")
                    @ExcludeMissing
                    impressionSource: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("percentage")
                    @ExcludeMissing
                    percentage: JsonField<Double> = JsonMissing.of(),
                ) : this(impressionSource, percentage, mutableMapOf())

                /**
                 * Name of the impression source
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun impressionSource(): String = impressionSource.getRequired("impression_source")

                /**
                 * Percentage of impressions from this source
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun percentage(): Double = percentage.getRequired("percentage")

                /**
                 * Returns the raw JSON value of [impressionSource].
                 *
                 * Unlike [impressionSource], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("impression_source")
                @ExcludeMissing
                fun _impressionSource(): JsonField<String> = impressionSource

                /**
                 * Returns the raw JSON value of [percentage].
                 *
                 * Unlike [percentage], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("percentage")
                @ExcludeMissing
                fun _percentage(): JsonField<Double> = percentage

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
                     * Returns a mutable builder for constructing an instance of [ImpressionSource].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .impressionSource()
                     * .percentage()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [ImpressionSource]. */
                class Builder internal constructor() {

                    private var impressionSource: JsonField<String>? = null
                    private var percentage: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(impressionSource: ImpressionSource) = apply {
                        this.impressionSource = impressionSource.impressionSource
                        percentage = impressionSource.percentage
                        additionalProperties = impressionSource.additionalProperties.toMutableMap()
                    }

                    /** Name of the impression source */
                    fun impressionSource(impressionSource: String) =
                        impressionSource(JsonField.of(impressionSource))

                    /**
                     * Sets [Builder.impressionSource] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.impressionSource] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun impressionSource(impressionSource: JsonField<String>) = apply {
                        this.impressionSource = impressionSource
                    }

                    /** Percentage of impressions from this source */
                    fun percentage(percentage: Double) = percentage(JsonField.of(percentage))

                    /**
                     * Sets [Builder.percentage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.percentage] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun percentage(percentage: JsonField<Double>) = apply {
                        this.percentage = percentage
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
                     * Returns an immutable instance of [ImpressionSource].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .impressionSource()
                     * .percentage()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ImpressionSource =
                        ImpressionSource(
                            checkRequired("impressionSource", impressionSource),
                            checkRequired("percentage", percentage),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PostForMeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): ImpressionSource = apply {
                    if (validated) {
                        return@apply
                    }

                    impressionSource()
                    percentage()
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
                    (if (impressionSource.asKnown() == null) 0 else 1) +
                        (if (percentage.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ImpressionSource &&
                        impressionSource == other.impressionSource &&
                        percentage == other.percentage &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(impressionSource, percentage, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ImpressionSource{impressionSource=$impressionSource, percentage=$percentage, additionalProperties=$additionalProperties}"
            }

            class VideoViewRetention
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val percentage: JsonField<Double>,
                private val second: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("percentage")
                    @ExcludeMissing
                    percentage: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("second")
                    @ExcludeMissing
                    second: JsonField<String> = JsonMissing.of(),
                ) : this(percentage, second, mutableMapOf())

                /**
                 * Percentage value for the metric
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun percentage(): Double = percentage.getRequired("percentage")

                /**
                 * Time in seconds for the metric
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun second(): String = second.getRequired("second")

                /**
                 * Returns the raw JSON value of [percentage].
                 *
                 * Unlike [percentage], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("percentage")
                @ExcludeMissing
                fun _percentage(): JsonField<Double> = percentage

                /**
                 * Returns the raw JSON value of [second].
                 *
                 * Unlike [second], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("second") @ExcludeMissing fun _second(): JsonField<String> = second

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
                     * Returns a mutable builder for constructing an instance of
                     * [VideoViewRetention].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .percentage()
                     * .second()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [VideoViewRetention]. */
                class Builder internal constructor() {

                    private var percentage: JsonField<Double>? = null
                    private var second: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(videoViewRetention: VideoViewRetention) = apply {
                        percentage = videoViewRetention.percentage
                        second = videoViewRetention.second
                        additionalProperties =
                            videoViewRetention.additionalProperties.toMutableMap()
                    }

                    /** Percentage value for the metric */
                    fun percentage(percentage: Double) = percentage(JsonField.of(percentage))

                    /**
                     * Sets [Builder.percentage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.percentage] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun percentage(percentage: JsonField<Double>) = apply {
                        this.percentage = percentage
                    }

                    /** Time in seconds for the metric */
                    fun second(second: String) = second(JsonField.of(second))

                    /**
                     * Sets [Builder.second] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.second] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun second(second: JsonField<String>) = apply { this.second = second }

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
                     * Returns an immutable instance of [VideoViewRetention].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .percentage()
                     * .second()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): VideoViewRetention =
                        VideoViewRetention(
                            checkRequired("percentage", percentage),
                            checkRequired("second", second),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PostForMeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): VideoViewRetention = apply {
                    if (validated) {
                        return@apply
                    }

                    percentage()
                    second()
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
                    (if (percentage.asKnown() == null) 0 else 1) +
                        (if (second.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is VideoViewRetention &&
                        percentage == other.percentage &&
                        second == other.second &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(percentage, second, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "VideoViewRetention{percentage=$percentage, second=$second, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TikTokBusinessMetricsDto &&
                    addressClicks == other.addressClicks &&
                    appDownloadClicks == other.appDownloadClicks &&
                    audienceCities == other.audienceCities &&
                    audienceCountries == other.audienceCountries &&
                    audienceGenders == other.audienceGenders &&
                    audienceTypes == other.audienceTypes &&
                    averageTimeWatched == other.averageTimeWatched &&
                    comments == other.comments &&
                    emailClicks == other.emailClicks &&
                    engagementLikes == other.engagementLikes &&
                    favorites == other.favorites &&
                    fullVideoWatchedRate == other.fullVideoWatchedRate &&
                    impressionSources == other.impressionSources &&
                    leadSubmissions == other.leadSubmissions &&
                    likes == other.likes &&
                    newFollowers == other.newFollowers &&
                    phoneNumberClicks == other.phoneNumberClicks &&
                    profileViews == other.profileViews &&
                    reach == other.reach &&
                    shares == other.shares &&
                    totalTimeWatched == other.totalTimeWatched &&
                    videoViewRetention == other.videoViewRetention &&
                    videoViews == other.videoViews &&
                    websiteClicks == other.websiteClicks &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    addressClicks,
                    appDownloadClicks,
                    audienceCities,
                    audienceCountries,
                    audienceGenders,
                    audienceTypes,
                    averageTimeWatched,
                    comments,
                    emailClicks,
                    engagementLikes,
                    favorites,
                    fullVideoWatchedRate,
                    impressionSources,
                    leadSubmissions,
                    likes,
                    newFollowers,
                    phoneNumberClicks,
                    profileViews,
                    reach,
                    shares,
                    totalTimeWatched,
                    videoViewRetention,
                    videoViews,
                    websiteClicks,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TikTokBusinessMetricsDto{addressClicks=$addressClicks, appDownloadClicks=$appDownloadClicks, audienceCities=$audienceCities, audienceCountries=$audienceCountries, audienceGenders=$audienceGenders, audienceTypes=$audienceTypes, averageTimeWatched=$averageTimeWatched, comments=$comments, emailClicks=$emailClicks, engagementLikes=$engagementLikes, favorites=$favorites, fullVideoWatchedRate=$fullVideoWatchedRate, impressionSources=$impressionSources, leadSubmissions=$leadSubmissions, likes=$likes, newFollowers=$newFollowers, phoneNumberClicks=$phoneNumberClicks, profileViews=$profileViews, reach=$reach, shares=$shares, totalTimeWatched=$totalTimeWatched, videoViewRetention=$videoViewRetention, videoViews=$videoViews, websiteClicks=$websiteClicks, additionalProperties=$additionalProperties}"
        }

        class TikTokPostMetricsDto
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val commentCount: JsonField<Double>,
            private val likeCount: JsonField<Double>,
            private val shareCount: JsonField<Double>,
            private val viewCount: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("comment_count")
                @ExcludeMissing
                commentCount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("like_count")
                @ExcludeMissing
                likeCount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("share_count")
                @ExcludeMissing
                shareCount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("view_count")
                @ExcludeMissing
                viewCount: JsonField<Double> = JsonMissing.of(),
            ) : this(commentCount, likeCount, shareCount, viewCount, mutableMapOf())

            /**
             * Number of comments on the video
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun commentCount(): Double = commentCount.getRequired("comment_count")

            /**
             * Number of likes on the video
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun likeCount(): Double = likeCount.getRequired("like_count")

            /**
             * Number of shares of the video
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun shareCount(): Double = shareCount.getRequired("share_count")

            /**
             * Number of views on the video
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun viewCount(): Double = viewCount.getRequired("view_count")

            /**
             * Returns the raw JSON value of [commentCount].
             *
             * Unlike [commentCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("comment_count")
            @ExcludeMissing
            fun _commentCount(): JsonField<Double> = commentCount

            /**
             * Returns the raw JSON value of [likeCount].
             *
             * Unlike [likeCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("like_count")
            @ExcludeMissing
            fun _likeCount(): JsonField<Double> = likeCount

            /**
             * Returns the raw JSON value of [shareCount].
             *
             * Unlike [shareCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("share_count")
            @ExcludeMissing
            fun _shareCount(): JsonField<Double> = shareCount

            /**
             * Returns the raw JSON value of [viewCount].
             *
             * Unlike [viewCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("view_count")
            @ExcludeMissing
            fun _viewCount(): JsonField<Double> = viewCount

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
                 * Returns a mutable builder for constructing an instance of [TikTokPostMetricsDto].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .commentCount()
                 * .likeCount()
                 * .shareCount()
                 * .viewCount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [TikTokPostMetricsDto]. */
            class Builder internal constructor() {

                private var commentCount: JsonField<Double>? = null
                private var likeCount: JsonField<Double>? = null
                private var shareCount: JsonField<Double>? = null
                private var viewCount: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tikTokPostMetricsDto: TikTokPostMetricsDto) = apply {
                    commentCount = tikTokPostMetricsDto.commentCount
                    likeCount = tikTokPostMetricsDto.likeCount
                    shareCount = tikTokPostMetricsDto.shareCount
                    viewCount = tikTokPostMetricsDto.viewCount
                    additionalProperties = tikTokPostMetricsDto.additionalProperties.toMutableMap()
                }

                /** Number of comments on the video */
                fun commentCount(commentCount: Double) = commentCount(JsonField.of(commentCount))

                /**
                 * Sets [Builder.commentCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.commentCount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun commentCount(commentCount: JsonField<Double>) = apply {
                    this.commentCount = commentCount
                }

                /** Number of likes on the video */
                fun likeCount(likeCount: Double) = likeCount(JsonField.of(likeCount))

                /**
                 * Sets [Builder.likeCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.likeCount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun likeCount(likeCount: JsonField<Double>) = apply { this.likeCount = likeCount }

                /** Number of shares of the video */
                fun shareCount(shareCount: Double) = shareCount(JsonField.of(shareCount))

                /**
                 * Sets [Builder.shareCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shareCount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun shareCount(shareCount: JsonField<Double>) = apply {
                    this.shareCount = shareCount
                }

                /** Number of views on the video */
                fun viewCount(viewCount: Double) = viewCount(JsonField.of(viewCount))

                /**
                 * Sets [Builder.viewCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.viewCount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun viewCount(viewCount: JsonField<Double>) = apply { this.viewCount = viewCount }

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
                 * Returns an immutable instance of [TikTokPostMetricsDto].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .commentCount()
                 * .likeCount()
                 * .shareCount()
                 * .viewCount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): TikTokPostMetricsDto =
                    TikTokPostMetricsDto(
                        checkRequired("commentCount", commentCount),
                        checkRequired("likeCount", likeCount),
                        checkRequired("shareCount", shareCount),
                        checkRequired("viewCount", viewCount),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws PostForMeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): TikTokPostMetricsDto = apply {
                if (validated) {
                    return@apply
                }

                commentCount()
                likeCount()
                shareCount()
                viewCount()
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
                (if (commentCount.asKnown() == null) 0 else 1) +
                    (if (likeCount.asKnown() == null) 0 else 1) +
                    (if (shareCount.asKnown() == null) 0 else 1) +
                    (if (viewCount.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TikTokPostMetricsDto &&
                    commentCount == other.commentCount &&
                    likeCount == other.likeCount &&
                    shareCount == other.shareCount &&
                    viewCount == other.viewCount &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(commentCount, likeCount, shareCount, viewCount, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TikTokPostMetricsDto{commentCount=$commentCount, likeCount=$likeCount, shareCount=$shareCount, viewCount=$viewCount, additionalProperties=$additionalProperties}"
        }

        class InstagramPostMetricsDto
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val comments: JsonField<Double>,
            private val follows: JsonField<Double>,
            private val igReelsAvgWatchTime: JsonField<Double>,
            private val igReelsVideoViewTotalTime: JsonField<Double>,
            private val likes: JsonField<Double>,
            private val navigation: JsonField<Double>,
            private val profileActivity: JsonField<Double>,
            private val profileVisits: JsonField<Double>,
            private val reach: JsonField<Double>,
            private val replies: JsonField<Double>,
            private val saved: JsonField<Double>,
            private val shares: JsonField<Double>,
            private val totalInteractions: JsonField<Double>,
            private val views: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("comments")
                @ExcludeMissing
                comments: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("follows")
                @ExcludeMissing
                follows: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("ig_reels_avg_watch_time")
                @ExcludeMissing
                igReelsAvgWatchTime: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("ig_reels_video_view_total_time")
                @ExcludeMissing
                igReelsVideoViewTotalTime: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("likes") @ExcludeMissing likes: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("navigation")
                @ExcludeMissing
                navigation: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("profile_activity")
                @ExcludeMissing
                profileActivity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("profile_visits")
                @ExcludeMissing
                profileVisits: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reach") @ExcludeMissing reach: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("replies")
                @ExcludeMissing
                replies: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("saved") @ExcludeMissing saved: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("shares")
                @ExcludeMissing
                shares: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("total_interactions")
                @ExcludeMissing
                totalInteractions: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("views") @ExcludeMissing views: JsonField<Double> = JsonMissing.of(),
            ) : this(
                comments,
                follows,
                igReelsAvgWatchTime,
                igReelsVideoViewTotalTime,
                likes,
                navigation,
                profileActivity,
                profileVisits,
                reach,
                replies,
                saved,
                shares,
                totalInteractions,
                views,
                mutableMapOf(),
            )

            /**
             * Number of comments on the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun comments(): Double? = comments.getNullable("comments")

            /**
             * Number of new follows from this post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun follows(): Double? = follows.getNullable("follows")

            /**
             * Average watch time for Reels (in milliseconds)
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun igReelsAvgWatchTime(): Double? =
                igReelsAvgWatchTime.getNullable("ig_reels_avg_watch_time")

            /**
             * Total watch time for Reels (in milliseconds)
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun igReelsVideoViewTotalTime(): Double? =
                igReelsVideoViewTotalTime.getNullable("ig_reels_video_view_total_time")

            /**
             * Number of likes on the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun likes(): Double? = likes.getNullable("likes")

            /**
             * Navigation actions taken on the media
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun navigation(): Double? = navigation.getNullable("navigation")

            /**
             * Profile activity generated from this post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun profileActivity(): Double? = profileActivity.getNullable("profile_activity")

            /**
             * Number of profile visits from this post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun profileVisits(): Double? = profileVisits.getNullable("profile_visits")

            /**
             * Total number of unique accounts that have seen the media
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun reach(): Double? = reach.getNullable("reach")

            /**
             * Number of replies to the story (story media only)
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun replies(): Double? = replies.getNullable("replies")

            /**
             * Total number of unique accounts that have saved the media
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun saved(): Double? = saved.getNullable("saved")

            /**
             * Total number of shares of the media
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun shares(): Double? = shares.getNullable("shares")

            /**
             * Total interactions on the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun totalInteractions(): Double? = totalInteractions.getNullable("total_interactions")

            /**
             * Number of views on the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun views(): Double? = views.getNullable("views")

            /**
             * Returns the raw JSON value of [comments].
             *
             * Unlike [comments], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("comments") @ExcludeMissing fun _comments(): JsonField<Double> = comments

            /**
             * Returns the raw JSON value of [follows].
             *
             * Unlike [follows], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("follows") @ExcludeMissing fun _follows(): JsonField<Double> = follows

            /**
             * Returns the raw JSON value of [igReelsAvgWatchTime].
             *
             * Unlike [igReelsAvgWatchTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ig_reels_avg_watch_time")
            @ExcludeMissing
            fun _igReelsAvgWatchTime(): JsonField<Double> = igReelsAvgWatchTime

            /**
             * Returns the raw JSON value of [igReelsVideoViewTotalTime].
             *
             * Unlike [igReelsVideoViewTotalTime], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("ig_reels_video_view_total_time")
            @ExcludeMissing
            fun _igReelsVideoViewTotalTime(): JsonField<Double> = igReelsVideoViewTotalTime

            /**
             * Returns the raw JSON value of [likes].
             *
             * Unlike [likes], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("likes") @ExcludeMissing fun _likes(): JsonField<Double> = likes

            /**
             * Returns the raw JSON value of [navigation].
             *
             * Unlike [navigation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("navigation")
            @ExcludeMissing
            fun _navigation(): JsonField<Double> = navigation

            /**
             * Returns the raw JSON value of [profileActivity].
             *
             * Unlike [profileActivity], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("profile_activity")
            @ExcludeMissing
            fun _profileActivity(): JsonField<Double> = profileActivity

            /**
             * Returns the raw JSON value of [profileVisits].
             *
             * Unlike [profileVisits], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("profile_visits")
            @ExcludeMissing
            fun _profileVisits(): JsonField<Double> = profileVisits

            /**
             * Returns the raw JSON value of [reach].
             *
             * Unlike [reach], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reach") @ExcludeMissing fun _reach(): JsonField<Double> = reach

            /**
             * Returns the raw JSON value of [replies].
             *
             * Unlike [replies], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("replies") @ExcludeMissing fun _replies(): JsonField<Double> = replies

            /**
             * Returns the raw JSON value of [saved].
             *
             * Unlike [saved], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("saved") @ExcludeMissing fun _saved(): JsonField<Double> = saved

            /**
             * Returns the raw JSON value of [shares].
             *
             * Unlike [shares], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("shares") @ExcludeMissing fun _shares(): JsonField<Double> = shares

            /**
             * Returns the raw JSON value of [totalInteractions].
             *
             * Unlike [totalInteractions], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("total_interactions")
            @ExcludeMissing
            fun _totalInteractions(): JsonField<Double> = totalInteractions

            /**
             * Returns the raw JSON value of [views].
             *
             * Unlike [views], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("views") @ExcludeMissing fun _views(): JsonField<Double> = views

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
                 * Returns a mutable builder for constructing an instance of
                 * [InstagramPostMetricsDto].
                 */
                fun builder() = Builder()
            }

            /** A builder for [InstagramPostMetricsDto]. */
            class Builder internal constructor() {

                private var comments: JsonField<Double> = JsonMissing.of()
                private var follows: JsonField<Double> = JsonMissing.of()
                private var igReelsAvgWatchTime: JsonField<Double> = JsonMissing.of()
                private var igReelsVideoViewTotalTime: JsonField<Double> = JsonMissing.of()
                private var likes: JsonField<Double> = JsonMissing.of()
                private var navigation: JsonField<Double> = JsonMissing.of()
                private var profileActivity: JsonField<Double> = JsonMissing.of()
                private var profileVisits: JsonField<Double> = JsonMissing.of()
                private var reach: JsonField<Double> = JsonMissing.of()
                private var replies: JsonField<Double> = JsonMissing.of()
                private var saved: JsonField<Double> = JsonMissing.of()
                private var shares: JsonField<Double> = JsonMissing.of()
                private var totalInteractions: JsonField<Double> = JsonMissing.of()
                private var views: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(instagramPostMetricsDto: InstagramPostMetricsDto) = apply {
                    comments = instagramPostMetricsDto.comments
                    follows = instagramPostMetricsDto.follows
                    igReelsAvgWatchTime = instagramPostMetricsDto.igReelsAvgWatchTime
                    igReelsVideoViewTotalTime = instagramPostMetricsDto.igReelsVideoViewTotalTime
                    likes = instagramPostMetricsDto.likes
                    navigation = instagramPostMetricsDto.navigation
                    profileActivity = instagramPostMetricsDto.profileActivity
                    profileVisits = instagramPostMetricsDto.profileVisits
                    reach = instagramPostMetricsDto.reach
                    replies = instagramPostMetricsDto.replies
                    saved = instagramPostMetricsDto.saved
                    shares = instagramPostMetricsDto.shares
                    totalInteractions = instagramPostMetricsDto.totalInteractions
                    views = instagramPostMetricsDto.views
                    additionalProperties =
                        instagramPostMetricsDto.additionalProperties.toMutableMap()
                }

                /** Number of comments on the post */
                fun comments(comments: Double) = comments(JsonField.of(comments))

                /**
                 * Sets [Builder.comments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.comments] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun comments(comments: JsonField<Double>) = apply { this.comments = comments }

                /** Number of new follows from this post */
                fun follows(follows: Double) = follows(JsonField.of(follows))

                /**
                 * Sets [Builder.follows] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.follows] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun follows(follows: JsonField<Double>) = apply { this.follows = follows }

                /** Average watch time for Reels (in milliseconds) */
                fun igReelsAvgWatchTime(igReelsAvgWatchTime: Double) =
                    igReelsAvgWatchTime(JsonField.of(igReelsAvgWatchTime))

                /**
                 * Sets [Builder.igReelsAvgWatchTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.igReelsAvgWatchTime] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun igReelsAvgWatchTime(igReelsAvgWatchTime: JsonField<Double>) = apply {
                    this.igReelsAvgWatchTime = igReelsAvgWatchTime
                }

                /** Total watch time for Reels (in milliseconds) */
                fun igReelsVideoViewTotalTime(igReelsVideoViewTotalTime: Double) =
                    igReelsVideoViewTotalTime(JsonField.of(igReelsVideoViewTotalTime))

                /**
                 * Sets [Builder.igReelsVideoViewTotalTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.igReelsVideoViewTotalTime] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun igReelsVideoViewTotalTime(igReelsVideoViewTotalTime: JsonField<Double>) =
                    apply {
                        this.igReelsVideoViewTotalTime = igReelsVideoViewTotalTime
                    }

                /** Number of likes on the post */
                fun likes(likes: Double) = likes(JsonField.of(likes))

                /**
                 * Sets [Builder.likes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.likes] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun likes(likes: JsonField<Double>) = apply { this.likes = likes }

                /** Navigation actions taken on the media */
                fun navigation(navigation: Double) = navigation(JsonField.of(navigation))

                /**
                 * Sets [Builder.navigation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.navigation] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun navigation(navigation: JsonField<Double>) = apply {
                    this.navigation = navigation
                }

                /** Profile activity generated from this post */
                fun profileActivity(profileActivity: Double) =
                    profileActivity(JsonField.of(profileActivity))

                /**
                 * Sets [Builder.profileActivity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.profileActivity] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun profileActivity(profileActivity: JsonField<Double>) = apply {
                    this.profileActivity = profileActivity
                }

                /** Number of profile visits from this post */
                fun profileVisits(profileVisits: Double) =
                    profileVisits(JsonField.of(profileVisits))

                /**
                 * Sets [Builder.profileVisits] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.profileVisits] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun profileVisits(profileVisits: JsonField<Double>) = apply {
                    this.profileVisits = profileVisits
                }

                /** Total number of unique accounts that have seen the media */
                fun reach(reach: Double) = reach(JsonField.of(reach))

                /**
                 * Sets [Builder.reach] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reach] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun reach(reach: JsonField<Double>) = apply { this.reach = reach }

                /** Number of replies to the story (story media only) */
                fun replies(replies: Double) = replies(JsonField.of(replies))

                /**
                 * Sets [Builder.replies] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.replies] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun replies(replies: JsonField<Double>) = apply { this.replies = replies }

                /** Total number of unique accounts that have saved the media */
                fun saved(saved: Double) = saved(JsonField.of(saved))

                /**
                 * Sets [Builder.saved] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.saved] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun saved(saved: JsonField<Double>) = apply { this.saved = saved }

                /** Total number of shares of the media */
                fun shares(shares: Double) = shares(JsonField.of(shares))

                /**
                 * Sets [Builder.shares] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shares] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun shares(shares: JsonField<Double>) = apply { this.shares = shares }

                /** Total interactions on the post */
                fun totalInteractions(totalInteractions: Double) =
                    totalInteractions(JsonField.of(totalInteractions))

                /**
                 * Sets [Builder.totalInteractions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalInteractions] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun totalInteractions(totalInteractions: JsonField<Double>) = apply {
                    this.totalInteractions = totalInteractions
                }

                /** Number of views on the post */
                fun views(views: Double) = views(JsonField.of(views))

                /**
                 * Sets [Builder.views] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.views] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun views(views: JsonField<Double>) = apply { this.views = views }

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
                 * Returns an immutable instance of [InstagramPostMetricsDto].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): InstagramPostMetricsDto =
                    InstagramPostMetricsDto(
                        comments,
                        follows,
                        igReelsAvgWatchTime,
                        igReelsVideoViewTotalTime,
                        likes,
                        navigation,
                        profileActivity,
                        profileVisits,
                        reach,
                        replies,
                        saved,
                        shares,
                        totalInteractions,
                        views,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws PostForMeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): InstagramPostMetricsDto = apply {
                if (validated) {
                    return@apply
                }

                comments()
                follows()
                igReelsAvgWatchTime()
                igReelsVideoViewTotalTime()
                likes()
                navigation()
                profileActivity()
                profileVisits()
                reach()
                replies()
                saved()
                shares()
                totalInteractions()
                views()
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
                (if (comments.asKnown() == null) 0 else 1) +
                    (if (follows.asKnown() == null) 0 else 1) +
                    (if (igReelsAvgWatchTime.asKnown() == null) 0 else 1) +
                    (if (igReelsVideoViewTotalTime.asKnown() == null) 0 else 1) +
                    (if (likes.asKnown() == null) 0 else 1) +
                    (if (navigation.asKnown() == null) 0 else 1) +
                    (if (profileActivity.asKnown() == null) 0 else 1) +
                    (if (profileVisits.asKnown() == null) 0 else 1) +
                    (if (reach.asKnown() == null) 0 else 1) +
                    (if (replies.asKnown() == null) 0 else 1) +
                    (if (saved.asKnown() == null) 0 else 1) +
                    (if (shares.asKnown() == null) 0 else 1) +
                    (if (totalInteractions.asKnown() == null) 0 else 1) +
                    (if (views.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InstagramPostMetricsDto &&
                    comments == other.comments &&
                    follows == other.follows &&
                    igReelsAvgWatchTime == other.igReelsAvgWatchTime &&
                    igReelsVideoViewTotalTime == other.igReelsVideoViewTotalTime &&
                    likes == other.likes &&
                    navigation == other.navigation &&
                    profileActivity == other.profileActivity &&
                    profileVisits == other.profileVisits &&
                    reach == other.reach &&
                    replies == other.replies &&
                    saved == other.saved &&
                    shares == other.shares &&
                    totalInteractions == other.totalInteractions &&
                    views == other.views &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    comments,
                    follows,
                    igReelsAvgWatchTime,
                    igReelsVideoViewTotalTime,
                    likes,
                    navigation,
                    profileActivity,
                    profileVisits,
                    reach,
                    replies,
                    saved,
                    shares,
                    totalInteractions,
                    views,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InstagramPostMetricsDto{comments=$comments, follows=$follows, igReelsAvgWatchTime=$igReelsAvgWatchTime, igReelsVideoViewTotalTime=$igReelsVideoViewTotalTime, likes=$likes, navigation=$navigation, profileActivity=$profileActivity, profileVisits=$profileVisits, reach=$reach, replies=$replies, saved=$saved, shares=$shares, totalInteractions=$totalInteractions, views=$views, additionalProperties=$additionalProperties}"
        }

        class YouTubePostMetricsDto
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val comments: JsonField<Double>,
            private val dislikes: JsonField<Double>,
            private val likes: JsonField<Double>,
            private val views: JsonField<Double>,
            private val annotationClickableImpressions: JsonField<Double>,
            private val annotationClicks: JsonField<Double>,
            private val annotationClickThroughRate: JsonField<Double>,
            private val annotationClosableImpressions: JsonField<Double>,
            private val annotationCloseRate: JsonField<Double>,
            private val annotationCloses: JsonField<Double>,
            private val annotationImpressions: JsonField<Double>,
            private val averageViewDuration: JsonField<Double>,
            private val averageViewPercentage: JsonField<Double>,
            private val cardClickRate: JsonField<Double>,
            private val cardClicks: JsonField<Double>,
            private val cardImpressions: JsonField<Double>,
            private val cardTeaserClickRate: JsonField<Double>,
            private val cardTeaserClicks: JsonField<Double>,
            private val cardTeaserImpressions: JsonField<Double>,
            private val engagedViews: JsonField<Double>,
            private val estimatedMinutesWatched: JsonField<Double>,
            private val estimatedRedMinutesWatched: JsonField<Double>,
            private val redViews: JsonField<Double>,
            private val shares: JsonField<Double>,
            private val subscribersGained: JsonField<Double>,
            private val subscribersLost: JsonField<Double>,
            private val videosAddedToPlaylists: JsonField<Double>,
            private val videosRemovedFromPlaylists: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("comments")
                @ExcludeMissing
                comments: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("dislikes")
                @ExcludeMissing
                dislikes: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("likes") @ExcludeMissing likes: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("views") @ExcludeMissing views: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("annotationClickableImpressions")
                @ExcludeMissing
                annotationClickableImpressions: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("annotationClicks")
                @ExcludeMissing
                annotationClicks: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("annotationClickThroughRate")
                @ExcludeMissing
                annotationClickThroughRate: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("annotationClosableImpressions")
                @ExcludeMissing
                annotationClosableImpressions: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("annotationCloseRate")
                @ExcludeMissing
                annotationCloseRate: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("annotationCloses")
                @ExcludeMissing
                annotationCloses: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("annotationImpressions")
                @ExcludeMissing
                annotationImpressions: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("averageViewDuration")
                @ExcludeMissing
                averageViewDuration: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("averageViewPercentage")
                @ExcludeMissing
                averageViewPercentage: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("cardClickRate")
                @ExcludeMissing
                cardClickRate: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("cardClicks")
                @ExcludeMissing
                cardClicks: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("cardImpressions")
                @ExcludeMissing
                cardImpressions: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("cardTeaserClickRate")
                @ExcludeMissing
                cardTeaserClickRate: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("cardTeaserClicks")
                @ExcludeMissing
                cardTeaserClicks: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("cardTeaserImpressions")
                @ExcludeMissing
                cardTeaserImpressions: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("engagedViews")
                @ExcludeMissing
                engagedViews: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("estimatedMinutesWatched")
                @ExcludeMissing
                estimatedMinutesWatched: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("estimatedRedMinutesWatched")
                @ExcludeMissing
                estimatedRedMinutesWatched: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("redViews")
                @ExcludeMissing
                redViews: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("shares")
                @ExcludeMissing
                shares: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("subscribersGained")
                @ExcludeMissing
                subscribersGained: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("subscribersLost")
                @ExcludeMissing
                subscribersLost: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("videosAddedToPlaylists")
                @ExcludeMissing
                videosAddedToPlaylists: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("videosRemovedFromPlaylists")
                @ExcludeMissing
                videosRemovedFromPlaylists: JsonField<Double> = JsonMissing.of(),
            ) : this(
                comments,
                dislikes,
                likes,
                views,
                annotationClickableImpressions,
                annotationClicks,
                annotationClickThroughRate,
                annotationClosableImpressions,
                annotationCloseRate,
                annotationCloses,
                annotationImpressions,
                averageViewDuration,
                averageViewPercentage,
                cardClickRate,
                cardClicks,
                cardImpressions,
                cardTeaserClickRate,
                cardTeaserClicks,
                cardTeaserImpressions,
                engagedViews,
                estimatedMinutesWatched,
                estimatedRedMinutesWatched,
                redViews,
                shares,
                subscribersGained,
                subscribersLost,
                videosAddedToPlaylists,
                videosRemovedFromPlaylists,
                mutableMapOf(),
            )

            /**
             * Number of comments on the video
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun comments(): Double = comments.getRequired("comments")

            /**
             * Number of dislikes on the video
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun dislikes(): Double = dislikes.getRequired("dislikes")

            /**
             * Number of likes on the video
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun likes(): Double = likes.getRequired("likes")

            /**
             * Number of views on the video
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun views(): Double = views.getRequired("views")

            /**
             * Number of clickable annotation impressions
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun annotationClickableImpressions(): Double? =
                annotationClickableImpressions.getNullable("annotationClickableImpressions")

            /**
             * Number of annotation clicks
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun annotationClicks(): Double? = annotationClicks.getNullable("annotationClicks")

            /**
             * Annotation click-through rate
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun annotationClickThroughRate(): Double? =
                annotationClickThroughRate.getNullable("annotationClickThroughRate")

            /**
             * Number of closable annotation impressions
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun annotationClosableImpressions(): Double? =
                annotationClosableImpressions.getNullable("annotationClosableImpressions")

            /**
             * Annotation close rate
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun annotationCloseRate(): Double? =
                annotationCloseRate.getNullable("annotationCloseRate")

            /**
             * Number of annotation closes
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun annotationCloses(): Double? = annotationCloses.getNullable("annotationCloses")

            /**
             * Number of annotation impressions
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun annotationImpressions(): Double? =
                annotationImpressions.getNullable("annotationImpressions")

            /**
             * Average view duration in seconds
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun averageViewDuration(): Double? =
                averageViewDuration.getNullable("averageViewDuration")

            /**
             * Average percentage of the video watched
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun averageViewPercentage(): Double? =
                averageViewPercentage.getNullable("averageViewPercentage")

            /**
             * Card click-through rate
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun cardClickRate(): Double? = cardClickRate.getNullable("cardClickRate")

            /**
             * Number of card clicks
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun cardClicks(): Double? = cardClicks.getNullable("cardClicks")

            /**
             * Number of card impressions
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun cardImpressions(): Double? = cardImpressions.getNullable("cardImpressions")

            /**
             * Card teaser click-through rate
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun cardTeaserClickRate(): Double? =
                cardTeaserClickRate.getNullable("cardTeaserClickRate")

            /**
             * Number of card teaser clicks
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun cardTeaserClicks(): Double? = cardTeaserClicks.getNullable("cardTeaserClicks")

            /**
             * Number of card teaser impressions
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun cardTeaserImpressions(): Double? =
                cardTeaserImpressions.getNullable("cardTeaserImpressions")

            /**
             * Number of engaged views
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun engagedViews(): Double? = engagedViews.getNullable("engagedViews")

            /**
             * Estimated minutes watched
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun estimatedMinutesWatched(): Double? =
                estimatedMinutesWatched.getNullable("estimatedMinutesWatched")

            /**
             * Estimated minutes watched by YouTube Premium (Red) members
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun estimatedRedMinutesWatched(): Double? =
                estimatedRedMinutesWatched.getNullable("estimatedRedMinutesWatched")

            /**
             * Number of views from YouTube Premium (Red) members
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun redViews(): Double? = redViews.getNullable("redViews")

            /**
             * Number of shares
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun shares(): Double? = shares.getNullable("shares")

            /**
             * Subscribers gained
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun subscribersGained(): Double? = subscribersGained.getNullable("subscribersGained")

            /**
             * Subscribers lost
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun subscribersLost(): Double? = subscribersLost.getNullable("subscribersLost")

            /**
             * Number of times the video was added to playlists
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videosAddedToPlaylists(): Double? =
                videosAddedToPlaylists.getNullable("videosAddedToPlaylists")

            /**
             * Number of times the video was removed from playlists
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videosRemovedFromPlaylists(): Double? =
                videosRemovedFromPlaylists.getNullable("videosRemovedFromPlaylists")

            /**
             * Returns the raw JSON value of [comments].
             *
             * Unlike [comments], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("comments") @ExcludeMissing fun _comments(): JsonField<Double> = comments

            /**
             * Returns the raw JSON value of [dislikes].
             *
             * Unlike [dislikes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dislikes") @ExcludeMissing fun _dislikes(): JsonField<Double> = dislikes

            /**
             * Returns the raw JSON value of [likes].
             *
             * Unlike [likes], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("likes") @ExcludeMissing fun _likes(): JsonField<Double> = likes

            /**
             * Returns the raw JSON value of [views].
             *
             * Unlike [views], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("views") @ExcludeMissing fun _views(): JsonField<Double> = views

            /**
             * Returns the raw JSON value of [annotationClickableImpressions].
             *
             * Unlike [annotationClickableImpressions], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("annotationClickableImpressions")
            @ExcludeMissing
            fun _annotationClickableImpressions(): JsonField<Double> =
                annotationClickableImpressions

            /**
             * Returns the raw JSON value of [annotationClicks].
             *
             * Unlike [annotationClicks], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("annotationClicks")
            @ExcludeMissing
            fun _annotationClicks(): JsonField<Double> = annotationClicks

            /**
             * Returns the raw JSON value of [annotationClickThroughRate].
             *
             * Unlike [annotationClickThroughRate], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("annotationClickThroughRate")
            @ExcludeMissing
            fun _annotationClickThroughRate(): JsonField<Double> = annotationClickThroughRate

            /**
             * Returns the raw JSON value of [annotationClosableImpressions].
             *
             * Unlike [annotationClosableImpressions], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("annotationClosableImpressions")
            @ExcludeMissing
            fun _annotationClosableImpressions(): JsonField<Double> = annotationClosableImpressions

            /**
             * Returns the raw JSON value of [annotationCloseRate].
             *
             * Unlike [annotationCloseRate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("annotationCloseRate")
            @ExcludeMissing
            fun _annotationCloseRate(): JsonField<Double> = annotationCloseRate

            /**
             * Returns the raw JSON value of [annotationCloses].
             *
             * Unlike [annotationCloses], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("annotationCloses")
            @ExcludeMissing
            fun _annotationCloses(): JsonField<Double> = annotationCloses

            /**
             * Returns the raw JSON value of [annotationImpressions].
             *
             * Unlike [annotationImpressions], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("annotationImpressions")
            @ExcludeMissing
            fun _annotationImpressions(): JsonField<Double> = annotationImpressions

            /**
             * Returns the raw JSON value of [averageViewDuration].
             *
             * Unlike [averageViewDuration], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("averageViewDuration")
            @ExcludeMissing
            fun _averageViewDuration(): JsonField<Double> = averageViewDuration

            /**
             * Returns the raw JSON value of [averageViewPercentage].
             *
             * Unlike [averageViewPercentage], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("averageViewPercentage")
            @ExcludeMissing
            fun _averageViewPercentage(): JsonField<Double> = averageViewPercentage

            /**
             * Returns the raw JSON value of [cardClickRate].
             *
             * Unlike [cardClickRate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cardClickRate")
            @ExcludeMissing
            fun _cardClickRate(): JsonField<Double> = cardClickRate

            /**
             * Returns the raw JSON value of [cardClicks].
             *
             * Unlike [cardClicks], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cardClicks")
            @ExcludeMissing
            fun _cardClicks(): JsonField<Double> = cardClicks

            /**
             * Returns the raw JSON value of [cardImpressions].
             *
             * Unlike [cardImpressions], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("cardImpressions")
            @ExcludeMissing
            fun _cardImpressions(): JsonField<Double> = cardImpressions

            /**
             * Returns the raw JSON value of [cardTeaserClickRate].
             *
             * Unlike [cardTeaserClickRate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("cardTeaserClickRate")
            @ExcludeMissing
            fun _cardTeaserClickRate(): JsonField<Double> = cardTeaserClickRate

            /**
             * Returns the raw JSON value of [cardTeaserClicks].
             *
             * Unlike [cardTeaserClicks], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("cardTeaserClicks")
            @ExcludeMissing
            fun _cardTeaserClicks(): JsonField<Double> = cardTeaserClicks

            /**
             * Returns the raw JSON value of [cardTeaserImpressions].
             *
             * Unlike [cardTeaserImpressions], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("cardTeaserImpressions")
            @ExcludeMissing
            fun _cardTeaserImpressions(): JsonField<Double> = cardTeaserImpressions

            /**
             * Returns the raw JSON value of [engagedViews].
             *
             * Unlike [engagedViews], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("engagedViews")
            @ExcludeMissing
            fun _engagedViews(): JsonField<Double> = engagedViews

            /**
             * Returns the raw JSON value of [estimatedMinutesWatched].
             *
             * Unlike [estimatedMinutesWatched], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("estimatedMinutesWatched")
            @ExcludeMissing
            fun _estimatedMinutesWatched(): JsonField<Double> = estimatedMinutesWatched

            /**
             * Returns the raw JSON value of [estimatedRedMinutesWatched].
             *
             * Unlike [estimatedRedMinutesWatched], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("estimatedRedMinutesWatched")
            @ExcludeMissing
            fun _estimatedRedMinutesWatched(): JsonField<Double> = estimatedRedMinutesWatched

            /**
             * Returns the raw JSON value of [redViews].
             *
             * Unlike [redViews], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("redViews") @ExcludeMissing fun _redViews(): JsonField<Double> = redViews

            /**
             * Returns the raw JSON value of [shares].
             *
             * Unlike [shares], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("shares") @ExcludeMissing fun _shares(): JsonField<Double> = shares

            /**
             * Returns the raw JSON value of [subscribersGained].
             *
             * Unlike [subscribersGained], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscribersGained")
            @ExcludeMissing
            fun _subscribersGained(): JsonField<Double> = subscribersGained

            /**
             * Returns the raw JSON value of [subscribersLost].
             *
             * Unlike [subscribersLost], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscribersLost")
            @ExcludeMissing
            fun _subscribersLost(): JsonField<Double> = subscribersLost

            /**
             * Returns the raw JSON value of [videosAddedToPlaylists].
             *
             * Unlike [videosAddedToPlaylists], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("videosAddedToPlaylists")
            @ExcludeMissing
            fun _videosAddedToPlaylists(): JsonField<Double> = videosAddedToPlaylists

            /**
             * Returns the raw JSON value of [videosRemovedFromPlaylists].
             *
             * Unlike [videosRemovedFromPlaylists], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("videosRemovedFromPlaylists")
            @ExcludeMissing
            fun _videosRemovedFromPlaylists(): JsonField<Double> = videosRemovedFromPlaylists

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
                 * Returns a mutable builder for constructing an instance of
                 * [YouTubePostMetricsDto].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .comments()
                 * .dislikes()
                 * .likes()
                 * .views()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [YouTubePostMetricsDto]. */
            class Builder internal constructor() {

                private var comments: JsonField<Double>? = null
                private var dislikes: JsonField<Double>? = null
                private var likes: JsonField<Double>? = null
                private var views: JsonField<Double>? = null
                private var annotationClickableImpressions: JsonField<Double> = JsonMissing.of()
                private var annotationClicks: JsonField<Double> = JsonMissing.of()
                private var annotationClickThroughRate: JsonField<Double> = JsonMissing.of()
                private var annotationClosableImpressions: JsonField<Double> = JsonMissing.of()
                private var annotationCloseRate: JsonField<Double> = JsonMissing.of()
                private var annotationCloses: JsonField<Double> = JsonMissing.of()
                private var annotationImpressions: JsonField<Double> = JsonMissing.of()
                private var averageViewDuration: JsonField<Double> = JsonMissing.of()
                private var averageViewPercentage: JsonField<Double> = JsonMissing.of()
                private var cardClickRate: JsonField<Double> = JsonMissing.of()
                private var cardClicks: JsonField<Double> = JsonMissing.of()
                private var cardImpressions: JsonField<Double> = JsonMissing.of()
                private var cardTeaserClickRate: JsonField<Double> = JsonMissing.of()
                private var cardTeaserClicks: JsonField<Double> = JsonMissing.of()
                private var cardTeaserImpressions: JsonField<Double> = JsonMissing.of()
                private var engagedViews: JsonField<Double> = JsonMissing.of()
                private var estimatedMinutesWatched: JsonField<Double> = JsonMissing.of()
                private var estimatedRedMinutesWatched: JsonField<Double> = JsonMissing.of()
                private var redViews: JsonField<Double> = JsonMissing.of()
                private var shares: JsonField<Double> = JsonMissing.of()
                private var subscribersGained: JsonField<Double> = JsonMissing.of()
                private var subscribersLost: JsonField<Double> = JsonMissing.of()
                private var videosAddedToPlaylists: JsonField<Double> = JsonMissing.of()
                private var videosRemovedFromPlaylists: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(youTubePostMetricsDto: YouTubePostMetricsDto) = apply {
                    comments = youTubePostMetricsDto.comments
                    dislikes = youTubePostMetricsDto.dislikes
                    likes = youTubePostMetricsDto.likes
                    views = youTubePostMetricsDto.views
                    annotationClickableImpressions =
                        youTubePostMetricsDto.annotationClickableImpressions
                    annotationClicks = youTubePostMetricsDto.annotationClicks
                    annotationClickThroughRate = youTubePostMetricsDto.annotationClickThroughRate
                    annotationClosableImpressions =
                        youTubePostMetricsDto.annotationClosableImpressions
                    annotationCloseRate = youTubePostMetricsDto.annotationCloseRate
                    annotationCloses = youTubePostMetricsDto.annotationCloses
                    annotationImpressions = youTubePostMetricsDto.annotationImpressions
                    averageViewDuration = youTubePostMetricsDto.averageViewDuration
                    averageViewPercentage = youTubePostMetricsDto.averageViewPercentage
                    cardClickRate = youTubePostMetricsDto.cardClickRate
                    cardClicks = youTubePostMetricsDto.cardClicks
                    cardImpressions = youTubePostMetricsDto.cardImpressions
                    cardTeaserClickRate = youTubePostMetricsDto.cardTeaserClickRate
                    cardTeaserClicks = youTubePostMetricsDto.cardTeaserClicks
                    cardTeaserImpressions = youTubePostMetricsDto.cardTeaserImpressions
                    engagedViews = youTubePostMetricsDto.engagedViews
                    estimatedMinutesWatched = youTubePostMetricsDto.estimatedMinutesWatched
                    estimatedRedMinutesWatched = youTubePostMetricsDto.estimatedRedMinutesWatched
                    redViews = youTubePostMetricsDto.redViews
                    shares = youTubePostMetricsDto.shares
                    subscribersGained = youTubePostMetricsDto.subscribersGained
                    subscribersLost = youTubePostMetricsDto.subscribersLost
                    videosAddedToPlaylists = youTubePostMetricsDto.videosAddedToPlaylists
                    videosRemovedFromPlaylists = youTubePostMetricsDto.videosRemovedFromPlaylists
                    additionalProperties = youTubePostMetricsDto.additionalProperties.toMutableMap()
                }

                /** Number of comments on the video */
                fun comments(comments: Double) = comments(JsonField.of(comments))

                /**
                 * Sets [Builder.comments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.comments] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun comments(comments: JsonField<Double>) = apply { this.comments = comments }

                /** Number of dislikes on the video */
                fun dislikes(dislikes: Double) = dislikes(JsonField.of(dislikes))

                /**
                 * Sets [Builder.dislikes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dislikes] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dislikes(dislikes: JsonField<Double>) = apply { this.dislikes = dislikes }

                /** Number of likes on the video */
                fun likes(likes: Double) = likes(JsonField.of(likes))

                /**
                 * Sets [Builder.likes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.likes] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun likes(likes: JsonField<Double>) = apply { this.likes = likes }

                /** Number of views on the video */
                fun views(views: Double) = views(JsonField.of(views))

                /**
                 * Sets [Builder.views] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.views] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun views(views: JsonField<Double>) = apply { this.views = views }

                /** Number of clickable annotation impressions */
                fun annotationClickableImpressions(annotationClickableImpressions: Double) =
                    annotationClickableImpressions(JsonField.of(annotationClickableImpressions))

                /**
                 * Sets [Builder.annotationClickableImpressions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.annotationClickableImpressions] with a
                 * well-typed [Double] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun annotationClickableImpressions(
                    annotationClickableImpressions: JsonField<Double>
                ) = apply { this.annotationClickableImpressions = annotationClickableImpressions }

                /** Number of annotation clicks */
                fun annotationClicks(annotationClicks: Double) =
                    annotationClicks(JsonField.of(annotationClicks))

                /**
                 * Sets [Builder.annotationClicks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.annotationClicks] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun annotationClicks(annotationClicks: JsonField<Double>) = apply {
                    this.annotationClicks = annotationClicks
                }

                /** Annotation click-through rate */
                fun annotationClickThroughRate(annotationClickThroughRate: Double) =
                    annotationClickThroughRate(JsonField.of(annotationClickThroughRate))

                /**
                 * Sets [Builder.annotationClickThroughRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.annotationClickThroughRate] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun annotationClickThroughRate(annotationClickThroughRate: JsonField<Double>) =
                    apply {
                        this.annotationClickThroughRate = annotationClickThroughRate
                    }

                /** Number of closable annotation impressions */
                fun annotationClosableImpressions(annotationClosableImpressions: Double) =
                    annotationClosableImpressions(JsonField.of(annotationClosableImpressions))

                /**
                 * Sets [Builder.annotationClosableImpressions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.annotationClosableImpressions] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun annotationClosableImpressions(
                    annotationClosableImpressions: JsonField<Double>
                ) = apply { this.annotationClosableImpressions = annotationClosableImpressions }

                /** Annotation close rate */
                fun annotationCloseRate(annotationCloseRate: Double) =
                    annotationCloseRate(JsonField.of(annotationCloseRate))

                /**
                 * Sets [Builder.annotationCloseRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.annotationCloseRate] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun annotationCloseRate(annotationCloseRate: JsonField<Double>) = apply {
                    this.annotationCloseRate = annotationCloseRate
                }

                /** Number of annotation closes */
                fun annotationCloses(annotationCloses: Double) =
                    annotationCloses(JsonField.of(annotationCloses))

                /**
                 * Sets [Builder.annotationCloses] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.annotationCloses] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun annotationCloses(annotationCloses: JsonField<Double>) = apply {
                    this.annotationCloses = annotationCloses
                }

                /** Number of annotation impressions */
                fun annotationImpressions(annotationImpressions: Double) =
                    annotationImpressions(JsonField.of(annotationImpressions))

                /**
                 * Sets [Builder.annotationImpressions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.annotationImpressions] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun annotationImpressions(annotationImpressions: JsonField<Double>) = apply {
                    this.annotationImpressions = annotationImpressions
                }

                /** Average view duration in seconds */
                fun averageViewDuration(averageViewDuration: Double) =
                    averageViewDuration(JsonField.of(averageViewDuration))

                /**
                 * Sets [Builder.averageViewDuration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.averageViewDuration] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun averageViewDuration(averageViewDuration: JsonField<Double>) = apply {
                    this.averageViewDuration = averageViewDuration
                }

                /** Average percentage of the video watched */
                fun averageViewPercentage(averageViewPercentage: Double) =
                    averageViewPercentage(JsonField.of(averageViewPercentage))

                /**
                 * Sets [Builder.averageViewPercentage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.averageViewPercentage] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun averageViewPercentage(averageViewPercentage: JsonField<Double>) = apply {
                    this.averageViewPercentage = averageViewPercentage
                }

                /** Card click-through rate */
                fun cardClickRate(cardClickRate: Double) =
                    cardClickRate(JsonField.of(cardClickRate))

                /**
                 * Sets [Builder.cardClickRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardClickRate] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cardClickRate(cardClickRate: JsonField<Double>) = apply {
                    this.cardClickRate = cardClickRate
                }

                /** Number of card clicks */
                fun cardClicks(cardClicks: Double) = cardClicks(JsonField.of(cardClicks))

                /**
                 * Sets [Builder.cardClicks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardClicks] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cardClicks(cardClicks: JsonField<Double>) = apply {
                    this.cardClicks = cardClicks
                }

                /** Number of card impressions */
                fun cardImpressions(cardImpressions: Double) =
                    cardImpressions(JsonField.of(cardImpressions))

                /**
                 * Sets [Builder.cardImpressions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardImpressions] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun cardImpressions(cardImpressions: JsonField<Double>) = apply {
                    this.cardImpressions = cardImpressions
                }

                /** Card teaser click-through rate */
                fun cardTeaserClickRate(cardTeaserClickRate: Double) =
                    cardTeaserClickRate(JsonField.of(cardTeaserClickRate))

                /**
                 * Sets [Builder.cardTeaserClickRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardTeaserClickRate] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun cardTeaserClickRate(cardTeaserClickRate: JsonField<Double>) = apply {
                    this.cardTeaserClickRate = cardTeaserClickRate
                }

                /** Number of card teaser clicks */
                fun cardTeaserClicks(cardTeaserClicks: Double) =
                    cardTeaserClicks(JsonField.of(cardTeaserClicks))

                /**
                 * Sets [Builder.cardTeaserClicks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardTeaserClicks] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun cardTeaserClicks(cardTeaserClicks: JsonField<Double>) = apply {
                    this.cardTeaserClicks = cardTeaserClicks
                }

                /** Number of card teaser impressions */
                fun cardTeaserImpressions(cardTeaserImpressions: Double) =
                    cardTeaserImpressions(JsonField.of(cardTeaserImpressions))

                /**
                 * Sets [Builder.cardTeaserImpressions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardTeaserImpressions] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun cardTeaserImpressions(cardTeaserImpressions: JsonField<Double>) = apply {
                    this.cardTeaserImpressions = cardTeaserImpressions
                }

                /** Number of engaged views */
                fun engagedViews(engagedViews: Double) = engagedViews(JsonField.of(engagedViews))

                /**
                 * Sets [Builder.engagedViews] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.engagedViews] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun engagedViews(engagedViews: JsonField<Double>) = apply {
                    this.engagedViews = engagedViews
                }

                /** Estimated minutes watched */
                fun estimatedMinutesWatched(estimatedMinutesWatched: Double) =
                    estimatedMinutesWatched(JsonField.of(estimatedMinutesWatched))

                /**
                 * Sets [Builder.estimatedMinutesWatched] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.estimatedMinutesWatched] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun estimatedMinutesWatched(estimatedMinutesWatched: JsonField<Double>) = apply {
                    this.estimatedMinutesWatched = estimatedMinutesWatched
                }

                /** Estimated minutes watched by YouTube Premium (Red) members */
                fun estimatedRedMinutesWatched(estimatedRedMinutesWatched: Double) =
                    estimatedRedMinutesWatched(JsonField.of(estimatedRedMinutesWatched))

                /**
                 * Sets [Builder.estimatedRedMinutesWatched] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.estimatedRedMinutesWatched] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun estimatedRedMinutesWatched(estimatedRedMinutesWatched: JsonField<Double>) =
                    apply {
                        this.estimatedRedMinutesWatched = estimatedRedMinutesWatched
                    }

                /** Number of views from YouTube Premium (Red) members */
                fun redViews(redViews: Double) = redViews(JsonField.of(redViews))

                /**
                 * Sets [Builder.redViews] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.redViews] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun redViews(redViews: JsonField<Double>) = apply { this.redViews = redViews }

                /** Number of shares */
                fun shares(shares: Double) = shares(JsonField.of(shares))

                /**
                 * Sets [Builder.shares] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shares] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun shares(shares: JsonField<Double>) = apply { this.shares = shares }

                /** Subscribers gained */
                fun subscribersGained(subscribersGained: Double) =
                    subscribersGained(JsonField.of(subscribersGained))

                /**
                 * Sets [Builder.subscribersGained] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscribersGained] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun subscribersGained(subscribersGained: JsonField<Double>) = apply {
                    this.subscribersGained = subscribersGained
                }

                /** Subscribers lost */
                fun subscribersLost(subscribersLost: Double) =
                    subscribersLost(JsonField.of(subscribersLost))

                /**
                 * Sets [Builder.subscribersLost] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscribersLost] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun subscribersLost(subscribersLost: JsonField<Double>) = apply {
                    this.subscribersLost = subscribersLost
                }

                /** Number of times the video was added to playlists */
                fun videosAddedToPlaylists(videosAddedToPlaylists: Double) =
                    videosAddedToPlaylists(JsonField.of(videosAddedToPlaylists))

                /**
                 * Sets [Builder.videosAddedToPlaylists] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videosAddedToPlaylists] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun videosAddedToPlaylists(videosAddedToPlaylists: JsonField<Double>) = apply {
                    this.videosAddedToPlaylists = videosAddedToPlaylists
                }

                /** Number of times the video was removed from playlists */
                fun videosRemovedFromPlaylists(videosRemovedFromPlaylists: Double) =
                    videosRemovedFromPlaylists(JsonField.of(videosRemovedFromPlaylists))

                /**
                 * Sets [Builder.videosRemovedFromPlaylists] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videosRemovedFromPlaylists] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun videosRemovedFromPlaylists(videosRemovedFromPlaylists: JsonField<Double>) =
                    apply {
                        this.videosRemovedFromPlaylists = videosRemovedFromPlaylists
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
                 * Returns an immutable instance of [YouTubePostMetricsDto].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .comments()
                 * .dislikes()
                 * .likes()
                 * .views()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): YouTubePostMetricsDto =
                    YouTubePostMetricsDto(
                        checkRequired("comments", comments),
                        checkRequired("dislikes", dislikes),
                        checkRequired("likes", likes),
                        checkRequired("views", views),
                        annotationClickableImpressions,
                        annotationClicks,
                        annotationClickThroughRate,
                        annotationClosableImpressions,
                        annotationCloseRate,
                        annotationCloses,
                        annotationImpressions,
                        averageViewDuration,
                        averageViewPercentage,
                        cardClickRate,
                        cardClicks,
                        cardImpressions,
                        cardTeaserClickRate,
                        cardTeaserClicks,
                        cardTeaserImpressions,
                        engagedViews,
                        estimatedMinutesWatched,
                        estimatedRedMinutesWatched,
                        redViews,
                        shares,
                        subscribersGained,
                        subscribersLost,
                        videosAddedToPlaylists,
                        videosRemovedFromPlaylists,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws PostForMeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): YouTubePostMetricsDto = apply {
                if (validated) {
                    return@apply
                }

                comments()
                dislikes()
                likes()
                views()
                annotationClickableImpressions()
                annotationClicks()
                annotationClickThroughRate()
                annotationClosableImpressions()
                annotationCloseRate()
                annotationCloses()
                annotationImpressions()
                averageViewDuration()
                averageViewPercentage()
                cardClickRate()
                cardClicks()
                cardImpressions()
                cardTeaserClickRate()
                cardTeaserClicks()
                cardTeaserImpressions()
                engagedViews()
                estimatedMinutesWatched()
                estimatedRedMinutesWatched()
                redViews()
                shares()
                subscribersGained()
                subscribersLost()
                videosAddedToPlaylists()
                videosRemovedFromPlaylists()
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
                (if (comments.asKnown() == null) 0 else 1) +
                    (if (dislikes.asKnown() == null) 0 else 1) +
                    (if (likes.asKnown() == null) 0 else 1) +
                    (if (views.asKnown() == null) 0 else 1) +
                    (if (annotationClickableImpressions.asKnown() == null) 0 else 1) +
                    (if (annotationClicks.asKnown() == null) 0 else 1) +
                    (if (annotationClickThroughRate.asKnown() == null) 0 else 1) +
                    (if (annotationClosableImpressions.asKnown() == null) 0 else 1) +
                    (if (annotationCloseRate.asKnown() == null) 0 else 1) +
                    (if (annotationCloses.asKnown() == null) 0 else 1) +
                    (if (annotationImpressions.asKnown() == null) 0 else 1) +
                    (if (averageViewDuration.asKnown() == null) 0 else 1) +
                    (if (averageViewPercentage.asKnown() == null) 0 else 1) +
                    (if (cardClickRate.asKnown() == null) 0 else 1) +
                    (if (cardClicks.asKnown() == null) 0 else 1) +
                    (if (cardImpressions.asKnown() == null) 0 else 1) +
                    (if (cardTeaserClickRate.asKnown() == null) 0 else 1) +
                    (if (cardTeaserClicks.asKnown() == null) 0 else 1) +
                    (if (cardTeaserImpressions.asKnown() == null) 0 else 1) +
                    (if (engagedViews.asKnown() == null) 0 else 1) +
                    (if (estimatedMinutesWatched.asKnown() == null) 0 else 1) +
                    (if (estimatedRedMinutesWatched.asKnown() == null) 0 else 1) +
                    (if (redViews.asKnown() == null) 0 else 1) +
                    (if (shares.asKnown() == null) 0 else 1) +
                    (if (subscribersGained.asKnown() == null) 0 else 1) +
                    (if (subscribersLost.asKnown() == null) 0 else 1) +
                    (if (videosAddedToPlaylists.asKnown() == null) 0 else 1) +
                    (if (videosRemovedFromPlaylists.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is YouTubePostMetricsDto &&
                    comments == other.comments &&
                    dislikes == other.dislikes &&
                    likes == other.likes &&
                    views == other.views &&
                    annotationClickableImpressions == other.annotationClickableImpressions &&
                    annotationClicks == other.annotationClicks &&
                    annotationClickThroughRate == other.annotationClickThroughRate &&
                    annotationClosableImpressions == other.annotationClosableImpressions &&
                    annotationCloseRate == other.annotationCloseRate &&
                    annotationCloses == other.annotationCloses &&
                    annotationImpressions == other.annotationImpressions &&
                    averageViewDuration == other.averageViewDuration &&
                    averageViewPercentage == other.averageViewPercentage &&
                    cardClickRate == other.cardClickRate &&
                    cardClicks == other.cardClicks &&
                    cardImpressions == other.cardImpressions &&
                    cardTeaserClickRate == other.cardTeaserClickRate &&
                    cardTeaserClicks == other.cardTeaserClicks &&
                    cardTeaserImpressions == other.cardTeaserImpressions &&
                    engagedViews == other.engagedViews &&
                    estimatedMinutesWatched == other.estimatedMinutesWatched &&
                    estimatedRedMinutesWatched == other.estimatedRedMinutesWatched &&
                    redViews == other.redViews &&
                    shares == other.shares &&
                    subscribersGained == other.subscribersGained &&
                    subscribersLost == other.subscribersLost &&
                    videosAddedToPlaylists == other.videosAddedToPlaylists &&
                    videosRemovedFromPlaylists == other.videosRemovedFromPlaylists &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    comments,
                    dislikes,
                    likes,
                    views,
                    annotationClickableImpressions,
                    annotationClicks,
                    annotationClickThroughRate,
                    annotationClosableImpressions,
                    annotationCloseRate,
                    annotationCloses,
                    annotationImpressions,
                    averageViewDuration,
                    averageViewPercentage,
                    cardClickRate,
                    cardClicks,
                    cardImpressions,
                    cardTeaserClickRate,
                    cardTeaserClicks,
                    cardTeaserImpressions,
                    engagedViews,
                    estimatedMinutesWatched,
                    estimatedRedMinutesWatched,
                    redViews,
                    shares,
                    subscribersGained,
                    subscribersLost,
                    videosAddedToPlaylists,
                    videosRemovedFromPlaylists,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "YouTubePostMetricsDto{comments=$comments, dislikes=$dislikes, likes=$likes, views=$views, annotationClickableImpressions=$annotationClickableImpressions, annotationClicks=$annotationClicks, annotationClickThroughRate=$annotationClickThroughRate, annotationClosableImpressions=$annotationClosableImpressions, annotationCloseRate=$annotationCloseRate, annotationCloses=$annotationCloses, annotationImpressions=$annotationImpressions, averageViewDuration=$averageViewDuration, averageViewPercentage=$averageViewPercentage, cardClickRate=$cardClickRate, cardClicks=$cardClicks, cardImpressions=$cardImpressions, cardTeaserClickRate=$cardTeaserClickRate, cardTeaserClicks=$cardTeaserClicks, cardTeaserImpressions=$cardTeaserImpressions, engagedViews=$engagedViews, estimatedMinutesWatched=$estimatedMinutesWatched, estimatedRedMinutesWatched=$estimatedRedMinutesWatched, redViews=$redViews, shares=$shares, subscribersGained=$subscribersGained, subscribersLost=$subscribersLost, videosAddedToPlaylists=$videosAddedToPlaylists, videosRemovedFromPlaylists=$videosRemovedFromPlaylists, additionalProperties=$additionalProperties}"
        }

        class FacebookPostMetricsDto
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val activityByActionType: JsonField<List<ActivityByActionType>>,
            private val activityByActionTypeUnique: JsonField<List<ActivityByActionTypeUnique>>,
            private val comments: JsonField<Double>,
            private val fanReach: JsonField<Double>,
            private val mediaViews: JsonField<Double>,
            private val nonviralReach: JsonField<Double>,
            private val organicReach: JsonField<Double>,
            private val paidReach: JsonField<Double>,
            private val reach: JsonField<Double>,
            private val reactionsAnger: JsonField<Double>,
            private val reactionsByType: JsonValue,
            private val reactionsHaha: JsonField<Double>,
            private val reactionsLike: JsonField<Double>,
            private val reactionsLove: JsonField<Double>,
            private val reactionsSorry: JsonField<Double>,
            private val reactionsTotal: JsonField<Double>,
            private val reactionsWow: JsonField<Double>,
            private val shares: JsonField<Double>,
            private val videoAvgTimeWatched: JsonField<Double>,
            private val videoCompleteViewsOrganic: JsonField<Double>,
            private val videoCompleteViewsOrganicUnique: JsonField<Double>,
            private val videoCompleteViewsPaid: JsonField<Double>,
            private val videoCompleteViewsPaidUnique: JsonField<Double>,
            private val videoLength: JsonField<Double>,
            private val videoRetentionGraphAutoplayed:
                JsonField<List<VideoRetentionGraphAutoplayed>>,
            private val videoRetentionGraphClickedToPlay:
                JsonField<List<VideoRetentionGraphClickedToPlay>>,
            private val videoSocialActionsUnique: JsonField<Double>,
            private val videoViewTime: JsonField<Double>,
            private val videoViewTimeByAgeGender: JsonField<List<VideoViewTimeByAgeGender>>,
            private val videoViewTimeByCountry: JsonField<List<VideoViewTimeByCountry>>,
            private val videoViewTimeByDistributionType: JsonValue,
            private val videoViewTimeByRegion: JsonField<List<VideoViewTimeByRegion>>,
            private val videoViewTimeOrganic: JsonField<Double>,
            private val videoViews: JsonField<Double>,
            private val videoViews15s: JsonField<Double>,
            private val videoViews60s: JsonField<Double>,
            private val videoViewsAutoplayed: JsonField<Double>,
            private val videoViewsByDistributionType: JsonValue,
            private val videoViewsClickedToPlay: JsonField<Double>,
            private val videoViewsOrganic: JsonField<Double>,
            private val videoViewsOrganicUnique: JsonField<Double>,
            private val videoViewsPaid: JsonField<Double>,
            private val videoViewsPaidUnique: JsonField<Double>,
            private val videoViewsSoundOn: JsonField<Double>,
            private val videoViewsUnique: JsonField<Double>,
            private val viralReach: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("activity_by_action_type")
                @ExcludeMissing
                activityByActionType: JsonField<List<ActivityByActionType>> = JsonMissing.of(),
                @JsonProperty("activity_by_action_type_unique")
                @ExcludeMissing
                activityByActionTypeUnique: JsonField<List<ActivityByActionTypeUnique>> =
                    JsonMissing.of(),
                @JsonProperty("comments")
                @ExcludeMissing
                comments: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("fan_reach")
                @ExcludeMissing
                fanReach: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("media_views")
                @ExcludeMissing
                mediaViews: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("nonviral_reach")
                @ExcludeMissing
                nonviralReach: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("organic_reach")
                @ExcludeMissing
                organicReach: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("paid_reach")
                @ExcludeMissing
                paidReach: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reach") @ExcludeMissing reach: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reactions_anger")
                @ExcludeMissing
                reactionsAnger: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reactions_by_type")
                @ExcludeMissing
                reactionsByType: JsonValue = JsonMissing.of(),
                @JsonProperty("reactions_haha")
                @ExcludeMissing
                reactionsHaha: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reactions_like")
                @ExcludeMissing
                reactionsLike: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reactions_love")
                @ExcludeMissing
                reactionsLove: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reactions_sorry")
                @ExcludeMissing
                reactionsSorry: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reactions_total")
                @ExcludeMissing
                reactionsTotal: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reactions_wow")
                @ExcludeMissing
                reactionsWow: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("shares")
                @ExcludeMissing
                shares: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_avg_time_watched")
                @ExcludeMissing
                videoAvgTimeWatched: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_complete_views_organic")
                @ExcludeMissing
                videoCompleteViewsOrganic: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_complete_views_organic_unique")
                @ExcludeMissing
                videoCompleteViewsOrganicUnique: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_complete_views_paid")
                @ExcludeMissing
                videoCompleteViewsPaid: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_complete_views_paid_unique")
                @ExcludeMissing
                videoCompleteViewsPaidUnique: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_length")
                @ExcludeMissing
                videoLength: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_retention_graph_autoplayed")
                @ExcludeMissing
                videoRetentionGraphAutoplayed: JsonField<List<VideoRetentionGraphAutoplayed>> =
                    JsonMissing.of(),
                @JsonProperty("video_retention_graph_clicked_to_play")
                @ExcludeMissing
                videoRetentionGraphClickedToPlay:
                    JsonField<List<VideoRetentionGraphClickedToPlay>> =
                    JsonMissing.of(),
                @JsonProperty("video_social_actions_unique")
                @ExcludeMissing
                videoSocialActionsUnique: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_view_time")
                @ExcludeMissing
                videoViewTime: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_view_time_by_age_gender")
                @ExcludeMissing
                videoViewTimeByAgeGender: JsonField<List<VideoViewTimeByAgeGender>> =
                    JsonMissing.of(),
                @JsonProperty("video_view_time_by_country")
                @ExcludeMissing
                videoViewTimeByCountry: JsonField<List<VideoViewTimeByCountry>> = JsonMissing.of(),
                @JsonProperty("video_view_time_by_distribution_type")
                @ExcludeMissing
                videoViewTimeByDistributionType: JsonValue = JsonMissing.of(),
                @JsonProperty("video_view_time_by_region")
                @ExcludeMissing
                videoViewTimeByRegion: JsonField<List<VideoViewTimeByRegion>> = JsonMissing.of(),
                @JsonProperty("video_view_time_organic")
                @ExcludeMissing
                videoViewTimeOrganic: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_views")
                @ExcludeMissing
                videoViews: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_views_15s")
                @ExcludeMissing
                videoViews15s: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_views_60s")
                @ExcludeMissing
                videoViews60s: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_views_autoplayed")
                @ExcludeMissing
                videoViewsAutoplayed: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_views_by_distribution_type")
                @ExcludeMissing
                videoViewsByDistributionType: JsonValue = JsonMissing.of(),
                @JsonProperty("video_views_clicked_to_play")
                @ExcludeMissing
                videoViewsClickedToPlay: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_views_organic")
                @ExcludeMissing
                videoViewsOrganic: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_views_organic_unique")
                @ExcludeMissing
                videoViewsOrganicUnique: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_views_paid")
                @ExcludeMissing
                videoViewsPaid: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_views_paid_unique")
                @ExcludeMissing
                videoViewsPaidUnique: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_views_sound_on")
                @ExcludeMissing
                videoViewsSoundOn: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("video_views_unique")
                @ExcludeMissing
                videoViewsUnique: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("viral_reach")
                @ExcludeMissing
                viralReach: JsonField<Double> = JsonMissing.of(),
            ) : this(
                activityByActionType,
                activityByActionTypeUnique,
                comments,
                fanReach,
                mediaViews,
                nonviralReach,
                organicReach,
                paidReach,
                reach,
                reactionsAnger,
                reactionsByType,
                reactionsHaha,
                reactionsLike,
                reactionsLove,
                reactionsSorry,
                reactionsTotal,
                reactionsWow,
                shares,
                videoAvgTimeWatched,
                videoCompleteViewsOrganic,
                videoCompleteViewsOrganicUnique,
                videoCompleteViewsPaid,
                videoCompleteViewsPaidUnique,
                videoLength,
                videoRetentionGraphAutoplayed,
                videoRetentionGraphClickedToPlay,
                videoSocialActionsUnique,
                videoViewTime,
                videoViewTimeByAgeGender,
                videoViewTimeByCountry,
                videoViewTimeByDistributionType,
                videoViewTimeByRegion,
                videoViewTimeOrganic,
                videoViews,
                videoViews15s,
                videoViews60s,
                videoViewsAutoplayed,
                videoViewsByDistributionType,
                videoViewsClickedToPlay,
                videoViewsOrganic,
                videoViewsOrganicUnique,
                videoViewsPaid,
                videoViewsPaidUnique,
                videoViewsSoundOn,
                videoViewsUnique,
                viralReach,
                mutableMapOf(),
            )

            /**
             * Total activity breakdown by action type
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun activityByActionType(): List<ActivityByActionType>? =
                activityByActionType.getNullable("activity_by_action_type")

            /**
             * Unique users activity breakdown by action type
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun activityByActionTypeUnique(): List<ActivityByActionTypeUnique>? =
                activityByActionTypeUnique.getNullable("activity_by_action_type_unique")

            /**
             * Number of comments (from post object)
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun comments(): Double? = comments.getNullable("comments")

            /**
             * Number of fans who saw the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun fanReach(): Double? = fanReach.getNullable("fan_reach")

            /**
             * Number of times the photo or video was viewed
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun mediaViews(): Double? = mediaViews.getNullable("media_views")

            /**
             * Number of people who saw the post via non-viral distribution
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun nonviralReach(): Double? = nonviralReach.getNullable("nonviral_reach")

            /**
             * Number of people who saw the post via organic distribution
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun organicReach(): Double? = organicReach.getNullable("organic_reach")

            /**
             * Number of people who saw the post via paid distribution
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun paidReach(): Double? = paidReach.getNullable("paid_reach")

            /**
             * Total number of unique people who saw the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun reach(): Double? = reach.getNullable("reach")

            /**
             * Number of anger reactions
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun reactionsAnger(): Double? = reactionsAnger.getNullable("reactions_anger")

            /**
             * Breakdown of all reaction types
             *
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```kotlin
             * val myObject: MyClass = facebookPostMetricsDto.reactionsByType().convert(MyClass::class.java)
             * ```
             */
            @JsonProperty("reactions_by_type")
            @ExcludeMissing
            fun _reactionsByType(): JsonValue = reactionsByType

            /**
             * Number of haha reactions
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun reactionsHaha(): Double? = reactionsHaha.getNullable("reactions_haha")

            /**
             * Number of like reactions
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun reactionsLike(): Double? = reactionsLike.getNullable("reactions_like")

            /**
             * Number of love reactions
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun reactionsLove(): Double? = reactionsLove.getNullable("reactions_love")

            /**
             * Number of sad reactions
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun reactionsSorry(): Double? = reactionsSorry.getNullable("reactions_sorry")

            /**
             * Total number of reactions (all types)
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun reactionsTotal(): Double? = reactionsTotal.getNullable("reactions_total")

            /**
             * Number of wow reactions
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun reactionsWow(): Double? = reactionsWow.getNullable("reactions_wow")

            /**
             * Number of shares (from post object)
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun shares(): Double? = shares.getNullable("shares")

            /**
             * Average time video was viewed in milliseconds
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoAvgTimeWatched(): Double? =
                videoAvgTimeWatched.getNullable("video_avg_time_watched")

            /**
             * Number of times video was viewed to 95% organically
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoCompleteViewsOrganic(): Double? =
                videoCompleteViewsOrganic.getNullable("video_complete_views_organic")

            /**
             * Number of unique people who viewed video to 95% organically
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoCompleteViewsOrganicUnique(): Double? =
                videoCompleteViewsOrganicUnique.getNullable("video_complete_views_organic_unique")

            /**
             * Number of times video was viewed to 95% via paid distribution
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoCompleteViewsPaid(): Double? =
                videoCompleteViewsPaid.getNullable("video_complete_views_paid")

            /**
             * Number of unique people who viewed video to 95% via paid distribution
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoCompleteViewsPaidUnique(): Double? =
                videoCompleteViewsPaidUnique.getNullable("video_complete_views_paid_unique")

            /**
             * Length of the video in milliseconds
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoLength(): Double? = videoLength.getNullable("video_length")

            /**
             * Video retention graph for autoplayed views
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoRetentionGraphAutoplayed(): List<VideoRetentionGraphAutoplayed>? =
                videoRetentionGraphAutoplayed.getNullable("video_retention_graph_autoplayed")

            /**
             * Video retention graph for clicked-to-play views
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoRetentionGraphClickedToPlay(): List<VideoRetentionGraphClickedToPlay>? =
                videoRetentionGraphClickedToPlay.getNullable(
                    "video_retention_graph_clicked_to_play"
                )

            /**
             * Number of unique people who performed social actions on the video
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoSocialActionsUnique(): Double? =
                videoSocialActionsUnique.getNullable("video_social_actions_unique")

            /**
             * Total time video was viewed in milliseconds
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoViewTime(): Double? = videoViewTime.getNullable("video_view_time")

            /**
             * Video view time breakdown by age and gender
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoViewTimeByAgeGender(): List<VideoViewTimeByAgeGender>? =
                videoViewTimeByAgeGender.getNullable("video_view_time_by_age_gender")

            /**
             * Video view time breakdown by country
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoViewTimeByCountry(): List<VideoViewTimeByCountry>? =
                videoViewTimeByCountry.getNullable("video_view_time_by_country")

            /**
             * Video view time breakdown by distribution type
             *
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```kotlin
             * val myObject: MyClass = facebookPostMetricsDto.videoViewTimeByDistributionType().convert(MyClass::class.java)
             * ```
             */
            @JsonProperty("video_view_time_by_distribution_type")
            @ExcludeMissing
            fun _videoViewTimeByDistributionType(): JsonValue = videoViewTimeByDistributionType

            /**
             * Video view time breakdown by region
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoViewTimeByRegion(): List<VideoViewTimeByRegion>? =
                videoViewTimeByRegion.getNullable("video_view_time_by_region")

            /**
             * Total time video was viewed in milliseconds via organic distribution
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoViewTimeOrganic(): Double? =
                videoViewTimeOrganic.getNullable("video_view_time_organic")

            /**
             * Number of times video was viewed for 3+ seconds
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoViews(): Double? = videoViews.getNullable("video_views")

            /**
             * Number of times video was viewed for 15+ seconds
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoViews15s(): Double? = videoViews15s.getNullable("video_views_15s")

            /**
             * Number of times video was viewed for 60+ seconds (excludes videos shorter than 60s)
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoViews60s(): Double? = videoViews60s.getNullable("video_views_60s")

            /**
             * Number of times video was autoplayed for 3+ seconds
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoViewsAutoplayed(): Double? =
                videoViewsAutoplayed.getNullable("video_views_autoplayed")

            /**
             * Video views breakdown by distribution type
             *
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```kotlin
             * val myObject: MyClass = facebookPostMetricsDto.videoViewsByDistributionType().convert(MyClass::class.java)
             * ```
             */
            @JsonProperty("video_views_by_distribution_type")
            @ExcludeMissing
            fun _videoViewsByDistributionType(): JsonValue = videoViewsByDistributionType

            /**
             * Number of times video was clicked to play for 3+ seconds
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoViewsClickedToPlay(): Double? =
                videoViewsClickedToPlay.getNullable("video_views_clicked_to_play")

            /**
             * Number of times video was viewed for 3+ seconds organically
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoViewsOrganic(): Double? = videoViewsOrganic.getNullable("video_views_organic")

            /**
             * Number of unique people who viewed the video for 3+ seconds organically
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoViewsOrganicUnique(): Double? =
                videoViewsOrganicUnique.getNullable("video_views_organic_unique")

            /**
             * Number of times video was viewed for 3+ seconds via paid distribution
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoViewsPaid(): Double? = videoViewsPaid.getNullable("video_views_paid")

            /**
             * Number of unique people who viewed the video for 3+ seconds via paid distribution
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoViewsPaidUnique(): Double? =
                videoViewsPaidUnique.getNullable("video_views_paid_unique")

            /**
             * Number of times video was viewed with sound on
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoViewsSoundOn(): Double? = videoViewsSoundOn.getNullable("video_views_sound_on")

            /**
             * Number of unique people who viewed the video for 3+ seconds
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoViewsUnique(): Double? = videoViewsUnique.getNullable("video_views_unique")

            /**
             * Number of people who saw the post in News Feed via viral reach
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun viralReach(): Double? = viralReach.getNullable("viral_reach")

            /**
             * Returns the raw JSON value of [activityByActionType].
             *
             * Unlike [activityByActionType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("activity_by_action_type")
            @ExcludeMissing
            fun _activityByActionType(): JsonField<List<ActivityByActionType>> =
                activityByActionType

            /**
             * Returns the raw JSON value of [activityByActionTypeUnique].
             *
             * Unlike [activityByActionTypeUnique], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("activity_by_action_type_unique")
            @ExcludeMissing
            fun _activityByActionTypeUnique(): JsonField<List<ActivityByActionTypeUnique>> =
                activityByActionTypeUnique

            /**
             * Returns the raw JSON value of [comments].
             *
             * Unlike [comments], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("comments") @ExcludeMissing fun _comments(): JsonField<Double> = comments

            /**
             * Returns the raw JSON value of [fanReach].
             *
             * Unlike [fanReach], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fan_reach") @ExcludeMissing fun _fanReach(): JsonField<Double> = fanReach

            /**
             * Returns the raw JSON value of [mediaViews].
             *
             * Unlike [mediaViews], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("media_views")
            @ExcludeMissing
            fun _mediaViews(): JsonField<Double> = mediaViews

            /**
             * Returns the raw JSON value of [nonviralReach].
             *
             * Unlike [nonviralReach], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("nonviral_reach")
            @ExcludeMissing
            fun _nonviralReach(): JsonField<Double> = nonviralReach

            /**
             * Returns the raw JSON value of [organicReach].
             *
             * Unlike [organicReach], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("organic_reach")
            @ExcludeMissing
            fun _organicReach(): JsonField<Double> = organicReach

            /**
             * Returns the raw JSON value of [paidReach].
             *
             * Unlike [paidReach], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paid_reach")
            @ExcludeMissing
            fun _paidReach(): JsonField<Double> = paidReach

            /**
             * Returns the raw JSON value of [reach].
             *
             * Unlike [reach], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reach") @ExcludeMissing fun _reach(): JsonField<Double> = reach

            /**
             * Returns the raw JSON value of [reactionsAnger].
             *
             * Unlike [reactionsAnger], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("reactions_anger")
            @ExcludeMissing
            fun _reactionsAnger(): JsonField<Double> = reactionsAnger

            /**
             * Returns the raw JSON value of [reactionsHaha].
             *
             * Unlike [reactionsHaha], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reactions_haha")
            @ExcludeMissing
            fun _reactionsHaha(): JsonField<Double> = reactionsHaha

            /**
             * Returns the raw JSON value of [reactionsLike].
             *
             * Unlike [reactionsLike], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reactions_like")
            @ExcludeMissing
            fun _reactionsLike(): JsonField<Double> = reactionsLike

            /**
             * Returns the raw JSON value of [reactionsLove].
             *
             * Unlike [reactionsLove], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reactions_love")
            @ExcludeMissing
            fun _reactionsLove(): JsonField<Double> = reactionsLove

            /**
             * Returns the raw JSON value of [reactionsSorry].
             *
             * Unlike [reactionsSorry], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("reactions_sorry")
            @ExcludeMissing
            fun _reactionsSorry(): JsonField<Double> = reactionsSorry

            /**
             * Returns the raw JSON value of [reactionsTotal].
             *
             * Unlike [reactionsTotal], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("reactions_total")
            @ExcludeMissing
            fun _reactionsTotal(): JsonField<Double> = reactionsTotal

            /**
             * Returns the raw JSON value of [reactionsWow].
             *
             * Unlike [reactionsWow], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reactions_wow")
            @ExcludeMissing
            fun _reactionsWow(): JsonField<Double> = reactionsWow

            /**
             * Returns the raw JSON value of [shares].
             *
             * Unlike [shares], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("shares") @ExcludeMissing fun _shares(): JsonField<Double> = shares

            /**
             * Returns the raw JSON value of [videoAvgTimeWatched].
             *
             * Unlike [videoAvgTimeWatched], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("video_avg_time_watched")
            @ExcludeMissing
            fun _videoAvgTimeWatched(): JsonField<Double> = videoAvgTimeWatched

            /**
             * Returns the raw JSON value of [videoCompleteViewsOrganic].
             *
             * Unlike [videoCompleteViewsOrganic], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("video_complete_views_organic")
            @ExcludeMissing
            fun _videoCompleteViewsOrganic(): JsonField<Double> = videoCompleteViewsOrganic

            /**
             * Returns the raw JSON value of [videoCompleteViewsOrganicUnique].
             *
             * Unlike [videoCompleteViewsOrganicUnique], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("video_complete_views_organic_unique")
            @ExcludeMissing
            fun _videoCompleteViewsOrganicUnique(): JsonField<Double> =
                videoCompleteViewsOrganicUnique

            /**
             * Returns the raw JSON value of [videoCompleteViewsPaid].
             *
             * Unlike [videoCompleteViewsPaid], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("video_complete_views_paid")
            @ExcludeMissing
            fun _videoCompleteViewsPaid(): JsonField<Double> = videoCompleteViewsPaid

            /**
             * Returns the raw JSON value of [videoCompleteViewsPaidUnique].
             *
             * Unlike [videoCompleteViewsPaidUnique], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("video_complete_views_paid_unique")
            @ExcludeMissing
            fun _videoCompleteViewsPaidUnique(): JsonField<Double> = videoCompleteViewsPaidUnique

            /**
             * Returns the raw JSON value of [videoLength].
             *
             * Unlike [videoLength], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("video_length")
            @ExcludeMissing
            fun _videoLength(): JsonField<Double> = videoLength

            /**
             * Returns the raw JSON value of [videoRetentionGraphAutoplayed].
             *
             * Unlike [videoRetentionGraphAutoplayed], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("video_retention_graph_autoplayed")
            @ExcludeMissing
            fun _videoRetentionGraphAutoplayed(): JsonField<List<VideoRetentionGraphAutoplayed>> =
                videoRetentionGraphAutoplayed

            /**
             * Returns the raw JSON value of [videoRetentionGraphClickedToPlay].
             *
             * Unlike [videoRetentionGraphClickedToPlay], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("video_retention_graph_clicked_to_play")
            @ExcludeMissing
            fun _videoRetentionGraphClickedToPlay():
                JsonField<List<VideoRetentionGraphClickedToPlay>> = videoRetentionGraphClickedToPlay

            /**
             * Returns the raw JSON value of [videoSocialActionsUnique].
             *
             * Unlike [videoSocialActionsUnique], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("video_social_actions_unique")
            @ExcludeMissing
            fun _videoSocialActionsUnique(): JsonField<Double> = videoSocialActionsUnique

            /**
             * Returns the raw JSON value of [videoViewTime].
             *
             * Unlike [videoViewTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("video_view_time")
            @ExcludeMissing
            fun _videoViewTime(): JsonField<Double> = videoViewTime

            /**
             * Returns the raw JSON value of [videoViewTimeByAgeGender].
             *
             * Unlike [videoViewTimeByAgeGender], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("video_view_time_by_age_gender")
            @ExcludeMissing
            fun _videoViewTimeByAgeGender(): JsonField<List<VideoViewTimeByAgeGender>> =
                videoViewTimeByAgeGender

            /**
             * Returns the raw JSON value of [videoViewTimeByCountry].
             *
             * Unlike [videoViewTimeByCountry], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("video_view_time_by_country")
            @ExcludeMissing
            fun _videoViewTimeByCountry(): JsonField<List<VideoViewTimeByCountry>> =
                videoViewTimeByCountry

            /**
             * Returns the raw JSON value of [videoViewTimeByRegion].
             *
             * Unlike [videoViewTimeByRegion], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("video_view_time_by_region")
            @ExcludeMissing
            fun _videoViewTimeByRegion(): JsonField<List<VideoViewTimeByRegion>> =
                videoViewTimeByRegion

            /**
             * Returns the raw JSON value of [videoViewTimeOrganic].
             *
             * Unlike [videoViewTimeOrganic], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("video_view_time_organic")
            @ExcludeMissing
            fun _videoViewTimeOrganic(): JsonField<Double> = videoViewTimeOrganic

            /**
             * Returns the raw JSON value of [videoViews].
             *
             * Unlike [videoViews], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("video_views")
            @ExcludeMissing
            fun _videoViews(): JsonField<Double> = videoViews

            /**
             * Returns the raw JSON value of [videoViews15s].
             *
             * Unlike [videoViews15s], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("video_views_15s")
            @ExcludeMissing
            fun _videoViews15s(): JsonField<Double> = videoViews15s

            /**
             * Returns the raw JSON value of [videoViews60s].
             *
             * Unlike [videoViews60s], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("video_views_60s")
            @ExcludeMissing
            fun _videoViews60s(): JsonField<Double> = videoViews60s

            /**
             * Returns the raw JSON value of [videoViewsAutoplayed].
             *
             * Unlike [videoViewsAutoplayed], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("video_views_autoplayed")
            @ExcludeMissing
            fun _videoViewsAutoplayed(): JsonField<Double> = videoViewsAutoplayed

            /**
             * Returns the raw JSON value of [videoViewsClickedToPlay].
             *
             * Unlike [videoViewsClickedToPlay], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("video_views_clicked_to_play")
            @ExcludeMissing
            fun _videoViewsClickedToPlay(): JsonField<Double> = videoViewsClickedToPlay

            /**
             * Returns the raw JSON value of [videoViewsOrganic].
             *
             * Unlike [videoViewsOrganic], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("video_views_organic")
            @ExcludeMissing
            fun _videoViewsOrganic(): JsonField<Double> = videoViewsOrganic

            /**
             * Returns the raw JSON value of [videoViewsOrganicUnique].
             *
             * Unlike [videoViewsOrganicUnique], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("video_views_organic_unique")
            @ExcludeMissing
            fun _videoViewsOrganicUnique(): JsonField<Double> = videoViewsOrganicUnique

            /**
             * Returns the raw JSON value of [videoViewsPaid].
             *
             * Unlike [videoViewsPaid], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("video_views_paid")
            @ExcludeMissing
            fun _videoViewsPaid(): JsonField<Double> = videoViewsPaid

            /**
             * Returns the raw JSON value of [videoViewsPaidUnique].
             *
             * Unlike [videoViewsPaidUnique], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("video_views_paid_unique")
            @ExcludeMissing
            fun _videoViewsPaidUnique(): JsonField<Double> = videoViewsPaidUnique

            /**
             * Returns the raw JSON value of [videoViewsSoundOn].
             *
             * Unlike [videoViewsSoundOn], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("video_views_sound_on")
            @ExcludeMissing
            fun _videoViewsSoundOn(): JsonField<Double> = videoViewsSoundOn

            /**
             * Returns the raw JSON value of [videoViewsUnique].
             *
             * Unlike [videoViewsUnique], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("video_views_unique")
            @ExcludeMissing
            fun _videoViewsUnique(): JsonField<Double> = videoViewsUnique

            /**
             * Returns the raw JSON value of [viralReach].
             *
             * Unlike [viralReach], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("viral_reach")
            @ExcludeMissing
            fun _viralReach(): JsonField<Double> = viralReach

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
                 * Returns a mutable builder for constructing an instance of
                 * [FacebookPostMetricsDto].
                 */
                fun builder() = Builder()
            }

            /** A builder for [FacebookPostMetricsDto]. */
            class Builder internal constructor() {

                private var activityByActionType: JsonField<MutableList<ActivityByActionType>>? =
                    null
                private var activityByActionTypeUnique:
                    JsonField<MutableList<ActivityByActionTypeUnique>>? =
                    null
                private var comments: JsonField<Double> = JsonMissing.of()
                private var fanReach: JsonField<Double> = JsonMissing.of()
                private var mediaViews: JsonField<Double> = JsonMissing.of()
                private var nonviralReach: JsonField<Double> = JsonMissing.of()
                private var organicReach: JsonField<Double> = JsonMissing.of()
                private var paidReach: JsonField<Double> = JsonMissing.of()
                private var reach: JsonField<Double> = JsonMissing.of()
                private var reactionsAnger: JsonField<Double> = JsonMissing.of()
                private var reactionsByType: JsonValue = JsonMissing.of()
                private var reactionsHaha: JsonField<Double> = JsonMissing.of()
                private var reactionsLike: JsonField<Double> = JsonMissing.of()
                private var reactionsLove: JsonField<Double> = JsonMissing.of()
                private var reactionsSorry: JsonField<Double> = JsonMissing.of()
                private var reactionsTotal: JsonField<Double> = JsonMissing.of()
                private var reactionsWow: JsonField<Double> = JsonMissing.of()
                private var shares: JsonField<Double> = JsonMissing.of()
                private var videoAvgTimeWatched: JsonField<Double> = JsonMissing.of()
                private var videoCompleteViewsOrganic: JsonField<Double> = JsonMissing.of()
                private var videoCompleteViewsOrganicUnique: JsonField<Double> = JsonMissing.of()
                private var videoCompleteViewsPaid: JsonField<Double> = JsonMissing.of()
                private var videoCompleteViewsPaidUnique: JsonField<Double> = JsonMissing.of()
                private var videoLength: JsonField<Double> = JsonMissing.of()
                private var videoRetentionGraphAutoplayed:
                    JsonField<MutableList<VideoRetentionGraphAutoplayed>>? =
                    null
                private var videoRetentionGraphClickedToPlay:
                    JsonField<MutableList<VideoRetentionGraphClickedToPlay>>? =
                    null
                private var videoSocialActionsUnique: JsonField<Double> = JsonMissing.of()
                private var videoViewTime: JsonField<Double> = JsonMissing.of()
                private var videoViewTimeByAgeGender:
                    JsonField<MutableList<VideoViewTimeByAgeGender>>? =
                    null
                private var videoViewTimeByCountry:
                    JsonField<MutableList<VideoViewTimeByCountry>>? =
                    null
                private var videoViewTimeByDistributionType: JsonValue = JsonMissing.of()
                private var videoViewTimeByRegion: JsonField<MutableList<VideoViewTimeByRegion>>? =
                    null
                private var videoViewTimeOrganic: JsonField<Double> = JsonMissing.of()
                private var videoViews: JsonField<Double> = JsonMissing.of()
                private var videoViews15s: JsonField<Double> = JsonMissing.of()
                private var videoViews60s: JsonField<Double> = JsonMissing.of()
                private var videoViewsAutoplayed: JsonField<Double> = JsonMissing.of()
                private var videoViewsByDistributionType: JsonValue = JsonMissing.of()
                private var videoViewsClickedToPlay: JsonField<Double> = JsonMissing.of()
                private var videoViewsOrganic: JsonField<Double> = JsonMissing.of()
                private var videoViewsOrganicUnique: JsonField<Double> = JsonMissing.of()
                private var videoViewsPaid: JsonField<Double> = JsonMissing.of()
                private var videoViewsPaidUnique: JsonField<Double> = JsonMissing.of()
                private var videoViewsSoundOn: JsonField<Double> = JsonMissing.of()
                private var videoViewsUnique: JsonField<Double> = JsonMissing.of()
                private var viralReach: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(facebookPostMetricsDto: FacebookPostMetricsDto) = apply {
                    activityByActionType =
                        facebookPostMetricsDto.activityByActionType.map { it.toMutableList() }
                    activityByActionTypeUnique =
                        facebookPostMetricsDto.activityByActionTypeUnique.map { it.toMutableList() }
                    comments = facebookPostMetricsDto.comments
                    fanReach = facebookPostMetricsDto.fanReach
                    mediaViews = facebookPostMetricsDto.mediaViews
                    nonviralReach = facebookPostMetricsDto.nonviralReach
                    organicReach = facebookPostMetricsDto.organicReach
                    paidReach = facebookPostMetricsDto.paidReach
                    reach = facebookPostMetricsDto.reach
                    reactionsAnger = facebookPostMetricsDto.reactionsAnger
                    reactionsByType = facebookPostMetricsDto.reactionsByType
                    reactionsHaha = facebookPostMetricsDto.reactionsHaha
                    reactionsLike = facebookPostMetricsDto.reactionsLike
                    reactionsLove = facebookPostMetricsDto.reactionsLove
                    reactionsSorry = facebookPostMetricsDto.reactionsSorry
                    reactionsTotal = facebookPostMetricsDto.reactionsTotal
                    reactionsWow = facebookPostMetricsDto.reactionsWow
                    shares = facebookPostMetricsDto.shares
                    videoAvgTimeWatched = facebookPostMetricsDto.videoAvgTimeWatched
                    videoCompleteViewsOrganic = facebookPostMetricsDto.videoCompleteViewsOrganic
                    videoCompleteViewsOrganicUnique =
                        facebookPostMetricsDto.videoCompleteViewsOrganicUnique
                    videoCompleteViewsPaid = facebookPostMetricsDto.videoCompleteViewsPaid
                    videoCompleteViewsPaidUnique =
                        facebookPostMetricsDto.videoCompleteViewsPaidUnique
                    videoLength = facebookPostMetricsDto.videoLength
                    videoRetentionGraphAutoplayed =
                        facebookPostMetricsDto.videoRetentionGraphAutoplayed.map {
                            it.toMutableList()
                        }
                    videoRetentionGraphClickedToPlay =
                        facebookPostMetricsDto.videoRetentionGraphClickedToPlay.map {
                            it.toMutableList()
                        }
                    videoSocialActionsUnique = facebookPostMetricsDto.videoSocialActionsUnique
                    videoViewTime = facebookPostMetricsDto.videoViewTime
                    videoViewTimeByAgeGender =
                        facebookPostMetricsDto.videoViewTimeByAgeGender.map { it.toMutableList() }
                    videoViewTimeByCountry =
                        facebookPostMetricsDto.videoViewTimeByCountry.map { it.toMutableList() }
                    videoViewTimeByDistributionType =
                        facebookPostMetricsDto.videoViewTimeByDistributionType
                    videoViewTimeByRegion =
                        facebookPostMetricsDto.videoViewTimeByRegion.map { it.toMutableList() }
                    videoViewTimeOrganic = facebookPostMetricsDto.videoViewTimeOrganic
                    videoViews = facebookPostMetricsDto.videoViews
                    videoViews15s = facebookPostMetricsDto.videoViews15s
                    videoViews60s = facebookPostMetricsDto.videoViews60s
                    videoViewsAutoplayed = facebookPostMetricsDto.videoViewsAutoplayed
                    videoViewsByDistributionType =
                        facebookPostMetricsDto.videoViewsByDistributionType
                    videoViewsClickedToPlay = facebookPostMetricsDto.videoViewsClickedToPlay
                    videoViewsOrganic = facebookPostMetricsDto.videoViewsOrganic
                    videoViewsOrganicUnique = facebookPostMetricsDto.videoViewsOrganicUnique
                    videoViewsPaid = facebookPostMetricsDto.videoViewsPaid
                    videoViewsPaidUnique = facebookPostMetricsDto.videoViewsPaidUnique
                    videoViewsSoundOn = facebookPostMetricsDto.videoViewsSoundOn
                    videoViewsUnique = facebookPostMetricsDto.videoViewsUnique
                    viralReach = facebookPostMetricsDto.viralReach
                    additionalProperties =
                        facebookPostMetricsDto.additionalProperties.toMutableMap()
                }

                /** Total activity breakdown by action type */
                fun activityByActionType(activityByActionType: List<ActivityByActionType>) =
                    activityByActionType(JsonField.of(activityByActionType))

                /**
                 * Sets [Builder.activityByActionType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.activityByActionType] with a well-typed
                 * `List<ActivityByActionType>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun activityByActionType(
                    activityByActionType: JsonField<List<ActivityByActionType>>
                ) = apply {
                    this.activityByActionType = activityByActionType.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ActivityByActionType] to [Builder.activityByActionType].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addActivityByActionType(activityByActionType: ActivityByActionType) = apply {
                    this.activityByActionType =
                        (this.activityByActionType ?: JsonField.of(mutableListOf())).also {
                            checkKnown("activityByActionType", it).add(activityByActionType)
                        }
                }

                /** Unique users activity breakdown by action type */
                fun activityByActionTypeUnique(
                    activityByActionTypeUnique: List<ActivityByActionTypeUnique>
                ) = activityByActionTypeUnique(JsonField.of(activityByActionTypeUnique))

                /**
                 * Sets [Builder.activityByActionTypeUnique] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.activityByActionTypeUnique] with a well-typed
                 * `List<ActivityByActionTypeUnique>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun activityByActionTypeUnique(
                    activityByActionTypeUnique: JsonField<List<ActivityByActionTypeUnique>>
                ) = apply {
                    this.activityByActionTypeUnique =
                        activityByActionTypeUnique.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ActivityByActionTypeUnique] to
                 * [Builder.activityByActionTypeUnique].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addActivityByActionTypeUnique(
                    activityByActionTypeUnique: ActivityByActionTypeUnique
                ) = apply {
                    this.activityByActionTypeUnique =
                        (this.activityByActionTypeUnique ?: JsonField.of(mutableListOf())).also {
                            checkKnown("activityByActionTypeUnique", it)
                                .add(activityByActionTypeUnique)
                        }
                }

                /** Number of comments (from post object) */
                fun comments(comments: Double) = comments(JsonField.of(comments))

                /**
                 * Sets [Builder.comments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.comments] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun comments(comments: JsonField<Double>) = apply { this.comments = comments }

                /** Number of fans who saw the post */
                fun fanReach(fanReach: Double) = fanReach(JsonField.of(fanReach))

                /**
                 * Sets [Builder.fanReach] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fanReach] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fanReach(fanReach: JsonField<Double>) = apply { this.fanReach = fanReach }

                /** Number of times the photo or video was viewed */
                fun mediaViews(mediaViews: Double) = mediaViews(JsonField.of(mediaViews))

                /**
                 * Sets [Builder.mediaViews] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mediaViews] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun mediaViews(mediaViews: JsonField<Double>) = apply {
                    this.mediaViews = mediaViews
                }

                /** Number of people who saw the post via non-viral distribution */
                fun nonviralReach(nonviralReach: Double) =
                    nonviralReach(JsonField.of(nonviralReach))

                /**
                 * Sets [Builder.nonviralReach] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nonviralReach] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun nonviralReach(nonviralReach: JsonField<Double>) = apply {
                    this.nonviralReach = nonviralReach
                }

                /** Number of people who saw the post via organic distribution */
                fun organicReach(organicReach: Double) = organicReach(JsonField.of(organicReach))

                /**
                 * Sets [Builder.organicReach] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.organicReach] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun organicReach(organicReach: JsonField<Double>) = apply {
                    this.organicReach = organicReach
                }

                /** Number of people who saw the post via paid distribution */
                fun paidReach(paidReach: Double) = paidReach(JsonField.of(paidReach))

                /**
                 * Sets [Builder.paidReach] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paidReach] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun paidReach(paidReach: JsonField<Double>) = apply { this.paidReach = paidReach }

                /** Total number of unique people who saw the post */
                fun reach(reach: Double) = reach(JsonField.of(reach))

                /**
                 * Sets [Builder.reach] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reach] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun reach(reach: JsonField<Double>) = apply { this.reach = reach }

                /** Number of anger reactions */
                fun reactionsAnger(reactionsAnger: Double) =
                    reactionsAnger(JsonField.of(reactionsAnger))

                /**
                 * Sets [Builder.reactionsAnger] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reactionsAnger] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reactionsAnger(reactionsAnger: JsonField<Double>) = apply {
                    this.reactionsAnger = reactionsAnger
                }

                /** Breakdown of all reaction types */
                fun reactionsByType(reactionsByType: JsonValue) = apply {
                    this.reactionsByType = reactionsByType
                }

                /** Number of haha reactions */
                fun reactionsHaha(reactionsHaha: Double) =
                    reactionsHaha(JsonField.of(reactionsHaha))

                /**
                 * Sets [Builder.reactionsHaha] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reactionsHaha] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reactionsHaha(reactionsHaha: JsonField<Double>) = apply {
                    this.reactionsHaha = reactionsHaha
                }

                /** Number of like reactions */
                fun reactionsLike(reactionsLike: Double) =
                    reactionsLike(JsonField.of(reactionsLike))

                /**
                 * Sets [Builder.reactionsLike] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reactionsLike] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reactionsLike(reactionsLike: JsonField<Double>) = apply {
                    this.reactionsLike = reactionsLike
                }

                /** Number of love reactions */
                fun reactionsLove(reactionsLove: Double) =
                    reactionsLove(JsonField.of(reactionsLove))

                /**
                 * Sets [Builder.reactionsLove] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reactionsLove] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reactionsLove(reactionsLove: JsonField<Double>) = apply {
                    this.reactionsLove = reactionsLove
                }

                /** Number of sad reactions */
                fun reactionsSorry(reactionsSorry: Double) =
                    reactionsSorry(JsonField.of(reactionsSorry))

                /**
                 * Sets [Builder.reactionsSorry] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reactionsSorry] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reactionsSorry(reactionsSorry: JsonField<Double>) = apply {
                    this.reactionsSorry = reactionsSorry
                }

                /** Total number of reactions (all types) */
                fun reactionsTotal(reactionsTotal: Double) =
                    reactionsTotal(JsonField.of(reactionsTotal))

                /**
                 * Sets [Builder.reactionsTotal] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reactionsTotal] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reactionsTotal(reactionsTotal: JsonField<Double>) = apply {
                    this.reactionsTotal = reactionsTotal
                }

                /** Number of wow reactions */
                fun reactionsWow(reactionsWow: Double) = reactionsWow(JsonField.of(reactionsWow))

                /**
                 * Sets [Builder.reactionsWow] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reactionsWow] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reactionsWow(reactionsWow: JsonField<Double>) = apply {
                    this.reactionsWow = reactionsWow
                }

                /** Number of shares (from post object) */
                fun shares(shares: Double) = shares(JsonField.of(shares))

                /**
                 * Sets [Builder.shares] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shares] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun shares(shares: JsonField<Double>) = apply { this.shares = shares }

                /** Average time video was viewed in milliseconds */
                fun videoAvgTimeWatched(videoAvgTimeWatched: Double) =
                    videoAvgTimeWatched(JsonField.of(videoAvgTimeWatched))

                /**
                 * Sets [Builder.videoAvgTimeWatched] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoAvgTimeWatched] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun videoAvgTimeWatched(videoAvgTimeWatched: JsonField<Double>) = apply {
                    this.videoAvgTimeWatched = videoAvgTimeWatched
                }

                /** Number of times video was viewed to 95% organically */
                fun videoCompleteViewsOrganic(videoCompleteViewsOrganic: Double) =
                    videoCompleteViewsOrganic(JsonField.of(videoCompleteViewsOrganic))

                /**
                 * Sets [Builder.videoCompleteViewsOrganic] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoCompleteViewsOrganic] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun videoCompleteViewsOrganic(videoCompleteViewsOrganic: JsonField<Double>) =
                    apply {
                        this.videoCompleteViewsOrganic = videoCompleteViewsOrganic
                    }

                /** Number of unique people who viewed video to 95% organically */
                fun videoCompleteViewsOrganicUnique(videoCompleteViewsOrganicUnique: Double) =
                    videoCompleteViewsOrganicUnique(JsonField.of(videoCompleteViewsOrganicUnique))

                /**
                 * Sets [Builder.videoCompleteViewsOrganicUnique] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoCompleteViewsOrganicUnique] with a
                 * well-typed [Double] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun videoCompleteViewsOrganicUnique(
                    videoCompleteViewsOrganicUnique: JsonField<Double>
                ) = apply { this.videoCompleteViewsOrganicUnique = videoCompleteViewsOrganicUnique }

                /** Number of times video was viewed to 95% via paid distribution */
                fun videoCompleteViewsPaid(videoCompleteViewsPaid: Double) =
                    videoCompleteViewsPaid(JsonField.of(videoCompleteViewsPaid))

                /**
                 * Sets [Builder.videoCompleteViewsPaid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoCompleteViewsPaid] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun videoCompleteViewsPaid(videoCompleteViewsPaid: JsonField<Double>) = apply {
                    this.videoCompleteViewsPaid = videoCompleteViewsPaid
                }

                /** Number of unique people who viewed video to 95% via paid distribution */
                fun videoCompleteViewsPaidUnique(videoCompleteViewsPaidUnique: Double) =
                    videoCompleteViewsPaidUnique(JsonField.of(videoCompleteViewsPaidUnique))

                /**
                 * Sets [Builder.videoCompleteViewsPaidUnique] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoCompleteViewsPaidUnique] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun videoCompleteViewsPaidUnique(videoCompleteViewsPaidUnique: JsonField<Double>) =
                    apply {
                        this.videoCompleteViewsPaidUnique = videoCompleteViewsPaidUnique
                    }

                /** Length of the video in milliseconds */
                fun videoLength(videoLength: Double) = videoLength(JsonField.of(videoLength))

                /**
                 * Sets [Builder.videoLength] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoLength] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun videoLength(videoLength: JsonField<Double>) = apply {
                    this.videoLength = videoLength
                }

                /** Video retention graph for autoplayed views */
                fun videoRetentionGraphAutoplayed(
                    videoRetentionGraphAutoplayed: List<VideoRetentionGraphAutoplayed>
                ) = videoRetentionGraphAutoplayed(JsonField.of(videoRetentionGraphAutoplayed))

                /**
                 * Sets [Builder.videoRetentionGraphAutoplayed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoRetentionGraphAutoplayed] with a well-typed
                 * `List<VideoRetentionGraphAutoplayed>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun videoRetentionGraphAutoplayed(
                    videoRetentionGraphAutoplayed: JsonField<List<VideoRetentionGraphAutoplayed>>
                ) = apply {
                    this.videoRetentionGraphAutoplayed =
                        videoRetentionGraphAutoplayed.map { it.toMutableList() }
                }

                /**
                 * Adds a single [VideoRetentionGraphAutoplayed] to
                 * [Builder.videoRetentionGraphAutoplayed].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addVideoRetentionGraphAutoplayed(
                    videoRetentionGraphAutoplayed: VideoRetentionGraphAutoplayed
                ) = apply {
                    this.videoRetentionGraphAutoplayed =
                        (this.videoRetentionGraphAutoplayed ?: JsonField.of(mutableListOf())).also {
                            checkKnown("videoRetentionGraphAutoplayed", it)
                                .add(videoRetentionGraphAutoplayed)
                        }
                }

                /** Video retention graph for clicked-to-play views */
                fun videoRetentionGraphClickedToPlay(
                    videoRetentionGraphClickedToPlay: List<VideoRetentionGraphClickedToPlay>
                ) = videoRetentionGraphClickedToPlay(JsonField.of(videoRetentionGraphClickedToPlay))

                /**
                 * Sets [Builder.videoRetentionGraphClickedToPlay] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoRetentionGraphClickedToPlay] with a
                 * well-typed `List<VideoRetentionGraphClickedToPlay>` value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun videoRetentionGraphClickedToPlay(
                    videoRetentionGraphClickedToPlay:
                        JsonField<List<VideoRetentionGraphClickedToPlay>>
                ) = apply {
                    this.videoRetentionGraphClickedToPlay =
                        videoRetentionGraphClickedToPlay.map { it.toMutableList() }
                }

                /**
                 * Adds a single [VideoRetentionGraphClickedToPlay] to
                 * [Builder.videoRetentionGraphClickedToPlay].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addVideoRetentionGraphClickedToPlay(
                    videoRetentionGraphClickedToPlay: VideoRetentionGraphClickedToPlay
                ) = apply {
                    this.videoRetentionGraphClickedToPlay =
                        (this.videoRetentionGraphClickedToPlay ?: JsonField.of(mutableListOf()))
                            .also {
                                checkKnown("videoRetentionGraphClickedToPlay", it)
                                    .add(videoRetentionGraphClickedToPlay)
                            }
                }

                /** Number of unique people who performed social actions on the video */
                fun videoSocialActionsUnique(videoSocialActionsUnique: Double) =
                    videoSocialActionsUnique(JsonField.of(videoSocialActionsUnique))

                /**
                 * Sets [Builder.videoSocialActionsUnique] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoSocialActionsUnique] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun videoSocialActionsUnique(videoSocialActionsUnique: JsonField<Double>) = apply {
                    this.videoSocialActionsUnique = videoSocialActionsUnique
                }

                /** Total time video was viewed in milliseconds */
                fun videoViewTime(videoViewTime: Double) =
                    videoViewTime(JsonField.of(videoViewTime))

                /**
                 * Sets [Builder.videoViewTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoViewTime] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun videoViewTime(videoViewTime: JsonField<Double>) = apply {
                    this.videoViewTime = videoViewTime
                }

                /** Video view time breakdown by age and gender */
                fun videoViewTimeByAgeGender(
                    videoViewTimeByAgeGender: List<VideoViewTimeByAgeGender>
                ) = videoViewTimeByAgeGender(JsonField.of(videoViewTimeByAgeGender))

                /**
                 * Sets [Builder.videoViewTimeByAgeGender] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoViewTimeByAgeGender] with a well-typed
                 * `List<VideoViewTimeByAgeGender>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun videoViewTimeByAgeGender(
                    videoViewTimeByAgeGender: JsonField<List<VideoViewTimeByAgeGender>>
                ) = apply {
                    this.videoViewTimeByAgeGender =
                        videoViewTimeByAgeGender.map { it.toMutableList() }
                }

                /**
                 * Adds a single [VideoViewTimeByAgeGender] to [Builder.videoViewTimeByAgeGender].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addVideoViewTimeByAgeGender(
                    videoViewTimeByAgeGender: VideoViewTimeByAgeGender
                ) = apply {
                    this.videoViewTimeByAgeGender =
                        (this.videoViewTimeByAgeGender ?: JsonField.of(mutableListOf())).also {
                            checkKnown("videoViewTimeByAgeGender", it).add(videoViewTimeByAgeGender)
                        }
                }

                /** Video view time breakdown by country */
                fun videoViewTimeByCountry(videoViewTimeByCountry: List<VideoViewTimeByCountry>) =
                    videoViewTimeByCountry(JsonField.of(videoViewTimeByCountry))

                /**
                 * Sets [Builder.videoViewTimeByCountry] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoViewTimeByCountry] with a well-typed
                 * `List<VideoViewTimeByCountry>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun videoViewTimeByCountry(
                    videoViewTimeByCountry: JsonField<List<VideoViewTimeByCountry>>
                ) = apply {
                    this.videoViewTimeByCountry = videoViewTimeByCountry.map { it.toMutableList() }
                }

                /**
                 * Adds a single [VideoViewTimeByCountry] to [Builder.videoViewTimeByCountry].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addVideoViewTimeByCountry(videoViewTimeByCountry: VideoViewTimeByCountry) =
                    apply {
                        this.videoViewTimeByCountry =
                            (this.videoViewTimeByCountry ?: JsonField.of(mutableListOf())).also {
                                checkKnown("videoViewTimeByCountry", it).add(videoViewTimeByCountry)
                            }
                    }

                /** Video view time breakdown by distribution type */
                fun videoViewTimeByDistributionType(videoViewTimeByDistributionType: JsonValue) =
                    apply {
                        this.videoViewTimeByDistributionType = videoViewTimeByDistributionType
                    }

                /** Video view time breakdown by region */
                fun videoViewTimeByRegion(videoViewTimeByRegion: List<VideoViewTimeByRegion>) =
                    videoViewTimeByRegion(JsonField.of(videoViewTimeByRegion))

                /**
                 * Sets [Builder.videoViewTimeByRegion] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoViewTimeByRegion] with a well-typed
                 * `List<VideoViewTimeByRegion>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun videoViewTimeByRegion(
                    videoViewTimeByRegion: JsonField<List<VideoViewTimeByRegion>>
                ) = apply {
                    this.videoViewTimeByRegion = videoViewTimeByRegion.map { it.toMutableList() }
                }

                /**
                 * Adds a single [VideoViewTimeByRegion] to [Builder.videoViewTimeByRegion].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addVideoViewTimeByRegion(videoViewTimeByRegion: VideoViewTimeByRegion) = apply {
                    this.videoViewTimeByRegion =
                        (this.videoViewTimeByRegion ?: JsonField.of(mutableListOf())).also {
                            checkKnown("videoViewTimeByRegion", it).add(videoViewTimeByRegion)
                        }
                }

                /** Total time video was viewed in milliseconds via organic distribution */
                fun videoViewTimeOrganic(videoViewTimeOrganic: Double) =
                    videoViewTimeOrganic(JsonField.of(videoViewTimeOrganic))

                /**
                 * Sets [Builder.videoViewTimeOrganic] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoViewTimeOrganic] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun videoViewTimeOrganic(videoViewTimeOrganic: JsonField<Double>) = apply {
                    this.videoViewTimeOrganic = videoViewTimeOrganic
                }

                /** Number of times video was viewed for 3+ seconds */
                fun videoViews(videoViews: Double) = videoViews(JsonField.of(videoViews))

                /**
                 * Sets [Builder.videoViews] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoViews] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun videoViews(videoViews: JsonField<Double>) = apply {
                    this.videoViews = videoViews
                }

                /** Number of times video was viewed for 15+ seconds */
                fun videoViews15s(videoViews15s: Double) =
                    videoViews15s(JsonField.of(videoViews15s))

                /**
                 * Sets [Builder.videoViews15s] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoViews15s] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun videoViews15s(videoViews15s: JsonField<Double>) = apply {
                    this.videoViews15s = videoViews15s
                }

                /**
                 * Number of times video was viewed for 60+ seconds (excludes videos shorter than
                 * 60s)
                 */
                fun videoViews60s(videoViews60s: Double) =
                    videoViews60s(JsonField.of(videoViews60s))

                /**
                 * Sets [Builder.videoViews60s] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoViews60s] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun videoViews60s(videoViews60s: JsonField<Double>) = apply {
                    this.videoViews60s = videoViews60s
                }

                /** Number of times video was autoplayed for 3+ seconds */
                fun videoViewsAutoplayed(videoViewsAutoplayed: Double) =
                    videoViewsAutoplayed(JsonField.of(videoViewsAutoplayed))

                /**
                 * Sets [Builder.videoViewsAutoplayed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoViewsAutoplayed] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun videoViewsAutoplayed(videoViewsAutoplayed: JsonField<Double>) = apply {
                    this.videoViewsAutoplayed = videoViewsAutoplayed
                }

                /** Video views breakdown by distribution type */
                fun videoViewsByDistributionType(videoViewsByDistributionType: JsonValue) = apply {
                    this.videoViewsByDistributionType = videoViewsByDistributionType
                }

                /** Number of times video was clicked to play for 3+ seconds */
                fun videoViewsClickedToPlay(videoViewsClickedToPlay: Double) =
                    videoViewsClickedToPlay(JsonField.of(videoViewsClickedToPlay))

                /**
                 * Sets [Builder.videoViewsClickedToPlay] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoViewsClickedToPlay] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun videoViewsClickedToPlay(videoViewsClickedToPlay: JsonField<Double>) = apply {
                    this.videoViewsClickedToPlay = videoViewsClickedToPlay
                }

                /** Number of times video was viewed for 3+ seconds organically */
                fun videoViewsOrganic(videoViewsOrganic: Double) =
                    videoViewsOrganic(JsonField.of(videoViewsOrganic))

                /**
                 * Sets [Builder.videoViewsOrganic] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoViewsOrganic] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun videoViewsOrganic(videoViewsOrganic: JsonField<Double>) = apply {
                    this.videoViewsOrganic = videoViewsOrganic
                }

                /** Number of unique people who viewed the video for 3+ seconds organically */
                fun videoViewsOrganicUnique(videoViewsOrganicUnique: Double) =
                    videoViewsOrganicUnique(JsonField.of(videoViewsOrganicUnique))

                /**
                 * Sets [Builder.videoViewsOrganicUnique] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoViewsOrganicUnique] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun videoViewsOrganicUnique(videoViewsOrganicUnique: JsonField<Double>) = apply {
                    this.videoViewsOrganicUnique = videoViewsOrganicUnique
                }

                /** Number of times video was viewed for 3+ seconds via paid distribution */
                fun videoViewsPaid(videoViewsPaid: Double) =
                    videoViewsPaid(JsonField.of(videoViewsPaid))

                /**
                 * Sets [Builder.videoViewsPaid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoViewsPaid] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun videoViewsPaid(videoViewsPaid: JsonField<Double>) = apply {
                    this.videoViewsPaid = videoViewsPaid
                }

                /**
                 * Number of unique people who viewed the video for 3+ seconds via paid distribution
                 */
                fun videoViewsPaidUnique(videoViewsPaidUnique: Double) =
                    videoViewsPaidUnique(JsonField.of(videoViewsPaidUnique))

                /**
                 * Sets [Builder.videoViewsPaidUnique] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoViewsPaidUnique] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun videoViewsPaidUnique(videoViewsPaidUnique: JsonField<Double>) = apply {
                    this.videoViewsPaidUnique = videoViewsPaidUnique
                }

                /** Number of times video was viewed with sound on */
                fun videoViewsSoundOn(videoViewsSoundOn: Double) =
                    videoViewsSoundOn(JsonField.of(videoViewsSoundOn))

                /**
                 * Sets [Builder.videoViewsSoundOn] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoViewsSoundOn] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun videoViewsSoundOn(videoViewsSoundOn: JsonField<Double>) = apply {
                    this.videoViewsSoundOn = videoViewsSoundOn
                }

                /** Number of unique people who viewed the video for 3+ seconds */
                fun videoViewsUnique(videoViewsUnique: Double) =
                    videoViewsUnique(JsonField.of(videoViewsUnique))

                /**
                 * Sets [Builder.videoViewsUnique] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoViewsUnique] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun videoViewsUnique(videoViewsUnique: JsonField<Double>) = apply {
                    this.videoViewsUnique = videoViewsUnique
                }

                /** Number of people who saw the post in News Feed via viral reach */
                fun viralReach(viralReach: Double) = viralReach(JsonField.of(viralReach))

                /**
                 * Sets [Builder.viralReach] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.viralReach] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun viralReach(viralReach: JsonField<Double>) = apply {
                    this.viralReach = viralReach
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
                 * Returns an immutable instance of [FacebookPostMetricsDto].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): FacebookPostMetricsDto =
                    FacebookPostMetricsDto(
                        (activityByActionType ?: JsonMissing.of()).map { it.toImmutable() },
                        (activityByActionTypeUnique ?: JsonMissing.of()).map { it.toImmutable() },
                        comments,
                        fanReach,
                        mediaViews,
                        nonviralReach,
                        organicReach,
                        paidReach,
                        reach,
                        reactionsAnger,
                        reactionsByType,
                        reactionsHaha,
                        reactionsLike,
                        reactionsLove,
                        reactionsSorry,
                        reactionsTotal,
                        reactionsWow,
                        shares,
                        videoAvgTimeWatched,
                        videoCompleteViewsOrganic,
                        videoCompleteViewsOrganicUnique,
                        videoCompleteViewsPaid,
                        videoCompleteViewsPaidUnique,
                        videoLength,
                        (videoRetentionGraphAutoplayed ?: JsonMissing.of()).map {
                            it.toImmutable()
                        },
                        (videoRetentionGraphClickedToPlay ?: JsonMissing.of()).map {
                            it.toImmutable()
                        },
                        videoSocialActionsUnique,
                        videoViewTime,
                        (videoViewTimeByAgeGender ?: JsonMissing.of()).map { it.toImmutable() },
                        (videoViewTimeByCountry ?: JsonMissing.of()).map { it.toImmutable() },
                        videoViewTimeByDistributionType,
                        (videoViewTimeByRegion ?: JsonMissing.of()).map { it.toImmutable() },
                        videoViewTimeOrganic,
                        videoViews,
                        videoViews15s,
                        videoViews60s,
                        videoViewsAutoplayed,
                        videoViewsByDistributionType,
                        videoViewsClickedToPlay,
                        videoViewsOrganic,
                        videoViewsOrganicUnique,
                        videoViewsPaid,
                        videoViewsPaidUnique,
                        videoViewsSoundOn,
                        videoViewsUnique,
                        viralReach,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws PostForMeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): FacebookPostMetricsDto = apply {
                if (validated) {
                    return@apply
                }

                activityByActionType()?.forEach { it.validate() }
                activityByActionTypeUnique()?.forEach { it.validate() }
                comments()
                fanReach()
                mediaViews()
                nonviralReach()
                organicReach()
                paidReach()
                reach()
                reactionsAnger()
                reactionsHaha()
                reactionsLike()
                reactionsLove()
                reactionsSorry()
                reactionsTotal()
                reactionsWow()
                shares()
                videoAvgTimeWatched()
                videoCompleteViewsOrganic()
                videoCompleteViewsOrganicUnique()
                videoCompleteViewsPaid()
                videoCompleteViewsPaidUnique()
                videoLength()
                videoRetentionGraphAutoplayed()?.forEach { it.validate() }
                videoRetentionGraphClickedToPlay()?.forEach { it.validate() }
                videoSocialActionsUnique()
                videoViewTime()
                videoViewTimeByAgeGender()?.forEach { it.validate() }
                videoViewTimeByCountry()?.forEach { it.validate() }
                videoViewTimeByRegion()?.forEach { it.validate() }
                videoViewTimeOrganic()
                videoViews()
                videoViews15s()
                videoViews60s()
                videoViewsAutoplayed()
                videoViewsClickedToPlay()
                videoViewsOrganic()
                videoViewsOrganicUnique()
                videoViewsPaid()
                videoViewsPaidUnique()
                videoViewsSoundOn()
                videoViewsUnique()
                viralReach()
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
                (activityByActionType.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (activityByActionTypeUnique.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (comments.asKnown() == null) 0 else 1) +
                    (if (fanReach.asKnown() == null) 0 else 1) +
                    (if (mediaViews.asKnown() == null) 0 else 1) +
                    (if (nonviralReach.asKnown() == null) 0 else 1) +
                    (if (organicReach.asKnown() == null) 0 else 1) +
                    (if (paidReach.asKnown() == null) 0 else 1) +
                    (if (reach.asKnown() == null) 0 else 1) +
                    (if (reactionsAnger.asKnown() == null) 0 else 1) +
                    (if (reactionsHaha.asKnown() == null) 0 else 1) +
                    (if (reactionsLike.asKnown() == null) 0 else 1) +
                    (if (reactionsLove.asKnown() == null) 0 else 1) +
                    (if (reactionsSorry.asKnown() == null) 0 else 1) +
                    (if (reactionsTotal.asKnown() == null) 0 else 1) +
                    (if (reactionsWow.asKnown() == null) 0 else 1) +
                    (if (shares.asKnown() == null) 0 else 1) +
                    (if (videoAvgTimeWatched.asKnown() == null) 0 else 1) +
                    (if (videoCompleteViewsOrganic.asKnown() == null) 0 else 1) +
                    (if (videoCompleteViewsOrganicUnique.asKnown() == null) 0 else 1) +
                    (if (videoCompleteViewsPaid.asKnown() == null) 0 else 1) +
                    (if (videoCompleteViewsPaidUnique.asKnown() == null) 0 else 1) +
                    (if (videoLength.asKnown() == null) 0 else 1) +
                    (videoRetentionGraphAutoplayed.asKnown()?.sumOf { it.validity().toInt() }
                        ?: 0) +
                    (videoRetentionGraphClickedToPlay.asKnown()?.sumOf { it.validity().toInt() }
                        ?: 0) +
                    (if (videoSocialActionsUnique.asKnown() == null) 0 else 1) +
                    (if (videoViewTime.asKnown() == null) 0 else 1) +
                    (videoViewTimeByAgeGender.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (videoViewTimeByCountry.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (videoViewTimeByRegion.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (videoViewTimeOrganic.asKnown() == null) 0 else 1) +
                    (if (videoViews.asKnown() == null) 0 else 1) +
                    (if (videoViews15s.asKnown() == null) 0 else 1) +
                    (if (videoViews60s.asKnown() == null) 0 else 1) +
                    (if (videoViewsAutoplayed.asKnown() == null) 0 else 1) +
                    (if (videoViewsClickedToPlay.asKnown() == null) 0 else 1) +
                    (if (videoViewsOrganic.asKnown() == null) 0 else 1) +
                    (if (videoViewsOrganicUnique.asKnown() == null) 0 else 1) +
                    (if (videoViewsPaid.asKnown() == null) 0 else 1) +
                    (if (videoViewsPaidUnique.asKnown() == null) 0 else 1) +
                    (if (videoViewsSoundOn.asKnown() == null) 0 else 1) +
                    (if (videoViewsUnique.asKnown() == null) 0 else 1) +
                    (if (viralReach.asKnown() == null) 0 else 1)

            class ActivityByActionType
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val actionType: JsonField<String>,
                private val value: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("action_type")
                    @ExcludeMissing
                    actionType: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<Double> = JsonMissing.of(),
                ) : this(actionType, value, mutableMapOf())

                /**
                 * Action type (e.g., like, comment, share)
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun actionType(): String = actionType.getRequired("action_type")

                /**
                 * Number of actions
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun value(): Double = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [actionType].
                 *
                 * Unlike [actionType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("action_type")
                @ExcludeMissing
                fun _actionType(): JsonField<String> = actionType

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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
                     * Returns a mutable builder for constructing an instance of
                     * [ActivityByActionType].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .actionType()
                     * .value()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [ActivityByActionType]. */
                class Builder internal constructor() {

                    private var actionType: JsonField<String>? = null
                    private var value: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(activityByActionType: ActivityByActionType) = apply {
                        actionType = activityByActionType.actionType
                        value = activityByActionType.value
                        additionalProperties =
                            activityByActionType.additionalProperties.toMutableMap()
                    }

                    /** Action type (e.g., like, comment, share) */
                    fun actionType(actionType: String) = actionType(JsonField.of(actionType))

                    /**
                     * Sets [Builder.actionType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.actionType] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun actionType(actionType: JsonField<String>) = apply {
                        this.actionType = actionType
                    }

                    /** Number of actions */
                    fun value(value: Double) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<Double>) = apply { this.value = value }

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
                     * Returns an immutable instance of [ActivityByActionType].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .actionType()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ActivityByActionType =
                        ActivityByActionType(
                            checkRequired("actionType", actionType),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PostForMeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): ActivityByActionType = apply {
                    if (validated) {
                        return@apply
                    }

                    actionType()
                    value()
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
                    (if (actionType.asKnown() == null) 0 else 1) +
                        (if (value.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ActivityByActionType &&
                        actionType == other.actionType &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(actionType, value, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ActivityByActionType{actionType=$actionType, value=$value, additionalProperties=$additionalProperties}"
            }

            class ActivityByActionTypeUnique
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val actionType: JsonField<String>,
                private val value: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("action_type")
                    @ExcludeMissing
                    actionType: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<Double> = JsonMissing.of(),
                ) : this(actionType, value, mutableMapOf())

                /**
                 * Action type (e.g., like, comment, share)
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun actionType(): String = actionType.getRequired("action_type")

                /**
                 * Number of actions
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun value(): Double = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [actionType].
                 *
                 * Unlike [actionType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("action_type")
                @ExcludeMissing
                fun _actionType(): JsonField<String> = actionType

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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
                     * Returns a mutable builder for constructing an instance of
                     * [ActivityByActionTypeUnique].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .actionType()
                     * .value()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [ActivityByActionTypeUnique]. */
                class Builder internal constructor() {

                    private var actionType: JsonField<String>? = null
                    private var value: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(activityByActionTypeUnique: ActivityByActionTypeUnique) =
                        apply {
                            actionType = activityByActionTypeUnique.actionType
                            value = activityByActionTypeUnique.value
                            additionalProperties =
                                activityByActionTypeUnique.additionalProperties.toMutableMap()
                        }

                    /** Action type (e.g., like, comment, share) */
                    fun actionType(actionType: String) = actionType(JsonField.of(actionType))

                    /**
                     * Sets [Builder.actionType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.actionType] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun actionType(actionType: JsonField<String>) = apply {
                        this.actionType = actionType
                    }

                    /** Number of actions */
                    fun value(value: Double) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<Double>) = apply { this.value = value }

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
                     * Returns an immutable instance of [ActivityByActionTypeUnique].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .actionType()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ActivityByActionTypeUnique =
                        ActivityByActionTypeUnique(
                            checkRequired("actionType", actionType),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PostForMeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): ActivityByActionTypeUnique = apply {
                    if (validated) {
                        return@apply
                    }

                    actionType()
                    value()
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
                    (if (actionType.asKnown() == null) 0 else 1) +
                        (if (value.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ActivityByActionTypeUnique &&
                        actionType == other.actionType &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(actionType, value, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ActivityByActionTypeUnique{actionType=$actionType, value=$value, additionalProperties=$additionalProperties}"
            }

            class VideoRetentionGraphAutoplayed
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val rate: JsonField<Double>,
                private val time: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("rate")
                    @ExcludeMissing
                    rate: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("time") @ExcludeMissing time: JsonField<Double> = JsonMissing.of(),
                ) : this(rate, time, mutableMapOf())

                /**
                 * Percentage of viewers at this time
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun rate(): Double = rate.getRequired("rate")

                /**
                 * Time in seconds
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun time(): Double = time.getRequired("time")

                /**
                 * Returns the raw JSON value of [rate].
                 *
                 * Unlike [rate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<Double> = rate

                /**
                 * Returns the raw JSON value of [time].
                 *
                 * Unlike [time], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("time") @ExcludeMissing fun _time(): JsonField<Double> = time

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
                     * Returns a mutable builder for constructing an instance of
                     * [VideoRetentionGraphAutoplayed].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .rate()
                     * .time()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [VideoRetentionGraphAutoplayed]. */
                class Builder internal constructor() {

                    private var rate: JsonField<Double>? = null
                    private var time: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        videoRetentionGraphAutoplayed: VideoRetentionGraphAutoplayed
                    ) = apply {
                        rate = videoRetentionGraphAutoplayed.rate
                        time = videoRetentionGraphAutoplayed.time
                        additionalProperties =
                            videoRetentionGraphAutoplayed.additionalProperties.toMutableMap()
                    }

                    /** Percentage of viewers at this time */
                    fun rate(rate: Double) = rate(JsonField.of(rate))

                    /**
                     * Sets [Builder.rate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.rate] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun rate(rate: JsonField<Double>) = apply { this.rate = rate }

                    /** Time in seconds */
                    fun time(time: Double) = time(JsonField.of(time))

                    /**
                     * Sets [Builder.time] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.time] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun time(time: JsonField<Double>) = apply { this.time = time }

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
                     * Returns an immutable instance of [VideoRetentionGraphAutoplayed].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .rate()
                     * .time()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): VideoRetentionGraphAutoplayed =
                        VideoRetentionGraphAutoplayed(
                            checkRequired("rate", rate),
                            checkRequired("time", time),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PostForMeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): VideoRetentionGraphAutoplayed = apply {
                    if (validated) {
                        return@apply
                    }

                    rate()
                    time()
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
                    (if (rate.asKnown() == null) 0 else 1) + (if (time.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is VideoRetentionGraphAutoplayed &&
                        rate == other.rate &&
                        time == other.time &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(rate, time, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "VideoRetentionGraphAutoplayed{rate=$rate, time=$time, additionalProperties=$additionalProperties}"
            }

            class VideoRetentionGraphClickedToPlay
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val rate: JsonField<Double>,
                private val time: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("rate")
                    @ExcludeMissing
                    rate: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("time") @ExcludeMissing time: JsonField<Double> = JsonMissing.of(),
                ) : this(rate, time, mutableMapOf())

                /**
                 * Percentage of viewers at this time
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun rate(): Double = rate.getRequired("rate")

                /**
                 * Time in seconds
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun time(): Double = time.getRequired("time")

                /**
                 * Returns the raw JSON value of [rate].
                 *
                 * Unlike [rate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<Double> = rate

                /**
                 * Returns the raw JSON value of [time].
                 *
                 * Unlike [time], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("time") @ExcludeMissing fun _time(): JsonField<Double> = time

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
                     * Returns a mutable builder for constructing an instance of
                     * [VideoRetentionGraphClickedToPlay].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .rate()
                     * .time()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [VideoRetentionGraphClickedToPlay]. */
                class Builder internal constructor() {

                    private var rate: JsonField<Double>? = null
                    private var time: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        videoRetentionGraphClickedToPlay: VideoRetentionGraphClickedToPlay
                    ) = apply {
                        rate = videoRetentionGraphClickedToPlay.rate
                        time = videoRetentionGraphClickedToPlay.time
                        additionalProperties =
                            videoRetentionGraphClickedToPlay.additionalProperties.toMutableMap()
                    }

                    /** Percentage of viewers at this time */
                    fun rate(rate: Double) = rate(JsonField.of(rate))

                    /**
                     * Sets [Builder.rate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.rate] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun rate(rate: JsonField<Double>) = apply { this.rate = rate }

                    /** Time in seconds */
                    fun time(time: Double) = time(JsonField.of(time))

                    /**
                     * Sets [Builder.time] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.time] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun time(time: JsonField<Double>) = apply { this.time = time }

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
                     * Returns an immutable instance of [VideoRetentionGraphClickedToPlay].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .rate()
                     * .time()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): VideoRetentionGraphClickedToPlay =
                        VideoRetentionGraphClickedToPlay(
                            checkRequired("rate", rate),
                            checkRequired("time", time),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PostForMeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): VideoRetentionGraphClickedToPlay = apply {
                    if (validated) {
                        return@apply
                    }

                    rate()
                    time()
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
                    (if (rate.asKnown() == null) 0 else 1) + (if (time.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is VideoRetentionGraphClickedToPlay &&
                        rate == other.rate &&
                        time == other.time &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(rate, time, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "VideoRetentionGraphClickedToPlay{rate=$rate, time=$time, additionalProperties=$additionalProperties}"
            }

            class VideoViewTimeByAgeGender
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val key: JsonField<String>,
                private val value: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<Double> = JsonMissing.of(),
                ) : this(key, value, mutableMapOf())

                /**
                 * Demographic key (e.g., age_gender, region, country)
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun key(): String = key.getRequired("key")

                /**
                 * Total view time in milliseconds
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun value(): Double = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [key].
                 *
                 * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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
                     * Returns a mutable builder for constructing an instance of
                     * [VideoViewTimeByAgeGender].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .key()
                     * .value()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [VideoViewTimeByAgeGender]. */
                class Builder internal constructor() {

                    private var key: JsonField<String>? = null
                    private var value: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(videoViewTimeByAgeGender: VideoViewTimeByAgeGender) = apply {
                        key = videoViewTimeByAgeGender.key
                        value = videoViewTimeByAgeGender.value
                        additionalProperties =
                            videoViewTimeByAgeGender.additionalProperties.toMutableMap()
                    }

                    /** Demographic key (e.g., age_gender, region, country) */
                    fun key(key: String) = key(JsonField.of(key))

                    /**
                     * Sets [Builder.key] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.key] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun key(key: JsonField<String>) = apply { this.key = key }

                    /** Total view time in milliseconds */
                    fun value(value: Double) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<Double>) = apply { this.value = value }

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
                     * Returns an immutable instance of [VideoViewTimeByAgeGender].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .key()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): VideoViewTimeByAgeGender =
                        VideoViewTimeByAgeGender(
                            checkRequired("key", key),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PostForMeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): VideoViewTimeByAgeGender = apply {
                    if (validated) {
                        return@apply
                    }

                    key()
                    value()
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
                    (if (key.asKnown() == null) 0 else 1) + (if (value.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is VideoViewTimeByAgeGender &&
                        key == other.key &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "VideoViewTimeByAgeGender{key=$key, value=$value, additionalProperties=$additionalProperties}"
            }

            class VideoViewTimeByCountry
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val key: JsonField<String>,
                private val value: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<Double> = JsonMissing.of(),
                ) : this(key, value, mutableMapOf())

                /**
                 * Demographic key (e.g., age_gender, region, country)
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun key(): String = key.getRequired("key")

                /**
                 * Total view time in milliseconds
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun value(): Double = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [key].
                 *
                 * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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
                     * Returns a mutable builder for constructing an instance of
                     * [VideoViewTimeByCountry].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .key()
                     * .value()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [VideoViewTimeByCountry]. */
                class Builder internal constructor() {

                    private var key: JsonField<String>? = null
                    private var value: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(videoViewTimeByCountry: VideoViewTimeByCountry) = apply {
                        key = videoViewTimeByCountry.key
                        value = videoViewTimeByCountry.value
                        additionalProperties =
                            videoViewTimeByCountry.additionalProperties.toMutableMap()
                    }

                    /** Demographic key (e.g., age_gender, region, country) */
                    fun key(key: String) = key(JsonField.of(key))

                    /**
                     * Sets [Builder.key] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.key] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun key(key: JsonField<String>) = apply { this.key = key }

                    /** Total view time in milliseconds */
                    fun value(value: Double) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<Double>) = apply { this.value = value }

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
                     * Returns an immutable instance of [VideoViewTimeByCountry].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .key()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): VideoViewTimeByCountry =
                        VideoViewTimeByCountry(
                            checkRequired("key", key),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PostForMeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): VideoViewTimeByCountry = apply {
                    if (validated) {
                        return@apply
                    }

                    key()
                    value()
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
                    (if (key.asKnown() == null) 0 else 1) + (if (value.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is VideoViewTimeByCountry &&
                        key == other.key &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "VideoViewTimeByCountry{key=$key, value=$value, additionalProperties=$additionalProperties}"
            }

            class VideoViewTimeByRegion
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val key: JsonField<String>,
                private val value: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<Double> = JsonMissing.of(),
                ) : this(key, value, mutableMapOf())

                /**
                 * Demographic key (e.g., age_gender, region, country)
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun key(): String = key.getRequired("key")

                /**
                 * Total view time in milliseconds
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun value(): Double = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [key].
                 *
                 * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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
                     * Returns a mutable builder for constructing an instance of
                     * [VideoViewTimeByRegion].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .key()
                     * .value()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [VideoViewTimeByRegion]. */
                class Builder internal constructor() {

                    private var key: JsonField<String>? = null
                    private var value: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(videoViewTimeByRegion: VideoViewTimeByRegion) = apply {
                        key = videoViewTimeByRegion.key
                        value = videoViewTimeByRegion.value
                        additionalProperties =
                            videoViewTimeByRegion.additionalProperties.toMutableMap()
                    }

                    /** Demographic key (e.g., age_gender, region, country) */
                    fun key(key: String) = key(JsonField.of(key))

                    /**
                     * Sets [Builder.key] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.key] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun key(key: JsonField<String>) = apply { this.key = key }

                    /** Total view time in milliseconds */
                    fun value(value: Double) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<Double>) = apply { this.value = value }

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
                     * Returns an immutable instance of [VideoViewTimeByRegion].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .key()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): VideoViewTimeByRegion =
                        VideoViewTimeByRegion(
                            checkRequired("key", key),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PostForMeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): VideoViewTimeByRegion = apply {
                    if (validated) {
                        return@apply
                    }

                    key()
                    value()
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
                    (if (key.asKnown() == null) 0 else 1) + (if (value.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is VideoViewTimeByRegion &&
                        key == other.key &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "VideoViewTimeByRegion{key=$key, value=$value, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FacebookPostMetricsDto &&
                    activityByActionType == other.activityByActionType &&
                    activityByActionTypeUnique == other.activityByActionTypeUnique &&
                    comments == other.comments &&
                    fanReach == other.fanReach &&
                    mediaViews == other.mediaViews &&
                    nonviralReach == other.nonviralReach &&
                    organicReach == other.organicReach &&
                    paidReach == other.paidReach &&
                    reach == other.reach &&
                    reactionsAnger == other.reactionsAnger &&
                    reactionsByType == other.reactionsByType &&
                    reactionsHaha == other.reactionsHaha &&
                    reactionsLike == other.reactionsLike &&
                    reactionsLove == other.reactionsLove &&
                    reactionsSorry == other.reactionsSorry &&
                    reactionsTotal == other.reactionsTotal &&
                    reactionsWow == other.reactionsWow &&
                    shares == other.shares &&
                    videoAvgTimeWatched == other.videoAvgTimeWatched &&
                    videoCompleteViewsOrganic == other.videoCompleteViewsOrganic &&
                    videoCompleteViewsOrganicUnique == other.videoCompleteViewsOrganicUnique &&
                    videoCompleteViewsPaid == other.videoCompleteViewsPaid &&
                    videoCompleteViewsPaidUnique == other.videoCompleteViewsPaidUnique &&
                    videoLength == other.videoLength &&
                    videoRetentionGraphAutoplayed == other.videoRetentionGraphAutoplayed &&
                    videoRetentionGraphClickedToPlay == other.videoRetentionGraphClickedToPlay &&
                    videoSocialActionsUnique == other.videoSocialActionsUnique &&
                    videoViewTime == other.videoViewTime &&
                    videoViewTimeByAgeGender == other.videoViewTimeByAgeGender &&
                    videoViewTimeByCountry == other.videoViewTimeByCountry &&
                    videoViewTimeByDistributionType == other.videoViewTimeByDistributionType &&
                    videoViewTimeByRegion == other.videoViewTimeByRegion &&
                    videoViewTimeOrganic == other.videoViewTimeOrganic &&
                    videoViews == other.videoViews &&
                    videoViews15s == other.videoViews15s &&
                    videoViews60s == other.videoViews60s &&
                    videoViewsAutoplayed == other.videoViewsAutoplayed &&
                    videoViewsByDistributionType == other.videoViewsByDistributionType &&
                    videoViewsClickedToPlay == other.videoViewsClickedToPlay &&
                    videoViewsOrganic == other.videoViewsOrganic &&
                    videoViewsOrganicUnique == other.videoViewsOrganicUnique &&
                    videoViewsPaid == other.videoViewsPaid &&
                    videoViewsPaidUnique == other.videoViewsPaidUnique &&
                    videoViewsSoundOn == other.videoViewsSoundOn &&
                    videoViewsUnique == other.videoViewsUnique &&
                    viralReach == other.viralReach &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    activityByActionType,
                    activityByActionTypeUnique,
                    comments,
                    fanReach,
                    mediaViews,
                    nonviralReach,
                    organicReach,
                    paidReach,
                    reach,
                    reactionsAnger,
                    reactionsByType,
                    reactionsHaha,
                    reactionsLike,
                    reactionsLove,
                    reactionsSorry,
                    reactionsTotal,
                    reactionsWow,
                    shares,
                    videoAvgTimeWatched,
                    videoCompleteViewsOrganic,
                    videoCompleteViewsOrganicUnique,
                    videoCompleteViewsPaid,
                    videoCompleteViewsPaidUnique,
                    videoLength,
                    videoRetentionGraphAutoplayed,
                    videoRetentionGraphClickedToPlay,
                    videoSocialActionsUnique,
                    videoViewTime,
                    videoViewTimeByAgeGender,
                    videoViewTimeByCountry,
                    videoViewTimeByDistributionType,
                    videoViewTimeByRegion,
                    videoViewTimeOrganic,
                    videoViews,
                    videoViews15s,
                    videoViews60s,
                    videoViewsAutoplayed,
                    videoViewsByDistributionType,
                    videoViewsClickedToPlay,
                    videoViewsOrganic,
                    videoViewsOrganicUnique,
                    videoViewsPaid,
                    videoViewsPaidUnique,
                    videoViewsSoundOn,
                    videoViewsUnique,
                    viralReach,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FacebookPostMetricsDto{activityByActionType=$activityByActionType, activityByActionTypeUnique=$activityByActionTypeUnique, comments=$comments, fanReach=$fanReach, mediaViews=$mediaViews, nonviralReach=$nonviralReach, organicReach=$organicReach, paidReach=$paidReach, reach=$reach, reactionsAnger=$reactionsAnger, reactionsByType=$reactionsByType, reactionsHaha=$reactionsHaha, reactionsLike=$reactionsLike, reactionsLove=$reactionsLove, reactionsSorry=$reactionsSorry, reactionsTotal=$reactionsTotal, reactionsWow=$reactionsWow, shares=$shares, videoAvgTimeWatched=$videoAvgTimeWatched, videoCompleteViewsOrganic=$videoCompleteViewsOrganic, videoCompleteViewsOrganicUnique=$videoCompleteViewsOrganicUnique, videoCompleteViewsPaid=$videoCompleteViewsPaid, videoCompleteViewsPaidUnique=$videoCompleteViewsPaidUnique, videoLength=$videoLength, videoRetentionGraphAutoplayed=$videoRetentionGraphAutoplayed, videoRetentionGraphClickedToPlay=$videoRetentionGraphClickedToPlay, videoSocialActionsUnique=$videoSocialActionsUnique, videoViewTime=$videoViewTime, videoViewTimeByAgeGender=$videoViewTimeByAgeGender, videoViewTimeByCountry=$videoViewTimeByCountry, videoViewTimeByDistributionType=$videoViewTimeByDistributionType, videoViewTimeByRegion=$videoViewTimeByRegion, videoViewTimeOrganic=$videoViewTimeOrganic, videoViews=$videoViews, videoViews15s=$videoViews15s, videoViews60s=$videoViews60s, videoViewsAutoplayed=$videoViewsAutoplayed, videoViewsByDistributionType=$videoViewsByDistributionType, videoViewsClickedToPlay=$videoViewsClickedToPlay, videoViewsOrganic=$videoViewsOrganic, videoViewsOrganicUnique=$videoViewsOrganicUnique, videoViewsPaid=$videoViewsPaid, videoViewsPaidUnique=$videoViewsPaidUnique, videoViewsSoundOn=$videoViewsSoundOn, videoViewsUnique=$videoViewsUnique, viralReach=$viralReach, additionalProperties=$additionalProperties}"
        }

        class TwitterPostMetricsDto
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val nonPublicMetrics: JsonField<NonPublicMetrics>,
            private val organicMetrics: JsonField<OrganicMetrics>,
            private val publicMetrics: JsonField<PublicMetrics>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("non_public_metrics")
                @ExcludeMissing
                nonPublicMetrics: JsonField<NonPublicMetrics> = JsonMissing.of(),
                @JsonProperty("organic_metrics")
                @ExcludeMissing
                organicMetrics: JsonField<OrganicMetrics> = JsonMissing.of(),
                @JsonProperty("public_metrics")
                @ExcludeMissing
                publicMetrics: JsonField<PublicMetrics> = JsonMissing.of(),
            ) : this(nonPublicMetrics, organicMetrics, publicMetrics, mutableMapOf())

            /**
             * Non-public metrics for the Tweet (available to the Tweet owner or advertisers)
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun nonPublicMetrics(): NonPublicMetrics? =
                nonPublicMetrics.getNullable("non_public_metrics")

            /**
             * Organic metrics for the Tweet (available to the Tweet owner)
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun organicMetrics(): OrganicMetrics? = organicMetrics.getNullable("organic_metrics")

            /**
             * Publicly available metrics for the Tweet
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun publicMetrics(): PublicMetrics? = publicMetrics.getNullable("public_metrics")

            /**
             * Returns the raw JSON value of [nonPublicMetrics].
             *
             * Unlike [nonPublicMetrics], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("non_public_metrics")
            @ExcludeMissing
            fun _nonPublicMetrics(): JsonField<NonPublicMetrics> = nonPublicMetrics

            /**
             * Returns the raw JSON value of [organicMetrics].
             *
             * Unlike [organicMetrics], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("organic_metrics")
            @ExcludeMissing
            fun _organicMetrics(): JsonField<OrganicMetrics> = organicMetrics

            /**
             * Returns the raw JSON value of [publicMetrics].
             *
             * Unlike [publicMetrics], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("public_metrics")
            @ExcludeMissing
            fun _publicMetrics(): JsonField<PublicMetrics> = publicMetrics

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
                 * Returns a mutable builder for constructing an instance of
                 * [TwitterPostMetricsDto].
                 */
                fun builder() = Builder()
            }

            /** A builder for [TwitterPostMetricsDto]. */
            class Builder internal constructor() {

                private var nonPublicMetrics: JsonField<NonPublicMetrics> = JsonMissing.of()
                private var organicMetrics: JsonField<OrganicMetrics> = JsonMissing.of()
                private var publicMetrics: JsonField<PublicMetrics> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(twitterPostMetricsDto: TwitterPostMetricsDto) = apply {
                    nonPublicMetrics = twitterPostMetricsDto.nonPublicMetrics
                    organicMetrics = twitterPostMetricsDto.organicMetrics
                    publicMetrics = twitterPostMetricsDto.publicMetrics
                    additionalProperties = twitterPostMetricsDto.additionalProperties.toMutableMap()
                }

                /**
                 * Non-public metrics for the Tweet (available to the Tweet owner or advertisers)
                 */
                fun nonPublicMetrics(nonPublicMetrics: NonPublicMetrics) =
                    nonPublicMetrics(JsonField.of(nonPublicMetrics))

                /**
                 * Sets [Builder.nonPublicMetrics] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nonPublicMetrics] with a well-typed
                 * [NonPublicMetrics] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun nonPublicMetrics(nonPublicMetrics: JsonField<NonPublicMetrics>) = apply {
                    this.nonPublicMetrics = nonPublicMetrics
                }

                /** Organic metrics for the Tweet (available to the Tweet owner) */
                fun organicMetrics(organicMetrics: OrganicMetrics) =
                    organicMetrics(JsonField.of(organicMetrics))

                /**
                 * Sets [Builder.organicMetrics] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.organicMetrics] with a well-typed
                 * [OrganicMetrics] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun organicMetrics(organicMetrics: JsonField<OrganicMetrics>) = apply {
                    this.organicMetrics = organicMetrics
                }

                /** Publicly available metrics for the Tweet */
                fun publicMetrics(publicMetrics: PublicMetrics) =
                    publicMetrics(JsonField.of(publicMetrics))

                /**
                 * Sets [Builder.publicMetrics] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.publicMetrics] with a well-typed [PublicMetrics]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun publicMetrics(publicMetrics: JsonField<PublicMetrics>) = apply {
                    this.publicMetrics = publicMetrics
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
                 * Returns an immutable instance of [TwitterPostMetricsDto].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TwitterPostMetricsDto =
                    TwitterPostMetricsDto(
                        nonPublicMetrics,
                        organicMetrics,
                        publicMetrics,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws PostForMeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): TwitterPostMetricsDto = apply {
                if (validated) {
                    return@apply
                }

                nonPublicMetrics()?.validate()
                organicMetrics()?.validate()
                publicMetrics()?.validate()
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
                (nonPublicMetrics.asKnown()?.validity() ?: 0) +
                    (organicMetrics.asKnown()?.validity() ?: 0) +
                    (publicMetrics.asKnown()?.validity() ?: 0)

            /** Non-public metrics for the Tweet (available to the Tweet owner or advertisers) */
            class NonPublicMetrics
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val impressionCount: JsonField<Double>,
                private val urlLinkClicks: JsonField<Double>,
                private val userProfileClicks: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("impression_count")
                    @ExcludeMissing
                    impressionCount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("url_link_clicks")
                    @ExcludeMissing
                    urlLinkClicks: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("user_profile_clicks")
                    @ExcludeMissing
                    userProfileClicks: JsonField<Double> = JsonMissing.of(),
                ) : this(impressionCount, urlLinkClicks, userProfileClicks, mutableMapOf())

                /**
                 * Number of times this Tweet has been viewed via promoted distribution
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun impressionCount(): Double = impressionCount.getRequired("impression_count")

                /**
                 * Number of clicks on links in this Tweet via promoted distribution
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun urlLinkClicks(): Double = urlLinkClicks.getRequired("url_link_clicks")

                /**
                 * Number of clicks on the author's profile via promoted distribution
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun userProfileClicks(): Double =
                    userProfileClicks.getRequired("user_profile_clicks")

                /**
                 * Returns the raw JSON value of [impressionCount].
                 *
                 * Unlike [impressionCount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("impression_count")
                @ExcludeMissing
                fun _impressionCount(): JsonField<Double> = impressionCount

                /**
                 * Returns the raw JSON value of [urlLinkClicks].
                 *
                 * Unlike [urlLinkClicks], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("url_link_clicks")
                @ExcludeMissing
                fun _urlLinkClicks(): JsonField<Double> = urlLinkClicks

                /**
                 * Returns the raw JSON value of [userProfileClicks].
                 *
                 * Unlike [userProfileClicks], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("user_profile_clicks")
                @ExcludeMissing
                fun _userProfileClicks(): JsonField<Double> = userProfileClicks

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
                     * Returns a mutable builder for constructing an instance of [NonPublicMetrics].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .impressionCount()
                     * .urlLinkClicks()
                     * .userProfileClicks()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [NonPublicMetrics]. */
                class Builder internal constructor() {

                    private var impressionCount: JsonField<Double>? = null
                    private var urlLinkClicks: JsonField<Double>? = null
                    private var userProfileClicks: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(nonPublicMetrics: NonPublicMetrics) = apply {
                        impressionCount = nonPublicMetrics.impressionCount
                        urlLinkClicks = nonPublicMetrics.urlLinkClicks
                        userProfileClicks = nonPublicMetrics.userProfileClicks
                        additionalProperties = nonPublicMetrics.additionalProperties.toMutableMap()
                    }

                    /** Number of times this Tweet has been viewed via promoted distribution */
                    fun impressionCount(impressionCount: Double) =
                        impressionCount(JsonField.of(impressionCount))

                    /**
                     * Sets [Builder.impressionCount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.impressionCount] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun impressionCount(impressionCount: JsonField<Double>) = apply {
                        this.impressionCount = impressionCount
                    }

                    /** Number of clicks on links in this Tweet via promoted distribution */
                    fun urlLinkClicks(urlLinkClicks: Double) =
                        urlLinkClicks(JsonField.of(urlLinkClicks))

                    /**
                     * Sets [Builder.urlLinkClicks] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.urlLinkClicks] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun urlLinkClicks(urlLinkClicks: JsonField<Double>) = apply {
                        this.urlLinkClicks = urlLinkClicks
                    }

                    /** Number of clicks on the author's profile via promoted distribution */
                    fun userProfileClicks(userProfileClicks: Double) =
                        userProfileClicks(JsonField.of(userProfileClicks))

                    /**
                     * Sets [Builder.userProfileClicks] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.userProfileClicks] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun userProfileClicks(userProfileClicks: JsonField<Double>) = apply {
                        this.userProfileClicks = userProfileClicks
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
                     * Returns an immutable instance of [NonPublicMetrics].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .impressionCount()
                     * .urlLinkClicks()
                     * .userProfileClicks()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): NonPublicMetrics =
                        NonPublicMetrics(
                            checkRequired("impressionCount", impressionCount),
                            checkRequired("urlLinkClicks", urlLinkClicks),
                            checkRequired("userProfileClicks", userProfileClicks),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PostForMeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): NonPublicMetrics = apply {
                    if (validated) {
                        return@apply
                    }

                    impressionCount()
                    urlLinkClicks()
                    userProfileClicks()
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
                    (if (impressionCount.asKnown() == null) 0 else 1) +
                        (if (urlLinkClicks.asKnown() == null) 0 else 1) +
                        (if (userProfileClicks.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NonPublicMetrics &&
                        impressionCount == other.impressionCount &&
                        urlLinkClicks == other.urlLinkClicks &&
                        userProfileClicks == other.userProfileClicks &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        impressionCount,
                        urlLinkClicks,
                        userProfileClicks,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "NonPublicMetrics{impressionCount=$impressionCount, urlLinkClicks=$urlLinkClicks, userProfileClicks=$userProfileClicks, additionalProperties=$additionalProperties}"
            }

            /** Organic metrics for the Tweet (available to the Tweet owner) */
            class OrganicMetrics
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val impressionCount: JsonField<Double>,
                private val likeCount: JsonField<Double>,
                private val replyCount: JsonField<Double>,
                private val retweetCount: JsonField<Double>,
                private val urlLinkClicks: JsonField<Double>,
                private val userProfileClicks: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("impression_count")
                    @ExcludeMissing
                    impressionCount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("like_count")
                    @ExcludeMissing
                    likeCount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("reply_count")
                    @ExcludeMissing
                    replyCount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("retweet_count")
                    @ExcludeMissing
                    retweetCount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("url_link_clicks")
                    @ExcludeMissing
                    urlLinkClicks: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("user_profile_clicks")
                    @ExcludeMissing
                    userProfileClicks: JsonField<Double> = JsonMissing.of(),
                ) : this(
                    impressionCount,
                    likeCount,
                    replyCount,
                    retweetCount,
                    urlLinkClicks,
                    userProfileClicks,
                    mutableMapOf(),
                )

                /**
                 * Number of times this Tweet has been viewed organically
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun impressionCount(): Double = impressionCount.getRequired("impression_count")

                /**
                 * Number of Likes of this Tweet from organic distribution
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun likeCount(): Double = likeCount.getRequired("like_count")

                /**
                 * Number of Replies of this Tweet from organic distribution
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun replyCount(): Double = replyCount.getRequired("reply_count")

                /**
                 * Number of Retweets of this Tweet from organic distribution
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun retweetCount(): Double = retweetCount.getRequired("retweet_count")

                /**
                 * Number of clicks on links in this Tweet from organic distribution
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun urlLinkClicks(): Double = urlLinkClicks.getRequired("url_link_clicks")

                /**
                 * Number of clicks on the author's profile from organic distribution
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun userProfileClicks(): Double =
                    userProfileClicks.getRequired("user_profile_clicks")

                /**
                 * Returns the raw JSON value of [impressionCount].
                 *
                 * Unlike [impressionCount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("impression_count")
                @ExcludeMissing
                fun _impressionCount(): JsonField<Double> = impressionCount

                /**
                 * Returns the raw JSON value of [likeCount].
                 *
                 * Unlike [likeCount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("like_count")
                @ExcludeMissing
                fun _likeCount(): JsonField<Double> = likeCount

                /**
                 * Returns the raw JSON value of [replyCount].
                 *
                 * Unlike [replyCount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("reply_count")
                @ExcludeMissing
                fun _replyCount(): JsonField<Double> = replyCount

                /**
                 * Returns the raw JSON value of [retweetCount].
                 *
                 * Unlike [retweetCount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("retweet_count")
                @ExcludeMissing
                fun _retweetCount(): JsonField<Double> = retweetCount

                /**
                 * Returns the raw JSON value of [urlLinkClicks].
                 *
                 * Unlike [urlLinkClicks], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("url_link_clicks")
                @ExcludeMissing
                fun _urlLinkClicks(): JsonField<Double> = urlLinkClicks

                /**
                 * Returns the raw JSON value of [userProfileClicks].
                 *
                 * Unlike [userProfileClicks], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("user_profile_clicks")
                @ExcludeMissing
                fun _userProfileClicks(): JsonField<Double> = userProfileClicks

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
                     * Returns a mutable builder for constructing an instance of [OrganicMetrics].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .impressionCount()
                     * .likeCount()
                     * .replyCount()
                     * .retweetCount()
                     * .urlLinkClicks()
                     * .userProfileClicks()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [OrganicMetrics]. */
                class Builder internal constructor() {

                    private var impressionCount: JsonField<Double>? = null
                    private var likeCount: JsonField<Double>? = null
                    private var replyCount: JsonField<Double>? = null
                    private var retweetCount: JsonField<Double>? = null
                    private var urlLinkClicks: JsonField<Double>? = null
                    private var userProfileClicks: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(organicMetrics: OrganicMetrics) = apply {
                        impressionCount = organicMetrics.impressionCount
                        likeCount = organicMetrics.likeCount
                        replyCount = organicMetrics.replyCount
                        retweetCount = organicMetrics.retweetCount
                        urlLinkClicks = organicMetrics.urlLinkClicks
                        userProfileClicks = organicMetrics.userProfileClicks
                        additionalProperties = organicMetrics.additionalProperties.toMutableMap()
                    }

                    /** Number of times this Tweet has been viewed organically */
                    fun impressionCount(impressionCount: Double) =
                        impressionCount(JsonField.of(impressionCount))

                    /**
                     * Sets [Builder.impressionCount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.impressionCount] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun impressionCount(impressionCount: JsonField<Double>) = apply {
                        this.impressionCount = impressionCount
                    }

                    /** Number of Likes of this Tweet from organic distribution */
                    fun likeCount(likeCount: Double) = likeCount(JsonField.of(likeCount))

                    /**
                     * Sets [Builder.likeCount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.likeCount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun likeCount(likeCount: JsonField<Double>) = apply {
                        this.likeCount = likeCount
                    }

                    /** Number of Replies of this Tweet from organic distribution */
                    fun replyCount(replyCount: Double) = replyCount(JsonField.of(replyCount))

                    /**
                     * Sets [Builder.replyCount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.replyCount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun replyCount(replyCount: JsonField<Double>) = apply {
                        this.replyCount = replyCount
                    }

                    /** Number of Retweets of this Tweet from organic distribution */
                    fun retweetCount(retweetCount: Double) =
                        retweetCount(JsonField.of(retweetCount))

                    /**
                     * Sets [Builder.retweetCount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.retweetCount] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun retweetCount(retweetCount: JsonField<Double>) = apply {
                        this.retweetCount = retweetCount
                    }

                    /** Number of clicks on links in this Tweet from organic distribution */
                    fun urlLinkClicks(urlLinkClicks: Double) =
                        urlLinkClicks(JsonField.of(urlLinkClicks))

                    /**
                     * Sets [Builder.urlLinkClicks] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.urlLinkClicks] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun urlLinkClicks(urlLinkClicks: JsonField<Double>) = apply {
                        this.urlLinkClicks = urlLinkClicks
                    }

                    /** Number of clicks on the author's profile from organic distribution */
                    fun userProfileClicks(userProfileClicks: Double) =
                        userProfileClicks(JsonField.of(userProfileClicks))

                    /**
                     * Sets [Builder.userProfileClicks] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.userProfileClicks] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun userProfileClicks(userProfileClicks: JsonField<Double>) = apply {
                        this.userProfileClicks = userProfileClicks
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
                     * Returns an immutable instance of [OrganicMetrics].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .impressionCount()
                     * .likeCount()
                     * .replyCount()
                     * .retweetCount()
                     * .urlLinkClicks()
                     * .userProfileClicks()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): OrganicMetrics =
                        OrganicMetrics(
                            checkRequired("impressionCount", impressionCount),
                            checkRequired("likeCount", likeCount),
                            checkRequired("replyCount", replyCount),
                            checkRequired("retweetCount", retweetCount),
                            checkRequired("urlLinkClicks", urlLinkClicks),
                            checkRequired("userProfileClicks", userProfileClicks),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PostForMeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): OrganicMetrics = apply {
                    if (validated) {
                        return@apply
                    }

                    impressionCount()
                    likeCount()
                    replyCount()
                    retweetCount()
                    urlLinkClicks()
                    userProfileClicks()
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
                    (if (impressionCount.asKnown() == null) 0 else 1) +
                        (if (likeCount.asKnown() == null) 0 else 1) +
                        (if (replyCount.asKnown() == null) 0 else 1) +
                        (if (retweetCount.asKnown() == null) 0 else 1) +
                        (if (urlLinkClicks.asKnown() == null) 0 else 1) +
                        (if (userProfileClicks.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is OrganicMetrics &&
                        impressionCount == other.impressionCount &&
                        likeCount == other.likeCount &&
                        replyCount == other.replyCount &&
                        retweetCount == other.retweetCount &&
                        urlLinkClicks == other.urlLinkClicks &&
                        userProfileClicks == other.userProfileClicks &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        impressionCount,
                        likeCount,
                        replyCount,
                        retweetCount,
                        urlLinkClicks,
                        userProfileClicks,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "OrganicMetrics{impressionCount=$impressionCount, likeCount=$likeCount, replyCount=$replyCount, retweetCount=$retweetCount, urlLinkClicks=$urlLinkClicks, userProfileClicks=$userProfileClicks, additionalProperties=$additionalProperties}"
            }

            /** Publicly available metrics for the Tweet */
            class PublicMetrics
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bookmarkCount: JsonField<Double>,
                private val impressionCount: JsonField<Double>,
                private val likeCount: JsonField<Double>,
                private val quoteCount: JsonField<Double>,
                private val replyCount: JsonField<Double>,
                private val retweetCount: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bookmark_count")
                    @ExcludeMissing
                    bookmarkCount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("impression_count")
                    @ExcludeMissing
                    impressionCount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("like_count")
                    @ExcludeMissing
                    likeCount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("quote_count")
                    @ExcludeMissing
                    quoteCount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("reply_count")
                    @ExcludeMissing
                    replyCount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("retweet_count")
                    @ExcludeMissing
                    retweetCount: JsonField<Double> = JsonMissing.of(),
                ) : this(
                    bookmarkCount,
                    impressionCount,
                    likeCount,
                    quoteCount,
                    replyCount,
                    retweetCount,
                    mutableMapOf(),
                )

                /**
                 * Number of times this Tweet has been bookmarked
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun bookmarkCount(): Double = bookmarkCount.getRequired("bookmark_count")

                /**
                 * Number of times this Tweet has been viewed
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun impressionCount(): Double = impressionCount.getRequired("impression_count")

                /**
                 * Number of Likes of this Tweet
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun likeCount(): Double = likeCount.getRequired("like_count")

                /**
                 * Number of Quotes of this Tweet
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun quoteCount(): Double = quoteCount.getRequired("quote_count")

                /**
                 * Number of Replies of this Tweet
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun replyCount(): Double = replyCount.getRequired("reply_count")

                /**
                 * Number of Retweets of this Tweet
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun retweetCount(): Double = retweetCount.getRequired("retweet_count")

                /**
                 * Returns the raw JSON value of [bookmarkCount].
                 *
                 * Unlike [bookmarkCount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("bookmark_count")
                @ExcludeMissing
                fun _bookmarkCount(): JsonField<Double> = bookmarkCount

                /**
                 * Returns the raw JSON value of [impressionCount].
                 *
                 * Unlike [impressionCount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("impression_count")
                @ExcludeMissing
                fun _impressionCount(): JsonField<Double> = impressionCount

                /**
                 * Returns the raw JSON value of [likeCount].
                 *
                 * Unlike [likeCount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("like_count")
                @ExcludeMissing
                fun _likeCount(): JsonField<Double> = likeCount

                /**
                 * Returns the raw JSON value of [quoteCount].
                 *
                 * Unlike [quoteCount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("quote_count")
                @ExcludeMissing
                fun _quoteCount(): JsonField<Double> = quoteCount

                /**
                 * Returns the raw JSON value of [replyCount].
                 *
                 * Unlike [replyCount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("reply_count")
                @ExcludeMissing
                fun _replyCount(): JsonField<Double> = replyCount

                /**
                 * Returns the raw JSON value of [retweetCount].
                 *
                 * Unlike [retweetCount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("retweet_count")
                @ExcludeMissing
                fun _retweetCount(): JsonField<Double> = retweetCount

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
                     * Returns a mutable builder for constructing an instance of [PublicMetrics].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .bookmarkCount()
                     * .impressionCount()
                     * .likeCount()
                     * .quoteCount()
                     * .replyCount()
                     * .retweetCount()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [PublicMetrics]. */
                class Builder internal constructor() {

                    private var bookmarkCount: JsonField<Double>? = null
                    private var impressionCount: JsonField<Double>? = null
                    private var likeCount: JsonField<Double>? = null
                    private var quoteCount: JsonField<Double>? = null
                    private var replyCount: JsonField<Double>? = null
                    private var retweetCount: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(publicMetrics: PublicMetrics) = apply {
                        bookmarkCount = publicMetrics.bookmarkCount
                        impressionCount = publicMetrics.impressionCount
                        likeCount = publicMetrics.likeCount
                        quoteCount = publicMetrics.quoteCount
                        replyCount = publicMetrics.replyCount
                        retweetCount = publicMetrics.retweetCount
                        additionalProperties = publicMetrics.additionalProperties.toMutableMap()
                    }

                    /** Number of times this Tweet has been bookmarked */
                    fun bookmarkCount(bookmarkCount: Double) =
                        bookmarkCount(JsonField.of(bookmarkCount))

                    /**
                     * Sets [Builder.bookmarkCount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bookmarkCount] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun bookmarkCount(bookmarkCount: JsonField<Double>) = apply {
                        this.bookmarkCount = bookmarkCount
                    }

                    /** Number of times this Tweet has been viewed */
                    fun impressionCount(impressionCount: Double) =
                        impressionCount(JsonField.of(impressionCount))

                    /**
                     * Sets [Builder.impressionCount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.impressionCount] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun impressionCount(impressionCount: JsonField<Double>) = apply {
                        this.impressionCount = impressionCount
                    }

                    /** Number of Likes of this Tweet */
                    fun likeCount(likeCount: Double) = likeCount(JsonField.of(likeCount))

                    /**
                     * Sets [Builder.likeCount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.likeCount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun likeCount(likeCount: JsonField<Double>) = apply {
                        this.likeCount = likeCount
                    }

                    /** Number of Quotes of this Tweet */
                    fun quoteCount(quoteCount: Double) = quoteCount(JsonField.of(quoteCount))

                    /**
                     * Sets [Builder.quoteCount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quoteCount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quoteCount(quoteCount: JsonField<Double>) = apply {
                        this.quoteCount = quoteCount
                    }

                    /** Number of Replies of this Tweet */
                    fun replyCount(replyCount: Double) = replyCount(JsonField.of(replyCount))

                    /**
                     * Sets [Builder.replyCount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.replyCount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun replyCount(replyCount: JsonField<Double>) = apply {
                        this.replyCount = replyCount
                    }

                    /** Number of Retweets of this Tweet */
                    fun retweetCount(retweetCount: Double) =
                        retweetCount(JsonField.of(retweetCount))

                    /**
                     * Sets [Builder.retweetCount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.retweetCount] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun retweetCount(retweetCount: JsonField<Double>) = apply {
                        this.retweetCount = retweetCount
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
                     * Returns an immutable instance of [PublicMetrics].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .bookmarkCount()
                     * .impressionCount()
                     * .likeCount()
                     * .quoteCount()
                     * .replyCount()
                     * .retweetCount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): PublicMetrics =
                        PublicMetrics(
                            checkRequired("bookmarkCount", bookmarkCount),
                            checkRequired("impressionCount", impressionCount),
                            checkRequired("likeCount", likeCount),
                            checkRequired("quoteCount", quoteCount),
                            checkRequired("replyCount", replyCount),
                            checkRequired("retweetCount", retweetCount),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PostForMeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PublicMetrics = apply {
                    if (validated) {
                        return@apply
                    }

                    bookmarkCount()
                    impressionCount()
                    likeCount()
                    quoteCount()
                    replyCount()
                    retweetCount()
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
                    (if (bookmarkCount.asKnown() == null) 0 else 1) +
                        (if (impressionCount.asKnown() == null) 0 else 1) +
                        (if (likeCount.asKnown() == null) 0 else 1) +
                        (if (quoteCount.asKnown() == null) 0 else 1) +
                        (if (replyCount.asKnown() == null) 0 else 1) +
                        (if (retweetCount.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PublicMetrics &&
                        bookmarkCount == other.bookmarkCount &&
                        impressionCount == other.impressionCount &&
                        likeCount == other.likeCount &&
                        quoteCount == other.quoteCount &&
                        replyCount == other.replyCount &&
                        retweetCount == other.retweetCount &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        bookmarkCount,
                        impressionCount,
                        likeCount,
                        quoteCount,
                        replyCount,
                        retweetCount,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PublicMetrics{bookmarkCount=$bookmarkCount, impressionCount=$impressionCount, likeCount=$likeCount, quoteCount=$quoteCount, replyCount=$replyCount, retweetCount=$retweetCount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TwitterPostMetricsDto &&
                    nonPublicMetrics == other.nonPublicMetrics &&
                    organicMetrics == other.organicMetrics &&
                    publicMetrics == other.publicMetrics &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(nonPublicMetrics, organicMetrics, publicMetrics, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TwitterPostMetricsDto{nonPublicMetrics=$nonPublicMetrics, organicMetrics=$organicMetrics, publicMetrics=$publicMetrics, additionalProperties=$additionalProperties}"
        }

        class ThreadsPostMetricsDto
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val likes: JsonField<Double>,
            private val quotes: JsonField<Double>,
            private val replies: JsonField<Double>,
            private val reposts: JsonField<Double>,
            private val shares: JsonField<Double>,
            private val views: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("likes") @ExcludeMissing likes: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quotes")
                @ExcludeMissing
                quotes: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("replies")
                @ExcludeMissing
                replies: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reposts")
                @ExcludeMissing
                reposts: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("shares")
                @ExcludeMissing
                shares: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("views") @ExcludeMissing views: JsonField<Double> = JsonMissing.of(),
            ) : this(likes, quotes, replies, reposts, shares, views, mutableMapOf())

            /**
             * Number of likes on the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun likes(): Double = likes.getRequired("likes")

            /**
             * Number of quotes of the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun quotes(): Double = quotes.getRequired("quotes")

            /**
             * Number of replies on the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun replies(): Double = replies.getRequired("replies")

            /**
             * Number of reposts of the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reposts(): Double = reposts.getRequired("reposts")

            /**
             * Number of shares of the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun shares(): Double = shares.getRequired("shares")

            /**
             * Number of views on the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun views(): Double = views.getRequired("views")

            /**
             * Returns the raw JSON value of [likes].
             *
             * Unlike [likes], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("likes") @ExcludeMissing fun _likes(): JsonField<Double> = likes

            /**
             * Returns the raw JSON value of [quotes].
             *
             * Unlike [quotes], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("quotes") @ExcludeMissing fun _quotes(): JsonField<Double> = quotes

            /**
             * Returns the raw JSON value of [replies].
             *
             * Unlike [replies], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("replies") @ExcludeMissing fun _replies(): JsonField<Double> = replies

            /**
             * Returns the raw JSON value of [reposts].
             *
             * Unlike [reposts], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reposts") @ExcludeMissing fun _reposts(): JsonField<Double> = reposts

            /**
             * Returns the raw JSON value of [shares].
             *
             * Unlike [shares], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("shares") @ExcludeMissing fun _shares(): JsonField<Double> = shares

            /**
             * Returns the raw JSON value of [views].
             *
             * Unlike [views], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("views") @ExcludeMissing fun _views(): JsonField<Double> = views

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
                 * Returns a mutable builder for constructing an instance of
                 * [ThreadsPostMetricsDto].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .likes()
                 * .quotes()
                 * .replies()
                 * .reposts()
                 * .shares()
                 * .views()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ThreadsPostMetricsDto]. */
            class Builder internal constructor() {

                private var likes: JsonField<Double>? = null
                private var quotes: JsonField<Double>? = null
                private var replies: JsonField<Double>? = null
                private var reposts: JsonField<Double>? = null
                private var shares: JsonField<Double>? = null
                private var views: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(threadsPostMetricsDto: ThreadsPostMetricsDto) = apply {
                    likes = threadsPostMetricsDto.likes
                    quotes = threadsPostMetricsDto.quotes
                    replies = threadsPostMetricsDto.replies
                    reposts = threadsPostMetricsDto.reposts
                    shares = threadsPostMetricsDto.shares
                    views = threadsPostMetricsDto.views
                    additionalProperties = threadsPostMetricsDto.additionalProperties.toMutableMap()
                }

                /** Number of likes on the post */
                fun likes(likes: Double) = likes(JsonField.of(likes))

                /**
                 * Sets [Builder.likes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.likes] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun likes(likes: JsonField<Double>) = apply { this.likes = likes }

                /** Number of quotes of the post */
                fun quotes(quotes: Double) = quotes(JsonField.of(quotes))

                /**
                 * Sets [Builder.quotes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quotes] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quotes(quotes: JsonField<Double>) = apply { this.quotes = quotes }

                /** Number of replies on the post */
                fun replies(replies: Double) = replies(JsonField.of(replies))

                /**
                 * Sets [Builder.replies] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.replies] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun replies(replies: JsonField<Double>) = apply { this.replies = replies }

                /** Number of reposts of the post */
                fun reposts(reposts: Double) = reposts(JsonField.of(reposts))

                /**
                 * Sets [Builder.reposts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reposts] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reposts(reposts: JsonField<Double>) = apply { this.reposts = reposts }

                /** Number of shares of the post */
                fun shares(shares: Double) = shares(JsonField.of(shares))

                /**
                 * Sets [Builder.shares] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shares] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun shares(shares: JsonField<Double>) = apply { this.shares = shares }

                /** Number of views on the post */
                fun views(views: Double) = views(JsonField.of(views))

                /**
                 * Sets [Builder.views] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.views] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun views(views: JsonField<Double>) = apply { this.views = views }

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
                 * Returns an immutable instance of [ThreadsPostMetricsDto].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .likes()
                 * .quotes()
                 * .replies()
                 * .reposts()
                 * .shares()
                 * .views()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ThreadsPostMetricsDto =
                    ThreadsPostMetricsDto(
                        checkRequired("likes", likes),
                        checkRequired("quotes", quotes),
                        checkRequired("replies", replies),
                        checkRequired("reposts", reposts),
                        checkRequired("shares", shares),
                        checkRequired("views", views),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws PostForMeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ThreadsPostMetricsDto = apply {
                if (validated) {
                    return@apply
                }

                likes()
                quotes()
                replies()
                reposts()
                shares()
                views()
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
                (if (likes.asKnown() == null) 0 else 1) +
                    (if (quotes.asKnown() == null) 0 else 1) +
                    (if (replies.asKnown() == null) 0 else 1) +
                    (if (reposts.asKnown() == null) 0 else 1) +
                    (if (shares.asKnown() == null) 0 else 1) +
                    (if (views.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ThreadsPostMetricsDto &&
                    likes == other.likes &&
                    quotes == other.quotes &&
                    replies == other.replies &&
                    reposts == other.reposts &&
                    shares == other.shares &&
                    views == other.views &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(likes, quotes, replies, reposts, shares, views, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ThreadsPostMetricsDto{likes=$likes, quotes=$quotes, replies=$replies, reposts=$reposts, shares=$shares, views=$views, additionalProperties=$additionalProperties}"
        }

        class LinkedInPostMetricsDto
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val clickCount: JsonField<Double>,
            private val commentCount: JsonField<Double>,
            private val engagement: JsonField<Double>,
            private val impressionCount: JsonField<Double>,
            private val likeCount: JsonField<Double>,
            private val shareCount: JsonField<Double>,
            private val timeWatched: JsonField<Double>,
            private val timeWatchedForVideoViews: JsonField<Double>,
            private val videoView: JsonField<Double>,
            private val viewer: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("clickCount")
                @ExcludeMissing
                clickCount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("commentCount")
                @ExcludeMissing
                commentCount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("engagement")
                @ExcludeMissing
                engagement: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("impressionCount")
                @ExcludeMissing
                impressionCount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("likeCount")
                @ExcludeMissing
                likeCount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("shareCount")
                @ExcludeMissing
                shareCount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("timeWatched")
                @ExcludeMissing
                timeWatched: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("timeWatchedForVideoViews")
                @ExcludeMissing
                timeWatchedForVideoViews: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("videoView")
                @ExcludeMissing
                videoView: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("viewer") @ExcludeMissing viewer: JsonField<Double> = JsonMissing.of(),
            ) : this(
                clickCount,
                commentCount,
                engagement,
                impressionCount,
                likeCount,
                shareCount,
                timeWatched,
                timeWatchedForVideoViews,
                videoView,
                viewer,
                mutableMapOf(),
            )

            /**
             * Number of clicks
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun clickCount(): Double? = clickCount.getNullable("clickCount")

            /**
             * Number of comments
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun commentCount(): Double? = commentCount.getNullable("commentCount")

            /**
             * Engagement rate
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun engagement(): Double? = engagement.getNullable("engagement")

            /**
             * Number of impressions
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun impressionCount(): Double? = impressionCount.getNullable("impressionCount")

            /**
             * Number of likes
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun likeCount(): Double? = likeCount.getNullable("likeCount")

            /**
             * Number of shares
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun shareCount(): Double? = shareCount.getNullable("shareCount")

            /**
             * TIME_WATCHED: The time the video was watched in milliseconds. Video auto-looping will
             * continue to increase this metric for each subsequent play
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun timeWatched(): Double? = timeWatched.getNullable("timeWatched")

            /**
             * TIME_WATCHED_FOR_VIDEO_VIEWS: The time watched in milliseconds for video play-pause
             * cycles that are at least 3 seconds. Video auto-looping will continue to increase this
             * metric for each subsequent play. Analytics data for this metric will be available for
             * six months
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun timeWatchedForVideoViews(): Double? =
                timeWatchedForVideoViews.getNullable("timeWatchedForVideoViews")

            /**
             * VIDEO_VIEW: Video views with play-pause cycles for at least 3 seconds. Auto-looping
             * videos are counted as one when loaded. Each subsequent auto-looped play doesn't
             * increase this metric. Analytics data for this metric won't be available after six
             * months
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun videoView(): Double? = videoView.getNullable("videoView")

            /**
             * VIEWER: Unique viewers who made engaged plays on the video. Auto-looping videos are
             * counted as one when loaded. Each subsequent auto-looped play doesn't increase this
             * metric. Analytics data for this metric won't be available after six months
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun viewer(): Double? = viewer.getNullable("viewer")

            /**
             * Returns the raw JSON value of [clickCount].
             *
             * Unlike [clickCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("clickCount")
            @ExcludeMissing
            fun _clickCount(): JsonField<Double> = clickCount

            /**
             * Returns the raw JSON value of [commentCount].
             *
             * Unlike [commentCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("commentCount")
            @ExcludeMissing
            fun _commentCount(): JsonField<Double> = commentCount

            /**
             * Returns the raw JSON value of [engagement].
             *
             * Unlike [engagement], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("engagement")
            @ExcludeMissing
            fun _engagement(): JsonField<Double> = engagement

            /**
             * Returns the raw JSON value of [impressionCount].
             *
             * Unlike [impressionCount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("impressionCount")
            @ExcludeMissing
            fun _impressionCount(): JsonField<Double> = impressionCount

            /**
             * Returns the raw JSON value of [likeCount].
             *
             * Unlike [likeCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("likeCount")
            @ExcludeMissing
            fun _likeCount(): JsonField<Double> = likeCount

            /**
             * Returns the raw JSON value of [shareCount].
             *
             * Unlike [shareCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("shareCount")
            @ExcludeMissing
            fun _shareCount(): JsonField<Double> = shareCount

            /**
             * Returns the raw JSON value of [timeWatched].
             *
             * Unlike [timeWatched], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timeWatched")
            @ExcludeMissing
            fun _timeWatched(): JsonField<Double> = timeWatched

            /**
             * Returns the raw JSON value of [timeWatchedForVideoViews].
             *
             * Unlike [timeWatchedForVideoViews], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("timeWatchedForVideoViews")
            @ExcludeMissing
            fun _timeWatchedForVideoViews(): JsonField<Double> = timeWatchedForVideoViews

            /**
             * Returns the raw JSON value of [videoView].
             *
             * Unlike [videoView], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("videoView")
            @ExcludeMissing
            fun _videoView(): JsonField<Double> = videoView

            /**
             * Returns the raw JSON value of [viewer].
             *
             * Unlike [viewer], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("viewer") @ExcludeMissing fun _viewer(): JsonField<Double> = viewer

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
                 * Returns a mutable builder for constructing an instance of
                 * [LinkedInPostMetricsDto].
                 */
                fun builder() = Builder()
            }

            /** A builder for [LinkedInPostMetricsDto]. */
            class Builder internal constructor() {

                private var clickCount: JsonField<Double> = JsonMissing.of()
                private var commentCount: JsonField<Double> = JsonMissing.of()
                private var engagement: JsonField<Double> = JsonMissing.of()
                private var impressionCount: JsonField<Double> = JsonMissing.of()
                private var likeCount: JsonField<Double> = JsonMissing.of()
                private var shareCount: JsonField<Double> = JsonMissing.of()
                private var timeWatched: JsonField<Double> = JsonMissing.of()
                private var timeWatchedForVideoViews: JsonField<Double> = JsonMissing.of()
                private var videoView: JsonField<Double> = JsonMissing.of()
                private var viewer: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(linkedInPostMetricsDto: LinkedInPostMetricsDto) = apply {
                    clickCount = linkedInPostMetricsDto.clickCount
                    commentCount = linkedInPostMetricsDto.commentCount
                    engagement = linkedInPostMetricsDto.engagement
                    impressionCount = linkedInPostMetricsDto.impressionCount
                    likeCount = linkedInPostMetricsDto.likeCount
                    shareCount = linkedInPostMetricsDto.shareCount
                    timeWatched = linkedInPostMetricsDto.timeWatched
                    timeWatchedForVideoViews = linkedInPostMetricsDto.timeWatchedForVideoViews
                    videoView = linkedInPostMetricsDto.videoView
                    viewer = linkedInPostMetricsDto.viewer
                    additionalProperties =
                        linkedInPostMetricsDto.additionalProperties.toMutableMap()
                }

                /** Number of clicks */
                fun clickCount(clickCount: Double) = clickCount(JsonField.of(clickCount))

                /**
                 * Sets [Builder.clickCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clickCount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun clickCount(clickCount: JsonField<Double>) = apply {
                    this.clickCount = clickCount
                }

                /** Number of comments */
                fun commentCount(commentCount: Double) = commentCount(JsonField.of(commentCount))

                /**
                 * Sets [Builder.commentCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.commentCount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun commentCount(commentCount: JsonField<Double>) = apply {
                    this.commentCount = commentCount
                }

                /** Engagement rate */
                fun engagement(engagement: Double) = engagement(JsonField.of(engagement))

                /**
                 * Sets [Builder.engagement] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.engagement] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun engagement(engagement: JsonField<Double>) = apply {
                    this.engagement = engagement
                }

                /** Number of impressions */
                fun impressionCount(impressionCount: Double) =
                    impressionCount(JsonField.of(impressionCount))

                /**
                 * Sets [Builder.impressionCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.impressionCount] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun impressionCount(impressionCount: JsonField<Double>) = apply {
                    this.impressionCount = impressionCount
                }

                /** Number of likes */
                fun likeCount(likeCount: Double) = likeCount(JsonField.of(likeCount))

                /**
                 * Sets [Builder.likeCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.likeCount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun likeCount(likeCount: JsonField<Double>) = apply { this.likeCount = likeCount }

                /** Number of shares */
                fun shareCount(shareCount: Double) = shareCount(JsonField.of(shareCount))

                /**
                 * Sets [Builder.shareCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shareCount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun shareCount(shareCount: JsonField<Double>) = apply {
                    this.shareCount = shareCount
                }

                /**
                 * TIME_WATCHED: The time the video was watched in milliseconds. Video auto-looping
                 * will continue to increase this metric for each subsequent play
                 */
                fun timeWatched(timeWatched: Double) = timeWatched(JsonField.of(timeWatched))

                /**
                 * Sets [Builder.timeWatched] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timeWatched] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun timeWatched(timeWatched: JsonField<Double>) = apply {
                    this.timeWatched = timeWatched
                }

                /**
                 * TIME_WATCHED_FOR_VIDEO_VIEWS: The time watched in milliseconds for video
                 * play-pause cycles that are at least 3 seconds. Video auto-looping will continue
                 * to increase this metric for each subsequent play. Analytics data for this metric
                 * will be available for six months
                 */
                fun timeWatchedForVideoViews(timeWatchedForVideoViews: Double) =
                    timeWatchedForVideoViews(JsonField.of(timeWatchedForVideoViews))

                /**
                 * Sets [Builder.timeWatchedForVideoViews] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timeWatchedForVideoViews] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun timeWatchedForVideoViews(timeWatchedForVideoViews: JsonField<Double>) = apply {
                    this.timeWatchedForVideoViews = timeWatchedForVideoViews
                }

                /**
                 * VIDEO_VIEW: Video views with play-pause cycles for at least 3 seconds.
                 * Auto-looping videos are counted as one when loaded. Each subsequent auto-looped
                 * play doesn't increase this metric. Analytics data for this metric won't be
                 * available after six months
                 */
                fun videoView(videoView: Double) = videoView(JsonField.of(videoView))

                /**
                 * Sets [Builder.videoView] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.videoView] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun videoView(videoView: JsonField<Double>) = apply { this.videoView = videoView }

                /**
                 * VIEWER: Unique viewers who made engaged plays on the video. Auto-looping videos
                 * are counted as one when loaded. Each subsequent auto-looped play doesn't increase
                 * this metric. Analytics data for this metric won't be available after six months
                 */
                fun viewer(viewer: Double) = viewer(JsonField.of(viewer))

                /**
                 * Sets [Builder.viewer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.viewer] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun viewer(viewer: JsonField<Double>) = apply { this.viewer = viewer }

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
                 * Returns an immutable instance of [LinkedInPostMetricsDto].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): LinkedInPostMetricsDto =
                    LinkedInPostMetricsDto(
                        clickCount,
                        commentCount,
                        engagement,
                        impressionCount,
                        likeCount,
                        shareCount,
                        timeWatched,
                        timeWatchedForVideoViews,
                        videoView,
                        viewer,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws PostForMeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): LinkedInPostMetricsDto = apply {
                if (validated) {
                    return@apply
                }

                clickCount()
                commentCount()
                engagement()
                impressionCount()
                likeCount()
                shareCount()
                timeWatched()
                timeWatchedForVideoViews()
                videoView()
                viewer()
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
                (if (clickCount.asKnown() == null) 0 else 1) +
                    (if (commentCount.asKnown() == null) 0 else 1) +
                    (if (engagement.asKnown() == null) 0 else 1) +
                    (if (impressionCount.asKnown() == null) 0 else 1) +
                    (if (likeCount.asKnown() == null) 0 else 1) +
                    (if (shareCount.asKnown() == null) 0 else 1) +
                    (if (timeWatched.asKnown() == null) 0 else 1) +
                    (if (timeWatchedForVideoViews.asKnown() == null) 0 else 1) +
                    (if (videoView.asKnown() == null) 0 else 1) +
                    (if (viewer.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LinkedInPostMetricsDto &&
                    clickCount == other.clickCount &&
                    commentCount == other.commentCount &&
                    engagement == other.engagement &&
                    impressionCount == other.impressionCount &&
                    likeCount == other.likeCount &&
                    shareCount == other.shareCount &&
                    timeWatched == other.timeWatched &&
                    timeWatchedForVideoViews == other.timeWatchedForVideoViews &&
                    videoView == other.videoView &&
                    viewer == other.viewer &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    clickCount,
                    commentCount,
                    engagement,
                    impressionCount,
                    likeCount,
                    shareCount,
                    timeWatched,
                    timeWatchedForVideoViews,
                    videoView,
                    viewer,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LinkedInPostMetricsDto{clickCount=$clickCount, commentCount=$commentCount, engagement=$engagement, impressionCount=$impressionCount, likeCount=$likeCount, shareCount=$shareCount, timeWatched=$timeWatched, timeWatchedForVideoViews=$timeWatchedForVideoViews, videoView=$videoView, viewer=$viewer, additionalProperties=$additionalProperties}"
        }

        class BlueskyPostMetricsDto
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val likeCount: JsonField<Double>,
            private val quoteCount: JsonField<Double>,
            private val replyCount: JsonField<Double>,
            private val repostCount: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("likeCount")
                @ExcludeMissing
                likeCount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quoteCount")
                @ExcludeMissing
                quoteCount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("replyCount")
                @ExcludeMissing
                replyCount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("repostCount")
                @ExcludeMissing
                repostCount: JsonField<Double> = JsonMissing.of(),
            ) : this(likeCount, quoteCount, replyCount, repostCount, mutableMapOf())

            /**
             * Number of likes on the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun likeCount(): Double = likeCount.getRequired("likeCount")

            /**
             * Number of quotes of the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun quoteCount(): Double = quoteCount.getRequired("quoteCount")

            /**
             * Number of replies on the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun replyCount(): Double = replyCount.getRequired("replyCount")

            /**
             * Number of reposts of the post
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun repostCount(): Double = repostCount.getRequired("repostCount")

            /**
             * Returns the raw JSON value of [likeCount].
             *
             * Unlike [likeCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("likeCount")
            @ExcludeMissing
            fun _likeCount(): JsonField<Double> = likeCount

            /**
             * Returns the raw JSON value of [quoteCount].
             *
             * Unlike [quoteCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quoteCount")
            @ExcludeMissing
            fun _quoteCount(): JsonField<Double> = quoteCount

            /**
             * Returns the raw JSON value of [replyCount].
             *
             * Unlike [replyCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("replyCount")
            @ExcludeMissing
            fun _replyCount(): JsonField<Double> = replyCount

            /**
             * Returns the raw JSON value of [repostCount].
             *
             * Unlike [repostCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("repostCount")
            @ExcludeMissing
            fun _repostCount(): JsonField<Double> = repostCount

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
                 * Returns a mutable builder for constructing an instance of
                 * [BlueskyPostMetricsDto].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .likeCount()
                 * .quoteCount()
                 * .replyCount()
                 * .repostCount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [BlueskyPostMetricsDto]. */
            class Builder internal constructor() {

                private var likeCount: JsonField<Double>? = null
                private var quoteCount: JsonField<Double>? = null
                private var replyCount: JsonField<Double>? = null
                private var repostCount: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(blueskyPostMetricsDto: BlueskyPostMetricsDto) = apply {
                    likeCount = blueskyPostMetricsDto.likeCount
                    quoteCount = blueskyPostMetricsDto.quoteCount
                    replyCount = blueskyPostMetricsDto.replyCount
                    repostCount = blueskyPostMetricsDto.repostCount
                    additionalProperties = blueskyPostMetricsDto.additionalProperties.toMutableMap()
                }

                /** Number of likes on the post */
                fun likeCount(likeCount: Double) = likeCount(JsonField.of(likeCount))

                /**
                 * Sets [Builder.likeCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.likeCount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun likeCount(likeCount: JsonField<Double>) = apply { this.likeCount = likeCount }

                /** Number of quotes of the post */
                fun quoteCount(quoteCount: Double) = quoteCount(JsonField.of(quoteCount))

                /**
                 * Sets [Builder.quoteCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quoteCount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quoteCount(quoteCount: JsonField<Double>) = apply {
                    this.quoteCount = quoteCount
                }

                /** Number of replies on the post */
                fun replyCount(replyCount: Double) = replyCount(JsonField.of(replyCount))

                /**
                 * Sets [Builder.replyCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.replyCount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun replyCount(replyCount: JsonField<Double>) = apply {
                    this.replyCount = replyCount
                }

                /** Number of reposts of the post */
                fun repostCount(repostCount: Double) = repostCount(JsonField.of(repostCount))

                /**
                 * Sets [Builder.repostCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.repostCount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun repostCount(repostCount: JsonField<Double>) = apply {
                    this.repostCount = repostCount
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
                 * Returns an immutable instance of [BlueskyPostMetricsDto].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .likeCount()
                 * .quoteCount()
                 * .replyCount()
                 * .repostCount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BlueskyPostMetricsDto =
                    BlueskyPostMetricsDto(
                        checkRequired("likeCount", likeCount),
                        checkRequired("quoteCount", quoteCount),
                        checkRequired("replyCount", replyCount),
                        checkRequired("repostCount", repostCount),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws PostForMeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): BlueskyPostMetricsDto = apply {
                if (validated) {
                    return@apply
                }

                likeCount()
                quoteCount()
                replyCount()
                repostCount()
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
                (if (likeCount.asKnown() == null) 0 else 1) +
                    (if (quoteCount.asKnown() == null) 0 else 1) +
                    (if (replyCount.asKnown() == null) 0 else 1) +
                    (if (repostCount.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BlueskyPostMetricsDto &&
                    likeCount == other.likeCount &&
                    quoteCount == other.quoteCount &&
                    replyCount == other.replyCount &&
                    repostCount == other.repostCount &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(likeCount, quoteCount, replyCount, repostCount, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BlueskyPostMetricsDto{likeCount=$likeCount, quoteCount=$quoteCount, replyCount=$replyCount, repostCount=$repostCount, additionalProperties=$additionalProperties}"
        }

        class PinterestPostMetricsDto
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val _90d: JsonField<_90d>,
            private val lifetimeMetrics: JsonField<LifetimeMetrics>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("90d") @ExcludeMissing _90d: JsonField<_90d> = JsonMissing.of(),
                @JsonProperty("lifetime_metrics")
                @ExcludeMissing
                lifetimeMetrics: JsonField<LifetimeMetrics> = JsonMissing.of(),
            ) : this(_90d, lifetimeMetrics, mutableMapOf())

            /**
             * Last 90 days of Pin metrics
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun _90d(): _90d? = _90d.getNullable("90d")

            /**
             * Lifetime Pin metrics
             *
             * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun lifetimeMetrics(): LifetimeMetrics? =
                lifetimeMetrics.getNullable("lifetime_metrics")

            /**
             * Returns the raw JSON value of [_90d].
             *
             * Unlike [_90d], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("90d") @ExcludeMissing fun __90d(): JsonField<_90d> = _90d

            /**
             * Returns the raw JSON value of [lifetimeMetrics].
             *
             * Unlike [lifetimeMetrics], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("lifetime_metrics")
            @ExcludeMissing
            fun _lifetimeMetrics(): JsonField<LifetimeMetrics> = lifetimeMetrics

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
                 * Returns a mutable builder for constructing an instance of
                 * [PinterestPostMetricsDto].
                 */
                fun builder() = Builder()
            }

            /** A builder for [PinterestPostMetricsDto]. */
            class Builder internal constructor() {

                private var _90d: JsonField<_90d> = JsonMissing.of()
                private var lifetimeMetrics: JsonField<LifetimeMetrics> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(pinterestPostMetricsDto: PinterestPostMetricsDto) = apply {
                    _90d = pinterestPostMetricsDto._90d
                    lifetimeMetrics = pinterestPostMetricsDto.lifetimeMetrics
                    additionalProperties =
                        pinterestPostMetricsDto.additionalProperties.toMutableMap()
                }

                /** Last 90 days of Pin metrics */
                fun _90d(_90d: _90d) = _90d(JsonField.of(_90d))

                /**
                 * Sets [Builder._90d] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder._90d] with a well-typed [_90d] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun _90d(_90d: JsonField<_90d>) = apply { this._90d = _90d }

                /** Lifetime Pin metrics */
                fun lifetimeMetrics(lifetimeMetrics: LifetimeMetrics) =
                    lifetimeMetrics(JsonField.of(lifetimeMetrics))

                /**
                 * Sets [Builder.lifetimeMetrics] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lifetimeMetrics] with a well-typed
                 * [LifetimeMetrics] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun lifetimeMetrics(lifetimeMetrics: JsonField<LifetimeMetrics>) = apply {
                    this.lifetimeMetrics = lifetimeMetrics
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
                 * Returns an immutable instance of [PinterestPostMetricsDto].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PinterestPostMetricsDto =
                    PinterestPostMetricsDto(
                        _90d,
                        lifetimeMetrics,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws PostForMeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PinterestPostMetricsDto = apply {
                if (validated) {
                    return@apply
                }

                _90d()?.validate()
                lifetimeMetrics()?.validate()
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
                (_90d.asKnown()?.validity() ?: 0) + (lifetimeMetrics.asKnown()?.validity() ?: 0)

            /** Last 90 days of Pin metrics */
            class _90d
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val comment: JsonField<Double>,
                private val impression: JsonField<Double>,
                private val lastUpdated: JsonField<String>,
                private val outboundClick: JsonField<Double>,
                private val pinClick: JsonField<Double>,
                private val profileVisit: JsonValue,
                private val reaction: JsonField<Double>,
                private val save: JsonField<Double>,
                private val userFollow: JsonValue,
                private val video10sViews: JsonField<Double>,
                private val videoAverageTime: JsonField<Double>,
                private val videoP95Views: JsonField<Double>,
                private val videoTotalTime: JsonField<Double>,
                private val videoViews: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("comment")
                    @ExcludeMissing
                    comment: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("impression")
                    @ExcludeMissing
                    impression: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("last_updated")
                    @ExcludeMissing
                    lastUpdated: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("outbound_click")
                    @ExcludeMissing
                    outboundClick: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("pin_click")
                    @ExcludeMissing
                    pinClick: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("profile_visit")
                    @ExcludeMissing
                    profileVisit: JsonValue = JsonMissing.of(),
                    @JsonProperty("reaction")
                    @ExcludeMissing
                    reaction: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("save")
                    @ExcludeMissing
                    save: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("user_follow")
                    @ExcludeMissing
                    userFollow: JsonValue = JsonMissing.of(),
                    @JsonProperty("video_10s_views")
                    @ExcludeMissing
                    video10sViews: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("video_average_time")
                    @ExcludeMissing
                    videoAverageTime: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("video_p95_views")
                    @ExcludeMissing
                    videoP95Views: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("video_total_time")
                    @ExcludeMissing
                    videoTotalTime: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("video_views")
                    @ExcludeMissing
                    videoViews: JsonField<Double> = JsonMissing.of(),
                ) : this(
                    comment,
                    impression,
                    lastUpdated,
                    outboundClick,
                    pinClick,
                    profileVisit,
                    reaction,
                    save,
                    userFollow,
                    video10sViews,
                    videoAverageTime,
                    videoP95Views,
                    videoTotalTime,
                    videoViews,
                    mutableMapOf(),
                )

                /**
                 * Number of comments on the Pin
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun comment(): Double? = comment.getNullable("comment")

                /**
                 * Number of times the Pin was shown (impressions)
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun impression(): Double? = impression.getNullable("impression")

                /**
                 * The last time Pinterest updated these metrics
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun lastUpdated(): String? = lastUpdated.getNullable("last_updated")

                /**
                 * Number of clicks from the Pin to an external destination (outbound clicks)
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun outboundClick(): Double? = outboundClick.getNullable("outbound_click")

                /**
                 * Number of clicks on the Pin to view it in closeup (Pin clicks)
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pinClick(): Double? = pinClick.getNullable("pin_click")

                /**
                 * Number of visits to the author's profile driven from the Pin
                 *
                 * This arbitrary value can be deserialized into a custom type using the `convert`
                 * method:
                 * ```kotlin
                 * val myObject: MyClass = _90d.profileVisit().convert(MyClass::class.java)
                 * ```
                 */
                @JsonProperty("profile_visit")
                @ExcludeMissing
                fun _profileVisit(): JsonValue = profileVisit

                /**
                 * Total number of reactions on the Pin
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun reaction(): Double? = reaction.getNullable("reaction")

                /**
                 * Number of saves of the Pin
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun save(): Double? = save.getNullable("save")

                /**
                 * Number of follows driven from the Pin
                 *
                 * This arbitrary value can be deserialized into a custom type using the `convert`
                 * method:
                 * ```kotlin
                 * val myObject: MyClass = _90d.userFollow().convert(MyClass::class.java)
                 * ```
                 */
                @JsonProperty("user_follow")
                @ExcludeMissing
                fun _userFollow(): JsonValue = userFollow

                /**
                 * Number of video views of at least 10 seconds
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun video10sViews(): Double? = video10sViews.getNullable("video_10s_views")

                /**
                 * Average watch time for the video
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun videoAverageTime(): Double? = videoAverageTime.getNullable("video_average_time")

                /**
                 * Number of video views that reached 95% completion
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun videoP95Views(): Double? = videoP95Views.getNullable("video_p95_views")

                /**
                 * Total watch time for the video
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun videoTotalTime(): Double? = videoTotalTime.getNullable("video_total_time")

                /**
                 * Number of video views
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun videoViews(): Double? = videoViews.getNullable("video_views")

                /**
                 * Returns the raw JSON value of [comment].
                 *
                 * Unlike [comment], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<Double> = comment

                /**
                 * Returns the raw JSON value of [impression].
                 *
                 * Unlike [impression], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("impression")
                @ExcludeMissing
                fun _impression(): JsonField<Double> = impression

                /**
                 * Returns the raw JSON value of [lastUpdated].
                 *
                 * Unlike [lastUpdated], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("last_updated")
                @ExcludeMissing
                fun _lastUpdated(): JsonField<String> = lastUpdated

                /**
                 * Returns the raw JSON value of [outboundClick].
                 *
                 * Unlike [outboundClick], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("outbound_click")
                @ExcludeMissing
                fun _outboundClick(): JsonField<Double> = outboundClick

                /**
                 * Returns the raw JSON value of [pinClick].
                 *
                 * Unlike [pinClick], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("pin_click")
                @ExcludeMissing
                fun _pinClick(): JsonField<Double> = pinClick

                /**
                 * Returns the raw JSON value of [reaction].
                 *
                 * Unlike [reaction], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("reaction")
                @ExcludeMissing
                fun _reaction(): JsonField<Double> = reaction

                /**
                 * Returns the raw JSON value of [save].
                 *
                 * Unlike [save], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("save") @ExcludeMissing fun _save(): JsonField<Double> = save

                /**
                 * Returns the raw JSON value of [video10sViews].
                 *
                 * Unlike [video10sViews], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("video_10s_views")
                @ExcludeMissing
                fun _video10sViews(): JsonField<Double> = video10sViews

                /**
                 * Returns the raw JSON value of [videoAverageTime].
                 *
                 * Unlike [videoAverageTime], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("video_average_time")
                @ExcludeMissing
                fun _videoAverageTime(): JsonField<Double> = videoAverageTime

                /**
                 * Returns the raw JSON value of [videoP95Views].
                 *
                 * Unlike [videoP95Views], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("video_p95_views")
                @ExcludeMissing
                fun _videoP95Views(): JsonField<Double> = videoP95Views

                /**
                 * Returns the raw JSON value of [videoTotalTime].
                 *
                 * Unlike [videoTotalTime], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("video_total_time")
                @ExcludeMissing
                fun _videoTotalTime(): JsonField<Double> = videoTotalTime

                /**
                 * Returns the raw JSON value of [videoViews].
                 *
                 * Unlike [videoViews], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("video_views")
                @ExcludeMissing
                fun _videoViews(): JsonField<Double> = videoViews

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

                    /** Returns a mutable builder for constructing an instance of [_90d]. */
                    fun builder() = Builder()
                }

                /** A builder for [_90d]. */
                class Builder internal constructor() {

                    private var comment: JsonField<Double> = JsonMissing.of()
                    private var impression: JsonField<Double> = JsonMissing.of()
                    private var lastUpdated: JsonField<String> = JsonMissing.of()
                    private var outboundClick: JsonField<Double> = JsonMissing.of()
                    private var pinClick: JsonField<Double> = JsonMissing.of()
                    private var profileVisit: JsonValue = JsonMissing.of()
                    private var reaction: JsonField<Double> = JsonMissing.of()
                    private var save: JsonField<Double> = JsonMissing.of()
                    private var userFollow: JsonValue = JsonMissing.of()
                    private var video10sViews: JsonField<Double> = JsonMissing.of()
                    private var videoAverageTime: JsonField<Double> = JsonMissing.of()
                    private var videoP95Views: JsonField<Double> = JsonMissing.of()
                    private var videoTotalTime: JsonField<Double> = JsonMissing.of()
                    private var videoViews: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(_90d: _90d) = apply {
                        comment = _90d.comment
                        impression = _90d.impression
                        lastUpdated = _90d.lastUpdated
                        outboundClick = _90d.outboundClick
                        pinClick = _90d.pinClick
                        profileVisit = _90d.profileVisit
                        reaction = _90d.reaction
                        save = _90d.save
                        userFollow = _90d.userFollow
                        video10sViews = _90d.video10sViews
                        videoAverageTime = _90d.videoAverageTime
                        videoP95Views = _90d.videoP95Views
                        videoTotalTime = _90d.videoTotalTime
                        videoViews = _90d.videoViews
                        additionalProperties = _90d.additionalProperties.toMutableMap()
                    }

                    /** Number of comments on the Pin */
                    fun comment(comment: Double) = comment(JsonField.of(comment))

                    /**
                     * Sets [Builder.comment] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.comment] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun comment(comment: JsonField<Double>) = apply { this.comment = comment }

                    /** Number of times the Pin was shown (impressions) */
                    fun impression(impression: Double) = impression(JsonField.of(impression))

                    /**
                     * Sets [Builder.impression] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.impression] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun impression(impression: JsonField<Double>) = apply {
                        this.impression = impression
                    }

                    /** The last time Pinterest updated these metrics */
                    fun lastUpdated(lastUpdated: String) = lastUpdated(JsonField.of(lastUpdated))

                    /**
                     * Sets [Builder.lastUpdated] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lastUpdated] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun lastUpdated(lastUpdated: JsonField<String>) = apply {
                        this.lastUpdated = lastUpdated
                    }

                    /**
                     * Number of clicks from the Pin to an external destination (outbound clicks)
                     */
                    fun outboundClick(outboundClick: Double) =
                        outboundClick(JsonField.of(outboundClick))

                    /**
                     * Sets [Builder.outboundClick] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.outboundClick] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun outboundClick(outboundClick: JsonField<Double>) = apply {
                        this.outboundClick = outboundClick
                    }

                    /** Number of clicks on the Pin to view it in closeup (Pin clicks) */
                    fun pinClick(pinClick: Double) = pinClick(JsonField.of(pinClick))

                    /**
                     * Sets [Builder.pinClick] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pinClick] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pinClick(pinClick: JsonField<Double>) = apply { this.pinClick = pinClick }

                    /** Number of visits to the author's profile driven from the Pin */
                    fun profileVisit(profileVisit: JsonValue) = apply {
                        this.profileVisit = profileVisit
                    }

                    /** Total number of reactions on the Pin */
                    fun reaction(reaction: Double) = reaction(JsonField.of(reaction))

                    /**
                     * Sets [Builder.reaction] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reaction] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun reaction(reaction: JsonField<Double>) = apply { this.reaction = reaction }

                    /** Number of saves of the Pin */
                    fun save(save: Double) = save(JsonField.of(save))

                    /**
                     * Sets [Builder.save] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.save] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun save(save: JsonField<Double>) = apply { this.save = save }

                    /** Number of follows driven from the Pin */
                    fun userFollow(userFollow: JsonValue) = apply { this.userFollow = userFollow }

                    /** Number of video views of at least 10 seconds */
                    fun video10sViews(video10sViews: Double) =
                        video10sViews(JsonField.of(video10sViews))

                    /**
                     * Sets [Builder.video10sViews] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.video10sViews] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun video10sViews(video10sViews: JsonField<Double>) = apply {
                        this.video10sViews = video10sViews
                    }

                    /** Average watch time for the video */
                    fun videoAverageTime(videoAverageTime: Double) =
                        videoAverageTime(JsonField.of(videoAverageTime))

                    /**
                     * Sets [Builder.videoAverageTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.videoAverageTime] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun videoAverageTime(videoAverageTime: JsonField<Double>) = apply {
                        this.videoAverageTime = videoAverageTime
                    }

                    /** Number of video views that reached 95% completion */
                    fun videoP95Views(videoP95Views: Double) =
                        videoP95Views(JsonField.of(videoP95Views))

                    /**
                     * Sets [Builder.videoP95Views] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.videoP95Views] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun videoP95Views(videoP95Views: JsonField<Double>) = apply {
                        this.videoP95Views = videoP95Views
                    }

                    /** Total watch time for the video */
                    fun videoTotalTime(videoTotalTime: Double) =
                        videoTotalTime(JsonField.of(videoTotalTime))

                    /**
                     * Sets [Builder.videoTotalTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.videoTotalTime] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun videoTotalTime(videoTotalTime: JsonField<Double>) = apply {
                        this.videoTotalTime = videoTotalTime
                    }

                    /** Number of video views */
                    fun videoViews(videoViews: Double) = videoViews(JsonField.of(videoViews))

                    /**
                     * Sets [Builder.videoViews] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.videoViews] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun videoViews(videoViews: JsonField<Double>) = apply {
                        this.videoViews = videoViews
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
                     * Returns an immutable instance of [_90d].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): _90d =
                        _90d(
                            comment,
                            impression,
                            lastUpdated,
                            outboundClick,
                            pinClick,
                            profileVisit,
                            reaction,
                            save,
                            userFollow,
                            video10sViews,
                            videoAverageTime,
                            videoP95Views,
                            videoTotalTime,
                            videoViews,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PostForMeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): _90d = apply {
                    if (validated) {
                        return@apply
                    }

                    comment()
                    impression()
                    lastUpdated()
                    outboundClick()
                    pinClick()
                    reaction()
                    save()
                    video10sViews()
                    videoAverageTime()
                    videoP95Views()
                    videoTotalTime()
                    videoViews()
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
                    (if (comment.asKnown() == null) 0 else 1) +
                        (if (impression.asKnown() == null) 0 else 1) +
                        (if (lastUpdated.asKnown() == null) 0 else 1) +
                        (if (outboundClick.asKnown() == null) 0 else 1) +
                        (if (pinClick.asKnown() == null) 0 else 1) +
                        (if (reaction.asKnown() == null) 0 else 1) +
                        (if (save.asKnown() == null) 0 else 1) +
                        (if (video10sViews.asKnown() == null) 0 else 1) +
                        (if (videoAverageTime.asKnown() == null) 0 else 1) +
                        (if (videoP95Views.asKnown() == null) 0 else 1) +
                        (if (videoTotalTime.asKnown() == null) 0 else 1) +
                        (if (videoViews.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is _90d &&
                        comment == other.comment &&
                        impression == other.impression &&
                        lastUpdated == other.lastUpdated &&
                        outboundClick == other.outboundClick &&
                        pinClick == other.pinClick &&
                        profileVisit == other.profileVisit &&
                        reaction == other.reaction &&
                        save == other.save &&
                        userFollow == other.userFollow &&
                        video10sViews == other.video10sViews &&
                        videoAverageTime == other.videoAverageTime &&
                        videoP95Views == other.videoP95Views &&
                        videoTotalTime == other.videoTotalTime &&
                        videoViews == other.videoViews &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        comment,
                        impression,
                        lastUpdated,
                        outboundClick,
                        pinClick,
                        profileVisit,
                        reaction,
                        save,
                        userFollow,
                        video10sViews,
                        videoAverageTime,
                        videoP95Views,
                        videoTotalTime,
                        videoViews,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "_90d{comment=$comment, impression=$impression, lastUpdated=$lastUpdated, outboundClick=$outboundClick, pinClick=$pinClick, profileVisit=$profileVisit, reaction=$reaction, save=$save, userFollow=$userFollow, video10sViews=$video10sViews, videoAverageTime=$videoAverageTime, videoP95Views=$videoP95Views, videoTotalTime=$videoTotalTime, videoViews=$videoViews, additionalProperties=$additionalProperties}"
            }

            /** Lifetime Pin metrics */
            class LifetimeMetrics
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val comment: JsonField<Double>,
                private val impression: JsonField<Double>,
                private val lastUpdated: JsonField<String>,
                private val outboundClick: JsonField<Double>,
                private val pinClick: JsonField<Double>,
                private val profileVisit: JsonValue,
                private val reaction: JsonField<Double>,
                private val save: JsonField<Double>,
                private val userFollow: JsonValue,
                private val video10sViews: JsonField<Double>,
                private val videoAverageTime: JsonField<Double>,
                private val videoP95Views: JsonField<Double>,
                private val videoTotalTime: JsonField<Double>,
                private val videoViews: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("comment")
                    @ExcludeMissing
                    comment: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("impression")
                    @ExcludeMissing
                    impression: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("last_updated")
                    @ExcludeMissing
                    lastUpdated: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("outbound_click")
                    @ExcludeMissing
                    outboundClick: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("pin_click")
                    @ExcludeMissing
                    pinClick: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("profile_visit")
                    @ExcludeMissing
                    profileVisit: JsonValue = JsonMissing.of(),
                    @JsonProperty("reaction")
                    @ExcludeMissing
                    reaction: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("save")
                    @ExcludeMissing
                    save: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("user_follow")
                    @ExcludeMissing
                    userFollow: JsonValue = JsonMissing.of(),
                    @JsonProperty("video_10s_views")
                    @ExcludeMissing
                    video10sViews: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("video_average_time")
                    @ExcludeMissing
                    videoAverageTime: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("video_p95_views")
                    @ExcludeMissing
                    videoP95Views: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("video_total_time")
                    @ExcludeMissing
                    videoTotalTime: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("video_views")
                    @ExcludeMissing
                    videoViews: JsonField<Double> = JsonMissing.of(),
                ) : this(
                    comment,
                    impression,
                    lastUpdated,
                    outboundClick,
                    pinClick,
                    profileVisit,
                    reaction,
                    save,
                    userFollow,
                    video10sViews,
                    videoAverageTime,
                    videoP95Views,
                    videoTotalTime,
                    videoViews,
                    mutableMapOf(),
                )

                /**
                 * Number of comments on the Pin
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun comment(): Double? = comment.getNullable("comment")

                /**
                 * Number of times the Pin was shown (impressions)
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun impression(): Double? = impression.getNullable("impression")

                /**
                 * The last time Pinterest updated these metrics
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun lastUpdated(): String? = lastUpdated.getNullable("last_updated")

                /**
                 * Number of clicks from the Pin to an external destination (outbound clicks)
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun outboundClick(): Double? = outboundClick.getNullable("outbound_click")

                /**
                 * Number of clicks on the Pin to view it in closeup (Pin clicks)
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pinClick(): Double? = pinClick.getNullable("pin_click")

                /**
                 * Number of visits to the author's profile driven from the Pin
                 *
                 * This arbitrary value can be deserialized into a custom type using the `convert`
                 * method:
                 * ```kotlin
                 * val myObject: MyClass = lifetimeMetrics.profileVisit().convert(MyClass::class.java)
                 * ```
                 */
                @JsonProperty("profile_visit")
                @ExcludeMissing
                fun _profileVisit(): JsonValue = profileVisit

                /**
                 * Total number of reactions on the Pin
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun reaction(): Double? = reaction.getNullable("reaction")

                /**
                 * Number of saves of the Pin
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun save(): Double? = save.getNullable("save")

                /**
                 * Number of follows driven from the Pin
                 *
                 * This arbitrary value can be deserialized into a custom type using the `convert`
                 * method:
                 * ```kotlin
                 * val myObject: MyClass = lifetimeMetrics.userFollow().convert(MyClass::class.java)
                 * ```
                 */
                @JsonProperty("user_follow")
                @ExcludeMissing
                fun _userFollow(): JsonValue = userFollow

                /**
                 * Number of video views of at least 10 seconds
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun video10sViews(): Double? = video10sViews.getNullable("video_10s_views")

                /**
                 * Average watch time for the video
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun videoAverageTime(): Double? = videoAverageTime.getNullable("video_average_time")

                /**
                 * Number of video views that reached 95% completion
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun videoP95Views(): Double? = videoP95Views.getNullable("video_p95_views")

                /**
                 * Total watch time for the video
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun videoTotalTime(): Double? = videoTotalTime.getNullable("video_total_time")

                /**
                 * Number of video views
                 *
                 * @throws PostForMeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun videoViews(): Double? = videoViews.getNullable("video_views")

                /**
                 * Returns the raw JSON value of [comment].
                 *
                 * Unlike [comment], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<Double> = comment

                /**
                 * Returns the raw JSON value of [impression].
                 *
                 * Unlike [impression], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("impression")
                @ExcludeMissing
                fun _impression(): JsonField<Double> = impression

                /**
                 * Returns the raw JSON value of [lastUpdated].
                 *
                 * Unlike [lastUpdated], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("last_updated")
                @ExcludeMissing
                fun _lastUpdated(): JsonField<String> = lastUpdated

                /**
                 * Returns the raw JSON value of [outboundClick].
                 *
                 * Unlike [outboundClick], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("outbound_click")
                @ExcludeMissing
                fun _outboundClick(): JsonField<Double> = outboundClick

                /**
                 * Returns the raw JSON value of [pinClick].
                 *
                 * Unlike [pinClick], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("pin_click")
                @ExcludeMissing
                fun _pinClick(): JsonField<Double> = pinClick

                /**
                 * Returns the raw JSON value of [reaction].
                 *
                 * Unlike [reaction], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("reaction")
                @ExcludeMissing
                fun _reaction(): JsonField<Double> = reaction

                /**
                 * Returns the raw JSON value of [save].
                 *
                 * Unlike [save], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("save") @ExcludeMissing fun _save(): JsonField<Double> = save

                /**
                 * Returns the raw JSON value of [video10sViews].
                 *
                 * Unlike [video10sViews], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("video_10s_views")
                @ExcludeMissing
                fun _video10sViews(): JsonField<Double> = video10sViews

                /**
                 * Returns the raw JSON value of [videoAverageTime].
                 *
                 * Unlike [videoAverageTime], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("video_average_time")
                @ExcludeMissing
                fun _videoAverageTime(): JsonField<Double> = videoAverageTime

                /**
                 * Returns the raw JSON value of [videoP95Views].
                 *
                 * Unlike [videoP95Views], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("video_p95_views")
                @ExcludeMissing
                fun _videoP95Views(): JsonField<Double> = videoP95Views

                /**
                 * Returns the raw JSON value of [videoTotalTime].
                 *
                 * Unlike [videoTotalTime], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("video_total_time")
                @ExcludeMissing
                fun _videoTotalTime(): JsonField<Double> = videoTotalTime

                /**
                 * Returns the raw JSON value of [videoViews].
                 *
                 * Unlike [videoViews], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("video_views")
                @ExcludeMissing
                fun _videoViews(): JsonField<Double> = videoViews

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
                     * Returns a mutable builder for constructing an instance of [LifetimeMetrics].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [LifetimeMetrics]. */
                class Builder internal constructor() {

                    private var comment: JsonField<Double> = JsonMissing.of()
                    private var impression: JsonField<Double> = JsonMissing.of()
                    private var lastUpdated: JsonField<String> = JsonMissing.of()
                    private var outboundClick: JsonField<Double> = JsonMissing.of()
                    private var pinClick: JsonField<Double> = JsonMissing.of()
                    private var profileVisit: JsonValue = JsonMissing.of()
                    private var reaction: JsonField<Double> = JsonMissing.of()
                    private var save: JsonField<Double> = JsonMissing.of()
                    private var userFollow: JsonValue = JsonMissing.of()
                    private var video10sViews: JsonField<Double> = JsonMissing.of()
                    private var videoAverageTime: JsonField<Double> = JsonMissing.of()
                    private var videoP95Views: JsonField<Double> = JsonMissing.of()
                    private var videoTotalTime: JsonField<Double> = JsonMissing.of()
                    private var videoViews: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(lifetimeMetrics: LifetimeMetrics) = apply {
                        comment = lifetimeMetrics.comment
                        impression = lifetimeMetrics.impression
                        lastUpdated = lifetimeMetrics.lastUpdated
                        outboundClick = lifetimeMetrics.outboundClick
                        pinClick = lifetimeMetrics.pinClick
                        profileVisit = lifetimeMetrics.profileVisit
                        reaction = lifetimeMetrics.reaction
                        save = lifetimeMetrics.save
                        userFollow = lifetimeMetrics.userFollow
                        video10sViews = lifetimeMetrics.video10sViews
                        videoAverageTime = lifetimeMetrics.videoAverageTime
                        videoP95Views = lifetimeMetrics.videoP95Views
                        videoTotalTime = lifetimeMetrics.videoTotalTime
                        videoViews = lifetimeMetrics.videoViews
                        additionalProperties = lifetimeMetrics.additionalProperties.toMutableMap()
                    }

                    /** Number of comments on the Pin */
                    fun comment(comment: Double) = comment(JsonField.of(comment))

                    /**
                     * Sets [Builder.comment] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.comment] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun comment(comment: JsonField<Double>) = apply { this.comment = comment }

                    /** Number of times the Pin was shown (impressions) */
                    fun impression(impression: Double) = impression(JsonField.of(impression))

                    /**
                     * Sets [Builder.impression] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.impression] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun impression(impression: JsonField<Double>) = apply {
                        this.impression = impression
                    }

                    /** The last time Pinterest updated these metrics */
                    fun lastUpdated(lastUpdated: String) = lastUpdated(JsonField.of(lastUpdated))

                    /**
                     * Sets [Builder.lastUpdated] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lastUpdated] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun lastUpdated(lastUpdated: JsonField<String>) = apply {
                        this.lastUpdated = lastUpdated
                    }

                    /**
                     * Number of clicks from the Pin to an external destination (outbound clicks)
                     */
                    fun outboundClick(outboundClick: Double) =
                        outboundClick(JsonField.of(outboundClick))

                    /**
                     * Sets [Builder.outboundClick] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.outboundClick] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun outboundClick(outboundClick: JsonField<Double>) = apply {
                        this.outboundClick = outboundClick
                    }

                    /** Number of clicks on the Pin to view it in closeup (Pin clicks) */
                    fun pinClick(pinClick: Double) = pinClick(JsonField.of(pinClick))

                    /**
                     * Sets [Builder.pinClick] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pinClick] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pinClick(pinClick: JsonField<Double>) = apply { this.pinClick = pinClick }

                    /** Number of visits to the author's profile driven from the Pin */
                    fun profileVisit(profileVisit: JsonValue) = apply {
                        this.profileVisit = profileVisit
                    }

                    /** Total number of reactions on the Pin */
                    fun reaction(reaction: Double) = reaction(JsonField.of(reaction))

                    /**
                     * Sets [Builder.reaction] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reaction] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun reaction(reaction: JsonField<Double>) = apply { this.reaction = reaction }

                    /** Number of saves of the Pin */
                    fun save(save: Double) = save(JsonField.of(save))

                    /**
                     * Sets [Builder.save] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.save] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun save(save: JsonField<Double>) = apply { this.save = save }

                    /** Number of follows driven from the Pin */
                    fun userFollow(userFollow: JsonValue) = apply { this.userFollow = userFollow }

                    /** Number of video views of at least 10 seconds */
                    fun video10sViews(video10sViews: Double) =
                        video10sViews(JsonField.of(video10sViews))

                    /**
                     * Sets [Builder.video10sViews] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.video10sViews] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun video10sViews(video10sViews: JsonField<Double>) = apply {
                        this.video10sViews = video10sViews
                    }

                    /** Average watch time for the video */
                    fun videoAverageTime(videoAverageTime: Double) =
                        videoAverageTime(JsonField.of(videoAverageTime))

                    /**
                     * Sets [Builder.videoAverageTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.videoAverageTime] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun videoAverageTime(videoAverageTime: JsonField<Double>) = apply {
                        this.videoAverageTime = videoAverageTime
                    }

                    /** Number of video views that reached 95% completion */
                    fun videoP95Views(videoP95Views: Double) =
                        videoP95Views(JsonField.of(videoP95Views))

                    /**
                     * Sets [Builder.videoP95Views] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.videoP95Views] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun videoP95Views(videoP95Views: JsonField<Double>) = apply {
                        this.videoP95Views = videoP95Views
                    }

                    /** Total watch time for the video */
                    fun videoTotalTime(videoTotalTime: Double) =
                        videoTotalTime(JsonField.of(videoTotalTime))

                    /**
                     * Sets [Builder.videoTotalTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.videoTotalTime] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun videoTotalTime(videoTotalTime: JsonField<Double>) = apply {
                        this.videoTotalTime = videoTotalTime
                    }

                    /** Number of video views */
                    fun videoViews(videoViews: Double) = videoViews(JsonField.of(videoViews))

                    /**
                     * Sets [Builder.videoViews] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.videoViews] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun videoViews(videoViews: JsonField<Double>) = apply {
                        this.videoViews = videoViews
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
                     * Returns an immutable instance of [LifetimeMetrics].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): LifetimeMetrics =
                        LifetimeMetrics(
                            comment,
                            impression,
                            lastUpdated,
                            outboundClick,
                            pinClick,
                            profileVisit,
                            reaction,
                            save,
                            userFollow,
                            video10sViews,
                            videoAverageTime,
                            videoP95Views,
                            videoTotalTime,
                            videoViews,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PostForMeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): LifetimeMetrics = apply {
                    if (validated) {
                        return@apply
                    }

                    comment()
                    impression()
                    lastUpdated()
                    outboundClick()
                    pinClick()
                    reaction()
                    save()
                    video10sViews()
                    videoAverageTime()
                    videoP95Views()
                    videoTotalTime()
                    videoViews()
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
                    (if (comment.asKnown() == null) 0 else 1) +
                        (if (impression.asKnown() == null) 0 else 1) +
                        (if (lastUpdated.asKnown() == null) 0 else 1) +
                        (if (outboundClick.asKnown() == null) 0 else 1) +
                        (if (pinClick.asKnown() == null) 0 else 1) +
                        (if (reaction.asKnown() == null) 0 else 1) +
                        (if (save.asKnown() == null) 0 else 1) +
                        (if (video10sViews.asKnown() == null) 0 else 1) +
                        (if (videoAverageTime.asKnown() == null) 0 else 1) +
                        (if (videoP95Views.asKnown() == null) 0 else 1) +
                        (if (videoTotalTime.asKnown() == null) 0 else 1) +
                        (if (videoViews.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LifetimeMetrics &&
                        comment == other.comment &&
                        impression == other.impression &&
                        lastUpdated == other.lastUpdated &&
                        outboundClick == other.outboundClick &&
                        pinClick == other.pinClick &&
                        profileVisit == other.profileVisit &&
                        reaction == other.reaction &&
                        save == other.save &&
                        userFollow == other.userFollow &&
                        video10sViews == other.video10sViews &&
                        videoAverageTime == other.videoAverageTime &&
                        videoP95Views == other.videoP95Views &&
                        videoTotalTime == other.videoTotalTime &&
                        videoViews == other.videoViews &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        comment,
                        impression,
                        lastUpdated,
                        outboundClick,
                        pinClick,
                        profileVisit,
                        reaction,
                        save,
                        userFollow,
                        video10sViews,
                        videoAverageTime,
                        videoP95Views,
                        videoTotalTime,
                        videoViews,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LifetimeMetrics{comment=$comment, impression=$impression, lastUpdated=$lastUpdated, outboundClick=$outboundClick, pinClick=$pinClick, profileVisit=$profileVisit, reaction=$reaction, save=$save, userFollow=$userFollow, video10sViews=$video10sViews, videoAverageTime=$videoAverageTime, videoP95Views=$videoP95Views, videoTotalTime=$videoTotalTime, videoViews=$videoViews, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PinterestPostMetricsDto &&
                    _90d == other._90d &&
                    lifetimeMetrics == other.lifetimeMetrics &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(_90d, lifetimeMetrics, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PinterestPostMetricsDto{_90d=$_90d, lifetimeMetrics=$lifetimeMetrics, additionalProperties=$additionalProperties}"
        }
    }

    /** Platform-specific data for the post */
    class PlatformData
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of()
        ) : this(title, mutableMapOf())

        /**
         * Title of the post
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun title(): String = title.getRequired("title")

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

            /**
             * Returns a mutable builder for constructing an instance of [PlatformData].
             *
             * The following fields are required:
             * ```kotlin
             * .title()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PlatformData]. */
        class Builder internal constructor() {

            private var title: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(platformData: PlatformData) = apply {
                title = platformData.title
                additionalProperties = platformData.additionalProperties.toMutableMap()
            }

            /** Title of the post */
            fun title(title: String) = title(JsonField.of(title))

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
             *
             * The following fields are required:
             * ```kotlin
             * .title()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PlatformData =
                PlatformData(checkRequired("title", title), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws PostForMeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): PlatformData = apply {
            if (validated) {
                return@apply
            }

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
        internal fun validity(): Int = (if (title.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PlatformData &&
                title == other.title &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(title, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlatformData{title=$title, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlatformPost &&
            caption == other.caption &&
            media == other.media &&
            platform == other.platform &&
            platformAccountId == other.platformAccountId &&
            platformPostId == other.platformPostId &&
            platformUrl == other.platformUrl &&
            socialAccountId == other.socialAccountId &&
            externalAccountId == other.externalAccountId &&
            externalPostId == other.externalPostId &&
            metrics == other.metrics &&
            platformData == other.platformData &&
            postedAt == other.postedAt &&
            socialPostId == other.socialPostId &&
            socialPostResultId == other.socialPostResultId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            caption,
            media,
            platform,
            platformAccountId,
            platformPostId,
            platformUrl,
            socialAccountId,
            externalAccountId,
            externalPostId,
            metrics,
            platformData,
            postedAt,
            socialPostId,
            socialPostResultId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlatformPost{caption=$caption, media=$media, platform=$platform, platformAccountId=$platformAccountId, platformPostId=$platformPostId, platformUrl=$platformUrl, socialAccountId=$socialAccountId, externalAccountId=$externalAccountId, externalPostId=$externalPostId, metrics=$metrics, platformData=$platformData, postedAt=$postedAt, socialPostId=$socialPostId, socialPostResultId=$socialPostResultId, additionalProperties=$additionalProperties}"
}
