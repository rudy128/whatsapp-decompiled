package X;

import java.util.Collection;

/* renamed from: X.35T  reason: invalid class name */
public class AnonymousClass35T implements C23691Hg {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public AnonymousClass35T(AnonymousClass1BI r1, Collection collection, int i, boolean z) {
        this.A00 = i;
        this.A01 = collection;
        this.A02 = r1;
        this.A03 = z;
    }

    public final void CGE(Object obj) {
        if (this.A00 != 0) {
            AnonymousClass1WR r4 = (AnonymousClass1WR) obj;
            r4.Byc((AnonymousClass1BI) this.A02, (Collection) this.A01, this.A03);
            return;
        }
        ((AnonymousClass1WR) obj).Byb((AnonymousClass1BI) this.A02);
    }
}
