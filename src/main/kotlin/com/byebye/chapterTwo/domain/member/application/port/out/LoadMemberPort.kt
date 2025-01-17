package com.byebye.chapterTwo.domain.member.application.port.out

import com.byebye.chapterTwo.domain.member.application.model.Member

interface LoadMemberPort {

    fun loadMemberWithId(id: String): Member

    fun loadMemberWithName(name: String): Member

}