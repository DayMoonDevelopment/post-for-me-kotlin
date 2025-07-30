// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialAccountCreateAuthUrlResponseTest {

    @Test
    fun create() {
        val socialAccountCreateAuthUrlResponse =
            SocialAccountCreateAuthUrlResponse.builder().platform("platform").url("url").build()

        assertThat(socialAccountCreateAuthUrlResponse.platform()).isEqualTo("platform")
        assertThat(socialAccountCreateAuthUrlResponse.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val socialAccountCreateAuthUrlResponse =
            SocialAccountCreateAuthUrlResponse.builder().platform("platform").url("url").build()

        val roundtrippedSocialAccountCreateAuthUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(socialAccountCreateAuthUrlResponse),
                jacksonTypeRef<SocialAccountCreateAuthUrlResponse>(),
            )

        assertThat(roundtrippedSocialAccountCreateAuthUrlResponse)
            .isEqualTo(socialAccountCreateAuthUrlResponse)
    }
}
