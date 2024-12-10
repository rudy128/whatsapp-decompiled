package X;

/* renamed from: X.DYr  reason: case insensitive filesystem */
public class C27193DYr implements C28600E9r {
    public final DZ3 A00;

    public C27193DYr(DZ3 dz3) {
        this.A00 = dz3;
    }

    public int BUJ() {
        return 16;
    }

    public void update(byte[] bArr, int i, int i2) {
        this.A00.CCd(bArr, i, i2);
    }

    public void BJ5(byte[] bArr, int i) {
        try {
            this.A00.BJ4(bArr, i);
        } catch (C28379DyP e) {
            throw AnonymousClass000.A0m(e);
        }
    }

    public void BdA(E3O e3o) {
        if (e3o instanceof DYm) {
            DYm dYm = (DYm) e3o;
            this.A00.BdC(new DYn((C27190DYo) dYm.A00, dYm.A01, (byte[]) null, 128), true);
            return;
        }
        throw AnonymousClass000.A0k("GMAC requires ParametersWithIV");
    }

    public void CQK(byte b) {
        DZ3 dz3 = this.A00;
        DZ3.A03(dz3);
        byte[] bArr = dz3.A08;
        int i = dz3.A00;
        bArr[i] = b;
        int i2 = i + 1;
        dz3.A00 = i2;
        if (i2 == 16) {
            byte[] bArr2 = dz3.A07;
            C24646CDk.A00(bArr2, bArr);
            dz3.A04.A00(bArr2);
            dz3.A00 = 0;
            dz3.A01 += 16;
        }
    }

    public void reset() {
        DZ3.A04(this.A00, true);
    }
}
