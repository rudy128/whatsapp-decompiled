package X;

/* renamed from: X.4hS  reason: invalid class name and case insensitive filesystem */
public final class C92514hS implements C108815cL {
    public final String A00;

    public C92514hS() {
        this((String) null, (AnonymousClass1Y1) null, 1);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C92514hS) && C18070vi.A18(this.A00, ((C92514hS) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public /* bridge */ /* synthetic */ C99804tU CPA() {
        return new C75643ht();
    }

    public /* synthetic */ C92514hS(String str, AnonymousClass1Y1 r4, int i) {
        String A0Q = C17890vO.A0Q();
        C18070vi.A0d(A0Q, 1);
        this.A00 = A0Q;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserRemovedAllEffects(id=");
        return C17900vP.A0B(this.A00, A10);
    }
}
