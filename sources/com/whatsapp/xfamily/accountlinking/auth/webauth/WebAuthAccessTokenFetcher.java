package com.whatsapp.xfamily.accountlinking.auth.webauth;

import X.AnonymousClass00H;
import X.C124696Zi;
import X.C18070vi;
import X.C18600wl;

public final class WebAuthAccessTokenFetcher {
    public final AnonymousClass00H A00;
    public final C124696Zi A01;
    public final C18600wl A02;

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.87L] */
    /* JADX WARNING: type inference failed for: r13v0, types: [X.2VD, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r18, java.lang.String r19, X.C30391dr r20) {
        /*
            r17 = this;
            r3 = r20
            boolean r0 = r3 instanceof X.AnonymousClass7UG
            r5 = r17
            if (r0 == 0) goto L_0x0088
            r7 = r3
            X.7UG r7 = (X.AnonymousClass7UG) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0088
            int r2 = r2 - r1
            r7.label = r2
        L_0x0016:
            java.lang.Object r1 = r7.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r2 = 1
            r4 = 2
            if (r0 == 0) goto L_0x0028
            if (r0 == r2) goto L_0x0060
            if (r0 != r4) goto L_0x008e
            X.C30691eM.A01(r1)
        L_0x0027:
            return r1
        L_0x0028:
            X.C30691eM.A01(r1)
            X.6Zi r0 = r5.A01
            X.1K2 r0 = r0.A00
            X.10E r0 = r0.A01
            X.0ve r11 = X.AnonymousClass10E.A8r(r0)
            X.181 r9 = X.C108965cb.A0H(r0)
            X.0z4 r10 = X.AnonymousClass3Ma.A0c(r0)
            X.00H r14 = X.C108945cZ.A14(r0)
            X.1fq r12 = X.C108955ca.A0X(r0)
            X.2VD r13 = new X.2VD
            r13.<init>()
            X.6QO r8 = new X.6QO
            r15 = r18
            r16 = r19
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            X.0wl r0 = r5.A02
            r7.L$0 = r5
            r7.label = r2
            java.lang.Object r1 = r8.CBy(r7, r0)
            if (r1 != r6) goto L_0x0067
            return r6
        L_0x0060:
            java.lang.Object r5 = r7.L$0
            com.whatsapp.xfamily.accountlinking.auth.webauth.WebAuthAccessTokenFetcher r5 = (com.whatsapp.xfamily.accountlinking.auth.webauth.WebAuthAccessTokenFetcher) r5
            X.C30691eM.A01(r1)
        L_0x0067:
            X.6TR r1 = (X.AnonymousClass6TR) r1
            boolean r0 = r1 instanceof X.AnonymousClass67F
            r8 = 0
            if (r0 == 0) goto L_0x0093
            X.67F r1 = (X.AnonymousClass67F) r1
            X.6xC r3 = r1.A00
            int r0 = r3.A00
            if (r0 == 0) goto L_0x00a5
            X.0wl r1 = r5.A02
            com.whatsapp.xfamily.accountlinking.auth.webauth.WebAuthAccessTokenFetcher$awaitExchangeTokenAndBlobForAccessToken$2 r0 = new com.whatsapp.xfamily.accountlinking.auth.webauth.WebAuthAccessTokenFetcher$awaitExchangeTokenAndBlobForAccessToken$2
            r0.<init>(r3, r5, r8)
            r7.L$0 = r8
            r7.label = r4
            java.lang.Object r1 = X.C30451dy.A00(r7, r1, r0)
            if (r1 != r6) goto L_0x0027
            return r6
        L_0x0088:
            X.7UG r7 = new X.7UG
            r7.<init>(r5, r3)
            goto L_0x0016
        L_0x008e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0093:
            boolean r0 = r1 instanceof X.AnonymousClass67E
            if (r0 == 0) goto L_0x009c
            X.67E r1 = (X.AnonymousClass67E) r1
            java.lang.Exception r1 = r1.A00
            goto L_0x00b0
        L_0x009c:
            boolean r0 = r1 instanceof X.AnonymousClass67D
            if (r0 == 0) goto L_0x00cd
            X.67D r1 = (X.AnonymousClass67D) r1
            java.io.IOException r1 = r1.A00
            goto L_0x00b0
        L_0x00a5:
            X.161 r0 = r3.A03
            java.lang.Object r3 = r0.A00
            if (r3 != 0) goto L_0x00b6
            X.6Sd r1 = new X.6Sd
            r1.<init>(r4)
        L_0x00b0:
            X.6OB r0 = new X.6OB
            r0.<init>(r1, r2)
            return r0
        L_0x00b6:
            X.7Ik r2 = new X.7Ik
            r2.<init>()
            java.lang.String r1 = "WaFbAccessToken"
            X.77e r0 = new X.77e
            r0.<init>(r2, r3, r1)
            X.77S r1 = new X.77S
            r1.<init>(r0, r4)
            X.6OA r0 = new X.6OA
            r0.<init>(r1)
            return r0
        L_0x00cd:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.xfamily.accountlinking.auth.webauth.WebAuthAccessTokenFetcher.A00(java.lang.String, java.lang.String, X.1dr):java.lang.Object");
    }

    public WebAuthAccessTokenFetcher(C124696Zi r1, AnonymousClass00H r2, C18600wl r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }
}
