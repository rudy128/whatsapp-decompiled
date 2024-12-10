package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.37g  reason: invalid class name and case insensitive filesystem */
public class C694537g implements BDP {
    public final C33841jT A00;

    public void BcI(C195319t9 r4, String str, Map map) {
        C33841jT r1 = this.A00;
        String A0s = C17880vN.A0s("registration_code", map);
        Log.i("RegistrationManager/handleRegistrationVerificationNotification");
        if (A0s == null) {
            Log.i("RegistrationManager/handleRegistrationVerificationNotification/registrationCode is null");
        } else {
            C17880vN.A1E(C19830z4.A00(r1.A0C), "registration_push_notif_code", A0s);
        }
    }

    public boolean CLz(C180619Ng r2, Long l, String str) {
        return "RegistrationVerification".equalsIgnoreCase(str);
    }

    public C694537g(C33841jT r1) {
        this.A00 = r1;
    }
}
