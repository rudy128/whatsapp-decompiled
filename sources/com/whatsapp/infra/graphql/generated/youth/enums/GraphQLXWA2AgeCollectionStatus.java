package com.whatsapp.infra.graphql.generated.youth.enums;

public enum GraphQLXWA2AgeCollectionStatus {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    COMPLETED("COMPLETED"),
    PENDING("PENDING"),
    AWAITING_PARENTAL_APPROVAL("AWAITING_PARENTAL_APPROVAL"),
    AWAITING_YOUTH_CONSENT("AWAITING_YOUTH_CONSENT"),
    TEMP_BLOCK("TEMP_BLOCK");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    GraphQLXWA2AgeCollectionStatus(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
