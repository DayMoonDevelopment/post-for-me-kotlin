// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialpostresults

import com.post_for_me.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialPostResultListParamsTest {

    @Test
    fun create() {
        SocialPostResultListParams.builder()
            .limit(0.0)
            .offset(0.0)
            .addPlatform("string")
            .addPostId("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SocialPostResultListParams.builder()
                .limit(0.0)
                .offset(0.0)
                .addPlatform("string")
                .addPostId("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "0.0")
                    .put("offset", "0.0")
                    .put("platform", listOf("string").joinToString(","))
                    .put("post_id", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SocialPostResultListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
