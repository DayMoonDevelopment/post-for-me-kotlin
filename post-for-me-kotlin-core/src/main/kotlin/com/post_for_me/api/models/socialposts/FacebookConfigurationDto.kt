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
import com.post_for_me.api.core.toImmutable
import com.post_for_me.api.errors.PostForMeInvalidDataException
import java.util.Collections
import java.util.Objects

class FacebookConfigurationDto
private constructor(
    private val caption: JsonValue,
    private val media: JsonField<List<String>>,
    private val placement: JsonField<Placement>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("caption") @ExcludeMissing caption: JsonValue = JsonMissing.of(),
        @JsonProperty("media") @ExcludeMissing media: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("placement")
        @ExcludeMissing
        placement: JsonField<Placement> = JsonMissing.of(),
    ) : this(caption, media, placement, mutableMapOf())

    /** Overrides the `caption` from the post */
    @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonValue = caption

    /**
     * Overrides the `media` from the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun media(): List<String>? = media.getNullable("media")

    /**
     * Facebook post placement
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
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
     * Unlike [placement], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("placement") @ExcludeMissing fun _placement(): JsonField<Placement> = placement

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

        /** Returns a mutable builder for constructing an instance of [FacebookConfigurationDto]. */
        fun builder() = Builder()
    }

    /** A builder for [FacebookConfigurationDto]. */
    class Builder internal constructor() {

        private var caption: JsonValue = JsonMissing.of()
        private var media: JsonField<MutableList<String>>? = null
        private var placement: JsonField<Placement> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(facebookConfigurationDto: FacebookConfigurationDto) = apply {
            caption = facebookConfigurationDto.caption
            media = facebookConfigurationDto.media.map { it.toMutableList() }
            placement = facebookConfigurationDto.placement
            additionalProperties = facebookConfigurationDto.additionalProperties.toMutableMap()
        }

        /** Overrides the `caption` from the post */
        fun caption(caption: JsonValue) = apply { this.caption = caption }

        /** Overrides the `media` from the post */
        fun media(media: List<String>?) = media(JsonField.ofNullable(media))

        /**
         * Sets [Builder.media] to an arbitrary JSON value.
         *
         * You should usually call [Builder.media] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * You should usually call [Builder.placement] with a well-typed [Placement] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun placement(placement: JsonField<Placement>) = apply { this.placement = placement }

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
         * Returns an immutable instance of [FacebookConfigurationDto].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FacebookConfigurationDto =
            FacebookConfigurationDto(
                caption,
                (media ?: JsonMissing.of()).map { it.toImmutable() },
                placement,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FacebookConfigurationDto = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (media.asKnown()?.size ?: 0) + (placement.asKnown()?.validity() ?: 0)

    /** Facebook post placement */
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

        return other is FacebookConfigurationDto &&
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
        "FacebookConfigurationDto{caption=$caption, media=$media, placement=$placement, additionalProperties=$additionalProperties}"
}
