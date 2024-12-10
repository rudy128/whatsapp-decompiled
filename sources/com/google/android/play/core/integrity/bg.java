package com.google.android.play.core.integrity;

import X.AnonymousClass8BR;
import X.C17890vO;
import X.C25764Cla;
import X.C26395Cyv;
import X.C27079DTe;
import X.ECE;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.StandardIntegrityManager;

public final class bg extends bm {
    public final /* synthetic */ StandardIntegrityManager.StandardIntegrityTokenRequest a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TaskCompletionSource d;
    public final /* synthetic */ bn e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.a = standardIntegrityTokenRequest;
        this.b = j;
        this.c = j2;
        this.d = taskCompletionSource2;
        this.e = bnVar;
    }

    public final void b() {
        if (bn.l(this.e)) {
            a(new StandardIntegrityException(-2, (Throwable) null));
        } else if (bn.k(this.e, 0)) {
            a(new StandardIntegrityException(-14, (Throwable) null));
        } else {
            try {
                bn bnVar = this.e;
                Bundle a2 = bn.a(bnVar, this.a, this.b, this.c, 0);
                bk bkVar = new bk(this.e, this.d, this.b);
                C26395Cyv cyv = (C26395Cyv) ((ECE) bnVar.a.A01);
                Parcel A00 = C27079DTe.A00(cyv);
                a2.writeToParcel(A00, 0);
                A00.writeStrongBinder(bkVar);
                cyv.A00(3, A00);
            } catch (RemoteException e2) {
                bn bnVar2 = this.e;
                StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = this.a;
                C25764Cla cla = bnVar2.b;
                Object[] A1a = AnonymousClass8BR.A1a();
                h hVar = (h) standardIntegrityTokenRequest;
                A1a[0] = hVar.a;
                A1a[1] = hVar.b;
                C17890vO.A1N(A1a, this.b);
                cla.A01("requestExpressIntegrityToken(%s, %s, %s)", e2, A1a);
                this.d.trySetException(new StandardIntegrityException(-100, e2));
            }
        }
    }
}
