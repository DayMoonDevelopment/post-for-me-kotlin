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
import com.post_for_me.api.core.toImmutable
import com.post_for_me.api.errors.PostForMeInvalidDataException
import java.util.Collections
import java.util.Objects

class TiktokConfiguration
private constructor(
    private val allowComment: JsonField<Boolean>,
    private val allowDuet: JsonField<Boolean>,
    private val allowStitch: JsonField<Boolean>,
    private val caption: JsonValue,
    private val discloseBrandedContent: JsonField<Boolean>,
    private val discloseYourBrand: JsonField<Boolean>,
    private val media: JsonField<List<String>>,
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
        @JsonProperty("caption") @ExcludeMissing caption: JsonValue = JsonMissing.of(),
        @JsonProperty("disclose_branded_content")
        @ExcludeMissing
        discloseBrandedContent: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("disclose_your_brand")
        @ExcludeMissing
        discloseYourBrand: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("media") @ExcludeMissing media: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("privacy_status")
        @ExcludeMissing
        privacyStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
    ) : this(
        allowComment,
        allowDuet,
        allowStitch,
        caption,
        discloseBrandedContent,
        discloseYourBrand,
        media,
        privacyStatus,
        title,
        mutableMapOf(),
    )

    /**
     * Allow comments on TikTok
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowComment(): Boolean? = allowComment.getNullable("allow_comment")

    /**
     * Allow duets on TikTok
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowDuet(): Boolean? = allowDuet.getNullable("allow_duet")

    /**
     * Allow stitch on TikTok
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowStitch(): Boolean? = allowStitch.getNullable("allow_stitch")

    /** Overrides the `caption` from the post */
    @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonValue = caption

    /**
     * Disclose branded content on TikTok
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun discloseBrandedContent(): Boolean? =
        discloseBrandedContent.getNullable("disclose_branded_content")

    /**
     * Disclose your brand on TikTok
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun discloseYourBrand(): Boolean? = discloseYourBrand.getNullable("disclose_your_brand")

    /**
     * Overrides the `media` from the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun media(): List<String>? = media.getNullable("media")

    /**
     * Sets the privacy status for TikTok (private, public)
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun privacyStatus(): String? = privacyStatus.getNullable("privacy_status")

    /**
     * Overrides the `title` from the post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): String? = title.getNullable("title")

    /**
     * Returns the raw JSON value of [allowComment].
     *
     * Unlike [allowComment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allow_comment")
    @ExcludeMissing
    fun _allowComment(): JsonField<Boolean> = allowComment

    /**
     * Returns the raw JSON value of [allowDuet].
     *
     * Unlike [allowDuet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allow_duet") @ExcludeMissing fun _allowDuet(): JsonField<Boolean> = allowDuet

    /**
     * Returns the raw JSON value of [allowStitch].
     *
     * Unlike [allowStitch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allow_stitch")
    @ExcludeMissing
    fun _allowStitch(): JsonField<Boolean> = allowStitch

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
     * Unlike [discloseYourBrand], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("disclose_your_brand")
    @ExcludeMissing
    fun _discloseYourBrand(): JsonField<Boolean> = discloseYourBrand

    /**
     * Returns the raw JSON value of [media].
     *
     * Unlike [media], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("media") @ExcludeMissing fun _media(): JsonField<List<String>> = media

    /**
     * Returns the raw JSON value of [privacyStatus].
     *
     * Unlike [privacyStatus], this method doesn't throw if the JSON field has an unexpected type.
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

        /** Returns a mutable builder for constructing an instance of [TiktokConfiguration]. */
        fun builder() = Builder()
    }

    /** A builder for [TiktokConfiguration]. */
    class Builder internal constructor() {

        private var allowComment: JsonField<Boolean> = JsonMissing.of()
        private var allowDuet: JsonField<Boolean> = JsonMissing.of()
        private var allowStitch: JsonField<Boolean> = JsonMissing.of()
        private var caption: JsonValue = JsonMissing.of()
        private var discloseBrandedContent: JsonField<Boolean> = JsonMissing.of()
        private var discloseYourBrand: JsonField<Boolean> = JsonMissing.of()
        private var media: JsonField<MutableList<String>>? = null
        private var privacyStatus: JsonField<String> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(tiktokConfiguration: TiktokConfiguration) = apply {
            allowComment = tiktokConfiguration.allowComment
            allowDuet = tiktokConfiguration.allowDuet
            allowStitch = tiktokConfiguration.allowStitch
            caption = tiktokConfiguration.caption
            discloseBrandedContent = tiktokConfiguration.discloseBrandedContent
            discloseYourBrand = tiktokConfiguration.discloseYourBrand
            media = tiktokConfiguration.media.map { it.toMutableList() }
            privacyStatus = tiktokConfiguration.privacyStatus
            title = tiktokConfiguration.title
            additionalProperties = tiktokConfiguration.additionalProperties.toMutableMap()
        }

        /** Allow comments on TikTok */
        fun allowComment(allowComment: Boolean?) = allowComment(JsonField.ofNullable(allowComment))

        /**
         * Alias for [Builder.allowComment].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun allowComment(allowComment: Boolean) = allowComment(allowComment as Boolean?)

        /**
         * Sets [Builder.allowComment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowComment] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * You should usually call [Builder.allowDuet] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun allowDuet(allowDuet: JsonField<Boolean>) = apply { this.allowDuet = allowDuet }

        /** Allow stitch on TikTok */
        fun allowStitch(allowStitch: Boolean?) = allowStitch(JsonField.ofNullable(allowStitch))

        /**
         * Alias for [Builder.allowStitch].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun allowStitch(allowStitch: Boolean) = allowStitch(allowStitch as Boolean?)

        /**
         * Sets [Builder.allowStitch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowStitch] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun allowStitch(allowStitch: JsonField<Boolean>) = apply { this.allowStitch = allowStitch }

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
         * You should usually call [Builder.discloseBrandedContent] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
         * You should usually call [Builder.discloseYourBrand] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discloseYourBrand(discloseYourBrand: JsonField<Boolean>) = apply {
            this.discloseYourBrand = discloseYourBrand
        }

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

        /** Sets the privacy status for TikTok (private, public) */
        fun privacyStatus(privacyStatus: String?) =
            privacyStatus(JsonField.ofNullable(privacyStatus))

        /**
         * Sets [Builder.privacyStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.privacyStatus] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun privacyStatus(privacyStatus: JsonField<String>) = apply {
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
         * Returns an immutable instance of [TiktokConfiguration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TiktokConfiguration =
            TiktokConfiguration(
                allowComment,
                allowDuet,
                allowStitch,
                caption,
                discloseBrandedContent,
                discloseYourBrand,
                (media ?: JsonMissing.of()).map { it.toImmutable() },
                privacyStatus,
                title,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TiktokConfiguration = apply {
        if (validated) {
            return@apply
        }

        allowComment()
        allowDuet()
        allowStitch()
        discloseBrandedContent()
        discloseYourBrand()
        media()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (allowComment.asKnown() == null) 0 else 1) +
            (if (allowDuet.asKnown() == null) 0 else 1) +
            (if (allowStitch.asKnown() == null) 0 else 1) +
            (if (discloseBrandedContent.asKnown() == null) 0 else 1) +
            (if (discloseYourBrand.asKnown() == null) 0 else 1) +
            (media.asKnown()?.size ?: 0) +
            (if (privacyStatus.asKnown() == null) 0 else 1) +
            (if (title.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TiktokConfiguration && allowComment == other.allowComment && allowDuet == other.allowDuet && allowStitch == other.allowStitch && caption == other.caption && discloseBrandedContent == other.discloseBrandedContent && discloseYourBrand == other.discloseYourBrand && media == other.media && privacyStatus == other.privacyStatus && title == other.title && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(allowComment, allowDuet, allowStitch, caption, discloseBrandedContent, discloseYourBrand, media, privacyStatus, title, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TiktokConfiguration{allowComment=$allowComment, allowDuet=$allowDuet, allowStitch=$allowStitch, caption=$caption, discloseBrandedContent=$discloseBrandedContent, discloseYourBrand=$discloseYourBrand, media=$media, privacyStatus=$privacyStatus, title=$title, additionalProperties=$additionalProperties}"
}
