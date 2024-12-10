package X;

import android.content.SharedPreferences;

/* renamed from: X.1UZ  reason: invalid class name */
public final class AnonymousClass1UZ {
    public final C18010vc A00;
    public final C18100vl A01 = new C18110vm(new C71023Dm(this, 41));

    public AnonymousClass1UZ(C18010vc r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    public final void A00(boolean z) {
        Object value = this.A01.getValue();
        C18070vi.A0X(value);
        ((SharedPreferences) value).edit().putBoolean("restoration_registration_complete_logging_sent", z).apply();
    }
}
