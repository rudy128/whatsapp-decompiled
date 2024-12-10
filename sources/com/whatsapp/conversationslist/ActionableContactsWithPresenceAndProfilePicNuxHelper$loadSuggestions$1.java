package com.whatsapp.conversationslist;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C37641pt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversationslist.ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1", f = "ActionableContactsWithPresenceAndProfilePicNuxHelper.kt", i = {}, l = {135, 141}, m = "invokeSuspend", n = {}, s = {})
public final class ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C37641pt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1(C37641pt r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r10.label
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r1) goto L_0x002a
            if (r0 != r4) goto L_0x0044
            X.C30691eM.A01(r11)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r11)
            X.1pt r0 = r10.this$0
            com.whatsapp.suggestions.SuggestionsEngine r6 = r0.A06
            X.1Om r9 = X.C25511Om.A00
            X.1oQ r7 = r0.A07
            r10.label = r1
            r11 = 15
            java.lang.String r8 = "LANDING_SCREEN"
            java.lang.Object r11 = r6.A04(r7, r8, r9, r10, r11)
            if (r11 != r5) goto L_0x002d
            return r5
        L_0x002a:
            X.C30691eM.A01(r11)
        L_0x002d:
            X.1D6 r11 = (X.AnonymousClass1D6) r11
            X.1IT r3 = X.C23761Hn.A00()
            X.1pt r2 = r10.this$0
            r1 = 0
            com.whatsapp.conversationslist.ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1$1 r0 = new com.whatsapp.conversationslist.ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1$1
            r0.<init>(r11, r1)
            r10.label = r4
            java.lang.Object r0 = X.C30451dy.A00(r10, r3, r0)
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x0044:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
