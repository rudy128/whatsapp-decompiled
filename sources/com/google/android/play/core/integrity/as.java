package com.google.android.play.core.integrity;

import X.C22606BFm;
import X.C25764Cla;
import X.C26028Cqm;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

public final class as extends C22606BFm implements IInterface {
    public final TaskCompletionSource a;
    public final C26028Cqm b;
    public final C25764Cla c;
    public final String d;
    public final k e;
    public final Activity f;

    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        b(C22606BFm.A00(parcel));
        return true;
    }

    public final void b(Bundle bundle) {
        this.b.A02(this.a);
        this.c.A02("onRequestDialog(%s)", this.d);
        ApiException a2 = this.e.a(bundle);
        if (a2 != null) {
            this.a.trySetException(a2);
            return;
        }
        Parcelable parcelable = bundle.getParcelable("dialog.intent");
        if (parcelable == null) {
            C25764Cla cla = this.c;
            Object[] objArr = {this.d};
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", C25764Cla.A00(cla.A00, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", parcelable);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.b.A01()));
        C25764Cla cla2 = this.c;
        Object[] objArr2 = new Object[0];
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", C25764Cla.A00(cla2.A00, "Starting dialog intent...", objArr2));
        }
        this.f.startActivityForResult(intent, 0);
    }

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, C26028Cqm cqm) {
        this();
        this.c = new C25764Cla("RequestDialogCallbackImpl");
        this.d = context.getPackageName();
        this.e = kVar;
        this.a = taskCompletionSource;
        this.f = activity;
        this.b = cqm;
    }

    public as() {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
    }
}
