package X;

import android.content.SharedPreferences;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.1Sj  reason: invalid class name and case insensitive filesystem */
public final class C26501Sj {
    public final C218617r A00;
    public final AnonymousClass18O A01;
    public final AnonymousClass11E A02;
    public final C18030ve A03;
    public final C26421Sb A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final C24521Kq A0B;
    public final C19830z4 A0C;
    public final AnonymousClass1CJ A0D;
    public final C26491Si A0E;

    public C26501Sj(C218617r r17, AnonymousClass18O r18, AnonymousClass11E r19, C24521Kq r20, C19830z4 r21, AnonymousClass1CJ r22, C18030ve r23, C26421Sb r24, C26491Si r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31) {
        C18030ve r9 = r23;
        C18070vi.A0d(r9, 1);
        AnonymousClass1CJ r10 = r22;
        C18070vi.A0d(r10, 2);
        C218617r r15 = r17;
        C18070vi.A0d(r15, 3);
        AnonymousClass18O r14 = r18;
        C18070vi.A0d(r14, 4);
        AnonymousClass00H r6 = r26;
        C18070vi.A0d(r6, 5);
        AnonymousClass00H r5 = r27;
        C18070vi.A0d(r5, 6);
        C26421Sb r8 = r24;
        C18070vi.A0d(r8, 7);
        C26491Si r7 = r25;
        C18070vi.A0d(r7, 8);
        C19830z4 r11 = r21;
        C18070vi.A0d(r11, 9);
        C24521Kq r12 = r20;
        C18070vi.A0d(r12, 10);
        AnonymousClass00H r4 = r28;
        C18070vi.A0d(r4, 11);
        AnonymousClass11E r13 = r19;
        C18070vi.A0d(r13, 12);
        AnonymousClass00H r3 = r29;
        C18070vi.A0d(r3, 13);
        AnonymousClass00H r2 = r30;
        C18070vi.A0d(r2, 14);
        AnonymousClass00H r1 = r31;
        C18070vi.A0d(r1, 15);
        this.A03 = r9;
        this.A0D = r10;
        this.A00 = r15;
        this.A01 = r14;
        this.A0A = r6;
        this.A05 = r5;
        this.A04 = r8;
        this.A0E = r7;
        this.A0C = r11;
        this.A0B = r12;
        this.A07 = r4;
        this.A02 = r13;
        this.A06 = r3;
        this.A09 = r2;
        this.A08 = r1;
    }

    private final boolean A00(AnonymousClass1BI r10) {
        if (r10 == null) {
            return false;
        }
        AnonymousClass1CJ r2 = this.A0D;
        if (r2.A03(r10) < 5) {
            return false;
        }
        long j = ((SharedPreferences) this.A0C.A00.get()).getLong("last_read_conversation_time", 0);
        long A092 = r2.A09(r10);
        return A092 != 0 && A092 + 86400000 < j;
    }

