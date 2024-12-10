package com.google.android.play.core.integrity;

import X.BEA;
import X.C26028Cqm;
import X.C26395Cyv;
import X.C27079DTe;
import X.ECF;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class ag extends C27079DTe {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ int d;
    public final /* synthetic */ aj e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(taskCompletionSource);
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
        this.e = ajVar;
    }

    public final void b() {
        try {
            aj ajVar = this.e;
            C26028Cqm cqm = ajVar.a;
            Bundle bundle = this.a;
            as a2 = ajVar.e.a(this.b, this.c, cqm);
            C26395Cyv cyv = (C26395Cyv) ((ECF) cqm.A01);
            Parcel A00 = C27079DTe.A00(cyv);
            bundle.writeToParcel(A00, 0);
            A00.writeStrongBinder(a2);
            cyv.A00(3, A00);
        } catch (RemoteException e2) {
            this.e.b.A01("requestAndShowDialog(%s)", e2, BEA.A1b(this.d));
            this.c.trySetException(new IntegrityServiceException(-100, e2));
        }
    }
}
