package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.0QS  reason: invalid class name */
public final class AnonymousClass0QS {
    public long A00;
    public boolean A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public AnonymousClass0NS A09;
    public EA0 A0A;
    public E8O A0B;
    public C26251Cvq A0C;
    public E3V A0D;
    public C28644ECa A0E;
    public C24246By4 A0F;
    public String A0G;
    public boolean A0H;

    public /* synthetic */ AnonymousClass0QS(C26251Cvq cvq, E3V e3v, String str, AnonymousClass1Y1 r12, int i, int i2, int i3, boolean z) {
        this(cvq, e3v, str, i, i2, i3, z);
    }

    private final void A04() {
        this.A0A = null;
        this.A0B = null;
        this.A0F = null;
        this.A03 = -1;
        this.A02 = -1;
        this.A08 = Constraints.A01.A01(0, 0);
        this.A00 = AnonymousClass001.A0r(0);
        this.A01 = false;
    }

    public static final C26594D5i A00(E8O e8o, int i, long j, boolean z) {
        return new C26594D5i((C26596D5k) e8o, i, j, z);
    }

    private final E8O A02(C24246By4 by4) {
        E8O e8o = this.A0B;
        if (e8o == null || by4 != this.A0F || e8o.BSK()) {
            this.A0F = by4;
            String str = this.A0G;
            C26251Cvq A002 = C24500C6u.A00(this.A0C, by4);
            C28644ECa eCa = this.A0E;
            C18070vi.A0b(eCa);
            e8o = C18460wS.A00;
        }
        this.A0B = e8o;
        return e8o;
    }

    private final boolean A05(C24246By4 by4, long j) {
        E8O e8o;
        EA0 ea0 = this.A0A;
        if (ea0 != null && (e8o = this.A0B) != null && !e8o.BSK() && by4 == this.A0F) {
            long j2 = this.A08;
            if (AnonymousClass000.A1P((j > j2 ? 1 : (j == j2 ? 0 : -1))) || (Constraints.A01(j) == Constraints.A01(j2) && ((float) Constraints.A00(j)) >= ea0.BSR() && !ea0.BQe())) {
                return false;
            }
        }
        return true;
    }

    public final int A08(C24246By4 by4, int i) {
        int i2 = this.A03;
        int i3 = this.A02;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int A002 = AnonymousClass0E0.A00(A01(by4, C26229CvL.A03(0, i, 0, Integer.MAX_VALUE)).BSR());
        this.A03 = i;
        this.A02 = A002;
        return A002;
    }

    public final C26227CvJ A0A(C26251Cvq cvq) {
        C28644ECa eCa;
        C24246By4 by4 = this.A0F;
        if (by4 == null || (eCa = this.A0E) == null) {
            return null;
        }
        C27069DRu dRu = new C27069DRu((List) null, 6, this.A0G);
        if (this.A0A == null || this.A0B == null) {
            return null;
        }
        long A042 = Constraints.A04(0, 0, 0, 0, 10, this.A08);
        C18460wS A092 = AnonymousClass1ZU.A09();
        int i = this.A04;
        boolean z = this.A0H;
        int i2 = this.A06;
        E3V e3v = this.A0D;
        C26251Cvq cvq2 = cvq;
        C25283Ccg ccg = new C25283Ccg(dRu, cvq2, e3v, eCa, by4, A092, i, i2, A042, z);
        C26595D5j d5j = new C26595D5j(dRu, cvq2, e3v, eCa, A092);
        return new C26227CvJ(new C26222CvC(d5j, this.A04, A042, AnonymousClass000.A1T(this.A06, 2)), ccg, (AnonymousClass1Y1) null, this.A00);
    }

    public final void A0C() {
        E8O e8o = this.A0B;
        if (e8o != null) {
            e8o.BSK();
        }
    }

    public final void A0D(C26251Cvq cvq, E3V e3v, String str, int i, int i2, int i3, boolean z) {
        this.A0G = str;
        this.A0C = cvq;
        this.A0D = e3v;
        this.A06 = i;
        this.A0H = z;
        this.A04 = i2;
        this.A05 = i3;
        A04();
    }

