package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.2Mk  reason: invalid class name and case insensitive filesystem */
public final class C48422Mk extends C20083A6j {
    public final C18030ve A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48422Mk(C18030ve r2, C20285AEt aEt, C185129c4 r4) {
        super(aEt, r4);
        C18070vi.A0d(r2, 2);
        this.A00 = r2;
    }

    public C29621ca A06() {
        C29591cX r6 = new C29591cX("biz");
        C29591cX r5 = new C29591cX("interactive");
        C29591cX.A01(r5, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "native_flow");
        C29591cX.A01(r5, "v", "1");
        r5.A05(new C29621ca("native_flow", new AnonymousClass1MD[]{new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "mpm")}));
        return C29591cX.A00(r5, r6);
    }

    public Integer A09() {
        if (C18020vd.A05(C18040vf.A02, this.A00, 2909)) {
            return AnonymousClass00R.A01;
        }
        return AnonymousClass00R.A00;
    }
}
