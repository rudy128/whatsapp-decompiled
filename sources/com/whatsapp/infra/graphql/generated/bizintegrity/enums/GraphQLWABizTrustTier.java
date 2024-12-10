package com.whatsapp.infra.graphql.generated.bizintegrity.enums;

import X.C19780yz;

public enum GraphQLWABizTrustTier {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    SUSPICIOUS("SUSPICIOUS"),
    UNTIERED("UNTIERED"),
    TIER_0("TIER_0"),
    TIER_1("TIER_1"),
    TIER_2("TIER_2");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    static {
        GraphQLWABizTrustTier[] graphQLWABizTrustTierArr;
        A00 = C19780yz.A00(graphQLWABizTrustTierArr);
    }

    /* access modifiers changed from: public */
    GraphQLWABizTrustTier(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
