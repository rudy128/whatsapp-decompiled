package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.0QI  reason: invalid class name */
public final class AnonymousClass0QI {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public AnonymousClass0NS A06;
    public C27069DRu A07;
    public C26595D5j A08;
    public C26227CvJ A09;
    public C26251Cvq A0A;
    public E3V A0B;
    public C28644ECa A0C;
    public C24246By4 A0D;
    public List A0E;
    public boolean A0F;

    public /* synthetic */ AnonymousClass0QI(C27069DRu dRu, C26251Cvq cvq, E3V e3v, List list, AnonymousClass1Y1 r14, int i, int i2, int i3, boolean z) {
        this(dRu, cvq, e3v, list, i, i2, i3, z);
    }

    private final void A03() {
        this.A08 = null;
        this.A09 = null;
        this.A00 = -1;
        this.A01 = -1;
    }

    public static final boolean A04(C26227CvJ cvJ, C24246By4 by4, long j) {
        if (cvJ != null) {
            C26222CvC A0M = cvJ.A0M();
            if (!A0M.A07().BSK()) {
                C25283Ccg A0N = cvJ.A0N();
                if (by4 == A0N.A07()) {
                    long A022 = A0N.A02();
                    if (AnonymousClass000.A1P((j > A022 ? 1 : (j == A022 ? 0 : -1))) || (Constraints.A01(j) == Constraints.A01(A022) && ((float) Constraints.A00(j)) >= A0M.A05() && !A0M.A09())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private final C26595D5j A01(C24246By4 by4) {
        C26595D5j d5j = this.A08;
        if (d5j == null || by4 != this.A0D || d5j.BSK()) {
            this.A0D = by4;
            C27069DRu dRu = this.A07;
            C26251Cvq A002 = C24500C6u.A00(this.A0A, by4);
            C28644ECa eCa = this.A0C;
            C18070vi.A0b(eCa);
            E3V e3v = this.A0B;
            List list = this.A0E;
            if (list == null) {
                list = AnonymousClass1ZU.A09();
            }
            d5j = new C26595D5j(dRu, A002, e3v, eCa, list);
        }
        this.A08 = d5j;
        return d5j;
    }

    private final C26227CvJ A02(C26222CvC cvC, C24246By4 by4, long j) {
        C26222CvC cvC2 = cvC;
        float min = Math.min(cvC2.A07().BUS(), cvC2.A06());
        C27069DRu dRu = this.A07;
        C26251Cvq cvq = this.A0A;
        List list = this.A0E;
        if (list == null) {
            list = AnonymousClass1ZU.A09();
        }
        int i = this.A02;
        boolean z = this.A0F;
        int i2 = this.A04;
        C28644ECa eCa = this.A0C;
        C18070vi.A0b(eCa);
        long j2 = j;
        return new C26227CvJ(cvC2, new C25283Ccg(dRu, cvq, this.A0B, eCa, by4, list, i, i2, j2, z), (AnonymousClass1Y1) null, C26229CvL.A06(j2, C25293Ccv.A00(AnonymousClass0E0.A00(min), AnonymousClass0E0.A00(cvC2.A05()))));
    }

    public final int A07(C24246By4 by4, int i) {
        int i2 = this.A01;
        int i3 = this.A00;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int A002 = AnonymousClass0E0.A00(A00(by4, C26229CvL.A03(0, i, 0, Integer.MAX_VALUE)).A05());
        this.A01 = i;
        this.A00 = A002;
        return A002;
    }

    public final C26227CvJ A09() {
        C26227CvJ cvJ = this.A09;
        if (cvJ != null) {
            return cvJ;
        }
        throw AnonymousClass000.A0n("You must call layoutWithConstraints first");
    }

    public final void A0B(C27069DRu dRu, C26251Cvq cvq, E3V e3v, List list, int i, int i2, int i3, boolean z) {
        this.A07 = dRu;
        this.A0A = cvq;
        this.A0B = e3v;
        this.A04 = i;
        this.A0F = z;
        this.A02 = i2;
        this.A03 = i3;
        this.A0E = list;
        A03();
    }

    public final void A0C(C28644ECa eCa) {
        long j;
        C28644ECa eCa2 = this.A0C;
        if (eCa != null) {
            j = C04000Ll.A00(eCa);
        } else {
            j = C04000Ll.A00;
        }
        if (eCa2 == null) {
            this.A0C = eCa;
            this.A05 = j;
        } else if (eCa == null || this.A05 != j) {
            this.A0C = eCa;
            this.A05 = j;
            A03();
        }
    }

    public final boolean A0D(C24246By4 by4, long j) {
        C26222CvC cvC;
        if (this.A03 > 1) {
            AnonymousClass0NS r4 = this.A06;
            C26251Cvq cvq = this.A0A;
            C28644ECa eCa = this.A0C;
            C18070vi.A0b(eCa);
            AnonymousClass0NS A002 = AnonymousClass0E5.A00(r4, cvq, this.A0B, eCa, by4);
            this.A06 = A002;
            j = A002.A00(j, this.A03);
        }
        if (!A04(this.A09, by4, j)) {
            C26227CvJ cvJ = this.A09;
            C18070vi.A0b(cvJ);
            if (j == cvJ.A0N().A02()) {
                return false;
            }
            C26227CvJ cvJ2 = this.A09;
            C18070vi.A0b(cvJ2);
            cvC = cvJ2.A0M();
        } else {
            cvC = A00(by4, j);
        }
        this.A09 = A02(cvC, by4, j);
        return true;
    }

    public AnonymousClass0QI(C27069DRu dRu, C26251Cvq cvq, E3V e3v, List list, int i, int i2, int i3, boolean z) {
        this.A07 = dRu;
        this.A0A = cvq;
        this.A0B = e3v;
        this.A04 = i;
        this.A0F = z;
        this.A02 = i2;
        this.A03 = i3;
        this.A0E = list;
        this.A05 = C04000Ll.A00;
        this.A01 = -1;
        this.A00 = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r2 == 2) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C26222CvC A00(X.C24246By4 r9, long r10) {
        /*
            r8 = this;
            X.D5j r3 = r8.A01(r9)
            boolean r2 = r8.A0F
            int r1 = r8.A04
            float r0 = r3.BUS()
            long r5 = X.C04430Nj.A01(r0, r1, r10, r2)
            boolean r0 = r8.A0F
            int r2 = r8.A04
            int r1 = r8.A02
            r4 = 1
            if (r0 != 0) goto L_0x0023
            r0 = 2
            if (r2 != r0) goto L_0x0023
        L_0x001c:
            r7 = 1
        L_0x001d:
            X.CvC r2 = new X.CvC
            r2.<init>(r3, r4, r5, r7)
            return r2
        L_0x0023:
            if (r1 >= r4) goto L_0x0026
            r1 = 1
        L_0x0026:
            r4 = r1
            r0 = 2
            r7 = 0
            if (r2 != r0) goto L_0x001d
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QI.A00(X.By4, long):X.CvC");
    }

    public final int A05(C24246By4 by4) {
        return AnonymousClass0E0.A00(A01(by4).BUS());
    }

    public final int A06(C24246By4 by4) {
        return AnonymousClass0E0.A00(A01(by4).BUy());
    }

    public final C26227CvJ A08() {
        return this.A09;
    }

    public final C28644ECa A0A() {
        return this.A0C;
    }
}
