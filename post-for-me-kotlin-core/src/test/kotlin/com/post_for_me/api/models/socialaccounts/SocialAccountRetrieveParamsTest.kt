// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialAccountRetrieveParamsTest {

    @Test
    fun create() {
        SocialAccountRetrieveParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = SocialAccountRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
