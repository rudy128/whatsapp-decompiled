package com.whatsapp.infra.graphql.generated.age_collection.enums;

import X.C19780yz;

public enum GraphQLXWA2AgeCollectionStatus {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    COMPLETED("COMPLETED"),
    PENDING("PENDING"),
    AWAITING_PARENTAL_APPROVAL("AWAITING_PARENTAL_APPROVAL"),
    AWAITING_YOUTH_CONSENT("AWAITING_YOUTH_CONSENT"),
    TEMP_BLOCK("TEMP_BLOCK");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    static {
        GraphQLXWA2AgeCollectionStatus[] graphQLXWA2AgeCollectionStatusArr;
        A00 = C19780yz.A00(graphQLXWA2AgeCollectionStatusArr);
    }

    /* access modifiers changed from: public */
    GraphQLXWA2AgeCollectionStatus(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
