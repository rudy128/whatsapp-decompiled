package com.google.android.play.core.integrity;

import X.BEA;
import X.C26028Cqm;
import X.C26395Cyv;
import X.C27079DTe;
import X.ECE;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class bh extends bm {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ int d;
    public final /* synthetic */ bn e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(bnVar, taskCompletionSource);
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
        this.e = bnVar;
    }

    public final void b() {
        if (bn.l(this.e)) {
            a(new StandardIntegrityException(-2, (Throwable) null));
            return;
        }
        try {
            bn bnVar = this.e;
            C26028Cqm cqm = bnVar.a;
            Bundle bundle = this.a;
            as a2 = bnVar.e.a(this.b, this.c, cqm);
            C26395Cyv cyv = (C26395Cyv) ((ECE) cqm.A01);
            Parcel A00 = C27079DTe.A00(cyv);
            bundle.writeToParcel(A00, 0);
            A00.writeStrongBinder(a2);
            cyv.A00(6, A00);
        } catch (RemoteException e2) {
            this.e.b.A01("requestAndShowDialog(%s)", e2, BEA.A1b(this.d));
            this.c.trySetException(new StandardIntegrityException(-100, e2));
        }
    }
}
