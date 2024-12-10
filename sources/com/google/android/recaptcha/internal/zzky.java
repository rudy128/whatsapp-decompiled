package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C17880vN;
import java.util.Map;

public final class zzky implements Map.Entry, Comparable {
    public final /* synthetic */ zzle zza;
    public final Comparable zzb;
    public Object zzc;

    public zzky(zzle zzle, Comparable comparable, Object obj) {
        this.zza = zzle;
        this.zzb = comparable;
        this.zzc = obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (!zzb(this.zzb, entry.getKey()) || !zzb(this.zzc, entry.getValue())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* synthetic */ Object getKey() {
        return this.zzb;
    }

    public final Object getValue() {
        return this.zzc;
    }

    public final Comparable zza() {
        return this.zzb;
    }

    public static final boolean zzb(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 != null) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzb.compareTo(((zzky) obj).zzb);
    }

    public final int hashCode() {
        return AnonymousClass001.A0k(this.zzb) ^ C17880vN.A02(this.zzc);
    }

    public final Object setValue(Object obj) {
        this.zza.zzn();
        Object obj2 = this.zzc;
        this.zzc = obj;
        return obj2;
    }

    public final String toString() {
        return AnonymousClass001.A1H("=", String.valueOf(this.zzc), AnonymousClass000.A11(String.valueOf(this.zzb)));
    }
}
