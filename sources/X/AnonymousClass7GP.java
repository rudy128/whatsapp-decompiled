package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7GP  reason: invalid class name */
public final class AnonymousClass7GP implements C72373Lr {
    public final /* synthetic */ C1606789m A00;
    public final /* synthetic */ AnonymousClass89Y A01;
    public final /* synthetic */ C35081lc A02;
    public final /* synthetic */ Object A03;
    public final /* synthetic */ PrivateKey A04;

    public void Bsu(C122936Sm r2) {
        C18070vi.A0d(r2, 0);
        this.A01.Bsu(r2);
    }

    public void C7l(C134676qy r4) {
        JSONObject jSONObject;
        PrivateKey privateKey;
        C18070vi.A0d(r4, 0);
        try {
            if (this.A03 == null || (privateKey = this.A04) == null) {
                jSONObject = null;
            } else {
                jSONObject = C108975cc.A0l(r4.A00, (A0V) this.A02.A04.get(), privateKey);
            }
            this.A01.C7b(r4.A01, jSONObject);
        } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
            this.A00.Bsw(e);
        }
    }

    public AnonymousClass7GP(C1606789m r1, AnonymousClass89Y r2, C35081lc r3, Object obj, PrivateKey privateKey) {
        this.A03 = obj;
        this.A04 = privateKey;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BrA() {
        this.A00.BrA();
    }
}
