package X;

import android.content.SharedPreferences;

/* renamed from: X.1Og  reason: invalid class name and case insensitive filesystem */
public final class C25451Og {
    public final C18010vc A00;
    public final C18100vl A01 = new C18110vm(new C71023Dm(this, 3));

    public C25451Og(C18010vc r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    public static final SharedPreferences A00(C25451Og r0) {
        Object value = r0.A01.getValue();
        C18070vi.A0X(value);
        return (SharedPreferences) value;
    }
}
