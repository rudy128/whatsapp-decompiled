package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3BB  reason: invalid class name */
public final class AnonymousClass3BB implements C22486B9s {
    public final AnonymousClass11S A00;
    public final C26911Ty A01;
    public final C18030ve A02;

    public static final boolean A00(AEW aew) {
        C64572uz r0 = aew.A02;
        if (r0 == null) {
            return false;
        }
        List list = r0.A02;
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (((C64552ux) next).A00.equals("critical")) {
                A13.add(next);
            }
        }
        return AnonymousClass000.A1a(A13);
    }

    public boolean BCL(C186309dz r10, C22484B9q b9q, AnonymousClass5YR r12) {
        Integer num;
        Integer num2;
        AnonymousClass11S r8 = this.A00;
        r8.A0I();
        AnonymousClass1E8 r1 = r8.A0D;
        if (r1 != null) {
            C18030ve r7 = this.A02;
            C18040vf r6 = C18040vf.A02;
            if (C18020vd.A05(r6, r7, 11164)) {
                return r1.A0O();
            }
            AEW A08 = this.A01.A08(AnonymousClass11S.A00(r8));
            if (A08 != null) {
                C64572uz r2 = A08.A02;
                String str = null;
                if (r2 != null) {
                    str = r2.A01;
                }
                if (str != null && str.equals("non_eligibile")) {
                    num = AnonymousClass00R.A00;
                } else if (A00(A08)) {
                    num = AnonymousClass00R.A01;
                } else {
                    if (!A00(A08) && r2 != null) {
                        List list = r2.A02;
                        ArrayList A13 = AnonymousClass000.A13();
                        for (Object next : list) {
                            if (((C64552ux) next).A00.equals("warning")) {
                                A13.add(next);
                            }
                        }
                        if (AnonymousClass000.A1a(A13) && !AnonymousClass9PU.A00(r8, A08)) {
                            num = AnonymousClass00R.A0C;
                        }
                    }
                    num = AnonymousClass00R.A0N;
                }
                if (C18020vd.A05(r6, r7, 7046)) {
                    num2 = AnonymousClass00R.A0C;
                } else {
                    num2 = AnonymousClass00R.A01;
                }
                return AnonymousClass000.A1Q(num.compareTo(num2));
            }
        }
        return false;
    }

    public AnonymousClass3BB(AnonymousClass11S r1, C26911Ty r2, C18030ve r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
