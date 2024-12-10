package X;

import android.content.SharedPreferences;

/* renamed from: X.0IN  reason: invalid class name */
public class AnonymousClass0IN {
    public SharedPreferences A00;
    public final C18030ve A01;
    public final C18010vc A02;

    public synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A05("com.whatsapp_business_api");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public AnonymousClass0IN(C18030ve r1, C18010vc r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
