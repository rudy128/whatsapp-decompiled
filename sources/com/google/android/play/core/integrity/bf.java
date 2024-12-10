package com.google.android.play.core.integrity;

import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C25764Cla;
import X.C26395Cyv;
import X.C27079DTe;
import X.ECE;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class bf extends bm {
    public final /* synthetic */ long a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ bn c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i, long j, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.a = j;
        this.b = taskCompletionSource2;
        this.c = bnVar;
    }

    public final void b() {
        if (bn.l(this.c)) {
            a(new StandardIntegrityException(-2, (Throwable) null));
        } else if (bn.k(this.c, 0)) {
            a(new StandardIntegrityException(-14, (Throwable) null));
        } else {
            try {
                bn bnVar = this.c;
                Bundle b2 = bn.b(bnVar, this.a, 0);
                bl blVar = new bl(this.c, this.b);
                C26395Cyv cyv = (C26395Cyv) ((ECE) bnVar.a.A01);
                Parcel A00 = C27079DTe.A00(cyv);
                b2.writeToParcel(A00, 0);
                A00.writeStrongBinder(blVar);
                cyv.A00(2, A00);
            } catch (RemoteException e) {
                bn bnVar2 = this.c;
                long j = this.a;
                C25764Cla cla = bnVar2.b;
                Object[] A1a = AnonymousClass3MW.A1a();
                AnonymousClass3MX.A1S(A1a, 0, j);
                cla.A01("warmUpIntegrityToken(%s)", e, A1a);
                this.b.trySetException(new StandardIntegrityException(-100, e));
            }
        }
    }
}
