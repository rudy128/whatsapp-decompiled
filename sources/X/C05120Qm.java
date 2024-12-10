package X;

import android.content.ClipDescription;
import android.view.ActionMode;

/* renamed from: X.0Qm  reason: invalid class name and case insensitive filesystem */
public final class C05120Qm {
    public int A00;
    public long A01;
    public long A02;
    public C04940Pp A03;
    public C04310Mr A04;
    public C15800rE A05;
    public C16740sw A06;
    public C16510sN A07;
    public Integer A08;
    public C16260ry A09;
    public EBT A0A;
    public C26224CvE A0B;
    public EBO A0C;
    public C22821Di A0D;
    public final C16850tK A0E;
    public final C16630sk A0F;
    public final C17330uU A0G;
    public final C17330uU A0H;
    public final C17330uU A0I;
    public final C17330uU A0J;
    public final AnonymousClass0NN A0K;

    public static final float A00(C26227CvJ cvJ, int i, boolean z, boolean z2) {
        int i2;
        boolean z3 = false;
        if (!z ? !z2 : z2) {
            i2 = Math.max(i - 1, 0);
        } else {
            i2 = i;
        }
        if (cvJ.A0P(i2) == cvJ.A0Q(i)) {
            z3 = true;
        }
        return cvJ.A0A(i, z3);
    }

    public static void A08(C05120Qm r2) {
        r2.A0H.setValue((Object) null);
        r2.A0G.setValue((Object) null);
    }

    private final AnonymousClass0NU A04() {
        long j;
        long j2;
        float f;
        C16910tQ A052;
        float f2;
        C26227CvJ A032;
        C16910tQ A053;
        float f3;
        C26227CvJ A033;
        C16910tQ A054;
        C16910tQ A055;
        C04940Pp r6 = this.A03;
        if (r6 == null || !(!r6.A02)) {
            return AnonymousClass0NU.A04;
        }
        int CB1 = this.A0A.CB1(AnonymousClass000.A0G(A0E().A01()));
        int CB12 = this.A0A.CB1(AnonymousClass000.A0H(A0E().A01()));
        C04940Pp r0 = this.A03;
        if (r0 == null || (A055 = r0.A05()) == null) {
            j = AnonymousClass0QY.A03;
        } else {
            j = A055.Bhu(A0B(true));
        }
        C04940Pp r02 = this.A03;
        if (r02 == null || (A054 = r02.A05()) == null) {
            j2 = AnonymousClass0QY.A03;
        } else {
            j2 = A054.Bhu(A0B(false));
        }
        C04940Pp r03 = this.A03;
        float f4 = 0.0f;
        if (r03 == null || (A053 = r03.A05()) == null) {
            f = 0.0f;
        } else {
            AnonymousClass0NM A022 = C04940Pp.A02(r6);
            if (A022 == null || (A033 = A022.A03()) == null) {
                f3 = 0.0f;
            } else {
                f3 = A033.A0K(CB1).A03;
            }
            long A0p = AnonymousClass001.A0p(0.0f, f3);
            long j3 = AnonymousClass0QY.A03;
            f = AnonymousClass0QY.A02(A053.Bhu(A0p));
        }
        C04940Pp r04 = this.A03;
        if (!(r04 == null || (A052 = r04.A05()) == null)) {
            AnonymousClass0NM A023 = C04940Pp.A02(r6);
            if (A023 == null || (A032 = A023.A03()) == null) {
                f2 = 0.0f;
            } else {
                f2 = A032.A0K(CB12).A03;
            }
            long A0p2 = AnonymousClass001.A0p(0.0f, f2);
            long j4 = AnonymousClass0QY.A03;
            f4 = AnonymousClass0QY.A02(A052.Bhu(A0p2));
        }
        return new AnonymousClass0NU(Math.min(AnonymousClass0QY.A01(j), AnonymousClass0QY.A01(j2)), Math.min(f, f4), Math.max(AnonymousClass0QY.A01(j), AnonymousClass0QY.A01(j2)), Math.max(AnonymousClass0QY.A02(j), AnonymousClass0QY.A02(j2)) + (25.0f * r6.A00.A08().BQU()));
    }

