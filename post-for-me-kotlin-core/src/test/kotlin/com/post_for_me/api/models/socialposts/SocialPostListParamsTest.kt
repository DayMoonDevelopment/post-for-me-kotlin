// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.post_for_me.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialPostListParamsTest {

    @Test
    fun create() {
        SocialPostListParams.builder()
            .addExternalId("string")
            .limit(0.0)
            .offset(0.0)
            .addPlatform(SocialPostListParams.Platform.BLUESKY)
            .addStatus(SocialPostListParams.Status.DRAFT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SocialPostListParams.builder()
                .addExternalId("string")
                .limit(0.0)
                .offset(0.0)
                .addPlatform(SocialPostListParams.Platform.BLUESKY)
                .addStatus(SocialPostListParams.Status.DRAFT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("external_id", listOf("string").joinToString(","))
                    .put("limit", "0.0")
                    .put("offset", "0.0")
                    .put("platform", listOf("bluesky").joinToString(","))
                    .put("status", listOf("draft").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SocialPostListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
