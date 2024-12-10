package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.4rt  reason: invalid class name and case insensitive filesystem */
public final class C98894rt implements Comparator {
    public final AnonymousClass11S A00;
    public final C24921Me A01;
    public final Collator A02;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass4SF r8 = (AnonymousClass4SF) obj;
        AnonymousClass4SF r9 = (AnonymousClass4SF) obj2;
        boolean A15 = C18070vi.A15(r8, r9);
        AnonymousClass1E7 r6 = r8.A02;
        if (r6 == null) {
            r6 = new AnonymousClass1E7(r8.A03);
        }
        AnonymousClass1E7 r4 = r9.A02;
        if (r4 == null) {
            r4 = new AnonymousClass1E7(r9.A03);
        }
        AnonymousClass11S r0 = this.A00;
        boolean A1V = AnonymousClass3Ma.A1V(r0, r6);
        if (A1V == AnonymousClass3Ma.A1V(r0, r4) && (A1V = AnonymousClass000.A1O(r8.A00)) == AnonymousClass000.A1O(r9.A00)) {
            Collator collator = this.A02;
            C24921Me r2 = this.A01;
            return C98964s0.A00(r2.A0F(r6, 7, A15, A15), r2.A0F(r4, 7, A15, A15), collator);
        } else if (!A1V) {
            return 1;
        } else {
            return -1;
        }
    }

    public C98894rt(AnonymousClass11S r2, C24921Me r3) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r3.A0c();
    }
}
