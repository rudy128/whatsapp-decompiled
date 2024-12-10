package X;

/* renamed from: X.0XL  reason: invalid class name */
public final class AnonymousClass0XL implements C17360uX {
    public boolean A00;

    public /* synthetic */ boolean BC2(C22821Di r2) {
        return AnonymousClass0LD.A01(this, r2);
    }

    public /* synthetic */ Object BLT(Object obj, AnonymousClass1OS r3) {
        return AnonymousClass0LD.A00(this, obj, r3);
    }

    public /* synthetic */ C17090tj CP5(C17090tj r2) {
        return AnonymousClass0EW.A00(this, r2);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass0XL) && this.A00 == ((AnonymousClass0XL) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ChildData(isTarget=");
        A10.append(this.A00);
        return AnonymousClass001.A1J(A10);
    }
}
