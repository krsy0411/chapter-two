package com.byebye.chapterTwo.domain.member.application.service

import com.byebye.chapterTwo.domain.member.adapter.out.mapper.MemberMapper
import com.byebye.chapterTwo.domain.member.adapter.out.repository.MemberRepository
import com.byebye.chapterTwo.domain.member.application.exception.MemberErrorCode
import com.byebye.chapterTwo.global.auth.exception.CustomException
import com.byebye.chapterTwo.global.auth.jwt.JwtUserDetails
import org.springframework.data.repository.findByIdOrNull
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class UserDetailsServiceImpl(
    private val memberRepository : MemberRepository,
    private val memberMapper: MemberMapper
): UserDetailsService {
    override fun loadUserByUsername(username: String?): UserDetails {
        username?: throw CustomException(MemberErrorCode.MEMBER_NOT_FOUND)

        val memberEntity = memberRepository
            .findByName(username)
            ?: throw CustomException(MemberErrorCode.MEMBER_NOT_FOUND)

        val member = memberMapper.toDomain(memberEntity)

        return JwtUserDetails(member)
    }
}