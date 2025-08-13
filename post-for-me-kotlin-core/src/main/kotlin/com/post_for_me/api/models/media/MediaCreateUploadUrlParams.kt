// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.media

import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.Params
import com.post_for_me.api.core.http.Headers
import com.post_for_me.api.core.http.QueryParams
import com.post_for_me.api.core.toImmutable
import java.util.Objects

/**
 * To upload media to attach to your post, make a `POST` request to the `/media/create-upload-url`
 * endpoint.
 *
 * You'll receive the public url of your media item (which can be used when making a post) and will
 * include an `upload_url` which is a signed URL of the storage location for uploading your file to.
 *
 * This URL is unique and publicly signed for a short time, so make sure to upload your files in a
 * timely manner.
 *
 * **Example flow using JavaScript and the Fetch API:**
 *
 * **Request an upload URL**
 *
 * ```js
 * // Step 1: Request an upload URL from your API
 * const response = await fetch(
 *   "https://api.postforme.dev/v1/media/create-upload-url",
 *   {
 *     method: "POST",
 *     headers: {
 *       "Content-Type": "application/json",
 *     },
 *   }
 * );
 *
 * const { media_url, upload_url } = await response.json();
 * ```
 *
 * **Upload your file to the signed URL**
 *
 * ```js
 * // Step 2: Upload your file to the signed URL
 * const file = &#47;* your File or Blob object, e.g., from an <input type="file"> *&#47;;
 * await fetch(upload_url, {
 *   method: 'PUT',
 *   headers: {
 *     'Content-Type': 'image/jpeg'
 *   },
 *   body: file
 * });
 * ```
 *
 * **Use the `media_url` when creating your post**
 *
 *     ```js
 *     // Step 3: Use the `media_url` when creating your post
 *     const response = await fetch('https://api.postforme.dev/v1/social-posts', {
 *       method: 'POST',
 *       headers: {
 *         'Content-Type': 'application/json'
 *       },
 *       body: JSON.stringify({
 *         social_accounts: ['spc_...', ...],
 *         caption: 'My caption',
 *         media: [
 *           {
 *             url: media_url
 *           }
 *         ]
 *       })
 *     });
 *     ```
 */
class MediaCreateUploadUrlParams
private constructor(
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    /** Additional body properties to send with the request. */
    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): MediaCreateUploadUrlParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [MediaCreateUploadUrlParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [MediaCreateUploadUrlParams]. */
    class Builder internal constructor() {

        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(mediaCreateUploadUrlParams: MediaCreateUploadUrlParams) = apply {
            additionalHeaders = mediaCreateUploadUrlParams.additionalHeaders.toBuilder()
            additionalQueryParams = mediaCreateUploadUrlParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                mediaCreateUploadUrlParams.additionalBodyProperties.toMutableMap()
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        /**
         * Returns an immutable instance of [MediaCreateUploadUrlParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MediaCreateUploadUrlParams =
            MediaCreateUploadUrlParams(
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Map<String, JsonValue>? = additionalBodyProperties.ifEmpty { null }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MediaCreateUploadUrlParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int =
        Objects.hash(additionalHeaders, additionalQueryParams, additionalBodyProperties)

    override fun toString() =
        "MediaCreateUploadUrlParams{additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
