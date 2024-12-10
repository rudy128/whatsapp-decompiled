package com.whatsapp.biz.catalog.network.graphql.directconnection;

import X.AnonymousClass4S5;
import X.C18070vi;
import X.C18600wl;
import X.C20009A2z;
import X.C26911Ty;

public final class CoroutineDirectConnectionHelper {
    public final C26911Ty A00;
    public final C20009A2z A01;
    public final C18600wl A02;
    public final C18600wl A03;
    public final AnonymousClass4S5 A04;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.whatsapp.jid.UserJid r13, java.lang.String r14, X.C30391dr r15) {
        /*
            r12 = this;
            r9 = r13
            r10 = r14
            boolean r0 = r15 instanceof X.C21692AoL
            if (r0 == 0) goto L_0x0069
            r4 = r15
            X.AoL r4 = (X.C21692AoL) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0069
            int r2 = r2 - r1
            r4.label = r2
        L_0x0014:
            java.lang.Object r8 = r4.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r4.label
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 == r0) goto L_0x0026
            if (r1 != r3) goto L_0x006f
            X.C30691eM.A01(r8)
        L_0x0025:
            return r8
        L_0x0026:
            java.lang.Object r10 = r4.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r4.L$1
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            java.lang.Object r7 = r4.L$0
            com.whatsapp.biz.catalog.network.graphql.directconnection.CoroutineDirectConnectionHelper r7 = (com.whatsapp.biz.catalog.network.graphql.directconnection.CoroutineDirectConnectionHelper) r7
            X.C30691eM.A01(r8)
            goto L_0x0050
        L_0x0036:
            X.C30691eM.A01(r8)
            r4.L$0 = r12
            r4.L$1 = r13
            r4.L$2 = r14
            r4.label = r0
            X.0wl r2 = r12.A03
            r1 = 0
            com.whatsapp.biz.catalog.network.graphql.directconnection.CoroutineDirectConnectionHelper$awaitLoadBusinessProfile$2 r0 = new com.whatsapp.biz.catalog.network.graphql.directconnection.CoroutineDirectConnectionHelper$awaitLoadBusinessProfile$2
            r0.<init>(r12, r13, r1)
            java.lang.Object r8 = X.C30451dy.A00(r4, r2, r0)
            if (r8 == r5) goto L_0x0068
            r7 = r12
        L_0x0050:
            X.AEW r8 = (X.AEW) r8
            X.0wl r0 = r7.A02
            r11 = 0
            com.whatsapp.biz.catalog.network.graphql.directconnection.CoroutineDirectConnectionHelper$generateDirectConnectionEncryptedInfo$2 r6 = new com.whatsapp.biz.catalog.network.graphql.directconnection.CoroutineDirectConnectionHelper$generateDirectConnectionEncryptedInfo$2
            r6.<init>(r7, r8, r9, r10, r11)
            r4.L$0 = r11
            r4.L$1 = r11
            r4.L$2 = r11
            r4.label = r3
            java.lang.Object r8 = X.C30451dy.A00(r4, r0, r6)
            if (r8 != r5) goto L_0x0025
        L_0x0068:
            return r5
        L_0x0069:
            X.AoL r4 = new X.AoL
            r4.<init>(r12, r15)
            goto L_0x0014
        L_0x006f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.network.graphql.directconnection.CoroutineDirectConnectionHelper.A00(com.whatsapp.jid.UserJid, java.lang.String, X.1dr):java.lang.Object");
    }

    public CoroutineDirectConnectionHelper(C26911Ty r1, C20009A2z a2z, AnonymousClass4S5 r3, C18600wl r4, C18600wl r5) {
        C18070vi.A0w(r1, a2z, r4, r5, r3);
        this.A00 = r1;
        this.A01 = a2z;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r3;
    }
}
