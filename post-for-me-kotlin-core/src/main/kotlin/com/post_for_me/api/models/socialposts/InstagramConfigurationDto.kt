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

class InstagramConfigurationDto
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val caption: JsonValue,
    private val collaborators: JsonField<List<String>>,
    private val location: JsonField<String>,
    private val media: JsonField<List<Media>>,
    private val placement: JsonField<Placement>,
    private val shareToFeed: JsonField<Boolean>,
    private val trialReelType: JsonField<TrialReelType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("caption") @ExcludeMissing caption: JsonValue = JsonMissing.of(),
        @JsonProperty("collaborators")
        @ExcludeMissing
        collaborators: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("location") @ExcludeMissing location: JsonField<String> = JsonMissing.of(),
        @JsonProperty("media") @ExcludeMissing media: JsonField<List<Media>> = JsonMissing.of(),
        @JsonProperty("placement")
        @ExcludeMissing
        placement: JsonField<Placement> = JsonMissing.of(),
        @JsonProperty("share_to_feed")
        @ExcludeMissing
        shareToFeed: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("trial_reel_type")
        @ExcludeMissing
        trialReelType: JsonField<TrialReelType> = JsonMissing.of(),
    ) : this(
        caption,
        collaborators,
        location,
        media,
        placement,
        shareToFeed,
        trialReelType,
        mutableMapOf(),
    )

    /**
     * Overrides the `caption` from the post
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = instagramConfigurationDto.caption().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonValue = caption

    /**
     * Instagram usernames to be tagged as a collaborator
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun collaborators(): List<String>? = collaborators.getNullable("collaborators")

    /**
     * Page id with a location that you want to tag the image or video with
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun location(): String? = location.getNullable("location")

    /**
     * Overrides the `media` from the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun media(): List<Media>? = media.getNullable("media")

    /**
     * Instagram post placement
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun placement(): Placement? = placement.getNullable("placement")

    /**
     * If false video posts will only be shown in the Reels tab
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shareToFeed(): Boolean? = shareToFeed.getNullable("share_to_feed")

    /**
     * Instagram trial reel type, when passed will be created as a trial reel. If manual the trial
     * reel can be manually graduated in the native app. If perfomance the trial reel will be
     * automatically graduated if the trial reel performs well.
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trialReelType(): TrialReelType? = trialReelType.getNullable("trial_reel_type")

    /**
     * Returns the raw JSON value of [collaborators].
     *
     * Unlike [collaborators], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("collaborators")
    @ExcludeMissing
    fun _collaborators(): JsonField<List<String>> = collaborators

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<String> = location

    /**
     * Returns the raw JSON value of [media].
     *
     * Unlike [media], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("media") @ExcludeMissing fun _media(): JsonField<List<Media>> = media

    /**
     * Returns the raw JSON value of [placement].
     *
     * Unlike [placement], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("placement") @ExcludeMissing fun _placement(): JsonField<Placement> = placement

    /**
     * Returns the raw JSON value of [shareToFeed].
     *
     * Unlike [shareToFeed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("share_to_feed")
    @ExcludeMissing
    fun _shareToFeed(): JsonField<Boolean> = shareToFeed

    /**
     * Returns the raw JSON value of [trialReelType].
     *
     * Unlike [trialReelType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trial_reel_type")
    @ExcludeMissing
    fun _trialReelType(): JsonField<TrialReelType> = trialReelType

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
         * Returns a mutable builder for constructing an instance of [InstagramConfigurationDto].
         */
        fun builder() = Builder()
    }

    /** A builder for [InstagramConfigurationDto]. */
    class Builder internal constructor() {

        private var caption: JsonValue = JsonMissing.of()
        private var collaborators: JsonField<MutableList<String>>? = null
        private var location: JsonField<String> = JsonMissing.of()
        private var media: JsonField<MutableList<Media>>? = null
        private var placement: JsonField<Placement> = JsonMissing.of()
        private var shareToFeed: JsonField<Boolean> = JsonMissing.of()
        private var trialReelType: JsonField<TrialReelType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(instagramConfigurationDto: InstagramConfigurationDto) = apply {
            caption = instagramConfigurationDto.caption
            collaborators = instagramConfigurationDto.collaborators.map { it.toMutableList() }
            location = instagramConfigurationDto.location
            media = instagramConfigurationDto.media.map { it.toMutableList() }
            placement = instagramConfigurationDto.placement
            shareToFeed = instagramConfigurationDto.shareToFeed
            trialReelType = instagramConfigurationDto.trialReelType
            additionalProperties = instagramConfigurationDto.additionalProperties.toMutableMap()
        }

        /** Overrides the `caption` from the post */
        fun caption(caption: JsonValue) = apply { this.caption = caption }

        /** Instagram usernames to be tagged as a collaborator */
        fun collaborators(collaborators: List<String>?) =
            collaborators(JsonField.ofNullable(collaborators))

        /**
         * Sets [Builder.collaborators] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collaborators] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        /** Page id with a location that you want to tag the image or video with */
        fun location(location: String?) = location(JsonField.ofNullable(location))

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun location(location: JsonField<String>) = apply { this.location = location }

        /** Overrides the `media` from the post */
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

        /** Instagram post placement */
        fun placement(placement: Placement?) = placement(JsonField.ofNullable(placement))

        /**
         * Sets [Builder.placement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.placement] with a well-typed [Placement] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun placement(placement: JsonField<Placement>) = apply { this.placement = placement }

        /** If false video posts will only be shown in the Reels tab */
        fun shareToFeed(shareToFeed: Boolean?) = shareToFeed(JsonField.ofNullable(shareToFeed))

        /**
         * Alias for [Builder.shareToFeed].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun shareToFeed(shareToFeed: Boolean) = shareToFeed(shareToFeed as Boolean?)

        /**
         * Sets [Builder.shareToFeed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shareToFeed] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shareToFeed(shareToFeed: JsonField<Boolean>) = apply { this.shareToFeed = shareToFeed }

        /**
         * Instagram trial reel type, when passed will be created as a trial reel. If manual the
         * trial reel can be manually graduated in the native app. If perfomance the trial reel will
         * be automatically graduated if the trial reel performs well.
         */
        fun trialReelType(trialReelType: TrialReelType?) =
            trialReelType(JsonField.ofNullable(trialReelType))

        /**
         * Sets [Builder.trialReelType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialReelType] with a well-typed [TrialReelType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trialReelType(trialReelType: JsonField<TrialReelType>) = apply {
            this.trialReelType = trialReelType
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
         * Returns an immutable instance of [InstagramConfigurationDto].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InstagramConfigurationDto =
            InstagramConfigurationDto(
                caption,
                (collaborators ?: JsonMissing.of()).map { it.toImmutable() },
                location,
                (media ?: JsonMissing.of()).map { it.toImmutable() },
                placement,
                shareToFeed,
                trialReelType,
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
    fun validate(): InstagramConfigurationDto = apply {
        if (validated) {
            return@apply
        }

        collaborators()
        location()
        media()?.forEach { it.validate() }
        placement()?.validate()
        shareToFeed()
        trialReelType()?.validate()
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
        (collaborators.asKnown()?.size ?: 0) +
            (if (location.asKnown() == null) 0 else 1) +
            (media.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (placement.asKnown()?.validity() ?: 0) +
            (if (shareToFeed.asKnown() == null) 0 else 1) +
            (trialReelType.asKnown()?.validity() ?: 0)

    class Media
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val url: JsonField<String>,
        private val skipProcessing: JsonField<Boolean>,
        private val tags: JsonField<List<Tag>>,
        private val thumbnailTimestampMs: JsonValue,
        private val thumbnailUrl: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("skip_processing")
            @ExcludeMissing
            skipProcessing: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<Tag>> = JsonMissing.of(),
            @JsonProperty("thumbnail_timestamp_ms")
            @ExcludeMissing
            thumbnailTimestampMs: JsonValue = JsonMissing.of(),
            @JsonProperty("thumbnail_url")
            @ExcludeMissing
            thumbnailUrl: JsonValue = JsonMissing.of(),
        ) : this(url, skipProcessing, tags, thumbnailTimestampMs, thumbnailUrl, mutableMapOf())

        /**
         * Public URL of the media
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * If true the media will not be processed at all and instead be posted as is, this may
         * increase chance of post failure if media does not meet platform's requirements. Best used
         * for larger files.
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun skipProcessing(): Boolean? = skipProcessing.getNullable("skip_processing")

        /**
         * List of tags to attach to the media
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tags(): List<Tag>? = tags.getNullable("tags")

        /**
         * Timestamp in milliseconds of frame to use as thumbnail for the media
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = media.thumbnailTimestampMs().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("thumbnail_timestamp_ms")
        @ExcludeMissing
        fun _thumbnailTimestampMs(): JsonValue = thumbnailTimestampMs

        /**
         * Public URL of the thumbnail for the media
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = media.thumbnailUrl().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("thumbnail_url") @ExcludeMissing fun _thumbnailUrl(): JsonValue = thumbnailUrl

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [skipProcessing].
         *
         * Unlike [skipProcessing], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("skip_processing")
        @ExcludeMissing
        fun _skipProcessing(): JsonField<Boolean> = skipProcessing

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
            private var skipProcessing: JsonField<Boolean> = JsonMissing.of()
            private var tags: JsonField<MutableList<Tag>>? = null
            private var thumbnailTimestampMs: JsonValue = JsonMissing.of()
            private var thumbnailUrl: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(media: Media) = apply {
                url = media.url
                skipProcessing = media.skipProcessing
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

            /**
             * If true the media will not be processed at all and instead be posted as is, this may
             * increase chance of post failure if media does not meet platform's requirements. Best
             * used for larger files.
             */
            fun skipProcessing(skipProcessing: Boolean?) =
                skipProcessing(JsonField.ofNullable(skipProcessing))

            /**
             * Alias for [Builder.skipProcessing].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun skipProcessing(skipProcessing: Boolean) = skipProcessing(skipProcessing as Boolean?)

            /**
             * Sets [Builder.skipProcessing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skipProcessing] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun skipProcessing(skipProcessing: JsonField<Boolean>) = apply {
                this.skipProcessing = skipProcessing
            }

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
                    skipProcessing,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    thumbnailTimestampMs,
                    thumbnailUrl,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Media = apply {
            if (validated) {
                return@apply
            }

            url()
            skipProcessing()
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
                (if (skipProcessing.asKnown() == null) 0 else 1) +
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
                skipProcessing == other.skipProcessing &&
                tags == other.tags &&
                thumbnailTimestampMs == other.thumbnailTimestampMs &&
                thumbnailUrl == other.thumbnailUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                url,
                skipProcessing,
                tags,
                thumbnailTimestampMs,
                thumbnailUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Media{url=$url, skipProcessing=$skipProcessing, tags=$tags, thumbnailTimestampMs=$thumbnailTimestampMs, thumbnailUrl=$thumbnailUrl, additionalProperties=$additionalProperties}"
    }

    /** Instagram post placement */
    class Placement @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REELS,
            STORIES,
            TIMELINE,
            /**
             * An enum member indicating that [Placement] was instantiated with an unknown value.
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
                REELS -> Value.REELS
                STORIES -> Value.STORIES
                TIMELINE -> Value.TIMELINE
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
                REELS -> Known.REELS
                STORIES -> Known.STORIES
                TIMELINE -> Known.TIMELINE
                else -> throw PostForMeInvalidDataException("Unknown Placement: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws PostForMeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    /**
     * Instagram trial reel type, when passed will be created as a trial reel. If manual the trial
     * reel can be manually graduated in the native app. If perfomance the trial reel will be
     * automatically graduated if the trial reel performs well.
     */
    class TrialReelType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val MANUAL = of("manual")

            val PERFORMANCE = of("performance")

            fun of(value: String) = TrialReelType(JsonField.of(value))
        }

        /** An enum containing [TrialReelType]'s known values. */
        enum class Known {
            MANUAL,
            PERFORMANCE,
        }

        /**
         * An enum containing [TrialReelType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TrialReelType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MANUAL,
            PERFORMANCE,
            /**
             * An enum member indicating that [TrialReelType] was instantiated with an unknown
             * value.
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
                MANUAL -> Value.MANUAL
                PERFORMANCE -> Value.PERFORMANCE
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
                MANUAL -> Known.MANUAL
                PERFORMANCE -> Known.PERFORMANCE
                else -> throw PostForMeInvalidDataException("Unknown TrialReelType: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws PostForMeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): TrialReelType = apply {
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

            return other is TrialReelType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstagramConfigurationDto &&
            caption == other.caption &&
            collaborators == other.collaborators &&
            location == other.location &&
            media == other.media &&
            placement == other.placement &&
            shareToFeed == other.shareToFeed &&
            trialReelType == other.trialReelType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            caption,
            collaborators,
            location,
            media,
            placement,
            shareToFeed,
            trialReelType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstagramConfigurationDto{caption=$caption, collaborators=$collaborators, location=$location, media=$media, placement=$placement, shareToFeed=$shareToFeed, trialReelType=$trialReelType, additionalProperties=$additionalProperties}"
}
