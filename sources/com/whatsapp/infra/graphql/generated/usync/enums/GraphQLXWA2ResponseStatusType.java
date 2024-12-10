package com.whatsapp.infra.graphql.generated.usync.enums;

import X.C19780yz;

public enum GraphQLXWA2ResponseStatusType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    EMPTY("EMPTY"),
    NOT_ALLOWED("NOT_ALLOWED");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    static {
        GraphQLXWA2ResponseStatusType[] graphQLXWA2ResponseStatusTypeArr;
        A00 = C19780yz.A00(graphQLXWA2ResponseStatusTypeArr);
    }

    /* access modifiers changed from: public */
    GraphQLXWA2ResponseStatusType(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
