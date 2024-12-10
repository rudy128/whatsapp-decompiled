package com.whatsapp.bridge.wfs.nativeauth;

import X.AnonymousClass00H;
import X.AnonymousClass2ZR;
import X.C56602hj;
import X.C72473Md;

public final class WfsNativeAuthManager {
    public final C56602hj A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass2ZR A02;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(android.content.Context r7, X.C30391dr r8, X.AnonymousClass1OX r9) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C21617An8
            if (r0 == 0) goto L_0x001e
            r5 = r8
            X.An8 r5 = (X.C21617An8) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x001e
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 != r2) goto L_0x0024
            goto L_0x0048
        L_0x001e:
            X.An8 r5 = new X.An8
            r5.<init>(r6, r8)
            goto L_0x0012
        L_0x0024:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0029:
            X.C30691eM.A01(r4)
            X.C17960vV.A00()
            java.lang.String r1 = "WfsNativeAuthManager/prefetchSsoAuthData started"
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r5.label = r2     // Catch:{ Exception -> 0x0054 }
            X.0wh r2 = r9.getCoroutineContext()     // Catch:{ Exception -> 0x0054 }
            r1 = 0
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2 r0 = new com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2     // Catch:{ Exception -> 0x0054 }
            r0.<init>(r7, r6, r1, r9)     // Catch:{ Exception -> 0x0054 }
            java.lang.Object r4 = X.C30451dy.A00(r5, r2, r0)     // Catch:{ Exception -> 0x0054 }
            if (r4 != r3) goto L_0x004b
            return r3
        L_0x0048:
            X.C30691eM.A01(r4)     // Catch:{ Exception -> 0x0054 }
        L_0x004b:
            java.util.List r4 = (java.util.List) r4     // Catch:{ Exception -> 0x0054 }
            java.lang.String r1 = "WfsNativeAuthManager/prefetchSsoAuthData finished"
            r0 = 0
            X.C18070vi.A0d(r1, r0)     // Catch:{ Exception -> 0x0054 }
            return r4
        L_0x0054:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WfsNativeAuthManager/prefetchSsoAuthData error:"
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)
            X.C31081ez.A01(r0)
            X.0wS r4 = X.C18460wS.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager.A00(android.content.Context, X.1dr, X.1OX):java.lang.Object");
    }

    public WfsNativeAuthManager(C56602hj r1, AnonymousClass2ZR r2, AnonymousClass00H r3) {
        C72473Md.A1I(r1, r3);
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }
}
