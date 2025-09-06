// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class PinterestConfigurationDto
private constructor(
    private val boardIds: JsonField<List<String>>,
    private val caption: JsonValue,
    private val link: JsonField<String>,
    private val media: JsonField<List<Media>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("board_ids")
        @ExcludeMissing
        boardIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("caption") @ExcludeMissing caption: JsonValue = JsonMissing.of(),
        @JsonProperty("link") @ExcludeMissing link: JsonField<String> = JsonMissing.of(),
        @JsonProperty("media") @ExcludeMissing media: JsonField<List<Media>> = JsonMissing.of(),
    ) : this(boardIds, caption, link, media, mutableMapOf())

    /**
     * Pinterest board IDs
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun boardIds(): List<String>? = boardIds.getNullable("board_ids")

    /** Overrides the `caption` from the post */
    @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonValue = caption

    /**
     * Pinterest post link
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun link(): String? = link.getNullable("link")

    /**
     * Overrides the `media` from the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun media(): List<Media>? = media.getNullable("media")

    /**
     * Returns the raw JSON value of [boardIds].
     *
     * Unlike [boardIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("board_ids") @ExcludeMissing fun _boardIds(): JsonField<List<String>> = boardIds

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
    @JsonProperty("media") @ExcludeMissing fun _media(): JsonField<List<Media>> = media

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
         * Returns a mutable builder for constructing an instance of [PinterestConfigurationDto].
         */
        fun builder() = Builder()
    }

    /** A builder for [PinterestConfigurationDto]. */
    class Builder internal constructor() {

        private var boardIds: JsonField<MutableList<String>>? = null
        private var caption: JsonValue = JsonMissing.of()
        private var link: JsonField<String> = JsonMissing.of()
        private var media: JsonField<MutableList<Media>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(pinterestConfigurationDto: PinterestConfigurationDto) = apply {
            boardIds = pinterestConfigurationDto.boardIds.map { it.toMutableList() }
            caption = pinterestConfigurationDto.caption
            link = pinterestConfigurationDto.link
            media = pinterestConfigurationDto.media.map { it.toMutableList() }
            additionalProperties = pinterestConfigurationDto.additionalProperties.toMutableMap()
        }

        /** Pinterest board IDs */
        fun boardIds(boardIds: List<String>?) = boardIds(JsonField.ofNullable(boardIds))

        /**
         * Sets [Builder.boardIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.boardIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * You should usually call [Builder.link] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun link(link: JsonField<String>) = apply { this.link = link }

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
         * Returns an immutable instance of [PinterestConfigurationDto].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PinterestConfigurationDto =
            PinterestConfigurationDto(
                (boardIds ?: JsonMissing.of()).map { it.toImmutable() },
                caption,
                link,
                (media ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PinterestConfigurationDto = apply {
        if (validated) {
            return@apply
        }

        boardIds()
        link()
        media()?.forEach { it.validate() }
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
        (boardIds.asKnown()?.size ?: 0) +
            (if (link.asKnown() == null) 0 else 1) +
            (media.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PinterestConfigurationDto &&
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
        "PinterestConfigurationDto{boardIds=$boardIds, caption=$caption, link=$link, media=$media, additionalProperties=$additionalProperties}"
}
