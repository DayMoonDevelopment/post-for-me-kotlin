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
                postedAt,
                socialPostId,
                socialPostResultId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

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
        private val _json: JsonValue? = null,
    ) {

        fun tikTokBusinessMetricsDto(): TikTokBusinessMetricsDto? = tikTokBusinessMetricsDto

        fun tikTokPostMetricsDto(): TikTokPostMetricsDto? = tikTokPostMetricsDto

        fun instagramPostMetricsDto(): InstagramPostMetricsDto? = instagramPostMetricsDto

        fun youTubePostMetricsDto(): YouTubePostMetricsDto? = youTubePostMetricsDto

        fun isTikTokBusinessMetricsDto(): Boolean = tikTokBusinessMetricsDto != null

        fun isTikTokPostMetricsDto(): Boolean = tikTokPostMetricsDto != null

        fun isInstagramPostMetricsDto(): Boolean = instagramPostMetricsDto != null

        fun isYouTubePostMetricsDto(): Boolean = youTubePostMetricsDto != null

        fun asTikTokBusinessMetricsDto(): TikTokBusinessMetricsDto =
            tikTokBusinessMetricsDto.getOrThrow("tikTokBusinessMetricsDto")

        fun asTikTokPostMetricsDto(): TikTokPostMetricsDto =
            tikTokPostMetricsDto.getOrThrow("tikTokPostMetricsDto")

        fun asInstagramPostMetricsDto(): InstagramPostMetricsDto =
            instagramPostMetricsDto.getOrThrow("instagramPostMetricsDto")

        fun asYouTubePostMetricsDto(): YouTubePostMetricsDto =
            youTubePostMetricsDto.getOrThrow("youTubePostMetricsDto")

        fun _json(): JsonValue? = _json

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
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

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
                youTubePostMetricsDto == other.youTubePostMetricsDto
        }

        override fun hashCode(): Int =
            Objects.hash(
                tikTokBusinessMetricsDto,
                tikTokPostMetricsDto,
                instagramPostMetricsDto,
                youTubePostMetricsDto,
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
        }

        /**
         * An interface that defines how to map each variant of [Metrics] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitTikTokBusinessMetricsDto(tikTokBusinessMetricsDto: TikTokBusinessMetricsDto): T

            fun visitTikTokPostMetricsDto(tikTokPostMetricsDto: TikTokPostMetricsDto): T

            fun visitInstagramPostMetricsDto(instagramPostMetricsDto: InstagramPostMetricsDto): T

            fun visitYouTubePostMetricsDto(youTubePostMetricsDto: YouTubePostMetricsDto): T

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
            postedAt,
            socialPostId,
            socialPostResultId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlatformPost{caption=$caption, media=$media, platform=$platform, platformAccountId=$platformAccountId, platformPostId=$platformPostId, platformUrl=$platformUrl, socialAccountId=$socialAccountId, externalAccountId=$externalAccountId, externalPostId=$externalPostId, metrics=$metrics, postedAt=$postedAt, socialPostId=$socialPostId, socialPostResultId=$socialPostResultId, additionalProperties=$additionalProperties}"
}
