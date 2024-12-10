package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.839  reason: invalid class name */
public final class AnonymousClass839 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C134906rL $data;
    public final /* synthetic */ C1606789m $operationCallback;
    public final /* synthetic */ AnonymousClass705 $requestRetryState;
    public final /* synthetic */ C144167Gg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass839(C1606789m r2, AnonymousClass705 r3, C144167Gg r4, C134906rL r5) {
        super(1);
        this.this$0 = r4;
        this.$data = r5;
        this.$operationCallback = r2;
        this.$requestRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C135866st r8 = (C135866st) obj;
        C18070vi.A0d(r8, 0);
        C144167Gg r0 = this.this$0;
        C134906rL r3 = this.$data;
        X509Certificate x509Certificate = r8.A02;
        PublicKey publicKey = r8.A01;
        r0.CBY(this.$operationCallback, this.$requestRetryState, r3, r8.A00, publicKey, x509Certificate);
        return C27621Wu.A00;
    }
}
