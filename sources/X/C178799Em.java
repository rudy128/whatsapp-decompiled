package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.9Em  reason: invalid class name and case insensitive filesystem */
public class C178799Em extends C178869Et implements C22469B9b {
    public final Object A00;

    public C29621ca BVP() {
        return (C29621ca) this.A00;
    }

    public C178799Em(int i) {
        String str;
        C29591cX A0S = AnonymousClass8BS.A0S();
        if (i != 0) {
            str = "text";
        } else {
            str = "media";
        }
        C29591cX.A01(A0S, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        this.A00 = A0S.A03();
    }
}
