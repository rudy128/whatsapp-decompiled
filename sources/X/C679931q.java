package X;

/* renamed from: X.31q  reason: invalid class name and case insensitive filesystem */
public class C679931q implements C1605688z {
    public final int A00;
    public final int A01;
    public final AnonymousClass18H A02;
    public final C18140vp A03;
    public final AnonymousClass11N A04;
    public final AnonymousClass00H A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012f, code lost:
        if ((r6 - r4.A05.A05[r4.A02].A04) > r2) goto L_0x0131;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CHI(X.C25847Cn3 r10, boolean r11) {
        /*
            r9 = this;
            X.00H r1 = r9.A05
            java.lang.Object r0 = r1.get()
            X.11x r0 = (X.C203811x) r0
            X.00H r0 = r0.A05
            java.lang.Object r0 = r0.get()
            X.1Hc r0 = (X.C23651Hc) r0
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "WamSender/send/mh-disconnected"
        L_0x0018:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x001b:
            return
        L_0x001c:
            boolean r0 = r9.A06
            if (r0 == 0) goto L_0x003b
            int r0 = r10.A03
            if (r0 != 0) goto L_0x003b
            java.lang.Object r0 = r1.get()
            X.11x r0 = (X.C203811x) r0
            X.00H r0 = r0.A05
            java.lang.Object r0 = r0.get()
            X.1Hc r0 = (X.C23651Hc) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "WamSender/send/offline-in-progress"
            goto L_0x0018
        L_0x003b:
            int r1 = r10.A03
            r0 = 1
            if (r1 != r0) goto L_0x00d2
            boolean r0 = r10.A07()
            if (r0 != 0) goto L_0x0051
            X.CcQ r0 = r10.A04
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0051
            r10.A04()
        L_0x0051:
            X.CcQ r4 = r10.A04
            boolean r0 = r4.A06()
            if (r0 == 0) goto L_0x001b
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x0060
            r10.A03()
        L_0x0060:
            android.util.SparseArray r7 = r4.A00()
            X.0vp r0 = r9.A03
            java.lang.Object r6 = r0.get()
            X.2cY r6 = (X.C53452cY) r6
            int r0 = r7.size()
            java.util.ArrayList r3 = X.C17880vN.A0z(r0)
            r5 = 0
        L_0x0075:
            int r0 = r7.size()
            if (r5 >= r0) goto L_0x0142
            java.util.Set r0 = r6.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0081:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d0
            java.lang.Object r0 = r1.next()
            X.1HT r0 = (X.AnonymousClass1HT) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0081
            r2 = 1
        L_0x0094:
            X.11x r8 = r6.A00
            X.00H r0 = r8.A03
            X.1OZ r1 = X.C17880vN.A0U(r0)
            X.1Hc r0 = r1.A02
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0142
            X.1nd r0 = r1.A0I
            if (r0 == 0) goto L_0x0142
            if (r2 != 0) goto L_0x0142
            int r2 = r7.keyAt(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WamSender/sending/buffer:"
            X.C17900vP.A0j(r0, r1, r2)
            java.lang.Object r0 = r7.get(r2)
            byte[] r0 = (byte[]) r0
            boolean r0 = r8.A01(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r0 == 0) goto L_0x013d
            java.lang.String r0 = "WamSender/send/buffer:"
            X.C17900vP.A0j(r0, r1, r2)
            X.C17890vO.A1D(r3, r2)
            int r5 = r5 + 1
            goto L_0x0075
        L_0x00d0:
            r2 = 0
            goto L_0x0094
        L_0x00d2:
            if (r1 != 0) goto L_0x0051
            X.CcQ r4 = r10.A04
            boolean r0 = r4.A06()
            if (r0 != 0) goto L_0x0051
            boolean r0 = r10.A07()
            if (r0 != 0) goto L_0x0051
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r6 = r2.toSeconds(r0)
            X.18H r5 = r9.A02
            monitor-enter(r5)
            int r1 = X.AnonymousClass1Es.A00(r5)     // Catch:{ all -> 0x015b }
            r0 = 2
            r2 = 0
            if (r1 < r0) goto L_0x0108
            X.0vl r0 = r5.A00     // Catch:{ all -> 0x015b }
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r0)     // Catch:{ all -> 0x015b }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = "wam_is_current_buffer_real_time"
            boolean r0 = r1.getBoolean(r0, r2)     // Catch:{ all -> 0x015b }
            goto L_0x0118
        L_0x0108:
            X.0vl r0 = r5.A01     // Catch:{ all -> 0x015b }
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r0)     // Catch:{ all -> 0x015b }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = "wam_is_current_buffer_real_time"
            boolean r0 = r1.getBoolean(r0, r2)     // Catch:{ all -> 0x015b }
        L_0x0118:
            monitor-exit(r5)
            if (r0 == 0) goto L_0x013a
            int r0 = r9.A00
        L_0x011d:
            long r2 = (long) r0
            if (r11 != 0) goto L_0x0131
            X.CcL r4 = r4.A00
            X.CT0 r0 = r4.A05
            X.CSz[] r1 = r0.A05
            int r0 = r4.A02
            r0 = r1[r0]
            long r0 = r0.A04
            long r6 = r6 - r0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0051
        L_0x0131:
            r10.A04()
            r0 = 0
            r5.A00(r0)
            goto L_0x0051
        L_0x013a:
            int r0 = r9.A01
            goto L_0x011d
        L_0x013d:
            java.lang.String r0 = "WamSender/fail/buffer:"
            X.C17900vP.A0j(r0, r1, r2)
        L_0x0142:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0157
            java.lang.String r0 = "WamSender/send: successfully sent data; dropping the buffer"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.A04(r3)
            r10.A03()
            java.lang.String r0 = "WamSender/sendack: dropped rotated buffer"
            goto L_0x0018
        L_0x0157:
            java.lang.String r0 = "WamSender/send: failed to send data"
            goto L_0x0018
        L_0x015b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C679931q.CHI(X.Cn3, boolean):void");
    }

    public void CHK(C25847Cn3 cn3, int i, boolean z, boolean z2) {
        throw new UnsupportedOperationException("fieldstatssender/send should not call send method with dithered info");
    }

    public C679931q(AnonymousClass11N r5, AnonymousClass18H r6, C18030ve r7, AnonymousClass00H r8, C18140vp r9) {
        this.A03 = r9;
        this.A05 = r8;
        this.A02 = r6;
        this.A04 = r5;
        C18040vf r2 = C18040vf.A02;
        this.A01 = C18020vd.A00(r2, r7, 7018);
        this.A00 = Math.min(300, C18020vd.A00(r2, r7, 7018));
        this.A06 = C18020vd.A05(r2, r7, 9654);
    }
}
