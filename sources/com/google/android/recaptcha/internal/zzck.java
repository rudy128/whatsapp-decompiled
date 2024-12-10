package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.BE6;
import X.BE8;
import X.C17880vN;
import X.C29351c6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzck {
    public final Map zza;
    public final Set zzb = C17880vN.A14();
    public final Map zzc;

    public final Map zzc() {
        return this.zzc;
    }

    public final Object zzb(int i) {
        return this.zza.remove(Integer.valueOf(i));
    }

    public final void zzd() {
        this.zza.clear();
    }

    public final void zze(int i, Object obj) {
        zzf(173, obj);
        this.zzb.add(173);
    }

    public final void zzf(int i, Object obj) {
        C17880vN.A1O(obj, this.zza, i);
    }

    public zzck() {
        LinkedHashMap A13 = C17880vN.A13();
        this.zza = A13;
        this.zzc = A13;
    }

    private final List zzi(List list) {
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0D.add(zza((zzpq) it.next()));
        }
        return A0D;
    }

    public final Object zza(zzpq zzpq) {
        int zzO = zzpq.zzO();
        int i = zzO - 1;
        if (zzO != 0) {
            switch (i) {
                case 0:
                    return AnonymousClass000.A0w(this.zza, zzpq.zzi());
                case 1:
                    return Boolean.valueOf(zzpq.zzM());
                case 2:
                    byte[] zzo = zzpq.zzI().zzo();
                    if (zzo.length == 1) {
                        return Byte.valueOf(zzo[0]);
                    }
                    throw BE6.A0V((Throwable) null, 4, 6);
                case 3:
                    String zzK = zzpq.zzK();
                    if (zzK.length() == 1) {
                        return Character.valueOf(zzK.charAt(0));
                    }
                    throw BE6.A0V((Throwable) null, 4, 6);
                case 4:
                    int zzj = zzpq.zzj();
                    if (zzj >= -32768 && zzj <= 32767) {
                        return Short.valueOf((short) zzj);
                    }
                    throw BE6.A0V((Throwable) null, 4, 6);
                case 5:
                    return Integer.valueOf(zzpq.zzk());
                case 6:
                case 8:
                    throw BE6.A0V((Throwable) null, 4, 6);
                case 7:
                    return Long.valueOf(zzpq.zzH());
                case 9:
                    return Float.valueOf(zzpq.zzg());
                case 10:
                    return Double.valueOf(zzpq.zzf());
                case 11:
                    return zzpq.zzL();
                case 12:
                    return null;
                default:
                    throw BE8.A0Q();
            }
        } else {
            throw null;
        }
    }

    public final Class[] zzg(List list) {
        List<Object> zzi = zzi(list);
        ArrayList A0D = C29351c6.A0D(zzi);
        for (Object zza2 : zzi) {
            A0D.add(zzci.zza(zza2));
        }
        return (Class[]) A0D.toArray(new Class[0]);
    }

    public final Object[] zzh(List list) {
        return zzi(list).toArray(BE6.A1Z());
    }
}
