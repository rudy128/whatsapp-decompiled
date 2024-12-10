package com.google.android.recaptcha.internal;

import X.AnonymousClass1D6;
import X.AnonymousClass1D7;
import X.BE8;
import X.C108985cd;
import X.C17880vN;
import X.C72463Mc;
import android.content.Context;
import java.util.Map;

public final class zzeo implements zzen {
    public final Context zzb;
    public final Map zzc;

    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzel.zza(this, objArr);
    }

    public final Object zza(Object... objArr) {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer) || obj == null) {
            throw BE8.A0Q();
        }
        Object obj2 = this.zzc.get(obj);
        if (obj2 != null) {
            return this.zzb.getSystemService((String) obj2);
        }
        throw new zzae(4, 4, (Throwable) null);
    }

    public zzeo(Context context) {
        this.zzb = context;
        AnonymousClass1D6[] r4 = new AnonymousClass1D6[4];
        C72463Mc.A1H(2, "activity", r4);
        C108985cd.A1G(3, "phone", r4);
        AnonymousClass1D6.A03(4, "input_method", r4, 2);
        AnonymousClass1D6.A03(C17880vN.A0l(), "audio", r4, 3);
        this.zzc = AnonymousClass1D7.A0B(r4);
    }
}
