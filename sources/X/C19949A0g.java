package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.A0g  reason: case insensitive filesystem */
public class C19949A0g {
    public final C18030ve A00;
    public final AnonymousClass00H A01;

    public void A01(AnonymousClass1O5 r8, C29621ca r9, String str, int i) {
        try {
            AnonymousClass1O5 r1 = r8;
            String str2 = str;
            if (AnonymousClass8BS.A1N(this.A00)) {
                A00(r8, str);
            } else {
                C17880vN.A0U(this.A01).A0I(r1, r9, str2, i, 32000);
            }
        } catch (AnonymousClass1UI e) {
            Log.e(e.getMessage());
        }
    }

    public void A02(AnonymousClass1O5 r8, C29621ca r9, String str, int i) {
        try {
            AnonymousClass1O5 r1 = r8;
            String str2 = str;
            if (AnonymousClass8BS.A1N(this.A00)) {
                A00(r8, str);
            } else {
                C17880vN.A0U(this.A01).A0J(r1, r9, str2, i, 32000);
            }
        } catch (AnonymousClass1UI e) {
            Log.e(e.getMessage());
        }
    }

    public C19949A0g(C18030ve r1, AnonymousClass00H r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static boolean A00(AnonymousClass1O5 r6, String str) {
        ArrayList A13 = AnonymousClass000.A13();
        C29621ca.A05("error", A13, new AnonymousClass1MD[]{new AnonymousClass1MD("code", 451), AnonymousClass8BR.A0h("text", "commerce-features-disabled")});
        AnonymousClass1MD[] r2 = new AnonymousClass1MD[1];
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "IQErrorResponse", r2, 0);
        r6.Bt9(AnonymousClass8BR.A0l("iq", r2, C17890vO.A1Y(A13, 0)), str);
        return false;
    }
}
