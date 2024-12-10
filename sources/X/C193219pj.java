package X;

/* renamed from: X.9pj  reason: invalid class name and case insensitive filesystem */
public final class C193219pj {
    public final C194089r9 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C193219pj) && C18070vi.A18(this.A00, ((C193219pj) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C193219pj(C194089r9 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RegistrationRuleConfig(mainTextConfig=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
