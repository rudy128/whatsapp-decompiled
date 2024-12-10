package X;

/* renamed from: X.Dyb  reason: case insensitive filesystem */
public class C28391Dyb extends DYf {
    public static final byte[] A04 = {105, 0, 114, 34, 100, -55, 4, 35, -115, 58, -37, -106, 70, -23, 42, -60, 24, -2, -84, -108, 0, -19, 7, 18, -64, -122, -36, -62, -17, 76, -87, 43};
    public long A00 = 0;
    public C27190DYo A01;
    public boolean A02;
    public final C28389DyZ A03;

    public C28391Dyb(E9Y e9y) {
        super(e9y);
        this.A03 = new C28389DyZ(e9y, e9y.BNR() * 8);
    }

    public int CCe(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = this.A03.A00;
        A01(bArr, bArr2, i, i3, i2);
        return i3;
    }

    public void reset() {
        this.A00 = 0;
        this.A03.reset();
    }

    public String BMl() {
        String BMl = this.A03.BMl();
        StringBuilder A10 = AnonymousClass000.A10();
        int indexOf = BMl.indexOf(47);
        A10.append(AnonymousClass8BS.A0o(BMl, indexOf));
        A10.append("/G");
        return AnonymousClass000.A0y(BE6.A0p(indexOf, BMl), A10);
    }

    public int BNR() {
        return this.A03.A00;
    }

    public void BdC(E3O e3o, boolean z) {
        this.A00 = 0;
        this.A03.BdC(e3o, z);
        this.A02 = z;
        if (e3o instanceof DYm) {
            e3o = ((DYm) e3o).A00;
        }
        if (e3o instanceof DYi) {
            e3o = ((DYi) e3o).A01;
        }
        if (e3o instanceof DYg) {
            e3o = null;
        }
        this.A01 = (C27190DYo) e3o;
    }
}
