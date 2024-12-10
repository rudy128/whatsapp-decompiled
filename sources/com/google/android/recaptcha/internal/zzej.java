package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.BE8;
import X.C17880vN;
import X.C17890vO;
import X.C72453Mb;
import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public final class zzej implements zzen {
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzel.zza(this, objArr);
    }

    public final Object zza(Object... objArr) {
        ArrayList A0z = C17880vN.A0z(r5);
        for (Object obj : objArr) {
            if (true != (obj instanceof Integer) || obj == null) {
                throw BE8.A0Q();
            }
            A0z.add(obj);
        }
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A0z.iterator();
        while (it.hasNext()) {
            int A0H = C72453Mb.A0H(it);
            if (zzb(A0H)) {
                C17890vO.A1D(A13, A0H);
            }
        }
        return A13;
    }

    public static final boolean zzb(int i) {
        try {
            new Socket("localhost", i).close();
            return true;
        } catch (ConnectException unused) {
            return false;
        }
    }
}
