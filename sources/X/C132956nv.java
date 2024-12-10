package X;

import java.util.ArrayList;

/* renamed from: X.6nv  reason: invalid class name and case insensitive filesystem */
public final class C132956nv {
    public int A00;
    public final int A01;
    public final C128916gt A02;
    public final ArrayList A03 = AnonymousClass000.A13();
    public final ArrayList A04 = AnonymousClass000.A13();
    public final ArrayList A05 = AnonymousClass000.A13();

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0135, code lost:
        r0 = -25;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A00(java.lang.Integer r22, int r23, int r24, long r25) {
        /*
            r21 = this;
            r2 = r21
            monitor-enter(r2)
            r0 = 1
            r1 = r23
            r3 = r25
            if (r1 == r0) goto L_0x0019
            r0 = 2
            if (r1 == r0) goto L_0x0013
            java.util.ArrayList r0 = r2.A03     // Catch:{ all -> 0x01e8 }
            X.C17880vN.A1R(r0, r3)     // Catch:{ all -> 0x01e8 }
            goto L_0x001e
        L_0x0013:
            java.util.ArrayList r0 = r2.A05     // Catch:{ all -> 0x01e8 }
            X.C17880vN.A1R(r0, r3)     // Catch:{ all -> 0x01e8 }
            goto L_0x001e
        L_0x0019:
            java.util.ArrayList r0 = r2.A04     // Catch:{ all -> 0x01e8 }
            X.C17880vN.A1R(r0, r3)     // Catch:{ all -> 0x01e8 }
        L_0x001e:
            int r0 = r2.A00     // Catch:{ all -> 0x01e6 }
            int r0 = r0 + 1
            r2.A00 = r0     // Catch:{ all -> 0x01e6 }
            int r1 = r2.A01     // Catch:{ all -> 0x01e6 }
            if (r0 != r1) goto L_0x01e4
            java.util.ArrayList r0 = r2.A04     // Catch:{ all -> 0x01e6 }
            int r0 = r0.size()     // Catch:{ all -> 0x01e6 }
            if (r0 != r1) goto L_0x016d
            X.6gt r0 = r2.A02     // Catch:{ all -> 0x01e6 }
            X.6gr r3 = r0.A00     // Catch:{ all -> 0x01e6 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/media upload success for session: "
            r1.append(r0)     // Catch:{ all -> 0x01e6 }
            X.6sR r8 = r3.A02     // Catch:{ all -> 0x01e6 }
            java.lang.String r5 = r8.A01     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r5, r1)     // Catch:{ all -> 0x01e6 }
            r9 = 0
            X.C18070vi.A0d(r0, r9)     // Catch:{ all -> 0x01e6 }
            X.6Ue r0 = r3.A00     // Catch:{ all -> 0x01e6 }
            X.6mO r6 = new X.6mO     // Catch:{ all -> 0x01e6 }
            r6.<init>(r0, r5)     // Catch:{ all -> 0x01e6 }
            X.73A r0 = r3.A01     // Catch:{ all -> 0x01e6 }
            X.00H r0 = r0.A05     // Catch:{ all -> 0x01e6 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x01e6 }
            X.71L r7 = (X.AnonymousClass71L) r7     // Catch:{ all -> 0x01e6 }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x01e6 }
            X.1IX r3 = r8.A00     // Catch:{ all -> 0x01e6 }
            X.1IZ r13 = r3.iterator()     // Catch:{ all -> 0x01e6 }
        L_0x0064:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x01e6 }
            if (r0 == 0) goto L_0x013f
            X.206 r10 = X.C17880vN.A0Y(r13)     // Catch:{ all -> 0x01e6 }
            java.util.Map r11 = r8.A02     // Catch:{ all -> 0x01e6 }
            long r0 = r10.A0x     // Catch:{ all -> 0x01e6 }
            java.lang.Object r0 = X.C108965cb.A0o(r11, r0)     // Catch:{ all -> 0x01e6 }
            X.6t0 r0 = (X.C135936t0) r0     // Catch:{ all -> 0x01e6 }
            r1 = 0
            if (r0 == 0) goto L_0x00df
            X.77S r15 = r0.A02     // Catch:{ all -> 0x01e6 }
            if (r15 == 0) goto L_0x00df
            java.lang.String r0 = r0.A04     // Catch:{ all -> 0x01e6 }
            if (r0 == 0) goto L_0x00df
            int r12 = r0.length()     // Catch:{ all -> 0x01e6 }
            if (r12 == 0) goto L_0x00df
            X.1gU r11 = r7.A01     // Catch:{ all -> 0x01e6 }
            java.lang.String r17 = X.C109005cf.A0D(r11, r10)     // Catch:{ all -> 0x01e6 }
            int r12 = r10.A0u     // Catch:{ all -> 0x01e6 }
            r11 = 8
            X.1So r12 = X.C63972u0.A01(r1, r12, r11)     // Catch:{ all -> 0x01e6 }
            X.C18070vi.A0X(r12)     // Catch:{ all -> 0x01e6 }
            X.1So r11 = X.C26551So.A0w     // Catch:{ all -> 0x01e6 }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x01e6 }
            if (r11 == 0) goto L_0x00dc
            java.lang.String r18 = "IMAGE"
        L_0x00a4:
            X.36j r11 = X.C63672tV.A02(r10)     // Catch:{ all -> 0x01e6 }
            if (r11 == 0) goto L_0x00c2
            boolean r12 = r11.A08     // Catch:{ all -> 0x01e6 }
            r11 = 1
            if (r12 != r11) goto L_0x00c2
            X.00H r11 = r7.A02     // Catch:{ all -> 0x01e6 }
            java.lang.Object r11 = r11.get()     // Catch:{ all -> 0x01e6 }
            X.1Nt r11 = (X.C25321Nt) r11     // Catch:{ all -> 0x01e6 }
            r11.A04(r10)     // Catch:{ all -> 0x01e6 }
            X.77U r11 = X.AnonymousClass6XJ.A00(r10)     // Catch:{ all -> 0x01e6 }
            if (r11 == 0) goto L_0x00c2
            java.lang.String r1 = r11.A03     // Catch:{ all -> 0x01e6 }
        L_0x00c2:
            boolean r11 = r10 instanceof X.AnonymousClass21V     // Catch:{ all -> 0x01e6 }
            if (r11 == 0) goto L_0x00d9
            X.21V r10 = (X.AnonymousClass21V) r10     // Catch:{ all -> 0x01e6 }
            java.lang.String r16 = r10.A18()     // Catch:{ all -> 0x01e6 }
        L_0x00cc:
            X.6td r14 = new X.6td     // Catch:{ all -> 0x01e6 }
            r19 = r0
            r20 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x01e6 }
            r4.add(r14)     // Catch:{ all -> 0x01e6 }
            goto L_0x0064
        L_0x00d9:
            java.lang.String r16 = ""
            goto L_0x00cc
        L_0x00dc:
            java.lang.String r18 = "VIDEO"
            goto L_0x00a4
        L_0x00df:
            java.lang.String r0 = "XFamilyCrosspostRequestManager/crossposting info is empty or invalid"
            X.C17960vV.A0F(r9, r0)     // Catch:{ all -> 0x01e6 }
            java.util.ArrayList r9 = X.C29351c6.A0D(r3)     // Catch:{ all -> 0x01e6 }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x01e6 }
        L_0x00ec:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x01e6 }
            if (r0 == 0) goto L_0x00f6
            X.C108995ce.A1Q(r9, r4)     // Catch:{ all -> 0x01e6 }
            goto L_0x00ec
        L_0x00f6:
            X.1KB r8 = r7.A00     // Catch:{ all -> 0x01e6 }
            X.00H r0 = r7.A03     // Catch:{ all -> 0x01e6 }
            java.lang.Object r5 = X.C18070vi.A0E(r0)     // Catch:{ all -> 0x01e6 }
            X.2LI r5 = (X.AnonymousClass2LI) r5     // Catch:{ all -> 0x01e6 }
            X.00H r4 = r7.A06     // Catch:{ all -> 0x01e6 }
            r0 = 4
            X.AnonymousClass74B.A06(r8, r5, r4, r9, r0)     // Catch:{ all -> 0x01e6 }
            X.1IZ r5 = r3.iterator()     // Catch:{ all -> 0x01e6 }
        L_0x010a:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x01e6 }
            if (r0 == 0) goto L_0x0138
            X.206 r0 = X.C17880vN.A0Y(r5)     // Catch:{ all -> 0x01e6 }
            long r3 = r0.A0x     // Catch:{ all -> 0x01e6 }
            java.lang.Object r3 = X.C108965cb.A0o(r11, r3)     // Catch:{ all -> 0x01e6 }
            X.6t0 r3 = (X.C135936t0) r3     // Catch:{ all -> 0x01e6 }
            if (r3 != 0) goto L_0x011f
            goto L_0x012f
        L_0x011f:
            X.77S r0 = r3.A02     // Catch:{ all -> 0x01e6 }
            if (r0 != 0) goto L_0x0124
            goto L_0x0132
        L_0x0124:
            java.lang.String r0 = r3.A04     // Catch:{ all -> 0x01e6 }
            if (r0 == 0) goto L_0x0135
            int r0 = r0.length()     // Catch:{ all -> 0x01e6 }
            if (r0 != 0) goto L_0x010a
            goto L_0x0135
        L_0x012f:
            r0 = -23
            goto L_0x013a
        L_0x0132:
            r0 = -24
            goto L_0x013a
        L_0x0135:
            r0 = -25
            goto L_0x013a
        L_0x0138:
            r0 = -13
        L_0x013a:
            r6.A00(r0, r1)     // Catch:{ all -> 0x01e6 }
            goto L_0x01e4
        L_0x013f:
            X.6n3 r9 = new X.6n3     // Catch:{ all -> 0x01e6 }
            r9.<init>(r6, r8, r7)     // Catch:{ all -> 0x01e6 }
            X.00H r0 = r7.A04     // Catch:{ all -> 0x01e6 }
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x01e6 }
            X.6wz r10 = (X.C138386wz) r10     // Catch:{ all -> 0x01e6 }
            r3 = 0
            X.1mM r1 = r10.A00     // Catch:{ all -> 0x01e6 }
            java.lang.Integer r0 = X.AnonymousClass00R.A05     // Catch:{ all -> 0x01e6 }
            X.6qd r0 = r1.A00(r0)     // Catch:{ all -> 0x01e6 }
            if (r0 != 0) goto L_0x015d
            r0 = -5
            r9.A00(r0, r3)     // Catch:{ all -> 0x01e6 }
            goto L_0x01e4
        L_0x015d:
            X.77S r8 = r0.A00     // Catch:{ all -> 0x01e6 }
            r3 = 3
            long r0 = X.C137916wE.A01     // Catch:{ all -> 0x01e6 }
            X.705 r7 = new X.705     // Catch:{ all -> 0x01e6 }
            r7.<init>(r3, r0)     // Catch:{ all -> 0x01e6 }
            r11 = r5
            r12 = r4
            X.C138386wz.A00(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01e6 }
            goto L_0x01e4
        L_0x016d:
            java.util.ArrayList r0 = r2.A03     // Catch:{ all -> 0x01e6 }
            boolean r0 = X.C17880vN.A1X(r0)     // Catch:{ all -> 0x01e6 }
            r5 = r22
            r6 = r24
            if (r0 == 0) goto L_0x01c1
            X.6gt r8 = r2.A02     // Catch:{ all -> 0x01e6 }
            X.6kG r0 = r8.A02     // Catch:{ all -> 0x01e6 }
            X.00H r0 = r0.A09     // Catch:{ all -> 0x01e6 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x01e6 }
            X.6p6 r7 = (X.AnonymousClass6p6) r7     // Catch:{ all -> 0x01e6 }
            X.6sR r0 = r8.A01     // Catch:{ all -> 0x01e6 }
            java.lang.String r4 = r0.A01     // Catch:{ all -> 0x01e6 }
            X.1IX r0 = r0.A00     // Catch:{ all -> 0x01e6 }
            java.util.ArrayList r3 = X.C29351c6.A0D(r0)     // Catch:{ all -> 0x01e6 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x01e6 }
        L_0x0193:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01e6 }
            if (r0 == 0) goto L_0x019d
            X.C108995ce.A1Q(r3, r1)     // Catch:{ all -> 0x01e6 }
            goto L_0x0193
        L_0x019d:
            r7.A01(r4, r3)     // Catch:{ all -> 0x01e6 }
            X.6gr r7 = r8.A00     // Catch:{ all -> 0x01e6 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/media upload delivery failure for session: "
            r1.append(r0)     // Catch:{ all -> 0x01e6 }
            X.6sR r0 = r7.A02     // Catch:{ all -> 0x01e6 }
            java.lang.String r4 = r0.A01     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r4, r1)     // Catch:{ all -> 0x01e6 }
            r3 = 0
            X.C18070vi.A0d(r0, r3)     // Catch:{ all -> 0x01e6 }
            X.6Ue r1 = r7.A00     // Catch:{ all -> 0x01e6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01e6 }
            r1.A00(r0, r5, r4, r3)     // Catch:{ all -> 0x01e6 }
            goto L_0x01e4
        L_0x01c1:
            X.6gt r0 = r2.A02     // Catch:{ all -> 0x01e6 }
            X.6gr r4 = r0.A00     // Catch:{ all -> 0x01e6 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/media upload error for session: "
            r1.append(r0)     // Catch:{ all -> 0x01e6 }
            X.6sR r0 = r4.A02     // Catch:{ all -> 0x01e6 }
            java.lang.String r3 = r0.A01     // Catch:{ all -> 0x01e6 }
            r1.append(r3)     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = " with errorCode: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r6)     // Catch:{ all -> 0x01e6 }
            r1 = 0
            X.C18070vi.A0d(r0, r1)     // Catch:{ all -> 0x01e6 }
            X.6Ue r0 = r4.A00     // Catch:{ all -> 0x01e6 }
            r0.A01(r5, r3, r6, r1)     // Catch:{ all -> 0x01e6 }
        L_0x01e4:
            monitor-exit(r2)
            return
        L_0x01e6:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01e8 }
        L_0x01e8:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132956nv.A00(java.lang.Integer, int, int, long):void");
    }

    public C132956nv(C128916gt r2, int i) {
        this.A01 = i;
        this.A02 = r2;
    }
}
