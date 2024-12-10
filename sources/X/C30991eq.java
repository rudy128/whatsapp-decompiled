package X;

import android.content.SharedPreferences;

/* renamed from: X.1eq  reason: invalid class name and case insensitive filesystem */
public final class C30991eq {
    public final C18010vc A00;
    public final C18100vl A01 = new C18110vm(new C71013Dl(this, 16));

    public C30991eq(C18010vc r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    public static final synchronized SharedPreferences.Editor A00(C30991eq r1) {
        SharedPreferences.Editor edit;
        synchronized (r1) {
            edit = A01(r1).edit();
            C18070vi.A0X(edit);
        }
        return edit;
    }

    public final synchronized long A02() {
        return A01(this).getLong("timespent_saved_start_time", 0);
    }

    public static final SharedPreferences A01(C30991eq r0) {
        Object value = r0.A01.getValue();
        C18070vi.A0X(value);
        return (SharedPreferences) value;
    }
}
