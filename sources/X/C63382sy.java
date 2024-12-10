package X;

import android.graphics.Path;

/* renamed from: X.2sy  reason: invalid class name and case insensitive filesystem */
public abstract class C63382sy {
    public static void A01(Path path, C63012sM[] r38) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float[] fArr = new float[6];
        int length = r38.length;
        char c = 'm';
        for (int i2 = 0; i2 < length; i2++) {
            C63012sM r23 = r38[i2];
            C63012sM r0 = r23;
            char c2 = r0.A00;
            float[] fArr2 = r0.A01;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[2];
            float f15 = fArr[3];
            float f16 = fArr[4];
            float f17 = fArr[5];
            Path path2 = path;
            switch (c2) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case C166418cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER /*67*/:
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case C166418cr.STICKER_PACK_MESSAGE_FIELD_NUMBER /*86*/:
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case C166418cr.ALBUM_MESSAGE_FIELD_NUMBER /*83*/:
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    f12 = f16;
                    float f18 = f17;
                    path2.moveTo(f12, f18);
                    f14 = f12;
                    f13 = f18;
                    f15 = f18;
                    break;
            }
            i = 2;
            int i3 = 0;
            while (i3 < fArr2.length) {
                if (c2 == 'A') {
                    int i4 = i3 + 5;
                    int i5 = i3 + 6;
                    C63012sM.A00(path2, f4, f3, fArr2[i4], fArr2[i5], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], AnonymousClass000.A1O((fArr2[i3 + 3] > 0.0f ? 1 : (fArr2[i3 + 3] == 0.0f ? 0 : -1))), AnonymousClass000.A1O((fArr2[i3 + 4] > 0.0f ? 1 : (fArr2[i3 + 4] == 0.0f ? 0 : -1))));
                    f5 = fArr2[i4];
                    f3 = fArr2[i5];
                    f2 = f3;
                    f = f4;
                } else if (c2 == 'C') {
                    int i6 = i3 + 2;
                    int i7 = i3 + 3;
                    int i8 = i3 + 4;
                    int i9 = i3 + 5;
                    path2.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i9]);
                    f4 = fArr2[i8];
                    f3 = fArr2[i9];
                    f = fArr2[i6];
                    f2 = fArr2[i7];
                } else if (c2 == 'H') {
                    path2.lineTo(fArr2[i3], f3);
                    f4 = fArr2[i3];
                } else if (c2 == 'Q') {
                    int i10 = i3 + 1;
                    int i11 = i3 + 2;
                    int i12 = i3 + 3;
                    path2.quadTo(fArr2[i3], fArr2[i10], fArr2[i11], fArr2[i12]);
                    f = fArr2[i3];
                    f2 = fArr2[i10];
                    f4 = fArr2[i11];
                    f3 = fArr2[i12];
                } else if (c2 == 'V') {
                    path2.lineTo(f4, fArr2[i3]);
                    f3 = fArr2[i3];
                } else if (c2 != 'a') {
                    if (c2 == 'c') {
                        int i13 = i3 + 2;
                        int i14 = i3 + 3;
                        int i15 = i3 + 4;
                        int i16 = i3 + 5;
                        path2.rCubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i13], fArr2[i14], fArr2[i15], fArr2[i16]);
                        f = fArr2[i13] + f4;
                        f2 = fArr2[i14] + f3;
                        f4 += fArr2[i15];
                        f6 = fArr2[i16];
                    } else if (c2 == 'h') {
                        path2.rLineTo(fArr2[i3], 0.0f);
                        f4 += fArr2[i3];
                    } else if (c2 != 'q') {
                        if (c2 == 'v') {
                            path2.rLineTo(0.0f, fArr2[i3]);
                            f7 = fArr2[i3];
                        } else if (c2 != 'L') {
                            if (c2 == 'M') {
                                f4 = fArr2[i3];
                                f3 = fArr2[i3 + 1];
                                if (i3 > 0) {
                                    path2.lineTo(f4, f3);
                                } else {
                                    path2.moveTo(f4, f3);
                                }
                            } else if (c2 == 'S') {
                                if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                    f4 = (f4 * 2.0f) - f;
                                    f3 = (f3 * 2.0f) - f2;
                                }
                                int i17 = i3 + 1;
                                int i18 = i3 + 2;
                                int i19 = i3 + 3;
                                path2.cubicTo(f4, f3, fArr2[i3], fArr2[i17], fArr2[i18], fArr2[i19]);
                                f = fArr2[i3];
                                f2 = fArr2[i17];
                                f4 = fArr2[i18];
                                f3 = fArr2[i19];
                            } else if (c2 == 'T') {
                                if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                    f4 = (f4 * 2.0f) - f;
                                    f3 = (f3 * 2.0f) - f2;
                                }
                                int i20 = i3 + 1;
                                path2.quadTo(f4, f3, fArr2[i3], fArr2[i20]);
                                float f19 = fArr2[i3];
                                float f20 = fArr2[i20];
                                f2 = f3;
                                f = f4;
                                f4 = f19;
                                f3 = f20;
                            } else if (c2 == 'l') {
                                int i21 = i3 + 1;
                                path2.rLineTo(fArr2[i3], fArr2[i21]);
                                f4 += fArr2[i3];
                                f7 = fArr2[i21];
                            } else if (c2 == 'm') {
                                float f21 = fArr2[i3];
                                f4 += f21;
                                float f22 = fArr2[i3 + 1];
                                f3 += f22;
                                if (i3 > 0) {
                                    path2.rLineTo(f21, f22);
                                } else {
                                    path2.rMoveTo(f21, f22);
                                }
                            } else if (c2 == 's') {
                                if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                    f8 = f4 - f;
                                    f9 = f3 - f2;
                                } else {
                                    f8 = 0.0f;
                                    f9 = 0.0f;
                                }
                                int i22 = i3 + 1;
                                int i23 = i3 + 2;
                                int i24 = i3 + 3;
                                path2.rCubicTo(f8, f9, fArr2[i3], fArr2[i22], fArr2[i23], fArr2[i24]);
                                f = fArr2[i3] + f4;
                                f2 = fArr2[i22] + f3;
                                f4 += fArr2[i23];
                                f6 = fArr2[i24];
                            } else if (c2 == 't') {
                                if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                    f10 = f4 - f;
                                    f11 = f3 - f2;
                                } else {
                                    f11 = 0.0f;
                                    f10 = 0.0f;
                                }
                                int i25 = i3 + 1;
                                path2.rQuadTo(f10, f11, fArr2[i3], fArr2[i25]);
                                f = f10 + f4;
                                f2 = f11 + f3;
                                f4 += fArr2[i3];
                                f3 += fArr2[i25];
                            }
                            f17 = f3;
                            f16 = f4;
                        } else {
                            int i26 = i3 + 1;
                            path2.lineTo(fArr2[i3], fArr2[i26]);
                            f4 = fArr2[i3];
                            f3 = fArr2[i26];
                        }
                        f3 += f7;
                    } else {
                        int i27 = i3 + 1;
                        int i28 = i3 + 2;
                        int i29 = i3 + 3;
                        path2.rQuadTo(fArr2[i3], fArr2[i27], fArr2[i28], fArr2[i29]);
                        f = fArr2[i3] + f4;
                        f2 = fArr2[i27] + f3;
                        f4 += fArr2[i28];
                        f6 = fArr2[i29];
                    }
                    f3 += f6;
                } else {
                    int i30 = i3 + 5;
                    int i31 = i3 + 6;
                    C63012sM.A00(path2, f4, f3, fArr2[i30] + f4, fArr2[i31] + f3, fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], AnonymousClass000.A1O((fArr2[i3 + 3] > 0.0f ? 1 : (fArr2[i3 + 3] == 0.0f ? 0 : -1))), AnonymousClass000.A1O((fArr2[i3 + 4] > 0.0f ? 1 : (fArr2[i3 + 4] == 0.0f ? 0 : -1))));
                    f5 = f4 + fArr2[i30];
                    f3 += fArr2[i31];
                    f2 = f3;
                    f = f4;
                }
                i3 += i;
                c = c2;
            }
            fArr[0] = f4;
            fArr[1] = f3;
            fArr[2] = f;
            fArr[3] = f2;
            fArr[4] = f16;
            fArr[5] = f17;
            c = r23.A00;
        }
    }

    public static boolean A02(C63012sM[] r5, C63012sM[] r6) {
        int length;
        if (!(r5 == null || r6 == null || (length = r5.length) != r6.length)) {
            int i = 0;
            while (i < length) {
                if (r5[i].A00 == r6[i].A00 && r5[i].A01.length == r6[i].A01.length) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public static Path A00(String str) {
        Path path = new Path();
        try {
            A01(path, A03(str));
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException(AnonymousClass001.A1H("Error in parsing ", str, AnonymousClass000.A10()), e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0095, code lost:
        r12 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cd A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C63012sM[] A03(java.lang.String r15) {
        /*
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r5 = 0
            r8 = 1
            r7 = 1
            r6 = 0
        L_0x0008:
            int r3 = r15.length()
            if (r7 < r3) goto L_0x002a
            int r7 = r7 - r6
            if (r7 != r8) goto L_0x0021
            if (r6 >= r3) goto L_0x0021
            char r2 = r15.charAt(r6)
            float[] r1 = new float[r5]
            X.2sM r0 = new X.2sM
            r0.<init>(r1, r2)
            r4.add(r0)
        L_0x0021:
            X.2sM[] r0 = new X.C63012sM[r5]
            java.lang.Object[] r0 = r4.toArray(r0)
            X.2sM[] r0 = (X.C63012sM[]) r0
            return r0
        L_0x002a:
            if (r7 >= r3) goto L_0x0046
            char r2 = r15.charAt(r7)
            int r1 = r2 + -65
            int r0 = r2 + -90
            int r1 = r1 * r0
            if (r1 <= 0) goto L_0x003e
            int r1 = r2 + -97
            int r0 = r2 + -122
            int r1 = r1 * r0
            if (r1 > 0) goto L_0x0066
        L_0x003e:
            r0 = 101(0x65, float:1.42E-43)
            if (r2 == r0) goto L_0x0066
            r0 = 69
            if (r2 == r0) goto L_0x0066
        L_0x0046:
            r14 = r7
            java.lang.String r0 = r15.substring(r6, r7)
            java.lang.String r3 = r0.trim()
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00cd
            char r1 = r3.charAt(r5)
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 == r0) goto L_0x00bf
            char r1 = r3.charAt(r5)
            r0 = 90
            if (r1 == r0) goto L_0x00bf
            goto L_0x0069
        L_0x0066:
            int r7 = r7 + 1
            goto L_0x002a
        L_0x0069:
            int r9 = r3.length()     // Catch:{ NumberFormatException -> 0x00d8 }
            float[] r7 = new float[r9]     // Catch:{ NumberFormatException -> 0x00d8 }
            r11 = 1
            r6 = 0
        L_0x0071:
            if (r11 >= r9) goto L_0x00b3
            r13 = 0
            r2 = r11
            r12 = 0
            r10 = 0
        L_0x0077:
            if (r2 >= r9) goto L_0x0087
            char r1 = r3.charAt(r2)     // Catch:{ NumberFormatException -> 0x00d8 }
            r0 = 32
            if (r1 == r0) goto L_0x0087
            goto L_0x008a
        L_0x0082:
            if (r2 == r11) goto L_0x0095
            if (r12 != 0) goto L_0x0095
        L_0x0086:
            r13 = 1
        L_0x0087:
            if (r11 >= r2) goto L_0x00ad
            goto L_0x00a0
        L_0x008a:
            r0 = 69
            if (r1 == r0) goto L_0x009e
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L_0x009e
            switch(r1) {
                case 44: goto L_0x0087;
                case 45: goto L_0x0082;
                case 46: goto L_0x0099;
                default: goto L_0x0095;
            }     // Catch:{ NumberFormatException -> 0x00d8 }
        L_0x0095:
            r12 = 0
        L_0x0096:
            int r2 = r2 + 1
            goto L_0x0077
        L_0x0099:
            if (r10 != 0) goto L_0x0086
            r12 = 0
            r10 = 1
            goto L_0x0096
        L_0x009e:
            r12 = 1
            goto L_0x0096
        L_0x00a0:
            int r1 = r6 + 1
            java.lang.String r0 = r3.substring(r11, r2)     // Catch:{ NumberFormatException -> 0x00d8 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x00d8 }
            r7[r6] = r0     // Catch:{ NumberFormatException -> 0x00d8 }
            r6 = r1
        L_0x00ad:
            int r11 = r2 + 1
            if (r13 == 0) goto L_0x0071
            r11 = r2
            goto L_0x0071
        L_0x00b3:
            if (r5 > r6) goto L_0x00d2
            int r0 = java.lang.Math.min(r6, r9)     // Catch:{ NumberFormatException -> 0x00d8 }
            float[] r2 = new float[r6]     // Catch:{ NumberFormatException -> 0x00d8 }
            java.lang.System.arraycopy(r7, r5, r2, r5, r0)     // Catch:{ NumberFormatException -> 0x00d8 }
            goto L_0x00c1
        L_0x00bf:
            float[] r2 = new float[r5]
        L_0x00c1:
            char r1 = r3.charAt(r5)
            X.2sM r0 = new X.2sM
            r0.<init>(r2, r1)
            r4.add(r0)
        L_0x00cd:
            int r7 = r14 + 1
            r6 = r14
            goto L_0x0008
        L_0x00d2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ NumberFormatException -> 0x00d8 }
            r0.<init>()     // Catch:{ NumberFormatException -> 0x00d8 }
            throw r0     // Catch:{ NumberFormatException -> 0x00d8 }
        L_0x00d8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "error in parsing \""
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "\""
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63382sy.A03(java.lang.String):X.2sM[]");
    }
}
