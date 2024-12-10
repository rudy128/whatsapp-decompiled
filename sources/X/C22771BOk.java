package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.BOk  reason: case insensitive filesystem */
public final class C22771BOk extends CZO {
    public int A00;
    public CSH A01;
    public C24762CIz A02;
    public C24985CSk A03;
    public boolean A04;

    public boolean A01(C24842CMk cMk, C26207Cui cui, long j) {
        int i;
        if (this.A01 != null) {
            return false;
        }
        CSH csh = null;
        C26207Cui cui2 = cui;
        if (this.A03 == null) {
            C86.A00(cui2, 1, false);
            cui2.A07();
            int A042 = cui2.A04();
            long A07 = cui2.A07();
            byte[] bArr = cui2.A02;
            int i2 = cui2.A01 + 1 + 1 + 1 + 1;
            cui2.A01 = i2;
            int i3 = i2 + 1;
            int i4 = i3 + 1;
            int A09 = BE7.A09(bArr, i3, bArr[i2] & 255);
            int i5 = i4 + 1;
            int A0A = BE7.A0A(bArr, i4, A09);
            int i6 = i5 + 1;
            cui2.A01 = i6;
            int i7 = ((bArr[i5] & 255) << 24) | A0A;
            cui2.A01 = i6 + 1 + 1 + 1 + 1;
            int A043 = cui2.A04();
            int pow = (int) Math.pow(2.0d, (double) (A043 & 15));
            int pow2 = (int) Math.pow(2.0d, (double) ((A043 & 240) >> 4));
            cui2.A04();
            this.A03 = new C24985CSk(Arrays.copyOf(bArr, cui2.A00), A042, i7, pow, pow2, A07);
        } else if (this.A02 == null) {
            C86.A00(cui2, 3, false);
            cui2.A0E((int) cui2.A07());
            long A072 = cui2.A07();
            String[] strArr = new String[((int) A072)];
            for (int i8 = 0; ((long) i8) < A072; i8++) {
                strArr[i8] = cui2.A0E((int) cui2.A07());
            }
            if ((cui2.A04() & 1) != 0) {
                this.A02 = new C24762CIz(strArr);
            } else {
                throw C24215BxS.A00("framing bit expected to be set");
            }
        } else {
            int i9 = cui2.A00;
            byte[] bArr2 = new byte[i9];
            byte[] bArr3 = bArr2;
            System.arraycopy(cui2.A02, 0, bArr2, 0, i9);
            int i10 = this.A03.A03;
            int i11 = 0;
            C86.A00(cui2, 5, false);
            int A044 = cui2.A04() + 1;
            C25198Cap cap = new C25198Cap(cui2.A02);
            cap.A01(cui2.A01 * 8);
            int i12 = 0;
            while (i12 < A044) {
                if (cap.A00(24) == 5653314) {
                    int A002 = cap.A00(16);
                    int A003 = cap.A00(24);
                    long j2 = 0;
                    if (!cap.A02()) {
                        boolean A022 = cap.A02();
                        for (int i13 = 0; i13 < A003; i13++) {
                            if (!A022 || cap.A02()) {
                                cap.A00(5);
                            }
                        }
                    } else {
                        cap.A00(5);
                        int i14 = 0;
                        while (i14 < A003) {
                            int i15 = 0;
                            for (int i16 = A003 - i14; i16 > 0; i16 >>>= 1) {
                                i15++;
                            }
                            int A004 = cap.A00(i15);
                            for (int i17 = 0; i17 < A004 && i14 < A003; i17++) {
                                i14++;
                            }
                        }
                    }
                    int A005 = cap.A00(4);
                    if (A005 <= 2) {
                        if (A005 == 1 || A005 == 2) {
                            cap.A01(32);
                            cap.A01(32);
                            int A006 = cap.A00(4) + 1;
                            cap.A01(1);
                            if (A005 != 1) {
                                j2 = ((long) A003) * ((long) A002);
                            } else if (A002 != 0) {
                                j2 = (long) Math.floor(Math.pow((double) ((long) A003), 1.0d / ((double) ((long) A002))));
                            }
                            cap.A01((int) (j2 * ((long) A006)));
                        }
                        i12++;
                    } else {
                        throw C24215BxS.A00(AnonymousClass001.A1I("lookup type greater than 2 not decodable: ", AnonymousClass000.A10(), A005));
                    }
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                    throw C24215BxS.A00(C17880vN.A0t(A10, (cap.A01 * 8) + cap.A00));
                }
            }
            int A007 = cap.A00(6) + 1;
            while (i11 < A007) {
                if (cap.A00(16) == 0) {
                    i11++;
                } else {
                    throw C24215BxS.A00("placeholder of time domain transforms not zeroed out");
                }
            }
            int A008 = cap.A00(6) + 1;
            for (int i18 = 0; i18 < A008; i18++) {
                int A009 = cap.A00(16);
                if (A009 == 0) {
                    cap.A01(8);
                    cap.A01(16);
                    cap.A01(16);
                    cap.A01(6);
                    cap.A01(8);
                    int A0010 = cap.A00(4) + 1;
                    for (int i19 = 0; i19 < A0010; i19++) {
                        cap.A01(8);
                    }
                } else if (A009 == 1) {
                    int A0011 = cap.A00(5);
                    int[] iArr = new int[A0011];
                    int i20 = -1;
                    for (int i21 = 0; i21 < A0011; i21++) {
                        int A0012 = cap.A00(4);
                        iArr[i21] = A0012;
                        if (A0012 > i20) {
                            i20 = A0012;
                        }
                    }
                    int i22 = i20 + 1;
                    int[] iArr2 = new int[i22];
                    for (int i23 = 0; i23 < i22; i23++) {
                        iArr2[i23] = cap.A00(3) + 1;
                        int A0013 = cap.A00(2);
                        if (A0013 > 0) {
                            cap.A01(8);
                        }
                        for (int i24 = 0; i24 < (1 << A0013); i24++) {
                            cap.A01(8);
                        }
                    }
                    cap.A01(2);
                    int A0014 = cap.A00(4);
                    int i25 = 0;
                    int i26 = 0;
                    for (int i27 = 0; i27 < A0011; i27++) {
                        i25 += iArr2[iArr[i27]];
                        while (i26 < i25) {
                            cap.A01(A0014);
                            i26++;
                        }
                    }
                } else {
                    throw C24215BxS.A00(AnonymousClass001.A1I("floor type greater than 1 not decodable: ", AnonymousClass000.A10(), A009));
                }
            }
            int A0015 = cap.A00(6) + 1;
            int i28 = 0;
            while (i28 < A0015) {
                if (cap.A00(16) <= 2) {
                    cap.A01(24);
                    cap.A01(24);
                    cap.A01(24);
                    int A0016 = cap.A00(6) + 1;
                    cap.A01(8);
                    int[] iArr3 = new int[A0016];
                    for (int i29 = 0; i29 < A0016; i29++) {
                        int A0017 = cap.A00(3);
                        int i30 = 0;
                        if (cap.A02()) {
                            i30 = cap.A00(5);
                        }
                        iArr3[i29] = (i30 * 8) + A0017;
                    }
                    for (int i31 = 0; i31 < A0016; i31++) {
                        int i32 = 0;
                        do {
                            if ((iArr3[i31] & (1 << i32)) != 0) {
                                cap.A01(8);
                            }
                            i32++;
                        } while (i32 < 8);
                    }
                    i28++;
                } else {
                    throw C24215BxS.A00("residueType greater than 2 is not decodable");
                }
            }
            int A0018 = cap.A00(6) + 1;
            for (int i33 = 0; i33 < A0018; i33++) {
                int A0019 = cap.A00(16);
                if (A0019 != 0) {
                    Log.e("VorbisUtil", AnonymousClass001.A1I("mapping type other than 0 not supported: ", AnonymousClass000.A10(), A0019));
                } else {
                    if (cap.A02()) {
                        i = cap.A00(4) + 1;
                    } else {
                        i = 1;
                    }
                    if (cap.A02()) {
                        int A0020 = cap.A00(8) + 1;
                        for (int i34 = 0; i34 < A0020; i34++) {
                            int i35 = 0;
                            for (int i36 = i10 - 1; i36 > 0; i36 >>>= 1) {
                                i35++;
                            }
                            cap.A01(i35);
                            cap.A01(i35);
                        }
                    }
                    if (cap.A00(2) == 0) {
                        if (i > 1) {
                            for (int i37 = 0; i37 < i10; i37++) {
                                cap.A01(4);
                            }
                        }
                        for (int i38 = 0; i38 < i; i38++) {
                            cap.A01(8);
                            cap.A01(8);
                            cap.A01(8);
                        }
                    } else {
                        throw C24215BxS.A00("to reserved bits must be zero after mapping coupling steps");
                    }
                }
            }
            int A0021 = cap.A00(6) + 1;
            CJ0[] cj0Arr = new CJ0[A0021];
            for (int i39 = 0; i39 < A0021; i39++) {
                boolean A023 = cap.A02();
                cap.A00(16);
                cap.A00(16);
                cap.A00(8);
                cj0Arr[i39] = new CJ0(A023);
            }
            if (cap.A02()) {
                int i40 = 0;
                for (int i41 = A0021 - 1; i41 > 0; i41 >>>= 1) {
                    i40++;
                }
                csh = new CSH(this.A02, this.A03, bArr3, cj0Arr, i40);
            } else {
                throw C24215BxS.A00("framing bit after modes not set as expected");
            }
        }
        this.A01 = csh;
        if (csh != null) {
            ArrayList A13 = AnonymousClass000.A13();
            C24985CSk cSk = csh.A02;
            A13.add(cSk.A05);
            A13.add(csh.A03);
            int i42 = cSk.A00;
            int i43 = cSk.A03;
            int i44 = (int) cSk.A04;
            E0X e0x = D48.CREATOR;
            C25702CkX ckX = new C25702CkX();
            ckX.A0P = null;
            ckX.A0R = "audio/vorbis";
            ckX.A0N = null;
            ckX.A03 = i42;
            ckX.A09 = -1;
            ckX.A04 = i43;
            ckX.A0E = i44;
            ckX.A0S = A13;
            ckX.A0K = null;
            ckX.A0F = 0;
            ckX.A0Q = null;
            cMk.A00 = new D48(ckX);
        }
        return true;
    }

    public void A00(boolean z) {
        super.A00(z);
        if (z) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }
}
