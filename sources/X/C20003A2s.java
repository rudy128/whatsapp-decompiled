package X;

import android.app.usage.UsageStatsManager;
import android.os.SystemClock;

/* renamed from: X.A2s  reason: case insensitive filesystem */
public final class C20003A2s {
    public int A00 = -1;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public C62652rk A07;
    public final C190019kF A08;
    public final AnonymousClass11C A09;
    public final AnonymousClass18K A0A;
    public final C30181dW A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final C18100vl A0E = AnonymousClass1DF.A01(new C22004Aw6(this));
    public final C18100vl A0F = AnonymousClass1DF.A01(new C22005Aw7(this));
    public final AnonymousClass11P A0G;
    public final C30151dT A0H;
    public final C30181dW A0I;

    public static final void A00(C20003A2s a2s, int i) {
        long j;
        C62652rk r0 = a2s.A07;
        if (r0 != null) {
            int i2 = 12;
            if (r0.A02 != 12) {
                C171668s5 r2 = new C171668s5();
                Integer num = null;
                switch (i) {
                    case 1:
                        i2 = 1;
                        break;
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 5;
                        break;
                    case 6:
                        i2 = 6;
                        break;
                    case 7:
                        i2 = 7;
                        break;
                    case 8:
                        i2 = 8;
                        break;
                    case 9:
                        i2 = 9;
                        break;
                    case 10:
                        i2 = 10;
                        break;
                    case 11:
                        i2 = 11;
                        break;
                    case 12:
                        break;
                    case 13:
                        i2 = 13;
                        break;
                    case 14:
                        i2 = 14;
                        break;
                    case 15:
                        i2 = 15;
                        break;
                    case 16:
                        i2 = 16;
                        break;
                    case 17:
                        i2 = 17;
                        break;
                    case 18:
                        i2 = 18;
                        break;
                    case 19:
                        i2 = 19;
                        break;
                }
                num = Integer.valueOf(i2);
                r2.A05 = num;
                C62652rk r1 = a2s.A07;
                if (r1 != null) {
                    r2.A09 = C17880vN.A0n(r1.A04);
                    r2.A03 = C63602tO.A01(r1.A02);
                    r2.A04 = Integer.valueOf(r1.A00());
                    r2.A02 = r1.A01();
                    Boolean bool = r1.A00;
                    r2.A01 = bool;
                    if (C72463Mc.A1Y(bool)) {
                        long j2 = a2s.A05;
                        if (j2 > 0) {
                            long j3 = a2s.A02;
                            if (j3 > 0) {
                                r2.A0D = C108945cZ.A1B(j2, j3);
                            }
                        }
                    }
                }
                if (AnonymousClass112.A05()) {
                    UsageStatsManager A082 = a2s.A09.A08();
                    if (A082 != null) {
                        j = (long) A082.getAppStandbyBucket();
                    } else {
                        j = -1;
                    }
                    r2.A06 = Long.valueOf(j);
                }
                r2.A00 = Boolean.valueOf(a2s.A08.A00());
                C30181dW r12 = a2s.A0B;
                long j4 = r12.A02;
                if (j4 != 0) {
                    long j5 = r12.A01;
                    if (j5 != 0) {
                        C194689s8 r6 = new C194689s8(j5 - j4, r12.A03, r12.A04);
                        r2.A0A = Long.valueOf(r6.A02);
                        r2.A08 = Long.valueOf(r6.A01);
                        r2.A07 = Long.valueOf(r6.A00);
                    }
                }
                r2.A0B = Long.valueOf(a2s.A03);
                r2.A0C = Long.valueOf(a2s.A04);
                r2.A0E = C17880vN.A0n(((C31251fG) a2s.A0C.get()).A01());
                a2s.A0A.CC7(r2);
                C30151dT r5 = a2s.A0H;
                Integer num2 = r2.A05;
                Long l = r2.A09;
                if (C30151dT.A04(r5)) {
                    ((C200710s) r5.A05.getValue()).execute(new AnonymousClass7R0(r5, l, num2, 42));
                }
            }
        }
        a2s.A01 = 0;
        a2s.A06 = 0;
        a2s.A02 = 0;
        a2s.A05 = 0;
        a2s.A00 = -1;
        a2s.A07 = null;
        a2s.A03 = 0;
        a2s.A04 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r1 != -1) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (r1 == 7) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(int r9) {
        /*
            r8 = this;
            X.1dW r6 = r8.A0I
            long r3 = r6.A01
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0022
            long r2 = android.os.SystemClock.uptimeMillis()
            r6.A01 = r2
            long r4 = r6.A02
            long r0 = r6.A00
            long r4 = java.lang.Math.max(r4, r0)
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x0089
            long r0 = r6.A04
            long r2 = r2 - r4
            long r0 = r0 + r2
            r6.A04 = r0
        L_0x0022:
            r0 = 1
            if (r9 == r0) goto L_0x0083
            r0 = 3
            r7 = -1
            if (r9 == r0) goto L_0x006d
            r0 = 4
            if (r9 != r0) goto L_0x0046
            long r5 = r8.A01
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0041
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r5
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0041
            r9 = 18
        L_0x0041:
            int r1 = r8.A00
            if (r1 == r7) goto L_0x0046
        L_0x0045:
            r9 = r1
        L_0x0046:
            r8.A00 = r9
            X.0vl r3 = r8.A0E
            java.lang.Object r2 = r3.getValue()
            android.os.Handler r2 = (android.os.Handler) r2
            X.0vl r1 = r8.A0F
            java.lang.Object r0 = r1.getValue()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r2.removeCallbacks(r0)
            java.lang.Object r3 = r3.getValue()
            android.os.Handler r3 = (android.os.Handler) r3
            java.lang.Object r2 = r1.getValue()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x006d:
            long r1 = r8.A06
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0041
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r1
            r1 = 12000(0x2ee0, double:5.929E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0041
            r9 = 19
            goto L_0x0041
        L_0x0083:
            int r1 = r8.A00
            r0 = 7
            if (r1 != r0) goto L_0x0046
            goto L_0x0045
        L_0x0089:
            long r0 = r6.A03
            long r2 = r2 - r4
            long r0 = r0 + r2
            r6.A03 = r0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20003A2s.A04(int):void");
    }

    public C20003A2s(C190019kF r2, AnonymousClass11C r3, AnonymousClass11P r4, AnonymousClass18K r5, C30151dT r6, C30181dW r7, C30181dW r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r4, r5, r3, r7, r8);
        C18070vi.A0q(r2, r9, r10);
        C18070vi.A0d(r6, 9);
        this.A0G = r4;
        this.A0A = r5;
        this.A09 = r3;
        this.A0B = r7;
        this.A0I = r8;
        this.A08 = r2;
        this.A0D = r9;
        this.A0C = r10;
        this.A0H = r6;
    }

    public final void A01() {
        this.A02 = SystemClock.uptimeMillis();
    }

    public final void A02() {
        this.A06 = SystemClock.uptimeMillis();
    }

    public final void A03() {
        this.A05 = SystemClock.uptimeMillis();
    }

    public final void A05(C62652rk r1) {
        this.A07 = r1;
    }
}
