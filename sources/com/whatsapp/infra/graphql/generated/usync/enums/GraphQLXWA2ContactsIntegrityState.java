package com.whatsapp.infra.graphql.generated.usync.enums;

import X.C19780yz;

public enum GraphQLXWA2ContactsIntegrityState {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    PENDING("PENDING"),
    PASS("PASS");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    static {
        GraphQLXWA2ContactsIntegrityState[] graphQLXWA2ContactsIntegrityStateArr;
        A00 = C19780yz.A00(graphQLXWA2ContactsIntegrityStateArr);
    }

    /* access modifiers changed from: public */
    GraphQLXWA2ContactsIntegrityState(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
