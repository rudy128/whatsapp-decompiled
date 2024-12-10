package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.4ru  reason: invalid class name and case insensitive filesystem */
public final class C98904ru implements Comparator {
    public final AnonymousClass11S A00;
    public final C24921Me A01;
    public final Collator A02;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass4NS r9 = (AnonymousClass4NS) obj;
        AnonymousClass4NS r10 = (AnonymousClass4NS) obj2;
        boolean A15 = C18070vi.A15(r9, r10);
        AnonymousClass1E7 r6 = r9.A00;
        AnonymousClass1E7 r4 = r10.A00;
        AnonymousClass11S r0 = this.A00;
        boolean A1V = AnonymousClass3Ma.A1V(r0, r6);
        if (A1V == AnonymousClass3Ma.A1V(r0, r4)) {
            C179509Ig r1 = r9.A02;
            C179509Ig r02 = C179509Ig.OWNER;
            A1V = AnonymousClass000.A1Z(r1, r02);
            C179509Ig r2 = r10.A02;
            if (A1V == AnonymousClass000.A1Z(r2, r02)) {
                C179509Ig r03 = C179509Ig.ADMIN;
                boolean A1Z = AnonymousClass000.A1Z(r1, r03);
                if (A1Z == AnonymousClass000.A1Z(r2, r03)) {
                    Collator collator = this.A02;
                    C24921Me r22 = this.A01;
                    return C98964s0.A00(r22.A0F(r6, 7, A15, A15), r22.A0F(r4, 7, A15, A15), collator);
                } else if (A1Z) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        if (A1V) {
            return -1;
        }
        return 1;
    }

    public C98904ru(AnonymousClass11S r2, C24921Me r3) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r3.A0c();
    }
}
