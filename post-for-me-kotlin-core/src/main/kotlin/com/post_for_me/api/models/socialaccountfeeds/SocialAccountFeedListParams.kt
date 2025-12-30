// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccountfeeds

import com.fasterxml.jackson.annotation.JsonCreator
import com.post_for_me.api.core.Enum
import com.post_for_me.api.core.JsonField
import com.post_for_me.api.core.Params
import com.post_for_me.api.core.http.Headers
import com.post_for_me.api.core.http.QueryParams
import com.post_for_me.api.core.toImmutable
import com.post_for_me.api.errors.PostForMeInvalidDataException
import java.util.Objects

/** Get a paginated result for the social account based on the applied filters */
class SocialAccountFeedListParams
private constructor(
    private val socialAccountId: String?,
    private val cursor: String?,
    private val expand: List<Expand>?,
    private val externalPostId: List<String>?,
    private val limit: Double?,
    private val platformPostId: List<String>?,
    private val socialPostId: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun socialAccountId(): String? = socialAccountId

    /** Cursor identifying next page of results */
    fun cursor(): String? = cursor

    /**
     * Expand additional data in the response. Currently supports: "metrics" to include post
     * analytics data.
     */
    fun expand(): List<Expand>? = expand

    /**
     * Filter by Post for Me Social Postexternal ID. Multiple values imply OR logic (e.g.,
     * ?external_post_id=xxxxxx&external_post_id=yyyyyy).
     */
    fun externalPostId(): List<String>? = externalPostId

    /**
     * Number of items to return; Note: some platforms will have different max limits, in the case
     * the provided limit is over the platform's limit we will return the max allowed by the
     * platform.
     */
    fun limit(): Double? = limit

    /**
     * Filter by the platform's id(s). Multiple values imply OR logic (e.g.,
     * ?social_post_id=spr_xxxxxx&social_post_id=spr_yyyyyy).
     */
    fun platformPostId(): List<String>? = platformPostId

    /**
     * Filter by Post for Me Social Post id(s). Multiple values imply OR logic (e.g.,
     * ?social_post_id=sp_xxxxxx&social_post_id=sp_yyyyyy).
     */
    fun socialPostId(): List<String>? = socialPostId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): SocialAccountFeedListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [SocialAccountFeedListParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [SocialAccountFeedListParams]. */
    class Builder internal constructor() {

        private var socialAccountId: String? = null
        private var cursor: String? = null
        private var expand: MutableList<Expand>? = null
        private var externalPostId: MutableList<String>? = null
        private var limit: Double? = null
        private var platformPostId: MutableList<String>? = null
        private var socialPostId: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(socialAccountFeedListParams: SocialAccountFeedListParams) = apply {
            socialAccountId = socialAccountFeedListParams.socialAccountId
            cursor = socialAccountFeedListParams.cursor
            expand = socialAccountFeedListParams.expand?.toMutableList()
            externalPostId = socialAccountFeedListParams.externalPostId?.toMutableList()
            limit = socialAccountFeedListParams.limit
            platformPostId = socialAccountFeedListParams.platformPostId?.toMutableList()
            socialPostId = socialAccountFeedListParams.socialPostId?.toMutableList()
            additionalHeaders = socialAccountFeedListParams.additionalHeaders.toBuilder()
            additionalQueryParams = socialAccountFeedListParams.additionalQueryParams.toBuilder()
        }

        fun socialAccountId(socialAccountId: String?) = apply {
            this.socialAccountId = socialAccountId
        }

        /** Cursor identifying next page of results */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /**
         * Expand additional data in the response. Currently supports: "metrics" to include post
         * analytics data.
         */
        fun expand(expand: List<Expand>?) = apply { this.expand = expand?.toMutableList() }

        /**
         * Adds a single [Expand] to [Builder.expand].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExpand(expand: Expand) = apply {
            this.expand = (this.expand ?: mutableListOf()).apply { add(expand) }
        }

        /**
         * Filter by Post for Me Social Postexternal ID. Multiple values imply OR logic (e.g.,
         * ?external_post_id=xxxxxx&external_post_id=yyyyyy).
         */
        fun externalPostId(externalPostId: List<String>?) = apply {
            this.externalPostId = externalPostId?.toMutableList()
        }

        /**
         * Adds a single [String] to [Builder.externalPostId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExternalPostId(externalPostId: String) = apply {
            this.externalPostId =
                (this.externalPostId ?: mutableListOf()).apply { add(externalPostId) }
        }

        /**
         * Number of items to return; Note: some platforms will have different max limits, in the
         * case the provided limit is over the platform's limit we will return the max allowed by
         * the platform.
         */
        fun limit(limit: Double?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Double) = limit(limit as Double?)

        /**
         * Filter by the platform's id(s). Multiple values imply OR logic (e.g.,
         * ?social_post_id=spr_xxxxxx&social_post_id=spr_yyyyyy).
         */
        fun platformPostId(platformPostId: List<String>?) = apply {
            this.platformPostId = platformPostId?.toMutableList()
        }

        /**
         * Adds a single [String] to [Builder.platformPostId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPlatformPostId(platformPostId: String) = apply {
            this.platformPostId =
                (this.platformPostId ?: mutableListOf()).apply { add(platformPostId) }
        }

        /**
         * Filter by Post for Me Social Post id(s). Multiple values imply OR logic (e.g.,
         * ?social_post_id=sp_xxxxxx&social_post_id=sp_yyyyyy).
         */
        fun socialPostId(socialPostId: List<String>?) = apply {
            this.socialPostId = socialPostId?.toMutableList()
        }

        /**
         * Adds a single [String] to [Builder.socialPostId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSocialPostId(socialPostId: String) = apply {
            this.socialPostId = (this.socialPostId ?: mutableListOf()).apply { add(socialPostId) }
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
         * Returns an immutable instance of [SocialAccountFeedListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SocialAccountFeedListParams =
            SocialAccountFeedListParams(
                socialAccountId,
                cursor,
                expand?.toImmutable(),
                externalPostId?.toImmutable(),
                limit,
                platformPostId?.toImmutable(),
                socialPostId?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> socialAccountId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                cursor?.let { put("cursor", it) }
                expand?.let { put("expand", it.joinToString(",") { it.toString() }) }
                externalPostId?.let { put("external_post_id", it.joinToString(",")) }
                limit?.let { put("limit", it.toString()) }
                platformPostId?.let { put("platform_post_id", it.joinToString(",")) }
                socialPostId?.let { put("social_post_id", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    class Expand @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val METRICS = of("metrics")

            fun of(value: String) = Expand(JsonField.of(value))
        }

        /** An enum containing [Expand]'s known values. */
        enum class Known {
            METRICS
        }

        /**
         * An enum containing [Expand]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Expand] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            METRICS,
            /** An enum member indicating that [Expand] was instantiated with an unknown value. */
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
                METRICS -> Value.METRICS
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
                METRICS -> Known.METRICS
                else -> throw PostForMeInvalidDataException("Unknown Expand: $value")
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

        fun validate(): Expand = apply {
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

            return other is Expand && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SocialAccountFeedListParams &&
            socialAccountId == other.socialAccountId &&
            cursor == other.cursor &&
            expand == other.expand &&
            externalPostId == other.externalPostId &&
            limit == other.limit &&
            platformPostId == other.platformPostId &&
            socialPostId == other.socialPostId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            socialAccountId,
            cursor,
            expand,
            externalPostId,
            limit,
            platformPostId,
            socialPostId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SocialAccountFeedListParams{socialAccountId=$socialAccountId, cursor=$cursor, expand=$expand, externalPostId=$externalPostId, limit=$limit, platformPostId=$platformPostId, socialPostId=$socialPostId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
