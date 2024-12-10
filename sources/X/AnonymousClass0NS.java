package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.0NS  reason: invalid class name */
public final class AnonymousClass0NS {
    public static AnonymousClass0NS A07;
    public float A00;
    public float A01;
    public final C26251Cvq A02;
    public final C26251Cvq A03;
    public final E3V A04;
    public final C28644ECa A05;
    public final C24246By4 A06;

    public /* synthetic */ AnonymousClass0NS(C26251Cvq cvq, E3V e3v, C28644ECa eCa, C24246By4 by4, AnonymousClass1Y1 r5) {
        this(cvq, e3v, eCa, by4);
    }

    public final long A00(long j, int i) {
        int A022;
        int i2 = i;
        float f = this.A01;
        float f2 = this.A00;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = AnonymousClass0GR.A00;
            C26251Cvq cvq = this.A03;
            long A023 = C26229CvL.A02(0, 0, 15);
            C28644ECa eCa = this.A05;
            E3V e3v = this.A04;
            f = C24497C6r.A00(cvq, e3v, eCa, str, (List) null, 1, 96, A023).BSR();
            f2 = C24497C6r.A00(cvq, e3v, eCa, AnonymousClass0GR.A01, (List) null, 2, 96, C26229CvL.A02(0, 0, 15)).BSR() - f;
            this.A01 = f;
            this.A00 = f2;
        }
        if (i2 != 1) {
            A022 = C22339B3q.A01(f + (f2 * ((float) (i - 1))));
            if (A022 < 0) {
                A022 = 0;
            }
            int A002 = Constraints.A00(j);
            if (A022 > A002) {
                A022 = A002;
            }
        } else {
            A022 = Constraints.A02(j);
        }
        return C26229CvL.A03(Constraints.A03(j), Constraints.A01(j), A022, Constraints.A00(j));
    }

    public AnonymousClass0NS(C26251Cvq cvq, E3V e3v, C28644ECa eCa, C24246By4 by4) {
        this.A06 = by4;
        this.A02 = cvq;
        this.A05 = eCa;
        this.A04 = e3v;
        this.A03 = C24500C6u.A00(cvq, by4);
        this.A00 = Float.NaN;
        this.A01 = Float.NaN;
    }

    public final C26251Cvq A01() {
        return this.A02;
    }

    public final E3V A02() {
        return this.A04;
    }

    public final C28644ECa A03() {
        return this.A05;
    }

    public final C24246By4 A04() {
        return this.A06;
    }
}
