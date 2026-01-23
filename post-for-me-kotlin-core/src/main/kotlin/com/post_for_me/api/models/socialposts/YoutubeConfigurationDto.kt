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

class YoutubeConfigurationDto
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val caption: JsonValue,
    private val madeForKids: JsonField<Boolean>,
    private val media: JsonField<List<Media>>,
    private val privacyStatus: JsonField<PrivacyStatus>,
    private val title: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("caption") @ExcludeMissing caption: JsonValue = JsonMissing.of(),
        @JsonProperty("made_for_kids")
        @ExcludeMissing
        madeForKids: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("media") @ExcludeMissing media: JsonField<List<Media>> = JsonMissing.of(),
        @JsonProperty("privacy_status")
        @ExcludeMissing
        privacyStatus: JsonField<PrivacyStatus> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
    ) : this(caption, madeForKids, media, privacyStatus, title, mutableMapOf())

    /**
     * Overrides the `caption` from the post
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = youtubeConfigurationDto.caption().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonValue = caption

    /**
     * If true will notify YouTube the video is intended for kids, defaults to false
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun madeForKids(): Boolean? = madeForKids.getNullable("made_for_kids")

    /**
     * Overrides the `media` from the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun media(): List<Media>? = media.getNullable("media")

    /**
     * Sets the privacy status of the video, will default to public
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun privacyStatus(): PrivacyStatus? = privacyStatus.getNullable("privacy_status")

    /**
     * Overrides the `title` from the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): String? = title.getNullable("title")

    /**
     * Returns the raw JSON value of [madeForKids].
     *
     * Unlike [madeForKids], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("made_for_kids")
    @ExcludeMissing
    fun _madeForKids(): JsonField<Boolean> = madeForKids

    /**
     * Returns the raw JSON value of [media].
     *
     * Unlike [media], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("media") @ExcludeMissing fun _media(): JsonField<List<Media>> = media

    /**
     * Returns the raw JSON value of [privacyStatus].
     *
     * Unlike [privacyStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("privacy_status")
    @ExcludeMissing
    fun _privacyStatus(): JsonField<PrivacyStatus> = privacyStatus

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

        /** Returns a mutable builder for constructing an instance of [YoutubeConfigurationDto]. */
        fun builder() = Builder()
    }

    /** A builder for [YoutubeConfigurationDto]. */
    class Builder internal constructor() {

        private var caption: JsonValue = JsonMissing.of()
        private var madeForKids: JsonField<Boolean> = JsonMissing.of()
        private var media: JsonField<MutableList<Media>>? = null
        private var privacyStatus: JsonField<PrivacyStatus> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(youtubeConfigurationDto: YoutubeConfigurationDto) = apply {
            caption = youtubeConfigurationDto.caption
            madeForKids = youtubeConfigurationDto.madeForKids
            media = youtubeConfigurationDto.media.map { it.toMutableList() }
            privacyStatus = youtubeConfigurationDto.privacyStatus
            title = youtubeConfigurationDto.title
            additionalProperties = youtubeConfigurationDto.additionalProperties.toMutableMap()
        }

        /** Overrides the `caption` from the post */
        fun caption(caption: JsonValue) = apply { this.caption = caption }

        /** If true will notify YouTube the video is intended for kids, defaults to false */
        fun madeForKids(madeForKids: Boolean?) = madeForKids(JsonField.ofNullable(madeForKids))

        /**
         * Alias for [Builder.madeForKids].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun madeForKids(madeForKids: Boolean) = madeForKids(madeForKids as Boolean?)

        /**
         * Sets [Builder.madeForKids] to an arbitrary JSON value.
         *
         * You should usually call [Builder.madeForKids] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun madeForKids(madeForKids: JsonField<Boolean>) = apply { this.madeForKids = madeForKids }

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

        /** Sets the privacy status of the video, will default to public */
        fun privacyStatus(privacyStatus: PrivacyStatus?) =
            privacyStatus(JsonField.ofNullable(privacyStatus))

        /**
         * Sets [Builder.privacyStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.privacyStatus] with a well-typed [PrivacyStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun privacyStatus(privacyStatus: JsonField<PrivacyStatus>) = apply {
            this.privacyStatus = privacyStatus
        }

        /** Overrides the `title` from the post */
        fun title(title: String?) = title(JsonField.ofNullable(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [YoutubeConfigurationDto].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): YoutubeConfigurationDto =
            YoutubeConfigurationDto(
                caption,
                madeForKids,
                (media ?: JsonMissing.of()).map { it.toImmutable() },
                privacyStatus,
                title,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): YoutubeConfigurationDto = apply {
        if (validated) {
            return@apply
        }

        madeForKids()
        media()?.forEach { it.validate() }
        privacyStatus()?.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (madeForKids.asKnown() == null) 0 else 1) +
            (media.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (privacyStatus.asKnown()?.validity() ?: 0) +
            (if (title.asKnown() == null) 0 else 1)

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

    /** Sets the privacy status of the video, will default to public */
    class PrivacyStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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
         * An enum containing [PrivacyStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PrivacyStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PUBLIC,
            PRIVATE,
            UNLISTED,
            /**
             * An enum member indicating that [PrivacyStatus] was instantiated with an unknown
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
                PUBLIC -> Value.PUBLIC
                PRIVATE -> Value.PRIVATE
                UNLISTED -> Value.UNLISTED
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
                PUBLIC -> Known.PUBLIC
                PRIVATE -> Known.PRIVATE
                UNLISTED -> Known.UNLISTED
                else -> throw PostForMeInvalidDataException("Unknown PrivacyStatus: $value")
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is YoutubeConfigurationDto &&
            caption == other.caption &&
            madeForKids == other.madeForKids &&
            media == other.media &&
            privacyStatus == other.privacyStatus &&
            title == other.title &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(caption, madeForKids, media, privacyStatus, title, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "YoutubeConfigurationDto{caption=$caption, madeForKids=$madeForKids, media=$media, privacyStatus=$privacyStatus, title=$title, additionalProperties=$additionalProperties}"
}
