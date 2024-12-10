package X;

import android.content.SharedPreferences;

/* renamed from: X.6mJ  reason: invalid class name and case insensitive filesystem */
public final class C132166mJ {
    public final SharedPreferences A00;
    public final String A01;

    public C132166mJ(SharedPreferences sharedPreferences, String str) {
        C18070vi.A0d(sharedPreferences, 1);
        this.A00 = sharedPreferences;
        this.A01 = str;
    }

    public final void A00(long j) {
        SharedPreferences sharedPreferences = this.A00;
        String str = this.A01;
        C17880vN.A1D(sharedPreferences.edit(), str, C17890vO.A05(sharedPreferences, str) + j);
    }
}
