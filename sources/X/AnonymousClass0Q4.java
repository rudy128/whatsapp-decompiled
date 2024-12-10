package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.0Q4  reason: invalid class name */
public final class AnonymousClass0Q4 {
    public C26595D5j A00;
    public C24246By4 A01;
    public final List A02;
    public final boolean A03;
    public final C27069DRu A04;
    public final C26251Cvq A05;
    public final E3V A06;
    public final C28644ECa A07;

    public /* synthetic */ AnonymousClass0Q4(C27069DRu dRu, C26251Cvq cvq, E3V e3v, C28644ECa eCa, List list, AnonymousClass1Y1 r6, int i, int i2, int i3, boolean z) {
        this(dRu, cvq, e3v, eCa, list, z);
    }

    private final C26595D5j A01() {
        C26595D5j d5j = this.A00;
        if (d5j != null) {
            return d5j;
        }
        throw AnonymousClass000.A0n("layoutIntrinsics must be called first");
    }

    public final C26227CvJ A05(C26227CvJ cvJ, C24246By4 by4, long j) {
        C26227CvJ cvJ2 = cvJ;
        C24246By4 by42 = by4;
        long j2 = j;
        if (cvJ != null) {
            C27069DRu dRu = this.A04;
            C26251Cvq cvq = this.A05;
            List list = this.A02;
            boolean z = this.A03;
            if (A02(dRu, cvJ2, cvq, this.A06, this.A07, by42, list, j2, z)) {
                C25283Ccg A0N = cvJ2.A0N();
                C27069DRu A032 = A0N.A03();
                List A08 = A0N.A08();
                int A002 = A0N.A00();
                boolean A09 = A0N.A09();
                int A012 = A0N.A01();
                C25283Ccg ccg = new C25283Ccg(A032, cvq, A0N.A05(), A0N.A06(), A0N.A07(), A08, A002, A012, j2, A09);
                C26222CvC A0M = cvJ2.A0M();
                return cvJ2.A0O(ccg, C26229CvL.A06(j2, C25293Ccv.A00(AnonymousClass0E0.A00(A0M.A06()), AnonymousClass0E0.A00(A0M.A05()))));
            }
        }
        C26222CvC A003 = A00(by42, j2);
        long A062 = C26229CvL.A06(j2, C25293Ccv.A00(AnonymousClass0E0.A00(A003.A06()), AnonymousClass0E0.A00(A003.A05())));
        C27069DRu dRu2 = this.A04;
        C26251Cvq cvq2 = this.A05;
        List list2 = this.A02;
        boolean z2 = this.A03;
        return new C26227CvJ(A003, new C25283Ccg(dRu2, cvq2, this.A06, this.A07, by42, list2, Integer.MAX_VALUE, 1, j2, z2), (AnonymousClass1Y1) null, A062);
    }

    public final void A09(C24246By4 by4) {
        C26595D5j d5j = this.A00;
        if (d5j == null || by4 != this.A01 || d5j.BSK()) {
            this.A01 = by4;
            d5j = new C26595D5j(this.A04, C24500C6u.A00(this.A05, by4), this.A06, this.A07, this.A02);
        }
        this.A00 = d5j;
    }

    public /* synthetic */ AnonymousClass0Q4(C27069DRu dRu, C26251Cvq cvq, E3V e3v, C28644ECa eCa, boolean z) {
        this(dRu, cvq, e3v, eCa, AnonymousClass1ZU.A09(), (AnonymousClass1Y1) null, Integer.MAX_VALUE, 1, 1, z);
    }

    private final C26222CvC A00(C24246By4 by4, long j) {
        int i;
        A09(by4);
        int A032 = Constraints.A03(j);
        if (!this.A03 || !Constraints.A08(j)) {
            i = Integer.MAX_VALUE;
        } else {
            i = Constraints.A01(j);
        }
        if (A032 != i) {
            i = C28851b7.A03(A03(), A032, i);
        }
        return new C26222CvC(A01(), Integer.MAX_VALUE, C26229CvL.A02(i, Constraints.A00(j), 5), false);
    }

    public static final boolean A02(C27069DRu dRu, C26227CvJ cvJ, C26251Cvq cvq, E3V e3v, C28644ECa eCa, C24246By4 by4, List list, long j, boolean z) {
        C25283Ccg A0N = cvJ.A0N();
        if (cvJ.A0M().A07().BSK() || !C18070vi.A18(A0N.A03(), dRu) || !A0N.A04().A0G(cvq) || !C18070vi.A18(A0N.A08(), list) || A0N.A00() != Integer.MAX_VALUE || A0N.A09() != z || A0N.A01() != 1 || !C18070vi.A18(A0N.A06(), eCa) || A0N.A07() != by4 || !C18070vi.A18(A0N.A05(), e3v)) {
            return false;
        }
        int A032 = Constraints.A03(j);
        long A022 = A0N.A02();
        if (A032 != Constraints.A03(A022)) {
            return false;
        }
        if (!z) {
            return true;
        }
        if (Constraints.A01(j) == Constraints.A01(A022) && Constraints.A00(j) == Constraints.A00(A022)) {
            return true;
        }
        return false;
    }

    public final int A03() {
        return AnonymousClass0E0.A00(A01().BUS());
    }

    public final C27069DRu A04() {
        return this.A04;
    }

    public final C26251Cvq A06() {
        return this.A05;
    }

    public final E3V A07() {
        return this.A06;
    }

    public final C28644ECa A08() {
        return this.A07;
    }

    public AnonymousClass0Q4(C27069DRu dRu, C26251Cvq cvq, E3V e3v, C28644ECa eCa, List list, boolean z) {
        this.A04 = dRu;
        this.A05 = cvq;
        this.A03 = z;
        this.A07 = eCa;
        this.A06 = e3v;
        this.A02 = list;
    }
}
