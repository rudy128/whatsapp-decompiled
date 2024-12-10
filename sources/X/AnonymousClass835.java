package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.835  reason: invalid class name */
public final class AnonymousClass835 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C1606789m $callback;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ AnonymousClass732 $userEntity;
    public final /* synthetic */ C144137Gd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass835(AnonymousClass732 r2, C1606789m r3, AnonymousClass705 r4, C144137Gd r5) {
        super(1);
        this.this$0 = r5;
        this.$userEntity = r2;
        this.$callback = r3;
        this.$operationRetryState = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C135776sk r8 = (C135776sk) obj;
        C18070vi.A0d(r8, 0);
        C144137Gd r0 = this.this$0;
        X509Certificate x509Certificate = r8.A02;
        AnonymousClass732 r1 = this.$userEntity;
        PublicKey publicKey = r8.A01;
        r0.CBe(r1, this.$callback, this.$operationRetryState, r8.A00, publicKey, x509Certificate);
        return C27621Wu.A00;
    }
}
