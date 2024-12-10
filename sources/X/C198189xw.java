package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;

/* renamed from: X.9xw  reason: invalid class name and case insensitive filesystem */
public final class C198189xw {
    public boolean A00 = true;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public C198189xw(AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0e(r2, 1, r3);
        this.A01 = r2;
        this.A02 = r3;
    }

    public static final void A00(C198189xw r7, String str, String str2) {
        SharedPreferences A0C = C108955ca.A0C((C18010vc) r7.A02.get(), "register_phone_prefs");
        String string = A0C.getString("com.whatsapp.registration.RegisterPhone.country_code", (String) null);
        String string2 = A0C.getString("com.whatsapp.registration.RegisterPhone.phone_number", (String) null);
        if (string == null || string.length() == 0 || string2 == null || string2.length() == 0) {
            Log.e("AccountTransferLoggingManager/logEligibilityCheck/countryCode and/or phone number empty, skipping logging");
            return;
        }
        A8V A0q = AnonymousClass8BR.A0q(r7.A01);
        if (C72453Mb.A1a(A0q.A07)) {
            C192119np A002 = A8V.A00(A0q);
            A002.A01("event_name", str);
            A8V.A06(A0q, "account_transfer_eligibility_check", str2, string, string2, A002.A00);
        }
    }
}
