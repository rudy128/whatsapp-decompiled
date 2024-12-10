package com.google.android.play.core.integrity;

import X.BE6;
import X.C25764Cla;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class bl extends bi {
    public final /* synthetic */ bn c;
    public final C25764Cla d = new C25764Cla("OnWarmUpIntegrityTokenCallback");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.d.A02("onWarmUpExpressIntegrityToken", BE6.A1Z());
        ApiException a = this.c.f.a(bundle);
        if (a != null) {
            this.a.trySetException(a);
        } else {
            this.a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
