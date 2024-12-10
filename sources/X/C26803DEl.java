package X;

/* renamed from: X.DEl  reason: case insensitive filesystem */
public class C26803DEl implements E9C {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C26803DEl(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void Bny() {
        if (this.A00 != 0) {
            ((E9C) this.A02).Bny();
            return;
        }
        C108955ca.A1F(((DAU) this.A01).A0I, this.A02, 5);
    }

    public void Bsw(Exception exc) {
        if (this.A00 != 0) {
            C22808BPw.A02((C22808BPw) this.A01);
            ((E9C) this.A02).Bsw(exc);
            return;
        }
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass8BS.A1B(this.A02, exc, A1b);
        C108955ca.A1F(((DAU) this.A01).A0I, A1b, 7);
    }

    public void C0W(C25751ClL clL) {
        if (this.A00 != 0) {
            C22808BPw.A02((C22808BPw) this.A01);
            ((E9C) this.A02).C0W(clL);
            return;
        }
        Object[] A1a = AnonymousClass8BR.A1a();
        A1a[0] = this.A02;
        A1a[1] = clL.A01(C25751ClL.A0X);
        A1a[2] = clL;
        C108955ca.A1F(((DAU) this.A01).A0I, A1a, 6);
    }

    public void C8r(C25751ClL clL) {
        if (this.A00 != 0) {
            ((E9C) this.A02).C8r(clL);
        }
    }
}
