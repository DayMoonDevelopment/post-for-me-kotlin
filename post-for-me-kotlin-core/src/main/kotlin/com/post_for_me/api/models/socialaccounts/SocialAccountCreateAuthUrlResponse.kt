// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccounts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.post_for_me.api.core.ExcludeMissing
import com.post_for_me.api.core.JsonField
import com.post_for_me.api.core.JsonMissing
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.checkRequired
import com.post_for_me.api.errors.PostForMeInvalidDataException
import java.util.Collections
import java.util.Objects

class SocialAccountCreateAuthUrlResponse
private constructor(
    private val platform: JsonField<String>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("platform") @ExcludeMissing platform: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(platform, url, mutableMapOf())

    /**
     * The social account provider
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platform(): String = platform.getRequired("platform")

    /**
     * The url to redirect the user to, in order to connect their account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * Returns the raw JSON value of [platform].
     *
     * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<String> = platform

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
         * Returns a mutable builder for constructing an instance of
         * [SocialAccountCreateAuthUrlResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .platform()
         * .url()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SocialAccountCreateAuthUrlResponse]. */
    class Builder internal constructor() {

        private var platform: JsonField<String>? = null
        private var url: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(socialAccountCreateAuthUrlResponse: SocialAccountCreateAuthUrlResponse) =
            apply {
                platform = socialAccountCreateAuthUrlResponse.platform
                url = socialAccountCreateAuthUrlResponse.url
                additionalProperties =
                    socialAccountCreateAuthUrlResponse.additionalProperties.toMutableMap()
            }

        /** The social account provider */
        fun platform(platform: String) = platform(JsonField.of(platform))

        /**
         * Sets [Builder.platform] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platform] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun platform(platform: JsonField<String>) = apply { this.platform = platform }

        /** The url to redirect the user to, in order to connect their account */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

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
         * Returns an immutable instance of [SocialAccountCreateAuthUrlResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .platform()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SocialAccountCreateAuthUrlResponse =
            SocialAccountCreateAuthUrlResponse(
                checkRequired("platform", platform),
                checkRequired("url", url),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SocialAccountCreateAuthUrlResponse = apply {
        if (validated) {
            return@apply
        }

        platform()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (platform.asKnown() == null) 0 else 1) + (if (url.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SocialAccountCreateAuthUrlResponse && platform == other.platform && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(platform, url, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SocialAccountCreateAuthUrlResponse{platform=$platform, url=$url, additionalProperties=$additionalProperties}"
}
