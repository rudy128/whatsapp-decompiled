package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.1Rh  reason: invalid class name and case insensitive filesystem */
public class C26221Rh {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass190 A02;

    public void A00() {
        Log.i("BroadcastXmppMethods/sendGetBroadcastLists");
        AnonymousClass00H r5 = this.A01;
        String A0B = ((AnonymousClass1OZ) r5.get()).A0B();
        ((AnonymousClass1OZ) r5.get()).A0I(new C693736y(this, 1), new C29621ca(new C29621ca("lists", (AnonymousClass1MD[]) null), "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B), new AnonymousClass1MD("xmlns", "w:b"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1MD((Jid) C173438v4.A00, "to")}), A0B, 59, 32000);
    }

    public C26221Rh(AnonymousClass190 r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }
}
