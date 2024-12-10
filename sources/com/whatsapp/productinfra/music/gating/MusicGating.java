package com.whatsapp.productinfra.music.gating;

import X.AnonymousClass00H;
import X.C18070vi;

public final class MusicGating {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass77U r9, X.C30391dr r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.AnonymousClass7UX
            if (r0 == 0) goto L_0x00b2
            r5 = r10
            X.7UX r5 = (X.AnonymousClass7UX) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b2
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.1g4 r1 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x008c
            if (r0 != r3) goto L_0x00b9
            java.lang.Object r6 = r5.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r9 = r5.L$0
            X.77U r9 = (X.AnonymousClass77U) r9
            X.C30691eM.A01(r2)
        L_0x0029:
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L_0x0080
            boolean r0 = r2.contains(r6)
            if (r0 != r3) goto L_0x0080
            if (r9 == 0) goto L_0x008a
            byte[] r1 = r9.A0A
        L_0x0037:
            java.lang.String r0 = "ZZ"
            boolean r0 = X.C18070vi.A18(r6, r0)
            if (r0 != 0) goto L_0x00be
            int r0 = r6.length()
            if (r0 == 0) goto L_0x00be
            if (r1 == 0) goto L_0x00be
            int r0 = r1.length
            if (r0 == 0) goto L_0x00be
            java.lang.String r0 = X.C108955ca.A13(r1)
            java.lang.String r7 = X.C108975cc.A0e(r0)
            int r0 = r7.length()
            int r5 = r0 + -1
            r1 = 2
            if (r4 >= r5) goto L_0x0067
            int r0 = r5 % r1
            if (r0 >= 0) goto L_0x0061
            int r0 = r0 + 2
        L_0x0061:
            int r0 = r0 % r1
            if (r0 >= 0) goto L_0x0066
            int r0 = r0 + 2
        L_0x0066:
            int r5 = r5 - r0
        L_0x0067:
            if (r5 < 0) goto L_0x00be
            r2 = 0
        L_0x006a:
            char r1 = r7.charAt(r2)
            char r0 = r6.charAt(r4)
            if (r1 != r0) goto L_0x0085
            int r0 = r2 + 1
            char r1 = r7.charAt(r0)
            char r0 = r6.charAt(r3)
            if (r1 != r0) goto L_0x0085
        L_0x0080:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x0085:
            if (r2 == r5) goto L_0x00be
            int r2 = r2 + 2
            goto L_0x006a
        L_0x008a:
            r1 = 0
            goto L_0x0037
        L_0x008c:
            X.C30691eM.A01(r2)
            X.00H r0 = r8.A00
            java.lang.Object r0 = r0.get()
            X.1Ur r0 = (X.C27091Ur) r0
            java.lang.String r6 = r0.A03()
            if (r6 == 0) goto L_0x00be
            X.00H r0 = r8.A01
            java.lang.Object r0 = r0.get()
            com.whatsapp.productinfra.music.api.MusicRepository r0 = (com.whatsapp.productinfra.music.api.MusicRepository) r0
            r5.L$0 = r9
            r5.L$1 = r6
            r5.label = r3
            java.lang.Object r2 = r0.A00(r5)
            if (r2 != r1) goto L_0x0029
            return r1
        L_0x00b2:
            X.7UX r5 = new X.7UX
            r5.<init>(r8, r10)
            goto L_0x0012
        L_0x00b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00be:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.music.gating.MusicGating.A00(X.77U, X.1dr):java.lang.Object");
    }

    public MusicGating(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
