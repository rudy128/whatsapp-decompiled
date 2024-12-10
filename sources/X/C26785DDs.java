package X;

/* renamed from: X.DDs  reason: case insensitive filesystem */
public final class C26785DDs implements E98, E1C {
    public int A00;
    public int A01;
    public EAJ A02;
    public C28607E9y A03;
    public boolean A04;
    public final E4E A05;
    public final C25599Cie A06;
    public final C24861CNe A07;
    public final BVq A08;

    public C26785DDs(E4E e4e) {
        this.A05 = e4e;
        this.A06 = new C25599Cie();
        this.A08 = new BVq(true);
        this.A07 = new C24861CNe();
    }

    public void BCi(EAJ eaj) {
        C18070vi.A0d(eaj, 0);
        this.A02 = eaj;
        C28607E9y e9y = this.A03;
        if (e9y != null) {
            e9y.C84(eaj.BXf());
        }
        this.A08.A00 = eaj.BXf();
    }

    public void Bd8(C26045Cr9 cr9) {
    }

    public void release() {
    }

    public void BIY() {
        C28607E9y e9y = this.A03;
        if (e9y != null) {
            e9y.C85();
        }
        this.A08.C85();
        this.A02 = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A14(this, obj)) {
            return false;
        }
        C28607E9y e9y = this.A03;
        C28607E9y e9y2 = ((C26785DDs) obj).A03;
        if (e9y == e9y2) {
            return true;
        }
        if (e9y == null || !e9y.equals(e9y2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        C28607E9y e9y = this.A03;
        if (e9y != null) {
            return e9y.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GlLegacyRenderer(");
        return AnonymousClass001.A1F(this.A03, A10);
    }

    public C26785DDs() {
        this(new C26714DAo());
    }
}
