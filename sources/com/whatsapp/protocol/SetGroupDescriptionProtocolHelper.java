package com.whatsapp.protocol;

import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass12M;
import X.AnonymousClass1NN;
import X.AnonymousClass1OX;
import X.C108965cb;
import X.C18030ve;
import X.C18070vi;
import X.C183519Yo;
import X.C18600wl;

public final class SetGroupDescriptionProtocolHelper {
    public final AnonymousClass11S A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass1NN A02;
    public final C18030ve A03;
    public final AnonymousClass12M A04;
    public final C183519Yo A05;
    public final AnonymousClass1OX A06;
    public final C18600wl A07;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass1EC r12, java.lang.String r13, java.lang.String r14, X.C30391dr r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof X.C21627AnI
            r7 = r11
            if (r0 == 0) goto L_0x003d
            r4 = r15
            X.AnI r4 = (X.C21627AnI) r4
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
            X.0wl r0 = r11.A07
            r10 = 0
            com.whatsapp.protocol.SetGroupDescriptionProtocolHelper$sendSetSubgroupDescription$2 r5 = new com.whatsapp.protocol.SetGroupDescriptionProtocolHelper$sendSetSubgroupDescription$2
            r6 = r12
            r9 = r13
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.label = r1
            java.lang.Object r3 = X.C30451dy.A00(r4, r0, r5)
            if (r3 != r2) goto L_0x0021
            return r2
        L_0x003d:
            X.AnI r4 = new X.AnI
            r4.<init>(r11, r15)
            goto L_0x0013
        L_0x0043:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.SetGroupDescriptionProtocolHelper.A00(X.1EC, java.lang.String, java.lang.String, X.1dr):java.lang.Object");
    }

    public SetGroupDescriptionProtocolHelper(AnonymousClass11S r2, AnonymousClass11P r3, AnonymousClass1NN r4, C18030ve r5, AnonymousClass12M r6, C183519Yo r7, C18600wl r8, AnonymousClass1OX r9) {
        C18070vi.A0w(r3, r5, r2, r6, r4);
        C108965cb.A1P(r8, 6, r9);
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
        this.A04 = r6;
        this.A02 = r4;
        this.A07 = r8;
        this.A05 = r7;
        this.A06 = r9;
    }
}
