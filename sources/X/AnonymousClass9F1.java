package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.9F1  reason: invalid class name */
public final class AnonymousClass9F1 extends AnonymousClass9EV {
    public final C29621ca A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public AnonymousClass9F1(C178759Ei r11, String str, String str2, String str3, String str4) {
        C18070vi.A0d(str2, 2);
        List A0N = C18070vi.A0N("pay_on_delivery", "pix_key", new String[2], 0, 1);
        this.A02 = A0N;
        List A0n = AnonymousClass8BX.A0n(1);
        this.A03 = A0n;
        String[] strArr = new String[2];
        strArr[0] = "p2m";
        List A0O = C18070vi.A0O("p2p", strArr, 1);
        this.A01 = A0O;
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C29591cX.A01(A0Y, "xmlns", "w:pay");
        AnonymousClass8BW.A1F(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, AnonymousClass8BU.A1Z(str, 0, false) ? 1 : 0);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "create-custom-payment-method");
        C29591cX.A01(A0R, "country", "BR");
        if (AnonymousClass8BV.A1X(str2, 1, false)) {
            C29591cX.A01(A0R, "device_id", str2);
        }
        C29591cX A0t = C108945cZ.A0t("custom_payment_method");
        A0t.A09("pix_key", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0N);
        A0t.A08(str3, "update", A0n);
        A0t.A08(str4, "flow", A0O);
        A0t.A06((C29621ca) r11.A00);
        AnonymousClass8BX.A1I(A0t, A0R, A0Y);
        this.A00 = A0Y.A03();
    }
}
