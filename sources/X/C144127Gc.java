package X;

/* renamed from: X.7Gc  reason: invalid class name and case insensitive filesystem */
public class C144127Gc implements C1606789m {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public void C7I(AnonymousClass732 r8) {
        String str;
        if (this.A00 == 0) {
            AnonymousClass1KB r4 = ((C137956wI) this.A03).A00;
            if (r4 != null) {
                r4.CGP(new AnonymousClass3C0(this.A01, this.A02, 38));
                return;
            }
            str = "globalUI";
        } else if (r8 == null) {
            A00(this, false);
            return;
        } else {
            C137956wI r3 = (C137956wI) this.A04;
            AnonymousClass00H r0 = r3.A01;
            if (r0 != null) {
                ((C131816li) r0.get()).A00(new C144127Gc(this, r3, this.A03, this.A01, 0));
                return;
            }
            str = "accountLinkingCustomActionsHelperLazy";
        }
        C18070vi.A11(str);
        throw null;
    }

    public C144127Gc(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj4;
        this.A02 = obj3;
        this.A04 = obj;
    }

    public static final void A00(C144127Gc r5, boolean z) {
        AnonymousClass1KB r4 = ((C137956wI) r5.A04).A00;
        if (r4 != null) {
            r4.CGP(new AnonymousClass7RF(r5.A01, r5.A02, 7, z));
        } else {
            AnonymousClass3MW.A1C();
            throw null;
        }
    }

    public void BrA() {
        if (this.A00 != 0) {
            A00(this, false);
        } else {
            A00((C144127Gc) this.A04, false);
        }
    }

    public void Bsw(Exception exc) {
        C144127Gc r0;
        boolean z;
        if (this.A00 != 0) {
            r0 = this;
            C18070vi.A0d(exc, 0);
            z = exc instanceof AnonymousClass61J;
        } else {
            r0 = (C144127Gc) this.A04;
            z = false;
        }
        A00(r0, z);
    }
}
