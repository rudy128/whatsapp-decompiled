package X;

import android.content.SharedPreferences;

/* renamed from: X.9kR  reason: invalid class name and case insensitive filesystem */
public abstract class C190139kR {
    public SharedPreferences A00;
    public final C18010vc A01;

    public SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        boolean z = this instanceof AnonymousClass2KW;
        synchronized (this) {
            if (z) {
                sharedPreferences = this.A00;
                if (sharedPreferences == null) {
                    sharedPreferences = this.A01.A05("com.whatsapp_business_directory");
                    this.A00 = sharedPreferences;
                }
            } else {
                sharedPreferences = this.A00;
                if (sharedPreferences == null) {
                    sharedPreferences = this.A01.A05("com.whatsapp_business_search");
                    this.A00 = sharedPreferences;
                }
            }
            C18070vi.A0W(sharedPreferences);
        }
        return sharedPreferences;
    }

    public C190139kR(C18010vc r1) {
        this.A01 = r1;
    }
}
