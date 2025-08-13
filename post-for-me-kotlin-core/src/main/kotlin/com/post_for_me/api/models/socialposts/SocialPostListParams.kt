// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.fasterxml.jackson.annotation.JsonCreator
import com.post_for_me.api.core.Enum
import com.post_for_me.api.core.JsonField
import com.post_for_me.api.core.Params
import com.post_for_me.api.core.http.Headers
import com.post_for_me.api.core.http.QueryParams
import com.post_for_me.api.core.toImmutable
import com.post_for_me.api.errors.PostForMeInvalidDataException
import java.util.Objects

/** Get a paginated result for posts based on the applied filters */
class SocialPostListParams
private constructor(
    private val externalId: List<String>?,
    private val limit: Double?,
    private val offset: Double?,
    private val platform: List<Platform>?,
    private val status: List<Status>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by external ID. Multiple values imply OR logic. */
    fun externalId(): List<String>? = externalId

    /** Number of items to return */
    fun limit(): Double? = limit

    /** Number of items to skip */
    fun offset(): Double? = offset

    /** Filter by platforms. Multiple values imply OR logic. */
    fun platform(): List<Platform>? = platform

    /** Filter by post status. Multiple values imply OR logic. */
    fun status(): List<Status>? = status

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): SocialPostListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SocialPostListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [SocialPostListParams]. */
    class Builder internal constructor() {

        private var externalId: MutableList<String>? = null
        private var limit: Double? = null
        private var offset: Double? = null
        private var platform: MutableList<Platform>? = null
        private var status: MutableList<Status>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(socialPostListParams: SocialPostListParams) = apply {
            externalId = socialPostListParams.externalId?.toMutableList()
            limit = socialPostListParams.limit
            offset = socialPostListParams.offset
            platform = socialPostListParams.platform?.toMutableList()
            status = socialPostListParams.status?.toMutableList()
            additionalHeaders = socialPostListParams.additionalHeaders.toBuilder()
            additionalQueryParams = socialPostListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by external ID. Multiple values imply OR logic. */
        fun externalId(externalId: List<String>?) = apply {
            this.externalId = externalId?.toMutableList()
        }

        /**
         * Adds a single [String] to [Builder.externalId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExternalId(externalId: String) = apply {
            this.externalId = (this.externalId ?: mutableListOf()).apply { add(externalId) }
        }

        /** Number of items to return */
        fun limit(limit: Double?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Double) = limit(limit as Double?)

        /** Number of items to skip */
        fun offset(offset: Double?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Double) = offset(offset as Double?)

        /** Filter by platforms. Multiple values imply OR logic. */
        fun platform(platform: List<Platform>?) = apply {
            this.platform = platform?.toMutableList()
        }

        /**
         * Adds a single [Platform] to [Builder.platform].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPlatform(platform: Platform) = apply {
            this.platform = (this.platform ?: mutableListOf()).apply { add(platform) }
        }

        /** Filter by post status. Multiple values imply OR logic. */
        fun status(status: List<Status>?) = apply { this.status = status?.toMutableList() }

        /**
         * Adds a single [Status] to [Builder.status].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatus(status: Status) = apply {
            this.status = (this.status ?: mutableListOf()).apply { add(status) }
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [SocialPostListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SocialPostListParams =
            SocialPostListParams(
                externalId?.toImmutable(),
                limit,
                offset,
                platform?.toImmutable(),
                status?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                externalId?.let { put("external_id", it.joinToString(",")) }
                limit?.let { put("limit", it.toString()) }
                offset?.let { put("offset", it.toString()) }
                platform?.let { put("platform", it.joinToString(",") { it.toString() }) }
                status?.let { put("status", it.joinToString(",") { it.toString() }) }
                putAll(additionalQueryParams)
            }
            .build()

    class Platform @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val BLUESKY = of("bluesky")

            val FACEBOOK = of("facebook")

            val INSTAGRAM = of("instagram")

            val LINKEDIN = of("linkedin")

            val PINTEREST = of("pinterest")

            val THREADS = of("threads")

            val TIKTOK = of("tiktok")

            val TWITTER = of("twitter")

            val YOUTUBE = of("youtube")

            fun of(value: String) = Platform(JsonField.of(value))
        }

        /** An enum containing [Platform]'s known values. */
        enum class Known {
            BLUESKY,
            FACEBOOK,
            INSTAGRAM,
            LINKEDIN,
            PINTEREST,
            THREADS,
            TIKTOK,
            TWITTER,
            YOUTUBE,
        }

        /**
         * An enum containing [Platform]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Platform] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BLUESKY,
            FACEBOOK,
            INSTAGRAM,
            LINKEDIN,
            PINTEREST,
            THREADS,
            TIKTOK,
            TWITTER,
            YOUTUBE,
            /** An enum member indicating that [Platform] was instantiated with an unknown value. */
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
                BLUESKY -> Value.BLUESKY
                FACEBOOK -> Value.FACEBOOK
                INSTAGRAM -> Value.INSTAGRAM
                LINKEDIN -> Value.LINKEDIN
                PINTEREST -> Value.PINTEREST
                THREADS -> Value.THREADS
                TIKTOK -> Value.TIKTOK
                TWITTER -> Value.TWITTER
                YOUTUBE -> Value.YOUTUBE
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
                BLUESKY -> Known.BLUESKY
                FACEBOOK -> Known.FACEBOOK
                INSTAGRAM -> Known.INSTAGRAM
                LINKEDIN -> Known.LINKEDIN
                PINTEREST -> Known.PINTEREST
                THREADS -> Known.THREADS
                TIKTOK -> Known.TIKTOK
                TWITTER -> Known.TWITTER
                YOUTUBE -> Known.YOUTUBE
                else -> throw PostForMeInvalidDataException("Unknown Platform: $value")
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

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val DRAFT = of("draft")

            val SCHEDULED = of("scheduled")

            val PROCESSING = of("processing")

            val PROCESSED = of("processed")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DRAFT,
            SCHEDULED,
            PROCESSING,
            PROCESSED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DRAFT,
            SCHEDULED,
            PROCESSING,
            PROCESSED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                DRAFT -> Value.DRAFT
                SCHEDULED -> Value.SCHEDULED
                PROCESSING -> Value.PROCESSING
                PROCESSED -> Value.PROCESSED
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
                DRAFT -> Known.DRAFT
                SCHEDULED -> Known.SCHEDULED
                PROCESSING -> Known.PROCESSING
                PROCESSED -> Known.PROCESSED
                else -> throw PostForMeInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SocialPostListParams &&
            externalId == other.externalId &&
            limit == other.limit &&
            offset == other.offset &&
            platform == other.platform &&
            status == other.status &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            externalId,
            limit,
            offset,
            platform,
            status,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SocialPostListParams{externalId=$externalId, limit=$limit, offset=$offset, platform=$platform, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
