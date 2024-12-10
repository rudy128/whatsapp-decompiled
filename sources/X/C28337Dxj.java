package X;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: X.Dxj  reason: case insensitive filesystem */
public class C28337Dxj extends AnonymousClass1Bz {
    public final byte[] A00;
    public final int A01;

    public void A0G(C26039Cr0 cr0, boolean z) {
        cr0.A06(this.A00, 2, z);
    }

    public boolean A0H() {
        return false;
    }

    public int hashCode() {
        return AnonymousClass1C2.A00(this.A00);
    }

    public static C28337Dxj A02(Object obj) {
        if (obj == null || (obj instanceof C28337Dxj)) {
            return (C28337Dxj) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C28337Dxj) AnonymousClass1Bz.A01((byte[]) obj);
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
        if (!(r3 instanceof C28337Dxj)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C28337Dxj) r3).A00);
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
            throw new ArithmeticException("ASN.1 Integer out of int range");
        }
    }

    public boolean A0L(BigInteger bigInteger) {
        if (bigInteger != null) {
            byte[] bArr = this.A00;
            int i = this.A01;
            int length = bArr.length;
            int max = Math.max(i, length - 4);
            byte b = -1 & bArr[max];
            while (true) {
                max++;
                if (max >= length) {
                    break;
                }
                b = (b << 8) | (bArr[max] & 255);
            }
            if (b != bigInteger.intValue() || !new BigInteger(bArr).equals(bigInteger)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String toString() {
        return new BigInteger(this.A00).toString();
    }

    public C28337Dxj(byte[] bArr, boolean z) {
        byte[] bArr2;
        int length = bArr.length;
        if (length == 0 || (length != 1 && bArr[0] == (bArr[1] >> 7) && !C25917Cob.A01("org.spongycastle.asn1.allow_unsafe_integer"))) {
            throw AnonymousClass000.A0k("malformed integer");
        }
        if (z) {
            bArr2 = AnonymousClass1C2.A02(bArr);
        } else {
            bArr2 = bArr;
        }
        this.A00 = bArr2;
        int i = length - 1;
        int i2 = 0;
        while (i2 < i && bArr[i2] == (bArr[i2 + 1] >> 7)) {
            i2++;
        }
        this.A01 = i2;
    }

    public static C28337Dxj A03(C28341Dxn dxn) {
        AnonymousClass1Bz A02 = C28341Dxn.A02(dxn);
        if (A02 instanceof C28337Dxj) {
            return A02(A02);
        }
        return new C28337Dxj(C28342Dxo.A05(A02), true);
    }

    public C28337Dxj(long j) {
        this.A00 = BigInteger.valueOf(j).toByteArray();
        this.A01 = 0;
    }

    public C28337Dxj(BigInteger bigInteger) {
        this.A00 = bigInteger.toByteArray();
        this.A01 = 0;
    }
}
