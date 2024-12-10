package X;

import android.content.SharedPreferences;

/* renamed from: X.6wT  reason: invalid class name and case insensitive filesystem */
public final class C138066wT {
    public final C18010vc A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C155017s4(this));

    public C138066wT(C18010vc r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static SharedPreferences.Editor A00(AnonymousClass00H r0) {
        return ((SharedPreferences) ((C138066wT) r0.get()).A01.getValue()).edit();
    }
}
