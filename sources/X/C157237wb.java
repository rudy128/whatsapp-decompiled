package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7wb  reason: invalid class name and case insensitive filesystem */
public final class C157237wb extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C1606789m $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ C144137Gd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157237wb(C1606789m r2, AnonymousClass705 r3, C144137Gd r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(0);
        this.this$0 = r4;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r2;
        this.$operationRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C144137Gd r0 = this.this$0;
        X509Certificate x509Certificate = this.$encryptionCert;
        PublicKey publicKey = this.$passwordPublicKey;
        r0.CBW(this.$callback, this.$operationRetryState, this.$passwordKeyId, publicKey, x509Certificate);
        return C27621Wu.A00;
    }
}
