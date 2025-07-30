// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.blocking

import com.post_for_me.api.TestServerExtension
import com.post_for_me.api.client.okhttp.PostForMeOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MediaServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createUploadUrl() {
        val client =
            PostForMeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mediaService = client.media()

        val response = mediaService.createUploadUrl()

        response.validate()
    }
}
