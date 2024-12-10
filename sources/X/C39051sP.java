package X;

import java.util.Arrays;

/* renamed from: X.1sP  reason: invalid class name and case insensitive filesystem */
public class C39051sP implements C39041sO {
    public int A00 = 0;
    public int A01 = 8;
    public int A02 = -1;
    public int A03 = -1;
    public boolean A04 = false;
    public float[] A05 = new float[8];
    public int[] A06 = new int[8];
    public int[] A07 = new int[8];
    public final C38991sJ A08;
    public final C39001sK A09;

    public final void CCz(C38971sH r10, float f) {
        int length;
        if (f == 0.0f) {
            CET(r10, true);
            return;
        }
        int i = this.A02;
        if (i == -1) {
            this.A02 = 0;
            this.A05[0] = f;
            this.A06[0] = r10.A02;
            this.A07[0] = -1;
            r10.A05++;
            r10.A02(this.A08);
            this.A00++;
            if (!this.A04) {
                int i2 = this.A03 + 1;
                this.A03 = i2;
                length = this.A06.length;
                if (i2 < length) {
                    return;
                }
            } else {
                return;
            }
        } else {
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.A00) {
                int[] iArr = this.A06;
                int i5 = iArr[i];
                int i6 = r10.A02;
                if (i5 == i6) {
                    this.A05[i] = f;
                    return;
                }
                if (iArr[i] < i6) {
                    i4 = i;
                }
                i = this.A07[i];
                i3++;
            }
            int i7 = this.A03;
            int i8 = i7 + 1;
            if (this.A04) {
                int[] iArr2 = this.A06;
                if (iArr2[i7] != -1) {
                    i7 = iArr2.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr3 = this.A06;
            int length2 = iArr3.length;
            if (i7 >= length2 && this.A00 < length2) {
                int i9 = 0;
                while (true) {
                    if (i9 >= length2) {
                        break;
                    } else if (iArr3[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            if (i7 >= length2) {
                i7 = length2;
                int i10 = this.A01 * 2;
                this.A01 = i10;
                this.A04 = false;
                this.A03 = length2 - 1;
                this.A05 = Arrays.copyOf(this.A05, i10);
                this.A06 = Arrays.copyOf(this.A06, this.A01);
                this.A07 = Arrays.copyOf(this.A07, this.A01);
            }
            this.A06[i7] = r10.A02;
            this.A05[i7] = f;
            int[] iArr4 = this.A07;
            if (i4 != -1) {
                iArr4[i7] = iArr4[i4];
                iArr4[i4] = i7;
            } else {
                iArr4[i7] = this.A02;
                this.A02 = i7;
            }
            r10.A05++;
            r10.A02(this.A08);
            int i11 = this.A00 + 1;
            this.A00 = i11;
            if (!this.A04) {
                this.A03++;
            }
            length = this.A06.length;
            if (i11 >= length) {
                this.A04 = true;
            }
            if (this.A03 < length) {
                return;
            }
        }
        this.A04 = true;
        this.A03 = length - 1;
    }

    public boolean BFk(C38971sH r7) {
        int i = this.A02;
        if (i != -1) {
            int i2 = 0;
            while (i != -1 && i2 < this.A00) {
                if (this.A06[i] == r7.A02) {
                    return true;
                }
                i = this.A07[i];
                i2++;
            }
        }
        return false;
    }

    public void BJ3(float f) {
        int i = this.A02;
        int i2 = 0;
        while (i != -1 && i2 < this.A00) {
            float[] fArr = this.A05;
            fArr[i] = fArr[i] / f;
            i = this.A07[i];
            i2++;
        }
    }

    public final float BLx(C38971sH r5) {
        int i = this.A02;
        int i2 = 0;
        while (i != -1 && i2 < this.A00) {
            if (this.A06[i] == r5.A02) {
                return this.A05[i];
            }
            i = this.A07[i];
            i2++;
        }
        return 0.0f;
    }

    public C38971sH BbG(int i) {
        int i2 = this.A02;
        int i3 = 0;
        while (i2 != -1 && i3 < this.A00) {
            if (i3 == i) {
                return this.A09.A03[this.A06[i2]];
            }
            i2 = this.A07[i2];
            i3++;
        }
        return null;
    }

    public float BbH(int i) {
        int i2 = this.A02;
        int i3 = 0;
        while (i2 != -1 && i3 < this.A00) {
            if (i3 == i) {
                return this.A05[i2];
            }
            i2 = this.A07[i2];
            i3++;
        }
        return 0.0f;
    }

    public void Bdo() {
        int i = this.A02;
        int i2 = 0;
        while (i != -1 && i2 < this.A00) {
            float[] fArr = this.A05;
            fArr[i] = fArr[i] * -1.0f;
            i = this.A07[i];
            i2++;
        }
    }

    public final float CET(C38971sH r11, boolean z) {
        int i = this.A02;
        int i2 = i;
        if (i != -1) {
            int i3 = 0;
            int i4 = -1;
            while (i != -1) {
                int i5 = this.A00;
                if (i3 >= i5) {
                    break;
                }
                int[] iArr = this.A06;
                if (iArr[i] == r11.A02) {
                    int[] iArr2 = this.A07;
                    int i6 = iArr2[i];
                    if (i == i2) {
                        this.A02 = i6;
                    } else {
                        iArr2[i4] = i6;
                    }
                    if (z) {
                        r11.A03(this.A08);
                    }
                    r11.A05--;
                    this.A00 = i5 - 1;
                    iArr[i] = -1;
                    if (this.A04) {
                        this.A03 = i;
                    }
                    return this.A05[i];
                }
                i3++;
                i4 = i;
                i = this.A07[i];
            }
        }
        return 0.0f;
    }

    public float CRa(C38991sJ r7, boolean z) {
        C38971sH r0 = r7.A02;
        float BLx = BLx(r0);
        CET(r0, z);
        C39041sO r4 = r7.A01;
        int BQ2 = r4.BQ2();
        for (int i = 0; i < BQ2; i++) {
            C38971sH BbG = r4.BbG(i);
            BAn(BbG, r4.BLx(BbG) * BLx, z);
        }
        return BLx;
    }

    public final void clear() {
        int i = this.A02;
        int i2 = 0;
        while (i != -1 && i2 < this.A00) {
            C38971sH r1 = this.A09.A03[this.A06[i]];
            if (r1 != null) {
                r1.A03(this.A08);
            }
            i = this.A07[i];
            i2++;
        }
        this.A02 = -1;
        this.A03 = -1;
        this.A04 = false;
        this.A00 = 0;
    }

    public String toString() {
        int i = this.A02;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.A00) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" -> ");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(this.A05[i]);
            sb2.append(" : ");
            String obj2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj2);
            sb3.append(this.A09.A03[this.A06[i]]);
            str = sb3.toString();
            i = this.A07[i];
            i2++;
        }
        return str;
    }

    public C39051sP(C38991sJ r4, C39001sK r5) {
        this.A08 = r4;
        this.A09 = r5;
    }

    public void BAn(C38971sH r14, float f, boolean z) {
        int i;
        if (f <= -0.001f || f >= 0.001f) {
            int i2 = this.A02;
            int i3 = i2;
            if (i2 == -1) {
                this.A02 = 0;
                this.A05[0] = f;
                this.A06[0] = r14.A02;
                this.A07[0] = -1;
                r14.A05++;
                r14.A02(this.A08);
                this.A00++;
                if (!this.A04) {
                    i = this.A03 + 1;
                    this.A03 = i;
                } else {
                    return;
                }
            } else {
                int i4 = 0;
                int i5 = -1;
                while (i2 != -1) {
                    int i6 = this.A00;
                    if (i4 >= i6) {
                        break;
                    }
                    int[] iArr = this.A06;
                    int i7 = iArr[i2];
                    int i8 = r14.A02;
                    if (i7 == i8) {
                        float[] fArr = this.A05;
                        float f2 = fArr[i2] + f;
                        if (f2 > -0.001f && f2 < 0.001f) {
                            f2 = 0.0f;
                        }
                        fArr[i2] = f2;
                        if (f2 == 0.0f) {
                            int[] iArr2 = this.A07;
                            int i9 = iArr2[i2];
                            if (i2 == i3) {
                                this.A02 = i9;
                            } else {
                                iArr2[i5] = i9;
                            }
                            if (z) {
                                r14.A03(this.A08);
                            }
                            if (this.A04) {
                                this.A03 = i2;
                            }
                            r14.A05--;
                            this.A00 = i6 - 1;
                            return;
                        }
                        return;
                    }
                    if (iArr[i2] < i8) {
                        i5 = i2;
                    }
                    i2 = this.A07[i2];
                    i4++;
                }
                int i10 = this.A03;
                int i11 = i10 + 1;
                if (this.A04) {
                    int[] iArr3 = this.A06;
                    if (iArr3[i10] != -1) {
                        i10 = iArr3.length;
                    }
                } else {
                    i10 = i11;
                }
                int[] iArr4 = this.A06;
                int length = iArr4.length;
                if (i10 >= length && this.A00 < length) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            break;
                        } else if (iArr4[i12] == -1) {
                            i10 = i12;
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                if (i10 >= length) {
                    i10 = length;
                    int i13 = this.A01 * 2;
                    this.A01 = i13;
                    this.A04 = false;
                    this.A03 = length - 1;
                    this.A05 = Arrays.copyOf(this.A05, i13);
                    this.A06 = Arrays.copyOf(this.A06, this.A01);
                    this.A07 = Arrays.copyOf(this.A07, this.A01);
                }
                this.A06[i10] = r14.A02;
                this.A05[i10] = f;
                int[] iArr5 = this.A07;
                if (i5 != -1) {
                    iArr5[i10] = iArr5[i5];
                    iArr5[i5] = i10;
                } else {
                    iArr5[i10] = this.A02;
                    this.A02 = i10;
                }
                r14.A05++;
                r14.A02(this.A08);
                this.A00++;
                if (!this.A04) {
                    this.A03++;
                }
                i = this.A03;
            }
            int length2 = this.A06.length;
            if (i >= length2) {
                this.A04 = true;
                this.A03 = length2 - 1;
            }
        }
    }

    public int BQ2() {
        return this.A00;
    }
}
