package X;

/* renamed from: X.0Wb  reason: invalid class name and case insensitive filesystem */
public final class C05880Wb implements C17770vC, C17480uj {
    public C17640uz A00;
    public final C05870Wa A01 = new C05870Wa();

    public static final void A00(C16960tV r6, C17640uz r7) {
        C01850Ad A04 = AnonymousClass0QV.A04(r7, 4);
        long A012 = C25293Ccv.A01(A04.A03);
        A04.A0t().A0J().A02(r6, r7, A04, A012);
    }

    public final void A01(AnonymousClass0XW r12, C16960tV r13, C01850Ad r14, long j) {
        AnonymousClass0XW r7 = r12;
        C06970a9 r4 = null;
        while (r7 != null) {
            if (r7 instanceof C17640uz) {
                A02(r13, (C17640uz) r7, r14, j);
            } else if ((r7.A01 & 4) != 0 && (r7 instanceof C014308l)) {
                int i = 0;
                for (AnonymousClass0XW r3 = ((C014308l) r7).A00; r3 != null; r3 = r3.A02) {
                    if ((r3.A01 & 4) != 0) {
                        i++;
                        if (i == 1) {
                            r7 = r3;
                        } else {
                            r4 = AnonymousClass001.A0z(r4);
                            r7 = AnonymousClass000.A0d(r4, r7);
                            r4.A0F(r3);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            r7 = AnonymousClass0QV.A00(r4);
        }
    }

    public void BJO(C02000Cg r11, float f, float f2, long j, long j2, long j3) {
        this.A01.BJO(r11, f, f2, j, j2, j3);
    }

    public void BJQ(C02000Cg r10, float f, float f2, int i, long j, long j2) {
        this.A01.BJQ(r10, f, f2, i, j, j2);
    }

    public void BJU(AnonymousClass0HD r16, C16980tX r17, C02000Cg r18, float f, int i, int i2, long j, long j2, long j3, long j4) {
        this.A01.BJU(r16, r17, r18, f, i, i2, j, j2, j3, j4);
    }

    public void BJW(AnonymousClass0HD r7, C16980tX r8, C02000Cg r9, long j) {
        this.A01.BJW(r7, r8, r9, j);
    }

    public void BJb(C03380Hv r9, float f, float f2, long j, long j2) {
        this.A01.BJb(r9, f, f2, j, j2);
    }

    public void BJe(C03380Hv r7, C17040te r8, C02000Cg r9, float f, int i) {
        this.A01.BJe(r7, r8, r9, f, i);
    }

    public void BJf(C17040te r2, C02000Cg r3, long j) {
        this.A01.BJf(r2, r3, j);
    }

    public void BJh(C03380Hv r8, C02000Cg r9, long j, long j2) {
        this.A01.BJh(r8, r9, j, j2);
    }

    public void BJi(C02000Cg r11, float f, int i, long j, long j2, long j3) {
        this.A01.BJi(r11, f, i, j, j2, j3);
    }

    public void BJk(C03380Hv r10, C02000Cg r11, long j, long j2, long j3) {
        this.A01.BJk(r10, r11, j, j2, j3);
    }

    public void BJl(C02000Cg r11, long j, long j2, long j3, long j4) {
        this.A01.BJl(r11, j, j2, j3, j4);
    }

    public long BOQ() {
        return this.A01.BOQ();
    }

    public float BQU() {
        return this.A01.BQU();
    }

    public AnonymousClass0t6 BQs() {
        return this.A01.BQs();
    }

    public float BRu() {
        return this.A01.BRu();
    }

    public long BZL() {
        return this.A01.BZL();
    }

    public int CG9(float f) {
        return this.A01.CG9(f);
    }

    public float CPE(long j) {
        return this.A01.CPE(j);
    }

    public float CPF(float f) {
        return this.A01.CPF(f);
    }

    public float CPG(int i) {
        return this.A01.CPG(i);
    }

    public long CPH(long j) {
        return this.A01.CPH(j);
    }

    public float CPP(long j) {
        return this.A01.CPP(j);
    }

    public float CPQ(float f) {
        return this.A01.CPQ(f);
    }

    public long CPT(long j) {
        return this.A01.CPT(j);
    }

    public long CPU(float f) {
        return this.A01.CPU(f);
    }

    public long CPV(float f) {
        return this.A01.CPV(f);
    }

    public C24246By4 getLayoutDirection() {
        return this.A01.getLayoutDirection();
    }

    public /* synthetic */ C05880Wb(C05870Wa r2, AnonymousClass1Y1 r3, int i) {
    }

    public final void A02(C16960tV r9, C17640uz r10, C01850Ad r11, long j) {
        C17640uz r7 = this.A00;
        this.A00 = r10;
        C05870Wa r0 = this.A01;
        C24246By4 layoutDirection = r11.getLayoutDirection();
        C04710Ol A04 = r0.A04();
        C28644ECa A002 = A04.A00();
        C24246By4 A02 = A04.A02();
        C16960tV r2 = A04.A01;
        long j2 = A04.A00;
        A04.A04(r11);
        A04.A05(layoutDirection);
        A04.A01 = r9;
        A04.A00 = j;
        r9.CGe();
        r10.BJM(this);
        r9.CFz();
        A04.A04(A002);
        A04.A05(A02);
        A04.A01 = r2;
        A04.A00 = j2;
        this.A00 = r7;
    }

    public void BJR() {
        C16960tV BOJ = this.A01.BQs().BOJ();
        C17640uz r1 = this.A00;
        C18070vi.A0b(r1);
        AnonymousClass0XW r3 = (AnonymousClass0XW) r1;
        AnonymousClass0XW r5 = r3.A03.A02;
        if (r5 != null && (r5.A00 & 4) != 0) {
            while ((r5.A01 & 2) == 0) {
                if ((r5.A01 & 4) == 0) {
                    r5 = r5.A02;
                    if (r5 == null) {
                        break;
                    }
                } else {
                    C06970a9 r4 = null;
                    do {
                        if (r5 instanceof C17640uz) {
                            A00(BOJ, (C17640uz) r5);
                        } else if ((r5.A01 & 4) != 0 && (r5 instanceof C014308l)) {
                            int i = 0;
                            for (AnonymousClass0XW r32 = ((C014308l) r5).A00; r32 != null; r32 = r32.A02) {
                                if ((r32.A01 & 4) != 0) {
                                    i++;
                                    if (i == 1) {
                                        r5 = r32;
                                    } else {
                                        r4 = AnonymousClass001.A0z(r4);
                                        r5 = AnonymousClass000.A0d(r4, r5);
                                        r4.A0F(r32);
                                    }
                                }
                            }
                            if (i == 1) {
                                continue;
                            }
                        }
                        r5 = AnonymousClass0QV.A00(r4);
                        continue;
                    } while (r5 != null);
                    return;
                }
            }
        }
        C01850Ad A04 = AnonymousClass0QV.A04(r1, 4);
        if (A04.A0r() == r3.A03) {
            A04 = A04.A0w();
            C18070vi.A0b(A04);
        }
        A04.A1B(BOJ);
    }

    public C05880Wb() {
    }
}
