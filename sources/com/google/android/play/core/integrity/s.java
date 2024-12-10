package com.google.android.play.core.integrity;

import X.AnonymousClass000;
import X.C28666EDd;
import X.DLU;
import X.DLZ;
import android.content.Context;

public final class s {
    public final C28666EDd a;
    public final C28666EDd b;
    public final C28666EDd c;
    public final C28666EDd d;
    public final C28666EDd e;

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }

    public /* synthetic */ s(Context context, r rVar) {
        if (context != null) {
            DLU dlu = new DLU(context);
            this.a = dlu;
            DLZ dlz = new DLZ(ac.a);
            this.b = dlz;
            m mVar = l.a;
            au auVar = new au(dlu, mVar);
            this.c = auVar;
            DLZ dlz2 = new DLZ(new al(dlu, dlz, auVar, mVar));
            this.d = dlz2;
            this.e = new DLZ(new ab(dlz2));
            return;
        }
        throw AnonymousClass000.A0s("instance cannot be null");
    }
}
