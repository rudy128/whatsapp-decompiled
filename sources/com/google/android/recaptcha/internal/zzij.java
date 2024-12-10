package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.BEB;
import X.C17890vO;
import java.util.Iterator;
import java.util.Map;

public final class zzij {
    public static final zzij zzb = new zzij(true);
    public final zzle zza = new zzle(16, (zzld) null);
    public boolean zzc;
    public boolean zzd;

    public zzij(boolean z) {
        zzg();
        zzg();
    }

    public static zzij zzd() {
        return zzb;
    }

    public final int zzb() {
        zzle zzle;
        int i = 0;
        int i2 = 0;
        while (true) {
            int size = this.zza.zzb.size();
            zzle = this.zza;
            if (i >= size) {
                break;
            }
            i2 += zzo(zzle.zzg(i));
            i++;
        }
        Iterator it = zzle.zzc().iterator();
        while (it.hasNext()) {
            i2 += zzo(AnonymousClass000.A16(it));
        }
        return i2;
    }

    public final void zzh(zzij zzij) {
        zzle zzle;
        int i = 0;
        while (true) {
            int size = zzij.zza.zzb.size();
            zzle = zzij.zza;
            if (i >= size) {
                break;
            }
            zzm(zzle.zzg(i));
            i++;
        }
        Iterator it = zzle.zzc().iterator();
        while (it.hasNext()) {
            zzm(AnonymousClass000.A16(it));
        }
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        int i = 0;
        while (true) {
            int size = this.zza.zzb.size();
            zzle zzle = this.zza;
            if (i >= size) {
                Iterator it = zzle.zzc().iterator();
                while (it.hasNext()) {
                    if (!zzn(AnonymousClass000.A16(it))) {
                        return false;
                    }
                }
                return true;
            } else if (!zzn(zzle.zzg(i))) {
                return false;
            } else {
                i++;
            }
        }
    }

