package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.4XO  reason: invalid class name */
public class AnonymousClass4XO {
    public final int A00;
    public final ArrayList A01 = AnonymousClass000.A13();
    public final List A02;
    public final boolean A03;
    public final boolean A04;

    public String A01(AnonymousClass3gf r2) {
        return C18070vi.A0F(r2, this.A00);
    }

    public AnonymousClass4XO(List list, int i, boolean z, boolean z2) {
        this.A02 = list;
        this.A00 = i;
        this.A03 = z;
        this.A04 = z2;
    }

    public static void A00(AnonymousClass4XO r1, AnonymousClass1E7 r2, List list, Set set) {
        if (list.contains(r2) && !C29431cG.A18(set, r2.A0J)) {
            r1.A01.add(r2);
            AnonymousClass1BI r0 = r2.A0J;
            if (r0 != null) {
                set.add(r0);
            }
        }
    }
}
