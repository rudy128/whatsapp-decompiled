package com.google.android.play.core.integrity;

import X.AnonymousClass000;
import X.BE6;
import X.C25764Cla;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class bk extends bi {
    public final /* synthetic */ bn c;
    public final C25764Cla d = new C25764Cla("OnRequestIntegrityTokenCallback");
    public final long e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.e = j;
    }

    public final void c(Bundle bundle) {
        super.c(bundle);
        this.d.A02("onRequestExpressIntegrityToken", BE6.A1Z());
        ApiException a = this.c.f.a(bundle);
        if (a != null) {
            this.a.trySetException(a);
            return;
        }
        bj bjVar = new bj(this, this.c.c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.a;
        String string = bundle.getString("token");
        if (string != null) {
            taskCompletionSource.trySetResult(new br(string, bjVar));
            return;
        }
        throw AnonymousClass000.A0s("Null token");
    }
}
