package com.whatsapp.infra.graphql.generated.newsletter.enums;

public enum GraphQLXWA2NewsletterWamoSubStatus {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    ACTIVE("ACTIVE");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    GraphQLXWA2NewsletterWamoSubStatus(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
