package X;

import android.content.SharedPreferences;

/* renamed from: X.Cir  reason: case insensitive filesystem */
public final class C25611Cir {
    public SharedPreferences A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C27787Dl7(this));
    public final C18100vl A02 = AnonymousClass1DF.A01(new C27788Dl8(this));
    public final C18100vl A03 = AnonymousClass1DF.A01(new C27789Dl9(this));
    public final C18100vl A04 = AnonymousClass1DF.A01(new C27790DlA(this));
    public final C18100vl A05 = AnonymousClass1DF.A01(new C27791DlB(this));
    public final C18100vl A06 = AnonymousClass1DF.A01(new C27792DlC(this));
    public final C18010vc A07;

    public C25611Cir(C18010vc r2) {
        C18070vi.A0d(r2, 1);
        this.A07 = r2;
    }

    public static final synchronized SharedPreferences A00(C25611Cir cir) {
        SharedPreferences sharedPreferences;
        synchronized (cir) {
            sharedPreferences = cir.A00;
            if (sharedPreferences == null) {
                sharedPreferences = cir.A07.A05("waffle_crossposting_prefs");
                cir.A00 = sharedPreferences;
            }
            if (sharedPreferences == null) {
                throw C17880vN.A0g();
            }
        }
        return sharedPreferences;
    }
}
