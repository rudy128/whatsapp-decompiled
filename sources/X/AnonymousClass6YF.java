package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.6YF  reason: invalid class name */
public abstract class AnonymousClass6YF {
    public static final C29591cX A00(String str, int i) {
        C29591cX A0Y = C108955ca.A0Y();
        C108965cb.A1H(A0Y, "smax_id", i);
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        C29591cX.A01(A0Y, "xmlns", "waffle");
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        C108995ce.A1E(A0Y);
        return A0Y;
    }
}
