package X;

/* renamed from: X.6qI  reason: invalid class name and case insensitive filesystem */
public final class C134256qI {
    public final C134476qe A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134256qI) && C18070vi.A18(this.A00, ((C134256qI) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C134256qI(C134476qe r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WaArEffectCategoryModel(arEffects=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
