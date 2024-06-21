package com.spring2go.easyevent.custom;

import com.spring2go.easyevent.entity.UserEntity;
import lombok.Data;

@Data
public class AuthContext {
    private UserEntity userEntity;
    private boolean tokenInvalid;

    public void ensureAuthenticated() {
        if (tokenInvalid) throw new RuntimeException("Invalid token!");
        if (userEntity == null) throw new RuntimeException("Login first!");
    }
}
