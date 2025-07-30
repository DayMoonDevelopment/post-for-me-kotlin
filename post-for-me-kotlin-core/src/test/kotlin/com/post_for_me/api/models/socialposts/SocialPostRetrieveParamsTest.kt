// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialPostRetrieveParamsTest {

    @Test
    fun create() {
        SocialPostRetrieveParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = SocialPostRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
