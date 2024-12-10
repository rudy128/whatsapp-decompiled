package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.61a  reason: invalid class name and case insensitive filesystem */
public class C1178061a extends AnonymousClass7GM {
    public final /* synthetic */ C144157Gf A00;
    public final /* synthetic */ AnonymousClass732 A01;
    public final /* synthetic */ C1606789m A02;
    public final /* synthetic */ KeyPair A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1178061a(C144157Gf r1, AnonymousClass732 r2, C1606789m r3, C1606789m r4, KeyPair keyPair) {
        super(r3);
        this.A00 = r1;
        this.A03 = keyPair;
        this.A02 = r4;
        this.A01 = r2;
    }

    public void C7l(C134676qy r15) {
        try {
            JSONObject A0l = C108975cc.A0l(r15.A00, this.A00.A00, this.A03.getPrivate());
            C1606789m r3 = this.A02;
            AnonymousClass732 r2 = this.A01;
            long A09 = C108985cd.A09(r2.A04);
            String A012 = AnonymousClass732.A01(r2);
            String string = C108985cd.A0v(A0l).getString("access_token");
            long j = r2.A00;
            r3.C7I(new AnonymousClass732(r2.A01, r2.A07, A012, string, r2.A08, A09, j));
        } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
            this.A02.Bsw(e);
        }
    }
}
