package com.whatsapp.infra.graphql.generated.newsletter.enums;

public enum GraphQLXWA2EnforcementSource {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    COPS("COPS"),
    CEM("CEM"),
    IP_SRT("IP_SRT"),
    RM("RM");
    
    public final String serverValue;

    public String toString() {
        return this.serverValue;
    }

    /* access modifiers changed from: public */
    GraphQLXWA2EnforcementSource(String str) {
        this.serverValue = str;
    }
}