    public static Object zzl(Object obj) {
        if (obj instanceof zzkj) {
            return ((zzkj) obj).zzd();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzij)) {
            return false;
        }
        return this.zza.equals(((zzij) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    /* renamed from: zzc */
    public final zzij clone() {
        zzle zzle;
        zzij zzij = new zzij();
        int i = 0;
        while (true) {
            int size = this.zza.zzb.size();
            zzle = this.zza;
            if (i >= size) {
                break;
            }
            Map.Entry zzg = zzle.zzg(i);
            zzij.zzi((zzii) zzg.getKey(), zzg.getValue());
            i++;
        }
        Iterator it = zzle.zzc().iterator();
        while (it.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(it);
            zzij.zzi((zzii) A16.getKey(), A16.getValue());
        }
        zzij.zzd = this.zzd;
        return zzij;
    }

    public final Object zze(zzii zzii) {
        return this.zza.get(zzii);
    }

    public final Iterator zzf() {
        boolean z = this.zzd;
        Iterator A0i = C17890vO.A0i(this.zza);
        if (z) {
            return new zzji(A0i);
        }
        return A0i;
    }

    public final void zzg() {
        if (!this.zzc) {
            int i = 0;
            while (true) {
                int size = this.zza.zzb.size();
                zzle zzle = this.zza;
                if (i < size) {
                    Map.Entry zzg = zzle.zzg(i);
                    if (zzg.getValue() instanceof zzit) {
                        ((zzit) zzg.getValue()).zzB();
                    }
                    i++;
                } else {
                    zzle.zza();
                    this.zzc = true;
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r1 = ((com.google.android.recaptcha.internal.zzgw) r6).zzd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        r0 = com.google.android.recaptcha.internal.zzhh.zzb;
        r0 = X.BEB.A02(r1) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        return r5 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zza(com.google.android.recaptcha.internal.zzii r5, java.lang.Object r6) {
        /*
            com.google.android.recaptcha.internal.zzmb r1 = r5.zzd()
            int r0 = r5.zza()
            r5.zzg()
            int r5 = X.BE6.A05(r0)
            com.google.android.recaptcha.internal.zzmb r0 = com.google.android.recaptcha.internal.zzmb.GROUP
            if (r1 != r0) goto L_0x0016
            java.nio.charset.Charset r0 = com.google.android.recaptcha.internal.zzjc.zza
            int r5 = r5 + r5
        L_0x0016:
            com.google.android.recaptcha.internal.zzmc r0 = com.google.android.recaptcha.internal.zzmc.INT
            int r1 = r1.ordinal()
            r0 = 4
            switch(r1) {
                case 0: goto L_0x0027;
                case 1: goto L_0x00a5;
                case 2: goto L_0x0031;
                case 3: goto L_0x0031;
                case 4: goto L_0x007e;
                case 5: goto L_0x0027;
                case 6: goto L_0x00a5;
                case 7: goto L_0x003a;
                case 8: goto L_0x0044;
                case 9: goto L_0x005d;
                case 10: goto L_0x002a;
                case 11: goto L_0x003c;
                case 12: goto L_0x0064;
                case 13: goto L_0x006f;
                case 14: goto L_0x00a5;
                case 15: goto L_0x0027;
                case 16: goto L_0x0087;
                case 17: goto L_0x0097;
                default: goto L_0x0020;
            }
        L_0x0020:
            java.lang.String r0 = "There is no way to get here, but the compiler thinks otherwise."
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x0027:
            r0 = 8
            goto L_0x00a5
        L_0x002a:
            com.google.android.recaptcha.internal.zzke r6 = (com.google.android.recaptcha.internal.zzke) r6
            int r0 = com.google.android.recaptcha.internal.zzhh.zzv(r6)
            goto L_0x00a5
        L_0x0031:
            long r0 = X.C17880vN.A05(r6)
            int r0 = com.google.android.recaptcha.internal.zzhh.zzz(r0)
            goto L_0x00a5
        L_0x003a:
            r0 = 1
            goto L_0x00a5
        L_0x003c:
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzgw
            if (r0 != 0) goto L_0x004f
            byte[] r6 = (byte[]) r6
            int r1 = r6.length
            goto L_0x0055
        L_0x0044:
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzgw
            if (r0 != 0) goto L_0x004f
            java.lang.String r6 = (java.lang.String) r6
            int r0 = com.google.android.recaptcha.internal.zzhh.zzx(r6)
            goto L_0x00a5
        L_0x004f:
            com.google.android.recaptcha.internal.zzgw r6 = (com.google.android.recaptcha.internal.zzgw) r6
            int r1 = r6.zzd()
        L_0x0055:
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
            goto L_0x00a5
        L_0x005d:
            com.google.android.recaptcha.internal.zzke r6 = (com.google.android.recaptcha.internal.zzke) r6
            int r0 = r6.zzn()
            goto L_0x00a5
        L_0x0064:
            int r1 = X.AnonymousClass000.A0M(r6)
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r0 = X.BEB.A02(r1)
            goto L_0x00a5
        L_0x006f:
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zziv
            if (r0 == 0) goto L_0x007e
            com.google.android.recaptcha.internal.zziv r6 = (com.google.android.recaptcha.internal.zziv) r6
            int r0 = r6.zza()
            int r0 = com.google.android.recaptcha.internal.zzhh.zzu(r0)
            goto L_0x00a5
        L_0x007e:
            int r0 = X.AnonymousClass000.A0M(r6)
            int r0 = com.google.android.recaptcha.internal.zzhh.zzu(r0)
            goto L_0x00a5
        L_0x0087:
            int r1 = X.AnonymousClass000.A0M(r6)
            int r0 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r0
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r0 = X.BEB.A02(r1)
            goto L_0x00a5
        L_0x0097:
            long r3 = X.C17880vN.A05(r6)
            long r1 = r3 + r3
            r0 = 63
            long r3 = r3 >> r0
            long r3 = r3 ^ r1
            int r0 = com.google.android.recaptcha.internal.zzhh.zzz(r3)
        L_0x00a5:
            int r5 = r5 + r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzij.zza(com.google.android.recaptcha.internal.zzii, java.lang.Object):int");
    }

    private final void zzm(Map.Entry entry) {
        Object obj;
        Object zzj;
        zzii zzii = (zzii) entry.getKey();
        Object value = entry.getValue();
        zzii.zzg();
        if (zzii.zze() != zzmc.MESSAGE || (obj = this.zza.get(zzii)) == null) {
            this.zza.put(zzii, zzl(value));
            return;
        }
        if (obj instanceof zzkj) {
            zzj = zzii.zzc((zzkj) obj, (zzkj) value);
        } else {
            zzkd zzX = ((zzke) obj).zzX();
            zzii.zzb(zzX, (zzke) value);
            zzj = zzX.zzj();
        }
        this.zza.put(zzii, zzj);
    }

    public static boolean zzn(Map.Entry entry) {
        zzii zzii = (zzii) entry.getKey();
        if (zzii.zze() != zzmc.MESSAGE) {
            return true;
        }
        zzii.zzg();
        Object value = entry.getValue();
        if (value instanceof zzkf) {
            return ((zzkf) value).zzo();
        }
        throw AnonymousClass000.A0k("Wrong object type used with protocol message reflection.");
    }

    public static final int zzo(Map.Entry entry) {
        zzii zzii = (zzii) entry.getKey();
        Object value = entry.getValue();
        if (zzii.zze() != zzmc.MESSAGE) {
            return zza(zzii, value);
        }
        zzii.zzg();
        zzii.zzf();
        int zza2 = ((zzii) entry.getKey()).zza();
        int i = zzhh.zzb;
        int A02 = BEB.A02(zza2);
        return 2 + 1 + A02 + 1 + zzhh.zzv((zzke) value);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if ((r5 instanceof com.google.android.recaptcha.internal.zzke) == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        if (r0 != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        r3.zza.zze(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r2 = X.AnonymousClass8BR.A1a();
        X.AnonymousClass000.A1L(r2, r4.zza());
        r2[1] = r4.zzd().zza();
        r2[2] = X.C17890vO.A0U(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003d, code lost:
        throw X.BE8.A0X("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi(com.google.android.recaptcha.internal.zzii r4, java.lang.Object r5) {
        /*
            r3 = this;
            r4.zzg()
            com.google.android.recaptcha.internal.zzmb r1 = r4.zzd()
            java.nio.charset.Charset r0 = com.google.android.recaptcha.internal.zzjc.zza
            if (r5 == 0) goto L_0x006a
            com.google.android.recaptcha.internal.zzmb r0 = com.google.android.recaptcha.internal.zzmb.DOUBLE
            com.google.android.recaptcha.internal.zzmc r0 = com.google.android.recaptcha.internal.zzmc.INT
            com.google.android.recaptcha.internal.zzmc r0 = r1.zza()
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 0: goto L_0x003e;
                case 1: goto L_0x0041;
                case 2: goto L_0x0044;
                case 3: goto L_0x0047;
                case 4: goto L_0x004a;
                case 5: goto L_0x004d;
                case 6: goto L_0x0050;
                case 7: goto L_0x005c;
                case 8: goto L_0x0057;
                default: goto L_0x001b;
            }
        L_0x001b:
            java.lang.Object[] r2 = X.AnonymousClass8BR.A1a()
            int r0 = r4.zza()
            X.AnonymousClass000.A1L(r2, r0)
            com.google.android.recaptcha.internal.zzmb r0 = r4.zzd()
            com.google.android.recaptcha.internal.zzmc r0 = r0.zza()
            r2[r1] = r0
            java.lang.String r1 = X.C17890vO.A0U(r5)
            r0 = 2
            r2[r0] = r1
            java.lang.String r0 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.IllegalArgumentException r0 = X.BE8.A0X(r0, r2)
            throw r0
        L_0x003e:
            boolean r0 = r5 instanceof java.lang.Integer
            goto L_0x0062
        L_0x0041:
            boolean r0 = r5 instanceof java.lang.Long
            goto L_0x0062
        L_0x0044:
            boolean r0 = r5 instanceof java.lang.Float
            goto L_0x0062
        L_0x0047:
            boolean r0 = r5 instanceof java.lang.Double
            goto L_0x0062
        L_0x004a:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L_0x0062
        L_0x004d:
            boolean r0 = r5 instanceof java.lang.String
            goto L_0x0062
        L_0x0050:
            boolean r0 = r5 instanceof com.google.android.recaptcha.internal.zzgw
            if (r0 != 0) goto L_0x0064
            boolean r0 = r5 instanceof byte[]
            goto L_0x0062
        L_0x0057:
            boolean r0 = r5 instanceof com.google.android.recaptcha.internal.zzke
            if (r0 != 0) goto L_0x0064
            goto L_0x001b
        L_0x005c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0064
            boolean r0 = r5 instanceof com.google.android.recaptcha.internal.zziv
        L_0x0062:
            if (r0 == 0) goto L_0x001b
        L_0x0064:
            com.google.android.recaptcha.internal.zzle r0 = r3.zza
            r0.put(r4, r5)
            return
        L_0x006a:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzij.zzi(com.google.android.recaptcha.internal.zzii, java.lang.Object):void");
    }

    public zzij() {
    }
}
