package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.7LU  reason: invalid class name */
public class AnonymousClass7LU implements AnonymousClass1O5 {
    public final AnonymousClass1KB A00;
    public final AnonymousClass1OZ A01;
    public final C1602087o A02;

    private void A00(int i) {
        this.A00.CGP(new C146517Pk(this, new C129806iO((UserJid) null, (String) null, (String) null, -1, i), 25));
    }

    public void BrD(String str) {
        Log.e("sendScanContactQr/delivery-error");
        A00(408);
    }

    public void Bt9(C29621ca r2, String str) {
        Log.e("sendScanContactQr/response-error");
        A00(C60482o6.A00(r2));
    }

    public void C7Z(C29621ca r10, String str) {
        String str2;
        int i;
        C29621ca A0K = r10.A0K("qr");
        if (A0K != null) {
            String A0Q = A0K.A0Q("jid", (String) null);
            String A0Q2 = A0K.A0Q("notify", (String) null);
            UserJid A022 = C22941Dw.A02(A0Q);
            if (A022 == null) {
                str2 = "sendScanContactQr/error: invalid jid";
            } else {
                String A0Q3 = A0K.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
                String str3 = null;
                if ("contact".equals(A0Q3)) {
                    i = 0;
                } else if ("subscribe".equals(A0Q3)) {
                    i = 1;
                } else if ("message".equals(A0Q3)) {
                    C29621ca A0K2 = A0K.A0K("message");
                    if (A0K2 != null) {
                        str3 = A0K2.A0M();
                    }
                    i = 2;
                } else {
                    str2 = AnonymousClass001.A1H("sendScanContactQr/error: invalid type ", A0Q3, AnonymousClass000.A10());
                }
                Log.e("sendScanContactQr/success");
                this.A00.CGP(new C146517Pk(this, new C129806iO(A022, A0Q2, str3, i, 0), 25));
                return;
            }
        } else {
            str2 = "sendScanContactQr/error: missing node";
        }
        Log.e(str2);
        A00(0);
    }

    public AnonymousClass7LU(AnonymousClass1KB r1, AnonymousClass1OZ r2, C1602087o r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
