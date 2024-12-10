package X;

import java.util.Collection;

/* renamed from: X.7IL  reason: invalid class name */
public class AnonymousClass7IL implements AnonymousClass87H {
    public final int A00;
    public final Object A01;

    public AnonymousClass7IL(C131976ly r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final void C3o(Collection collection) {
        int i = this.A00;
        C131976ly r1 = (C131976ly) this.A01;
        if (3 - i != 0) {
            C18070vi.A0d(r1, 0);
        }
        C17960vV.A02();
        if (collection != null) {
            r1.A01.addAll(collection);
        }
        AnonymousClass87G r0 = r1.A00;
        if (r0 != null) {
            r0.C3x(r1);
        }
    }
}
