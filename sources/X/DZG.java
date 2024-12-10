package X;

import java.security.SecureRandom;
import javax.crypto.BadPaddingException;

public class DZG implements EAE {
    public C25735Cl5 A00;

    public int Bb2(int i) {
        return this.A00.A00(i);
    }

    public boolean CSJ() {
        return !(this.A00 instanceof C28376DyM);
    }

    public int BJ4(byte[] bArr, int i) {
        C28377DyN dyN;
        int i2;
        C28377DyN dyN2;
        Throwable th;
        Throwable th2;
        byte[] bArr2;
        int i3;
        try {
            C25735Cl5 cl5 = this.A00;
            if (cl5 instanceof C28377DyN) {
                C28377DyN dyN3 = (C28377DyN) cl5;
                E9Y e9y = dyN3.A01;
                int BNR = e9y.BNR();
                boolean z = dyN3.A02;
                int i4 = dyN3.A00;
                if (z) {
                    if (i4 != BNR) {
                        i3 = 0;
                    } else if ((BNR * 2) + i <= bArr.length) {
                        i3 = e9y.CCe(dyN3.A04, bArr, 0, i);
                        dyN3.A00 = 0;
                        i4 = 0;
                    } else {
                        dyN3.A01();
                        th = C28380DyQ.A00();
                        throw th;
                    }
                    dyN3.A00.BBb(dyN3.A04, i4);
                    i2 = i3 + dyN3.A01.CCe(dyN3.A04, bArr, 0, i + i3);
                    dyN2 = dyN3;
                } else if (i4 == BNR) {
                    byte[] bArr3 = dyN3.A04;
                    int CCe = e9y.CCe(bArr3, bArr3, 0, 0);
                    dyN3.A00 = 0;
                    try {
                        dyN = dyN3;
                        i2 = CCe - dyN3.A00.CB3(dyN3.A04);
                        System.arraycopy(dyN3.A04, 0, bArr, i, i2);
                        dyN = dyN3;
                        dyN2 = dyN3;
                    } catch (Throwable th3) {
                        th = th3;
                        dyN.A01();
                    }
                } else {
                    dyN3.A01();
                    th = new C28387DyX("last block incomplete in decryption");
                    throw th;
                }
            } else if (cl5 instanceof C28376DyM) {
                int i5 = cl5.A00;
                if (i5 + i <= bArr.length) {
                    E9Y e9y2 = cl5.A01;
                    int BNR2 = e9y2.BNR();
                    int i6 = i5 - BNR2;
                    byte[] bArr4 = new byte[BNR2];
                    if (cl5.A02) {
                        if (i5 >= BNR2) {
                            e9y2.CCe(cl5.A04, bArr4, 0, 0);
                            int i7 = cl5.A00;
                            int i8 = i7;
                            if (i7 > BNR2) {
                                while (true) {
                                    bArr2 = cl5.A04;
                                    if (i7 == bArr2.length) {
                                        break;
                                    }
                                    BE6.A1P(bArr4, bArr2, i7 - BNR2, i7);
                                    i7++;
                                }
                                for (int i9 = BNR2; i9 != i8; i9++) {
                                    BE6.A1Q(bArr4, bArr2, i9 - BNR2, bArr2[i9], i9);
                                }
                                E9Y e9y3 = cl5.A01;
                                if (e9y3 instanceof DYb) {
                                    ((DYb) e9y3).A01.CCe(bArr2, bArr, BNR2, i);
                                } else {
                                    e9y3.CCe(bArr2, bArr, BNR2, i);
                                }
                                System.arraycopy(bArr4, 0, bArr, i + BNR2, i6);
                                i2 = cl5.A00;
                                dyN2 = cl5;
                            }
                        } else {
                            th2 = new C28387DyX("need at least one block of input for CTS");
                        }
                    } else if (i5 >= BNR2) {
                        byte[] bArr5 = new byte[BNR2];
                        if (i5 > BNR2) {
                            if (e9y2 instanceof DYb) {
                                ((DYb) e9y2).A01.CCe(cl5.A04, bArr4, 0, 0);
                            } else {
                                e9y2.CCe(cl5.A04, bArr4, 0, 0);
                            }
                            for (int i10 = BNR2; i10 != cl5.A00; i10++) {
                                int i11 = i10 - BNR2;
                                BE6.A1Q(cl5.A04, bArr5, i10, bArr4[i11], i11);
                            }
                            System.arraycopy(cl5.A04, BNR2, bArr4, 0, i6);
                            cl5.A01.CCe(bArr4, bArr, 0, i);
                            System.arraycopy(bArr5, 0, bArr, i + BNR2, i6);
                            i2 = cl5.A00;
                            dyN2 = cl5;
                        } else {
                            e9y2.CCe(cl5.A04, bArr4, 0, 0);
                        }
                    } else {
                        th2 = new C28387DyX("need at least one block of input for CTS");
                    }
                    System.arraycopy(bArr4, 0, bArr, i, BNR2);
                    i2 = cl5.A00;
                    dyN2 = cl5;
                } else {
                    th2 = new C28380DyQ("output buffer to small in doFinal");
                }
                throw th2;
            } else {
                dyN = cl5;
                int i12 = cl5.A00;
                if (i + i12 <= bArr.length) {
                    i2 = 0;
                    dyN2 = cl5;
                    if (i12 != 0) {
                        if (cl5.A03) {
                            E9Y e9y4 = cl5.A01;
                            byte[] bArr6 = cl5.A04;
                            e9y4.CCe(bArr6, bArr6, 0, 0);
                            int i13 = cl5.A00;
                            cl5.A00 = 0;
                            System.arraycopy(cl5.A04, 0, bArr, i, i13);
                            i2 = i13;
                            dyN2 = cl5;
                        } else {
                            th = new C28387DyX("data not block size aligned");
                        }
                    }
                } else {
                    dyN = cl5;
                    th = new C28380DyQ("output buffer too short for doFinal()");
                }
                throw th;
            }
            dyN2.A01();
            return i2;
        } catch (C28379DyP e) {
            throw new BadPaddingException(e.getMessage());
        }
    }

