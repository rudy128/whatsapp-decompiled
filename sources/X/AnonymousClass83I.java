package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.83I  reason: invalid class name */
public final class AnonymousClass83I extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C1606789m $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ C144167Gg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass83I(C1606789m r2, AnonymousClass705 r3, C144167Gg r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r4;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r2;
        this.$operationRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C122936Sm A0V = C108965cb.A0V(obj);
        C144167Gg r6 = this.this$0;
        X509Certificate x509Certificate = this.$encryptionCert;
        PublicKey publicKey = this.$passwordPublicKey;
        C21472Akd akd = new C21472Akd(this.$callback, this.$operationRetryState, r6, this.$passwordKeyId, publicKey, x509Certificate);
        C133726pO r11 = (C133726pO) this.this$0.A00.get();
        AnonymousClass705 r62 = this.$operationRetryState;
        C1606789m r5 = this.$callback;
        C144167Gg r7 = this.this$0;
        C1590282y r2 = new C1590282y(r5, r62, r7);
        X509Certificate x509Certificate2 = this.$encryptionCert;
        C157247wc r4 = new C157247wc(r5, r62, r7, this.$passwordKeyId, this.$passwordPublicKey, x509Certificate2);
        C72473Md.A1I(r62, r5);
        if (C122936Sm.A00(A0V) == 304) {
            C108945cZ.A0f(r11.A02).A05(new AnonymousClass7GV(r5, A0V, r4, 1), C35021lW.A03, (AnonymousClass705) null, (String) null);
        } else {
            r11.A01(r5, r62, A0V, akd, r4, r2);
        }
        return C27621Wu.A00;
    }
}
