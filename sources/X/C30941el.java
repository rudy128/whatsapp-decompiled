package X;

import android.content.SharedPreferences;
import java.util.Collections;

/* renamed from: X.1el  reason: invalid class name and case insensitive filesystem */
public class C30941el {
    public SharedPreferences A00;
    public final C18010vc A01;

    public void A00(C53692cw r4, String str) {
        SharedPreferences sharedPreferences;
        synchronized (this) {
            sharedPreferences = this.A00;
            if (sharedPreferences == null) {
                sharedPreferences = this.A01.A05("com.whatsapp_payment_sync_preferences");
                this.A00 = sharedPreferences;
            }
        }
        sharedPreferences.edit().putString(r4.A01.A00(), str).apply();
        for (C53692cw A002 : Collections.unmodifiableList(r4.A00)) {
            A00(A002, str);
        }
    }

    public C30941el(C18010vc r1) {
        this.A01 = r1;
    }
}
