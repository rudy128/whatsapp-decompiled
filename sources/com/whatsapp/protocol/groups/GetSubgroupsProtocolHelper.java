package com.whatsapp.protocol.groups;

import X.AnonymousClass00H;
import X.AnonymousClass190;
import X.C18070vi;
import X.C18600wl;

public final class GetSubgroupsProtocolHelper {
    public final AnonymousClass190 A00;
    public final AnonymousClass00H A01;
    public final C18600wl A02;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass1EC r12, X.AnonymousClass1EC r13, java.lang.String r14, X.C30391dr r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof X.C21629AnK
            r8 = r11
            if (r0 == 0) goto L_0x003d
            r4 = r15
            X.AnK r4 = (X.C21629AnK) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003d
            int r2 = r2 - r1
            r4.label = r2
        L_0x0013:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 != r1) goto L_0x0043
            X.C30691eM.A01(r3)
        L_0x0021:
            X.1eK r3 = (X.C30671eK) r3
            java.lang.Object r0 = r3.value
            return r0
        L_0x0026:
            X.C30691eM.A01(r3)
            X.0wl r0 = r11.A02
            r10 = 0
            com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper$sendGetSubgroupsRequest$3 r5 = new com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper$sendGetSubgroupsRequest$3
            r6 = r12
            r7 = r13
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.label = r1
            java.lang.Object r3 = X.C30451dy.A00(r4, r0, r5)
            if (r3 != r2) goto L_0x0021
            return r2
        L_0x003d:
            X.AnK r4 = new X.AnK
            r4.<init>(r11, r15)
            goto L_0x0013
        L_0x0043:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper.A00(X.1EC, X.1EC, java.lang.String, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass1EC r6, X.AnonymousClass1EC r7, X.C30391dr r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C21628AnJ
            if (r0 == 0) goto L_0x0037
            r4 = r8
            X.AnJ r4 = (X.C21628AnJ) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0037
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 != r1) goto L_0x003d
            X.C30691eM.A01(r3)
            X.1eK r3 = (X.C30671eK) r3
            java.lang.Object r0 = r3.value
        L_0x0024:
            return r0
        L_0x0025:
            X.C30691eM.A01(r3)
            X.00H r0 = r5.A01
            java.lang.String r0 = X.C17890vO.A0T(r0)
            r4.label = r1
            java.lang.Object r0 = r5.A00(r6, r7, r0, r4)
            if (r0 != r2) goto L_0x0024
            return r2
        L_0x0037:
            X.AnJ r4 = new X.AnJ
            r4.<init>(r5, r8)
            goto L_0x0012
        L_0x003d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper.A01(X.1EC, X.1EC, X.1dr):java.lang.Object");
    }

    public GetSubgroupsProtocolHelper(AnonymousClass190 r1, AnonymousClass00H r2, C18600wl r3) {
        C18070vi.A0o(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
