package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public abstract class AS1 implements C72183Ky {
    public final int A00;
    public final AnonymousClass190 A01;
    public final String A02;
    public final AnonymousClass1OZ A03;

    public void A00(C29621ca r1) {
    }

    public abstract void A01(C29591cX r1);

    public final void BKz(C22542BBz bBz) {
        AnonymousClass1OZ r3 = this.A03;
        String A0B = r3.A0B();
        C29591cX A0Y = C108955ca.A0Y();
        C108965cb.A1H(A0Y, "smax_id", this.A00);
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B);
        AnonymousClass8BY.A16(A0Y, this.A02);
        C29591cX.A01(A0Y, "to", "s.whatsapp.net");
        A01(A0Y);
        r3.A0N(new C20996Aco(bBz, this, 8), A0Y.A03(), A0B, 264, 32000);
    }

    public AS1(AnonymousClass190 r1, AnonymousClass1OZ r2, String str, int i) {
        this.A01 = r1;
        this.A03 = r2;
        this.A00 = i;
        this.A02 = str;
    }
}
