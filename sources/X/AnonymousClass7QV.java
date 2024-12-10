package X;

import java.io.File;

/* renamed from: X.7QV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7QV implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass74M A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ File A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003a, code lost:
        if (r14 == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0043, code lost:
        if (r14 != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0047, code lost:
        if (r0 > 100) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
        X.C17900vP.A0l("voicenote/file too small; not sending; voiceNoteFileLength=", X.AnonymousClass000.A10(), r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r31 = this;
            r2 = r31
            X.74M r10 = r2.A02
            java.io.File r9 = r2.A03
            java.io.File r8 = r2.A04
            long r0 = r2.A00
            boolean r3 = r2.A05
            long r4 = r2.A01
            boolean r6 = r2.A06
            boolean r11 = r2.A07
            boolean r2 = r2.A08
            X.AnonymousClass74M.A0K(r10, r2)
            X.2LC r7 = r10.A18
            java.lang.String r2 = "voicenote/voicenotestopped"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r2 = 37
            X.AnonymousClass7KX.A00(r7, r2)
            r7 = 0
            r10.A0P = r7
            r12 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            boolean r14 = X.AnonymousClass000.A1Q(r2)
            r12 = 100
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            boolean r2 = X.AnonymousClass000.A1Q(r2)
            if (r3 == 0) goto L_0x019e
            if (r2 == 0) goto L_0x019e
            if (r14 != 0) goto L_0x0045
        L_0x003c:
            int r2 = X.AnonymousClass74M.A1d
            X.AnonymousClass74M.A0E(r10, r2)
        L_0x0041:
            if (r3 == 0) goto L_0x0195
            if (r14 == 0) goto L_0x0052
        L_0x0045:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x0052
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r2 = "voicenote/file too small; not sending; voiceNoteFileLength="
            X.C17900vP.A0l(r2, r6, r0)
        L_0x0052:
            X.16P r2 = r10.A1G
            r2.A00 = r7
            r2 = 0
            r10.A0J = r2
            X.1FL r6 = r10.A0a
            r2 = -1
            r6.setRequestedOrientation(r2)
            X.6uN r2 = r10.A0y
            r2.A00()
            X.AnonymousClass74M.A06(r10)
            X.11C r2 = r10.A0m
            X.C84094Hv.A00(r2)
            if (r3 == 0) goto L_0x0172
            r12 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 < 0) goto L_0x012f
            r12 = 100
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 < 0) goto L_0x012f
            X.0ve r12 = r10.A0q
            r3 = 7698(0x1e12, float:1.0787E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r12, r3)
            if (r2 != 0) goto L_0x008b
            r2 = 50
            android.os.SystemClock.sleep(r2)
        L_0x008b:
            int r2 = X.AnonymousClass74M.A1g
            X.AnonymousClass74M.A0E(r10, r2)
            X.10I r3 = r10.A12
            r14 = 3
            X.Aio r2 = new X.Aio
            r12 = r2
            r13 = r10
            r15 = r0
            r17 = r4
            r12.<init>(r13, r14, r15, r17)
            r3.CGF(r2)
            X.6mx r3 = r10.A14
            java.io.File r2 = r10.A0K
            if (r2 == 0) goto L_0x012c
            java.lang.String r2 = r2.getName()
        L_0x00aa:
            r3.A00(r2)
            X.68R r2 = r10.A0D
            if (r2 == 0) goto L_0x0118
            long r2 = X.C17880vN.A04(r4)
            int r1 = (int) r2
            r0 = 1
            X.AnonymousClass74M.A0I(r10, r8, r1, r0)
        L_0x00ba:
            r0 = 5
            X.AnonymousClass74M.A0D(r10, r0)
            X.8AX r0 = r10.A1B
            r0.CAK()
        L_0x00c3:
            int r1 = r10.A01
            if (r1 == 0) goto L_0x00d6
            android.view.View r3 = r10.A0Y
            r0 = 2
            X.7Qt r2 = new X.7Qt
            r2.<init>(r10, r1, r0)
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.postDelayed(r2, r0)
            r10.A01 = r7
        L_0x00d6:
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L_0x010b
            android.view.View r1 = r10.A0Y
            r0 = 2131429565(0x7f0b08bd, float:1.8480806E38)
            android.view.View r1 = r1.findViewById(r0)
            if (r1 == 0) goto L_0x010b
            r0 = 2131436880(0x7f0b2550, float:1.8495643E38)
            android.view.View r1 = r1.findViewById(r0)
            if (r1 == 0) goto L_0x010b
            r0 = 1
            r1.setFocusable(r0)
            r1.setFocusableInTouchMode(r0)
            r1.requestFocus()
            r0 = 32768(0x8000, float:4.5918E-41)
            r1.sendAccessibilityEvent(r0)
        L_0x0108:
            r10.A0O = r7
            return
        L_0x010b:
            android.view.View r1 = r10.A0V
            r0 = 1
            r1.setFocusable(r0)
            r1.setFocusableInTouchMode(r0)
            r1.requestFocus()
            goto L_0x0108
        L_0x0118:
            X.1KB r3 = r10.A0g
            r16 = 4
            X.7R2 r2 = new X.7R2
            r12 = r2
            r14 = r9
            r15 = r8
            r17 = r0
            r19 = r11
            r12.<init>(r13, r14, r15, r16, r17, r19)
            r3.A0J(r2)
            goto L_0x00ba
        L_0x012c:
            r2 = 0
            goto L_0x00aa
        L_0x012f:
            if (r14 != 0) goto L_0x018c
            int r2 = X.AnonymousClass74M.A1f
            X.AnonymousClass74M.A0E(r10, r2)
            r2 = 7
            X.AnonymousClass74M.A0D(r10, r2)
            X.6tp r14 = r10.A1A
            X.70F r2 = r10.A0w
            boolean r2 = r2.A0B
            r19 = r2
            X.6mI r2 = r14.A06
            r30 = r2
            long r15 = r14.A01
            long r11 = r14.A02
            boolean r2 = r14.A04
            r18 = r2
            long r2 = r14.A00
            com.whatsapp.audioRecording.NoiseMetrics r13 = r14.A03
            r17 = 3
            r28 = r19
            r29 = r18
            r24 = r11
            r26 = r2
            r18 = r0
            r20 = r4
            r22 = r15
            r15 = r30
            r16 = r13
            r15.A00(r16, r17, r18, r20, r22, r24, r26, r28, r29)
            r0 = 0
            r14.A03 = r0
            X.3V4 r0 = r10.A0k
            r0.A0V(r7)
            goto L_0x018c
        L_0x0172:
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x018c
            r2 = 6
            X.AnonymousClass74M.A0D(r10, r2)
            X.10I r3 = r10.A12
            r13 = 4
            X.Aio r2 = new X.Aio
            r11 = r2
            r12 = r10
            r14 = r0
            r16 = r4
            r11.<init>(r12, r13, r14, r16)
            r3.CGF(r2)
        L_0x018c:
            X.10I r1 = r10.A12
            r0 = 47
            X.AnonymousClass7RD.A00(r1, r9, r8, r0)
            goto L_0x00c3
        L_0x0195:
            X.68R r2 = r10.A0D
            if (r2 == 0) goto L_0x0052
            X.AnonymousClass74M.A0I(r10, r8, r7, r7)
            goto L_0x0052
        L_0x019e:
            if (r14 == 0) goto L_0x003c
            if (r6 == 0) goto L_0x003c
            X.AnonymousClass74M.A04(r10)
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7QV.run():void");
    }

    public /* synthetic */ AnonymousClass7QV(AnonymousClass74M r1, File file, File file2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = r1;
        this.A03 = file;
        this.A04 = file2;
        this.A00 = j;
        this.A05 = z;
        this.A01 = j2;
        this.A06 = z2;
        this.A07 = z3;
        this.A08 = z4;
    }
}
