package androidx.credentials.playservices.controllers;

import X.AnonymousClass11G;
import X.C18070vi;
import X.C18090vk;
import X.E7A;
import java.util.concurrent.Executor;

public final class CredentialProviderController$maybeReportErrorFromResultReceiver$1 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ E7A $callback;
    public final /* synthetic */ Object $exception;
    public final /* synthetic */ Executor $executor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderController$maybeReportErrorFromResultReceiver$1(Executor executor, E7A e7a, Object obj) {
        super(0);
        this.$executor = executor;
        this.$callback = e7a;
        this.$exception = obj;
    }

    public final void invoke() {
        this.$executor.execute(new CredentialProviderController$maybeReportErrorFromResultReceiver$1$$ExternalSyntheticLambda0(this.$callback, this.$exception));
    }

    public static final void invoke$lambda$0(E7A e7a, Object obj) {
        C18070vi.A0h(e7a, obj);
        e7a.Bsz(obj);
    }
}
