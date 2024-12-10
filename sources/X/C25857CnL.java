package X;

import com.google.protobuf.UnsafeUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.CnL  reason: case insensitive filesystem */
public abstract class C25857CnL {
    public int A00;
    public C26282Cwd A01;

    public static long A06(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static C23583BmD A07(byte[] bArr, int i, int i2) {
        C23583BmD bmD = new C23583BmD(bArr, i, i2);
        try {
            bmD.A0I(i2);
            return bmD;
        } catch (AnonymousClass1PN e) {
            throw new IllegalArgumentException(e);
        }
    }

    public double A08() {
        long A0Y;
        if (this instanceof C23584BmE) {
            A0Y = ((C23584BmE) this).A0Y();
        } else if (this instanceof C23585BmF) {
            A0Y = ((C23585BmF) this).A0Y();
        } else {
            A0Y = ((C23583BmD) this).A0Y();
        }
        return Double.longBitsToDouble(A0Y);
    }

    public float A09() {
        int A0W;
        if (this instanceof C23584BmE) {
            A0W = ((C23584BmE) this).A0W();
        } else if (this instanceof C23585BmF) {
            A0W = ((C23585BmF) this).A0W();
        } else {
            A0W = ((C23583BmD) this).A0W();
        }
        return Float.intBitsToFloat(A0W);
    }

    public int A0A() {
        if (this instanceof C23584BmE) {
            C23584BmE bmE = (C23584BmE) this;
            return (int) (bmE.A03 - bmE.A04);
        } else if (this instanceof C23585BmF) {
            C23585BmF bmF = (C23585BmF) this;
            return bmF.A04 + bmF.A03;
        } else {
            C23583BmD bmD = (C23583BmD) this;
            return bmD.A03 - bmD.A04;
        }
    }

    public int A0B() {
        if (this instanceof C23584BmE) {
            return ((C23584BmE) this).A0X();
        }
        if (this instanceof C23585BmF) {
            return ((C23585BmF) this).A0X();
        }
        return ((C23583BmD) this).A0X();
    }

    public int A0C() {
        if (this instanceof C23584BmE) {
            return ((C23584BmE) this).A0W();
        }
        if (this instanceof C23585BmF) {
            return ((C23585BmF) this).A0W();
        }
        return ((C23583BmD) this).A0W();
    }

    public int A0D() {
        if (this instanceof C23584BmE) {
            return ((C23584BmE) this).A0X();
        }
        if (this instanceof C23585BmF) {
            return ((C23585BmF) this).A0X();
        }
        return ((C23583BmD) this).A0X();
    }

    public int A0E() {
        if (this instanceof C23584BmE) {
            return ((C23584BmE) this).A0W();
        }
        if (this instanceof C23585BmF) {
            return ((C23585BmF) this).A0W();
        }
        return ((C23583BmD) this).A0W();
    }

    public int A0F() {
        if (this instanceof C23584BmE) {
            return BE7.A05(((C23584BmE) this).A0X());
        }
        if (this instanceof C23585BmF) {
            return BE7.A05(((C23585BmF) this).A0X());
        }
        return BE7.A05(((C23583BmD) this).A0X());
    }

    public int A0G() {
        if (this instanceof C23584BmE) {
            C23584BmE bmE = (C23584BmE) this;
            if (bmE.A0T()) {
                bmE.A01 = 0;
                return 0;
            }
            int A0X = bmE.A0X();
            bmE.A01 = A0X;
            if ((A0X >>> 3) != 0) {
                return A0X;
            }
            throw BE6.A0c("Protocol message contained an invalid tag (zero).");
        } else if (this instanceof C23585BmF) {
            C23585BmF bmF = (C23585BmF) this;
            if (bmF.A0T()) {
                bmF.A02 = 0;
                return 0;
            }
            int A0X2 = bmF.A0X();
            bmF.A02 = A0X2;
            if ((A0X2 >>> 3) != 0) {
                return A0X2;
            }
            throw BE6.A0c("Protocol message contained an invalid tag (zero).");
        } else {
            C23583BmD bmD = (C23583BmD) this;
            if (bmD.A0T()) {
                bmD.A01 = 0;
                return 0;
            }
            int A0X3 = bmD.A0X();
            bmD.A01 = A0X3;
            if ((A0X3 >>> 3) != 0) {
                return A0X3;
            }
            throw BE6.A0c("Protocol message contained an invalid tag (zero).");
        }
    }

    public int A0H() {
        if (this instanceof C23584BmE) {
            return ((C23584BmE) this).A0X();
        }
        if (this instanceof C23585BmF) {
            return ((C23585BmF) this).A0X();
        }
        return ((C23583BmD) this).A0X();
    }

    public int A0I(int i) {
        if (this instanceof C23584BmE) {
            C23584BmE bmE = (C23584BmE) this;
            if (i >= 0) {
                int i2 = i + ((int) (bmE.A03 - bmE.A04));
                int i3 = bmE.A00;
                if (i2 <= i3) {
                    bmE.A00 = i2;
                    C23584BmE.A00(bmE);
                    return i3;
                }
                throw BE7.A0M();
            }
            throw BE7.A0N();
        } else if (this instanceof C23585BmF) {
            C23585BmF bmF = (C23585BmF) this;
            if (i >= 0) {
                int i4 = i + bmF.A04 + bmF.A03;
                int i5 = bmF.A01;
                if (i4 <= i5) {
                    bmF.A01 = i4;
                    C23585BmF.A01(bmF);
                    return i5;
                }
                throw BE7.A0M();
            }
            throw BE7.A0N();
        } else {
            C23583BmD bmD = (C23583BmD) this;
            if (i >= 0) {
                int i6 = i + (bmD.A03 - bmD.A04);
                if (i6 >= 0) {
                    int i7 = bmD.A00;
                    if (i6 <= i7) {
                        bmD.A00 = i6;
                        C23583BmD.A00(bmD);
                        return i7;
                    }
                    throw BE7.A0M();
                }
                throw BE6.A0c("Failed to parse the message.");
            }
            throw BE7.A0N();
        }
    }

    public long A0J() {
        if (this instanceof C23584BmE) {
            return ((C23584BmE) this).A0Y();
        }
        if (this instanceof C23585BmF) {
            return ((C23585BmF) this).A0Y();
        }
        return ((C23583BmD) this).A0Y();
    }

    public long A0K() {
        if (this instanceof C23584BmE) {
            return ((C23584BmE) this).A0Z();
        }
        if (this instanceof C23585BmF) {
            return ((C23585BmF) this).A0Z();
        }
        return ((C23583BmD) this).A0Z();
    }

    public long A0L() {
        if (this instanceof C23584BmE) {
            return ((C23584BmE) this).A0Y();
        }
        if (this instanceof C23585BmF) {
            return ((C23585BmF) this).A0Y();
        }
        return ((C23583BmD) this).A0Y();
    }

    public long A0M() {
        if (this instanceof C23584BmE) {
            return BEA.A0G(((C23584BmE) this).A0Z());
        }
        if (this instanceof C23585BmF) {
            return BEA.A0G(((C23585BmF) this).A0Z());
        }
        return BEA.A0G(((C23583BmD) this).A0Z());
    }

    public long A0N() {
        if (this instanceof C23584BmE) {
            return ((C23584BmE) this).A0Z();
        }
        if (this instanceof C23585BmF) {
            return ((C23585BmF) this).A0Z();
        }
        return ((C23583BmD) this).A0Z();
    }

    public DSQ A0O() {
        if (this instanceof C23584BmE) {
            C23584BmE bmE = (C23584BmE) this;
            int A0X = bmE.A0X();
            if (A0X > 0) {
                long j = bmE.A02;
                long j2 = bmE.A03;
                if (A0X <= ((int) (j - j2))) {
                    byte[] bArr = new byte[A0X];
                    long j3 = (long) A0X;
                    UnsafeUtil.A02.A0I(bArr, j2, j3);
                    bmE.A03 += j3;
                    return new C23581BmB(bArr);
                }
                throw BE7.A0M();
            } else if (A0X == 0) {
                return DSQ.A00;
            } else {
                throw BE7.A0N();
            }
        } else {
            if (this instanceof C23585BmF) {
                C23585BmF bmF = (C23585BmF) this;
                int A0X2 = bmF.A0X();
                int i = bmF.A00;
                int i2 = bmF.A03;
                if (A0X2 <= i - i2 && A0X2 > 0) {
                    C23581BmB A012 = DSQ.A01(bmF.A07, i2, A0X2);
                    bmF.A03 += A0X2;
                    return A012;
                } else if (A0X2 != 0) {
                    byte[] A05 = C23585BmF.A05(bmF, A0X2);
                    if (A05 != null) {
                        return DSQ.A01(A05, 0, A05.length);
                    }
                    int i3 = bmF.A03;
                    int i4 = bmF.A00;
                    int i5 = i4 - i3;
                    bmF.A04 += i4;
                    bmF.A03 = 0;
                    bmF.A00 = 0;
                    ArrayList A002 = C23585BmF.A00(bmF, A0X2 - i5);
                    byte[] bArr2 = new byte[A0X2];
                    System.arraycopy(bmF.A07, i3, bArr2, 0, i5);
                    Iterator it = A002.iterator();
                    while (it.hasNext()) {
                        byte[] bArr3 = (byte[]) it.next();
                        int length = bArr3.length;
                        System.arraycopy(bArr3, 0, bArr2, i5, length);
                        i5 += length;
                    }
                    return new C23581BmB(bArr2);
                }
            } else {
                C23583BmD bmD = (C23583BmD) this;
                int A0X3 = bmD.A0X();
                if (A0X3 > 0) {
                    int i6 = bmD.A02;
                    int i7 = bmD.A03;
                    if (A0X3 <= i6 - i7) {
                        C23581BmB A013 = DSQ.A01(bmD.A06, i7, A0X3);
                        bmD.A03 += A0X3;
                        return A013;
                    }
                    throw BE7.A0M();
                } else if (A0X3 != 0) {
                    throw BE7.A0N();
                }
            }
            return DSQ.A00;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0P() {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.C23584BmE
            if (r0 == 0) goto L_0x0038
            r4 = r11
            X.BmE r4 = (X.C23584BmE) r4
            int r3 = r4.A0X()
            if (r3 <= 0) goto L_0x002e
            long r1 = r4.A02
            long r7 = r4.A03
            long r1 = r1 - r7
            int r0 = (int) r1
            if (r3 > r0) goto L_0x0029
            byte[] r6 = new byte[r3]
            long r9 = (long) r3
            X.CnK r5 = com.google.protobuf.UnsafeUtil.A02
            r5.A0I(r6, r7, r9)
            java.nio.charset.Charset r0 = X.CIC.A04
            java.lang.String r2 = X.BE6.A0q(r0, r6)
            long r0 = r4.A03
            long r0 = r0 + r9
            r4.A03 = r0
            return r2
        L_0x0029:
            X.1PN r0 = X.BE7.A0M()
            throw r0
        L_0x002e:
            if (r3 != 0) goto L_0x0033
            java.lang.String r2 = ""
            return r2
        L_0x0033:
            X.1PN r0 = X.BE7.A0N()
            throw r0
        L_0x0038:
            boolean r0 = r11 instanceof X.C23585BmF
            if (r0 == 0) goto L_0x005a
            r4 = r11
            X.BmF r4 = (X.C23585BmF) r4
            int r3 = r4.A0X()
            if (r3 <= 0) goto L_0x007f
            int r0 = r4.A00
            int r2 = r4.A03
            int r0 = r0 - r2
            if (r3 > r0) goto L_0x0084
            byte[] r1 = r4.A07
            java.nio.charset.Charset r0 = X.CIC.A04
            java.lang.String r1 = X.BE6.A0r(r0, r1, r2, r3)
        L_0x0054:
            int r0 = r4.A03
            int r0 = r0 + r3
            r4.A03 = r0
            return r1
        L_0x005a:
            r4 = r11
            X.BmD r4 = (X.C23583BmD) r4
            int r3 = r4.A0X()
            if (r3 <= 0) goto L_0x0078
            int r0 = r4.A02
            int r2 = r4.A03
            int r0 = r0 - r2
            if (r3 > r0) goto L_0x0096
            byte[] r1 = r4.A06
            java.nio.charset.Charset r0 = X.CIC.A04
            java.lang.String r1 = X.BE6.A0r(r0, r1, r2, r3)
            int r0 = r4.A03
            int r0 = r0 + r3
            r4.A03 = r0
            return r1
        L_0x0078:
            if (r3 == 0) goto L_0x0081
            X.1PN r0 = X.BE7.A0N()
            throw r0
        L_0x007f:
            if (r3 != 0) goto L_0x0084
        L_0x0081:
            java.lang.String r1 = ""
            return r1
        L_0x0084:
            int r0 = r4.A00
            if (r3 > r0) goto L_0x009b
            X.C23585BmF.A02(r4, r3)
            byte[] r2 = r4.A07
            int r1 = r4.A03
            java.nio.charset.Charset r0 = X.CIC.A04
            java.lang.String r1 = X.BE6.A0r(r0, r2, r1, r3)
            goto L_0x0054
        L_0x0096:
            X.1PN r0 = X.BE7.A0M()
            throw r0
        L_0x009b:
            byte[] r1 = X.C23585BmF.A04(r4, r3)
            java.nio.charset.Charset r0 = X.CIC.A04
            java.lang.String r1 = X.BE6.A0q(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25857CnL.A0P():java.lang.String");
    }

    public String A0Q() {
        byte[] A04;
        String A002;
        int i;
        long j;
        int i2;
        byte A012;
        byte A013;
        if (this instanceof C23584BmE) {
            C23584BmE bmE = (C23584BmE) this;
            int A0X = bmE.A0X();
            if (A0X > 0) {
                long j2 = bmE.A02;
                long j3 = bmE.A03;
                if (A0X <= ((int) (j2 - j3))) {
                    int i3 = (int) (j3 - bmE.A06);
                    ByteBuffer byteBuffer = bmE.A07;
                    CZV czv = C25412CfK.A00;
                    if (byteBuffer.hasArray()) {
                        A002 = czv.A03(byteBuffer.array(), byteBuffer.arrayOffset() + i3, A0X);
                    } else if (!byteBuffer.isDirect() || !(czv instanceof C23667Bna)) {
                        A002 = CZV.A00(byteBuffer, i3, A0X);
                    } else if ((i3 | A0X | ((byteBuffer.limit() - i3) - A0X)) >= 0) {
                        C25856CnK cnK = UnsafeUtil.A02;
                        long A07 = cnK.A07(byteBuffer, UnsafeUtil.A00) + ((long) i3);
                        long j4 = ((long) A0X) + A07;
                        char[] cArr = new char[A0X];
                        int i4 = 0;
                        while (j < j4 && (A013 = cnK.A01(j)) >= 0) {
                            A07 = j + 1;
                            cArr[i] = (char) A013;
                            i4 = i + 1;
                        }
                        while (j < j4) {
                            long j5 = j + 1;
                            byte A014 = cnK.A01(j);
                            if (A014 >= 0) {
                                int i5 = i + 1;
                                cArr[i] = (char) A014;
                                while (j5 < j4 && (A012 = cnK.A01(j5)) >= 0) {
                                    j5++;
                                    cArr[i5] = (char) A012;
                                    i5++;
                                }
                                i = i5;
                                j = j5;
                            } else {
                                if (A014 >= -32) {
                                    if (A014 < -16) {
                                        if (j5 < j4 - 1) {
                                            long j6 = j5 + 1;
                                            byte A015 = cnK.A01(j5);
                                            j = j6 + 1;
                                            byte A016 = cnK.A01(j6);
                                            i2 = i + 1;
                                            C25880Cnr.A01(A014, A015, A016, cArr, i);
                                        }
                                    } else if (j5 < j4 - 2) {
                                        long j7 = j5 + 1;
                                        byte A017 = cnK.A01(j5);
                                        long j8 = j7 + 1;
                                        byte A018 = cnK.A01(j7);
                                        j = j8 + 1;
                                        C25880Cnr.A00(A014, A017, A018, cnK.A01(j8), cArr, i);
                                        i = i + 1 + 1;
                                    }
                                    throw BE6.A0c("Protocol message had invalid UTF-8.");
                                } else if (j5 < j4) {
                                    j = j5 + 1;
                                    i2 = i + 1;
                                    C25880Cnr.A02(A014, cnK.A01(j5), cArr, i);
                                } else {
                                    throw BE6.A0c("Protocol message had invalid UTF-8.");
                                }
                                i = i2;
                            }
                        }
                        A002 = new String(cArr, 0, i);
                    } else {
                        Object[] A1a = AnonymousClass8BR.A1a();
                        BEA.A1V(A1a, byteBuffer.limit(), 0, i3, 1);
                        BE8.A1M(A1a, A0X);
                        throw BE8.A0U("buffer limit=%d, index=%d, limit=%d", A1a);
                    }
                    bmE.A03 += (long) A0X;
                    return A002;
                }
                throw BE7.A0M();
            } else if (A0X == 0) {
                return "";
            } else {
                throw BE7.A0N();
            }
        } else if (this instanceof C23585BmF) {
            C23585BmF bmF = (C23585BmF) this;
            int A0X2 = bmF.A0X();
            int i6 = bmF.A03;
            int i7 = bmF.A00;
            if (A0X2 <= i7 - i6 && A0X2 > 0) {
                A04 = bmF.A07;
                bmF.A03 = i6 + A0X2;
            } else if (A0X2 == 0) {
                return "";
            } else {
                i6 = 0;
                if (A0X2 <= i7) {
                    C23585BmF.A02(bmF, A0X2);
                    A04 = bmF.A07;
                    bmF.A03 = A0X2;
                } else {
                    A04 = C23585BmF.A04(bmF, A0X2);
                }
            }
            return C25412CfK.A00.A03(A04, i6, A0X2);
        } else {
            C23583BmD bmD = (C23583BmD) this;
            int A0X3 = bmD.A0X();
            if (A0X3 > 0) {
                int i8 = bmD.A02;
                int i9 = bmD.A03;
                if (A0X3 <= i8 - i9) {
                    String A03 = C25412CfK.A00.A03(bmD.A06, i9, A0X3);
                    bmD.A03 += A0X3;
                    return A03;
                }
                throw BE7.A0M();
            } else if (A0X3 == 0) {
                return "";
            } else {
                throw BE7.A0N();
            }
        }
    }

    public void A0R(int i) {
        if (this instanceof C23584BmE) {
            if (((C23584BmE) this).A01 != i) {
                throw BE6.A0c("Protocol message end-group tag did not match expected tag.");
            }
        } else if (this instanceof C23585BmF) {
            if (((C23585BmF) this).A02 != i) {
                throw BE6.A0c("Protocol message end-group tag did not match expected tag.");
            }
        } else if (((C23583BmD) this).A01 != i) {
            throw BE6.A0c("Protocol message end-group tag did not match expected tag.");
        }
    }

    public void A0S(int i) {
        if (this instanceof C23584BmE) {
            C23584BmE bmE = (C23584BmE) this;
            bmE.A00 = i;
            C23584BmE.A00(bmE);
        } else if (this instanceof C23585BmF) {
            C23585BmF bmF = (C23585BmF) this;
            bmF.A01 = i;
            C23585BmF.A01(bmF);
        } else {
            C23583BmD bmD = (C23583BmD) this;
            bmD.A00 = i;
            C23583BmD.A00(bmD);
        }
    }

    public boolean A0T() {
        if (this instanceof C23584BmE) {
            C23584BmE bmE = (C23584BmE) this;
            return AnonymousClass000.A1P((bmE.A03 > bmE.A02 ? 1 : (bmE.A03 == bmE.A02 ? 0 : -1)));
        } else if (this instanceof C23585BmF) {
            C23585BmF bmF = (C23585BmF) this;
            if (bmF.A03 != bmF.A00 || C23585BmF.A03(bmF, 1)) {
                return false;
            }
            return true;
        } else {
            C23583BmD bmD = (C23583BmD) this;
            return AnonymousClass000.A1T(bmD.A03, bmD.A02);
        }
    }

    public boolean A0U() {
        if (this instanceof C23584BmE) {
            return AnonymousClass000.A1O((((C23584BmE) this).A0Z() > 0 ? 1 : (((C23584BmE) this).A0Z() == 0 ? 0 : -1)));
        }
        if (this instanceof C23585BmF) {
            return AnonymousClass000.A1O((((C23585BmF) this).A0Z() > 0 ? 1 : (((C23585BmF) this).A0Z() == 0 ? 0 : -1)));
        }
        return AnonymousClass000.A1O((((C23583BmD) this).A0Z() > 0 ? 1 : (((C23583BmD) this).A0Z() == 0 ? 0 : -1)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0V(int r10) {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.C23584BmE
            if (r0 == 0) goto L_0x009c
            r8 = r9
            X.BmE r8 = (X.C23584BmE) r8
            r1 = r10 & 7
            r0 = 1
            if (r1 == 0) goto L_0x0056
            if (r1 == r0) goto L_0x004a
            r0 = 2
            if (r1 == r0) goto L_0x003f
            r0 = 3
            r3 = 4
            if (r1 == r0) goto L_0x0029
            if (r1 == r3) goto L_0x01ca
            r0 = 5
            if (r1 != r0) goto L_0x01a9
            long r1 = r8.A02
            long r4 = r8.A03
            long r1 = r1 - r4
            int r0 = (int) r1
            if (r3 > r0) goto L_0x01a4
            r0 = 4
        L_0x0024:
            long r4 = r4 + r0
            r8.A03 = r4
        L_0x0027:
            r0 = 1
            return r0
        L_0x0029:
            int r0 = r8.A0G()
            if (r0 == 0) goto L_0x0035
            boolean r0 = r8.A0V(r0)
            if (r0 != 0) goto L_0x0029
        L_0x0035:
            int r0 = r10 >>> 3
            int r0 = r0 << 3
            r0 = r0 | 4
            r8.A0R(r0)
            goto L_0x0027
        L_0x003f:
            int r3 = r8.A0X()
            if (r3 >= 0) goto L_0x004c
            X.1PN r0 = X.BE7.A0N()
            throw r0
        L_0x004a:
            r3 = 8
        L_0x004c:
            long r1 = r8.A02
            long r4 = r8.A03
            long r1 = r1 - r4
            int r0 = (int) r1
            if (r3 > r0) goto L_0x01af
            long r0 = (long) r3
            goto L_0x0024
        L_0x0056:
            long r2 = r8.A02
            long r0 = r8.A03
            long r2 = r2 - r0
            int r0 = (int) r2
            r7 = 10
            if (r0 < r7) goto L_0x007b
            r5 = 0
        L_0x0061:
            long r1 = r8.A03
            r3 = 1
            long r3 = r3 + r1
            r8.A03 = r3
            X.CnK r0 = com.google.protobuf.UnsafeUtil.A02
            byte r0 = r0.A01(r1)
            if (r0 >= 0) goto L_0x0027
            int r5 = r5 + 1
            if (r5 < r7) goto L_0x0061
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.1PN r0 = X.BE6.A0c(r0)
            throw r0
        L_0x007b:
            r6 = 0
        L_0x007c:
            long r2 = r8.A03
            long r4 = r8.A02
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01b4
            r0 = 1
            long r0 = r0 + r2
            r8.A03 = r0
            X.CnK r0 = com.google.protobuf.UnsafeUtil.A02
            byte r0 = r0.A01(r2)
            if (r0 >= 0) goto L_0x0027
            int r6 = r6 + 1
            if (r6 < r7) goto L_0x007c
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.1PN r0 = X.BE6.A0c(r0)
            throw r0
        L_0x009c:
            boolean r0 = r9 instanceof X.C23585BmF
            if (r0 == 0) goto L_0x011b
            r5 = r9
            X.BmF r5 = (X.C23585BmF) r5
            r2 = r10 & 7
            r6 = 1
            if (r2 == 0) goto L_0x00dd
            r0 = 8
            if (r2 == r6) goto L_0x00d8
            r0 = 2
            if (r2 == r0) goto L_0x00d4
            r0 = 3
            r1 = 4
            if (r2 == r0) goto L_0x00bd
            if (r2 == r1) goto L_0x01ca
            r0 = 5
            if (r2 != r0) goto L_0x01b9
            r5.A0b(r1)
            goto L_0x0027
        L_0x00bd:
            int r0 = r5.A0G()
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r5.A0V(r0)
            if (r0 != 0) goto L_0x00bd
        L_0x00c9:
            int r0 = r10 >>> 3
            int r0 = r0 << 3
            r0 = r0 | 4
            r5.A0R(r0)
            goto L_0x0027
        L_0x00d4:
            int r0 = r5.A0X()
        L_0x00d8:
            r5.A0b(r0)
            goto L_0x0027
        L_0x00dd:
            int r0 = r5.A00
            int r4 = r5.A03
            int r0 = r0 - r4
            r3 = 10
            r2 = 0
            if (r0 < r3) goto L_0x00fd
        L_0x00e7:
            byte[] r1 = r5.A07
            r0 = r4
            int r4 = r4 + 1
            r5.A03 = r4
            byte r0 = r1[r0]
            if (r0 >= 0) goto L_0x0027
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x00e7
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.1PN r0 = X.BE6.A0c(r0)
            throw r0
        L_0x00fd:
            int r0 = r5.A00
            if (r4 != r0) goto L_0x0104
            X.C23585BmF.A02(r5, r6)
        L_0x0104:
            byte[] r1 = r5.A07
            int r0 = r5.A03
            int r4 = r0 + 1
            r5.A03 = r4
            byte r0 = r1[r0]
            if (r0 >= 0) goto L_0x0027
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x00fd
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.1PN r0 = X.BE6.A0c(r0)
            throw r0
        L_0x011b:
            r6 = r9
            X.BmD r6 = (X.C23583BmD) r6
            r1 = r10 & 7
            r0 = 1
            if (r1 == 0) goto L_0x016b
            if (r1 == r0) goto L_0x0149
            r0 = 2
            if (r1 == r0) goto L_0x013e
            r0 = 3
            r2 = 4
            if (r1 == r0) goto L_0x0154
            if (r1 == r2) goto L_0x01ca
            r0 = 5
            if (r1 != r0) goto L_0x01c4
            int r1 = r6.A02
            int r0 = r6.A03
            int r1 = r1 - r0
            if (r2 > r1) goto L_0x01bf
            int r0 = r0 + 4
        L_0x013a:
            r6.A03 = r0
            goto L_0x0027
        L_0x013e:
            int r2 = r6.A0X()
            if (r2 >= 0) goto L_0x014b
            X.1PN r0 = X.BE7.A0N()
            throw r0
        L_0x0149:
            r2 = 8
        L_0x014b:
            int r1 = r6.A02
            int r0 = r6.A03
            int r1 = r1 - r0
            if (r2 > r1) goto L_0x01cc
            int r0 = r0 + r2
            goto L_0x013a
        L_0x0154:
            int r0 = r6.A0G()
            if (r0 == 0) goto L_0x0160
            boolean r0 = r6.A0V(r0)
            if (r0 != 0) goto L_0x0154
        L_0x0160:
            int r0 = r10 >>> 3
            int r0 = r0 << 3
            r0 = r0 | 4
            r6.A0R(r0)
            goto L_0x0027
        L_0x016b:
            int r5 = r6.A02
            int r4 = r6.A03
            int r0 = r5 - r4
            r3 = 10
            r2 = 0
            if (r0 < r3) goto L_0x018c
        L_0x0176:
            byte[] r1 = r6.A06
            r0 = r4
            int r4 = r4 + 1
            r6.A03 = r4
            byte r0 = r1[r0]
            if (r0 >= 0) goto L_0x0027
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x0176
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.1PN r0 = X.BE6.A0c(r0)
            throw r0
        L_0x018c:
            r1 = r4
            if (r4 == r5) goto L_0x01d1
            byte[] r0 = r6.A06
            int r4 = r4 + 1
            r6.A03 = r4
            byte r0 = r0[r1]
            if (r0 >= 0) goto L_0x0027
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x018c
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.1PN r0 = X.BE6.A0c(r0)
            throw r0
        L_0x01a4:
            X.1PN r0 = X.BE7.A0M()
            throw r0
        L_0x01a9:
            X.BnS r0 = new X.BnS
            r0.<init>()
            throw r0
        L_0x01af:
            X.1PN r0 = X.BE7.A0M()
            throw r0
        L_0x01b4:
            X.1PN r0 = X.BE7.A0M()
            throw r0
        L_0x01b9:
            X.BnS r0 = new X.BnS
            r0.<init>()
            throw r0
        L_0x01bf:
            X.1PN r0 = X.BE7.A0M()
            throw r0
        L_0x01c4:
            X.BnS r0 = new X.BnS
            r0.<init>()
            throw r0
        L_0x01ca:
            r0 = 0
            return r0
        L_0x01cc:
            X.1PN r0 = X.BE7.A0M()
            throw r0
        L_0x01d1:
            X.1PN r0 = X.BE7.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25857CnL.A0V(int):boolean");
    }
}
