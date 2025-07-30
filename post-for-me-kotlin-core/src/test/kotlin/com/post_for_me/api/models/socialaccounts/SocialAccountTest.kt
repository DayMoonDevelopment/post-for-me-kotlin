// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialAccountTest {

    @Test
    fun create() {
        val socialAccount =
            SocialAccount.builder()
                .id("id")
                .externalId("external_id")
                .platform("platform")
                .status(SocialAccount.Status.CONNECTED)
                .username("username")
                .build()

        assertThat(socialAccount.id()).isEqualTo("id")
        assertThat(socialAccount.externalId()).isEqualTo("external_id")
        assertThat(socialAccount.platform()).isEqualTo("platform")
        assertThat(socialAccount.status()).isEqualTo(SocialAccount.Status.CONNECTED)
        assertThat(socialAccount.username()).isEqualTo("username")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val socialAccount =
            SocialAccount.builder()
                .id("id")
                .externalId("external_id")
                .platform("platform")
                .status(SocialAccount.Status.CONNECTED)
                .username("username")
                .build()

        val roundtrippedSocialAccount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(socialAccount),
                jacksonTypeRef<SocialAccount>(),
            )

        assertThat(roundtrippedSocialAccount).isEqualTo(socialAccount)
    }
}
