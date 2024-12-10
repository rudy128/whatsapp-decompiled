package X;

/* renamed from: X.1rX  reason: invalid class name and case insensitive filesystem */
public final class C38581rX {
    public final C38791rt A00;
    public final C18030ve A01;

    public C38581rX(C38791rt r2, C18030ve r3) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final boolean A01() {
        C18030ve r2 = this.A01;
        if (!C18020vd.A05(C18040vf.A01, r2, 8025) || !C18020vd.A05(C18040vf.A02, r2, 5362) || !this.A00.A00(C38801ru.A06)) {
            return false;
        }
        return true;
    }

    public final boolean A03() {
        C18030ve r2 = this.A01;
        if (!C18020vd.A05(C18040vf.A01, r2, 8026) || !C18020vd.A05(C18040vf.A02, r2, 5362) || !this.A00.A00(C38801ru.A06)) {
            return false;
        }
        return true;
    }

    public final boolean A00() {
        if (A01()) {
            if (!C18020vd.A05(C18040vf.A01, this.A01, 12394)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A02() {
        if (!A01()) {
            if (C18020vd.A05(C18040vf.A01, this.A01, 8013)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
