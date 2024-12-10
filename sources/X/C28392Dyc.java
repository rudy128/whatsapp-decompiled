package X;

import java.util.Arrays;

/* renamed from: X.Dyc  reason: case insensitive filesystem */
public class C28392Dyc extends DYf implements E3P {
    public int A00 = 0;
    public byte[] A01;
    public byte[] A02;
    public byte[] A03;
    public final int A04;
    public final E9Y A05;

    public C28392Dyc(E9Y e9y) {
        super(e9y);
        this.A05 = e9y;
        int BNR = e9y.BNR();
        this.A04 = BNR;
        this.A01 = new byte[BNR];
        this.A02 = new byte[BNR];
        this.A03 = new byte[BNR];
    }

    public int BNR() {
        return this.A05.BNR();
    }

    public int CCe(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = this.A04;
        A01(bArr, bArr2, i, i3, i2);
        return i3;
    }

    public void BdC(E3O e3o, boolean z) {
        if (e3o instanceof DYm) {
            DYm dYm = (DYm) e3o;
            byte[] A022 = AnonymousClass1C2.A02(dYm.A01);
            this.A01 = A022;
            int i = this.A04;
            int length = A022.length;
            if (i >= length) {
                int i2 = i / 2;
                int i3 = 8;
                if (8 > i2) {
                    i3 = i2;
                }
                if (i - length <= i3) {
                    E3O e3o2 = dYm.A00;
                    if (e3o2 != null) {
                        this.A05.BdC(e3o2, true);
                    }
                    reset();
                    return;
                }
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("CTR/SIC mode requires IV of at least: ");
                A10.append(i - i3);
                throw AnonymousClass001.A12(" bytes.", A10);
            }
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("CTR/SIC mode requires IV no greater than: ");
            A102.append(i);
            throw AnonymousClass001.A12(" bytes.", A102);
        }
        throw AnonymousClass000.A0k("CTR/SIC mode requires ParametersWithIV");
    }

    public void reset() {
        byte[] bArr = this.A02;
        Arrays.fill(bArr, (byte) 0);
        byte[] bArr2 = this.A01;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.A05.reset();
        this.A00 = 0;
    }

    public String BMl() {
        StringBuilder A10 = AnonymousClass000.A10();
        BE7.A1O(A10, this.A05);
        return AnonymousClass000.A0y("/SIC", A10);
    }
}
