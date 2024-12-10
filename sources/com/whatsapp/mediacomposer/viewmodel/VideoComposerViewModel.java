package com.whatsapp.mediacomposer.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.C108945cZ;
import X.C1403571b;
import X.C18070vi;
import X.C18600wl;
import X.C24641Lc;
import X.C26431Sc;

public final class VideoComposerViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00 = C108945cZ.A0S();
    public final C26431Sc A01;
    public final C18600wl A02;
    public final C18600wl A03;
    public final C1403571b A04;
    public final C24641Lc A05;
    public final AnonymousClass00H A06;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r11 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r30 != null) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f1 A[Catch:{ CancellationException -> 0x00f2 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.content.Context r24, android.net.Uri r25, android.os.Bundle r26, X.C160888Ai r27, com.whatsapp.mediacomposer.viewmodel.VideoComposerViewModel r28, X.C131126kY r29, java.io.File r30, X.C30391dr r31) {
        /*
            r5 = r31
            r7 = r27
            boolean r0 = r5 instanceof X.AnonymousClass7TO
            r4 = r28
            if (r0 == 0) goto L_0x0024
            r3 = r5
            X.7TO r3 = (X.AnonymousClass7TO) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0024
            int r2 = r2 - r1
            r3.label = r2
        L_0x0018:
            java.lang.Object r5 = r3.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r3.label
            r0 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r0) goto L_0x002f
            goto L_0x002a
        L_0x0024:
            X.7TO r3 = new X.7TO
            r3.<init>(r4, r5)
            goto L_0x0018
        L_0x002a:
            X.C30691eM.A01(r5)     // Catch:{ CancellationException -> 0x00f2 }
            goto L_0x00f8
        L_0x002f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0034:
            X.C30691eM.A01(r5)
            r1 = 0
            r9 = r25
            r8 = r30
            if (r27 == 0) goto L_0x0048
            X.72S r5 = X.AnonymousClass73D.A00(r9, r7)     // Catch:{ 1Se -> 0x0057 }
            X.71x r11 = r5.A07()     // Catch:{ 1Se -> 0x0057 }
            if (r11 != 0) goto L_0x005e
        L_0x0048:
            if (r30 == 0) goto L_0x007a
            X.00H r5 = r4.A06     // Catch:{ 1Se -> 0x0057 }
            java.lang.Object r5 = r5.get()     // Catch:{ 1Se -> 0x0057 }
            X.6mw r5 = (X.C132516mw) r5     // Catch:{ 1Se -> 0x0057 }
            X.71x r11 = r5.A00(r8)     // Catch:{ 1Se -> 0x0057 }
            goto L_0x0060
        L_0x0057:
            r6 = move-exception
            java.lang.String r5 = "VideoComposerViewModel/prepareData/bad video"
            com.whatsapp.util.Log.e(r5, r6)     // Catch:{ CancellationException -> 0x00f2 }
            r11 = r1
        L_0x005e:
            if (r30 == 0) goto L_0x007b
        L_0x0060:
            X.1Sc r6 = r4.A01     // Catch:{ CancellationException -> 0x00f2 }
            r5 = r29
            X.0vl r5 = r5.A09     // Catch:{ CancellationException -> 0x00f2 }
            boolean r5 = X.C72453Mb.A1a(r5)     // Catch:{ CancellationException -> 0x00f2 }
            if (r5 == 0) goto L_0x0077
            X.1So r5 = X.C26551So.A0d     // Catch:{ CancellationException -> 0x00f2 }
        L_0x006e:
            boolean r16 = r6.A0F(r5, r8)     // Catch:{ CancellationException -> 0x00f2 }
            long r14 = r8.length()     // Catch:{ CancellationException -> 0x00f2 }
            goto L_0x007f
        L_0x0077:
            X.1So r5 = X.C26551So.A0q     // Catch:{ CancellationException -> 0x00f2 }
            goto L_0x006e
        L_0x007a:
            r11 = r1
        L_0x007b:
            r16 = 0
            r14 = 0
        L_0x007f:
            if (r27 == 0) goto L_0x00a0
            com.whatsapp.mediacomposer.MediaComposerActivity r7 = (com.whatsapp.mediacomposer.MediaComposerActivity) r7     // Catch:{ CancellationException -> 0x00f2 }
            X.7JS r5 = r7.A0X     // Catch:{ CancellationException -> 0x00f2 }
            if (r5 == 0) goto L_0x00a0
            X.0vl r5 = r5.A0E     // Catch:{ CancellationException -> 0x00f2 }
            boolean r5 = X.C72453Mb.A1a(r5)     // Catch:{ CancellationException -> 0x00f2 }
            if (r5 != r0) goto L_0x00a0
            X.1Lc r5 = r4.A05     // Catch:{ CancellationException -> 0x00f2 }
            X.0ve r7 = r5.A01     // Catch:{ CancellationException -> 0x00f2 }
            r6 = 11003(0x2afb, float:1.5418E-41)
            X.0vf r5 = X.C18040vf.A02     // Catch:{ CancellationException -> 0x00f2 }
            boolean r5 = X.C18020vd.A05(r5, r7, r6)     // Catch:{ CancellationException -> 0x00f2 }
            if (r5 == 0) goto L_0x00a0
            if (r11 == 0) goto L_0x00a0
            goto L_0x00a5
        L_0x00a0:
            r21 = r1
            r22 = r1
            goto L_0x00bf
        L_0x00a5:
            int r7 = r11.A02     // Catch:{ CancellationException -> 0x00f2 }
            if (r7 == 0) goto L_0x00a0
            int r6 = r11.A00     // Catch:{ CancellationException -> 0x00f2 }
            if (r6 == 0) goto L_0x00a0
            X.71b r5 = r4.A04     // Catch:{ CancellationException -> 0x00f2 }
            X.6rw r6 = r5.A02(r7, r6)     // Catch:{ CancellationException -> 0x00f2 }
            int r5 = r6.A01     // Catch:{ CancellationException -> 0x00f2 }
            java.lang.Integer r21 = X.AnonymousClass3MW.A0v(r5)     // Catch:{ CancellationException -> 0x00f2 }
            int r5 = r6.A00     // Catch:{ CancellationException -> 0x00f2 }
            java.lang.Integer r22 = X.AnonymousClass3MW.A0v(r5)     // Catch:{ CancellationException -> 0x00f2 }
        L_0x00bf:
            r5 = 0
            X.C18070vi.A0d(r9, r5)     // Catch:{ CancellationException -> 0x00f2 }
            X.1Sc r5 = r4.A01     // Catch:{ CancellationException -> 0x00f2 }
            r23 = 1280(0x500, float:1.794E-42)
            r18 = r24
            r19 = r9
            r20 = r11
            r17 = r5
            X.1D6 r12 = r17.A0D(r18, r19, r20, r21, r22, r23)     // Catch:{ CancellationException -> 0x00f2 }
            r22 = r1
            r21 = r1
            X.1D6 r13 = r17.A0D(r18, r19, r20, r21, r22, r23)     // Catch:{ CancellationException -> 0x00f2 }
            X.7JT r8 = new X.7JT     // Catch:{ CancellationException -> 0x00f2 }
            r10 = r26
            r8.<init>(r9, r10, r11, r12, r13, r14, r16)     // Catch:{ CancellationException -> 0x00f2 }
            r3.label = r0     // Catch:{ CancellationException -> 0x00f2 }
            X.0wl r5 = r4.A03     // Catch:{ CancellationException -> 0x00f2 }
            com.whatsapp.mediacomposer.viewmodel.VideoComposerViewModel$notifyState$2 r0 = new com.whatsapp.mediacomposer.viewmodel.VideoComposerViewModel$notifyState$2     // Catch:{ CancellationException -> 0x00f2 }
            r0.<init>(r8, r4, r1)     // Catch:{ CancellationException -> 0x00f2 }
            java.lang.Object r0 = X.C30451dy.A00(r3, r5, r0)     // Catch:{ CancellationException -> 0x00f2 }
            if (r0 != r2) goto L_0x00f8
            return r2
        L_0x00f2:
            r1 = move-exception
            java.lang.String r0 = "VideoComposerViewModel/prepareData/cancelled"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00f8:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.viewmodel.VideoComposerViewModel.A00(android.content.Context, android.net.Uri, android.os.Bundle, X.8Ai, com.whatsapp.mediacomposer.viewmodel.VideoComposerViewModel, X.6kY, java.io.File, X.1dr):java.lang.Object");
    }

    public VideoComposerViewModel(C1403571b r2, C26431Sc r3, C24641Lc r4, AnonymousClass00H r5, C18600wl r6, C18600wl r7) {
        C18070vi.A0w(r4, r3, r5, r2, r6);
        C18070vi.A0d(r7, 6);
        this.A05 = r4;
        this.A01 = r3;
        this.A06 = r5;
        this.A04 = r2;
        this.A02 = r6;
        this.A03 = r7;
    }
}
