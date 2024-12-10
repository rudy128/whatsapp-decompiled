package X;

import android.content.SharedPreferences;

/* renamed from: X.1rr  reason: invalid class name and case insensitive filesystem */
public final class C38771rr {
    public final C19830z4 A00;
    public final C18010vc A01;
    public final C18100vl A02 = new C18110vm(new C71023Dm(this, 10));

    public C38771rr(C19830z4 r3, C18010vc r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        this.A00 = r3;
        this.A01 = r4;
    }

    public static final SharedPreferences A00(C38771rr r0) {
        Object value = r0.A02.getValue();
        C18070vi.A0X(value);
        return (SharedPreferences) value;
    }
}
