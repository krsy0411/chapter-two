package com.byebye.chapterTwo.domain.member.adapter.`in`.dto.req

import com.fasterxml.jackson.annotation.JsonProperty

data class RegisterMemberRequest (

    @JsonProperty("id") val id: String,
    @JsonProperty("name") val name: String,
    @JsonProperty("password") val password: String,
    @JsonProperty("phoneNum") val phoneNum: String

)