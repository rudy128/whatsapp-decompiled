package com.whatsapp.infra.graphql.generated.aihome.enums;

import X.C19780yz;

public enum GraphQLXFBGenAIPersonaAudience {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    ONLY_ME("ONLY_ME"),
    PUBLIC("PUBLIC"),
    PUBLIC_FOR_IG_PRIVATE_ACCOUNTS("PUBLIC_FOR_IG_PRIVATE_ACCOUNTS"),
    CLOSE_FRIENDS("CLOSE_FRIENDS"),
    FRIENDS("FRIENDS"),
    ANYONE_WITH_LINK("ANYONE_WITH_LINK"),
    META_INTERNAL("META_INTERNAL");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    static {
        GraphQLXFBGenAIPersonaAudience[] graphQLXFBGenAIPersonaAudienceArr;
        A00 = C19780yz.A00(graphQLXFBGenAIPersonaAudienceArr);
    }

    public String toString() {
        return this.serverValue;
    }

    /* access modifiers changed from: public */
    GraphQLXFBGenAIPersonaAudience(String str) {
        this.serverValue = str;
    }
}
