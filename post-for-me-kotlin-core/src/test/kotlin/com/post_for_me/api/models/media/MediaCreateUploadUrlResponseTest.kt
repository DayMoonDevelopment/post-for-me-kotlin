// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.media

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaCreateUploadUrlResponseTest {

    @Test
    fun create() {
        val mediaCreateUploadUrlResponse =
            MediaCreateUploadUrlResponse.builder()
                .mediaUrl("media_url")
                .uploadUrl("upload_url")
                .build()

        assertThat(mediaCreateUploadUrlResponse.mediaUrl()).isEqualTo("media_url")
        assertThat(mediaCreateUploadUrlResponse.uploadUrl()).isEqualTo("upload_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaCreateUploadUrlResponse =
            MediaCreateUploadUrlResponse.builder()
                .mediaUrl("media_url")
                .uploadUrl("upload_url")
                .build()

        val roundtrippedMediaCreateUploadUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaCreateUploadUrlResponse),
                jacksonTypeRef<MediaCreateUploadUrlResponse>(),
            )

        assertThat(roundtrippedMediaCreateUploadUrlResponse).isEqualTo(mediaCreateUploadUrlResponse)
    }
}
