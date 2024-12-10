package com.google.android.recaptcha.internal;

import X.BE6;
import X.C17880vN;
import X.C18460wS;
import X.C200410p;
import X.C29431cG;
import java.util.Iterator;
import java.util.List;

public final class zzef {
    public List zza = C18460wS.A00;

    public final long zza(long[] jArr) {
        Iterator it = C29431cG.A0k(C200410p.A0O(jArr), this.zza).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Long.valueOf(C17880vN.A05(it.next()) ^ C17880vN.A05(next));
            }
            return C17880vN.A05(next);
        }
        throw BE6.A0v("Empty collection can't be reduced.");
    }

    public final void zzb(long[] jArr) {
        this.zza = C200410p.A0O(jArr);
    }
}
