package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.61Z  reason: invalid class name */
public class AnonymousClass61Z extends AnonymousClass7GM {
    public final /* synthetic */ C144157Gf A00;
    public final /* synthetic */ C1606789m A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ KeyPair A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61Z(C144157Gf r1, C1606789m r2, C1606789m r3, String str, KeyPair keyPair) {
        super(r2);
        this.A00 = r1;
        this.A03 = keyPair;
        this.A02 = str;
        this.A01 = r3;
    }

    public void C7l(C134676qy r5) {
        try {
            C144157Gf r3 = this.A00;
            JSONObject A0l = C108975cc.A0l(r5.A00, r3.A00, this.A03.getPrivate());
            this.A01.C7I(C137206v5.A00(r3.A01, this.A02, A0l));
        } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
            this.A01.Bsw(e);
        }
    }
}
