package X;

import android.content.SharedPreferences;

/* renamed from: X.1Si  reason: invalid class name and case insensitive filesystem */
public final class C26491Si extends AnonymousClass17A {
    public final C18030ve A00;
    public final C26481Sh A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26491Si(C18030ve r2, C26481Sh r3, AnonymousClass00H r4) {
        super(r4, false);
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final boolean A00() {
        if (!C18020vd.A05(C18040vf.A02, this.A00, 9370) || !((SharedPreferences) this.A01.A01.getValue()).getBoolean("traffanon_enabled", false)) {
            return false;
        }
        return true;
    }
}
