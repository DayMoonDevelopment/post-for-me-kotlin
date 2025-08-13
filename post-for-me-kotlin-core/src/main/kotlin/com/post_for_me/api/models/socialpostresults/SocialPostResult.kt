// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialpostresults

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

class SocialPostResult
private constructor(
    private val id: JsonField<String>,
    private val details: JsonValue,
    private val error: JsonValue,
    private val platformData: JsonField<PlatformData>,
    private val postId: JsonField<String>,
    private val socialAccountId: JsonField<String>,
    private val success: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("details") @ExcludeMissing details: JsonValue = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonValue = JsonMissing.of(),
        @JsonProperty("platform_data")
        @ExcludeMissing
        platformData: JsonField<PlatformData> = JsonMissing.of(),
        @JsonProperty("post_id") @ExcludeMissing postId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("social_account_id")
        @ExcludeMissing
        socialAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
    ) : this(id, details, error, platformData, postId, socialAccountId, success, mutableMapOf())

    /**
     * The unique identifier of the post result
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /** Detailed logs from the post */
    @JsonProperty("details") @ExcludeMissing fun _details(): JsonValue = details

    /** Error message if the post failed */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonValue = error

    /**
     * Platform-specific data
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platformData(): PlatformData = platformData.getRequired("platform_data")

    /**
     * The ID of the associated post
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun postId(): String = postId.getRequired("post_id")

    /**
     * The ID of the associated social account
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun socialAccountId(): String = socialAccountId.getRequired("social_account_id")

    /**
     * Indicates if the post was successful
     *
     * @throws PostForMeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun success(): Boolean = success.getRequired("success")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [platformData].
     *
     * Unlike [platformData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platform_data")
    @ExcludeMissing
    fun _platformData(): JsonField<PlatformData> = platformData

    /**
     * Returns the raw JSON value of [postId].
     *
     * Unlike [postId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("post_id") @ExcludeMissing fun _postId(): JsonField<String> = postId

    /**
     * Returns the raw JSON value of [socialAccountId].
     *
     * Unlike [socialAccountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("social_account_id")
    @ExcludeMissing
    fun _socialAccountId(): JsonField<String> = socialAccountId

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

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
         * Returns a mutable builder for constructing an instance of [SocialPostResult].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .details()
         * .error()
         * .platformData()
         * .postId()
         * .socialAccountId()
         * .success()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SocialPostResult]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var details: JsonValue? = null
        private var error: JsonValue? = null
        private var platformData: JsonField<PlatformData>? = null
        private var postId: JsonField<String>? = null
        private var socialAccountId: JsonField<String>? = null
        private var success: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(socialPostResult: SocialPostResult) = apply {
            id = socialPostResult.id
            details = socialPostResult.details
            error = socialPostResult.error
            platformData = socialPostResult.platformData
            postId = socialPostResult.postId
            socialAccountId = socialPostResult.socialAccountId
            success = socialPostResult.success
            additionalProperties = socialPostResult.additionalProperties.toMutableMap()
        }

        /** The unique identifier of the post result */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Detailed logs from the post */
        fun details(details: JsonValue) = apply { this.details = details }

        /** Error message if the post failed */
        fun error(error: JsonValue) = apply { this.error = error }

        /** Platform-specific data */
        fun platformData(platformData: PlatformData) = platformData(JsonField.of(platformData))

        /**
         * Sets [Builder.platformData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformData] with a well-typed [PlatformData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun platformData(platformData: JsonField<PlatformData>) = apply {
            this.platformData = platformData
        }

        /** The ID of the associated post */
        fun postId(postId: String) = postId(JsonField.of(postId))

        /**
         * Sets [Builder.postId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun postId(postId: JsonField<String>) = apply { this.postId = postId }

        /** The ID of the associated social account */
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

        /** Indicates if the post was successful */
        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

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
         * Returns an immutable instance of [SocialPostResult].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .details()
         * .error()
         * .platformData()
         * .postId()
         * .socialAccountId()
         * .success()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SocialPostResult =
            SocialPostResult(
                checkRequired("id", id),
                checkRequired("details", details),
                checkRequired("error", error),
                checkRequired("platformData", platformData),
                checkRequired("postId", postId),
                checkRequired("socialAccountId", socialAccountId),
                checkRequired("success", success),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SocialPostResult = apply {
        if (validated) {
            return@apply
        }

        id()
        platformData().validate()
        postId()
        socialAccountId()
        success()
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
        (if (id.asKnown() == null) 0 else 1) +
            (platformData.asKnown()?.validity() ?: 0) +
            (if (postId.asKnown() == null) 0 else 1) +
            (if (socialAccountId.asKnown() == null) 0 else 1) +
            (if (success.asKnown() == null) 0 else 1)

    /** Platform-specific data */
    class PlatformData
    private constructor(
        private val id: JsonField<String>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(id, url, mutableMapOf())

        /**
         * Platform-specific ID
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): String? = id.getNullable("id")

        /**
         * URL of the posted content
         *
         * @throws PostForMeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun url(): String? = url.getNullable("url")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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

            /** Returns a mutable builder for constructing an instance of [PlatformData]. */
            fun builder() = Builder()
        }

        /** A builder for [PlatformData]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(platformData: PlatformData) = apply {
                id = platformData.id
                url = platformData.url
                additionalProperties = platformData.additionalProperties.toMutableMap()
            }

            /** Platform-specific ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** URL of the posted content */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [PlatformData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PlatformData = PlatformData(id, url, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): PlatformData = apply {
            if (validated) {
                return@apply
            }

            id()
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
        internal fun validity(): Int =
            (if (id.asKnown() == null) 0 else 1) + (if (url.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PlatformData &&
                id == other.id &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, url, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlatformData{id=$id, url=$url, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SocialPostResult &&
            id == other.id &&
            details == other.details &&
            error == other.error &&
            platformData == other.platformData &&
            postId == other.postId &&
            socialAccountId == other.socialAccountId &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            details,
            error,
            platformData,
            postId,
            socialAccountId,
            success,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SocialPostResult{id=$id, details=$details, error=$error, platformData=$platformData, postId=$postId, socialAccountId=$socialAccountId, success=$success, additionalProperties=$additionalProperties}"
}
