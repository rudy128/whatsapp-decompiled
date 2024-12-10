package X;

/* renamed from: X.Ca6  reason: case insensitive filesystem */
public final class C25155Ca6 {
    public final C25781Cls A00;
    public final C25781Cls A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C25155Ca6 ca6 = (C25155Ca6) obj;
            if (!this.A00.equals(ca6.A00) || !this.A01.equals(ca6.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public C25155Ca6(C25781Cls cls, C25781Cls cls2) {
        C26056CrS.A01(cls);
        this.A00 = cls;
        C26056CrS.A01(cls2);
        this.A01 = cls2;
    }

    public String toString() {
        String A1E;
        StringBuilder A0q = BE9.A0q();
        C25781Cls cls = this.A00;
        A0q.append(cls);
        C25781Cls cls2 = this.A01;
        if (cls.equals(cls2)) {
            A1E = "";
        } else {
            A1E = AnonymousClass001.A1E(cls2, ", ", AnonymousClass000.A10());
        }
        return BEA.A0m(A1E, A0q);
    }
}
