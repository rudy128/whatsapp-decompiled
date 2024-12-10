package X;

/* renamed from: X.Dwd  reason: case insensitive filesystem */
public class C28269Dwd extends C28367DyD {
    public int A0D() {
        int length = this.A01.length;
        return C26084Cs1.A00(length + 1) + 1 + length + 1;
    }

    public AnonymousClass1Bz A0E() {
        return this;
    }

    public boolean A0H() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.Dwd, X.DyD] */
    public static C28269Dwd A02(Object obj) {
        if (obj == null || (obj instanceof C28269Dwd)) {
            return (C28269Dwd) obj;
        }
        if (obj instanceof C28268Dwc) {
            C28367DyD dyD = (C28367DyD) obj;
            return new C28367DyD(dyD.A01, dyD.A00);
        } else if (obj instanceof byte[]) {
            try {
                return (C28269Dwd) AnonymousClass1Bz.A01((byte[]) obj);
            } catch (Exception e) {
                throw AnonymousClass000.A0k(BEA.A0j(e, "encoding error in getInstance: ", AnonymousClass000.A10()));
            }
        } else {
            throw BEB.A0T(obj, "illegal object in getInstance: ", AnonymousClass000.A10());
        }
    }

    public void A0G(C26039Cr0 cr0, boolean z) {
        int i;
        byte[] bArr = this.A01;
        int length = bArr.length;
        if (!(length == 0 || (i = this.A00) == 0)) {
            int i2 = length - 1;
            byte b = bArr[i2];
            byte b2 = (byte) ((255 << i) & b);
            if (b != b2) {
                byte b3 = (byte) i;
                if (z) {
                    C26039Cr0.A01(cr0, 3);
                }
                cr0.A03(i2 + 2);
                C26039Cr0.A01(cr0, b3);
                C26039Cr0.A02(cr0, bArr, i2);
                C26039Cr0.A01(cr0, b2);
                return;
            }
        }
        byte b4 = (byte) this.A00;
        if (z) {
            C26039Cr0.A01(cr0, 3);
        }
        cr0.A03(length + 1);
        C26039Cr0.A01(cr0, b4);
        C26039Cr0.A02(cr0, bArr, length);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.Dwd, X.DyD] */
    public static C28269Dwd A03(C28341Dxn dxn) {
        AnonymousClass1Bz A02 = C28341Dxn.A02(dxn);
        if (A02 instanceof C28269Dwd) {
            return A02(A02);
        }
        byte[] A05 = C28342Dxo.A05(A02);
        int length = A05.length;
        if (length >= 1) {
            byte b = A05[0];
            int i = length - 1;
            byte[] bArr = new byte[i];
            if (i != 0) {
                System.arraycopy(A05, 1, bArr, 0, i);
            }
            return new C28367DyD(bArr, b);
        }
        throw AnonymousClass000.A0k("truncated BIT STRING detected");
    }
}
