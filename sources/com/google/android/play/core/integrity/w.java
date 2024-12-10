package com.google.android.play.core.integrity;

import X.AnonymousClass000;
import X.C28666EDd;
import X.DLU;
import X.DLZ;
import android.content.Context;

public final class w implements aw {
    public final C28666EDd a;
    public final C28666EDd b;
    public final C28666EDd c;
    public final C28666EDd d;
    public final C28666EDd e;
    public final C28666EDd f;

    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f.a();
    }

    public /* synthetic */ w(Context context, v vVar) {
        if (context != null) {
            DLU dlu = new DLU(context);
            this.a = dlu;
            DLZ dlz = new DLZ(bb.a);
            this.b = dlz;
            o oVar = n.a;
            au auVar = new au(dlu, oVar);
            this.c = auVar;
            DLZ dlz2 = new DLZ(new bp(dlu, dlz, auVar, oVar));
            this.d = dlz2;
            DLZ dlz3 = new DLZ(new bu(dlz2));
            this.e = dlz3;
            this.f = new DLZ(new ba(dlz2, dlz3));
            return;
        }
        throw AnonymousClass000.A0s("instance cannot be null");
    }
}
