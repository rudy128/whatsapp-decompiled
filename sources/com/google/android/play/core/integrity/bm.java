package com.google.android.play.core.integrity;

import X.C27079DTe;
import X.C27215DZq;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class bm extends C27079DTe {
    public final /* synthetic */ bn f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f = bnVar;
    }

    public final void a(Exception exc) {
        if (!(exc instanceof C27215DZq)) {
            super.a(exc);
        } else if (bn.l(this.f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
