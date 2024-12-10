package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.1wu  reason: invalid class name and case insensitive filesystem */
public final class C41691wu {
    public final AnonymousClass118 A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public C41691wu(AnonymousClass118 r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final List A01() {
        int i;
        Integer[] numArr = new Integer[4];
        numArr[0] = 1;
        AnonymousClass00H r2 = this.A02;
        int i2 = null;
        if (((C28391a8) r2.get()).A03()) {
            i2 = 4;
        }
        numArr[1] = i2;
        C28391a8 r1 = (C28391a8) r2.get();
        if (r1.A02()) {
            if (C18020vd.A05(C18040vf.A01, r1.A01, 7769)) {
                i = null;
                numArr[2] = i;
                numArr[3] = 3;
                return C200410p.A0P(numArr);
            }
        }
        i = 2;
        numArr[2] = i;
        numArr[3] = 3;
        return C200410p.A0P(numArr);
    }

    public final boolean A02(String str) {
        C18070vi.A0d(str, 0);
        List<Number> A012 = A01();
        if (!(A012 instanceof Collection) || !A012.isEmpty()) {
            for (Number intValue : A012) {
                if (A00(this, intValue.intValue()).equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        AnonymousClass118 r1 = this.A00;
        this.A01.get();
        String A013 = r1.A01(2131890391);
        C18070vi.A0X(A013);
        if (!A013.equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public static final String A00(C41691wu r3, int i) {
        AnonymousClass118 r2 = r3.A00;
        r3.A01.get();
        int i2 = 2131890409;
        if (i != 1) {
            i2 = 2131890393;
            if (i != 2) {
                i2 = 2131890397;
                if (i != 3) {
                    if (i == 4) {
                        i2 = 2131890396;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported static filter for ");
                        sb.append(i);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
        }
        String A012 = r2.A01(i2);
        C18070vi.A0X(A012);
        return A012;
    }
}
