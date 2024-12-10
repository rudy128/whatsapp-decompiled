package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;

public final class A5x {
    public static final A5x A00 = new Object();

    public static final AnonymousClass9DG A00(C29621ca r21, C29621ca r22, C62672rm r23) {
        C29621ca r12 = r21;
        C62672rm r3 = r23;
        if (!r3.A09(r12, "iq")) {
            return null;
        }
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Class<String> cls = String.class;
        String[] strArr2 = new String[1];
        Long A0Z = AnonymousClass8BW.A0Z(PublicKeyCredentialControllerUtility.JSON_KEY_ID, strArr2, 0);
        Long A0j = AnonymousClass8BU.A0j();
        C29621ca r4 = r22;
        Object A05 = r3.A05(r4, cls, A0Z, A0j, (Object) null, strArr2, false);
        if (A05 == null) {
            return null;
        }
        C62672rm r11 = r3;
        String str = (String) r11.A05(r12, cls, A0Z, A0j, A05, strArr, true);
        if (str == null) {
            return null;
        }
        String[] A1Z = AnonymousClass8BS.A1Z(1, 0);
        Class<Jid> cls2 = Jid.class;
        Object A052 = r3.A05(r4, cls2, A0Z, A0j, (Object) null, AnonymousClass8BS.A1X(1, 0), false);
        if (A052 == null) {
            return null;
        }
        Jid jid = (Jid) r3.A05(r12, cls2, A0Z, A0j, A052, A1Z, true);
        if (jid == null) {
            return null;
        }
        String str2 = (String) r11.A05(r12, cls, A0Z, A0j, "result", AnonymousClass8BS.A1a(1, 0), false);
        if (str2 == null) {
            return null;
        }
        return new AnonymousClass9DG(jid, r12, str, str2, 15);
    }

    public static final AnonymousClass9DD A01(C29621ca r20, C62672rm r21) {
        ArrayList A08;
        C29621ca A0m;
        Class<String> cls = String.class;
        Long A0X = C108975cc.A0X();
        Long A0f = AnonymousClass8BV.A0f();
        C29621ca r7 = r20;
        C62672rm r6 = r21;
        String str = (String) r6.A05(r7, cls, A0X, A0f, (Object) null, new String[]{"money", "value"}, false);
        if (str == null) {
            return null;
        }
        String str2 = (String) r6.A05(r7, cls, A0X, A0f, (Object) null, new String[]{"money", "offset"}, false);
        if (str2 == null) {
            return null;
        }
        String str3 = (String) r6.A05(r7, cls, A0X, A0f, (Object) null, new String[]{"money", "currency"}, false);
        if (str3 == null || (A08 = r6.A08(r7, new C21287AhY(0), new String[]{"money"}, 1, 1)) == null || (A0m = AnonymousClass8BR.A0m(A08, 0)) == null) {
            return null;
        }
        return new AnonymousClass9DD(A0m, r7, str, str2, str3);
    }
}
