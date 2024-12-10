package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

public abstract class DSQ implements Iterable, Serializable {
    public static final DSQ A00 = new C23581BmB(CIC.A05);
    public static final E67 A01;
    public int hash = 0;

    public int A02() {
        C23581BmB bmB = (C23581BmB) this;
        if (bmB instanceof C23580BmA) {
            return ((C23580BmA) bmB).bytesLength;
        }
        return bmB.bytes.length;
    }

    public DSQ A03(int i) {
        C23581BmB bmB = (C23581BmB) this;
        int A002 = A00(0, i, bmB.A02());
        if (A002 == 0) {
            return A00;
        }
        return new C23580BmA(bmB.bytes, bmB.A07(), A002);
    }

    public void A05(byte[] bArr, int i) {
        C23581BmB bmB = (C23581BmB) this;
        if (bmB instanceof C23580BmA) {
            C23580BmA bmA = (C23580BmA) bmB;
            System.arraycopy(bmA.bytes, bmA.bytesOffset, bArr, 0, i);
            return;
        }
        System.arraycopy(bmB.bytes, 0, bArr, 0, i);
    }

    public abstract boolean equals(Object obj);

    /* JADX WARNING: type inference failed for: r0v3, types: [X.E67] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            byte[] r1 = X.CIC.A05
            X.BmB r0 = new X.BmB
            r0.<init>(r1)
            A00 = r0
            java.lang.Class r0 = X.CHO.A00
            if (r0 == 0) goto L_0x0019
            boolean r0 = X.CHO.A01
            if (r0 != 0) goto L_0x0019
            X.DN8 r0 = new X.DN8
            r0.<init>()
        L_0x0016:
            A01 = r0
            return
        L_0x0019:
            X.DN7 r0 = new X.DN7
            r0.<init>()
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DSQ.<clinit>():void");
    }

    public static int A00(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i >= 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            if (i2 < i) {
                A10.append("Beginning index larger than ending index: ");
                A10.append(i);
                throw BE6.A0l(AnonymousClass001.A1I(", ", A10, i2));
            }
            A10.append("End index: ");
            A10.append(i2);
            throw BE6.A0l(AnonymousClass001.A1I(" >= ", A10, i3));
        }
        throw BEB.A0U(AnonymousClass000.A10(), i);
    }

    public static C23581BmB A01(byte[] bArr, int i, int i2) {
        A00(i, i + i2, bArr.length);
        return new C23581BmB(A01.BG0(bArr, i, i2));
    }

    public final String A04() {
        Charset charset = CIC.A04;
        if (A02() == 0) {
            return "";
        }
        C23581BmB bmB = (C23581BmB) this;
        return BE6.A0r(charset, bmB.bytes, bmB.A07(), bmB.A02());
    }

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int A02 = A02();
            C23581BmB bmB = (C23581BmB) this;
            byte[] bArr = bmB.bytes;
            int A07 = bmB.A07();
            i = A02;
            Charset charset = CIC.A04;
            for (int i2 = A07; i2 < A07 + A02; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return new DV0(this);
    }

    public final String toString() {
        String A0y;
        Locale locale = Locale.ROOT;
        Object[] A1a = AnonymousClass8BR.A1a();
        A1a[0] = BE8.A0h(this);
        int A02 = A02();
        AnonymousClass000.A1M(A1a, A02);
        if (A02 <= 50) {
            A0y = C24612CBq.A00(this);
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(C24612CBq.A00(A03(47)));
            A0y = AnonymousClass000.A0y("...", A10);
        }
        A1a[2] = A0y;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A1a);
    }

    public final byte[] A06() {
        int A02 = A02();
        if (A02 == 0) {
            return CIC.A05;
        }
        byte[] bArr = new byte[A02];
        A05(bArr, A02);
        return bArr;
    }
}
