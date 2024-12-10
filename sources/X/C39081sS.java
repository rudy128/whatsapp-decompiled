package X;

import java.util.Arrays;

/* renamed from: X.1sS  reason: invalid class name and case insensitive filesystem */
public class C39081sS implements C39041sO {
    public int A00 = 16;
    public int A01 = -1;
    public int A02 = 0;
    public float[] A03 = new float[16];
    public int[] A04 = new int[16];
    public int[] A05 = new int[16];
    public int[] A06 = new int[16];
    public int[] A07 = new int[16];
    public int[] A08 = new int[16];
    public final C38991sJ A09;
    public final C39001sK A0A;

    private void A00(C38971sH r3, float f, int i) {
        this.A08[i] = r3.A02;
        this.A03[i] = f;
        this.A07[i] = -1;
        this.A05[i] = -1;
        r3.A02(this.A09);
        r3.A05++;
        this.A02++;
    }

    public int A01(C38971sH r6) {
        if (this.A02 != 0) {
            int i = r6.A02;
            int i2 = this.A04[i % 16];
            if (i2 != -1) {
                int[] iArr = this.A08;
                if (iArr[i2] != i) {
                    while (true) {
                        i2 = this.A06[i2];
                        if (i2 == -1) {
                            break;
                        } else if (iArr[i2] == i) {
                            if (i2 == -1) {
                                return -1;
                            }
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }

    public void BJ3(float f) {
        int i = this.A02;
        int i2 = this.A01;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.A03;
            fArr[i2] = fArr[i2] / f;
            i2 = this.A05[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    public C38971sH BbG(int i) {
        int i2 = this.A02;
        if (i2 != 0) {
            int i3 = this.A01;
            int i4 = 0;
            while (i4 < i2) {
                if (i4 != i || i3 == -1) {
                    i3 = this.A05[i3];
                    if (i3 == -1) {
                        break;
                    }
                    i4++;
                } else {
                    return this.A0A.A03[this.A08[i3]];
                }
            }
        }
        return null;
    }

    public float BbH(int i) {
        int i2 = this.A02;
        int i3 = this.A01;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.A03[i3];
            }
            i3 = this.A05[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public void Bdo() {
        int i = this.A02;
        int i2 = this.A01;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.A03;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.A05[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    public float CRa(C38991sJ r10, boolean z) {
        C38971sH r0 = r10.A02;
        float BLx = BLx(r0);
        CET(r0, z);
        C39081sS r7 = (C39081sS) r10.A01;
        int i = r7.A02;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int[] iArr = r7.A08;
            if (iArr[i3] != -1) {
                BAn(this.A0A.A03[iArr[i3]], r7.A03[i3] * BLx, z);
                i2++;
            }
            i3++;
        }
        return BLx;
    }

    public void clear() {
        int i = this.A02;
        for (int i2 = 0; i2 < i; i2++) {
            C38971sH BbG = BbG(i2);
            if (BbG != null) {
                BbG.A03(this.A09);
            }
        }
        for (int i3 = 0; i3 < this.A00; i3++) {
            this.A08[i3] = -1;
            this.A06[i3] = -1;
        }
        int i4 = 0;
        do {
            this.A04[i4] = -1;
            i4++;
        } while (i4 < 16);
        this.A02 = 0;
        this.A01 = -1;
    }

    public String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append(" { ");
        String obj2 = sb.toString();
        int i = this.A02;
        for (int i2 = 0; i2 < i; i2++) {
            C38971sH BbG = BbG(i2);
            if (BbG != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj2);
                sb2.append(BbG);
                sb2.append(" = ");
                sb2.append(BbH(i2));
                sb2.append(" ");
                String obj3 = sb2.toString();
                int A012 = A01(BbG);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(obj3);
                sb3.append("[p: ");
                String obj4 = sb3.toString();
                int i3 = this.A07[A012];
                StringBuilder sb4 = new StringBuilder();
                if (i3 != -1) {
                    sb4.append(obj4);
                    sb4.append(this.A0A.A03[this.A08[i3]]);
                } else {
                    sb4.append(obj4);
                    sb4.append("none");
                }
                String obj5 = sb4.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(obj5);
                sb5.append(", n: ");
                String obj6 = sb5.toString();
                int i4 = this.A05[A012];
                if (i4 != -1) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(obj6);
                    sb6.append(this.A0A.A03[this.A08[i4]]);
                    obj = sb6.toString();
                } else {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(obj6);
                    sb7.append("none");
                    obj = sb7.toString();
                }
                StringBuilder sb8 = new StringBuilder();
                sb8.append(obj);
                sb8.append("]");
                obj2 = sb8.toString();
            }
        }
        StringBuilder sb9 = new StringBuilder();
        sb9.append(obj2);
        sb9.append(" }");
        return sb9.toString();
    }

    public C39081sS(C38991sJ r4, C39001sK r5) {
        this.A09 = r4;
        this.A0A = r5;
        clear();
    }

    public void BAn(C38971sH r7, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int A012 = A01(r7);
            if (A012 == -1) {
                CCz(r7, f);
                return;
            }
            float[] fArr = this.A03;
            float f2 = fArr[A012] + f;
            fArr[A012] = f2;
            if (f2 > -0.001f && f2 < 0.001f) {
                fArr[A012] = 0.0f;
                CET(r7, z);
            }
        }
    }

    public boolean BFk(C38971sH r4) {
        if (A01(r4) != -1) {
            return true;
        }
        return false;
    }

    public float BLx(C38971sH r3) {
        int A012 = A01(r3);
        if (A012 != -1) {
            return this.A03[A012];
        }
        return 0.0f;
    }

    public int BQ2() {
        return this.A02;
    }

    public void CCz(C38971sH r10, float f) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.A02;
            int i2 = 0;
            if (i == 0) {
                A00(r10, f, 0);
                int i3 = r10.A02 % 16;
                int[] iArr4 = this.A04;
                int i4 = iArr4[i3];
                if (i4 == -1) {
                    iArr4[i3] = 0;
                } else {
                    while (true) {
                        iArr3 = this.A06;
                        int i5 = iArr3[i4];
                        if (i5 == -1) {
                            break;
                        }
                        i4 = i5;
                    }
                    iArr3[i4] = 0;
                }
                this.A06[0] = -1;
                this.A01 = 0;
                return;
            }
            int A012 = A01(r10);
            if (A012 != -1) {
                this.A03[A012] = f;
                return;
            }
            int i6 = i + 1;
            int i7 = this.A00;
            if (i6 >= i7) {
                i7 *= 2;
                this.A08 = Arrays.copyOf(this.A08, i7);
                this.A03 = Arrays.copyOf(this.A03, i7);
                this.A07 = Arrays.copyOf(this.A07, i7);
                this.A05 = Arrays.copyOf(this.A05, i7);
                int[] copyOf = Arrays.copyOf(this.A06, i7);
                this.A06 = copyOf;
                for (int i8 = this.A00; i8 < i7; i8++) {
                    this.A08[i8] = -1;
                    copyOf[i8] = -1;
                }
                this.A00 = i7;
            }
            int i9 = this.A02;
            int i10 = this.A01;
            int i11 = -1;
            while (i2 < i9) {
                int[] iArr5 = this.A08;
                int i12 = iArr5[i10];
                int i13 = r10.A02;
                if (i12 != i13) {
                    if (iArr5[i10] < i13) {
                        i11 = i10;
                    }
                    i10 = this.A05[i10];
                    if (i10 == -1) {
                        break;
                    }
                    i2++;
                } else {
                    this.A03[i10] = f;
                    return;
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 < i7) {
                    if (this.A08[i14] == -1) {
                        break;
                    }
                    i14++;
                } else {
                    i14 = -1;
                    break;
                }
            }
            A00(r10, f, i14);
            int[] iArr6 = this.A07;
            if (i11 != -1) {
                iArr6[i14] = i11;
                iArr = this.A05;
                iArr[i14] = iArr[i11];
                iArr[i11] = i14;
            } else {
                iArr6[i14] = -1;
                int i15 = this.A02;
                iArr = this.A05;
                if (i15 > 0) {
                    iArr[i14] = this.A01;
                    this.A01 = i14;
                } else {
                    iArr[i14] = -1;
                }
            }
            int i16 = iArr[i14];
            if (i16 != -1) {
                iArr6[i16] = i14;
            }
            int i17 = r10.A02 % 16;
            int[] iArr7 = this.A04;
            int i18 = iArr7[i17];
            if (i18 == -1) {
                iArr7[i17] = i14;
            } else {
                while (true) {
                    iArr2 = this.A06;
                    int i19 = iArr2[i18];
                    if (i19 == -1) {
                        break;
                    }
                    i18 = i19;
                }
                iArr2[i18] = i14;
            }
            this.A06[i14] = -1;
            return;
        }
        CET(r10, true);
    }

    public float CET(C38971sH r10, boolean z) {
        int A012 = A01(r10);
        if (A012 == -1) {
            return 0.0f;
        }
        int i = r10.A02;
        int i2 = i % 16;
        int[] iArr = this.A04;
        int i3 = iArr[i2];
        if (i3 != -1) {
            int[] iArr2 = this.A08;
            if (iArr2[i3] == i) {
                int[] iArr3 = this.A06;
                iArr[i2] = iArr3[i3];
                iArr3[i3] = -1;
            } else {
                while (true) {
                    int[] iArr4 = this.A06;
                    int i4 = iArr4[i3];
                    if (i4 == -1) {
                        break;
                    } else if (iArr2[i4] != i) {
                        i3 = i4;
                    } else if (i4 != -1) {
                        iArr4[i3] = iArr4[i4];
                        iArr4[i4] = -1;
                    }
                }
            }
        }
        float f = this.A03[A012];
        if (this.A01 == A012) {
            this.A01 = this.A05[A012];
        }
        this.A08[A012] = -1;
        int[] iArr5 = this.A07;
        int i5 = iArr5[A012];
        if (i5 != -1) {
            int[] iArr6 = this.A05;
            iArr6[i5] = iArr6[A012];
        }
        int i6 = this.A05[A012];
        if (i6 != -1) {
            iArr5[i6] = iArr5[A012];
        }
        this.A02--;
        r10.A05--;
        if (z) {
            r10.A03(this.A09);
        }
        return f;
    }
}