    public String BMl() {
        return this.A00.A01.BMl();
    }

    public int BVw(int i) {
        C25735Cl5 cl5 = this.A00;
        boolean z = cl5 instanceof C28377DyN;
        int i2 = i + cl5.A00;
        if (!z) {
            return i2;
        }
        int length = cl5.A04.length;
        int i3 = i2 % length;
        if (i3 != 0) {
            i2 -= i3;
        } else if (!cl5.A02) {
            return i2;
        }
        return i2 + length;
    }

    public E9Y Bax() {
        return this.A00.A01;
    }

    public void BdC(E3O e3o, boolean z) {
        C28377DyN dyN;
        E9Y e9y;
        C25735Cl5 cl5 = this.A00;
        if (cl5 instanceof C28377DyN) {
            C28377DyN dyN2 = (C28377DyN) cl5;
            dyN2.A02 = z;
            dyN2.A01();
            if (e3o instanceof DYi) {
                DYi dYi = (DYi) e3o;
                dyN2.A00.Bd9(dYi.A00);
                e9y = dyN2.A01;
                e3o = dYi.A01;
            } else {
                dyN2.A00.Bd9((SecureRandom) null);
                dyN = dyN2;
                e9y = dyN.A01;
            }
        } else {
            cl5.A02 = z;
            cl5.A01();
            dyN = cl5;
            e9y = dyN.A01;
        }
        e9y.BdC(e3o, z);
    }

