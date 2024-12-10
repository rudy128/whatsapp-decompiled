package com.whatsapp.infra.graphql.generated.newsletter.enums;

public enum GraphQLXWA2NewsletterDirectoryCategory {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    BUSINESS("BUSINESS"),
    ENTERTAINMENT("ENTERTAINMENT"),
    LIFESTYLE("LIFESTYLE"),
    NEWS("NEWS"),
    ORGANIZATIONS("ORGANIZATIONS"),
    PEOPLE("PEOPLE"),
    SPORTS("SPORTS"),
    SPECIAL_EVENTS("SPECIAL_EVENTS"),
    SPECIAL_EVENTS_2("SPECIAL_EVENTS_2"),
    SPECIAL_EVENTS_3("SPECIAL_EVENTS_3"),
    SPECIAL_EVENTS_4("SPECIAL_EVENTS_4");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    GraphQLXWA2NewsletterDirectoryCategory(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
