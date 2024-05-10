package com.crio.coderHack.entity;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    
    private String userId;
    private String userName;
    private int score;
    private Set<Badges> badges;
    
}
