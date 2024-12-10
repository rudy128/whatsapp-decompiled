package X;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.32F  reason: invalid class name */
public final class AnonymousClass32F implements C72193Kz {
    public void C17(AnonymousClass206 r5, AnonymousClass206 r6) {
        C18070vi.A0d(r6, 1);
        Collection<AnonymousClass25F> values = r5.A1G.values();
        C18070vi.A0X(values);
        ArrayList<AnonymousClass25C> A13 = AnonymousClass000.A13();
        for (AnonymousClass25F r0 : values) {
            AnonymousClass229 r1 = r0.A02;
            if ((r1 instanceof AnonymousClass25C) && r1 != null) {
                A13.add(r1);
            }
        }
        for (AnonymousClass25C BF3 : A13) {
            BF3.BF3(r5, r6);
        }
    }
}
