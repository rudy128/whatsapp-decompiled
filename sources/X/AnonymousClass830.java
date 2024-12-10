package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.830  reason: invalid class name */
public final class AnonymousClass830 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C1606789m $callback;
    public final /* synthetic */ KeyPair $keyPair;
    public final /* synthetic */ String $password;
    public final /* synthetic */ C144147Ge this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass830(C144147Ge r2, C1606789m r3, String str, KeyPair keyPair) {
        super(1);
        this.$keyPair = keyPair;
        this.this$0 = r2;
        this.$password = str;
        this.$callback = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C129006h6 r7 = (C129006h6) obj;
        if (r7 != null) {
            KeyPair keyPair = this.$keyPair;
            C144147Ge r0 = this.this$0;
            String str = this.$password;
            C1606789m r4 = this.$callback;
            if (keyPair != null) {
                C138406x1 r2 = r0.A00;
                PrivateKey privateKey = keyPair.getPrivate();
                C18070vi.A0X(privateKey);
                C18070vi.A0k(str, r4);
                try {
                    String A02 = ((A0V) r2.A01.get()).A02(r7, privateKey);
                    r2.A02.get();
                    JSONObject A16 = C17880vN.A16(A02);
                    r2.A00.get();
                    r4.C7I(C137206v5.A00(new C35021lW("shops", true), str, A16));
                } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
                    r4.Bsw(e);
                }
            }
        }
        return C27621Wu.A00;
    }
}
