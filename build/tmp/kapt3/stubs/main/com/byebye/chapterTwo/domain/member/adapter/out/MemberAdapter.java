package com.byebye.chapterTwo.domain.member.adapter.out;

@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0017J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012H\u0017R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/byebye/chapterTwo/domain/member/adapter/out/MemberAdapter;", "Lcom/byebye/chapterTwo/domain/member/application/port/out/SaveMemberPort;", "Lcom/byebye/chapterTwo/domain/member/application/port/out/LoadMemberPort;", "Lcom/byebye/chapterTwo/domain/member/application/port/out/ExistMemberPort;", "memberRepository", "Lcom/byebye/chapterTwo/domain/member/adapter/out/repository/MemberRepository;", "memberMapper", "Lcom/byebye/chapterTwo/domain/member/adapter/out/mapper/MemberMapper;", "(Lcom/byebye/chapterTwo/domain/member/adapter/out/repository/MemberRepository;Lcom/byebye/chapterTwo/domain/member/adapter/out/mapper/MemberMapper;)V", "getMemberMapper", "()Lcom/byebye/chapterTwo/domain/member/adapter/out/mapper/MemberMapper;", "getMemberRepository", "()Lcom/byebye/chapterTwo/domain/member/adapter/out/repository/MemberRepository;", "existMemberWithName", "", "name", "", "loadMemberWithId", "Lcom/byebye/chapterTwo/domain/member/application/model/Member;", "id", "loadMemberWithName", "saveMember", "", "member", "chapterTwo"})
public class MemberAdapter implements com.byebye.chapterTwo.domain.member.application.port.out.SaveMemberPort, com.byebye.chapterTwo.domain.member.application.port.out.LoadMemberPort, com.byebye.chapterTwo.domain.member.application.port.out.ExistMemberPort {
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.domain.member.adapter.out.repository.MemberRepository memberRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.domain.member.adapter.out.mapper.MemberMapper memberMapper = null;
    
    public MemberAdapter(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.adapter.out.repository.MemberRepository memberRepository, @org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.adapter.out.mapper.MemberMapper memberMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.domain.member.adapter.out.repository.MemberRepository getMemberRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.domain.member.adapter.out.mapper.MemberMapper getMemberMapper() {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    @java.lang.Override()
    public void saveMember(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.application.model.Member member) {
    }
    
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.domain.member.application.model.Member loadMemberWithId(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.domain.member.application.model.Member loadMemberWithName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    @java.lang.Override()
    public boolean existMemberWithName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
}