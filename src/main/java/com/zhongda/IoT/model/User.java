package com.zhongda.IoT.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;


@Entity
@Table(name = "user")
public class User{

   //set private static final long serialVersionUID = 1L;
    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增长
    private Long id;

    @Column(name = "uid",nullable = false,unique = true)
    private String uid;

    @Column(name = "nickname",nullable = false)
    private String nickname;

    @Column(name = "avatar",nullable = true)
    private String avatar;

    public Long getId(){
        return id;
    }
    public String getuid(){
        return uid;
    }
    public String getNickName(){
        return nickname;
    } 
    public void setNickName(String nickname)
    {
        this.nickname = nickname;
    }
     
}
