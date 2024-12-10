package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.83K  reason: invalid class name */
public final class AnonymousClass83K extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C134906rL $data;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C1606789m $operationCallback;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ AnonymousClass705 $requestRetryState;
    public final /* synthetic */ C144167Gg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass83K(C1606789m r2, AnonymousClass705 r3, C144167Gg r4, C134906rL r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r4;
        this.$data = r5;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$operationCallback = r2;
        this.$requestRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C122936Sm A0V = C108965cb.A0V(obj);
        C144167Gg r6 = this.this$0;
        C134906rL r7 = this.$data;
        X509Certificate x509Certificate = this.$encryptionCert;
        PublicKey publicKey = this.$passwordPublicKey;
        C21464AkV akV = new C21464AkV(this.$operationCallback, this.$requestRetryState, r6, r7, this.$passwordKeyId, publicKey, x509Certificate);
        AnonymousClass705 r62 = this.$requestRetryState;
        C1606789m r5 = this.$operationCallback;
        C144167Gg r72 = this.this$0;
        AnonymousClass839 r1 = new AnonymousClass839(r5, r62, r72, this.$data);
        X509Certificate x509Certificate2 = this.$encryptionCert;
        ((C133726pO) this.this$0.A00.get()).A01(r5, r62, A0V, akV, new C157257wd(r5, r62, r72, this.$passwordKeyId, this.$passwordPublicKey, x509Certificate2), r1);
        return C27621Wu.A00;
    }
}
