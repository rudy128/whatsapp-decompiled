package com.whatsapp.group.membersuggestions.data;

import X.AnonymousClass00H;
import X.C18070vi;
import X.C18600wl;

public final class GroupMemberSuggestionsManager {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C18600wl A05;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.util.Set r14, X.C30391dr r15, int r16) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C100394uR
            r8 = r13
            if (r0 == 0) goto L_0x0075
            r6 = r15
            X.4uR r6 = (X.C100394uR) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0075
            int r2 = r2 - r1
            r6.label = r2
        L_0x0013:
            java.lang.Object r5 = r6.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x003e
            if (r0 == r2) goto L_0x0062
            if (r0 != r3) goto L_0x007b
            X.C30691eM.A01(r5)
        L_0x0024:
            java.util.List r5 = (java.util.List) r5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GroupMemberSuggestionsManager/loadSuggestionsBucketsResults bucket count: "
            r1.append(r0)
            int r0 = r5.size()
            X.C17900vP.A0o(r1, r0)
            java.util.LinkedHashMap r0 = X.C17880vN.A13()
            X.AnonymousClass1D7.A0J(r5, r0)
            return r0
        L_0x003e:
            X.C30691eM.A01(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GroupMemberSuggestionsManager/loadSuggestionsBucketsResults uiSurface: "
            r12 = r16
            X.C17900vP.A0j(r0, r1, r12)
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            r11 = 0
            com.whatsapp.group.membersuggestions.data.GroupMemberSuggestionsManager$loadSuggestionsBucketsResults$2 r7 = new com.whatsapp.group.membersuggestions.data.GroupMemberSuggestionsManager$loadSuggestionsBucketsResults$2
            r10 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            r6.L$0 = r9
            r6.label = r2
            java.lang.Object r0 = X.AnonymousClass1OW.A00(r6, r7)
            if (r0 != r4) goto L_0x0069
            return r4
        L_0x0062:
            java.lang.Object r9 = r6.L$0
            java.util.Collection r9 = (java.util.Collection) r9
            X.C30691eM.A01(r5)
        L_0x0069:
            r0 = 0
            r6.L$0 = r0
            r6.label = r3
            java.lang.Object r5 = X.C197009w0.A00(r9, r6)
            if (r5 != r4) goto L_0x0024
            return r4
        L_0x0075:
            X.4uR r6 = new X.4uR
            r6.<init>(r13, r15)
            goto L_0x0013
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.membersuggestions.data.GroupMemberSuggestionsManager.A00(java.util.Set, X.1dr, int):java.lang.Object");
    }

    public GroupMemberSuggestionsManager(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, C18600wl r7) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        C18070vi.A0d(r7, 6);
        this.A04 = r2;
        this.A02 = r3;
        this.A01 = r4;
        this.A00 = r5;
        this.A03 = r6;
        this.A05 = r7;
    }
}
