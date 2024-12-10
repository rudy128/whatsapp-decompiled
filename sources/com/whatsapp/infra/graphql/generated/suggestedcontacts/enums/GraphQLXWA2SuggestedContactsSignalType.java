package com.whatsapp.infra.graphql.generated.suggestedcontacts.enums;

import X.C19780yz;

public enum GraphQLXWA2SuggestedContactsSignalType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    PRESENCE("PRESENCE"),
    PROFILE_PICTURE("PROFILE_PICTURE"),
    NEW_USER("NEW_USER"),
    LAST_ACTIVE("LAST_ACTIVE"),
    AREA_CODE("AREA_CODE");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    static {
        GraphQLXWA2SuggestedContactsSignalType[] graphQLXWA2SuggestedContactsSignalTypeArr;
        A00 = C19780yz.A00(graphQLXWA2SuggestedContactsSignalTypeArr);
    }

    public String toString() {
        return this.serverValue;
    }

    /* access modifiers changed from: public */
    GraphQLXWA2SuggestedContactsSignalType(String str) {
        this.serverValue = str;
    }
}
