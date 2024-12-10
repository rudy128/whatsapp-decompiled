package X;

/* renamed from: X.3Dt  reason: invalid class name and case insensitive filesystem */
public final class C71093Dt implements AnonymousClass20D {
    public final Class A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof C71093Dt) || !C18070vi.A18(this.A00, ((C71093Dt) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C71093Dt(Class cls) {
        this.A00 = cls;
    }

    public Class BTa() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A00.toString());
        return AnonymousClass000.A0y(" (Kotlin reflection is not available)", A10);
    }
}
