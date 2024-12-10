package X;

import android.content.SharedPreferences;

/* renamed from: X.9kd  reason: invalid class name and case insensitive filesystem */
public class C190259kd {
    public SharedPreferences A00;
    public final C18010vc A01;

    public void A00(boolean z) {
        SharedPreferences sharedPreferences;
        synchronized (this) {
            sharedPreferences = this.A00;
            if (sharedPreferences == null) {
                sharedPreferences = this.A01.A05("com.whatsapp_br_payment_preferences");
                this.A00 = sharedPreferences;
            }
        }
        C17880vN.A1F(sharedPreferences.edit(), "br_p2m_hpp_tos_accepted", z);
    }

    public C190259kd(C18010vc r1) {
        this.A01 = r1;
    }
}
