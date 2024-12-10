package X;

/* renamed from: X.9pI  reason: invalid class name and case insensitive filesystem */
public abstract class C192949pI {
    public final C196019uK A00;

    public int A00() {
        if (this instanceof AnonymousClass8KF) {
            return 9;
        }
        if ((this instanceof AnonymousClass8KH) || (this instanceof AnonymousClass8KJ) || (this instanceof AnonymousClass8KI) || (this instanceof AnonymousClass8KG)) {
            return 7;
        }
        if (this instanceof AnonymousClass8KE) {
            return 5;
        }
        return 6;
    }

    public boolean A01(A2t a2t) {
        if (this instanceof AnonymousClass8KF) {
            return a2t.A0B.A04;
        }
        if (this instanceof AnonymousClass8KJ) {
            return AnonymousClass000.A1Z(a2t.A0B.A00, AnonymousClass00R.A0N);
        }
        if (this instanceof AnonymousClass8KI) {
            return AnonymousClass000.A1Z(a2t.A0B.A00, AnonymousClass00R.A0Y);
        }
        if (this instanceof AnonymousClass8KG) {
            return AnonymousClass000.A1Z(a2t.A0B.A00, AnonymousClass00R.A01);
        }
        boolean z = this instanceof AnonymousClass8KE;
        C20078A6e a6e = a2t.A0B;
        if (z) {
            return a6e.A01;
        }
        return a6e.A02;
    }

    public boolean A02(Object obj) {
        if (this instanceof AnonymousClass8KF) {
            return !AnonymousClass000.A1Y(obj);
        }
        if (!(this instanceof AnonymousClass8KH)) {
            return !AnonymousClass000.A1Y(obj);
        }
        C194729sC r3 = (C194729sC) obj;
        C18070vi.A0d(r3, 0);
        if (!r3.A00 || r3.A01) {
            return true;
        }
        return false;
    }

    public C192949pI(C196019uK r1) {
        this.A00 = r1;
    }
}
