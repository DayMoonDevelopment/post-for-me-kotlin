// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.async

import com.post_for_me.api.client.okhttp.PostForMeOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MediaServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun createUploadUrl() {
        val client = PostForMeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mediaServiceAsync = client.media()

        val response = mediaServiceAsync.createUploadUrl()

        response.validate()
    }
}
