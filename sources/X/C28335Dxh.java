package X;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: X.Dxh  reason: case insensitive filesystem */
public class C28335Dxh extends AnonymousClass1Bz {
    public static C28335Dxh[] A02 = new C28335Dxh[12];
    public final byte[] A00;
    public final int A01;

    public void A0G(C26039Cr0 cr0, boolean z) {
        cr0.A06(this.A00, 10, z);
    }

    public boolean A0H() {
        return false;
    }

    public int hashCode() {
        return AnonymousClass1C2.A00(this.A00);
    }

    public static C28335Dxh A02(Object obj) {
        if (obj == null || (obj instanceof C28335Dxh)) {
            return (C28335Dxh) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C28335Dxh) AnonymousClass1Bz.A01((byte[]) obj);
            } catch (Exception e) {
                throw AnonymousClass000.A0k(BEA.A0j(e, "encoding error in getInstance: ", AnonymousClass000.A10()));
            }
        } else {
            throw BEB.A0T(obj, "illegal object in getInstance: ", AnonymousClass000.A10());
        }
    }

    public int A0D() {
        return BE9.A0K(this.A00);
    }

    public boolean A0I(AnonymousClass1Bz r3) {
        if (!(r3 instanceof C28335Dxh)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C28335Dxh) r3).A00);
    }

    public int A0K() {
        byte[] bArr = this.A00;
        int length = bArr.length;
        int i = this.A01;
        if (length - i <= 4) {
            int max = Math.max(i, length - 4);
            byte b = -1 & bArr[max];
            while (true) {
                max++;
                if (max >= length) {
                    return b;
                }
                b = (b << 8) | (bArr[max] & 255);
            }
        } else {
            throw new ArithmeticException("ASN.1 Enumerated out of int range");
        }
    }

    public C28335Dxh(byte[] bArr) {
        int length = bArr.length;
        if (length == 0 || (length != 1 && bArr[0] == (bArr[1] >> 7) && !C25917Cob.A01("org.spongycastle.asn1.allow_unsafe_integer"))) {
            throw AnonymousClass000.A0k("malformed enumerated");
        } else if ((bArr[0] & 128) == 0) {
            this.A00 = AnonymousClass1C2.A02(bArr);
            int i = length - 1;
            int i2 = 0;
            while (i2 < i && bArr[i2] == (bArr[i2 + 1] >> 7)) {
                i2++;
            }
            this.A01 = i2;
        } else {
            throw AnonymousClass000.A0k("enumerated must be non-negative");
        }
    }

    public C28335Dxh(int i) {
        if (i >= 0) {
            this.A00 = BigInteger.valueOf((long) i).toByteArray();
            this.A01 = 0;
            return;
        }
        throw AnonymousClass000.A0k("enumerated must be non-negative");
    }
}
