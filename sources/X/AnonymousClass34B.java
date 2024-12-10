package X;

import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.34B  reason: invalid class name */
public final class AnonymousClass34B implements AnonymousClass85B {
    public int A00;
    public int A01 = 1;
    public AnonymousClass34A A02;
    public C184589bC A03;
    public String A04;
    public boolean A05;
    public byte[] A06;
    public final AnonymousClass1TJ A07;
    public final AnonymousClass1TJ A08;
    public final AnonymousClass1TJ A09;
    public final AnonymousClass1TJ A0A = new AnonymousClass1TJ();
    public final AnonymousClass1TJ A0B = new AnonymousClass1TJ();
    public final AnonymousClass1TJ A0C = new AnonymousClass1TJ();
    public final AnonymousClass1TJ A0D = new AnonymousClass1TJ();
    public final AnonymousClass1TJ A0E;
    public final AnonymousClass1TJ A0F;
    public final AnonymousClass1TJ A0G;
    public final AnonymousClass1TJ A0H = new AnonymousClass1TJ();
    public final AnonymousClass1TJ A0I;
    public final AnonymousClass1TJ A0J;
    public final AnonymousClass1TJ A0K;
    public final AnonymousClass1TJ A0L;
    public final C22498BAf A0M;
    public final C56202h4 A0N;
    public final C1408173e A0O;
    public final C63722ta A0P;
    public final AnonymousClass1TI A0Q;
    public final AnonymousClass1TI A0R;
    public final AnonymousClass1TI A0S;
    public final AnonymousClass1TI A0T;
    public final AnonymousClass1TI A0U;
    public final Object A0V = C17880vN.A0p();
    public final AtomicBoolean A0W = new AtomicBoolean();
    public final AtomicBoolean A0X = new AtomicBoolean();
    public final AtomicBoolean A0Y = new AtomicBoolean();
    public volatile String A0Z;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass34B(X.C22498BAf r9, X.C18030ve r10, X.C56202h4 r11, X.C1408173e r12, X.C63722ta r13) {
        /*
            r8 = this;
            r2 = 1
            r0 = 5
            X.C18070vi.A0d(r10, r0)
            r8.<init>()
            r8.A0N = r11
            r8.A0P = r13
            r8.A0O = r12
            r8.A0M = r9
            java.lang.Object r0 = X.C17880vN.A0p()
            r8.A0V = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r8.A0W = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r8.A0Y = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r8.A0X = r0
            r8.A01 = r2
            X.1TJ r0 = new X.1TJ
            r0.<init>()
            r8.A0C = r0
            X.1TJ r0 = new X.1TJ
            r0.<init>()
            r8.A0A = r0
            X.1TJ r0 = new X.1TJ
            r0.<init>()
            r8.A0B = r0
            X.1TJ r0 = new X.1TJ
            r0.<init>()
            r8.A0D = r0
            X.1TJ r0 = new X.1TJ
            r0.<init>()
            r8.A0H = r0
            X.1TJ r6 = new X.1TJ
            r6.<init>()
            r8.A0G = r6
            X.1TJ r5 = new X.1TJ
            r5.<init>()
            r8.A09 = r5
            X.1TJ r4 = new X.1TJ
            r4.<init>()
            r8.A0F = r4
            X.1TJ r3 = new X.1TJ
            r3.<init>()
            r8.A0J = r3
            X.1TJ r1 = new X.1TJ
            r1.<init>()
            r8.A0K = r1
            X.1TJ r0 = new X.1TJ
            r0.<init>()
            r8.A0L = r0
            X.1TJ r0 = new X.1TJ
            r0.<init>()
            r8.A0I = r0
            X.1TJ r0 = new X.1TJ
            r0.<init>()
            r8.A07 = r0
            X.1TJ r0 = new X.1TJ
            r0.<init>()
            r8.A08 = r0
            X.1TJ r0 = new X.1TJ
            r0.<init>()
            r8.A0E = r0
            r8.A0R = r4
            r8.A0S = r6
            r8.A0Q = r5
            r8.A0T = r3
            r8.A0U = r1
            X.2kI r3 = r13.A02
            int r7 = r3.A01
            X.1So r0 = r3.A06
            int r6 = r0.A00
            r1 = 0
            int r4 = X.C1409973w.A01(r6, r7, r1)
            monitor-enter(r12)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0134 }
            r12.A09 = r0     // Catch:{ all -> 0x0134 }
            r12.A0G = r1     // Catch:{ all -> 0x0134 }
            monitor-exit(r12)
            monitor-enter(r12)
            r5 = 3
            r1 = 2
            if (r7 == r2) goto L_0x00ce
            if (r7 == r1) goto L_0x00cb
            r0 = 4
            if (r7 == r0) goto L_0x00d6
            switch(r7) {
                case 8: goto L_0x00c8;
                case 9: goto L_0x00c8;
                case 10: goto L_0x00d6;
                case 11: goto L_0x00cb;
                case 12: goto L_0x00c8;
                default: goto L_0x00c4;
            }
        L_0x00c4:
            switch(r7) {
                case 29: goto L_0x00d6;
                case 30: goto L_0x00cb;
                case 31: goto L_0x00cb;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            goto L_0x00d3
        L_0x00c8:
            r12.A01 = r0     // Catch:{ all -> 0x0134 }
            goto L_0x00d8
        L_0x00cb:
            r12.A01 = r5     // Catch:{ all -> 0x0134 }
            goto L_0x00d8
        L_0x00ce:
            if (r4 == r5) goto L_0x00d6
            if (r4 != r1) goto L_0x00d3
            goto L_0x00d6
        L_0x00d3:
            r12.A01 = r2     // Catch:{ all -> 0x0134 }
            goto L_0x00d8
        L_0x00d6:
            r12.A01 = r1     // Catch:{ all -> 0x0134 }
        L_0x00d8:
            monitor-exit(r12)
            X.2h8 r0 = r13.A01
            boolean r0 = r0.A0G
            monitor-enter(r12)
            r12.A0E = r0     // Catch:{ all -> 0x0134 }
            monitor-exit(r12)
            boolean r0 = X.AnonymousClass25A.A0I(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            monitor-enter(r12)
            r12.A08 = r0     // Catch:{ all -> 0x0134 }
            monitor-exit(r12)
            X.6nF r4 = r3.A05
            monitor-enter(r12)
            if (r4 == 0) goto L_0x0118
            r1 = 3349(0xd15, float:4.693E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0134 }
            boolean r0 = X.C18020vd.A05(r0, r10, r1)     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0118
            boolean r0 = r4 instanceof X.C1194268b     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0107
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0134 }
            r12.A0A = r0     // Catch:{ all -> 0x0134 }
            goto L_0x0118
        L_0x0107:
            boolean r0 = r4 instanceof X.C1194468d     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0112
            java.lang.Integer r0 = X.C17880vN.A0i()     // Catch:{ all -> 0x0134 }
            r12.A0A = r0     // Catch:{ all -> 0x0134 }
            goto L_0x0118
        L_0x0112:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0134 }
            r12.A0A = r0     // Catch:{ all -> 0x0134 }
        L_0x0118:
            monitor-exit(r12)
            boolean r0 = r3.A0H
            monitor-enter(r12)
            r12.A0F = r0     // Catch:{ all -> 0x0134 }
            monitor-exit(r12)
            int r0 = r13.A00
            monitor-enter(r12)
            r12.A00 = r0     // Catch:{ all -> 0x0134 }
            monitor-exit(r12)
            java.io.File r0 = r3.A08
            if (r0 == 0) goto L_0x0133
            X.2ex r1 = new X.2ex
            r1.<init>(r0, r2)
            X.1TJ r0 = r8.A0B
            r0.A04(r1)
        L_0x0133:
            return
        L_0x0134:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34B.<init>(X.BAf, X.0ve, X.2h4, X.73e, X.2ta):void");
    }

    public final void A08(boolean z) {
        this.A05 = true;
        this.A0O.A0M.set(z);
    }

    public final int A00() {
        C58192kI r4 = this.A0P.A02;
        String str = r4.A0B;
        if (str != null && str.startsWith("image")) {
            AnonymousClass6nF r1 = r4.A05;
            if (r1 == null) {
                return 1;
            }
            if (r1 instanceof C1194268b) {
                return 3;
            }
            if (r1 instanceof C1194468d) {
                return 2;
            }
            return 1;
        } else if (r4.A0H) {
            return 3;
        } else {
            return 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C56232h8 A01() {
        /*
            r36 = this;
            r3 = r36
            X.2ta r0 = r3.A0P
            X.2h8 r0 = r0.A01
            X.C18070vi.A0X(r0)
            java.lang.String r14 = r3.A0Z
            if (r14 != 0) goto L_0x000f
            java.lang.String r14 = "optimistic"
        L_0x000f:
            X.1TJ r1 = r3.A0B
            java.lang.Object r15 = r1.A00()
            X.2ex r15 = (X.C54942ex) r15
            X.1TJ r1 = r3.A0H
            java.lang.Object r8 = r1.A00()
            X.2fe r8 = (X.C55362fe) r8
            X.1TJ r1 = r3.A0E
            java.lang.Object r2 = r1.A00()
            X.9gF r2 = (X.C187709gF) r2
            int r13 = r3.A01
            java.io.File r1 = r0.A07
            java.lang.String r12 = r0.A0A
            r18 = r12
            java.lang.String r11 = r0.A09
            r17 = r11
            long r4 = r0.A03
            int[] r10 = r0.A0J
            java.lang.String r6 = r0.A0B
            int r3 = r0.A02
            int r7 = r0.A00
            if (r15 == 0) goto L_0x00d0
            java.io.File r9 = r15.A01
            boolean r16 = X.C18070vi.A18(r9, r1)
            if (r16 != 0) goto L_0x00d0
            long r4 = r15.A00
            r12 = 0
            r11 = r12
            r15 = 1
        L_0x004c:
            if (r18 != 0) goto L_0x005b
            if (r17 != 0) goto L_0x005b
            if (r2 == 0) goto L_0x005b
            X.9kN r1 = r2.A03
            java.lang.String r12 = r1.A00
            X.9kN r1 = r2.A02
            java.lang.String r11 = r1.A00
            r15 = 1
        L_0x005b:
            boolean r1 = r8 instanceof X.AnonymousClass2KN
            if (r1 == 0) goto L_0x006c
            r1 = r8
            X.2KN r1 = (X.AnonymousClass2KN) r1
            int[] r2 = r1.A05
            boolean r1 = java.util.Arrays.equals(r2, r10)
            if (r1 != 0) goto L_0x006c
            r10 = r2
            r15 = 1
        L_0x006c:
            boolean r1 = r8 instanceof X.AnonymousClass2KM
            if (r1 == 0) goto L_0x00ce
            X.2KM r8 = (X.AnonymousClass2KM) r8
            int r8 = r8.A00
            if (r8 == r7) goto L_0x00ce
            r15 = 1
        L_0x0077:
            boolean r1 = r14.equals(r6)
            if (r1 != 0) goto L_0x00cc
            r15 = 1
        L_0x007e:
            if (r13 != r3) goto L_0x0083
            r13 = r3
            if (r15 == 0) goto L_0x00cb
        L_0x0083:
            X.1So r1 = r0.A06
            r35 = r1
            X.2pa r1 = r0.A04
            r19 = r1
            int r1 = r0.A01
            r18 = r1
            boolean r1 = r0.A0F
            r17 = r1
            boolean r15 = r0.A0D
            boolean r7 = r0.A0E
            boolean r6 = r0.A0G
            java.util.List r3 = r0.A0C
            boolean r2 = r0.A0H
            java.lang.String r1 = r0.A08
            r16 = 0
            X.2h8 r0 = new X.2h8
            r20 = r11
            r21 = r14
            r22 = r1
            r23 = r3
            r24 = r10
            r25 = r18
            r26 = r8
            r27 = r13
            r28 = r4
            r30 = r17
            r31 = r15
            r32 = r7
            r33 = r6
            r34 = r2
            r14 = r0
            r15 = r19
            r17 = r35
            r18 = r9
            r19 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34)
        L_0x00cb:
            return r0
        L_0x00cc:
            r14 = r6
            goto L_0x007e
        L_0x00ce:
            r8 = r7
            goto L_0x0077
        L_0x00d0:
            r15 = 0
            r9 = r1
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34B.A01():X.2h8");
    }

    public final C58192kI A02() {
        File file;
        C58192kI r0 = this.A0P.A02;
        C54942ex r2 = (C54942ex) this.A0B.A00();
        String str = this.A04;
        if (r2 == null && str == null) {
            return r0;
        }
        String str2 = r0.A09;
        if (r2 == null || (file = r2.A01) == null) {
            file = r0.A08;
        }
        if (str == null) {
            str = r0.A0C;
        }
        String str3 = r0.A0A;
        String str4 = r0.A0B;
        C26551So r39 = r0.A06;
        int i = r0.A00;
        int i2 = r0.A01;
        long j = r0.A02;
        long j2 = r0.A03;
        C25811CmO cmO = r0.A04;
        boolean z = r0.A0G;
        boolean z2 = r0.A0F;
        boolean z3 = r0.A0L;
        boolean z4 = r0.A0D;
        AnonymousClass73B r10 = r0.A07;
        AnonymousClass6nF r9 = r0.A05;
        int i3 = i;
        int i4 = i2;
        return new C58192kI(cmO, r9, r39, r10, file, str2, str, str3, str4, i3, i4, j, j2, z, z2, z3, z4, false, r0.A0K, r0.A0H, r0.A0I, r0.A0E);
    }

    public final C55612g5 A03() {
        return (C55612g5) this.A0L.A00();
    }

    public final void A05() {
        this.A0C.A01();
        this.A0B.A01();
        this.A0A.A01();
        this.A0D.A01();
        this.A0G.A01();
        this.A0F.A01();
        this.A0H.A01();
        this.A0J.A01();
        this.A0K.A01();
        this.A0L.A01();
        this.A0I.A01();
        this.A09.A01();
        this.A0E.A01();
    }

    public final void A06(int i) {
        this.A0D.A04(Integer.valueOf(i));
    }

    public final void A07(AnonymousClass1TI r2, Executor executor) {
        this.A0D.A03(r2, executor);
    }

    public final boolean A09() {
        if ("express".equalsIgnoreCase(this.A0Z) || "express-optimistic".equalsIgnoreCase(this.A0Z)) {
            return true;
        }
        return false;
    }

    public final boolean A0A() {
        if (this.A0Z == null || C18070vi.A18(this.A0Z, "optimistic") || C18070vi.A18(this.A0Z, "express-optimistic")) {
            return true;
        }
        return false;
    }

    public String A04() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("mediajob/ ");
        A10.append(this.A0N.A0D);
        return AnonymousClass001.A1E(this, " / ", A10);
    }
}
