package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass20T;
import X.AnonymousClass8BR;
import X.BE6;
import X.BE7;
import X.BE8;
import X.BE9;
import X.C17880vN;
import X.C17890vO;
import X.C25411Oc;
import X.C26571Sq;
import X.C28851b7;
import X.C29351c6;
import X.C29431cG;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

public final class zzdn implements zzdd {
    public static final zzdn zza = new Object();

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
                try {
                    zzcj.zze.zzf(i, zzb(A0k, A0b));
                } catch (ArithmeticException e) {
                    throw BE6.A0V(e, 4, 6);
                }
            } else {
                throw BE6.A0V((Throwable) null, 4, 5);
            }
        } else {
            throw BE8.A0P();
        }
    }

    private final Object zzb(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z3 = obj instanceof Byte;
        if ((z3 && (obj2 instanceof Byte)) || ((((z = obj instanceof Short)) && (obj2 instanceof Short)) || (((z2 = obj instanceof Integer)) && (obj2 instanceof Integer)))) {
            return Integer.valueOf(AnonymousClass000.A0M(obj) % AnonymousClass000.A0M(obj2));
        }
        boolean z4 = obj instanceof Long;
        if (z4 && (obj2 instanceof Long)) {
            return Long.valueOf(C17880vN.A05(obj) % C17880vN.A05(obj2));
        }
        boolean z5 = obj instanceof Float;
        if (z5 && (obj2 instanceof Float)) {
            return Float.valueOf(AnonymousClass000.A04(obj) % AnonymousClass000.A04(obj2));
        }
        boolean z6 = obj instanceof Double;
        if (z6 && (obj2 instanceof Double)) {
            return Double.valueOf(AnonymousClass8BR.A00(obj) % AnonymousClass8BR.A00(obj2));
        }
        int i = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                Charset charset = C26571Sq.A05;
                byte[] bytes = ((String) obj).getBytes(charset);
                int length = bytes.length;
                ArrayList A0z = C17880vN.A0z(length);
                while (i < length) {
                    A0z.add(Byte.valueOf((byte) (bytes[i] % AnonymousClass000.A0M(obj2))));
                    i++;
                }
                return BE6.A0q(charset, C29431cG.A1A(A0z));
            } else if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                arrayList = C17880vN.A0z(length2);
                while (i < length2) {
                    C17890vO.A1D(arrayList, charArray[i] % AnonymousClass000.A0M(obj2));
                    i++;
                }
                return C29431cG.A1B(arrayList);
            }
        }
        if (z3 && (obj2 instanceof byte[])) {
            ArrayList A0z2 = C17880vN.A0z(r4);
            for (byte A0M : (byte[]) obj2) {
                C17890vO.A1D(A0z2, A0M % AnonymousClass000.A0M(obj));
            }
            return A0z2.toArray(new Integer[0]);
        } else if (z && (obj2 instanceof short[])) {
            ArrayList A0z3 = C17880vN.A0z(r4);
            for (short A0M2 : (short[]) obj2) {
                C17890vO.A1D(A0z3, A0M2 % AnonymousClass000.A0M(obj));
            }
            return A0z3.toArray(new Integer[0]);
        } else if (!z2 || !(obj2 instanceof int[])) {
            if (z4 && (obj2 instanceof long[])) {
                arrayList2 = C17880vN.A0z(r7);
                for (long A05 : (long[]) obj2) {
                    C17880vN.A1R(arrayList2, A05 % C17880vN.A05(obj));
                }
            } else if (!z5 || !(obj2 instanceof float[])) {
                if (!z6 || !(obj2 instanceof double[])) {
                    boolean z7 = obj instanceof byte[];
                    if (!z7 || !(obj2 instanceof Byte)) {
                        boolean z8 = obj instanceof short[];
                        if (!z8 || !(obj2 instanceof Short)) {
                            boolean z9 = obj instanceof int[];
                            if (!z9 || !(obj2 instanceof Integer)) {
                                boolean z10 = obj instanceof long[];
                                if (!z10 || !(obj2 instanceof Long)) {
                                    boolean z11 = obj instanceof float[];
                                    if (!z11 || !(obj2 instanceof Float)) {
                                        boolean z12 = obj instanceof double[];
                                        if (z12 && (obj2 instanceof Double)) {
                                            arrayList3 = C17880vN.A0z(r7);
                                            for (double A00 : (double[]) obj) {
                                                arrayList3.add(Double.valueOf(A00 % AnonymousClass8BR.A00(obj2)));
                                            }
                                        } else if (z7 && (obj2 instanceof byte[])) {
                                            byte[] bArr = (byte[]) obj;
                                            int length3 = bArr.length;
                                            byte[] bArr2 = (byte[]) obj2;
                                            zzdc.zza(this, length3, bArr2.length);
                                            C25411Oc A08 = C28851b7.A08(0, length3);
                                            ArrayList A0E = C29351c6.A0E(A08);
                                            Iterator it = A08.iterator();
                                            while (it.hasNext()) {
                                                int A002 = ((AnonymousClass20T) it).A00();
                                                C17890vO.A1D(A0E, bArr[A002] % bArr2[A002]);
                                            }
                                            return A0E.toArray(new Integer[0]);
                                        } else if (z8 && (obj2 instanceof short[])) {
                                            short[] sArr = (short[]) obj;
                                            int length4 = sArr.length;
                                            short[] sArr2 = (short[]) obj2;
                                            zzdc.zza(this, length4, sArr2.length);
                                            C25411Oc A082 = C28851b7.A08(0, length4);
                                            ArrayList A0E2 = C29351c6.A0E(A082);
                                            Iterator it2 = A082.iterator();
                                            while (it2.hasNext()) {
                                                int A003 = ((AnonymousClass20T) it2).A00();
                                                C17890vO.A1D(A0E2, sArr[A003] % sArr2[A003]);
                                            }
                                            return A0E2.toArray(new Integer[0]);
                                        } else if (z9 && (obj2 instanceof int[])) {
                                            int[] iArr = (int[]) obj;
                                            int length5 = iArr.length;
                                            int[] iArr2 = (int[]) obj2;
                                            zzdc.zza(this, length5, iArr2.length);
                                            C25411Oc A083 = C28851b7.A08(0, length5);
                                            ArrayList A0E3 = C29351c6.A0E(A083);
                                            Iterator it3 = A083.iterator();
                                            while (it3.hasNext()) {
                                                int A004 = ((AnonymousClass20T) it3).A00();
                                                C17890vO.A1D(A0E3, iArr[A004] % iArr2[A004]);
                                            }
                                            return A0E3.toArray(new Integer[0]);
                                        } else if (z10 && (obj2 instanceof long[])) {
                                            long[] jArr = (long[]) obj;
                                            int length6 = jArr.length;
                                            long[] jArr2 = (long[]) obj2;
                                            zzdc.zza(this, length6, jArr2.length);
                                            C25411Oc A084 = C28851b7.A08(0, length6);
                                            arrayList2 = C29351c6.A0E(A084);
                                            Iterator it4 = A084.iterator();
                                            while (it4.hasNext()) {
                                                int A005 = ((AnonymousClass20T) it4).A00();
                                                C17880vN.A1R(arrayList2, jArr[A005] % jArr2[A005]);
                                            }
                                        } else if (z11 && (obj2 instanceof float[])) {
                                            float[] fArr = (float[]) obj;
                                            int length7 = fArr.length;
                                            float[] fArr2 = (float[]) obj2;
                                            zzdc.zza(this, length7, fArr2.length);
                                            C25411Oc A085 = C28851b7.A08(0, length7);
                                            ArrayList A0E4 = C29351c6.A0E(A085);
                                            Iterator it5 = A085.iterator();
                                            while (it5.hasNext()) {
                                                int A006 = ((AnonymousClass20T) it5).A00();
                                                BE7.A1Q(A0E4, fArr[A006] % fArr2[A006]);
                                            }
                                            return A0E4.toArray(new Float[0]);
                                        } else if (!z12 || !(obj2 instanceof double[])) {
                                            throw BE9.A0S(5);
                                        } else {
                                            double[] dArr = (double[]) obj;
                                            int length8 = dArr.length;
                                            double[] dArr2 = (double[]) obj2;
                                            zzdc.zza(this, length8, dArr2.length);
                                            C25411Oc A086 = C28851b7.A08(0, length8);
                                            arrayList3 = C29351c6.A0E(A086);
                                            Iterator it6 = A086.iterator();
                                            while (it6.hasNext()) {
                                                int A007 = ((AnonymousClass20T) it6).A00();
                                                arrayList3.add(Double.valueOf(dArr[A007] % dArr2[A007]));
                                            }
                                        }
                                    } else {
                                        ArrayList A0z4 = C17880vN.A0z(r4);
                                        for (float A04 : (float[]) obj) {
                                            BE7.A1Q(A0z4, A04 % AnonymousClass000.A04(obj2));
                                        }
                                        return A0z4.toArray(new Float[0]);
                                    }
                                } else {
                                    arrayList2 = C17880vN.A0z(r7);
                                    for (long A052 : (long[]) obj) {
                                        C17880vN.A1R(arrayList2, A052 % C17880vN.A05(obj2));
                                    }
                                }
                            } else {
                                int[] iArr3 = (int[]) obj;
                                int length9 = iArr3.length;
                                arrayList = C17880vN.A0z(length9);
                                while (i < length9) {
                                    C17890vO.A1D(arrayList, iArr3[i] % AnonymousClass000.A0M(obj2));
                                    i++;
                                }
                                return C29431cG.A1B(arrayList);
                            }
                        } else {
                            ArrayList A0z5 = C17880vN.A0z(r4);
                            for (short A0M3 : (short[]) obj) {
                                C17890vO.A1D(A0z5, A0M3 % AnonymousClass000.A0M(obj2));
                            }
                            return A0z5.toArray(new Integer[0]);
                        }
                    } else {
                        ArrayList A0z6 = C17880vN.A0z(r4);
                        for (byte A0M4 : (byte[]) obj) {
                            C17890vO.A1D(A0z6, A0M4 % AnonymousClass000.A0M(obj2));
                        }
                        return A0z6.toArray(new Integer[0]);
                    }
                } else {
                    arrayList3 = C17880vN.A0z(r7);
                    for (double A008 : (double[]) obj2) {
                        arrayList3.add(Double.valueOf(A008 % AnonymousClass8BR.A00(obj)));
                    }
                }
                return arrayList3.toArray(new Double[0]);
            } else {
                ArrayList A0z7 = C17880vN.A0z(r4);
                for (float A042 : (float[]) obj2) {
                    BE7.A1Q(A0z7, A042 % AnonymousClass000.A04(obj));
                }
                return A0z7.toArray(new Float[0]);
            }
            return arrayList2.toArray(new Long[0]);
        } else {
            ArrayList A0z8 = C17880vN.A0z(r4);
            for (int A0M5 : (int[]) obj2) {
                C17890vO.A1D(A0z8, A0M5 % AnonymousClass000.A0M(obj));
            }
            return A0z8.toArray(new Integer[0]);
        }
    }
}
