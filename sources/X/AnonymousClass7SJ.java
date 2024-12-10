package X;

import com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$errorResult$1$1$1;
import java.security.cert.X509Certificate;

/* renamed from: X.7SJ  reason: invalid class name */
public final class AnonymousClass7SJ implements C18090vk {
    public final /* synthetic */ AnonymousClass705 A00;
    public final /* synthetic */ C1418477e A01;
    public final /* synthetic */ C1418477e A02;
    public final /* synthetic */ C34891lF A03;
    public final /* synthetic */ X509Certificate A04;

    public AnonymousClass7SJ(AnonymousClass705 r1, C1418477e r2, C1418477e r3, C34891lF r4, X509Certificate x509Certificate) {
        this.A03 = r4;
        this.A02 = r2;
        this.A01 = r3;
        this.A04 = x509Certificate;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C34891lF r5 = this.A03;
        return AnonymousClass4GT.A00(AnonymousClass1OR.A00, new AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$errorResult$1$1$1(this.A00, this.A02, this.A01, r5, this.A04, (C30391dr) null));
    }
}
