package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.7LV  reason: invalid class name */
public class AnonymousClass7LV implements AnonymousClass1O5 {
    public final AnonymousClass1OZ A00;
    public final C1602087o A01;
    public final C24521Kq A02;
    public final C18030ve A03;

    private void A00(int i) {
        this.A01.C3h(new C129806iO((UserJid) null, (String) null, (String) null, -1, i));
    }

    public void BrD(String str) {
        Log.e("GetUserByCustomUrlProtocol/onDeliveryFailure");
        A00(408);
    }

    public void Bt9(C29621ca r2, String str) {
        Log.e("GetUserByCustomUrlProtocol/onError");
        A00(C60482o6.A00(r2));
    }

    public void C7Z(C29621ca r9, String str) {
        UserJid A022;
        Log.e("GetUserByCustomUrlProtocol/onSuccess");
        C29621ca A0K = r9.A0K(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        if (A0K == null || (A022 = C22941Dw.A02(A0K.A0Q("jid", (String) null))) == null) {
            A00(0);
            return;
        }
        this.A01.C3h(new C129806iO(A022, (String) null, (String) null, C72453Mb.A05(C18020vd.A05(C18040vf.A02, this.A03, 1849) ? 1 : 0), 0));
    }

    public AnonymousClass7LV(C24521Kq r1, C18030ve r2, AnonymousClass1OZ r3, C1602087o r4) {
        this.A03 = r2;
        this.A00 = r3;
        this.A02 = r1;
        this.A01 = r4;
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
