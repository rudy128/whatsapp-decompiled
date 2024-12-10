package com.whatsapp.infra.graphql.generated.groups.enums;

import X.C19780yz;

public enum GraphQLXWA2GroupParticipantRole {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    MEMBER("MEMBER"),
    ADMIN_MEMBER("ADMIN_MEMBER");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    static {
        GraphQLXWA2GroupParticipantRole[] graphQLXWA2GroupParticipantRoleArr;
        A00 = C19780yz.A00(graphQLXWA2GroupParticipantRoleArr);
    }

    /* access modifiers changed from: public */
    GraphQLXWA2GroupParticipantRole(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
