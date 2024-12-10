package com.google.android.play.core.integrity;

import X.C26028Cqm;
import X.C28524E5v;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class at {
    public final C28524E5v a;
    public final C28524E5v b;

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, C26028Cqm cqm) {
        Context context = (Context) this.a.a();
        context.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        cqm.getClass();
        return new as(context, kVar, activity, taskCompletionSource, cqm);
    }

    public at(C28524E5v e5v, C28524E5v e5v2) {
        this.a = e5v;
        this.b = e5v2;
    }
}
