package X;

/* renamed from: X.8qY  reason: invalid class name and case insensitive filesystem */
public abstract class C170718qY extends C25871Py {
    public boolean A00;
    public final C19830z4 A01;

    public void A01() {
        if (!this.A00 && A03()) {
            this.A01.A21(true);
        }
    }

    public boolean A03() {
        C18030ve r2;
        int i;
        if (this instanceof C171958sY) {
            r2 = ((C171958sY) this).A00;
            i = 5692;
        } else if (this instanceof C171948sX) {
            r2 = ((C171948sX) this).A00;
            i = 3355;
        } else if (this instanceof C171938sW) {
            r2 = ((C171938sW) this).A00;
            i = 11852;
        } else if (this instanceof C171928sV) {
            r2 = ((C171928sV) this).A00;
            i = 7358;
        } else if (this instanceof C171918sU) {
            r2 = ((C171918sU) this).A00;
            i = 5563;
        } else {
            r2 = ((C171908sT) this).A00;
            i = 3334;
        }
        return C18020vd.A05(C18040vf.A02, r2, i);
    }

    public C170718qY(C19830z4 r1) {
        this.A01 = r1;
    }

    public void A02() {
        this.A00 = A03();
    }
}
