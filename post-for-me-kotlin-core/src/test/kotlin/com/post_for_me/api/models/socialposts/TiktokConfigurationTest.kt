// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TiktokConfigurationTest {

    @Test
    fun create() {
        val tiktokConfiguration =
            TiktokConfiguration.builder()
                .allowComment(true)
                .allowDuet(true)
                .allowStitch(true)
                .caption(JsonValue.from(mapOf<String, Any>()))
                .discloseBrandedContent(true)
                .discloseYourBrand(true)
                .addMedia("string")
                .privacyStatus("privacy_status")
                .title("title")
                .build()

        assertThat(tiktokConfiguration.allowComment()).isEqualTo(true)
        assertThat(tiktokConfiguration.allowDuet()).isEqualTo(true)
        assertThat(tiktokConfiguration.allowStitch()).isEqualTo(true)
        assertThat(tiktokConfiguration._caption()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(tiktokConfiguration.discloseBrandedContent()).isEqualTo(true)
        assertThat(tiktokConfiguration.discloseYourBrand()).isEqualTo(true)
        assertThat(tiktokConfiguration.media()).containsExactly("string")
        assertThat(tiktokConfiguration.privacyStatus()).isEqualTo("privacy_status")
        assertThat(tiktokConfiguration.title()).isEqualTo("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tiktokConfiguration =
            TiktokConfiguration.builder()
                .allowComment(true)
                .allowDuet(true)
                .allowStitch(true)
                .caption(JsonValue.from(mapOf<String, Any>()))
                .discloseBrandedContent(true)
                .discloseYourBrand(true)
                .addMedia("string")
                .privacyStatus("privacy_status")
                .title("title")
                .build()

        val roundtrippedTiktokConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tiktokConfiguration),
                jacksonTypeRef<TiktokConfiguration>(),
            )

        assertThat(roundtrippedTiktokConfiguration).isEqualTo(tiktokConfiguration)
    }
}
