package com.whatsapp.infra.graphql.generated.username.enums;

import X.C19780yz;

public enum GraphQLXWA2UsernameCheckResult {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    SUCCESS("SUCCESS"),
    INVALID("INVALID");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    static {
        GraphQLXWA2UsernameCheckResult[] graphQLXWA2UsernameCheckResultArr;
        A00 = C19780yz.A00(graphQLXWA2UsernameCheckResultArr);
    }

    /* access modifiers changed from: public */
    GraphQLXWA2UsernameCheckResult(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
