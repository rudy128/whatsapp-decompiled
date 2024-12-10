package com.google.android.play.core.integrity;

import X.BE6;
import X.C22606BFm;
import X.C25764Cla;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class ai extends C22606BFm implements IInterface {
    public final /* synthetic */ aj a;
    public final C25764Cla b;
    public final TaskCompletionSource c;

    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        b(C22606BFm.A00(parcel));
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this();
        this.a = ajVar;
        this.b = new C25764Cla("OnRequestIntegrityTokenCallback");
        this.c = taskCompletionSource;
    }

    public final void b(Bundle bundle) {
        TaskCompletionSource taskCompletionSource;
        this.a.a.A02(this.c);
        this.b.A02("onRequestIntegrityToken", BE6.A1Z());
        Exception a2 = this.a.f.a(bundle);
        if (a2 != null) {
            taskCompletionSource = this.c;
        } else {
            String string = bundle.getString("token");
            if (string == null) {
                taskCompletionSource = this.c;
                a2 = new IntegrityServiceException(-100, (Throwable) null);
            } else {
                this.c.trySetResult(new aq(string, new ah(this, this.a.c, bundle.getLong("request.token.sid"))));
                return;
            }
        }
        taskCompletionSource.trySetException(a2);
    }

    public ai() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }
}
