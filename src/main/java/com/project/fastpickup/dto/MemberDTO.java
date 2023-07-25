package com.project.fastpickup.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
    private String email;
    private String memberPw;
    private String memberName;
    private String memberPhone;
    private boolean store;
    private String storeName;
}
