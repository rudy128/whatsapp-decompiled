package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.83L  reason: invalid class name */
public final class AnonymousClass83L extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C1606789m $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ AnonymousClass732 $userEntity;
    public final /* synthetic */ C144167Gg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass83L(AnonymousClass732 r2, C1606789m r3, AnonymousClass705 r4, C144167Gg r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r5;
        this.$encryptionCert = x509Certificate;
        this.$userEntity = r2;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r3;
        this.$operationRetryState = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C122936Sm A0V = C108965cb.A0V(obj);
        C144167Gg r7 = this.this$0;
        X509Certificate x509Certificate = this.$encryptionCert;
        AnonymousClass732 r4 = this.$userEntity;
        PublicKey publicKey = this.$passwordPublicKey;
        C21464AkV akV = new C21464AkV(r4, this.$callback, this.$operationRetryState, r7, this.$passwordKeyId, publicKey, x509Certificate);
        AnonymousClass705 r6 = this.$operationRetryState;
        C1606789m r5 = this.$callback;
        C144167Gg r72 = this.this$0;
        AnonymousClass83B r1 = new AnonymousClass83B(this.$userEntity, r5, r6, r72);
        X509Certificate x509Certificate2 = this.$encryptionCert;
        ((C133726pO) this.this$0.A00.get()).A01(r5, r6, A0V, akV, new C157267we(r5, r6, r72, this.$passwordKeyId, this.$passwordPublicKey, x509Certificate2), r1);
        return C27621Wu.A00;
    }
}
