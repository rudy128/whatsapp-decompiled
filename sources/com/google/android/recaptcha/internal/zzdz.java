package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass20T;
import X.BE6;
import X.BE8;
import X.BE9;
import X.BEA;
import X.C17880vN;
import X.C17890vO;
import X.C25411Oc;
import X.C26571Sq;
import X.C28851b7;
import X.C29351c6;
import X.C29431cG;
import java.util.ArrayList;
import java.util.Iterator;

public final class zzdz implements zzdd {
    public static final zzdz zza = new Object();

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

    public final Object zzb(Object obj, Object obj2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z = obj instanceof Byte;
        if (z && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z2 = obj instanceof Short;
        if (z2 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z3 = obj instanceof Integer;
        if (z3 && (obj2 instanceof Integer)) {
            return Integer.valueOf(AnonymousClass000.A0M(obj) ^ AnonymousClass000.A0M(obj2));
        }
        boolean z4 = obj instanceof Long;
        if (!z4 || !(obj2 instanceof Long)) {
            int i = 0;
            if (obj instanceof String) {
                if (obj2 instanceof Byte) {
                    byte[] bytes = ((String) obj).getBytes(C26571Sq.A05);
                    int length = bytes.length;
                    ArrayList A0z = C17880vN.A0z(length);
                    while (i < length) {
                        BEA.A1M(obj2, A0z, bytes, i);
                        i++;
                    }
                    return C29431cG.A1A(A0z);
                } else if (obj2 instanceof Integer) {
                    char[] charArray = ((String) obj).toCharArray();
                    int length2 = charArray.length;
                    ArrayList A0z2 = C17880vN.A0z(length2);
                    while (i < length2) {
                        C17890vO.A1D(A0z2, charArray[i] ^ AnonymousClass000.A0M(obj2));
                        i++;
                    }
                    return C29431cG.A1B(A0z2);
                }
            }
            if (z && (obj2 instanceof byte[])) {
                byte[] bArr = (byte[]) obj2;
                int length3 = bArr.length;
                arrayList = C17880vN.A0z(length3);
                for (int i2 = 0; i2 < length3; i2++) {
                    BEA.A1M(obj, arrayList, bArr, i2);
                }
            } else if (z2 && (obj2 instanceof short[])) {
                ArrayList A0z3 = C17880vN.A0z(r4);
                for (short shortValue : (short[]) obj2) {
                    A0z3.add(Short.valueOf((short) (shortValue ^ ((Number) obj).shortValue())));
                }
                return A0z3.toArray(new Short[0]);
            } else if (!z3 || !(obj2 instanceof int[])) {
                if (!z4 || !(obj2 instanceof long[])) {
                    boolean z5 = obj instanceof byte[];
                    if (!z5 || !(obj2 instanceof Byte)) {
                        boolean z6 = obj instanceof short[];
                        if (!z6 || !(obj2 instanceof Short)) {
                            boolean z7 = obj instanceof int[];
                            if (!z7 || !(obj2 instanceof Integer)) {
                                boolean z8 = obj instanceof long[];
                                if (z8 && (obj2 instanceof Long)) {
                                    arrayList2 = C17880vN.A0z(r7);
                                    for (long A05 : (long[]) obj) {
                                        C17880vN.A1R(arrayList2, A05 ^ C17880vN.A05(obj2));
                                    }
                                } else if (z5 && (obj2 instanceof byte[])) {
                                    byte[] bArr2 = (byte[]) obj;
                                    int length4 = bArr2.length;
                                    byte[] bArr3 = (byte[]) obj2;
                                    zzdc.zza(this, length4, bArr3.length);
                                    C25411Oc A08 = C28851b7.A08(0, length4);
                                    ArrayList A0E = C29351c6.A0E(A08);
                                    Iterator it = A08.iterator();
                                    while (it.hasNext()) {
                                        int A00 = ((AnonymousClass20T) it).A00();
                                        A0E.add(Byte.valueOf((byte) (bArr3[A00] ^ bArr2[A00])));
                                    }
                                    return A0E.toArray(new Byte[0]);
                                } else if (z6 && (obj2 instanceof short[])) {
                                    short[] sArr = (short[]) obj;
                                    int length5 = sArr.length;
                                    short[] sArr2 = (short[]) obj2;
                                    zzdc.zza(this, length5, sArr2.length);
                                    C25411Oc A082 = C28851b7.A08(0, length5);
                                    ArrayList A0E2 = C29351c6.A0E(A082);
                                    Iterator it2 = A082.iterator();
                                    while (it2.hasNext()) {
                                        int A002 = ((AnonymousClass20T) it2).A00();
                                        A0E2.add(Short.valueOf((short) (sArr2[A002] ^ sArr[A002])));
                                    }
                                    return A0E2.toArray(new Short[0]);
                                } else if (z7 && (obj2 instanceof int[])) {
                                    int[] iArr = (int[]) obj;
                                    int length6 = iArr.length;
                                    int[] iArr2 = (int[]) obj2;
                                    zzdc.zza(this, length6, iArr2.length);
                                    C25411Oc A083 = C28851b7.A08(0, length6);
                                    ArrayList A0E3 = C29351c6.A0E(A083);
                                    Iterator it3 = A083.iterator();
                                    while (it3.hasNext()) {
                                        int A003 = ((AnonymousClass20T) it3).A00();
                                        C17890vO.A1D(A0E3, iArr2[A003] ^ iArr[A003]);
                                    }
                                    return A0E3.toArray(new Integer[0]);
                                } else if (!z8 || !(obj2 instanceof long[])) {
                                    throw BE9.A0S(5);
                                } else {
                                    long[] jArr = (long[]) obj;
                                    int length7 = jArr.length;
                                    long[] jArr2 = (long[]) obj2;
                                    zzdc.zza(this, length7, jArr2.length);
                                    C25411Oc A084 = C28851b7.A08(0, length7);
                                    arrayList2 = C29351c6.A0E(A084);
                                    Iterator it4 = A084.iterator();
                                    while (it4.hasNext()) {
                                        int A004 = ((AnonymousClass20T) it4).A00();
                                        C17880vN.A1R(arrayList2, jArr2[A004] ^ jArr[A004]);
                                    }
                                }
                            } else {
                                ArrayList A0z4 = C17880vN.A0z(r4);
                                for (int A0M : (int[]) obj) {
                                    C17890vO.A1D(A0z4, A0M ^ AnonymousClass000.A0M(obj2));
                                }
                                return A0z4.toArray(new Integer[0]);
                            }
                        } else {
                            ArrayList A0z5 = C17880vN.A0z(r4);
                            for (short shortValue2 : (short[]) obj) {
                                A0z5.add(Short.valueOf((short) (shortValue2 ^ ((Number) obj2).shortValue())));
                            }
                            return A0z5.toArray(new Short[0]);
                        }
                    } else {
                        byte[] bArr4 = (byte[]) obj;
                        int length8 = bArr4.length;
                        arrayList = C17880vN.A0z(length8);
                        for (int i3 = 0; i3 < length8; i3++) {
                            BEA.A1M(obj2, arrayList, bArr4, i3);
                        }
                    }
                } else {
                    arrayList2 = C17880vN.A0z(r7);
                    for (long A052 : (long[]) obj2) {
                        C17880vN.A1R(arrayList2, A052 ^ C17880vN.A05(obj));
                    }
                }
                return arrayList2.toArray(new Long[0]);
            } else {
                ArrayList A0z6 = C17880vN.A0z(r4);
                for (int A0M2 : (int[]) obj2) {
                    C17890vO.A1D(A0z6, A0M2 ^ AnonymousClass000.A0M(obj));
                }
                return A0z6.toArray(new Integer[0]);
            }
            return arrayList.toArray(new Byte[0]);
        }
        return Long.valueOf(C17880vN.A05(obj2) ^ C17880vN.A05(obj));
    }
}
