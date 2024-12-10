package com.whatsapp.infra.graphql.generated.group.enums;

public enum GraphQLXWA2GroupParticipantRole {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    MEMBER("MEMBER"),
    ADMIN_MEMBER("ADMIN_MEMBER"),
    SUPERADMIN_MEMBER("SUPERADMIN_MEMBER");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    GraphQLXWA2GroupParticipantRole(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
