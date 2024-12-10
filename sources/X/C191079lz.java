package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.9lz  reason: invalid class name and case insensitive filesystem */
public class C191079lz {
    public AnonymousClass1KB A00;
    public AnonymousClass1QD A01;
    public C31061ex A02;
    public AnonymousClass00H A03;

    public void A00(Context context) {
        String A06 = this.A02.A06();
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, "xmlns", "w:pay");
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        AnonymousClass8BY.A18(A0Y, A06, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "get-is-account-recoverable");
        C29621ca A002 = C29591cX.A00(A0R, A0Y);
        C31061ex r6 = this.A02;
        AnonymousClass1KB r3 = this.A00;
        Context context2 = context;
        r6.A0H(new C175408yf(context2, AnonymousClass8BR.A0a(this.A03), r3, this, 4), A002, A06, 0);
    }
}
