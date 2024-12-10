package com.google.android.play.core.integrity;

import X.C26395Cyv;
import X.C28525E5w;
import X.ECE;
import android.os.IBinder;
import android.os.IInterface;

public final /* synthetic */ class bd implements C28525E5w {
    public final Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        if (!(queryLocalInterface instanceof ECE)) {
            return new C26395Cyv(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        }
        return queryLocalInterface;
    }
}
