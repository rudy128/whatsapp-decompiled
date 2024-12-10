package X;

/* renamed from: X.5jF  reason: invalid class name and case insensitive filesystem */
public final class C111235jF extends AnonymousClass1J2 implements AnonymousClass1GC {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass1DS A04;
    public final AnonymousClass1DT A05;
    public final C24661Le A06;
    public final C18030ve A07;
    public final AnonymousClass1Nb A08;
    public final AnonymousClass1W6 A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final C18600wl A0C;
    public final C19880zA A0D;
    public final AnonymousClass00H A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        if (r1.A01() <= 0) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ac, code lost:
        if (X.AnonymousClass000.A1Y(r0.getValue()) == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c7, code lost:
        if (r6.A01() > 0) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d9, code lost:
        if (r12 == false) goto L_0x00db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x008c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A0T(com.whatsapp.jid.UserJid r10, X.C130606ji r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            r0 = 3
            X.C18070vi.A0d(r11, r0)
            X.1Le r1 = r9.A06
            X.2sx r0 = r1.A08(r10)
            if (r13 == 0) goto L_0x0104
            if (r0 == 0) goto L_0x0104
            int r0 = r0.A01()
            if (r0 <= 0) goto L_0x0104
            java.util.ArrayList r5 = r1.A09()
            int r1 = r11.A03
            r0 = 1
            if (r1 == r0) goto L_0x00e0
            r0 = 2
            if (r1 != r0) goto L_0x0040
            X.00H r0 = r11.A04
            java.lang.Object r3 = r0.get()
            X.73z r3 = (X.C1410273z) r3
            java.util.ArrayList r2 = X.C29431cG.A0m(r5)
            X.0vl r0 = r3.A0K
            java.lang.Object r1 = r0.getValue()
            X.7Rg r1 = (X.C146957Rg) r1
            java.util.Map r0 = r3.A01
            r1.A00 = r0
            X.C29391cC.A0H(r2, r1)
            X.DcO r5 = new X.DcO
            r5.<init>(r2)
        L_0x0040:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r5.iterator()
        L_0x0048:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2sx r0 = (X.C63372sx) r0
            com.whatsapp.jid.UserJid r0 = r0.A0A
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0048
        L_0x005d:
            X.2sx r1 = (X.C63372sx) r1
            r8 = 0
            r2 = 1
            if (r1 == 0) goto L_0x006a
            int r1 = r1.A01()
            r0 = 1
            if (r1 > 0) goto L_0x006b
        L_0x006a:
            r0 = 0
        L_0x006b:
            r9.A03 = r0
            boolean r0 = X.C22971Dz.A0Z(r10)
            if (r0 != 0) goto L_0x0083
            X.00H r0 = r9.A0E
            java.lang.Object r0 = r0.get()
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            if (r0 == 0) goto L_0x0084
            boolean r0 = r0.A0z(r10)
            if (r0 != r2) goto L_0x0084
        L_0x0083:
            r8 = 1
        L_0x0084:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r7 = r5.iterator()
        L_0x008c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x017d
            java.lang.Object r5 = r7.next()
            r6 = r5
            X.2sx r6 = (X.C63372sx) r6
            X.7wC r0 = new X.7wC
            r0.<init>(r6, r10, r9)
            X.0vm r0 = X.AnonymousClass1DF.A01(r0)
            if (r8 != 0) goto L_0x00b5
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 != 0) goto L_0x00db
        L_0x00ae:
            r0 = 0
        L_0x00af:
            if (r0 == 0) goto L_0x008c
            r3.add(r5)
            goto L_0x008c
        L_0x00b5:
            com.whatsapp.jid.UserJid r2 = r6.A0A
            X.1E5 r1 = X.AnonymousClass1E5.A00
            r0 = 0
            if (r2 != r1) goto L_0x00bd
            r0 = 1
        L_0x00bd:
            if (r0 != 0) goto L_0x00ae
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x00c9
            int r0 = r6.A01()
            if (r0 <= 0) goto L_0x00ae
        L_0x00c9:
            X.1Nb r0 = r9.A08
            X.1yM r0 = r0.A0a(r2)
            boolean r0 = r0.A0U
            if (r0 != 0) goto L_0x00ae
            boolean r0 = X.C18070vi.A18(r2, r10)
            if (r0 != 0) goto L_0x00db
            if (r12 != 0) goto L_0x00ae
        L_0x00db:
            r0 = 1
            goto L_0x00af
        L_0x00dd:
            r1 = 0
            goto L_0x005d
        L_0x00e0:
            X.00H r0 = r11.A05
            java.lang.Object r3 = r0.get()
            X.6j1 r3 = (X.C130186j1) r3
            monitor-enter(r3)
            java.util.ArrayList r2 = X.C29431cG.A0m(r5)     // Catch:{ all -> 0x0181 }
            X.0vl r0 = r3.A05     // Catch:{ all -> 0x0181 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0181 }
            X.7Rg r1 = (X.C146957Rg) r1     // Catch:{ all -> 0x0181 }
            java.util.Map r0 = r3.A00     // Catch:{ all -> 0x0181 }
            r1.A00 = r0     // Catch:{ all -> 0x0181 }
            X.C29391cC.A0H(r2, r1)     // Catch:{ all -> 0x0181 }
            X.DcO r5 = new X.DcO     // Catch:{ all -> 0x0181 }
            r5.<init>(r2)     // Catch:{ all -> 0x0181 }
            monitor-exit(r3)
            goto L_0x0040
        L_0x0104:
            java.util.ArrayList r3 = r1.A09()
            X.0ve r2 = r9.A07
            r1 = 9599(0x257f, float:1.3451E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.1IX r0 = X.AnonymousClass1IX.copyOf((java.util.Collection) r3)
            X.C18070vi.A0X(r0)
            if (r1 == 0) goto L_0x016b
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r6 = r0.iterator()
            r4 = 0
        L_0x0130:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0156
            java.lang.Object r3 = r6.next()
            X.2sx r3 = (X.C63372sx) r3
            com.whatsapp.jid.UserJid r2 = r3.A0A
            X.1E5 r1 = X.AnonymousClass1E5.A00
            r0 = 0
            if (r2 != r1) goto L_0x0144
            r0 = 1
        L_0x0144:
            if (r0 == 0) goto L_0x0148
            r4 = r3
            goto L_0x0130
        L_0x0148:
            int r0 = r3.A01()
            if (r0 != 0) goto L_0x0152
            r7.add(r3)
            goto L_0x0130
        L_0x0152:
            r8.add(r3)
            goto L_0x0130
        L_0x0156:
            java.util.Comparator r0 = com.whatsapp.status.playback.StatusPlaybackActivity.A0j
            X.C29391cC.A0H(r8, r0)
            X.C29391cC.A0H(r7, r0)
            if (r4 == 0) goto L_0x0163
            r5.add(r4)
        L_0x0163:
            r5.addAll(r8)
            r5.addAll(r7)
            goto L_0x0040
        L_0x016b:
            java.util.ArrayList r5 = X.C29431cG.A0m(r0)
            X.84P r2 = X.AnonymousClass84P.A00
            r1 = 12
            X.7Rk r0 = new X.7Rk
            r0.<init>((java.lang.Object) r2, (int) r1)
            X.C29391cC.A0H(r5, r0)
            goto L_0x0040
        L_0x017d:
            r4.addAll(r3)
            return r4
        L_0x0181:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111235jF.A0T(com.whatsapp.jid.UserJid, X.6ji, boolean, boolean):java.util.ArrayList");
    }

    public void C6U(C27581Wq r1, AnonymousClass1F9 r2) {
    }

    public C111235jF(C19880zA r2, C24661Le r3, C18030ve r4, AnonymousClass1Nb r5, AnonymousClass1W6 r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, C18600wl r10) {
        C18070vi.A0w(r4, r7, r8, r9, r10);
        C18070vi.A0d(r2, 6);
        this.A07 = r4;
        this.A0E = r7;
        this.A0A = r8;
        this.A0B = r9;
        this.A0C = r10;
        this.A0D = r2;
        this.A06 = r3;
        this.A09 = r6;
        this.A08 = r5;
        AnonymousClass1DT A0S = C108945cZ.A0S();
        this.A05 = A0S;
        this.A04 = A0S;
    }
}
