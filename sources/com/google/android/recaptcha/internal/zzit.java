package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass8BR;
import X.AnonymousClass8BX;
import X.BE6;
import X.BE7;
import X.BE9;
import X.BEA;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public abstract class zzit extends zzgf {
    public static final Map zzb = AnonymousClass8BR.A17();
    public zzlm zzc = zzlm.zza;
    public int zzd = -1;

    public static final boolean zzF(zzit zzit, boolean z) {
        byte byteValue = ((Number) zzit.zzh(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = BE9.A0T(zzit).zzl(zzit);
        if (z) {
            zzit zzit2 = zzit;
            if (true != zzl) {
                zzit2 = null;
            }
            zzit.zzh(2, zzit2, (Object) null);
        }
        return zzl;
    }

    public static zzir zzq(zzke zzke, Object obj, zzke zzke2, zziw zziw, int i, zzmb zzmb, Class cls) {
        return new zzir(zzke, "", (zzke) null, new zziq((zziw) null, i, zzmb, false, false), cls);
    }

    public static zzit zzu(zzit zzit, byte[] bArr) {
        zzit zzi = zzi(zzit, bArr, 0, bArr.length, zzie.zza);
        zzg(zzi);
        return zzi;
    }

    public final void zzC() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzE(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final /* synthetic */ zzkd zzW() {
        return (zzge) zzh(5, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzkd zzX() {
        zzin zzin = (zzin) zzh(5, (Object) null, (Object) null);
        zzin.zzg(this);
        return zzin;
    }

    public final /* synthetic */ zzke zzY() {
        return (zzgf) zzh(6, (Object) null, (Object) null);
    }

    public abstract Object zzh(int i, Object obj, Object obj2);

    public final boolean zzo() {
        return zzF(this, true);
    }

    public final zzin zzp() {
        return (zzin) zzh(5, (Object) null, (Object) null);
    }

    public final zzit zzs() {
        return (zzit) zzh(4, (Object) null, (Object) null);
    }

    public static zzit zzg(zzit zzit) {
        if (zzit == null || zzit.zzo()) {
            return zzit;
        }
        zzje A0Y = BE6.A0Y(new zzlk(zzit).getMessage());
        A0Y.zza = zzit;
        throw A0Y;
    }

    public static zzit zzr(Class cls) {
        Map map = zzb;
        zzit zzit = (zzit) map.get(cls);
        if (zzit == null) {
            try {
                BEA.A1C(cls);
                zzit = (zzit) map.get(cls);
                if (zzit == null) {
                    zzit = (zzit) ((zzit) zzlv.zze(cls)).zzh(6, (Object) null, (Object) null);
                    if (zzit != null) {
                        map.put(cls, zzit);
                    } else {
                        throw BE6.A0k();
                    }
                }
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        return zzit;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.RuntimeException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.RuntimeException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.RuntimeException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.RuntimeException} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r0 == false) goto L_0x0049;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.recaptcha.internal.zzit zzt(com.google.android.recaptcha.internal.zzit r5, java.io.InputStream r6) {
        /*
            if (r6 != 0) goto L_0x0010
            byte[] r1 = com.google.android.recaptcha.internal.zzjc.zzd
            r0 = 0
            com.google.android.recaptcha.internal.zzhc r4 = com.google.android.recaptcha.internal.zzhc.zzH(r1, r0, r0, r0)
        L_0x0009:
            com.google.android.recaptcha.internal.zzie r3 = com.google.android.recaptcha.internal.zzie.zza
            com.google.android.recaptcha.internal.zzit r2 = r5.zzs()
            goto L_0x0019
        L_0x0010:
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = 0
            com.google.android.recaptcha.internal.zzha r4 = new com.google.android.recaptcha.internal.zzha
            r4.<init>(r6, r1, r0)
            goto L_0x0009
        L_0x0019:
            com.google.android.recaptcha.internal.zzkr r1 = X.BE9.A0T(r2)     // Catch:{ zzje -> 0x0056, zzlk -> 0x004a, IOException -> 0x002b, RuntimeException -> 0x003c }
            com.google.android.recaptcha.internal.zzhd r0 = com.google.android.recaptcha.internal.zzhd.zzq(r4)     // Catch:{ zzje -> 0x0056, zzlk -> 0x004a, IOException -> 0x002b, RuntimeException -> 0x003c }
            r1.zzh(r2, r0, r3)     // Catch:{ zzje -> 0x0056, zzlk -> 0x004a, IOException -> 0x002b, RuntimeException -> 0x003c }
            r1.zzf(r2)     // Catch:{ zzje -> 0x0056, zzlk -> 0x004a, IOException -> 0x002b, RuntimeException -> 0x003c }
            zzg(r2)
            return r2
        L_0x002b:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof com.google.android.recaptcha.internal.zzje
            if (r0 != 0) goto L_0x0045
            com.google.android.recaptcha.internal.zzje r0 = new com.google.android.recaptcha.internal.zzje
            r0.<init>((java.io.IOException) r1)
            r0.zza = r2
            throw r0
        L_0x003c:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof com.google.android.recaptcha.internal.zzje
            if (r0 == 0) goto L_0x0049
        L_0x0045:
            java.lang.Throwable r1 = r1.getCause()
        L_0x0049:
            throw r1
        L_0x004a:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.google.android.recaptcha.internal.zzje r0 = X.BE6.A0Y(r0)
            r0.zza = r2
            throw r0
        L_0x0056:
            r1 = move-exception
            boolean r0 = r1.zzb
            if (r0 == 0) goto L_0x0061
            com.google.android.recaptcha.internal.zzje r0 = new com.google.android.recaptcha.internal.zzje
            r0.<init>((java.io.IOException) r1)
            r1 = r0
        L_0x0061:
            r1.zza = r2
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzit.zzt(com.google.android.recaptcha.internal.zzit, java.io.InputStream):com.google.android.recaptcha.internal.zzit");
    }

    public static zziy zzv() {
        return zziu.zza;
    }

    public static zzja zzw() {
        return zzjt.zza;
    }

    public static zzjb zzx() {
        return zzko.zza;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return zzkn.zzb.zzb(cls).zzk(this, obj);
    }

    public final boolean zzG() {
        return AnonymousClass000.A1O(this.zzd & Integer.MIN_VALUE);
    }

    public static Object zzA(zzke zzke, String str, Object[] objArr) {
        return BE6.A0Z(zzke, str, objArr);
    }

    public static void zzD(Class cls, zzit zzit) {
        zzit.zzC();
        zzb.put(cls, zzit);
    }

    private final int zzf(zzkr zzkr) {
        return BE9.A0T(this).zza(this);
    }

    public static zzit zzi(zzit zzit, byte[] bArr, int i, int i2, zzie zzie) {
        zzje e;
        zzit zzs = zzit.zzs();
        try {
            zzkr A0T = BE9.A0T(zzs);
            A0T.zzi(zzs, bArr, 0, i2, new zzgj(zzie));
            A0T.zzf(zzs);
            return zzs;
        } catch (zzje e2) {
            e = e2;
            if (e.zzb) {
                e = new zzje((IOException) e);
            }
            e.zza = zzs;
            throw e;
        } catch (zzlk e3) {
            e = BE6.A0Y(e3.getMessage());
            e.zza = zzs;
            throw e;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzje) {
                throw e4.getCause();
            }
            zzje zzje = new zzje(e4);
            zzje.zza = zzs;
            throw zzje;
        } catch (IndexOutOfBoundsException unused) {
            e = BE7.A0L();
            e.zza = zzs;
            throw e;
        }
    }

    public static zzjb zzy(zzjb zzjb) {
        return zzjb.zzd(BEA.A0B(zzjb));
    }

    public static Object zzz(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw BE6.A0o("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw BE6.A0o("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final int hashCode() {
        if (zzG()) {
            return BE9.A0T(this).zzb(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = BE9.A0T(this).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final String toString() {
        return zzkg.zza(this, super.toString());
    }

    public final void zzB() {
        BE9.A0T(this).zzf(this);
        zzC();
    }

    public final int zza(zzkr zzkr) {
        int i;
        if (zzG()) {
            i = zzkr.zza(this);
            if (i < 0) {
                throw AnonymousClass8BX.A0W("serialized size must be non-negative, was ", AnonymousClass000.A10(), i);
            }
        } else {
            int i2 = this.zzd & Integer.MAX_VALUE;
            if (i2 != Integer.MAX_VALUE) {
                return i2;
            }
            i = zzkr.zza(this);
            if (i >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
            } else {
                throw AnonymousClass8BX.A0W("serialized size must be non-negative, was ", AnonymousClass000.A10(), i);
            }
        }
        return i;
    }

    public final void zze(zzhh zzhh) {
        BE9.A0T(this).zzj(this, zzhi.zza(zzhh));
    }

    public final int zzm() {
        return BE9.A0T(this).zzb(this);
    }

    public final int zzn() {
        int i;
        if (zzG()) {
            i = BE9.A0T(this).zza(this);
            if (i < 0) {
                throw AnonymousClass8BX.A0W("serialized size must be non-negative, was ", AnonymousClass000.A10(), i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                int zza = BE9.A0T(this).zza(this);
                if (zza >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | zza;
                    return zza;
                }
                throw AnonymousClass8BX.A0W("serialized size must be non-negative, was ", AnonymousClass000.A10(), zza);
            }
        }
        return i;
    }
}
