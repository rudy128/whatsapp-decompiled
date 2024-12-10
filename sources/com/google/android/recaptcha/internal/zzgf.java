package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.BE6;
import X.C17890vO;
import java.io.IOException;
import java.util.Comparator;

public abstract class zzgf implements zzke {
    public int zza = 0;

    public abstract int zza(zzkr zzkr);

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void zzc(java.lang.Iterable r6, java.util.List r7) {
        /*
            java.nio.charset.Charset r0 = com.google.android.recaptcha.internal.zzjc.zza
            if (r6 == 0) goto L_0x00ab
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzjm
            java.lang.String r4 = " is null."
            java.lang.String r3 = "Element at index "
            if (r0 == 0) goto L_0x0057
            com.google.android.recaptcha.internal.zzjm r6 = (com.google.android.recaptcha.internal.zzjm) r6
            java.util.List r0 = r6.zzh()
            r6 = r7
            com.google.android.recaptcha.internal.zzjm r6 = (com.google.android.recaptcha.internal.zzjm) r6
            int r5 = r7.size()
            java.util.Iterator r2 = r0.iterator()
        L_0x001d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r1 = r2.next()
            if (r1 != 0) goto L_0x0044
            int r1 = X.AnonymousClass3MX.A02(r6, r5)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.AnonymousClass000.A1E(r3, r4, r0, r1)
            java.lang.String r1 = r0.toString()
            int r0 = r6.size()
        L_0x003c:
            int r0 = r0 + -1
            if (r0 < r5) goto L_0x0052
            r6.remove(r0)
            goto L_0x003c
        L_0x0044:
            boolean r0 = r1 instanceof com.google.android.recaptcha.internal.zzgw
            if (r0 == 0) goto L_0x004e
            com.google.android.recaptcha.internal.zzgw r1 = (com.google.android.recaptcha.internal.zzgw) r1
            r6.zzi(r1)
            goto L_0x001d
        L_0x004e:
            r6.add(r1)
            goto L_0x001d
        L_0x0052:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r1)
            throw r0
        L_0x0057:
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzkm
            if (r0 != 0) goto L_0x00a7
            boolean r0 = r7 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x006e
            r2 = r7
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r1 = r7.size()
            int r0 = r6.size()
            int r1 = r1 + r0
            r2.ensureCapacity(r1)
        L_0x006e:
            int r2 = r7.size()
            java.util.Iterator r1 = r6.iterator()
        L_0x0076:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r0 = r1.next()
            if (r0 != 0) goto L_0x009d
            int r1 = X.AnonymousClass3MX.A02(r7, r2)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.AnonymousClass000.A1E(r3, r4, r0, r1)
            java.lang.String r1 = r0.toString()
            int r0 = r7.size()
        L_0x0095:
            int r0 = r0 + -1
            if (r0 < r2) goto L_0x00a1
            r7.remove(r0)
            goto L_0x0095
        L_0x009d:
            r7.add(r0)
            goto L_0x0076
        L_0x00a1:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r1)
            throw r0
        L_0x00a6:
            return
        L_0x00a7:
            r7.addAll(r6)
            return
        L_0x00ab:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgf.zzc(java.lang.Iterable, java.util.List):void");
    }

    public final zzgw zzb() {
        try {
            int zzn = zzn();
            Comparator comparator = zzgw.zza;
            byte[] bArr = new byte[zzn];
            zzhe zzhe = new zzhe(bArr, 0, zzn);
            zze(zzhe);
            zzhe.zzB();
            return new zzgt(bArr);
        } catch (IOException e) {
            String A0U = C17890vO.A0U(this);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Serializing ");
            A10.append(A0U);
            throw BE6.A0o(AnonymousClass000.A0y(" to a ByteString threw an IOException (should never happen).", A10), e);
        }
    }

    public final byte[] zzd() {
        try {
            int zzn = zzn();
            byte[] bArr = new byte[zzn];
            zzhe zzhe = new zzhe(bArr, 0, zzn);
            zze(zzhe);
            zzhe.zzB();
            return bArr;
        } catch (IOException e) {
            String A0U = C17890vO.A0U(this);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Serializing ");
            A10.append(A0U);
            throw BE6.A0o(AnonymousClass000.A0y(" to a byte array threw an IOException (should never happen).", A10), e);
        }
    }
}
