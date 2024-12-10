package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.834  reason: invalid class name */
public final class AnonymousClass834 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C1606789m $callback;
    public final /* synthetic */ KeyPair $keyPair;
    public final /* synthetic */ AnonymousClass732 $userEntity;
    public final /* synthetic */ C144137Gd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass834(AnonymousClass732 r2, C1606789m r3, C144137Gd r4, KeyPair keyPair) {
        super(1);
        this.this$0 = r4;
        this.$keyPair = keyPair;
        this.$userEntity = r2;
        this.$callback = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C129006h6 r14 = (C129006h6) obj;
        if (r14 != null) {
            C144137Gd r4 = this.this$0;
            KeyPair keyPair = this.$keyPair;
            AnonymousClass732 r3 = this.$userEntity;
            C1606789m r2 = this.$callback;
            PrivateKey privateKey = keyPair.getPrivate();
            C18070vi.A0X(privateKey);
            try {
                JSONObject A0l = C108975cc.A0l(r14, (A0V) r4.A01.get(), privateKey);
                Object A00 = AnonymousClass732.A00(r3);
                C18070vi.A0X(A00);
                long A05 = C17880vN.A05(A00);
                String A01 = AnonymousClass732.A01(r3);
                r4.A02.get();
                String string = C108985cd.A0v(A0l).getString("access_token");
                long j = r3.A00;
                r2.C7I(new AnonymousClass732(r3.A01, r3.A07, A01, string, r3.A08, A05, j));
            } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
                r2.Bsw(e);
            }
        }
        return C27621Wu.A00;
    }
}
