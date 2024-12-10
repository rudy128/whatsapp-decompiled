package com.whatsapp.infra.graphql.generated.groups.enums;

import X.C19780yz;

public enum GraphQLXWA2GroupAddressingMode {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    PHONE_NUMBER("PHONE_NUMBER");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    static {
        GraphQLXWA2GroupAddressingMode[] graphQLXWA2GroupAddressingModeArr;
        A00 = C19780yz.A00(graphQLXWA2GroupAddressingModeArr);
    }

    /* access modifiers changed from: public */
    GraphQLXWA2GroupAddressingMode(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
