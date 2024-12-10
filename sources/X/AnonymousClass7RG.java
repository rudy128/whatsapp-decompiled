package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7RG  reason: invalid class name */
public class AnonymousClass7RG implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;

    public AnonymousClass7RG(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A08 = str;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A06 = obj6;
        this.A07 = obj7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x011e, code lost:
        if (r0 == false) goto L_0x0120;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r52 = this;
            r0 = r52
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0029;
                case 1: goto L_0x00d5;
                case 2: goto L_0x0135;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r7 = r0.A02
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7
            java.lang.Object r1 = r0.A07
            X.732 r1 = (X.AnonymousClass732) r1
            java.lang.Object r6 = r0.A05
            java.security.PublicKey r6 = (java.security.PublicKey) r6
            java.lang.Object r4 = r0.A04
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r2 = r0.A01
            X.89m r2 = (X.C1606789m) r2
            java.lang.Object r3 = r0.A03
            X.705 r3 = (X.AnonymousClass705) r3
            java.lang.String r5 = r0.A08
            java.lang.Object r0 = r0.A06
            X.7Gg r0 = (X.C144167Gg) r0
            r0.CBb(r1, r2, r3, r4, r5, r6, r7)
        L_0x0028:
            return
        L_0x0029:
            java.lang.Object r5 = r0.A01
            X.4aY r5 = (X.AnonymousClass4aY) r5
            java.lang.Object r8 = r0.A02
            java.util.Map r8 = (java.util.Map) r8
            java.lang.String r13 = r0.A08
            java.lang.Object r2 = r0.A03
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r7 = r0.A04
            java.lang.Object r6 = r0.A05
            java.lang.Object r4 = r0.A06
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r3 = r0.A07
            X.73D r3 = (X.AnonymousClass73D) r3
            X.5cQ r0 = r5.A2Q
            r0.CEx()
            X.1KB r0 = r5.A1L
            X.1FR r1 = r0.A00
            boolean r0 = r1 instanceof X.AnonymousClass8B4
            if (r0 == 0) goto L_0x0028
            X.8B4 r1 = (X.AnonymousClass8B4) r1
            X.34H r12 = new X.34H
            r12.<init>(r5, r13, r2, r8)
            java.util.HashMap r11 = X.C17880vN.A11()
            r10 = 0
            r11.put(r10, r7)
            X.10I r9 = r5.A4c
            X.6ZQ r7 = r5.A1G
            java.util.List r35 = java.util.Collections.singletonList(r6)
            boolean r14 = r5.A6g
            java.util.Map r37 = java.util.Collections.emptyMap()
            java.util.HashSet r33 = X.C17880vN.A12()
            r8 = 1
            java.lang.Integer r27 = java.lang.Integer.valueOf(r8)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r2)
            r40 = 0
            java.lang.Long r28 = java.lang.Long.valueOf(r40)
            r5 = 0
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r5)
            int r0 = r2.size()
            if (r0 > r8) goto L_0x008d
            r13 = r10
        L_0x008d:
            X.1K2 r0 = r7.A00
            X.1K1 r0 = r0.A00
            android.app.Activity r7 = r0.AAO
            r39 = 3
            r42 = -1
            X.6Md r15 = new X.6Md
            r19 = r10
            r21 = r10
            r24 = r10
            r25 = r10
            r30 = r28
            r47 = r8
            r48 = r5
            r49 = r5
            r50 = r5
            r51 = r5
            r17 = r10
            r29 = r28
            r31 = r13
            r32 = r4
            r34 = r6
            r36 = r2
            r38 = r11
            r44 = r14
            r45 = r8
            r46 = r5
            r20 = r3
            r22 = r1
            r23 = r12
            r18 = r10
            r16 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42, r44, r45, r46, r47, r48, r49, r50, r51)
            X.AnonymousClass1K1.A6v(r0, r15)
            X.AnonymousClass3MW.A1T(r15, r9, r5)
            return
        L_0x00d5:
            java.lang.Object r1 = r0.A01
            X.1QR r1 = (X.AnonymousClass1QR) r1
            java.lang.String r3 = r0.A08
            java.lang.Object r7 = r0.A02
            X.10I r7 = (X.AnonymousClass10I) r7
            java.lang.Object r9 = r0.A03
            java.lang.Object r6 = r0.A04
            java.lang.Object r2 = r0.A05
            X.1KB r2 = (X.AnonymousClass1KB) r2
            java.lang.Object r8 = r0.A06
            java.lang.Object r4 = r0.A07
            X.1jA r4 = (X.C33651jA) r4
            java.util.List r0 = java.util.Collections.singletonList(r3)
            java.util.ArrayList r1 = r1.A0U(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0120
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            X.AW0 r0 = (X.AW0) r0
            int r1 = r0.A02
            java.util.Set r0 = X.A63.A01
            boolean r0 = X.C108965cb.A1b(r0, r1)
            if (r0 == 0) goto L_0x0116
            r10 = 0
            X.AXH r5 = new X.AXH
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A02(r5, r3, r10)
            return
        L_0x0116:
            java.util.Set r0 = X.A63.A00
            boolean r0 = X.C108965cb.A1b(r0, r1)
            r1 = 12
            if (r0 != 0) goto L_0x012c
        L_0x0120:
            r1 = 28
            X.3Ch r0 = new X.3Ch
            r0.<init>(r6, r9, r1)
            r7.CGF(r0)
            r1 = 11
        L_0x012c:
            X.4rM r0 = new X.4rM
            r0.<init>(r8, r1)
            r2.A0J(r0)
            return
        L_0x0135:
            java.lang.Object r7 = r0.A02
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7
            java.lang.Object r1 = r0.A07
            X.732 r1 = (X.AnonymousClass732) r1
            java.lang.Object r6 = r0.A05
            java.security.PublicKey r6 = (java.security.PublicKey) r6
            java.lang.Object r4 = r0.A04
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r2 = r0.A01
            X.89m r2 = (X.C1606789m) r2
            java.lang.Object r3 = r0.A03
            X.705 r3 = (X.AnonymousClass705) r3
            java.lang.String r5 = r0.A08
            java.lang.Object r0 = r0.A06
            X.7Gd r0 = (X.C144137Gd) r0
            r0.CBb(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RG.run():void");
    }

    public AnonymousClass7RG(AnonymousClass732 r2, C1606789m r3, AnonymousClass705 r4, C144137Gd r5, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A00 = 2;
        C18070vi.A0d(x509Certificate, 2);
        C18070vi.A0l(r3, r4);
        this.A06 = r5;
        this.A02 = x509Certificate;
        this.A07 = r2;
        this.A05 = publicKey;
        this.A04 = num;
        this.A01 = r3;
        this.A03 = r4;
        this.A08 = str;
    }

    public AnonymousClass7RG(AnonymousClass732 r2, C1606789m r3, AnonymousClass705 r4, C144167Gg r5, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A00 = 3;
        C18070vi.A0d(x509Certificate, 2);
        C18070vi.A0l(r3, r4);
        this.A06 = r5;
        this.A02 = x509Certificate;
        this.A07 = r2;
        this.A05 = publicKey;
        this.A04 = num;
        this.A01 = r3;
        this.A03 = r4;
        this.A08 = str;
    }
}
