package com.peepalsoft.app.entity.notes.enums;

public enum MemberRoleEnum {
    TEACHER("TEACHER"),
    STUDENT("STUDENT");

    private String code;

    MemberRoleEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }


    public static MemberRoleEnum fromCode(String userRole) {
        for (MemberRoleEnum uRole : MemberRoleEnum.values()) {
            if (uRole.getCode().equals(userRole)) {
                return uRole;
            }
        }
        throw new UnsupportedOperationException("The code " + userRole + " is not supported!");
    }
}

