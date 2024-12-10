package X;

/* renamed from: X.0WB  reason: invalid class name */
public final class AnonymousClass0WB implements C17090tj {
    public final C17090tj A00;
    public final C17090tj A01;

    public /* synthetic */ C17090tj CP5(C17090tj r2) {
        return AnonymousClass0EW.A00(this, r2);
    }

    public boolean BC2(C22821Di r3) {
        if (!this.A01.BC2(r3) || !this.A00.BC2(r3)) {
            return false;
        }
        return true;
    }

    public Object BLT(Object obj, AnonymousClass1OS r4) {
        return this.A00.BLT(this.A01.BLT(obj, r4), r4);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass0WB) {
            AnonymousClass0WB r3 = (AnonymousClass0WB) obj;
            if (!C18070vi.A18(this.A01, r3.A01) || !C18070vi.A18(this.A00, r3.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.A01.hashCode() + AnonymousClass000.A0L(this.A00);
    }

    public AnonymousClass0WB(C17090tj r1, C17090tj r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append('[');
        A10.append((String) BLT("", C14310oo.A00));
        A10.append(']');
        return A10.toString();
    }
}
