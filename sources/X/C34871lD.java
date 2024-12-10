package X;

import android.content.SharedPreferences;

/* renamed from: X.1lD  reason: invalid class name and case insensitive filesystem */
public final class C34871lD {
    public final AnonymousClass11P A00;
    public final C18010vc A01;
    public final C18100vl A02 = new C18110vm(new C71013Dl(this, 20));

    public C34871lD(AnonymousClass11P r3, C18010vc r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        this.A00 = r3;
        this.A01 = r4;
    }

    public final void A00(long j) {
        Object value = this.A02.getValue();
        C18070vi.A0X(value);
        ((SharedPreferences) value).edit().putLong("pref_ping_validity_time", (AnonymousClass11P.A01(this.A00) / 1000) + j).apply();
    }
}
