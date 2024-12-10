package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5tm  reason: invalid class name and case insensitive filesystem */
public final class C115315tm extends AnonymousClass7GL {
    public final /* synthetic */ C144147Ge A00;
    public final /* synthetic */ AnonymousClass732 A01;
    public final /* synthetic */ C1606789m A02;
    public final /* synthetic */ KeyPair A03;

    public void C7l(C134676qy r14) {
        C18070vi.A0d(r14, 0);
        try {
            C144147Ge r4 = this.A00;
            PrivateKey privateKey = this.A03.getPrivate();
            JSONObject A0l = C108975cc.A0l(r14.A00, (A0V) r4.A02.get(), privateKey);
            C1606789m r2 = this.A02;
            AnonymousClass732 r3 = this.A01;
            Object A002 = AnonymousClass732.A00(r3);
            C18070vi.A0X(A002);
            long A05 = C17880vN.A05(A002);
            String A012 = AnonymousClass732.A01(r3);
            r4.A03.get();
            String string = C108985cd.A0v(A0l).getString("access_token");
            long j = r3.A00;
            r2.C7I(new AnonymousClass732(r3.A01, r3.A07, A012, string, r3.A08, A05, j));
        } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
            this.A02.Bsw(e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C115315tm(C144147Ge r1, AnonymousClass732 r2, C1606789m r3, KeyPair keyPair) {
        super(r3);
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = keyPair;
        this.A01 = r2;
    }
}