    public final void A0E(C28644ECa eCa) {
        long j;
        C28644ECa eCa2 = this.A0E;
        if (eCa != null) {
            j = C04000Ll.A00(eCa);
        } else {
            j = C04000Ll.A00;
        }
        if (eCa2 == null) {
            this.A0E = eCa;
            this.A07 = j;
        } else if (eCa == null || this.A07 != j) {
            this.A0E = eCa;
            this.A07 = j;
            A04();
        }
    }

    public final boolean A0F(C24246By4 by4, long j) {
        boolean z = true;
        if (this.A05 > 1) {
            AnonymousClass0NS r3 = this.A09;
            C26251Cvq cvq = this.A0C;
            C28644ECa eCa = this.A0E;
            C18070vi.A0b(eCa);
            AnonymousClass0NS A002 = AnonymousClass0E5.A00(r3, cvq, this.A0D, eCa, by4);
            this.A09 = A002;
            j = A002.A00(j, this.A05);
        }
        boolean z2 = false;
        if (!A05(by4, j)) {
            if (j != this.A08) {
                EA0 ea0 = this.A0A;
                C18070vi.A0b(ea0);
                long A062 = C26229CvL.A06(j, C25293Ccv.A00(AnonymousClass0E0.A00(Math.min(ea0.BUS(), ea0.Bbp())), AnonymousClass0E0.A00(ea0.BSR())));
                this.A00 = A062;
                if (this.A06 == 3 || (AnonymousClass000.A02(A062) >= ea0.Bbp() && ((float) AnonymousClass000.A0H(A062)) >= ea0.BSR())) {
                    z = false;
                }
                this.A01 = z;
                this.A08 = j;
            }
            return false;
        }
        EA0 A012 = A01(by4, j);
        this.A08 = j;
        long A063 = C26229CvL.A06(j, C25293Ccv.A00(AnonymousClass0E0.A00(A012.Bbp()), AnonymousClass0E0.A00(A012.BSR())));
        this.A00 = A063;
        if (this.A06 != 3 && (AnonymousClass000.A02(A063) < A012.Bbp() || ((float) AnonymousClass000.A0H(A063)) < A012.BSR())) {
            z2 = true;
        }
        this.A01 = z2;
        this.A0A = A012;
        return true;
    }

    public AnonymousClass0QS(C26251Cvq cvq, E3V e3v, String str, int i, int i2, int i3, boolean z) {
        this.A0G = str;
        this.A0C = cvq;
        this.A0D = e3v;
        this.A06 = i;
        this.A0H = z;
        this.A04 = i2;
        this.A05 = i3;
        this.A07 = C04000Ll.A00;
        this.A00 = AnonymousClass001.A0r(0);
        this.A08 = Constraints.A01.A01(0, 0);
        this.A03 = -1;
        this.A02 = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r5 == 2) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.EA0 A01(X.C24246By4 r8, long r9) {
        /*
            r7 = this;
            X.E8O r6 = r7.A02(r8)
            boolean r2 = r7.A0H
            int r1 = r7.A06
            float r0 = r6.BUS()
            long r2 = X.C04430Nj.A01(r0, r1, r9, r2)
            boolean r0 = r7.A0H
            int r5 = r7.A06
            int r1 = r7.A04
            r4 = 1
            if (r0 != 0) goto L_0x0022
            r0 = 2
            if (r5 != r0) goto L_0x0022
        L_0x001c:
            r1 = 1
        L_0x001d:
            X.D5i r0 = A00(r6, r4, r2, r1)
            return r0
        L_0x0022:
            if (r1 >= r4) goto L_0x0025
            r1 = 1
        L_0x0025:
            r4 = r1
            r0 = 2
            r1 = 0
            if (r5 != r0) goto L_0x001d
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QS.A01(X.By4, long):X.EA0");
    }

    public final int A06(C24246By4 by4) {
        return AnonymousClass0E0.A00(A02(by4).BUS());
    }

    public final int A07(C24246By4 by4) {
        return AnonymousClass0E0.A00(A02(by4).BUy());
    }

    public final EA0 A09() {
        return this.A0A;
    }

    public final C28644ECa A0B() {
        return this.A0E;
    }
}
