package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

/* renamed from: X.7D8  reason: invalid class name */
public final class AnonymousClass7D8 implements C1598686e {
    public final /* synthetic */ int A00;
    public final /* synthetic */ A45 A01;
    public final /* synthetic */ C1404371k A02;

    public AnonymousClass7D8(A45 a45, C1404371k r2, int i) {
        this.A02 = r2;
        this.A01 = a45;
        this.A00 = i;
    }

    public void C3p(boolean z) {
        Map A0h = C108975cc.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, C108975cc.A0h("success", Boolean.valueOf(z)));
        C1404371k r4 = this.A02;
        r4.A00.CGP(new C21365Aiu(this.A01, A0h, r4, this.A00, 6));
    }
}