    public static final C26224CvE A05(C27069DRu dRu, long j) {
        return new C26224CvE(dRu, j);
    }

    public static final void A07(AnonymousClass0CN r2, C05120Qm r3) {
        C04940Pp r1 = r3.A03;
        if (r1 != null && r1.A07.getValue() != r2) {
            r1.A07.setValue(r2);
        }
    }

    public static final void A09(C05120Qm r1, boolean z) {
        C04940Pp r0 = r1.A03;
        if (r0 != null) {
            AnonymousClass000.A1C(r0.A0C, z);
        }
        if (z) {
            r1.A0K();
        } else {
            r1.A0H();
        }
    }

    public final long A0A(C28644ECa eCa) {
        AnonymousClass0NM r0;
        int CB1 = this.A0A.CB1(AnonymousClass000.A0G(A0E().A01()));
        C04940Pp r02 = this.A03;
        if (r02 != null) {
            r0 = C04940Pp.A02(r02);
        } else {
            r0 = null;
        }
        C18070vi.A0b(r0);
        C26227CvJ A032 = r0.A03();
        AnonymousClass0NU A0K2 = A032.A0K(C28851b7.A03(CB1, 0, A032.A0N().A03().length()));
        float f = A0K2.A01;
        C16000rY r03 = C03990Lk.A00;
        long A0p = AnonymousClass001.A0p(f + (eCa.CPQ(2.0f) / 2.0f), A0K2.A00);
        long j = AnonymousClass0QY.A03;
        return A0p;
    }

    public final long A0B(boolean z) {
        AnonymousClass0NM A022;
        C26227CvJ A032;
        C27069DRu A0C2;
        long j;
        C04940Pp r0 = this.A03;
        if (!(r0 == null || (A022 = C04940Pp.A02(r0)) == null || (A032 = A022.A03()) == null || (A0C2 = A0C()) == null)) {
            if (C18070vi.A18(A0C2.A02(), A032.A0N().A03().A02())) {
                long A012 = A0E().A01();
                if (z) {
                    j = A012 >> 32;
                } else {
                    j = A012 & 4294967295L;
                }
                return A03(A032, this.A0A.CB1((int) j), z, C26260Cw5.A05(A0E().A01()));
            }
        }
        return AnonymousClass0QY.A02;
    }

    public final C27069DRu A0C() {
        C04940Pp r0 = this.A03;
        if (r0 != null) {
            return r0.A00.A04();
        }
        return null;
    }

    public final C26224CvE A0E() {
        return (C26224CvE) this.A0J.getValue();
    }

    public final void A0H() {
        Integer num;
        C16510sN r2 = this.A07;
        if (r2 != null) {
            num = ((AnonymousClass0Xk) r2).A01;
        } else {
            num = null;
        }
        if (num == AnonymousClass00R.A00 && r2 != null) {
            AnonymousClass0Xk r22 = (AnonymousClass0Xk) r2;
            r22.A01 = AnonymousClass00R.A01;
            ActionMode actionMode = r22.A00;
            if (actionMode != null) {
                actionMode.finish();
            }
            r22.A00 = null;
        }
    }

    public final void A0I() {
        C27069DRu BaF;
        C16740sw r0 = this.A06;
        if (r0 != null && (BaF = r0.BaF()) != null) {
            C27069DRu A012 = C25860CnO.A02(A0E(), A0E().A04().length()).A01(BaF).A01(C25860CnO.A01(A0E(), A0E().A04().length()));
            int A022 = C26260Cw5.A02(A0E().A01()) + BaF.length();
            this.A0D.invoke(A05(A012, C25858CnM.A01(A022, A022)));
            A07(AnonymousClass0CN.None, this);
            AnonymousClass0NN r1 = this.A0K;
            if (r1 != null) {
                r1.A01 = true;
            }
        }
    }

