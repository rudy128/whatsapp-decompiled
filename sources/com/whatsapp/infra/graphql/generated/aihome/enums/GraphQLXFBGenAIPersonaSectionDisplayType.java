package com.whatsapp.infra.graphql.generated.aihome.enums;

import X.C19780yz;

public enum GraphQLXFBGenAIPersonaSectionDisplayType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    HIDDEN("HIDDEN"),
    HSCROLL("HSCROLL"),
    HSCROLL_CONTINUE_CHATTING("HSCROLL_CONTINUE_CHATTING"),
    HSCROLL_ICEBREAKERS("HSCROLL_ICEBREAKERS"),
    HSCROLL_LARGE("HSCROLL_LARGE"),
    HSCROLL_SMALL("HSCROLL_SMALL"),
    LISTVIEW("LISTVIEW");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    static {
        GraphQLXFBGenAIPersonaSectionDisplayType[] graphQLXFBGenAIPersonaSectionDisplayTypeArr;
        A00 = C19780yz.A00(graphQLXFBGenAIPersonaSectionDisplayTypeArr);
    }

    /* access modifiers changed from: public */
    GraphQLXFBGenAIPersonaSectionDisplayType(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
