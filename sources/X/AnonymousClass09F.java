package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.09F  reason: invalid class name */
public final class AnonymousClass09F extends AnonymousClass0XW implements C17670v2, C17640uz {
    public float A00;
    public Alignment A01;
    public AnonymousClass0HD A02;
    public C04640Oe A03;
    public C17050tf A04;
    public boolean A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (androidx.compose.ui.unit.Constraints.A07(r13) == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long A00(long r13) {
        /*
            r12 = this;
            r10 = r13
            boolean r0 = androidx.compose.ui.unit.Constraints.A08(r13)
            r2 = 1
            if (r0 == 0) goto L_0x000f
            boolean r0 = androidx.compose.ui.unit.Constraints.A07(r13)
            r1 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            boolean r0 = androidx.compose.ui.unit.Constraints.A0A(r13)
            if (r0 == 0) goto L_0x0104
            boolean r0 = androidx.compose.ui.unit.Constraints.A09(r13)
            if (r0 == 0) goto L_0x0104
        L_0x001c:
            boolean r0 = r12.A01()
            if (r0 != 0) goto L_0x0024
            if (r1 != 0) goto L_0x00fb
        L_0x0024:
            if (r2 != 0) goto L_0x00fb
            X.0Oe r0 = r12.A03
            long r2 = r0.A02()
            boolean r0 = A03(r2)
            if (r0 == 0) goto L_0x00f5
            float r0 = X.AnonymousClass0QG.A02(r2)
            int r1 = X.C22339B3q.A01(r0)
        L_0x003a:
            boolean r0 = A02(r2)
            if (r0 == 0) goto L_0x00ef
            float r0 = X.AnonymousClass0QG.A00(r2)
            int r0 = X.C22339B3q.A01(r0)
        L_0x0048:
            int r1 = X.C26229CvL.A01(r13, r1)
            int r0 = X.C26229CvL.A00(r13, r0)
            float r1 = (float) r1
            float r0 = (float) r0
            long r3 = X.AnonymousClass001.A0p(r1, r0)
            long r0 = X.AnonymousClass0QG.A02
            boolean r0 = r12.A01()
            if (r0 == 0) goto L_0x00b5
            X.0Oe r0 = r12.A03
            long r0 = r0.A02()
            boolean r0 = A03(r0)
            if (r0 != 0) goto L_0x00e4
            float r2 = X.AnonymousClass0QG.A02(r3)
        L_0x006e:
            X.0Oe r0 = r12.A03
            long r0 = r0.A02()
            boolean r0 = A02(r0)
            if (r0 != 0) goto L_0x00d9
            float r0 = X.AnonymousClass0QG.A00(r3)
        L_0x007e:
            long r1 = X.AnonymousClass001.A0p(r2, r0)
            float r0 = X.AnonymousClass0QG.A02(r3)
            r5 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00d6
            float r0 = X.AnonymousClass0QG.A00(r3)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00d6
            X.0tf r0 = r12.A04
            long r6 = r0.BFS(r1, r3)
            float r5 = X.AnonymousClass0QG.A02(r1)
            long r3 = X.AnonymousClass0GH.A00
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0107
            float r0 = X.AnonymousClass001.A02(r6)
            float r5 = r5 * r0
            float r1 = X.AnonymousClass0QG.A00(r1)
            float r0 = X.AnonymousClass001.A01(r6)
            float r1 = r1 * r0
            long r3 = X.AnonymousClass001.A0p(r5, r1)
        L_0x00b5:
            float r0 = X.AnonymousClass0QG.A02(r3)
            int r0 = X.C22339B3q.A01(r0)
            int r5 = X.C26229CvL.A01(r13, r0)
            float r0 = X.AnonymousClass0QG.A00(r3)
            int r0 = X.C22339B3q.A01(r0)
            int r7 = X.C26229CvL.A00(r13, r0)
        L_0x00cd:
            r9 = 10
            r6 = 0
            r8 = r6
            long r0 = androidx.compose.ui.unit.Constraints.A04(r5, r6, r7, r8, r9, r10)
            return r0
        L_0x00d6:
            long r3 = X.AnonymousClass0QG.A02
            goto L_0x00b5
        L_0x00d9:
            X.0Oe r0 = r12.A03
            long r0 = r0.A02()
            float r0 = X.AnonymousClass0QG.A00(r0)
            goto L_0x007e
        L_0x00e4:
            X.0Oe r0 = r12.A03
            long r0 = r0.A02()
            float r2 = X.AnonymousClass0QG.A02(r0)
            goto L_0x006e
        L_0x00ef:
            int r0 = androidx.compose.ui.unit.Constraints.A02(r13)
            goto L_0x0048
        L_0x00f5:
            int r1 = androidx.compose.ui.unit.Constraints.A03(r13)
            goto L_0x003a
        L_0x00fb:
            int r5 = androidx.compose.ui.unit.Constraints.A01(r13)
            int r7 = androidx.compose.ui.unit.Constraints.A00(r13)
            goto L_0x00cd
        L_0x0104:
            r2 = 0
            goto L_0x001c
        L_0x0107:
            java.lang.String r0 = "ScaleFactor is unspecified"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09F.A00(long):long");
    }

    public boolean A0K() {
        return false;
    }

    public /* synthetic */ void Bxi() {
    }

    private final boolean A01() {
        if (!this.A05 || this.A03.A02() == AnonymousClass0QG.A01) {
            return false;
        }
        return true;
    }

    public static final boolean A02(long j) {
        if (j != AnonymousClass0QG.A01) {
            float A002 = AnonymousClass0QG.A00(j);
            if (Float.isInfinite(A002) || Float.isNaN(A002)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A03(long j) {
        if (j != AnonymousClass0QG.A01) {
            float A022 = AnonymousClass0QG.A02(j);
            if (Float.isInfinite(A022) || Float.isNaN(A022)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void BJM(C17480uj r15) {
        float A022;
        long j;
        long A023 = this.A03.A02();
        C17480uj r10 = r15;
        if (A03(A023)) {
            A022 = AnonymousClass0QG.A02(A023);
        } else {
            A022 = AnonymousClass0QG.A02(r15.BZL());
        }
        if (!A02(A023)) {
            A023 = r15.BZL();
        }
        long A0p = AnonymousClass001.A0p(A022, AnonymousClass0QG.A00(A023));
        long BZL = r15.BZL();
        if (AnonymousClass0QG.A02(BZL) == 0.0f || AnonymousClass0QG.A00(BZL) == 0.0f) {
            j = AnonymousClass0QG.A02;
        } else {
            long BFS = this.A04.BFS(A0p, BZL);
            float A024 = AnonymousClass0QG.A02(A0p);
            if (BFS != AnonymousClass0GH.A00) {
                j = AnonymousClass001.A0p(A024 * AnonymousClass001.A02(BFS), AnonymousClass0QG.A00(A0p) * AnonymousClass001.A01(BFS));
            } else {
                throw AnonymousClass000.A0n("ScaleFactor is unspecified");
            }
        }
        long BC1 = this.A01.BC1(r15.getLayoutDirection(), C25293Ccv.A00(C22339B3q.A01(AnonymousClass0QG.A02(j)), C22339B3q.A01(AnonymousClass0QG.A00(j))), C25293Ccv.A00(C22339B3q.A01(AnonymousClass0QG.A02(BZL)), C22339B3q.A01(AnonymousClass0QG.A00(BZL))));
        float A025 = AnonymousClass000.A02(BC1);
        float A0H = (float) AnonymousClass000.A0H(BC1);
        AnonymousClass0t6 r3 = ((C05890Wc) ((AnonymousClass0WZ) r15.BQs()).A00).A00;
        r3.BOJ().CPp(A025, A0H);
        this.A03.A05(this.A02, r10, this.A00, j);
        r3.BOJ().CPp(-A025, -A0H);
        r15.BJR();
    }

    public int BjB(C16860tL r5, C17740v9 r6, int i) {
        if (!A01()) {
            return r5.Bj9(i);
        }
        long A002 = A00(C26229CvL.A02(i, 0, 13));
        return Math.max(Constraints.A02(A002), r5.Bj9(i));
    }

    public int BjE(C16860tL r5, C17740v9 r6, int i) {
        if (!A01()) {
            return r5.BjC(i);
        }
        long A002 = A00(C26229CvL.A02(0, i, 7));
        return Math.max(Constraints.A03(A002), r5.BjC(i));
    }

    public C16820tH Bja(C17500ul r5, C17530uo r6, long j) {
        AnonymousClass0XJ Bjb = r5.Bjb(A00(j));
        return r6.BhL(AnonymousClass1D7.A0I(), new C09910hU(Bjb), Bjb.A01, Bjb.A00);
    }

    public int Bjx(C16860tL r5, C17740v9 r6, int i) {
        if (!A01()) {
            return r5.Bjv(i);
        }
        long A002 = A00(C26229CvL.A02(i, 0, 13));
        return Math.max(Constraints.A02(A002), r5.Bjv(i));
    }

    public int Bk0(C16860tL r5, C17740v9 r6, int i) {
        if (!A01()) {
            return r5.Bjy(i);
        }
        long A002 = A00(C26229CvL.A02(0, i, 7));
        return Math.max(Constraints.A03(A002), r5.Bjy(i));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PainterModifier(painter=");
        A10.append(this.A03);
        A10.append(", sizeToIntrinsics=");
        A10.append(this.A05);
        A10.append(", alignment=");
        A10.append(this.A01);
        A10.append(", alpha=");
        A10.append(this.A00);
        A10.append(", colorFilter=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