    public int CCg(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        byte[] bArr3;
        int i5;
        C25735Cl5 cl5 = this.A00;
        if (cl5 instanceof C28377DyN) {
            if (i2 >= 0) {
                int BNR = cl5.A01.BNR();
                int A002 = cl5.A00(i2);
                if (A002 <= 0 || A002 + i3 <= bArr2.length) {
                    bArr3 = cl5.A04;
                    int length = bArr3.length;
                    int i6 = cl5.A00;
                    int i7 = length - i6;
                    i4 = 0;
                    if (i2 > i7) {
                        System.arraycopy(bArr, i, bArr3, i6, i7);
                        int CCe = cl5.A01.CCe(cl5.A04, bArr2, 0, i3);
                        cl5.A00 = 0;
                        i2 -= i7;
                        i += i7;
                        i4 = CCe;
                        while (true) {
                            bArr3 = cl5.A04;
                            if (i2 <= bArr3.length) {
                                break;
                            }
                            i4 += cl5.A01.CCe(bArr, bArr2, i, i3 + i4);
                            i2 -= BNR;
                            i += BNR;
                        }
                    }
                } else {
                    throw C28380DyQ.A00();
                }
            } else {
                throw AnonymousClass000.A0k("Can't have a negative input length!");
            }
        } else if (cl5 instanceof C28376DyM) {
            if (i2 >= 0) {
                int BNR2 = cl5.A01.BNR();
                int A003 = cl5.A00(i2);
                if (A003 <= 0 || A003 + i3 <= bArr2.length) {
                    byte[] bArr4 = cl5.A04;
                    int length2 = bArr4.length;
                    int i8 = cl5.A00;
                    int i9 = length2 - i8;
                    int i10 = 0;
                    if (i2 > i9) {
                        System.arraycopy(bArr, i, bArr4, i8, i9);
                        int CCe2 = cl5.A01.CCe(cl5.A04, bArr2, 0, i3);
                        byte[] bArr5 = cl5.A04;
                        System.arraycopy(bArr5, BNR2, bArr5, 0, BNR2);
                        cl5.A00 = BNR2;
                        r10 = i2 - i9;
                        r9 = i + i9;
                        while (i2 > BNR2) {
                            System.arraycopy(bArr, i, cl5.A04, cl5.A00, BNR2);
                            CCe2 += cl5.A01.CCe(cl5.A04, bArr2, 0, i3 + CCe2);
                            byte[] bArr6 = cl5.A04;
                            System.arraycopy(bArr6, BNR2, bArr6, 0, BNR2);
                            r10 = i2 - BNR2;
                            r9 = i + BNR2;
                        }
                        i10 = CCe2;
                    }
                    bArr3 = cl5.A04;
                } else {
                    throw C28380DyQ.A00();
                }
            } else {
                throw AnonymousClass000.A0k("Can't have a negative input length!");
            }
        } else if (i2 >= 0) {
            int BNR3 = cl5.A01.BNR();
            int A004 = cl5.A00(i2);
            if (A004 <= 0 || A004 + i3 <= bArr2.length) {
                byte[] bArr7 = cl5.A04;
                int length3 = bArr7.length;
                int i11 = cl5.A00;
                int i12 = length3 - i11;
                if (i2 > i12) {
                    System.arraycopy(bArr, i, bArr7, i11, i12);
                    i5 = cl5.A01.CCe(cl5.A04, bArr2, 0, i3);
                    cl5.A00 = 0;
                    r10 = i2 - i12;
                    r9 = i + i12;
                    while (true) {
                        bArr7 = cl5.A04;
                        if (i2 <= bArr7.length) {
                            break;
                        }
                        i5 += cl5.A01.CCe(bArr, bArr2, i, i3 + i5);
                        r10 = i2 - BNR3;
                        r9 = i + BNR3;
                    }
                } else {
                    i5 = 0;
                }
                System.arraycopy(bArr, i, bArr7, cl5.A00, i2);
                int i13 = cl5.A00 + i2;
                cl5.A00 = i13;
                byte[] bArr8 = cl5.A04;
                if (i13 == bArr8.length) {
                    int CCe3 = i4 + cl5.A01.CCe(bArr8, bArr2, 0, i3 + i4);
                    cl5.A00 = 0;
                    return CCe3;
                }
                return i4;
            }
            throw C28380DyQ.A00();
        } else {
            throw AnonymousClass000.A0k("Can't have a negative input length!");
        }
        System.arraycopy(bArr, i, bArr3, cl5.A00, i2);
        cl5.A00 += i2;
        return i4;
    }

    public void CQP(byte[] bArr, int i, int i2) {
        throw BE6.A0v("AAD is not supported in the current mode.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.E8w, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.Cl5, java.lang.Object, X.DyN] */
    public DZG(E9Y e9y) {
        ? obj = new Object();
        ? obj2 = new Object();
        obj2.A01 = e9y;
        obj2.A00 = obj;
        obj2.A04 = new byte[e9y.BNR()];
        obj2.A00 = 0;
        this.A00 = obj2;
    }
}
