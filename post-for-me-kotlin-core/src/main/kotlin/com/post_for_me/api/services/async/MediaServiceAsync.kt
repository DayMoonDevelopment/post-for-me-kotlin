// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.post_for_me.api.core.ClientOptions
import com.post_for_me.api.core.RequestOptions
import com.post_for_me.api.core.http.HttpResponseFor
import com.post_for_me.api.models.media.MediaCreateUploadUrlParams
import com.post_for_me.api.models.media.MediaCreateUploadUrlResponse

interface MediaServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MediaServiceAsync

    /**
     * To upload media to attach to your post, make a `POST` request to the
     * `/media/create-upload-url` endpoint.
     *
     * You'll receive the public url of your media item (which can be used when making a post) and
     * will include an `upload_url` which is a signed URL of the storage location for uploading your
     * file to.
     *
     * This URL is unique and publicly signed for a short time, so make sure to upload your files in
     * a timely manner.
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
    suspend fun createUploadUrl(
        params: MediaCreateUploadUrlParams = MediaCreateUploadUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaCreateUploadUrlResponse

    /** @see createUploadUrl */
    suspend fun createUploadUrl(requestOptions: RequestOptions): MediaCreateUploadUrlResponse =
        createUploadUrl(MediaCreateUploadUrlParams.none(), requestOptions)

    /** A view of [MediaServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MediaServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/media/create-upload-url`, but is otherwise the
         * same as [MediaServiceAsync.createUploadUrl].
         */
        @MustBeClosed
        suspend fun createUploadUrl(
            params: MediaCreateUploadUrlParams = MediaCreateUploadUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaCreateUploadUrlResponse>

        /** @see createUploadUrl */
        @MustBeClosed
        suspend fun createUploadUrl(
            requestOptions: RequestOptions
        ): HttpResponseFor<MediaCreateUploadUrlResponse> =
            createUploadUrl(MediaCreateUploadUrlParams.none(), requestOptions)
    }
}
