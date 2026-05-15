// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.async

import com.post_for_me.api.client.okhttp.PostForMeOkHttpClientAsync
import com.post_for_me.api.models.socialpostresults.SocialPostResultListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SocialPostResultServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = PostForMeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val socialPostResultServiceAsync = client.socialPostResults()

        val socialPostResult = socialPostResultServiceAsync.retrieve("id")

        socialPostResult.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = PostForMeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val socialPostResultServiceAsync = client.socialPostResults()

        val socialPostResults =
            socialPostResultServiceAsync.list(
                SocialPostResultListParams.builder()
                    .limit(0.0)
                    .offset(0.0)
                    .addPlatform("string")
                    .addPostId("string")
                    .addSocialAccountId("string")
                    .build()
            )

        socialPostResults.validate()
    }
}
