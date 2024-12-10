package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import org.json.JSONException;

/* renamed from: X.833  reason: invalid class name */
public final class AnonymousClass833 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C1606789m $callback;
    public final /* synthetic */ KeyPair $keyPair;
    public final /* synthetic */ String $password;
    public final /* synthetic */ C144137Gd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass833(C1606789m r2, C144137Gd r3, String str, KeyPair keyPair) {
        super(1);
        this.this$0 = r3;
        this.$keyPair = keyPair;
        this.$password = str;
        this.$callback = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C129006h6 r6 = (C129006h6) obj;
        if (r6 != null) {
            C144137Gd r4 = this.this$0;
            KeyPair keyPair = this.$keyPair;
            String str = this.$password;
            C1606789m r2 = this.$callback;
            PrivateKey privateKey = keyPair.getPrivate();
            C18070vi.A0X(privateKey);
            try {
                String A02 = ((A0V) r4.A01.get()).A02(r6, privateKey);
                r4.A02.get();
                r2.C7I(C137206v5.A00(C35021lW.A08, str, C17880vN.A16(A02)));
            } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
                r2.Bsw(e);
            }
        }
        return C27621Wu.A00;
    }
}
