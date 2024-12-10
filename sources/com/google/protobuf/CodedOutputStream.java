package com.google.protobuf;

import X.AnonymousClass000;
import X.AnonymousClass8BR;
import X.BE6;
import X.BE7;
import X.BE8;
import X.BEB;
import X.C23581BmB;
import X.C23586BmG;
import X.C23587BmH;
import X.C24212BxP;
import X.C24408C2g;
import X.C25412CfK;
import X.C25878Cnp;
import X.C28668EDk;
import X.CIC;
import X.CVN;
import X.DNC;
import X.DSQ;
import X.EAO;
import com.facebook.common.dextricks.StringTreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends C25878Cnp {
    public static final boolean A01 = UnsafeUtil.A05;
    public static final Logger A02 = BE7.A0w(CodedOutputStream.class);
    public CVN A00;

    public static int A03(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i = 2;
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public final void A05() {
        C23586BmG bmG = (C23586BmG) this;
        if (bmG.A01 - bmG.A00 != 0) {
            throw AnonymousClass000.A0n("Did not write as much data as expected.");
        }
    }

    public void A06(byte b) {
        if (this instanceof C23587BmH) {
            C23587BmH bmH = (C23587BmH) this;
            if (bmH.A00 == bmH.A02) {
                C23587BmH.A00(bmH);
            }
            byte[] bArr = bmH.A03;
            int i = bmH.A00;
            bmH.A00 = i + 1;
            bArr[i] = b;
            bmH.A01++;
            return;
        }
        C23586BmG bmG = (C23586BmG) this;
        try {
            byte[] bArr2 = bmG.A02;
            int i2 = bmG.A00;
            bmG.A00 = i2 + 1;
            bArr2[i2] = b;
        } catch (IndexOutOfBoundsException e) {
            Object[] A1a = AnonymousClass8BR.A1a();
            AnonymousClass000.A1L(A1a, bmG.A00);
            throw new C24212BxP(BEB.A0b(bmG.A01, A1a), e);
        }
    }

    public void A07(int i) {
        if (this instanceof C23587BmH) {
            C23587BmH bmH = (C23587BmH) this;
            C23587BmH.A01(bmH, 4);
            byte[] bArr = bmH.A03;
            int A0C = BEB.A0C(bArr, bmH.A00, i);
            bmH.A00 = A0C + 1;
            bArr[A0C] = (byte) ((i >> 24) & 255);
            bmH.A01 += 4;
            return;
        }
        C23586BmG bmG = (C23586BmG) this;
        try {
            byte[] bArr2 = bmG.A02;
            int A0C2 = BEB.A0C(bArr2, bmG.A00, i);
            bmG.A00 = A0C2 + 1;
            bArr2[A0C2] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            Object[] A1a = AnonymousClass8BR.A1a();
            AnonymousClass000.A1L(A1a, bmG.A00);
            throw new C24212BxP(BEB.A0b(bmG.A01, A1a), e);
        }
    }

    public void A08(int i) {
        if (this instanceof C23587BmH) {
            C23587BmH bmH = (C23587BmH) this;
            C23587BmH.A01(bmH, 5);
            bmH.A0M(i);
            return;
        }
        C23586BmG bmG = (C23586BmG) this;
        while ((i & -128) != 0) {
            try {
                byte[] bArr = bmG.A02;
                int i2 = bmG.A00;
                bmG.A00 = i2 + 1;
                BE7.A1T(bArr, i, i2);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                Object[] A1a = AnonymousClass8BR.A1a();
                AnonymousClass000.A1L(A1a, bmG.A00);
                throw new C24212BxP(BEB.A0b(bmG.A01, A1a), e);
            }
        }
        byte[] bArr2 = bmG.A02;
        int i3 = bmG.A00;
        bmG.A00 = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    public void A09(int i, int i2) {
        if (this instanceof C23587BmH) {
            C23587BmH bmH = (C23587BmH) this;
            C23587BmH.A01(bmH, 14);
            bmH.A0M((i << 3) | 5);
            byte[] bArr = bmH.A03;
            int A0C = BEB.A0C(bArr, bmH.A00, i2);
            bmH.A00 = A0C + 1;
            bArr[A0C] = (byte) ((i2 >> 24) & 255);
            bmH.A01 += 4;
            return;
        }
        A08((i << 3) | 5);
        A07(i2);
    }

    public void A0A(int i, int i2) {
        if (this instanceof C23587BmH) {
            C23587BmH bmH = (C23587BmH) this;
            C23587BmH.A01(bmH, 20);
            bmH.A0M(i << 3);
            if (i2 >= 0) {
                bmH.A0M(i2);
            } else {
                bmH.A0O((long) i2);
            }
        } else {
            A08(i << 3);
            if (i2 >= 0) {
                A08(i2);
            } else {
                A0G((long) i2);
            }
        }
    }

    public void A0B(int i, int i2) {
        if (this instanceof C23587BmH) {
            C23587BmH bmH = (C23587BmH) this;
            C23587BmH.A01(bmH, 20);
            bmH.A0M(i << 3);
            bmH.A0M(i2);
            return;
        }
        A08(i << 3);
        A08(i2);
    }

    public void A0C(int i, long j) {
        if (this instanceof C23587BmH) {
            C23587BmH bmH = (C23587BmH) this;
            C23587BmH.A01(bmH, 18);
            bmH.A0M((i << 3) | 1);
            bmH.A0N(j);
            return;
        }
        A08((i << 3) | 1);
        A0F(j);
    }

    public void A0D(int i, long j) {
        if (this instanceof C23587BmH) {
            C23587BmH bmH = (C23587BmH) this;
            C23587BmH.A01(bmH, 20);
            bmH.A0M(i << 3);
            bmH.A0O(j);
            return;
        }
        A08(i << 3);
        A0G(j);
    }

    public void A0E(int i, boolean z) {
        if (this instanceof C23587BmH) {
            C23587BmH bmH = (C23587BmH) this;
            C23587BmH.A01(bmH, 11);
            bmH.A0M(i << 3);
            byte b = z ? (byte) 1 : 0;
            byte[] bArr = bmH.A03;
            int i2 = bmH.A00;
            bmH.A00 = i2 + 1;
            bArr[i2] = b;
            bmH.A01++;
            return;
        }
        A08(i << 3);
        A06(z ? (byte) 1 : 0);
    }

    public void A0F(long j) {
        if (this instanceof C23587BmH) {
            C23587BmH bmH = (C23587BmH) this;
            C23587BmH.A01(bmH, 8);
            bmH.A0N(j);
            return;
        }
        C23586BmG bmG = (C23586BmG) this;
        try {
            byte[] bArr = bmG.A02;
            int i = bmG.A00;
            int i2 = i + 1;
            int A0A = BE6.A0A(((int) j) & 255, bArr, i, i2);
            BE8.A0v(j, bArr, 8, i2);
            int i3 = A0A + 1;
            BE8.A0v(j, bArr, 16, A0A);
            int i4 = i3 + 1;
            BE8.A0v(j, bArr, 24, i3);
            int i5 = i4 + 1;
            BE8.A0v(j, bArr, 32, i4);
            int i6 = i5 + 1;
            BE8.A0v(j, bArr, 40, i5);
            int i7 = i6 + 1;
            BE8.A0v(j, bArr, 48, i6);
            bmG.A00 = i7 + 1;
            BE8.A0v(j, bArr, 56, i7);
        } catch (IndexOutOfBoundsException e) {
            Object[] A1a = AnonymousClass8BR.A1a();
            AnonymousClass000.A1L(A1a, bmG.A00);
            throw new C24212BxP(BEB.A0b(bmG.A01, A1a), e);
        }
    }

    public void A0G(long j) {
        if (this instanceof C23587BmH) {
            C23587BmH bmH = (C23587BmH) this;
            C23587BmH.A01(bmH, 10);
            bmH.A0O(j);
            return;
        }
        C23586BmG bmG = (C23586BmG) this;
        if (!A01 || bmG.A01 - bmG.A00 < 10) {
            while ((j & -128) != 0) {
                try {
                    byte[] bArr = bmG.A02;
                    int i = bmG.A00;
                    bmG.A00 = i + 1;
                    BE7.A1T(bArr, (int) j, i);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    Object[] A1a = AnonymousClass8BR.A1a();
                    AnonymousClass000.A1L(A1a, bmG.A00);
                    throw new C24212BxP(BEB.A0b(bmG.A01, A1a), e);
                }
            }
            byte[] bArr2 = bmG.A02;
            int i2 = bmG.A00;
            bmG.A00 = i2 + 1;
            bArr2[i2] = (byte) ((int) j);
            return;
        }
        while (true) {
            int i3 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
            byte[] bArr3 = bmG.A02;
            int i4 = bmG.A00;
            bmG.A00 = i4 + 1;
            long j2 = (long) i4;
            int i5 = (int) j;
            if (i3 == 0) {
                UnsafeUtil.A07(bArr3, j2, (byte) i5);
                return;
            } else {
                UnsafeUtil.A07(bArr3, j2, (byte) ((i5 & StringTreeSet.OFFSET_BASE_ENCODING) | 128));
                j >>>= 7;
            }
        }
    }

    public final void A0J(C24408C2g c2g, String str) {
        A02.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", c2g);
        byte[] bytes = str.getBytes(CIC.A04);
        try {
            int length = bytes.length;
            A08(length);
            A0L(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new C24212BxP(e);
        }
    }

    public void A0K(String str) {
        int A012;
        int i;
        int i2;
        int i3;
        if (this instanceof C23587BmH) {
            C23587BmH bmH = (C23587BmH) this;
            try {
                int length = str.length();
                int i4 = length * 3;
                int A022 = BEB.A02(i4);
                int i5 = A022 + i4;
                int i6 = bmH.A02;
                if (i5 > i6) {
                    byte[] bArr = new byte[i4];
                    int A013 = C25412CfK.A00.A01(str, bArr, 0, i4);
                    bmH.A08(A013);
                    bmH.A0L(bArr, 0, A013);
                    return;
                }
                if (i5 > i6 - bmH.A00) {
                    C23587BmH.A00(bmH);
                }
                int A023 = BEB.A02(length);
                i = bmH.A00;
                if (A023 == A022) {
                    int i7 = i + A023;
                    bmH.A00 = i7;
                    i3 = C25412CfK.A00.A01(str, bmH.A03, i7, i6 - i7);
                    bmH.A00 = i;
                    i2 = (i3 - i) - A023;
                    bmH.A0M(i2);
                } else {
                    i2 = C25412CfK.A00(str);
                    bmH.A0M(i2);
                    i3 = C25412CfK.A00.A01(str, bmH.A03, bmH.A00, i2);
                }
                bmH.A00 = i3;
                bmH.A01 += i2;
            } catch (C24408C2g e) {
                bmH.A01 -= bmH.A00 - i;
                bmH.A00 = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new C24212BxP(e2);
            } catch (C24408C2g e3) {
                bmH.A0J(e3, str);
            }
        } else {
            C23586BmG bmG = (C23586BmG) this;
            int i8 = bmG.A00;
            try {
                int length2 = str.length();
                int A024 = BEB.A02(length2 * 3);
                int A025 = BEB.A02(length2);
                if (A025 == A024) {
                    int i9 = i8 + A025;
                    bmG.A00 = i9;
                    A012 = C25412CfK.A00.A01(str, bmG.A02, i9, bmG.A01 - i9);
                    bmG.A00 = i8;
                    bmG.A08((A012 - i8) - A025);
                } else {
                    bmG.A08(C25412CfK.A00(str));
                    byte[] bArr2 = bmG.A02;
                    int i10 = bmG.A00;
                    A012 = C25412CfK.A00.A01(str, bArr2, i10, bmG.A01 - i10);
                }
                bmG.A00 = A012;
            } catch (C24408C2g e4) {
                bmG.A00 = i8;
                bmG.A0J(e4, str);
            } catch (IndexOutOfBoundsException e5) {
                throw new C24212BxP(e5);
            }
        }
    }

    public void A0L(byte[] bArr, int i, int i2) {
        if (this instanceof C23587BmH) {
            ((C23587BmH) this).A0P(bArr, i, i2);
        } else {
            ((C23586BmG) this).A0M(bArr, i, i2);
        }
    }

    public static int A02(int i) {
        return BEB.A02(i);
    }

    public static int A04(String str) {
        int i;
        String str2;
        try {
            str2 = str;
            int A002 = C25412CfK.A00(str);
            str2 = A002;
            i = A002;
        } catch (C24408C2g unused) {
            i = str2.getBytes(CIC.A04).length;
        }
        return BEB.A02(i) + i;
    }

    public void A0H(DSQ dsq) {
        A08(dsq.A02());
        C23581BmB bmB = (C23581BmB) dsq;
        A0L(bmB.bytes, bmB.A07(), bmB.A02());
    }

    public void A0I(C28668EDk eDk, EAO eao, int i) {
        C25878Cnp.A07(this, i);
        A08(((DNC) eDk).A0J(eao));
        eao.CSV(this.A00, eDk);
    }
}
