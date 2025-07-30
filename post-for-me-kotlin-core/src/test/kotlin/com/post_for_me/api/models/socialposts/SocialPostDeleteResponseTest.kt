// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialPostDeleteResponseTest {

    @Test
    fun create() {
        val socialPostDeleteResponse = SocialPostDeleteResponse.builder().success(true).build()

        assertThat(socialPostDeleteResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val socialPostDeleteResponse = SocialPostDeleteResponse.builder().success(true).build()

        val roundtrippedSocialPostDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(socialPostDeleteResponse),
                jacksonTypeRef<SocialPostDeleteResponse>(),
            )

        assertThat(roundtrippedSocialPostDeleteResponse).isEqualTo(socialPostDeleteResponse)
    }
}
