package X;

/* renamed from: X.9u5  reason: invalid class name and case insensitive filesystem */
public final class C195889u5 {
    public final C193149pc A00;

    public C195889u5(C193149pc r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final C195889u5 A00(C193149pc r4) {
        C18070vi.A0d(r4, 0);
        byte[] A002 = C20058A5h.A00(this.A00.A00, r4.A00, 64);
        C18070vi.A0X(A002);
        return new C195889u5(new C193149pc(A002));
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C195889u5) && C18070vi.A18(this.A00, ((C195889u5) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DerivableSecret@");
        return C17880vN.A0t(A10, System.identityHashCode(this));
    }
}
