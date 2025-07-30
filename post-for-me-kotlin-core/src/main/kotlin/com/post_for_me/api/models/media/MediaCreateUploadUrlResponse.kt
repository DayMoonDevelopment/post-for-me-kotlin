// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.media

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

class MediaCreateUploadUrlResponse
private constructor(
    private val mediaUrl: JsonField<String>,
    private val uploadUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("media_url") @ExcludeMissing mediaUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("upload_url") @ExcludeMissing uploadUrl: JsonField<String> = JsonMissing.of(),
    ) : this(mediaUrl, uploadUrl, mutableMapOf())

    /**
     * The public URL for the media, to use once file has been uploaded
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mediaUrl(): String = mediaUrl.getRequired("media_url")

    /**
     * The signed upload URL for the client to upload the file
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun uploadUrl(): String = uploadUrl.getRequired("upload_url")

    /**
     * Returns the raw JSON value of [mediaUrl].
     *
     * Unlike [mediaUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("media_url") @ExcludeMissing fun _mediaUrl(): JsonField<String> = mediaUrl

    /**
     * Returns the raw JSON value of [uploadUrl].
     *
     * Unlike [uploadUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("upload_url") @ExcludeMissing fun _uploadUrl(): JsonField<String> = uploadUrl

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
         * Returns a mutable builder for constructing an instance of [MediaCreateUploadUrlResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .mediaUrl()
         * .uploadUrl()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [MediaCreateUploadUrlResponse]. */
    class Builder internal constructor() {

        private var mediaUrl: JsonField<String>? = null
        private var uploadUrl: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(mediaCreateUploadUrlResponse: MediaCreateUploadUrlResponse) = apply {
            mediaUrl = mediaCreateUploadUrlResponse.mediaUrl
            uploadUrl = mediaCreateUploadUrlResponse.uploadUrl
            additionalProperties = mediaCreateUploadUrlResponse.additionalProperties.toMutableMap()
        }

        /** The public URL for the media, to use once file has been uploaded */
        fun mediaUrl(mediaUrl: String) = mediaUrl(JsonField.of(mediaUrl))

        /**
         * Sets [Builder.mediaUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mediaUrl(mediaUrl: JsonField<String>) = apply { this.mediaUrl = mediaUrl }

        /** The signed upload URL for the client to upload the file */
        fun uploadUrl(uploadUrl: String) = uploadUrl(JsonField.of(uploadUrl))

        /**
         * Sets [Builder.uploadUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uploadUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun uploadUrl(uploadUrl: JsonField<String>) = apply { this.uploadUrl = uploadUrl }

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
         * Returns an immutable instance of [MediaCreateUploadUrlResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .mediaUrl()
         * .uploadUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MediaCreateUploadUrlResponse =
            MediaCreateUploadUrlResponse(
                checkRequired("mediaUrl", mediaUrl),
                checkRequired("uploadUrl", uploadUrl),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MediaCreateUploadUrlResponse = apply {
        if (validated) {
            return@apply
        }

        mediaUrl()
        uploadUrl()
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
        (if (mediaUrl.asKnown() == null) 0 else 1) + (if (uploadUrl.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MediaCreateUploadUrlResponse && mediaUrl == other.mediaUrl && uploadUrl == other.uploadUrl && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(mediaUrl, uploadUrl, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MediaCreateUploadUrlResponse{mediaUrl=$mediaUrl, uploadUrl=$uploadUrl, additionalProperties=$additionalProperties}"
}
