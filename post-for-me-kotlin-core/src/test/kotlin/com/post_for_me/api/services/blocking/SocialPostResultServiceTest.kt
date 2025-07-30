// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.blocking

import com.post_for_me.api.TestServerExtension
import com.post_for_me.api.client.okhttp.PostForMeOkHttpClient
import com.post_for_me.api.models.socialpostresults.SocialPostResultListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SocialPostResultServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            PostForMeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialPostResultService = client.socialPostResults()

        val socialPostResult = socialPostResultService.retrieve("id")

        socialPostResult.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            PostForMeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialPostResultService = client.socialPostResults()

        val socialPostResults =
            socialPostResultService.list(
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
