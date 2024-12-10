package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.37C  reason: invalid class name */
public class AnonymousClass37C implements AnonymousClass1O5 {
    public final AnonymousClass1OZ A00;

    public void A00(String str, String str2) {
        AnonymousClass1OZ r7 = this.A00;
        String A0B = r7.A0B();
        byte[] bytes = str.getBytes();
        C18070vi.A0d(bytes, 2);
        String[] strArr = new String[2];
        strArr[0] = "false";
        List A0O = C18070vi.A0O("true", strArr, 1);
        C29591cX r3 = new C29591cX("iq");
        C29591cX.A01(r3, "xmlns", "md");
        r3.A04(new AnonymousClass1MD((Jid) C173438v4.A00, "to"));
        C29591cX.A01(r3, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        if (C29601cY.A04(A0B, 0, 9007199254740991L, false)) {
            C29591cX.A01(r3, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B);
        }
        C29591cX r5 = new C29591cX("link_code_companion_reg");
        C29591cX.A01(r5, "stage", "refresh_code");
        r5.A08(str2, "force_manual_refresh", A0O);
        C29591cX r2 = new C29591cX("link_code_pairing_ref");
        C29601cY.A02(bytes, -9007199254740991L, 9007199254740991L);
        r2.A01 = bytes;
        r3.A05(C29591cX.A00(r2, r5));
        r7.A0I(this, r3.A03(), A0B, 372, 120000);
    }

    public void BrD(String str) {
        Log.w("LinkCodeRefreshCodeProtocolHelper/sendRefreshCodeIq onDeliveryFailure");
    }

    public void C7Z(C29621ca r1, String str) {
    }

    public AnonymousClass37C(AnonymousClass1OZ r1) {
        this.A00 = r1;
    }

    public void Bt9(C29621ca r4, String str) {
        String str2;
        Pair A01 = C60482o6.A01(r4);
        if (A01 != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("LinkCodeRefreshCodeProtocolHelper/sendRefreshCodeIq error code=");
            A10.append(A01.first);
            A10.append("; text=");
            str2 = AnonymousClass000.A0y((String) A01.second, A10);
        } else {
            str2 = "LinkCodeRefreshCodeProtocolHelper/sendRefreshCodeIq unknown code";
        }
        Log.e(str2);
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
