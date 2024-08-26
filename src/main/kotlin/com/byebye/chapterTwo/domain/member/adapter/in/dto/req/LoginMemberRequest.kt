package com.byebye.chapterTwo.domain.member.adapter.`in`.dto.req

import com.fasterxml.jackson.annotation.JsonProperty

data class LoginMemberRequest (

    @JsonProperty("id") val id: String,
    @JsonProperty("password") val password: String

)