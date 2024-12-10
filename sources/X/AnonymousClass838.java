package X;

import java.security.KeyPair;
import java.security.PrivateKey;

/* renamed from: X.838  reason: invalid class name */
public final class AnonymousClass838 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ KeyPair $keyPair;
    public final /* synthetic */ C1606789m $operationCallback;
    public final /* synthetic */ String $password;
    public final /* synthetic */ C144167Gg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass838(C1606789m r2, C144167Gg r3, String str, KeyPair keyPair) {
        super(1);
        this.this$0 = r3;
        this.$keyPair = keyPair;
        this.$password = str;
        this.$operationCallback = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C29621ca r5 = (C29621ca) obj;
        C18070vi.A0d(r5, 0);
        C144167Gg r3 = this.this$0;
        PrivateKey privateKey = this.$keyPair.getPrivate();
        C18070vi.A0X(privateKey);
        C144167Gg.A00(this.$operationCallback, r3, r5, this.$password, privateKey);
        return C27621Wu.A00;
    }
}
