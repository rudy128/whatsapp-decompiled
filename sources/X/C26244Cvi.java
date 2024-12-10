package X;

import android.util.Pair;
import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.Cvi  reason: case insensitive filesystem */
public final class C26244Cvi {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C25237CbY A04;
    public C25237CbY A05;
    public C25237CbY A06;
    public Timeline A07;
    public Object A08;
    public boolean A09;
    public final C25197Cao A0A = new C25197Cao();
    public final C25746ClG A0B = new C25746ClG();

    public static CTA A01(CTA cta, C26244Cvi cvi, C25199Caq caq) {
        long j;
        CTA cta2 = cta;
        long j2 = cta.A03;
        long j3 = cta.A02;
        C26244Cvi cvi2 = cvi;
        Timeline timeline = cvi.A07;
        C25199Caq caq2 = caq;
        int i = caq2.A02;
        C25197Cao cao = cvi.A0A;
        timeline.A08(cao, i, false);
        boolean A052 = cvi2.A05(caq2);
        cvi2.A07.A08(cao, i, false);
        if (caq2.A00 != -1) {
            j = -9223372036854775807L;
        } else if (j3 == Long.MIN_VALUE) {
            j = cao.A01;
        } else {
            j = j3;
        }
        return new CTA(caq2, j2, j3, cta2.A00, j, true, A052);
    }

