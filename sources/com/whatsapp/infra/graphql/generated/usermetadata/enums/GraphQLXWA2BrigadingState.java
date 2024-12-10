package com.whatsapp.infra.graphql.generated.usermetadata.enums;

public enum GraphQLXWA2BrigadingState {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    NOT_DETECTED("NOT_DETECTED"),
    DETECTED("DETECTED"),
    NOT_ENFORCED("NOT_ENFORCED"),
    ENFORCED("ENFORCED");
    
    public final String serverValue;

    public String toString() {
        return this.serverValue;
    }

    /* access modifiers changed from: public */
    GraphQLXWA2BrigadingState(String str) {
        this.serverValue = str;
    }
}
