package com.whatsapp.community.iq;

import X.AnonymousClass00H;
import X.AnonymousClass1EC;
import X.AnonymousClass1OX;
import X.AnonymousClass3MX;
import X.C18070vi;
import X.C18600wl;
import X.C20557APr;
import X.C27001Ui;
import X.C30391dr;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class GetGroupProfilePicturesProtocolHelper {
    public static final long A04 = TimeUnit.SECONDS.toMillis(30);
    public final C27001Ui A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass1OX A02;
    public final C18600wl A03;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper r6, X.AnonymousClass1EC r7, X.AnonymousClass1EC r8, java.lang.String r9, java.util.Map r10, X.C30391dr r11) {
        /*
            boolean r0 = r11 instanceof X.C21619AnA
            if (r0 == 0) goto L_0x0039
            r4 = r11
            X.AnA r4 = (X.C21619AnA) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0039
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 != r1) goto L_0x003f
            X.C30691eM.A01(r3)
        L_0x0020:
            X.1eK r3 = (X.C30671eK) r3
            java.lang.Object r0 = r3.value
            return r0
        L_0x0025:
            X.C30691eM.A01(r3)
            X.0wl r0 = r6.A03
            r11 = 0
            com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequest$3 r5 = new com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequest$3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.label = r1
            java.lang.Object r3 = X.C30451dy.A00(r4, r0, r5)
            if (r3 != r2) goto L_0x0020
            return r2
        L_0x0039:
            X.AnA r4 = new X.AnA
            r4.<init>(r6, r11)
            goto L_0x0012
        L_0x003f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper.A00(com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper, X.1EC, X.1EC, java.lang.String, java.util.Map, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass1EC r11, X.AnonymousClass1EC r12, java.util.Map r13, X.C30391dr r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof X.C21618An9
            r4 = r10
            if (r0 == 0) goto L_0x003b
            r9 = r14
            X.An9 r9 = (X.C21618An9) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003b
            int r2 = r2 - r1
            r9.label = r2
        L_0x0013:
            java.lang.Object r3 = r9.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r1 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 != r1) goto L_0x0041
            X.C30691eM.A01(r3)
            X.1eK r3 = (X.C30671eK) r3
            java.lang.Object r0 = r3.value
        L_0x0025:
            return r0
        L_0x0026:
            X.C30691eM.A01(r3)
            X.00H r0 = r10.A01
            java.lang.String r7 = X.C17890vO.A0T(r0)
            r9.label = r1
            r5 = r11
            r6 = r12
            r8 = r13
            java.lang.Object r0 = A00(r4, r5, r6, r7, r8, r9)
            if (r0 != r2) goto L_0x0025
            return r2
        L_0x003b:
            X.An9 r9 = new X.An9
            r9.<init>(r10, r14)
            goto L_0x0013
        L_0x0041:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper.A01(X.1EC, X.1EC, java.util.Map, X.1dr):java.lang.Object");
    }

    public final void A02(AnonymousClass1EC r9, AnonymousClass1EC r10, Map map) {
        C20557APr aPr = new C20557APr(this);
        AnonymousClass3MX.A1Q(new GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequestAsync$2(aPr, this, r9, r10, map, (C30391dr) null), this.A02);
    }

    public GetGroupProfilePicturesProtocolHelper(C27001Ui r1, AnonymousClass00H r2, C18600wl r3, AnonymousClass1OX r4) {
        C18070vi.A0s(r4, r3, r2, r1);
        this.A02 = r4;
        this.A03 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
