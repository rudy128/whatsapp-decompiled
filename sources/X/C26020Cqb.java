package X;

/* renamed from: X.Cqb  reason: case insensitive filesystem */
public final class C26020Cqb {
    public static final AnonymousClass4PR A01 = new Object();
    public final Object A00;

    public static final Object A00(Object obj) {
        if (obj instanceof AnonymousClass4PR) {
            return null;
        }
        return obj;
    }

    public boolean equals(Object obj) {
        Object obj2 = this.A00;
        if (!(obj instanceof C26020Cqb) || !C18070vi.A18(obj2, ((C26020Cqb) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public String toString() {
        Object obj = this.A00;
        if (obj instanceof AnonymousClass5WK) {
            return obj.toString();
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Value(");
        return AnonymousClass001.A1F(obj, A10);
    }

    public /* synthetic */ C26020Cqb(Object obj) {
        this.A00 = obj;
    }
}
