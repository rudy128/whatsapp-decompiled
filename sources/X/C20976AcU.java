package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.AcU  reason: case insensitive filesystem */
public class C20976AcU implements AnonymousClass1O5 {
    public final AnonymousClass1KB A00;
    public final AnonymousClass1OZ A01;
    public final C186239ds A02;

    public void BrD(String str) {
        Log.e("sendGetContactQrCode/delivery-error");
        this.A00.CGP(new C21454AkL(this, (String) null, 0, 11));
    }

    public void Bt9(C29621ca r6, String str) {
        Log.e("sendGetContactQrCode/response-error");
        this.A00.CGP(new C21454AkL(this, (String) null, C60482o6.A00(r6), 11));
    }

    public void C7Z(C29621ca r6, String str) {
        String str2;
        String str3;
        C29621ca A0K = r6.A0K("qr");
        if (A0K == null || !"contact".equals(A0K.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null))) {
            str2 = null;
            str3 = "sendGetContactQrCode/error: invalid response";
        } else {
            str2 = A0K.A0Q("code", (String) null);
            if (str2 != null) {
                str3 = "sendGetContactQrCode/success";
            }
            str3 = "sendGetContactQrCode/error: invalid response";
        }
        Log.e(str3);
        this.A00.CGP(new C21454AkL(this, str2, 0, 11));
    }

    public C20976AcU(AnonymousClass1KB r1, AnonymousClass1OZ r2, C186239ds r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
