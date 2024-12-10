package com.whatsapp.infra.graphql.generated.newsletter.enums;

public enum GraphQLXWA2NewsletterVerifySource {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    META_VERIFIED_SUBSCRIPTION("META_VERIFIED_SUBSCRIPTION");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    GraphQLXWA2NewsletterVerifySource(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
