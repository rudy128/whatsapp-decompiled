package com.google.android.play.core.integrity;

import X.AnonymousClass8BV;
import X.C26395Cyv;
import X.C27079DTe;
import X.C27215DZq;
import X.ECF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class af extends C27079DTe {
    public final /* synthetic */ byte[] a;
    public final /* synthetic */ Long b;
    public final /* synthetic */ Parcelable c;
    public final /* synthetic */ TaskCompletionSource d;
    public final /* synthetic */ IntegrityTokenRequest e;
    public final /* synthetic */ aj f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.a = bArr;
        this.b = l;
        this.c = parcelable;
        this.d = taskCompletionSource2;
        this.e = integrityTokenRequest;
        this.f = ajVar;
    }

    public final void a(Exception exc) {
        if (exc instanceof C27215DZq) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    public final void b() {
        try {
            aj ajVar = this.f;
            Bundle a2 = aj.a(ajVar, this.a, this.b, this.c);
            ai aiVar = new ai(this.f, this.d);
            C26395Cyv cyv = (C26395Cyv) ((ECF) ajVar.a.A01);
            Parcel A00 = C27079DTe.A00(cyv);
            a2.writeToParcel(A00, 0);
            A00.writeStrongBinder(aiVar);
            cyv.A00(2, A00);
        } catch (RemoteException e2) {
            this.f.b.A01("requestIntegrityToken(%s)", e2, AnonymousClass8BV.A1b(this.e));
            this.d.trySetException(new IntegrityServiceException(-100, e2));
        }
    }
}
