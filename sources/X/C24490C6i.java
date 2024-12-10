package X;

/* renamed from: X.C6i  reason: case insensitive filesystem */
public abstract class C24490C6i {
    public int A00() {
        return ((C22703BLh) this).A00.A03.size();
    }

    public int A01() {
        return ((C22703BLh) this).A01.size();
    }

    public Object A02(int i, int i2) {
        return null;
    }

    public boolean A03(int i, int i2) {
        C22703BLh bLh = (C22703BLh) this;
        DFE dfe = (DFE) bLh.A01.get(i);
        DFE dfe2 = (DFE) bLh.A00.A03.get(i2);
        C18070vi.A0d(dfe2, 0);
        if (!AnonymousClass026.A00(dfe.A01, dfe2.A01) || dfe.A00.A00 != dfe2.A00.A00) {
            return false;
        }
        return true;
    }

    public boolean A04(int i, int i2) {
        C22703BLh bLh = (C22703BLh) this;
        return AnonymousClass000.A1P((((long) ((DFE) bLh.A01.get(i)).A01.A04) > ((long) ((DFE) bLh.A00.A03.get(i2)).A01.A04) ? 1 : (((long) ((DFE) bLh.A01.get(i)).A01.A04) == ((long) ((DFE) bLh.A00.A03.get(i2)).A01.A04) ? 0 : -1)));
    }
}
