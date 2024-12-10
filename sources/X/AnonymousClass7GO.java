package X;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7GO  reason: invalid class name */
public final class AnonymousClass7GO implements C72373Lr {
    public final /* synthetic */ C34891lF A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ PrivateKey A02;
    public final /* synthetic */ C31761g5 A03;

    public void Bsu(C122936Sm r3) {
        C18070vi.A0d(r3, 0);
        this.A03.resumeWith(AnonymousClass6OB.A00(r3));
    }

    public void C7l(C134676qy r4) {
        PrivateKey privateKey;
        C18070vi.A0d(r4, 0);
        JSONObject jSONObject = null;
        try {
            if (!(this.A01 == null || (privateKey = this.A02) == null)) {
                jSONObject = C108975cc.A0l(r4.A00, (A0V) this.A00.A04.get(), privateKey);
            }
            this.A03.resumeWith(new AnonymousClass6OA(AnonymousClass1D6.A01(jSONObject, r4.A01)));
        } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
            this.A03.resumeWith(AnonymousClass6OB.A00(e));
        }
    }

    public AnonymousClass7GO(C34891lF r1, Object obj, PrivateKey privateKey, C31761g5 r4) {
        this.A01 = obj;
        this.A02 = privateKey;
        this.A00 = r1;
        this.A03 = r4;
    }

    public void BrA() {
        this.A03.resumeWith(new AnonymousClass6OB(new IOException(), true));
    }
}
