package X;

import android.content.SharedPreferences;

/* renamed from: X.1WC  reason: invalid class name */
public final class AnonymousClass1WC {
    public final C18010vc A00;
    public final C18100vl A01 = new C18110vm(new C71013Dl(this, 8));

    public AnonymousClass1WC(C18010vc r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    public static final synchronized SharedPreferences.Editor A00(AnonymousClass1WC r1) {
        SharedPreferences.Editor edit;
        synchronized (r1) {
            Object value = r1.A01.getValue();
            C18070vi.A0X(value);
            edit = ((SharedPreferences) value).edit();
            C18070vi.A0X(edit);
        }
        return edit;
    }

    public final void A01(String str) {
        C18070vi.A0d(str, 0);
        A00(this).remove(str).apply();
    }
}