    public final void A0K() {
        C08090eX r2;
        C08100eY r4;
        C08110eZ r3;
        C16740sw r0;
        ClipDescription primaryClipDescription;
        C04940Pp r02 = this.A03;
        if (r02 == null || AnonymousClass001.A1b(r02.A09)) {
            C08120ea r5 = null;
            if (!C26260Cw5.A04(A0E().A01())) {
                r2 = new C08090eX(this);
            } else {
                r2 = null;
            }
            if (C26260Cw5.A04(A0E().A01()) || !AnonymousClass001.A1b(this.A0I)) {
                r4 = null;
            } else {
                r4 = new C08100eY(this);
            }
            if (!AnonymousClass001.A1b(this.A0I) || (r0 = this.A06) == null || (primaryClipDescription = ((C06180Xg) r0).A00.getPrimaryClipDescription()) == null || !primaryClipDescription.hasMimeType("text/*")) {
                r3 = null;
            } else {
                r3 = new C08110eZ(this);
            }
            if (C26260Cw5.A00(A0E().A01()) != A0E().A04().length()) {
                r5 = new C08120ea(this);
            }
            C16510sN r03 = this.A07;
            if (r03 != null) {
                r03.CMw(A04(), r2, r3, r4, r5);
            }
        }
    }

    public final void A0Q(boolean z) {
        C04310Mr r0;
        C04940Pp r02 = this.A03;
        if (!(r02 == null || AnonymousClass001.A1b(r02.A08) || (r0 = this.A04) == null)) {
            r0.A00();
        }
        this.A0B = A0E();
        A09(this, z);
        A07(AnonymousClass0CN.Selection, this);
    }

    public final boolean A0R() {
        return !C18070vi.A18(this.A0B.A04(), A0E().A04());
    }

    public C05120Qm(AnonymousClass0NN r8) {
        this.A0K = r8;
        this.A0A = C04560Nw.A00();
        this.A0D = AnonymousClass0l0.A00;
        this.A0J = AnonymousClass0Q9.A02(new C26224CvE((String) null, 7, 0));
        this.A0C = C25919Cod.A00();
        this.A0I = AnonymousClass0Q9.A04(true);
        long j = AnonymousClass0QY.A03;
        this.A01 = j;
        this.A02 = j;
        this.A0H = AnonymousClass0Q9.A01((Object) null);
        this.A0G = AnonymousClass0Q9.A01((Object) null);
        this.A00 = -1;
        this.A0B = new C26224CvE((String) null, 7, 0);
        this.A0E = new AnonymousClass0VH(this, 1);
        this.A0F = new AnonymousClass0VK(this);
    }

    public static final long A03(C26227CvJ cvJ, int i, boolean z, boolean z2) {
        int A0E2 = cvJ.A0E(i);
        if (A0E2 >= cvJ.A0B()) {
            return AnonymousClass0QY.A02;
        }
        long A0p = AnonymousClass001.A0p(A00(cvJ, i, z, z2), cvJ.A06(A0E2));
        long j = AnonymousClass0QY.A03;
        return A0p;
    }

    public final EBT A0D() {
        return this.A0A;
    }

    public final C22821Di A0F() {
        return this.A0D;
    }

    public final void A0G() {
        if (!C26260Cw5.A04(A0E().A01())) {
            C16740sw r1 = this.A06;
            if (r1 != null) {
                r1.CL4(C25860CnO.A00(A0E()));
            }
            C27069DRu A012 = C25860CnO.A02(A0E(), A0E().A04().length()).A01(C25860CnO.A01(A0E(), A0E().A04().length()));
            int A022 = C26260Cw5.A02(A0E().A01());
            this.A0D.invoke(A05(A012, C25858CnM.A01(A022, A022)));
            A07(AnonymousClass0CN.None, this);
            AnonymousClass0NN r12 = this.A0K;
            if (r12 != null) {
                r12.A01 = true;
            }
        }
    }

    public final void A0J() {
        C26224CvE A052 = A05(A0E().A02(), C25858CnM.A01(0, A0E().A04().length()));
        this.A0D.invoke(A052);
        this.A0B = C26224CvE.A00((C27069DRu) null, this.A0B, 5, A052.A01());
        A0Q(true);
    }

