package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.82h  reason: invalid class name and case insensitive filesystem */
public final class C1588582h extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C1606789m $callback;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ C144147Ge this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1588582h(C144147Ge r2, C1606789m r3, AnonymousClass705 r4) {
        super(1);
        this.this$0 = r2;
        this.$callback = r3;
        this.$operationRetryState = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C135616sU r7 = (C135616sU) obj;
        C18070vi.A0d(r7, 0);
        C144147Ge r0 = this.this$0;
        X509Certificate x509Certificate = r7.A02;
        PublicKey publicKey = r7.A01;
        r0.CBW(this.$callback, this.$operationRetryState, r7.A00, publicKey, x509Certificate);
        return C27621Wu.A00;
    }
}
