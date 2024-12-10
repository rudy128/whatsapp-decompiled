package com.whatsapp.suggestions;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.suggestions.SuggestionsEngine$getNewChatRecentlySeenContacts$2", f = "SuggestionsEngine.kt", i = {0, 1}, l = {76, 78}, m = "invokeSuspend", n = {"newUserAndNewUserWhoAreRecentlySeenServerSignalsAsync", "recentlySeenServerSignals"}, s = {"L$0", "L$0"})
public final class SuggestionsEngine$getNewChatRecentlySeenContacts$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Set $excludedJids;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SuggestionsEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestionsEngine$getNewChatRecentlySeenContacts$2(SuggestionsEngine suggestionsEngine, Set set, C30391dr r4) {
        super(2, r4);
        this.this$0 = suggestionsEngine;
        this.$excludedJids = set;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        SuggestionsEngine$getNewChatRecentlySeenContacts$2 suggestionsEngine$getNewChatRecentlySeenContacts$2 = new SuggestionsEngine$getNewChatRecentlySeenContacts$2(this.this$0, this.$excludedJids, r5);
        suggestionsEngine$getNewChatRecentlySeenContacts$2.L$0 = obj;
        return suggestionsEngine$getNewChatRecentlySeenContacts$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x009d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r11 = r19
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            r0 = r18
            int r1 = r0.label
            r3 = 2
            r10 = 1
            if (r1 == 0) goto L_0x0058
            if (r1 == r10) goto L_0x0089
            if (r1 != r3) goto L_0x0121
            java.lang.Object r1 = r0.L$0
            java.util.List r1 = (java.util.List) r1
            X.C30691eM.A01(r11)
        L_0x0017:
            java.util.List r11 = (java.util.List) r11
            com.whatsapp.suggestions.SuggestionsEngine r2 = r0.this$0
            java.util.ArrayList r12 = X.AnonymousClass000.A13()
            X.1M9 r2 = r2.A03
            r2.A0m(r12)
            com.whatsapp.suggestions.SuggestionsEngine r2 = r0.this$0
            java.util.List r5 = com.whatsapp.suggestions.SuggestionsEngine.A02(r2)
            com.whatsapp.suggestions.SuggestionsEngine r2 = r0.this$0
            X.00H r2 = r2.A07
            java.lang.Object r2 = r2.get()
            X.2kd r2 = (X.C58402kd) r2
            java.util.ArrayList r2 = r2.A00()
            com.whatsapp.suggestions.SuggestionsEngine r8 = r0.this$0
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r6 = r2.iterator()
        L_0x0042:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x009e
            X.1BI r4 = X.C17880vN.A0Q(r6)
            X.1M9 r2 = r8.A03
            X.1E7 r2 = r2.A0E(r4)
            if (r2 == 0) goto L_0x0042
            r7.add(r2)
            goto L_0x0042
        L_0x0058:
            X.C30691eM.A01(r11)
            java.lang.Object r11 = r0.L$0
            X.1OX r11 = (X.AnonymousClass1OX) r11
            com.whatsapp.suggestions.SuggestionsEngine r4 = r0.this$0
            java.util.Set r2 = r0.$excludedJids
            r8 = 0
            com.whatsapp.suggestions.SuggestionsEngine$getNewChatRecentlySeenContacts$2$recentlySeenServerSignalsAsync$1 r1 = new com.whatsapp.suggestions.SuggestionsEngine$getNewChatRecentlySeenContacts$2$recentlySeenServerSignalsAsync$1
            r1.<init>(r4, r2, r8)
            X.1OR r7 = X.AnonymousClass1OR.A00
            java.lang.Integer r6 = X.AnonymousClass00R.A00
            X.5WH r5 = X.C30451dy.A01(r6, r7, r1, r11)
            com.whatsapp.suggestions.SuggestionsEngine r4 = r0.this$0
            java.util.Set r2 = r0.$excludedJids
            com.whatsapp.suggestions.SuggestionsEngine$getNewChatRecentlySeenContacts$2$newUserAndNewUserWhoAreRecentlySeenServerSignalsAsync$1 r1 = new com.whatsapp.suggestions.SuggestionsEngine$getNewChatRecentlySeenContacts$2$newUserAndNewUserWhoAreRecentlySeenServerSignalsAsync$1
            r1.<init>(r4, r2, r8)
            X.5WH r2 = X.C30451dy.A01(r6, r7, r1, r11)
            r0.L$0 = r2
            r0.label = r10
            java.lang.Object r11 = r5.BCp(r0)
            if (r11 != r9) goto L_0x0090
            return r9
        L_0x0089:
            java.lang.Object r2 = r0.L$0
            X.EEF r2 = (X.EEF) r2
            X.C30691eM.A01(r11)
        L_0x0090:
            r1 = r11
            java.util.List r1 = (java.util.List) r1
            r0.L$0 = r1
            r0.label = r3
            java.lang.Object r11 = r2.BCp(r0)
            if (r11 != r9) goto L_0x0017
            return r9
        L_0x009e:
            com.whatsapp.suggestions.SuggestionsEngine r8 = r0.this$0
            X.4D0 r2 = X.AnonymousClass4D0.RECENTLY_ACCEPTED_INVITES
            X.1D6 r2 = X.AnonymousClass1D6.A01(r2, r7)
            java.util.List r10 = X.C18070vi.A0M(r2)
            com.whatsapp.suggestions.SuggestionsEngine r2 = r0.this$0
            X.1nx r9 = r2.A05
            java.util.Set r13 = r0.$excludedJids
            X.1Om r14 = X.C25511Om.A00
            r7 = 0
            r2 = 0
            r15 = r14
            r17 = r7
            r16 = r3
            java.util.ArrayList r3 = r8.A07(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.whatsapp.suggestions.SuggestionsEngine r4 = r0.this$0
            X.0ve r8 = r4.A04
            r6 = 10035(0x2733, float:1.4062E-41)
            X.0vf r4 = X.C18040vf.A02
            int r4 = X.C18020vd.A00(r4, r8, r6)
            r6 = 0
            int r7 = java.lang.Math.max(r7, r4)
            com.whatsapp.suggestions.SuggestionsEngine r8 = r0.this$0
            X.4D0 r4 = X.AnonymousClass4D0.FREQUENTLY_CONTACTED
            X.1D6 r4 = X.AnonymousClass1D6.A01(r4, r5)
            java.util.List r10 = X.C18070vi.A0M(r4)
            com.whatsapp.suggestions.SuggestionsEngine r4 = r0.this$0
            X.1nx r9 = r4.A05
            java.util.Set r4 = r0.$excludedJids
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r0 = com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType.PRESENCE
            java.util.Set r15 = X.C18070vi.A0P(r0)
            r13 = r4
            r16 = r7
            r11 = r1
            java.util.ArrayList r5 = r8.A07(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            int r1 = r5.size()
            int r0 = r3.size()
            int r7 = r7 - r0
            int r0 = java.lang.Math.min(r1, r7)
            int r1 = java.lang.Math.max(r0, r2)
        L_0x0103:
            if (r6 >= r1) goto L_0x010f
            java.lang.Object r0 = r5.get(r6)
            r4.add(r0)
            int r6 = r6 + 1
            goto L_0x0103
        L_0x010f:
            int r2 = r3.size()
            r1 = 0
        L_0x0114:
            if (r1 >= r2) goto L_0x0120
            java.lang.Object r0 = r3.get(r1)
            r4.add(r0)
            int r1 = r1 + 1
            goto L_0x0114
        L_0x0120:
            return r4
        L_0x0121:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.suggestions.SuggestionsEngine$getNewChatRecentlySeenContacts$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SuggestionsEngine$getNewChatRecentlySeenContacts$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