    public final void A0L(AnonymousClass0QY r6) {
        AnonymousClass0CN r0;
        AnonymousClass0NM r4;
        int A012;
        if (!C26260Cw5.A04(A0E().A01())) {
            C04940Pp r02 = this.A03;
            if (r02 != null) {
                r4 = C04940Pp.A02(r02);
            } else {
                r4 = null;
            }
            if (r6 == null || r4 == null) {
                A012 = C26260Cw5.A01(A0E().A01());
            } else {
                A012 = this.A0A.CPo(r4.A01(true, r6.A00));
            }
            this.A0D.invoke(C26224CvE.A00((C27069DRu) null, A0E(), 5, C25858CnM.A00(A012)));
        }
        if (r6 == null || A0E().A04().length() <= 0) {
            r0 = AnonymousClass0CN.None;
        } else {
            r0 = AnonymousClass0CN.Cursor;
        }
        A07(r0, this);
        A09(this, false);
    }

    public final void A0P(boolean z) {
        if (!C26260Cw5.A04(A0E().A01())) {
            C16740sw r1 = this.A06;
            if (r1 != null) {
                r1.CL4(C25860CnO.A00(A0E()));
            }
            if (z) {
                int A012 = C26260Cw5.A01(A0E().A01());
                this.A0D.invoke(A05(A0E().A02(), C25858CnM.A01(A012, A012)));
                A07(AnonymousClass0CN.None, this);
            }
        }
    }

    public final void A0M(EBT ebt) {
        this.A0A = ebt;
    }

    public final void A0N(EBO ebo) {
        this.A0C = ebo;
    }

