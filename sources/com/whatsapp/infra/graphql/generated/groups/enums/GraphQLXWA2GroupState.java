package com.whatsapp.infra.graphql.generated.groups.enums;

import X.C19780yz;

public enum GraphQLXWA2GroupState {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    ACTIVE("ACTIVE"),
    SUSPENDED("SUSPENDED"),
    NON_EXISTENT("NON_EXISTENT");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    static {
        GraphQLXWA2GroupState[] graphQLXWA2GroupStateArr;
        A00 = C19780yz.A00(graphQLXWA2GroupStateArr);
    }

    /* access modifiers changed from: public */
    GraphQLXWA2GroupState(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
