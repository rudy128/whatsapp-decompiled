package com.whatsapp.productinfra.music.publishing;

import X.AnonymousClass00H;
import X.C18070vi;

public final class MusicPublishing {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
        if (r5 == null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
        if (r5 != null) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C134926rN r20, X.C30391dr r21, long r22) {
        /*
            r19 = this;
            r3 = r21
            boolean r0 = r3 instanceof X.AnonymousClass7UY
            r6 = r19
            if (r0 == 0) goto L_0x00ce
            r4 = r3
            X.7UY r4 = (X.AnonymousClass7UY) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ce
            int r2 = r2 - r1
            r4.label = r2
        L_0x0016:
            java.lang.Object r5 = r4.result
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L_0x009d
            if (r0 != r2) goto L_0x00d5
            java.lang.Object r1 = r4.L$1
            X.77c r1 = (X.C1418277c) r1
            X.C30691eM.A01(r5)
        L_0x0028:
            java.util.List r5 = (java.util.List) r5
            r6 = 0
            java.lang.Object r4 = r5.get(r6)
            boolean r0 = r4 instanceof X.C134916rM
            r3 = 0
            if (r0 == 0) goto L_0x00dd
            X.6rM r4 = (X.C134916rM) r4
            if (r4 == 0) goto L_0x00dd
            java.lang.Object r5 = r5.get(r2)
            boolean r0 = r5 instanceof X.C196299un
            if (r0 == 0) goto L_0x009b
            X.9un r5 = (X.C196299un) r5
        L_0x0042:
            java.lang.String r8 = r4.A00
            java.lang.String r9 = r1.A09
            java.lang.String r10 = r1.A05
            java.lang.String r11 = r1.A06
            if (r5 == 0) goto L_0x0092
            java.lang.String r12 = r5.A03()
            java.lang.String r0 = r5.A06()
            if (r0 == 0) goto L_0x0093
            byte[] r14 = android.util.Base64.decode(r0, r6)
        L_0x005a:
            java.lang.String r0 = r5.A05()
            if (r0 == 0) goto L_0x0097
            byte[] r15 = android.util.Base64.decode(r0, r6)
        L_0x0064:
            X.2pa r0 = r5.A00()
            if (r0 == 0) goto L_0x006c
            byte[] r3 = r0.A01
        L_0x006c:
            java.lang.String r13 = r1.A08
            if (r13 != 0) goto L_0x0072
            java.lang.String r13 = r1.A07
        L_0x0072:
            java.util.List r5 = r4.A01
            if (r5 == 0) goto L_0x008f
            java.lang.String r4 = ""
            r0 = 0
            java.lang.String r0 = X.C29431cG.A0g(r4, r4, r4, r5, r0)
            byte[] r17 = X.C108975cc.A1O(r0)
        L_0x0081:
            java.lang.Boolean r0 = r1.A00
            boolean r18 = X.C18070vi.A19(r0, r2)
            X.77U r7 = new X.77U
            r16 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r7
        L_0x008f:
            r17 = 0
            goto L_0x0081
        L_0x0092:
            r12 = r3
        L_0x0093:
            r14 = r3
            if (r5 == 0) goto L_0x0097
            goto L_0x005a
        L_0x0097:
            r15 = r3
            if (r5 == 0) goto L_0x006c
            goto L_0x0064
        L_0x009b:
            r5 = r3
            goto L_0x0042
        L_0x009d:
            X.C30691eM.A01(r5)
            r5 = r20
            if (r20 == 0) goto L_0x00da
            X.77c r1 = r5.A00
            java.lang.String r3 = r1.A09
            if (r3 != 0) goto L_0x00ad
            java.lang.String r2 = "Song ID is null"
            goto L_0x00df
        L_0x00ad:
            X.00H r0 = r6.A02
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.0wh r0 = (X.C18560wh) r0
            r13 = 0
            com.whatsapp.productinfra.music.publishing.MusicPublishing$publish$asyncResults$1 r8 = new com.whatsapp.productinfra.music.publishing.MusicPublishing$publish$asyncResults$1
            r9 = r1
            r10 = r5
            r11 = r6
            r12 = r3
            r14 = r22
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r4.L$0 = r6
            r4.L$1 = r1
            r4.label = r2
            java.lang.Object r5 = X.C30451dy.A00(r4, r0, r8)
            if (r5 != r7) goto L_0x0028
            return r7
        L_0x00ce:
            X.7UY r4 = new X.7UY
            r4.<init>(r6, r3)
            goto L_0x0016
        L_0x00d5:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00da:
            java.lang.String r2 = "Song is null"
            goto L_0x00df
        L_0x00dd:
            java.lang.String r2 = "Creation reporting failed"
        L_0x00df:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MusicPublishing/early return due to "
            X.C17900vP.A0f(r0, r2, r1)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.music.publishing.MusicPublishing.A00(X.6rN, X.1dr, long):java.lang.Object");
    }

    public MusicPublishing(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }
}
