// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.async

import com.post_for_me.api.TestServerExtension
import com.post_for_me.api.client.okhttp.PostForMeOkHttpClientAsync
import com.post_for_me.api.models.socialaccountfeeds.SocialAccountFeedListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SocialAccountFeedServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            PostForMeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialAccountFeedServiceAsync = client.socialAccountFeeds()

        val socialAccountFeeds =
            socialAccountFeedServiceAsync.list(
                SocialAccountFeedListParams.builder()
                    .socialAccountId("social_account_id")
                    .cursor("cursor")
                    .addExpand(SocialAccountFeedListParams.Expand.METRICS)
                    .addExternalPostId("string")
                    .limit(0.0)
                    .addPlatformPostId("string")
                    .addSocialPostId("string")
                    .build()
            )

        socialAccountFeeds.validate()
    }
}
