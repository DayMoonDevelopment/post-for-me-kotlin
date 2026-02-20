// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.blocking

import com.post_for_me.api.client.okhttp.PostForMeOkHttpClient
import com.post_for_me.api.models.socialaccountfeeds.SocialAccountFeedListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SocialAccountFeedServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = PostForMeOkHttpClient.builder().apiKey("My API Key").build()
        val socialAccountFeedService = client.socialAccountFeeds()

        val socialAccountFeeds =
            socialAccountFeedService.list(
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
