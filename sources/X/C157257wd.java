package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7wd  reason: invalid class name and case insensitive filesystem */
public final class C157257wd extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C1606789m $operationCallback;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ AnonymousClass705 $requestRetryState;
    public final /* synthetic */ C144167Gg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157257wd(C1606789m r2, AnonymousClass705 r3, C144167Gg r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(0);
        this.this$0 = r4;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$operationCallback = r2;
        this.$requestRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C144167Gg r0 = this.this$0;
        X509Certificate x509Certificate = this.$encryptionCert;
        PublicKey publicKey = this.$passwordPublicKey;
        r0.CBW(this.$operationCallback, this.$requestRetryState, this.$passwordKeyId, publicKey, x509Certificate);
        return C27621Wu.A00;
    }
}
