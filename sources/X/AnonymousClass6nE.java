package X;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.6nE  reason: invalid class name */
public abstract class AnonymousClass6nE {
    public final C1607289r A00;
    public final Comparator A01 = new C147027Rn(15);
    public final C18100vl A02 = AnonymousClass1DF.A01(new C151427mH(this));
    public final AnonymousClass11P A03;

    public final List A00() {
        List<AnonymousClass8AP> A0t = C29431cG.A0t((Iterable) AnonymousClass3MX.A14(this.A02));
        ArrayList A0D = C29351c6.A0D(A0t);
        for (AnonymousClass8AP BSD : A0t) {
            A0D.add(BSD.BSD());
        }
        return A0D;
    }

    public AnonymousClass6nE(AnonymousClass11P r3, C1607289r r4) {
        this.A00 = r4;
        this.A03 = r3;
    }
}
