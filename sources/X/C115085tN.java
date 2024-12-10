package X;

import android.view.Menu;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5tN  reason: invalid class name and case insensitive filesystem */
public abstract class C115085tN extends C23701Hh implements C108185bH {
    public final C18000vb A00;

    public boolean C1Y(Menu menu) {
        return false;
    }

    public void A01(AnonymousClass86V r7, AnonymousClass86W r8) {
        if (this instanceof AnonymousClass6Nv) {
            AnonymousClass6Nv r2 = (AnonymousClass6Nv) this;
            r2.A00 = new C126766dG(r8.BM2());
            AnonymousClass6Nv.A00(r2);
        } else if (this instanceof AnonymousClass6Nu) {
            AnonymousClass6Nu r22 = (AnonymousClass6Nu) this;
            r22.A01 = new C129406hk(r8.BM2().A09(40)).A02;
            r22.A00 = r7;
        } else {
            AnonymousClass6Nt r5 = (AnonymousClass6Nt) this;
            List<Object> A0F = r8.BM2().A0F(45);
            ArrayList A13 = AnonymousClass000.A13();
            for (Object r23 : A0F) {
                A13.add(new C143147Ce(r23, 0));
            }
            r5.A01 = A13;
        }
    }

    public C115085tN(C18000vb r1) {
        this.A00 = r1;
    }
}
