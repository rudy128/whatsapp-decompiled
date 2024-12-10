package X;

import java.util.Enumeration;

/* renamed from: X.DUf  reason: case insensitive filesystem */
public class C27101DUf implements Enumeration {
    public int A00;
    public final int A01;
    public final Object A02;

    public C27101DUf(C28328Dxa dxa, int i) {
        this.A01 = i;
        this.A02 = dxa;
        this.A00 = 0;
    }

    public boolean hasMoreElements() {
        int i = this.A01;
        int i2 = this.A00;
        Object obj = this.A02;
        switch (i) {
            case 0:
                if (i2 < ((C28339Dxl) obj).A00.length) {
                    return true;
                }
                return false;
            case 1:
                if (i2 < ((C28340Dxm) obj).A00.length) {
                    return true;
                }
                return false;
            case 2:
                if (i2 < ((C28342Dxo) obj).A00.length) {
                    return true;
                }
                return false;
            default:
                if (i2 < ((C28328Dxa) obj).A00.length) {
                    return true;
                }
                return false;
        }
    }

    public Object nextElement() {
        switch (this.A01) {
            case 0:
                int i = this.A00;
                AnonymousClass1Bx[] r1 = ((C28339Dxl) this.A02).A00;
                if (i < r1.length) {
                    this.A00 = i + 1;
                    return r1[i];
                }
                throw BE6.A14();
            case 1:
                int i2 = this.A00;
                AnonymousClass1Bx[] r12 = ((C28340Dxm) this.A02).A00;
                if (i2 < r12.length) {
                    this.A00 = i2 + 1;
                    return r12[i2];
                }
                throw BE6.A14();
            case 2:
                int i3 = this.A00;
                byte[] bArr = ((C28342Dxo) this.A02).A00;
                int length = bArr.length;
                if (i3 < length) {
                    int min = Math.min(length - i3, 1000);
                    byte[] A1Z = BE7.A1Z(bArr, min, i3);
                    this.A00 += min;
                    return new C28327DxZ(A1Z);
                }
                throw BE6.A14();
            default:
                int i4 = this.A00;
                C28342Dxo[] dxoArr = ((C28328Dxa) this.A02).A00;
                if (i4 < dxoArr.length) {
                    this.A00 = i4 + 1;
                    return dxoArr[i4];
                }
                throw BE6.A14();
        }
    }

    public C27101DUf(C28340Dxm dxm) {
        this.A01 = 1;
        this.A02 = dxm;
        this.A00 = 0;
    }

    public C27101DUf(C28339Dxl dxl) {
        this.A01 = 0;
        this.A02 = dxl;
        this.A00 = 0;
    }
}
