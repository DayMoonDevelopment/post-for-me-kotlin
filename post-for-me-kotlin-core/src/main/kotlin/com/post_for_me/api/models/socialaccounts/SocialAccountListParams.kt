// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccounts

import com.post_for_me.api.core.Params
import com.post_for_me.api.core.http.Headers
import com.post_for_me.api.core.http.QueryParams
import com.post_for_me.api.core.toImmutable
import java.util.Objects

/** Get a paginated result for social accounts based on the applied filters */
class SocialAccountListParams
private constructor(
    private val id: List<String>?,
    private val externalId: List<String>?,
    private val limit: Double?,
    private val offset: Double?,
    private val platform: List<String>?,
    private val username: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by id(s). Multiple values imply OR logic (e.g., ?id=spc_xxxxxx&id=spc_yyyyyy). */
    fun id(): List<String>? = id

    /**
     * Filter by externalId(s). Multiple values imply OR logic (e.g.,
     * ?externalId=test&externalId=test2).
     */
    fun externalId(): List<String>? = externalId

    /** Number of items to return */
    fun limit(): Double? = limit

    /** Number of items to skip */
    fun offset(): Double? = offset

    /**
     * Filter by platform(s). Multiple values imply OR logic (e.g., ?platform=x&platform=twitter).
     */
    fun platform(): List<String>? = platform

    /**
     * Filter by username(s). Multiple values imply OR logic (e.g., ?username=test&username=test2).
     */
    fun username(): List<String>? = username

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): SocialAccountListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SocialAccountListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [SocialAccountListParams]. */
    class Builder internal constructor() {

        private var id: MutableList<String>? = null
        private var externalId: MutableList<String>? = null
        private var limit: Double? = null
        private var offset: Double? = null
        private var platform: MutableList<String>? = null
        private var username: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(socialAccountListParams: SocialAccountListParams) = apply {
            id = socialAccountListParams.id?.toMutableList()
            externalId = socialAccountListParams.externalId?.toMutableList()
            limit = socialAccountListParams.limit
            offset = socialAccountListParams.offset
            platform = socialAccountListParams.platform?.toMutableList()
            username = socialAccountListParams.username?.toMutableList()
            additionalHeaders = socialAccountListParams.additionalHeaders.toBuilder()
            additionalQueryParams = socialAccountListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by id(s). Multiple values imply OR logic (e.g., ?id=spc_xxxxxx&id=spc_yyyyyy). */
        fun id(id: List<String>?) = apply { this.id = id?.toMutableList() }

        /**
         * Adds a single [String] to [Builder.id].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { this.id = (this.id ?: mutableListOf()).apply { add(id) } }

        /**
         * Filter by externalId(s). Multiple values imply OR logic (e.g.,
         * ?externalId=test&externalId=test2).
         */
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

        /**
         * Filter by platform(s). Multiple values imply OR logic (e.g.,
         * ?platform=x&platform=twitter).
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

        /**
         * Filter by username(s). Multiple values imply OR logic (e.g.,
         * ?username=test&username=test2).
         */
        fun username(username: List<String>?) = apply { this.username = username?.toMutableList() }

        /**
         * Adds a single [String] to [Builder.username].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUsername(username: String) = apply {
            this.username = (this.username ?: mutableListOf()).apply { add(username) }
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
         * Returns an immutable instance of [SocialAccountListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SocialAccountListParams =
            SocialAccountListParams(
                id?.toImmutable(),
                externalId?.toImmutable(),
                limit,
                offset,
                platform?.toImmutable(),
                username?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                id?.let { put("id", it.joinToString(",")) }
                externalId?.let { put("external_id", it.joinToString(",")) }
                limit?.let { put("limit", it.toString()) }
                offset?.let { put("offset", it.toString()) }
                platform?.let { put("platform", it.joinToString(",")) }
                username?.let { put("username", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SocialAccountListParams && id == other.id && externalId == other.externalId && limit == other.limit && offset == other.offset && platform == other.platform && username == other.username && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, externalId, limit, offset, platform, username, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SocialAccountListParams{id=$id, externalId=$externalId, limit=$limit, offset=$offset, platform=$platform, username=$username, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
