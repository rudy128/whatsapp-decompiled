package X;

import java.util.Arrays;

/* renamed from: X.09i  reason: invalid class name and case insensitive filesystem */
public final class C016509i extends C03710Kf {
    public static final C16380sA A0E = new AnonymousClass0WW(2);
    public final float A00;
    public final float A01;
    public final C16380sA A02;
    public final C16380sA A03;
    public final C16380sA A04;
    public final C16380sA A05;
    public final AnonymousClass0KB A06;
    public final AnonymousClass0KO A07;
    public final float[] A08;
    public final float[] A09;
    public final float[] A0A;
    public final C22821Di A0B;
    public final C22821Di A0C;
    public final boolean A0D;

    public static final float A02(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float A002 = ((((AnonymousClass000.A00(f, f4, f2, f5) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        if (A002 < 0.0f) {
            return -A002;
        }
        return A002;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            C016509i r5 = (C016509i) obj;
            if (Float.compare(r5.A01, this.A01) != 0 || Float.compare(r5.A00, this.A00) != 0 || !C18070vi.A18(this.A07, r5.A07) || !Arrays.equals(this.A09, r5.A09)) {
                return false;
            }
            AnonymousClass0KB r1 = this.A06;
            AnonymousClass0KB r0 = r5.A06;
            if (r1 != null) {
                return r1.equals(r0);
            }
            if (r0 != null) {
                if (C18070vi.A18(this.A05, r5.A05)) {
                    return C18070vi.A18(this.A03, r5.A03);
                }
                return false;
            }
        }
        return true;
    }

    public static final double A00(C016509i r8, double d) {
        return r8.A03.Bdp(C28851b7.A01(d, (double) r8.A01, (double) r8.A00));
    }

    public static final double A01(C016509i r5, double d) {
        return C28851b7.A01(r5.A05.Bdp(d), (double) r5.A01, (double) r5.A00);
    }

    public float A03(float f, float f2, float f3) {
        C16380sA r2 = this.A02;
        return AnonymousClass001.A07(this.A0A, (float) r2.Bdp((double) f), (float) r2.Bdp((double) f2), (float) r2.Bdp((double) f3));
    }

    public long A06(float f, float f2, float f3) {
        C16380sA r2 = this.A02;
        float Bdp = (float) r2.Bdp((double) f);
        float Bdp2 = (float) r2.Bdp((double) f2);
        float Bdp3 = (float) r2.Bdp((double) f3);
        float[] fArr = this.A0A;
        float A092 = AnonymousClass001.A09(fArr, Bdp, Bdp2, Bdp3);
        float A082 = AnonymousClass001.A08(fArr, Bdp, Bdp2, Bdp3);
        return (((long) Float.floatToRawIntBits(A092)) << 32) | (((long) Float.floatToRawIntBits(A082)) & 4294967295L);
    }

    public long A07(C03710Kf r7, float f, float f2, float f3, float f4) {
        float[] fArr = this.A08;
        float A092 = AnonymousClass001.A09(fArr, f, f2, f3);
        float A082 = AnonymousClass001.A08(fArr, f, f2, f3);
        float A072 = AnonymousClass001.A07(fArr, f, f2, f3);
        C16380sA r2 = this.A04;
        return AnonymousClass0Oy.A03(r7, (float) r2.Bdp((double) A092), (float) r2.Bdp((double) A082), (float) r2.Bdp((double) A072), f4);
    }

    public boolean A08() {
        return this.A0D;
    }

    public final C22821Di A09() {
        return this.A0B;
    }

    public final C22821Di A0A() {
        return this.A0C;
    }

    public int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int A0N = (AnonymousClass000.A0N(this.A07, super.hashCode() * 31) + Arrays.hashCode(this.A09)) * 31;
        float f = this.A01;
        int i = 0;
        if (f == 0.0f) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f);
        }
        int i2 = (A0N + floatToIntBits) * 31;
        float f2 = this.A00;
        if (f2 == 0.0f) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f2);
        }
        int i3 = (i2 + floatToIntBits2) * 31;
        AnonymousClass0KB r0 = this.A06;
        if (r0 != null) {
            i = r0.hashCode();
        }
        int i4 = i3 + i;
        if (r0 != null) {
            return i4;
        }
        return AnonymousClass000.A0O(this.A03, AnonymousClass000.A0N(this.A05, i4 * 31));
    }

    public float A04(int i) {
        return this.A00;
    }

    public float A05(int i) {
        return this.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C016509i(C16380sA r31, C16380sA r32, AnonymousClass0KB r33, AnonymousClass0KO r34, String str, float[] fArr, float[] fArr2, float f, float f2, int i) {
        super(str, AnonymousClass0MS.A01, i);
        boolean z;
        float[] fArr3 = fArr2;
        AnonymousClass0KO r8 = r34;
        this.A07 = r8;
        float f3 = f;
        this.A01 = f3;
        float f4 = f2;
        this.A00 = f4;
        this.A06 = r33;
        C16380sA r7 = r31;
        this.A05 = r7;
        this.A0C = new C10820ix(this);
        this.A04 = new AnonymousClass0WY(this, 0);
        C16380sA r6 = r32;
        this.A03 = r6;
        this.A0B = new C10810iw(this);
        this.A02 = new AnonymousClass0WY(this, 2);
        float[] fArr4 = fArr;
        int length = fArr4.length;
        if (length != 6 && length != 9) {
            throw AnonymousClass000.A0k("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        } else if (f < f2) {
            float[] fArr5 = new float[6];
            if (length == 9) {
                float f5 = fArr[0];
                float f6 = fArr[1];
                float f7 = f5 + f6 + fArr[2];
                fArr5[0] = f5 / f7;
                fArr5[1] = f6 / f7;
                float f8 = fArr[3];
                float f9 = fArr[4];
                float f10 = f8 + f9 + fArr[5];
                fArr5[2] = f8 / f10;
                fArr5[3] = f9 / f10;
                float f11 = fArr[6];
                float f12 = fArr[7];
                float f13 = f11 + f12 + fArr[8];
                fArr5[4] = f11 / f13;
                fArr5[5] = f12 / f13;
            } else {
                System.arraycopy(fArr4, 0, fArr5, 0, 6);
            }
            this.A09 = fArr5;
            if (fArr2 == null) {
                float f14 = fArr5[0];
                float f15 = fArr5[1];
                float f16 = fArr5[2];
                float f17 = fArr5[3];
                float f18 = fArr5[4];
                float f19 = fArr5[5];
                float f20 = r8.A00;
                float f21 = r8.A01;
                float f22 = 1.0f - f14;
                float f23 = f22 / f15;
                float f24 = 1.0f - f16;
                float f25 = 1.0f - f18;
                float f26 = f14 / f15;
                float f27 = (f16 / f17) - f26;
                float f28 = (f20 / f21) - f26;
                float f29 = (f24 / f17) - f23;
                float f30 = (f18 / f19) - f26;
                float f31 = (((((1.0f - f20) / f21) - f23) * f27) - (f28 * f29)) / ((((f25 / f19) - f23) * f27) - (f30 * f29));
                float f32 = (f28 - (f30 * f31)) / f27;
                float f33 = (1.0f - f32) - f31;
                float f34 = f33 / f15;
                float f35 = f32 / f17;
                float f36 = f31 / f19;
                fArr3 = new float[]{f34 * f14, f33, f34 * (f22 - f15), f35 * f16, f32, f35 * (f24 - f17), f36 * f18, f31, f36 * (f25 - f19)};
            } else {
                int length2 = fArr3.length;
                if (length2 != 9) {
                    throw AnonymousClass001.A13("Transform must have 9 entries! Has ", AnonymousClass000.A10(), length2);
                }
            }
            this.A0A = fArr3;
            this.A08 = C04960Pr.A03(fArr3);
            if (A02(fArr5) / A02(C03090Go.A0I) > 0.9f) {
                float[] fArr6 = C03090Go.A0J;
                float f37 = fArr5[0] - fArr6[0];
                float f38 = fArr5[1] - fArr6[1];
                float[] fArr7 = {f37, f38, fArr5[2] - fArr6[2], fArr5[3] - fArr6[3], fArr5[4] - fArr6[4], fArr5[5] - fArr6[5]};
                float f39 = fArr6[0];
                float f40 = f39 - fArr6[4];
                float f41 = fArr6[1];
                if (AnonymousClass000.A01(f37, f41 - fArr6[5], f38, f40) >= 0.0f) {
                    float f42 = fArr6[2];
                    float f43 = fArr6[3];
                    float f44 = fArr7[0];
                    if (AnonymousClass000.A01(f39 - f42, fArr7[1], f41 - f43, f44) >= 0.0f) {
                        AnonymousClass000.A01(fArr7[2], f43 - f41, fArr7[3], f42 - f39);
                    }
                }
            }
            if (i != 0) {
                float[] fArr8 = C03090Go.A0J;
                int i2 = 0;
                while (true) {
                    if (Float.compare(fArr5[i2], fArr8[i2]) != 0 && Math.abs(fArr5[i2] - fArr8[i2]) > 0.001f) {
                        break;
                    }
                    i2++;
                    if (i2 >= 6) {
                        if (C04960Pr.A02(r8, C03060Gl.A03) && f == 0.0f && f2 == 1.0f) {
                            C016509i r10 = C03090Go.A0G;
                            double d = 0.0d;
                            while (true) {
                                if (Math.abs(r7.Bdp(d) - r10.A05.Bdp(d)) > 0.001d) {
                                    break;
                                }
                                if (Math.abs(r6.Bdp(d) - r10.A03.Bdp(d)) > 0.001d) {
                                    break;
                                }
                                d += 0.00392156862745098d;
                                if (d > 1.0d) {
                                    break;
                                }
                            }
                        }
                    }
                }
                z = false;
            } else {
                z = true;
            }
            this.A0D = z;
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Invalid range: min=");
            A10.append(f3);
            A10.append(", max=");
            A10.append(f4);
            throw AnonymousClass001.A12("; min must be strictly < max", A10);
        }
    }

    public C016509i(AnonymousClass0KB r12, AnonymousClass0KO r13, String str, float[] fArr, int i) {
        this(new AnonymousClass0WY(r12, 3), new AnonymousClass0WY(r12, 1), r12, r13, str, fArr, (float[]) null, 0.0f, 1.0f, i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C016509i(X.AnonymousClass0KO r20, java.lang.String r21, float[] r22, double r23, float r25, float r26, int r27) {
        /*
            r19 = this;
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r9 = r23
            int r0 = (r23 > r11 ? 1 : (r23 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0035
            X.0sA r1 = A0E
        L_0x000a:
            int r0 = (r23 > r11 ? 1 : (r23 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x002e
            X.0sA r2 = A0E
        L_0x0010:
            r7 = 0
            r13 = 0
            X.0KB r3 = new X.0KB
            r17 = r13
            r8 = r3
            r15 = r13
            r8.<init>(r9, r11, r13, r15, r17)
            r0 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r8 = r25
            r9 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x002e:
            r0 = 1
            X.0WX r2 = new X.0WX
            r2.<init>(r0, r9)
            goto L_0x0010
        L_0x0035:
            r0 = 0
            X.0WX r1 = new X.0WX
            r1.<init>(r0, r9)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016509i.<init>(X.0KO, java.lang.String, float[], double, float, float, int):void");
    }
}
