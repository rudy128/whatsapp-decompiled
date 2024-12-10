package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.71I  reason: invalid class name */
public final class AnonymousClass71I {
    public static final List A05;
    public static final List A06;
    public boolean A00;
    public final C51642Zb A01;
    public final AnonymousClass1UD A02;
    public final C18100vl A03 = AnonymousClass1DF.A01(C157317wj.A00);
    public final C18100vl A04 = AnonymousClass1DF.A01(C157327wk.A00);

    static {
        AnonymousClass6RQ r3 = AnonymousClass6RQ.LIST;
        A05 = C18070vi.A0M(r3);
        AnonymousClass6RQ[] r2 = new AnonymousClass6RQ[4];
        r2[0] = AnonymousClass6RQ.CAROUSEL_LARGE;
        r2[1] = r3;
        r2[2] = r3;
        A06 = C18070vi.A0O(r3, r2, 3);
    }

    public AnonymousClass71I(C51642Zb r2, AnonymousClass1UD r3) {
        C18070vi.A0j(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
    }

    public static final ArrayList A00(C134496qg r6) {
        Object r0;
        Object r02;
        ArrayList A13 = AnonymousClass000.A13();
        for (C143257Cr r4 : r6.A00) {
            int ordinal = r4.A00.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2 || ordinal == 1) {
                    if (r6.A01) {
                        String str = r4.A02;
                        if (str.length() > 0) {
                            r0 = new C143317Cx(str);
                        }
                    } else {
                        r0 = new C143247Cq(r4);
                    }
                    A13.add(r0);
                } else if (ordinal == 3) {
                    if (r6.A01) {
                        String str2 = r4.A02;
                        if (str2.length() > 0) {
                            r02 = new C143317Cx(str2);
                        }
                        A13.addAll(C29431cG.A0v(r4.A03, 3));
                    } else {
                        r02 = new C143247Cq(r4);
                    }
                    A13.add(r02);
                    A13.addAll(C29431cG.A0v(r4.A03, 3));
                }
            }
            A13.add(r4);
        }
        return A13;
    }
}
