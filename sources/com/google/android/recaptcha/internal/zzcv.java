package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE8;
import X.BE9;
import X.C108955ca;
import X.C18070vi;
import X.C200410p;
import X.C22821Di;
import X.C29431cG;
import java.util.Collection;

public final class zzcv implements zzdd {
    public static final zzcv zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        StringBuilder sb;
        String A0H;
        String str;
        String str2;
        StringBuilder A0K;
        if (zzpqArr.length == 1) {
            Object A0k = BE9.A0k(zzcj, zzpqArr);
            if (true != (A0k instanceof Object)) {
                A0k = null;
            }
            if (A0k != null) {
                if (A0k instanceof int[]) {
                    int[] iArr = (int[]) A0k;
                    str = "]";
                    sb = C18070vi.A0K(iArr);
                    sb.append("[");
                    int i2 = 0;
                    for (int i3 : iArr) {
                        i2++;
                        if (i2 > 1) {
                            sb.append(",");
                        }
                        sb.append(String.valueOf(i3));
                    }
                    sb.append(str);
                    A0H = C18070vi.A0H(sb);
                } else if (A0k instanceof byte[]) {
                    A0H = C108955ca.A13((byte[]) A0k);
                } else {
                    if (A0k instanceof long[]) {
                        long[] jArr = (long[]) A0k;
                        str2 = "]";
                        A0K = C18070vi.A0K(jArr);
                        A0K.append("[");
                        int i4 = 0;
                        for (long j : jArr) {
                            i4++;
                            if (i4 > 1) {
                                A0K.append(",");
                            }
                            A0K.append(String.valueOf(j));
                        }
                    } else {
                        if (A0k instanceof short[]) {
                            short[] sArr = (short[]) A0k;
                            str = "]";
                            sb = C18070vi.A0K(sArr);
                            sb.append("[");
                            int i5 = 0;
                            for (short s : sArr) {
                                i5++;
                                if (i5 > 1) {
                                    sb.append(",");
                                }
                                sb.append(String.valueOf(s));
                            }
                        } else if (A0k instanceof float[]) {
                            float[] fArr = (float[]) A0k;
                            str = "]";
                            sb = C18070vi.A0K(fArr);
                            sb.append("[");
                            int i6 = 0;
                            for (float f : fArr) {
                                i6++;
                                if (i6 > 1) {
                                    sb.append(",");
                                }
                                sb.append(String.valueOf(f));
                            }
                        } else if (A0k instanceof double[]) {
                            double[] dArr = (double[]) A0k;
                            str2 = "]";
                            A0K = C18070vi.A0K(dArr);
                            A0K.append("[");
                            int i7 = 0;
                            for (double d : dArr) {
                                i7++;
                                if (i7 > 1) {
                                    A0K.append(",");
                                }
                                A0K.append(String.valueOf(d));
                            }
                        } else if (A0k instanceof char[]) {
                            A0H = new String((char[]) A0k);
                        } else if (A0k instanceof Object[]) {
                            A0H = C200410p.A0I(",", "[", "]", (Object[]) A0k);
                        } else if (A0k instanceof Collection) {
                            A0H = C29431cG.A0g(",", "[", "]", (Iterable) A0k, (C22821Di) null);
                        } else {
                            throw BE6.A0V((Throwable) null, 4, 5);
                        }
                        sb.append(str);
                        A0H = C18070vi.A0H(sb);
                    }
                    sb.append(str2);
                    A0H = C18070vi.A0H(sb);
                }
                zzcj.zze.zzf(i, A0H);
                return;
            }
            throw BE6.A0V((Throwable) null, 4, 5);
        }
        throw BE8.A0P();
    }
}