    public final void A0O(C22821Di r1) {
        this.A0D = r1;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        if (r6.A00 == r4.A00) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b2, code lost:
        if (X.C25858CnM.A01(X.AnonymousClass000.A0H(r3), X.AnonymousClass000.A0G(r3)) != r9) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c0, code lost:
        if (X.C26260Cw5.A04(r9) == false) goto L_0x00c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A02(X.C17020tb r20, X.C26224CvE r21, long r22, boolean r24, boolean r25, boolean r26) {
        /*
            r19 = this;
            r5 = r19
            X.0Pp r0 = r5.A03
            if (r0 == 0) goto L_0x0130
            X.0NM r6 = X.C04940Pp.A02(r0)
            if (r6 == 0) goto L_0x0130
            X.EBT r11 = r5.A0A
            long r9 = r21.A01()
            r4 = 32
            long r1 = r9 >> r4
            int r0 = (int) r1
            int r3 = r11.CB1(r0)
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r9 & r7
            int r0 = (int) r1
            int r0 = r11.CB1(r0)
            long r15 = X.C25858CnM.A01(r3, r0)
            r2 = 0
            r0 = r22
            int r3 = r6.A01(r2, r0)
            r17 = r24
            r18 = r25
            if (r25 != 0) goto L_0x0125
            if (r24 != 0) goto L_0x0125
            long r0 = r15 >> r4
            int r12 = (int) r0
        L_0x003d:
            r13 = r3
        L_0x003e:
            X.0ry r4 = r5.A09
            r14 = -1
            if (r24 != 0) goto L_0x004a
            if (r4 == 0) goto L_0x004a
            int r0 = r5.A00
            if (r0 == r14) goto L_0x004a
            r14 = r0
        L_0x004a:
            X.CvJ r11 = r6.A03()
            X.0VO r7 = X.C04760Or.A00(r11, r12, r13, r14, r15, r17, r18)
            X.0Jq r0 = r7.A01
            if (r0 == 0) goto L_0x0074
            if (r4 == 0) goto L_0x0074
            boolean r0 = r4 instanceof X.AnonymousClass0VO
            if (r0 == 0) goto L_0x0074
            boolean r1 = r7.A02
            X.0VO r4 = (X.AnonymousClass0VO) r4
            boolean r0 = r4.A02
            if (r1 != r0) goto L_0x0074
            X.0Oc r6 = r7.A00
            X.0Oc r4 = r4.A00
            int r1 = r6.A02
            int r0 = r4.A02
            if (r1 != r0) goto L_0x0074
            int r1 = r6.A00
            int r0 = r4.A00
            if (r1 == r0) goto L_0x012f
        L_0x0074:
            r5.A09 = r7
            r5.A00 = r3
            r0 = r20
            X.0Jq r4 = r0.BBt(r7)
            X.EBT r3 = r5.A0A
            X.0OV r0 = r4.A01
            int r0 = r0.A00
            int r1 = r3.CPo(r0)
            X.0OV r0 = r4.A00
            int r0 = r0.A00
            int r0 = r3.CPo(r0)
            long r3 = X.C25858CnM.A01(r1, r0)
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x012f
            boolean r1 = X.C26260Cw5.A05(r3)
            boolean r0 = X.C26260Cw5.A05(r9)
            r6 = 1
            if (r1 == r0) goto L_0x00b4
            int r1 = X.AnonymousClass000.A0H(r3)
            int r0 = X.AnonymousClass000.A0G(r3)
            long r7 = X.C25858CnM.A01(r1, r0)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r8 = 1
            if (r0 == 0) goto L_0x00b5
        L_0x00b4:
            r8 = 0
        L_0x00b5:
            boolean r0 = X.C26260Cw5.A04(r3)
            if (r0 == 0) goto L_0x00c2
            boolean r0 = X.C26260Cw5.A04(r9)
            r1 = 1
            if (r0 != 0) goto L_0x00c3
        L_0x00c2:
            r1 = 0
        L_0x00c3:
            r7 = r26
            if (r26 == 0) goto L_0x00e2
            java.lang.String r0 = r21.A04()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00e2
            if (r8 != 0) goto L_0x00e2
            if (r1 != 0) goto L_0x00e2
            X.0rE r0 = r5.A05
            if (r0 == 0) goto L_0x00e2
            X.0Wd r0 = (X.C05900Wd) r0
            android.view.View r1 = r0.A00
            r0 = 9
            r1.performHapticFeedback(r0)
        L_0x00e2:
            X.DRu r0 = r21.A02()
            X.CvE r1 = A05(r0, r3)
            X.1Di r0 = r5.A0D
            r0.invoke(r1)
            long r0 = r1.A01()
            boolean r0 = X.C26260Cw5.A04(r0)
            if (r0 == 0) goto L_0x0122
            X.0CN r0 = X.AnonymousClass0CN.Cursor
        L_0x00fb:
            A07(r0, r5)
            X.0Pp r0 = r5.A03
            if (r0 == 0) goto L_0x0107
            X.0uU r0 = r0.A09
            X.AnonymousClass000.A1C(r0, r7)
        L_0x0107:
            X.0Pp r0 = r5.A03
            if (r0 == 0) goto L_0x0114
            boolean r1 = X.AnonymousClass0L5.A01(r5, r6)
            X.0uU r0 = r0.A0E
            X.AnonymousClass000.A1C(r0, r1)
        L_0x0114:
            X.0Pp r0 = r5.A03
            if (r0 == 0) goto L_0x0121
            boolean r1 = X.AnonymousClass0L5.A01(r5, r2)
            X.0uU r0 = r0.A0D
            X.AnonymousClass000.A1C(r0, r1)
        L_0x0121:
            return r3
        L_0x0122:
            X.0CN r0 = X.AnonymousClass0CN.Selection
            goto L_0x00fb
        L_0x0125:
            r12 = r3
            if (r25 == 0) goto L_0x003d
            if (r24 != 0) goto L_0x003d
            long r0 = r15 & r7
            int r13 = (int) r0
            goto L_0x003e
        L_0x012f:
            return r9
        L_0x0130:
            long r3 = X.C24498C6s.A00()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05120Qm.A02(X.0tb, X.CvE, long, boolean, boolean, boolean):long");
    }

    public C05120Qm() {
        this((AnonymousClass0NN) null);
    }
}
