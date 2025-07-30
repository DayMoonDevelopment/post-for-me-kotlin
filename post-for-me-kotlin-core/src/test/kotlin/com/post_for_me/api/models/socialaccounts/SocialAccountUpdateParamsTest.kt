// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialAccountUpdateParamsTest {

    @Test
    fun create() {
        SocialAccountUpdateParams.builder()
            .id("id")
            .externalId("external_id")
            .username("username")
            .build()
    }

    @Test
    fun pathParams() {
        val params = SocialAccountUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SocialAccountUpdateParams.builder()
                .id("id")
                .externalId("external_id")
                .username("username")
                .build()

        val body = params._body()

        assertThat(body.externalId()).isEqualTo("external_id")
        assertThat(body.username()).isEqualTo("username")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SocialAccountUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
