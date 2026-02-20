// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccounts

import com.fasterxml.jackson.annotation.JsonCreator
import com.post_for_me.api.core.Enum
import com.post_for_me.api.core.JsonField
import com.post_for_me.api.core.Params
import com.post_for_me.api.core.http.Headers
import com.post_for_me.api.core.http.QueryParams
import com.post_for_me.api.core.toImmutable
import com.post_for_me.api.errors.PostForMeInvalidDataException
import java.util.Objects

/** Get a paginated result for social accounts based on the applied filters */
class SocialAccountListParams
private constructor(
    private val id: List<String>?,
    private val externalId: List<String>?,
    private val limit: Double?,
    private val offset: Double?,
    private val platform: List<String>?,
    private val status: List<Status>?,
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
     * Filter by platform(s). Multiple values imply OR logic (e.g., ?platform=x&platform=facebook).
     */
    fun platform(): List<String>? = platform

    /**
     * Filter by status. Multiple values imply OR logic (e.g.,
     * ?status=connected&status=disconnected).
     */
    fun status(): List<Status>? = status

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
        private var status: MutableList<Status>? = null
        private var username: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(socialAccountListParams: SocialAccountListParams) = apply {
            id = socialAccountListParams.id?.toMutableList()
            externalId = socialAccountListParams.externalId?.toMutableList()
            limit = socialAccountListParams.limit
            offset = socialAccountListParams.offset
            platform = socialAccountListParams.platform?.toMutableList()
            status = socialAccountListParams.status?.toMutableList()
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

        /**
         * Filter by status. Multiple values imply OR logic (e.g.,
         * ?status=connected&status=disconnected).
         */
        fun status(status: List<Status>?) = apply { this.status = status?.toMutableList() }

        /**
         * Adds a single [Status] to [Builder.status].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatus(status: Status) = apply {
            this.status = (this.status ?: mutableListOf()).apply { add(status) }
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
                status?.toImmutable(),
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
                status?.let { put("status", it.joinToString(",") { it.toString() }) }
                username?.let { put("username", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

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

            val CONNECTED = of("connected")

            val DISCONNECTED = of("disconnected")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CONNECTED,
            DISCONNECTED,
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
            CONNECTED,
            DISCONNECTED,
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
                CONNECTED -> Value.CONNECTED
                DISCONNECTED -> Value.DISCONNECTED
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
                CONNECTED -> Known.CONNECTED
                DISCONNECTED -> Known.DISCONNECTED
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

        return other is SocialAccountListParams &&
            id == other.id &&
            externalId == other.externalId &&
            limit == other.limit &&
            offset == other.offset &&
            platform == other.platform &&
            status == other.status &&
            username == other.username &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            externalId,
            limit,
            offset,
            platform,
            status,
            username,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SocialAccountListParams{id=$id, externalId=$externalId, limit=$limit, offset=$offset, platform=$platform, status=$status, username=$username, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
