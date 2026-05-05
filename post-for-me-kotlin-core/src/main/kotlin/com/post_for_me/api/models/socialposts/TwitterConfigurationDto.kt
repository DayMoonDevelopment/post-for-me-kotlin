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

class TwitterConfigurationDto
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val caption: JsonValue,
    private val communityId: JsonField<String>,
    private val media: JsonField<List<Media>>,
    private val poll: JsonField<Poll>,
    private val quoteTweetId: JsonField<String>,
    private val replySettings: JsonField<ReplySettings>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("caption") @ExcludeMissing caption: JsonValue = JsonMissing.of(),
        @JsonProperty("community_id")
        @ExcludeMissing
        communityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("media") @ExcludeMissing media: JsonField<List<Media>> = JsonMissing.of(),
        @JsonProperty("poll") @ExcludeMissing poll: JsonField<Poll> = JsonMissing.of(),
        @JsonProperty("quote_tweet_id")
        @ExcludeMissing
        quoteTweetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reply_settings")
        @ExcludeMissing
        replySettings: JsonField<ReplySettings> = JsonMissing.of(),
    ) : this(caption, communityId, media, poll, quoteTweetId, replySettings, mutableMapOf())

    /**
     * Overrides the `caption` from the post
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = twitterConfigurationDto.caption().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonValue = caption

    /**
     * Id of the community to post to
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun communityId(): String? = communityId.getNullable("community_id")

    /**
     * Overrides the `media` from the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun media(): List<Media>? = media.getNullable("media")

    /**
     * Poll options for the tweet
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun poll(): Poll? = poll.getNullable("poll")

    /**
     * Id of the tweet you want to quote
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quoteTweetId(): String? = quoteTweetId.getNullable("quote_tweet_id")

    /**
     * Who can reply to the tweet
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replySettings(): ReplySettings? = replySettings.getNullable("reply_settings")

    /**
     * Returns the raw JSON value of [communityId].
     *
     * Unlike [communityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("community_id")
    @ExcludeMissing
    fun _communityId(): JsonField<String> = communityId

    /**
     * Returns the raw JSON value of [media].
     *
     * Unlike [media], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("media") @ExcludeMissing fun _media(): JsonField<List<Media>> = media

    /**
     * Returns the raw JSON value of [poll].
     *
     * Unlike [poll], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("poll") @ExcludeMissing fun _poll(): JsonField<Poll> = poll

    /**
     * Returns the raw JSON value of [quoteTweetId].
     *
     * Unlike [quoteTweetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quote_tweet_id")
    @ExcludeMissing
    fun _quoteTweetId(): JsonField<String> = quoteTweetId

    /**
     * Returns the raw JSON value of [replySettings].
     *
     * Unlike [replySettings], this method doesn't throw if the JSON field has an unexpected type.
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

        /** Returns a mutable builder for constructing an instance of [TwitterConfigurationDto]. */
        fun builder() = Builder()
    }

    /** A builder for [TwitterConfigurationDto]. */
    class Builder internal constructor() {

        private var caption: JsonValue = JsonMissing.of()
        private var communityId: JsonField<String> = JsonMissing.of()
        private var media: JsonField<MutableList<Media>>? = null
        private var poll: JsonField<Poll> = JsonMissing.of()
        private var quoteTweetId: JsonField<String> = JsonMissing.of()
        private var replySettings: JsonField<ReplySettings> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(twitterConfigurationDto: TwitterConfigurationDto) = apply {
            caption = twitterConfigurationDto.caption
            communityId = twitterConfigurationDto.communityId
            media = twitterConfigurationDto.media.map { it.toMutableList() }
            poll = twitterConfigurationDto.poll
            quoteTweetId = twitterConfigurationDto.quoteTweetId
            replySettings = twitterConfigurationDto.replySettings
            additionalProperties = twitterConfigurationDto.additionalProperties.toMutableMap()
        }

        /** Overrides the `caption` from the post */
        fun caption(caption: JsonValue) = apply { this.caption = caption }

        /** Id of the community to post to */
        fun communityId(communityId: String) = communityId(JsonField.of(communityId))

        /**
         * Sets [Builder.communityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.communityId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun communityId(communityId: JsonField<String>) = apply { this.communityId = communityId }

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

        /** Poll options for the tweet */
        fun poll(poll: Poll) = poll(JsonField.of(poll))

        /**
         * Sets [Builder.poll] to an arbitrary JSON value.
         *
         * You should usually call [Builder.poll] with a well-typed [Poll] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun poll(poll: JsonField<Poll>) = apply { this.poll = poll }

        /** Id of the tweet you want to quote */
        fun quoteTweetId(quoteTweetId: String) = quoteTweetId(JsonField.of(quoteTweetId))

        /**
         * Sets [Builder.quoteTweetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quoteTweetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * You should usually call [Builder.replySettings] with a well-typed [ReplySettings] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [TwitterConfigurationDto].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TwitterConfigurationDto =
            TwitterConfigurationDto(
                caption,
                communityId,
                (media ?: JsonMissing.of()).map { it.toImmutable() },
                poll,
                quoteTweetId,
                replySettings,
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
    fun validate(): TwitterConfigurationDto = apply {
        if (validated) {
            return@apply
        }

        communityId()
        media()?.forEach { it.validate() }
        poll()?.validate()
        quoteTweetId()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (communityId.asKnown() == null) 0 else 1) +
            (media.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (poll.asKnown()?.validity() ?: 0) +
            (if (quoteTweetId.asKnown() == null) 0 else 1) +
            (replySettings.asKnown()?.validity() ?: 0)

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

    /** Poll options for the tweet */
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
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun durationMinutes(): Double = durationMinutes.getRequired("duration_minutes")

        /**
         * The choices of the poll, requiring 2-4 options
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun options(): List<String> = options.getRequired("options")

        /**
         * Who can reply to the tweet
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun replySettings(): ReplySettings? = replySettings.getNullable("reply_settings")

        /**
         * Returns the raw JSON value of [durationMinutes].
         *
         * Unlike [durationMinutes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("duration_minutes")
        @ExcludeMissing
        fun _durationMinutes(): JsonField<Double> = durationMinutes

        /**
         * Returns the raw JSON value of [options].
         *
         * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<List<String>> = options

        /**
         * Returns the raw JSON value of [replySettings].
         *
         * Unlike [replySettings], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * You should usually call [Builder.durationMinutes] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun durationMinutes(durationMinutes: JsonField<Double>) = apply {
                this.durationMinutes = durationMinutes
            }

            /** The choices of the poll, requiring 2-4 options */
            fun options(options: List<String>) = options(JsonField.of(options))

            /**
             * Sets [Builder.options] to an arbitrary JSON value.
             *
             * You should usually call [Builder.options] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.replySettings] with a well-typed [ReplySettings]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws PostForMeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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
        class ReplySettings @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * An enum containing [ReplySettings]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ReplySettings] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FOLLOWING,
                MENTIONED_USERS,
                SUBSCRIBERS,
                VERIFIED,
                /**
                 * An enum member indicating that [ReplySettings] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * @throws PostForMeInvalidDataException if this class instance's value is a not a known
             *   member.
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
             * @throws PostForMeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw PostForMeInvalidDataException("Value is not a String")

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

    /** Who can reply to the tweet */
    class ReplySettings @JsonCreator private constructor(private val value: JsonField<String>) :
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
         * An enum containing [ReplySettings]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReplySettings] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FOLLOWING,
            MENTIONED_USERS,
            SUBSCRIBERS,
            VERIFIED,
            /**
             * An enum member indicating that [ReplySettings] was instantiated with an unknown
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
                FOLLOWING -> Value.FOLLOWING
                MENTIONED_USERS -> Value.MENTIONED_USERS
                SUBSCRIBERS -> Value.SUBSCRIBERS
                VERIFIED -> Value.VERIFIED
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
                FOLLOWING -> Known.FOLLOWING
                MENTIONED_USERS -> Known.MENTIONED_USERS
                SUBSCRIBERS -> Known.SUBSCRIBERS
                VERIFIED -> Known.VERIFIED
                else -> throw PostForMeInvalidDataException("Unknown ReplySettings: $value")
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

        return other is TwitterConfigurationDto &&
            caption == other.caption &&
            communityId == other.communityId &&
            media == other.media &&
            poll == other.poll &&
            quoteTweetId == other.quoteTweetId &&
            replySettings == other.replySettings &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            caption,
            communityId,
            media,
            poll,
            quoteTweetId,
            replySettings,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TwitterConfigurationDto{caption=$caption, communityId=$communityId, media=$media, poll=$poll, quoteTweetId=$quoteTweetId, replySettings=$replySettings, additionalProperties=$additionalProperties}"
}
