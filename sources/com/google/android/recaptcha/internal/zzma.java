package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.BE6;
import X.BE8;
import X.C17880vN;

public abstract class zzma {
    public static final zzlx zza = new Object();

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        if (i3 != 0) {
            if (i3 == 1) {
                byte b2 = bArr[i];
                if (b > -12) {
                    return -1;
                }
                byte b3 = (b2 << 8) ^ b;
                if (b2 > -65) {
                    return -1;
                }
                return b3;
            } else if (i3 == 2) {
                byte b4 = bArr[i];
                byte b5 = bArr[i + 1];
                if (b > -12 || b4 > -65 || b5 > -65) {
                    return -1;
                }
                return (b5 << 16) ^ ((b4 << 8) ^ b);
            } else {
                throw new AssertionError();
            }
        } else if (b <= -12) {
            return b;
        } else {
            return -1;
        }
    }

    public static String zzd(byte[] bArr, int i, int i2) {
        int i3;
        byte b;
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) >= 0) {
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (r13 < i4) {
                byte b2 = bArr[r13];
                if (b2 < 0) {
                    break;
                }
                i = r13 + 1;
                cArr[i3] = (char) b2;
                i5 = i3 + 1;
            }
            while (r13 < i4) {
                int i6 = r13 + 1;
                byte b3 = bArr[r13];
                if (b3 >= 0) {
                    int i7 = i3 + 1;
                    cArr[i3] = (char) b3;
                    r13 = i6;
                    while (true) {
                        i3 = i7;
                        if (r13 >= i4 || (b = bArr[r13]) < 0) {
                            break;
                        }
                        r13++;
                        i7++;
                        cArr[i3] = (char) b;
                    }
                } else {
                    if (b3 < -32) {
                        if (i6 < i4) {
                            r13 = i6 + 1;
                            zzlw.zzc(b3, bArr[i6], cArr, i3);
                            i3++;
                        }
                    } else if (b3 < -16) {
                        if (i6 < i4 - 1) {
                            int i8 = i6 + 1;
                            r13 = i8 + 1;
                            zzlw.zzb(b3, bArr[i6], bArr[i8], cArr, i3);
                            i3++;
                        }
                    } else if (i6 < i4 - 2) {
                        int i9 = i6 + 1;
                        int i10 = i9 + 1;
                        r13 = i10 + 1;
                        zzlw.zza(b3, bArr[i6], bArr[i9], bArr[i10], cArr, i3);
                        i3 += 2;
                    }
                    throw BE6.A0Y("Protocol message had invalid UTF-8.");
                }
            }
            return new String(cArr, 0, i3);
        }
        Object[] A1a = AnonymousClass8BR.A1a();
        C17880vN.A1T(A1a, length, 0);
        AnonymousClass000.A1M(A1a, i);
        AnonymousClass3Ma.A1S(A1a, i2);
        throw BE8.A0U("buffer length=%d, index=%d, size=%d", A1a);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.recaptcha.internal.zzlx, java.lang.Object] */
    static {
        boolean z = zzlv.zzb;
    }

    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzf(byte[] bArr, int i, int i2) {
        return zza.zzb(bArr, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        if (r9 < 2048) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zzb(java.lang.CharSequence r10, byte[] r11, int r12, int r13) {
        /*
            int r2 = r10.length()
            r3 = 0
        L_0x0005:
            int r7 = r12 + r13
            r6 = 128(0x80, float:1.794E-43)
            if (r3 >= r2) goto L_0x001a
            int r1 = r3 + r12
            if (r1 >= r7) goto L_0x001a
            char r0 = r10.charAt(r3)
            if (r0 >= r6) goto L_0x001a
            int r3 = X.BE6.A0A(r0, r11, r1, r3)
            goto L_0x0005
        L_0x001a:
            if (r3 != r2) goto L_0x001e
            int r12 = r12 + r2
        L_0x001d:
            return r12
        L_0x001e:
            int r12 = r12 + r3
        L_0x001f:
            if (r3 >= r2) goto L_0x001d
            char r9 = r10.charAt(r3)
            if (r9 >= r6) goto L_0x0032
            if (r12 >= r7) goto L_0x0036
            int r5 = r12 + 1
            byte r0 = (byte) r9
            r11[r12] = r0
        L_0x002e:
            r12 = r5
        L_0x002f:
            int r3 = r3 + 1
            goto L_0x001f
        L_0x0032:
            r0 = 2048(0x800, float:2.87E-42)
            if (r9 >= r0) goto L_0x0049
        L_0x0036:
            int r0 = r7 + -2
            if (r12 > r0) goto L_0x0049
            int r4 = r12 + 1
            int r5 = r4 + 1
            int r0 = r9 >>> 6
            r0 = r0 | 960(0x3c0, float:1.345E-42)
            byte r0 = (byte) r0
            r11[r12] = r0
        L_0x0045:
            X.BE7.A1U(r11, r9, r4)
            goto L_0x002e
        L_0x0049:
            r4 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r9 < r1) goto L_0x0053
            if (r9 <= r4) goto L_0x006a
        L_0x0053:
            int r0 = r7 + -3
            if (r12 > r0) goto L_0x006a
            int r1 = r12 + 1
            int r4 = r1 + 1
            int r5 = r4 + 1
            int r0 = r9 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            byte r0 = (byte) r0
            r11[r12] = r0
            int r0 = r9 >>> 6
            X.BE7.A1U(r11, r0, r1)
            goto L_0x0045
        L_0x006a:
            int r0 = r7 + -4
            if (r12 > r0) goto L_0x00ab
            int r8 = r3 + 1
            int r0 = r10.length()
            if (r8 == r0) goto L_0x00a3
            char r1 = r10.charAt(r8)
            boolean r0 = java.lang.Character.isSurrogatePair(r9, r1)
            r3 = r8
            if (r0 == 0) goto L_0x00a3
            int r5 = r12 + 1
            int r4 = r5 + 1
            int r3 = r4 + 1
            int r1 = java.lang.Character.toCodePoint(r9, r1)
            int r0 = r1 >>> 18
            r0 = r0 | 240(0xf0, float:3.36E-43)
            byte r0 = (byte) r0
            r11[r12] = r0
            int r0 = r1 >>> 12
            X.BE7.A1U(r11, r0, r5)
            int r0 = r1 >>> 6
            X.BE7.A1U(r11, r0, r4)
            int r12 = r3 + 1
            X.BE7.A1U(r11, r1, r3)
            r3 = r8
            goto L_0x002f
        L_0x00a3:
            int r1 = r3 + -1
            com.google.android.recaptcha.internal.zzlz r0 = new com.google.android.recaptcha.internal.zzlz
            r0.<init>(r1, r2)
            throw r0
        L_0x00ab:
            if (r9 < r1) goto L_0x00c3
            if (r9 > r4) goto L_0x00c3
            int r1 = r3 + 1
            int r0 = r10.length()
            if (r1 == r0) goto L_0x00bd
            boolean r0 = X.BE8.A1X(r10, r9, r1)
            if (r0 != 0) goto L_0x00c3
        L_0x00bd:
            com.google.android.recaptcha.internal.zzlz r0 = new com.google.android.recaptcha.internal.zzlz
            r0.<init>(r3, r2)
            throw r0
        L_0x00c3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed writing "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " at index "
            java.lang.ArrayIndexOutOfBoundsException r0 = X.BEA.A0Z(r0, r1, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    public static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new zzlz(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UTF-8 length does not fit in int: ");
        A10.append(((long) i3) + 4294967296L);
        throw AnonymousClass000.A0j(A10);
    }
}
