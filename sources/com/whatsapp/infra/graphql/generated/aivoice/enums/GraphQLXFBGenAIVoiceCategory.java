package com.whatsapp.infra.graphql.generated.aivoice.enums;

import X.C19780yz;

public enum GraphQLXFBGenAIVoiceCategory {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    META_AI_VOICE("META_AI_VOICE"),
    PUBLIC_FIGURE("PUBLIC_FIGURE");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    static {
        GraphQLXFBGenAIVoiceCategory[] graphQLXFBGenAIVoiceCategoryArr;
        A00 = C19780yz.A00(graphQLXFBGenAIVoiceCategoryArr);
    }

    /* access modifiers changed from: public */
    GraphQLXFBGenAIVoiceCategory(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
