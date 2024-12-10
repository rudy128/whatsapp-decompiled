package X;

/* renamed from: X.7Cq  reason: invalid class name and case insensitive filesystem */
public final class C143247Cq implements C1594084k {
    public final C143257Cr A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C143247Cq) && C18070vi.A18(this.A00, ((C143247Cq) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C143247Cq(C143257Cr r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Header(section=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
