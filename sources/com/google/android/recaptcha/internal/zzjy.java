package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C17880vN;
import X.C17890vO;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzjy extends LinkedHashMap {
    public static final zzjy zza;
    public boolean zzb = true;

    public static zzjy zza() {
        return zza;
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final boolean zze() {
        return this.zzb;
    }

    static {
        zzjy zzjy = new zzjy();
        zza = zzjy;
        zzjy.zzb = false;
    }

    public static int zzf(Object obj) {
        if (obj instanceof byte[]) {
            int i = r3;
            Charset charset = zzjc.zza;
            for (byte b : (byte[]) obj) {
                i = (i * 31) + b;
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof zziv)) {
            return obj.hashCode();
        } else {
            throw C17880vN.A0y();
        }
    }

    private final void zzg() {
        if (!this.zzb) {
            throw C17880vN.A0y();
        }
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator A0i = C17890vO.A0i(this);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            if (!map.containsKey(A16.getKey())) {
                return false;
            }
            Object value = A16.getValue();
            Object obj2 = map.get(A16.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                equals = value.equals(obj2);
                continue;
            } else {
                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!equals) {
                return false;
            }
        }
        return true;
    }

    public zzjy(Map map) {
        super(map);
    }

    public final void clear() {
        zzg();
        super.clear();
    }

    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public final int hashCode() {
        Iterator A0i = C17890vO.A0i(this);
        int i = 0;
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            i += zzf(A16.getValue()) ^ zzf(A16.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        zzg();
        Charset charset = zzjc.zza;
        if (obj != null && obj2 != null) {
            return super.put(obj, obj2);
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void putAll(java.util.Map r5) {
        /*
            r4 = this;
            r4.zzg()
            java.util.Iterator r3 = X.AnonymousClass8BU.A0x(r5)
        L_0x0007:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r2 = r3.next()
            java.nio.charset.Charset r0 = com.google.android.recaptcha.internal.zzjc.zza
            r1 = 0
            if (r2 == 0) goto L_0x001d
            java.lang.Object r0 = r5.get(r2)
            if (r0 == 0) goto L_0x001d
            goto L_0x0007
        L_0x001d:
            throw r1
        L_0x001e:
            super.putAll(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzjy.putAll(java.util.Map):void");
    }

    public final Object remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zzjy zzb() {
        zzjy zzjy;
        if (isEmpty()) {
            return zzjy;
        }
        zzjy = new zzjy(this);
        return zzjy;
    }

    public final void zzd(zzjy zzjy) {
        zzg();
        if (!zzjy.isEmpty()) {
            putAll(zzjy);
        }
    }

    public zzjy() {
    }
}
