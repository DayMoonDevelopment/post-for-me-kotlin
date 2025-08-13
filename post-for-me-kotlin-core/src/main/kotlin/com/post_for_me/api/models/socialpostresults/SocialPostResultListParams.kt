// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialpostresults

import com.post_for_me.api.core.Params
import com.post_for_me.api.core.http.Headers
import com.post_for_me.api.core.http.QueryParams
import com.post_for_me.api.core.toImmutable
import java.util.Objects

/** Get a paginated result for post results based on the applied filters */
class SocialPostResultListParams
private constructor(
    private val limit: Double?,
    private val offset: Double?,
    private val platform: List<String>?,
    private val postId: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Number of items to return */
    fun limit(): Double? = limit

    /** Number of items to skip */
    fun offset(): Double? = offset

    /**
     * Filter by platform(s). Multiple values imply OR logic (e.g., ?platform=x&platform=facebook).
     */
    fun platform(): List<String>? = platform

    /** Filter by post IDs. Multiple values imply OR logic (e.g., ?post_id=123&post_id=456). */
    fun postId(): List<String>? = postId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): SocialPostResultListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [SocialPostResultListParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [SocialPostResultListParams]. */
    class Builder internal constructor() {

        private var limit: Double? = null
        private var offset: Double? = null
        private var platform: MutableList<String>? = null
        private var postId: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(socialPostResultListParams: SocialPostResultListParams) = apply {
            limit = socialPostResultListParams.limit
            offset = socialPostResultListParams.offset
            platform = socialPostResultListParams.platform?.toMutableList()
            postId = socialPostResultListParams.postId?.toMutableList()
            additionalHeaders = socialPostResultListParams.additionalHeaders.toBuilder()
            additionalQueryParams = socialPostResultListParams.additionalQueryParams.toBuilder()
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

        /**
         * Filter by platform(s). Multiple values imply OR logic (e.g.,
         * ?platform=x&platform=facebook).
         */
        fun platform(platform: List<String>?) = apply { this.platform = platform?.toMutableList() }

        /**
         * Adds a single [String] to [Builder.platform].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPlatform(platform: String) = apply {
            this.platform = (this.platform ?: mutableListOf()).apply { add(platform) }
        }

        /** Filter by post IDs. Multiple values imply OR logic (e.g., ?post_id=123&post_id=456). */
        fun postId(postId: List<String>?) = apply { this.postId = postId?.toMutableList() }

        /**
         * Adds a single [String] to [Builder.postId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPostId(postId: String) = apply {
            this.postId = (this.postId ?: mutableListOf()).apply { add(postId) }
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
         * Returns an immutable instance of [SocialPostResultListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SocialPostResultListParams =
            SocialPostResultListParams(
                limit,
                offset,
                platform?.toImmutable(),
                postId?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                limit?.let { put("limit", it.toString()) }
                offset?.let { put("offset", it.toString()) }
                platform?.let { put("platform", it.joinToString(",")) }
                postId?.let { put("post_id", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SocialPostResultListParams &&
            limit == other.limit &&
            offset == other.offset &&
            platform == other.platform &&
            postId == other.postId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(limit, offset, platform, postId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SocialPostResultListParams{limit=$limit, offset=$offset, platform=$platform, postId=$postId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