    public static CTA A02(C26244Cvi cvi, int i, long j, long j2) {
        long j3;
        long j4;
        C25199Caq caq = new C25199Caq(i, -1, j2, -1);
        Timeline timeline = cvi.A07;
        int i2 = caq.A02;
        C25197Cao cao = cvi.A0A;
        timeline.A08(cao, i2, false);
        long j5 = j;
        int A002 = cao.A00(j);
        if (A002 == -1) {
            j3 = Long.MIN_VALUE;
        } else {
            j3 = cao.A02.A00[A002];
        }
        cvi.A07.A08(cao, i2, false);
        boolean A052 = cvi.A05(caq);
        if (j3 == Long.MIN_VALUE) {
            j4 = cao.A01;
        } else {
            j4 = j3;
        }
        return new CTA(caq, j5, j3, -9223372036854775807L, j4, true, A052);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    public X.C25199Caq A07(int r14, long r15) {
        /*
            r13 = this;
            r7 = r13
            com.facebook.android.exoplayer2.Timeline r1 = r13.A07
            X.Cao r6 = r13.A0A
            r0 = 1
            r8 = r14
            X.Cao r0 = r1.A08(r6, r14, r0)
            java.lang.Object r3 = r0.A03
            int r5 = r6.A00
            java.lang.Object r1 = r13.A08
            r4 = -1
            if (r1 == 0) goto L_0x002f
            com.facebook.android.exoplayer2.Timeline r0 = r13.A07
            int r2 = r0.A04(r1)
            if (r2 == r4) goto L_0x002f
            com.facebook.android.exoplayer2.Timeline r1 = r13.A07
            r0 = 0
            X.Cao r0 = r1.A08(r6, r2, r0)
            int r0 = r0.A00
            if (r0 != r5) goto L_0x002f
            long r11 = r13.A03
        L_0x0029:
            r9 = r15
            X.Caq r0 = r7.A03(r8, r9, r11)
            return r0
        L_0x002f:
            X.CbY r1 = r13.A05
            if (r1 != 0) goto L_0x0062
            X.CbY r1 = r13.A04
        L_0x0035:
            if (r1 != 0) goto L_0x0062
            X.CbY r3 = r13.A05
            if (r3 != 0) goto L_0x0047
            X.CbY r3 = r13.A04
        L_0x003d:
            if (r3 != 0) goto L_0x0047
            long r11 = r13.A02
            r0 = 1
            long r0 = r0 + r11
            r13.A02 = r0
            goto L_0x0029
        L_0x0047:
            com.facebook.android.exoplayer2.Timeline r1 = r13.A07
            java.lang.Object r0 = r3.A09
            int r2 = r1.A04(r0)
            if (r2 == r4) goto L_0x005f
            com.facebook.android.exoplayer2.Timeline r1 = r13.A07
            r0 = 0
            X.Cao r0 = r1.A08(r6, r2, r0)
            int r0 = r0.A00
            if (r0 != r5) goto L_0x005f
            X.CTA r0 = r3.A02
            goto L_0x006c
        L_0x005f:
            X.CbY r3 = r3.A01
            goto L_0x003d
        L_0x0062:
            java.lang.Object r0 = r1.A09
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0071
            X.CTA r0 = r1.A02
        L_0x006c:
            X.Caq r0 = r0.A04
            long r11 = r0.A03
            goto L_0x0029
        L_0x0071:
            X.CbY r1 = r1.A01
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26244Cvi.A07(int, long):X.Caq");
    }

    public boolean A09(C25237CbY cbY) {
        boolean z = false;
        C26056CrS.A03(AnonymousClass000.A1W(cbY));
        this.A04 = cbY;
        while (cbY.A01 != null) {
            cbY = cbY.A01;
            if (cbY == this.A06) {
                this.A06 = this.A05;
                z = true;
            }
            cbY.A01();
            this.A00--;
        }
        this.A04.A01 = null;
        return z;
    }

    public static CTA A00(C25237CbY cbY, C26244Cvi cvi, long j) {
        C25237CbY cbY2 = cbY;
        CTA cta = cbY2.A02;
        C26244Cvi cvi2 = cvi;
        if (cta.A06) {
            Timeline timeline = cvi2.A07;
            int i = cta.A04.A02;
            C25197Cao cao = cvi2.A0A;
            C25746ClG clG = cvi2.A0B;
            int A032 = timeline.A03(cao, clG, i, cvi2.A01, cvi2.A09);
            if (A032 != -1) {
                int i2 = cvi2.A07.A08(cao, A032, true).A00;
                Object obj = cao.A03;
                long j2 = cta.A04.A03;
                long j3 = 0;
                if (cvi2.A07.A09(clG, i2, 0).A00 == A032) {
                    Pair A072 = cvi2.A07.A07(cao, clG, i2, -9223372036854775807L, Math.max(0, (cbY2.A00 + cta.A01) - j));
                    if (A072 != null) {
                        A032 = C108965cb.A01(A072);
                        j3 = C17880vN.A05(A072.second);
                        C25237CbY cbY3 = cbY2.A01;
                        if (cbY3 == null || !cbY3.A09.equals(obj)) {
                            j2 = cvi2.A02;
                            cvi2.A02 = 1 + j2;
                        } else {
                            j2 = cbY2.A01.A02.A04.A03;
                        }
                    }
                }
                C26244Cvi cvi3 = cvi2;
                C25199Caq A033 = cvi3.A03(A032, j3, j2);
                Timeline timeline2 = cvi2.A07;
                int i3 = A033.A02;
                timeline2.A08(cao, i3, false);
                return A02(cvi3, i3, j3, A033.A03);
            }
        } else {
            C25199Caq caq = cta.A04;
            Timeline timeline3 = cvi2.A07;
            int i4 = caq.A02;
            C25197Cao cao2 = cvi2.A0A;
            timeline3.A08(cao2, i4, false);
            if (caq.A00 == -1) {
                long j4 = cta.A02;
                if (j4 != Long.MIN_VALUE) {
                    long[] jArr = cao2.A02.A00;
                    int length = jArr.length;
                    while (true) {
                        length--;
                        if (length >= 0) {
                            long j5 = jArr[length];
                            if (j5 != Long.MIN_VALUE && j5 <= j4) {
                                throw AnonymousClass000.A0s("hasUnplayedAds");
                            }
                        } else {
                            return A02(cvi2, caq.A02, j4, caq.A03);
                        }
                    }
                }
            }
        }
        return null;
    }

    private C25199Caq A03(int i, long j, long j2) {
        Timeline timeline = this.A07;
        C25197Cao cao = this.A0A;
        int i2 = i;
        timeline.A08(cao, i, false);
        long[] jArr = cao.A02.A00;
        int length = jArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return new C25199Caq(i2, -1, j2, -1);
            }
            long j3 = jArr[length];
            if (j3 != Long.MIN_VALUE && j3 <= j) {
                throw AnonymousClass000.A0s("hasUnplayedAds");
            }
        }
    }

    public static boolean A04(C26244Cvi cvi) {
        C25237CbY cbY;
        C25237CbY cbY2 = cvi.A05;
        if (cbY2 == null) {
            cbY2 = cvi.A04;
        }
        if (cbY2 != null) {
            while (true) {
                int A032 = cvi.A07.A03(cvi.A0A, cvi.A0B, cbY2.A02.A04.A02, cvi.A01, cvi.A09);
                while (true) {
                    cbY = cbY2.A01;
                    if (cbY != null && !cbY2.A02.A06) {
                        cbY2 = cbY;
                    }
                }
                if (A032 == -1 || cbY == null || cbY.A02.A04.A02 != A032) {
                    boolean A092 = cvi.A09(cbY2);
                    CTA cta = cbY2.A02;
                    cbY2.A02 = A01(cta, cvi, cta.A04);
                } else {
                    cbY2 = cbY;
                }
            }
            boolean A0922 = cvi.A09(cbY2);
            CTA cta2 = cbY2.A02;
            cbY2.A02 = A01(cta2, cvi, cta2.A04);
            if (!A0922 || cvi.A05 == null) {
                return true;
            }
            return false;
        }
        return true;
    }

    private boolean A05(C25199Caq caq) {
        Timeline timeline = this.A07;
        int i = caq.A02;
        C25197Cao cao = this.A0A;
        int i2 = timeline.A08(cao, i, false).A00;
        Timeline timeline2 = this.A07;
        C25746ClG clG = this.A0B;
        if (timeline2.A09(clG, i2, 0).A09 || this.A07.A03(cao, clG, i, this.A01, this.A09) != -1) {
            return false;
        }
        return true;
    }

    public C25237CbY A06() {
        C25237CbY cbY = this.A05;
        if (cbY != null) {
            if (cbY == this.A06) {
                this.A06 = cbY.A01;
            }
            cbY.A01();
            C25237CbY cbY2 = this.A05.A01;
            this.A05 = cbY2;
            int i = this.A00 - 1;
            this.A00 = i;
            if (i == 0) {
                this.A04 = null;
            }
            return cbY2;
        }
        C25237CbY cbY3 = this.A04;
        this.A05 = cbY3;
        this.A06 = cbY3;
        return cbY3;
    }

    public void A08(boolean z) {
        Object obj;
        C25237CbY cbY = this.A05;
        if (cbY == null) {
            cbY = this.A04;
        }
        if (cbY != null) {
            if (z) {
                obj = cbY.A09;
            } else {
                obj = null;
            }
            this.A08 = obj;
            this.A03 = cbY.A02.A04.A03;
            cbY.A01();
            A09(cbY);
        } else if (!z) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }
}
