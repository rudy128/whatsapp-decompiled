package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.83D  reason: invalid class name */
public final class AnonymousClass83D extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C1606789m $callback;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ String $userDeleteReason;
    public final /* synthetic */ AnonymousClass732 $userEntity;
    public final /* synthetic */ C144137Gd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass83D(AnonymousClass732 r2, C1606789m r3, AnonymousClass705 r4, C144137Gd r5, String str) {
        super(1);
        this.this$0 = r5;
        this.$userEntity = r2;
        this.$callback = r3;
        this.$operationRetryState = r4;
        this.$userDeleteReason = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C135776sk r9 = (C135776sk) obj;
        C18070vi.A0d(r9, 0);
        C144137Gd r0 = this.this$0;
        X509Certificate x509Certificate = r9.A02;
        AnonymousClass732 r1 = this.$userEntity;
        C1606789m r2 = this.$callback;
        PublicKey publicKey = r9.A01;
        r0.CBb(r1, r2, this.$operationRetryState, r9.A00, this.$userDeleteReason, publicKey, x509Certificate);
        return C27621Wu.A00;
    }
}
