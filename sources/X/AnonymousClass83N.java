package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.83N  reason: invalid class name */
public final class AnonymousClass83N extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C1606789m $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ String $userDeleteReason;
    public final /* synthetic */ AnonymousClass732 $userEntity;
    public final /* synthetic */ C144167Gg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass83N(AnonymousClass732 r2, C1606789m r3, AnonymousClass705 r4, C144167Gg r5, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r5;
        this.$encryptionCert = x509Certificate;
        this.$userEntity = r2;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r3;
        this.$operationRetryState = r4;
        this.$userDeleteReason = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C122936Sm A0V = C108965cb.A0V(obj);
        C144167Gg r5 = this.this$0;
        X509Certificate x509Certificate = this.$encryptionCert;
        AnonymousClass732 r2 = this.$userEntity;
        PublicKey publicKey = this.$passwordPublicKey;
        AnonymousClass7RG r1 = new AnonymousClass7RG(r2, this.$callback, this.$operationRetryState, r5, this.$passwordKeyId, this.$userDeleteReason, publicKey, x509Certificate);
        int A00 = C122936Sm.A00(A0V);
        ((C133726pO) this.this$0.A00.get()).A00(this.$callback, this.$operationRetryState, A0V, r1, A00);
        return C27621Wu.A00;
    }
}
