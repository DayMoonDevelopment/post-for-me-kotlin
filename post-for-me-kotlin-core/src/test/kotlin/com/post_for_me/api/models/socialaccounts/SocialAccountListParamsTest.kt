// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccounts

import com.post_for_me.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialAccountListParamsTest {

    @Test
    fun create() {
        SocialAccountListParams.builder()
            .addId("string")
            .addExternalId("string")
            .limit(0.0)
            .offset(0.0)
            .addPlatform("string")
            .addUsername("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SocialAccountListParams.builder()
                .addId("string")
                .addExternalId("string")
                .limit(0.0)
                .offset(0.0)
                .addPlatform("string")
                .addUsername("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", listOf("string").joinToString(","))
                    .put("external_id", listOf("string").joinToString(","))
                    .put("limit", "0.0")
                    .put("offset", "0.0")
                    .put("platform", listOf("string").joinToString(","))
                    .put("username", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SocialAccountListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
