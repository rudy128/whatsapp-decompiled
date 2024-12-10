package X;

/* renamed from: X.08m  reason: invalid class name and case insensitive filesystem */
public final class C014408m extends AnonymousClass0XW implements AnonymousClass0t5, C17710v6, C17610uw {
    public C22821Di A00;
    public boolean A01;
    public final C06320Xv A02;

    public void Bdm() {
        this.A01 = false;
        this.A02.A04();
        AnonymousClass0F0.A00(this);
    }

    private final AnonymousClass0I1 A00() {
        if (!this.A01) {
            C06320Xv r1 = this.A02;
            r1.A04();
            AnonymousClass0F7.A00(this, new C08660fS(this, r1));
            if (r1.A01() != null) {
                this.A01 = true;
            } else {
                throw AnonymousClass000.A0n("DrawResult not defined, did you forget to call onDraw?");
            }
        }
        AnonymousClass0I1 A012 = this.A02.A01();
        C18070vi.A0b(A012);
        return A012;
    }

    public final void A0O(C22821Di r1) {
        this.A00 = r1;
        Bdm();
    }

    public long BZL() {
        return C25293Ccv.A01(AnonymousClass0QV.A04(this, 128).A03);
    }

    public C014408m(C06320Xv r1, C22821Di r2) {
        this.A02 = r1;
        this.A00 = r2;
        r1.A05(this);
    }

    public static final C28644ECa A01(C15830rH r0) {
        return AnonymousClass0QV.A03(r0).A0M();
    }

    public static final C24246By4 A02(C15830rH r0) {
        return AnonymousClass0QV.A03(r0).A0N();
    }

    public final C22821Di A0N() {
        return this.A00;
    }

    public void BJM(C17480uj r2) {
        A00().A00().invoke(r2);
    }

    public void Bxi() {
        Bdm();
    }

    public void BzO() {
        Bdm();
    }

    public C28644ECa getDensity() {
        return A01(this);
    }

    public C24246By4 getLayoutDirection() {
        return A02(this);
    }
}