    public final boolean A02(AnonymousClass1BI r7, C26551So r8, int i, int i2, long j, boolean z) {
        C18070vi.A0d(r8, 1);
        if (!C63972u0.A07(r8)) {
            if (C200410p.A0U(r8, new C26551So[]{C26551So.A0E, C26551So.A0K, C26551So.A0t})) {
                if (i2 <= 0 || j >= ((long) i2) || i2 > 35000 || i == 3 || A00(r7)) {
                    return false;
                }
                return true;
            } else if ((r8 == C26551So.A0q || r8 == C26551So.A0i || r8 == C26551So.A0d) && z && j < 262144 && (((C25125CYy) this.A08.get()).A00() & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (i2 >= 0) {
            long j2 = (long) i2;
            if (j < j2 && !A00(r7)) {
                if (i == 3) {
                    if ((((C25125CYy) this.A08.get()).A00() & 1) != 0) {
                        return true;
                    }
                    return false;
                } else if (j2 < 102400) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public final boolean A03(C26551So r16, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AnonymousClass18Q r0;
        C26551So r4 = r16;
        C18070vi.A0d(r4, 0);
        int A032 = this.A02.A03(z);
        long j2 = j;
        if (!C63972u0.A07(r4) || j <= 1048576) {
            if (((AnonymousClass11Z) this.A0A.get()).A01() >= (((long) C18020vd.A00(C18040vf.A02, this.A03, 1291)) * SearchActionVerificationClientService.MS_TO_NS) + j) {
                AnonymousClass18O r1 = this.A01;
                if (A032 == 1) {
                    r0 = AnonymousClass18O.A18;
                } else {
                    r0 = AnonymousClass18O.A17;
                }
                if (j <= ((long) r1.A04(r0)) * SearchActionVerificationClientService.MS_TO_NS) {
                    if (z3 && z4) {
                        if (C200410p.A0U(Integer.valueOf(A032), new Integer[]{1, 2})) {
                            return true;
                        }
                    }
                    return ((C25125CYy) this.A08.get()).A01(r4.A00, i, j2, z2, z5);
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (((X.C441322g) r11).A1I() == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(X.AnonymousClass21V r11) {
        /*
            r10 = this;
            r5 = 0
            boolean r1 = r11 instanceof X.C441322g
            if (r1 == 0) goto L_0x000c
            r0 = r11
            X.22g r0 = (X.C441322g) r0
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0014
        L_0x000c:
            X.2rc r0 = r11.A02
            if (r0 == 0) goto L_0x0043
            int r0 = r0.A04
            if (r0 <= 0) goto L_0x0043
        L_0x0014:
            r6 = 1
        L_0x0015:
            if (r1 == 0) goto L_0x0021
            r0 = r11
            X.22g r0 = (X.C441322g) r0
            boolean r0 = r0.A1I()
            r9 = 1
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r9 = 0
        L_0x0022:
            X.1So r1 = X.C63972u0.A02(r11)
            X.C18070vi.A0X(r1)
            long r3 = r11.A01
            int r2 = r11.A09
            X.205 r0 = r11.A0v
            X.1BI r0 = r0.A00
            boolean r7 = X.C22971Dz.A0a(r0)
            X.1BI r0 = r11.A0H()
            boolean r8 = X.C22971Dz.A0Z(r0)
            r0 = r10
            boolean r0 = r0.A03(r1, r2, r3, r5, r6, r7, r8, r9)
            return r0
        L_0x0043:
            r6 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26501Sj.A04(X.21V):boolean");
    }

    public final boolean A01() {
        if (C18020vd.A05(C18040vf.A02, this.A03, 1838) || this.A0E.A00()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        if (X.AnonymousClass72Z.A01(r12.A03, r13) != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r9 > 0) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(X.AnonymousClass21V r13, int r14) {
        /*
            r12 = this;
            X.2rc r3 = r13.A02
            r0 = 0
            if (r3 != 0) goto L_0x0006
            return r0
        L_0x0006:
            r4 = r12
            X.1Sb r0 = r12.A04
            java.lang.String r2 = r3.A0L
            if (r2 == 0) goto L_0x0032
            X.1SS r1 = r0.A0I
            r0 = 1
            X.2h4 r0 = r1.A03(r2, r0)
            if (r0 == 0) goto L_0x0032
            r1 = 0
            long r9 = r0.A0A
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0032
        L_0x001e:
            boolean r0 = r13 instanceof X.C438421d
            r1 = 1
            if (r0 == 0) goto L_0x004c
            X.00H r0 = r12.A07
            java.lang.Object r0 = r0.get()
            X.2mt r0 = (X.C59792mt) r0
            boolean r0 = r0.A02(r13)
            if (r0 == 0) goto L_0x004c
            return r1
        L_0x0032:
            boolean r0 = r13.A0w()
            if (r0 == 0) goto L_0x0049
            X.17r r2 = r12.A00
            X.0ve r1 = r12.A03
            X.00H r0 = r12.A0A
            java.lang.Object r0 = r0.get()
            X.11Z r0 = (X.AnonymousClass11Z) r0
            long r9 = X.AnonymousClass74L.A02(r2, r0, r1, r13)
            goto L_0x001e
        L_0x0049:
            r9 = 0
            goto L_0x001e
        L_0x004c:
            boolean r0 = r13.A0w()
            if (r0 == 0) goto L_0x0075
            r8 = 262144(0x40000, float:3.67342E-40)
        L_0x0054:
            X.1So r6 = X.C63972u0.A02(r13)
            X.C18070vi.A0X(r6)
            boolean r0 = X.C63652tT.A04(r13)
            if (r0 != 0) goto L_0x006a
            X.0ve r0 = r12.A03
            boolean r0 = X.AnonymousClass72Z.A01(r0, r13)
            r11 = 0
            if (r0 == 0) goto L_0x006b
        L_0x006a:
            r11 = 1
        L_0x006b:
            X.205 r0 = r13.A0v
            X.1BI r5 = r0.A00
            r7 = r14
            boolean r1 = r4.A02(r5, r6, r7, r8, r9, r11)
            return r1
        L_0x0075:
            int r8 = r3.A04
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26501Sj.A05(X.21V, int):boolean");
    }
}
