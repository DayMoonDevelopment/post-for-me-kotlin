// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccountfeeds

import com.post_for_me.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialAccountFeedListParamsTest {

    @Test
    fun create() {
        SocialAccountFeedListParams.builder()
            .socialAccountId("social_account_id")
            .cursor("cursor")
            .addExpand(SocialAccountFeedListParams.Expand.METRICS)
            .addExternalPostId("string")
            .limit(0.0)
            .addPlatformPostId("string")
            .addSocialPostId("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SocialAccountFeedListParams.builder().socialAccountId("social_account_id").build()

        assertThat(params._pathParam(0)).isEqualTo("social_account_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SocialAccountFeedListParams.builder()
                .socialAccountId("social_account_id")
                .cursor("cursor")
                .addExpand(SocialAccountFeedListParams.Expand.METRICS)
                .addExternalPostId("string")
                .limit(0.0)
                .addPlatformPostId("string")
                .addSocialPostId("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("expand", listOf("metrics").joinToString(","))
                    .put("external_post_id", listOf("string").joinToString(","))
                    .put("limit", "0.0")
                    .put("platform_post_id", listOf("string").joinToString(","))
                    .put("social_post_id", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SocialAccountFeedListParams.builder().socialAccountId("social_account_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
