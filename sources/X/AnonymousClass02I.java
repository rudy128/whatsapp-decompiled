package X;

import android.view.Menu;
import android.view.MenuItem;

/* renamed from: X.02I  reason: invalid class name */
public class AnonymousClass02I implements AnonymousClass02H {
    public AnonymousClass02H A00;
    public final /* synthetic */ AnonymousClass01V A01;

    public AnonymousClass02I(AnonymousClass01V r1, AnonymousClass02H r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public boolean Bks(MenuItem menuItem, AnonymousClass02B r3) {
        return this.A00.Bks(menuItem, r3);
    }

    public boolean BqR(Menu menu, AnonymousClass02B r3) {
        return this.A00.BqR(menu, r3);
    }

    public void BrJ(AnonymousClass02B r5) {
        this.A00.BrJ(r5);
        AnonymousClass01V r3 = this.A01;
        if (r3.A07 != null) {
            r3.A06.getDecorView().removeCallbacks(r3.A0I);
        }
        if (r3.A0E != null) {
            r3.A0r();
            AnonymousClass1HC A0B = AnonymousClass1HF.A0B(r3.A0E);
            A0B.A03(0.0f);
            r3.A0G = A0B;
            A0B.A0B(new AnonymousClass0Bi(this, 1));
        }
        AnonymousClass01D r1 = r3.A0l;
        if (r1 != null) {
            r1.C81(r3.A0D);
        }
        r3.A0D = null;
        AnonymousClass1HF.A0T(r3.A05);
        r3.A0t();
    }

    public boolean C1U(Menu menu, AnonymousClass02B r3) {
        AnonymousClass1HF.A0T(this.A01.A05);
        return this.A00.C1U(menu, r3);
    }
}
