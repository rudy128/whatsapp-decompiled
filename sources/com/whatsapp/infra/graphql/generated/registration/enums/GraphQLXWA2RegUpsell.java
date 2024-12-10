package com.whatsapp.infra.graphql.generated.registration.enums;

import X.C19780yz;

public enum GraphQLXWA2RegUpsell {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    EMAIL("EMAIL"),
    PASSKEYS("PASSKEYS"),
    NONE("NONE");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    static {
        GraphQLXWA2RegUpsell[] graphQLXWA2RegUpsellArr;
        A00 = C19780yz.A00(graphQLXWA2RegUpsellArr);
    }

    /* access modifiers changed from: public */
    GraphQLXWA2RegUpsell(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
