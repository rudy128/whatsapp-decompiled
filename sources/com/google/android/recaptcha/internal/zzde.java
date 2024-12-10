package com.google.android.recaptcha.internal;

import X.AnonymousClass8BR;
import X.BE6;
import X.BE7;
import X.BE8;
import X.BE9;
import X.C17880vN;
import X.C18070vi;
import X.C18460wS;
import X.C200410p;
import X.C29351c6;
import java.util.ArrayList;
import java.util.List;

public final class zzde implements zzdd {
    public static final zzde zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 2) {
            Object A0k = BE9.A0k(zzcj, zzpqArr);
            if (true != (A0k instanceof Object)) {
                A0k = null;
            }
            if (A0k != null) {
                Object A0b = BE8.A0b(zzcj, zzpqArr, 1);
                if (true != (A0b instanceof Object) || A0b == null) {
                    throw BE6.A0V((Throwable) null, 4, 5);
                }
                zzcj.zze.zzf(i, zzb(A0k, A0b));
                return;
            }
            throw BE6.A0V((Throwable) null, 4, 5);
        }
        throw BE8.A0P();
    }

    public static final List zzc(Object obj) {
        Object obj2;
        if (obj instanceof byte[]) {
            return C200410p.A0L((byte[]) obj);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int i = 0;
            C18070vi.A0d(sArr, 0);
            int length = sArr.length;
            if (length != 0) {
                if (length != 1) {
                    ArrayList A0z = C17880vN.A0z(length);
                    do {
                        A0z.add(Short.valueOf(sArr[i]));
                        i++;
                    } while (i < length);
                    return A0z;
                }
                obj2 = Short.valueOf(sArr[0]);
            }
            return C18460wS.A00;
        } else if (obj instanceof int[]) {
            return C200410p.A0N((int[]) obj);
        } else {
            if (obj instanceof long[]) {
                return C200410p.A0O((long[]) obj);
            }
            if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                int i2 = 0;
                C18070vi.A0d(fArr, 0);
                int length2 = fArr.length;
                if (length2 != 0) {
                    if (length2 != 1) {
                        ArrayList A0z2 = C17880vN.A0z(length2);
                        do {
                            BE7.A1Q(A0z2, fArr[i2]);
                            i2++;
                        } while (i2 < length2);
                        return A0z2;
                    }
                    obj2 = Float.valueOf(fArr[0]);
                }
                return C18460wS.A00;
            } else if (!(obj instanceof double[])) {
                return null;
            } else {
                double[] dArr = (double[]) obj;
                C18070vi.A0d(dArr, 0);
                int length3 = dArr.length;
                if (length3 != 0) {
                    if (length3 != 1) {
                        ArrayList A0z3 = C17880vN.A0z(length3);
                        int i3 = 0;
                        do {
                            A0z3.add(Double.valueOf(dArr[i3]));
                            i3++;
                        } while (i3 < length3);
                        return A0z3;
                    }
                    obj2 = Double.valueOf(dArr[0]);
                }
                return C18460wS.A00;
            }
        }
        return C18070vi.A0M(obj2);
    }

    public final Object zzb(Object obj, Object obj2) {
        ArrayList arrayList;
        List<Object> zzc = zzc(obj);
        List<Object> zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(AnonymousClass8BR.A00(obj), AnonymousClass8BR.A00(obj2)));
            }
            if (zzc2 != null) {
                arrayList = C29351c6.A0E(zzc2);
                for (Object A00 : zzc2) {
                    arrayList.add(Double.valueOf(Math.pow(AnonymousClass8BR.A00(A00), AnonymousClass8BR.A00(obj))));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (zzc != null) {
            if (obj2 instanceof Number) {
                arrayList = C29351c6.A0E(zzc);
                for (Object A002 : zzc) {
                    arrayList.add(Double.valueOf(Math.pow(AnonymousClass8BR.A00(A002), AnonymousClass8BR.A00(obj2))));
                }
                return arrayList.toArray(new Double[0]);
            } else if (zzc2 != null) {
                zzdc.zza(this, zzc.size(), zzc2.size());
                int size = zzc.size();
                Double[] dArr = new Double[size];
                for (int i = 0; i < size; i++) {
                    dArr[i] = Double.valueOf(Math.pow(AnonymousClass8BR.A00(zzc.get(i)), AnonymousClass8BR.A00(zzc2.get(i))));
                }
                return dArr;
            }
        }
        throw BE9.A0S(5);
    }
}
