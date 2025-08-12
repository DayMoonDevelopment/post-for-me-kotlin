// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.async

import com.post_for_me.api.TestServerExtension
import com.post_for_me.api.client.okhttp.PostForMeOkHttpClientAsync
import com.post_for_me.api.models.socialpostresults.SocialPostResultListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SocialPostResultServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            PostForMeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialPostResultServiceAsync = client.socialPostResults()

        val socialPostResult = socialPostResultServiceAsync.retrieve("id")

        socialPostResult.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            PostForMeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialPostResultServiceAsync = client.socialPostResults()

        val socialPostResults =
            socialPostResultServiceAsync.list(
                SocialPostResultListParams.builder()
                    .limit(0.0)
                    .offset(0.0)
                    .addPlatform("string")
                    .addPostId("string")
                    .build()
            )

        socialPostResults.validate()
    }
}
