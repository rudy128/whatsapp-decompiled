package androidx.credentials.playservices.controllers;

import X.AnonymousClass11G;
import X.C18090vk;
import X.C22821Di;
import X.C98494rF;

public final class CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C98494rF $exception;
    public final /* synthetic */ C22821Di $onError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1(C22821Di r2, C98494rF r3) {
        super(0);
        this.$onError = r2;
        this.$exception = r3;
    }

    public final void invoke() {
        this.$onError.invoke(this.$exception.element);
    }
}
