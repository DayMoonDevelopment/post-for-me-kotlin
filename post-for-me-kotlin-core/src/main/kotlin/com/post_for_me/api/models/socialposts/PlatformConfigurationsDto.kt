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
import com.post_for_me.api.errors.PostForMeInvalidDataException
import java.util.Collections
import java.util.Objects

class PlatformConfigurationsDto
private constructor(
    private val bluesky: JsonField<BlueskyConfigurationDto>,
    private val facebook: JsonField<FacebookConfigurationDto>,
    private val instagram: JsonField<InstagramConfigurationDto>,
    private val linkedin: JsonField<LinkedinConfigurationDto>,
    private val pinterest: JsonField<PinterestConfigurationDto>,
    private val threads: JsonField<ThreadsConfigurationDto>,
    private val tiktok: JsonField<TiktokConfiguration>,
    private val tiktokBusiness: JsonField<TiktokConfiguration>,
    private val x: JsonField<TwitterConfigurationDto>,
    private val youtube: JsonField<YoutubeConfigurationDto>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bluesky")
        @ExcludeMissing
        bluesky: JsonField<BlueskyConfigurationDto> = JsonMissing.of(),
        @JsonProperty("facebook")
        @ExcludeMissing
        facebook: JsonField<FacebookConfigurationDto> = JsonMissing.of(),
        @JsonProperty("instagram")
        @ExcludeMissing
        instagram: JsonField<InstagramConfigurationDto> = JsonMissing.of(),
        @JsonProperty("linkedin")
        @ExcludeMissing
        linkedin: JsonField<LinkedinConfigurationDto> = JsonMissing.of(),
        @JsonProperty("pinterest")
        @ExcludeMissing
        pinterest: JsonField<PinterestConfigurationDto> = JsonMissing.of(),
        @JsonProperty("threads")
        @ExcludeMissing
        threads: JsonField<ThreadsConfigurationDto> = JsonMissing.of(),
        @JsonProperty("tiktok")
        @ExcludeMissing
        tiktok: JsonField<TiktokConfiguration> = JsonMissing.of(),
        @JsonProperty("tiktok_business")
        @ExcludeMissing
        tiktokBusiness: JsonField<TiktokConfiguration> = JsonMissing.of(),
        @JsonProperty("x") @ExcludeMissing x: JsonField<TwitterConfigurationDto> = JsonMissing.of(),
        @JsonProperty("youtube")
        @ExcludeMissing
        youtube: JsonField<YoutubeConfigurationDto> = JsonMissing.of(),
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
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bluesky(): BlueskyConfigurationDto? = bluesky.getNullable("bluesky")

    /**
     * Facebook configuration
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun facebook(): FacebookConfigurationDto? = facebook.getNullable("facebook")

    /**
     * Instagram configuration
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instagram(): InstagramConfigurationDto? = instagram.getNullable("instagram")

    /**
     * LinkedIn configuration
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun linkedin(): LinkedinConfigurationDto? = linkedin.getNullable("linkedin")

    /**
     * Pinterest configuration
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pinterest(): PinterestConfigurationDto? = pinterest.getNullable("pinterest")

    /**
     * Threads configuration
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threads(): ThreadsConfigurationDto? = threads.getNullable("threads")

    /**
     * TikTok configuration
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tiktok(): TiktokConfiguration? = tiktok.getNullable("tiktok")

    /**
     * TikTok configuration
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tiktokBusiness(): TiktokConfiguration? = tiktokBusiness.getNullable("tiktok_business")

    /**
     * Twitter configuration
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun x(): TwitterConfigurationDto? = x.getNullable("x")

    /**
     * YouTube configuration
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun youtube(): YoutubeConfigurationDto? = youtube.getNullable("youtube")

    /**
     * Returns the raw JSON value of [bluesky].
     *
     * Unlike [bluesky], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bluesky")
    @ExcludeMissing
    fun _bluesky(): JsonField<BlueskyConfigurationDto> = bluesky

    /**
     * Returns the raw JSON value of [facebook].
     *
     * Unlike [facebook], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("facebook")
    @ExcludeMissing
    fun _facebook(): JsonField<FacebookConfigurationDto> = facebook

    /**
     * Returns the raw JSON value of [instagram].
     *
     * Unlike [instagram], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instagram")
    @ExcludeMissing
    fun _instagram(): JsonField<InstagramConfigurationDto> = instagram

    /**
     * Returns the raw JSON value of [linkedin].
     *
     * Unlike [linkedin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("linkedin")
    @ExcludeMissing
    fun _linkedin(): JsonField<LinkedinConfigurationDto> = linkedin

    /**
     * Returns the raw JSON value of [pinterest].
     *
     * Unlike [pinterest], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pinterest")
    @ExcludeMissing
    fun _pinterest(): JsonField<PinterestConfigurationDto> = pinterest

    /**
     * Returns the raw JSON value of [threads].
     *
     * Unlike [threads], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("threads")
    @ExcludeMissing
    fun _threads(): JsonField<ThreadsConfigurationDto> = threads

    /**
     * Returns the raw JSON value of [tiktok].
     *
     * Unlike [tiktok], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tiktok") @ExcludeMissing fun _tiktok(): JsonField<TiktokConfiguration> = tiktok

    /**
     * Returns the raw JSON value of [tiktokBusiness].
     *
     * Unlike [tiktokBusiness], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tiktok_business")
    @ExcludeMissing
    fun _tiktokBusiness(): JsonField<TiktokConfiguration> = tiktokBusiness

    /**
     * Returns the raw JSON value of [x].
     *
     * Unlike [x], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("x") @ExcludeMissing fun _x(): JsonField<TwitterConfigurationDto> = x

    /**
     * Returns the raw JSON value of [youtube].
     *
     * Unlike [youtube], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("youtube")
    @ExcludeMissing
    fun _youtube(): JsonField<YoutubeConfigurationDto> = youtube

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
         * Returns a mutable builder for constructing an instance of [PlatformConfigurationsDto].
         */
        fun builder() = Builder()
    }

    /** A builder for [PlatformConfigurationsDto]. */
    class Builder internal constructor() {

        private var bluesky: JsonField<BlueskyConfigurationDto> = JsonMissing.of()
        private var facebook: JsonField<FacebookConfigurationDto> = JsonMissing.of()
        private var instagram: JsonField<InstagramConfigurationDto> = JsonMissing.of()
        private var linkedin: JsonField<LinkedinConfigurationDto> = JsonMissing.of()
        private var pinterest: JsonField<PinterestConfigurationDto> = JsonMissing.of()
        private var threads: JsonField<ThreadsConfigurationDto> = JsonMissing.of()
        private var tiktok: JsonField<TiktokConfiguration> = JsonMissing.of()
        private var tiktokBusiness: JsonField<TiktokConfiguration> = JsonMissing.of()
        private var x: JsonField<TwitterConfigurationDto> = JsonMissing.of()
        private var youtube: JsonField<YoutubeConfigurationDto> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(platformConfigurationsDto: PlatformConfigurationsDto) = apply {
            bluesky = platformConfigurationsDto.bluesky
            facebook = platformConfigurationsDto.facebook
            instagram = platformConfigurationsDto.instagram
            linkedin = platformConfigurationsDto.linkedin
            pinterest = platformConfigurationsDto.pinterest
            threads = platformConfigurationsDto.threads
            tiktok = platformConfigurationsDto.tiktok
            tiktokBusiness = platformConfigurationsDto.tiktokBusiness
            x = platformConfigurationsDto.x
            youtube = platformConfigurationsDto.youtube
            additionalProperties = platformConfigurationsDto.additionalProperties.toMutableMap()
        }

        /** Bluesky configuration */
        fun bluesky(bluesky: BlueskyConfigurationDto?) = bluesky(JsonField.ofNullable(bluesky))

        /**
         * Sets [Builder.bluesky] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bluesky] with a well-typed [BlueskyConfigurationDto]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun bluesky(bluesky: JsonField<BlueskyConfigurationDto>) = apply { this.bluesky = bluesky }

        /** Facebook configuration */
        fun facebook(facebook: FacebookConfigurationDto?) = facebook(JsonField.ofNullable(facebook))

        /**
         * Sets [Builder.facebook] to an arbitrary JSON value.
         *
         * You should usually call [Builder.facebook] with a well-typed [FacebookConfigurationDto]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun facebook(facebook: JsonField<FacebookConfigurationDto>) = apply {
            this.facebook = facebook
        }

        /** Instagram configuration */
        fun instagram(instagram: InstagramConfigurationDto?) =
            instagram(JsonField.ofNullable(instagram))

        /**
         * Sets [Builder.instagram] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instagram] with a well-typed [InstagramConfigurationDto]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun instagram(instagram: JsonField<InstagramConfigurationDto>) = apply {
            this.instagram = instagram
        }

        /** LinkedIn configuration */
        fun linkedin(linkedin: LinkedinConfigurationDto?) = linkedin(JsonField.ofNullable(linkedin))

        /**
         * Sets [Builder.linkedin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkedin] with a well-typed [LinkedinConfigurationDto]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun linkedin(linkedin: JsonField<LinkedinConfigurationDto>) = apply {
            this.linkedin = linkedin
        }

        /** Pinterest configuration */
        fun pinterest(pinterest: PinterestConfigurationDto?) =
            pinterest(JsonField.ofNullable(pinterest))

        /**
         * Sets [Builder.pinterest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pinterest] with a well-typed [PinterestConfigurationDto]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun pinterest(pinterest: JsonField<PinterestConfigurationDto>) = apply {
            this.pinterest = pinterest
        }

        /** Threads configuration */
        fun threads(threads: ThreadsConfigurationDto?) = threads(JsonField.ofNullable(threads))

        /**
         * Sets [Builder.threads] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threads] with a well-typed [ThreadsConfigurationDto]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun threads(threads: JsonField<ThreadsConfigurationDto>) = apply { this.threads = threads }

        /** TikTok configuration */
        fun tiktok(tiktok: TiktokConfiguration?) = tiktok(JsonField.ofNullable(tiktok))

        /**
         * Sets [Builder.tiktok] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tiktok] with a well-typed [TiktokConfiguration] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tiktok(tiktok: JsonField<TiktokConfiguration>) = apply { this.tiktok = tiktok }

        /** TikTok configuration */
        fun tiktokBusiness(tiktokBusiness: TiktokConfiguration?) =
            tiktokBusiness(JsonField.ofNullable(tiktokBusiness))

        /**
         * Sets [Builder.tiktokBusiness] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tiktokBusiness] with a well-typed [TiktokConfiguration]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun tiktokBusiness(tiktokBusiness: JsonField<TiktokConfiguration>) = apply {
            this.tiktokBusiness = tiktokBusiness
        }

        /** Twitter configuration */
        fun x(x: TwitterConfigurationDto?) = x(JsonField.ofNullable(x))

        /**
         * Sets [Builder.x] to an arbitrary JSON value.
         *
         * You should usually call [Builder.x] with a well-typed [TwitterConfigurationDto] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun x(x: JsonField<TwitterConfigurationDto>) = apply { this.x = x }

        /** YouTube configuration */
        fun youtube(youtube: YoutubeConfigurationDto?) = youtube(JsonField.ofNullable(youtube))

        /**
         * Sets [Builder.youtube] to an arbitrary JSON value.
         *
         * You should usually call [Builder.youtube] with a well-typed [YoutubeConfigurationDto]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun youtube(youtube: JsonField<YoutubeConfigurationDto>) = apply { this.youtube = youtube }

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
         * Returns an immutable instance of [PlatformConfigurationsDto].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PlatformConfigurationsDto =
            PlatformConfigurationsDto(
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

    fun validate(): PlatformConfigurationsDto = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlatformConfigurationsDto &&
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
        "PlatformConfigurationsDto{bluesky=$bluesky, facebook=$facebook, instagram=$instagram, linkedin=$linkedin, pinterest=$pinterest, threads=$threads, tiktok=$tiktok, tiktokBusiness=$tiktokBusiness, x=$x, youtube=$youtube, additionalProperties=$additionalProperties}"
}
