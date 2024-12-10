package X;

/* renamed from: X.Dwg  reason: case insensitive filesystem */
public class C28272Dwg extends C28338Dxk {
    public static byte[] A02(C28272Dwg dwg) {
        byte[] bArr;
        byte[] A03;
        int i;
        byte[] bArr2 = dwg.A00;
        int length = bArr2.length;
        int i2 = length - 1;
        if (bArr2[i2] != 90) {
            return bArr2;
        }
        if (!dwg.A0N()) {
            bArr = new byte[(length + 4)];
            System.arraycopy(bArr2, 0, bArr, 0, i2);
            A03 = AnonymousClass1Bo.A03("0000Z");
            i = 5;
        } else if (!dwg.A0O()) {
            bArr = new byte[(length + 2)];
            System.arraycopy(bArr2, 0, bArr, 0, i2);
            A03 = AnonymousClass1Bo.A03("00Z");
            i = 3;
        } else {
            bArr = bArr2;
            if (dwg.A0M()) {
                int i3 = length - 2;
                while (i3 > 0 && bArr2[i3] == 48) {
                    i3--;
                }
                if (bArr2[i3] == 46) {
                    byte[] bArr3 = new byte[(i3 + 1)];
                    System.arraycopy(bArr2, 0, bArr3, 0, i3);
                    bArr3[i3] = 90;
                    return bArr3;
                }
                byte[] bArr4 = new byte[(i3 + 2)];
                int i4 = i3 + 1;
                System.arraycopy(bArr2, 0, bArr4, 0, i4);
                bArr4[i4] = 90;
                return bArr4;
            }
            return bArr;
        }
        System.arraycopy(A03, 0, bArr, i2, i);
        return bArr;
    }

    public AnonymousClass1Bz A0E() {
        return this;
    }

    public AnonymousClass1Bz A0F() {
        return this;
    }
}
