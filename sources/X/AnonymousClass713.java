package X;

import android.content.SharedPreferences;

/* renamed from: X.713  reason: invalid class name */
public final class AnonymousClass713 {
    public final C18100vl A00;

    public AnonymousClass713(C18010vc r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = AnonymousClass7S4.A02(r2, 26);
    }

    public static final SharedPreferences A00(AnonymousClass713 r0) {
        return C18070vi.A03(r0.A00);
    }

    public static SharedPreferences A01(AnonymousClass00H r0) {
        return A00((AnonymousClass713) r0.get());
    }
}
