package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.2i1  reason: invalid class name and case insensitive filesystem */
public class C56782i1 {
    public final AnonymousClass1OZ A00;

    public void A00(String str) {
        AnonymousClass1OZ r5 = this.A00;
        AnonymousClass1MD[] r3 = new AnonymousClass1MD[3];
        r3[0] = new AnonymousClass1MD((Jid) C173438v4.A00, "to");
        r3[1] = new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "result");
        C17890vO.A12(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r3);
        r5.A0O(new C29621ca("iq", r3), 305);
    }

    public C56782i1(AnonymousClass1OZ r1) {
        this.A00 = r1;
    }
}
