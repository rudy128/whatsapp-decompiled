package X;

import android.content.SharedPreferences;

/* renamed from: X.1VB  reason: invalid class name */
public final class AnonymousClass1VB {
    public final AnonymousClass1VA A00;
    public final AnonymousClass1KB A01;
    public final C19830z4 A02;

    public AnonymousClass1VB(AnonymousClass1KB r2, C19830z4 r3, AnonymousClass1VA r4) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r4;
    }

    public final void A00() {
        C19830z4 r3 = this.A02;
        C17960vV.A0F(((SharedPreferences) r3.A00.get()).getBoolean("TOwmL_is_active", false), "Making visible despite not being active");
        C19830z4.A00(r3).putBoolean("TOwmL_is_visible", true).apply();
        this.A01.A0J(new AnonymousClass7RB((Object) this, 49));
    }
}
