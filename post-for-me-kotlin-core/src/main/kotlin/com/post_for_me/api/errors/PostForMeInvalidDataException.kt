package com.post_for_me.api.errors

class PostForMeInvalidDataException(message: String? = null, cause: Throwable? = null) :
    PostForMeException(message, cause)
